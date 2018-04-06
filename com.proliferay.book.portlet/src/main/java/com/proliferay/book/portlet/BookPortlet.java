package com.proliferay.book.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletSession;
import javax.portlet.ProcessAction;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.proliferay.book.model.Book;
import com.proliferay.book.portlet.constants.BookPortletKeys;
import com.proliferay.book.service.BookLocalService;

/**
 * @author Hamidul Islam
 */
@Component(
		 immediate = true, 
		 property = { 
			"com.liferay.portlet.display-category=Pro Liferay",
			"com.liferay.portlet.instanceable=true",
			"javax.portlet.display-name=Book Portlet",
			"javax.portlet.init-param.template-path=/",
			"javax.portlet.init-param.view-template=/book-portlet/view.jsp",
			"javax.portlet.name=" + BookPortletKeys.Book,
			"javax.portlet.resource-bundle=content.Language",
			"javax.portlet.security-role-ref=power-user,user",
			"javax.portlet.init-param.add-process-action-success-action=false"
		}, 
		service = Portlet.class
)
public class BookPortlet extends MVCPortlet {

	@ProcessAction(name = "addBook")
	public void addBook(ActionRequest actionRequest, ActionResponse actionResponse) {

		String authorName = ParamUtil.getString(actionRequest, "authorName", "");
		String bookName = ParamUtil.getString(actionRequest, "bookName", "");
		int isbn = ParamUtil.getInteger(actionRequest, "isbn", 0);
		int price = ParamUtil.getInteger(actionRequest, "price", 0);
		String description = ParamUtil.getString(actionRequest, "description", "");

		_log.info("authorName :" + authorName);
		_log.info("bookName :" + bookName);
		_log.info("isbn :" + isbn);
		_log.info("price :" + price);
		_log.info("description :" + description);

		try {
			_bookLocalService.addBook(bookName, description, authorName, isbn, price);
			SessionMessages.add(actionRequest,"add-book");
			_log.info("#################Added Book Successfully#########################");
		} catch (Exception e) {
			SessionErrors.add(actionRequest, e.getClass());
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			_log.error("Exceptions while adding book : ", e);
		}

	}

	@ProcessAction(name = "viewBook")
	public void viewBook(ActionRequest actionRequest, ActionResponse actionResponse) {

		long bookId = ParamUtil.getLong(actionRequest, "bookId");
		try {
			Book book = _bookLocalService.getBook(bookId);
			actionRequest.setAttribute("bookEntry", book);
		} catch (Exception e) {
			_log.error("Exceptions while retrieving book : ", e);
		}

		actionResponse.setRenderParameter("jspPage", "/book-portlet/view_book.jsp");
	}

	@ProcessAction(name = "viewEdit")
	public void viewEdit(ActionRequest actionRequest, ActionResponse actionResponse) {

		long bookId = ParamUtil.getLong(actionRequest, "bookId", 0);
		try {
			Book book = _bookLocalService.getBook(bookId);
			actionRequest.setAttribute("book", book);
		} catch (Exception e) {
			_log.error("Exceptions while adding book : ", e);
		}

		actionRequest.getPortletSession().setAttribute("bookId", bookId, PortletSession.PORTLET_SCOPE);

		actionResponse.setRenderParameter("jspPage", "/book-portlet/edit_book.jsp");

	}

	@ProcessAction(name = "updateBook")
	public void updateBook(ActionRequest actionRequest, ActionResponse actionResponse) {
		long bookId = (Long) actionRequest.getPortletSession().getAttribute("bookId", PortletSession.PORTLET_SCOPE);
		String authorName = ParamUtil.getString(actionRequest, "authorName", "");
		String bookName = ParamUtil.getString(actionRequest, "bookName", "");
		int isbn = ParamUtil.getInteger(actionRequest, "isbn", 0);
		int price = ParamUtil.getInteger(actionRequest, "price", 0);
		String description = ParamUtil.getString(actionRequest, "description", "");

		_log.info("bookId :" + bookId);
		_log.info("authorName :" + authorName);
		_log.info("bookName :" + bookName);
		_log.info("isbn :" + isbn);
		_log.info("price :" + price);
		_log.info("description :" + description);

		try {
			_bookLocalService.updateBook(bookId, bookName, description, authorName, isbn, price);
			SessionMessages.add(actionRequest,"update-book");
			_log.info("#################Updated Book Successfully#########################");
		} catch (Exception e) {
			SessionErrors.add(actionRequest, e.getClass());
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			_log.error("Exceptions while updating book : ", e);
		}

	}

	@ProcessAction(name = "deleteBook")
	public void deleteBook(ActionRequest actionRequest, ActionResponse actionResponse) {
		long bookId = ParamUtil.getLong(actionRequest, "bookId");
		try {
			_bookLocalService.deleteBook(bookId);
			SessionMessages.add(actionRequest,"delete-book");
			_log.info("#################Book Deleted Successfully#########################");
		} catch (Exception e) {
			_log.error("Exceptions while deleting book ", e);
		}

	}

	@Reference
	private BookLocalService _bookLocalService;
	private static final Log _log = LogFactoryUtil.getLog(BookPortlet.class);
}