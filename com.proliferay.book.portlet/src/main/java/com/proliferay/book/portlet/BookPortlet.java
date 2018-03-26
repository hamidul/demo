package com.proliferay.book.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletSession;
import javax.portlet.ProcessAction;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.proliferay.book.model.Book;
import com.proliferay.book.portlet.constants.BookPortletKeys;
import com.proliferay.book.service.BookLocalServiceUtil;
import com.proliferay.book.util.ActionUtil;

/**
 * @author Hamidul Islam
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=Pro Liferay",
		"com.liferay.portlet.instanceable=true", "javax.portlet.display-name=Book Portlet",
		"javax.portlet.init-param.template-path=/", "javax.portlet.init-param.view-template=/book-portlet/view.jsp",
		"javax.portlet.name=" + BookPortletKeys.Book, "javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class BookPortlet extends MVCPortlet {

	@ProcessAction(name = "addBook")
	public void addBook(ActionRequest actionRequest, ActionResponse actionResponse) throws SystemException {
		Book book = ActionUtil.bookFromRequest(actionRequest);

		// Calling service method to persist book.
		BookLocalServiceUtil.addBook(book);
		SessionMessages.add(actionRequest, "added-book");
		_log.info("#################Added Book Successfully#########################");
	}
	
	
	@ProcessAction(name = "viewBook")
	public void viewBook(ActionRequest actionRequest,ActionResponse actionResponse) throws SystemException, PortalException {
		
		long bookId = ParamUtil.getLong(actionRequest, "bookId");
		Book book = BookLocalServiceUtil.getBook(bookId);
		actionRequest.setAttribute("bookEntry", book);
		
		actionResponse.setRenderParameter("jspPage", "/book-portlet/view_book.jsp");
	}
	
	@ProcessAction(name = "viewEdit")
	public void viewEdit(ActionRequest actionRequest,ActionResponse actionResponse) throws SystemException, PortalException {
		
		long bookId = ParamUtil.getLong(actionRequest, "bookId",0);
		Book book = BookLocalServiceUtil.getBook(bookId);
		actionRequest.setAttribute("book", book); 
		actionRequest.getPortletSession().setAttribute("bookId",bookId,PortletSession.PORTLET_SCOPE);

		actionResponse.setRenderParameter("jspPage", "/book-portlet/edit_book.jsp");
	
			
	}
	
	@ProcessAction(name = "updateBook")
	public void updateBook(ActionRequest actionRequest,ActionResponse actionResponse) throws SystemException, PortalException {
		Book book = ActionUtil.bookFromRequest(actionRequest);
		long bookId = (Long) actionRequest.getPortletSession().getAttribute("bookId",PortletSession.PORTLET_SCOPE);
		book.setBookId(bookId);

		BookLocalServiceUtil.updateBook(book);
		_log.info("#################Updated Book Successfully#########################");
		
	}
	
	@ProcessAction(name = "deleteBook")
	public void deleteBook(ActionRequest actionRequest,ActionResponse actionResponse) throws SystemException, PortalException {
		long bookId = ParamUtil.getLong(actionRequest, "bookId");
		BookLocalServiceUtil.deleteBook(bookId);
		_log.info("#################Book Deleted Successfully#########################");
	}
	

	private static final Log _log = LogFactoryUtil.getLog(BookPortlet.class);
}