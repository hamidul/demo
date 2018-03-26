package com.proliferay.book.util;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.util.ParamUtil;
import com.proliferay.book.model.Book;
import com.proliferay.book.model.impl.BookImpl;

public class ActionUtil {

	  public static Book bookFromRequest(ActionRequest request) {
		  Book book = new BookImpl();
		  book.setAuthorName(ParamUtil.getString(request, "authorName",""));
		  book.setBookName(ParamUtil.getString(request, "bookName",""));
		  book.setIsbn(ParamUtil.getInteger(request, "isbn",0));
		  book.setPrice(ParamUtil.getInteger(request, "price",0));
		  book.setDescription(ParamUtil.getString(request, "description",""));
		
		  return book;
	  }
}
