/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.proliferay.book.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.proliferay.book.exception.DuplicateIsbnException;
import com.proliferay.book.exception.NoSuchBookException;
import com.proliferay.book.model.Book;
import com.proliferay.book.service.base.BookServiceBaseImpl;

/**
 * The implementation of the book remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.proliferay.book.service.BookService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Hamidul Islam
 * @see BookServiceBaseImpl
 * @see com.proliferay.book.service.BookServiceUtil
 */
public class BookServiceImpl extends BookServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.proliferay.book.service.BookServiceUtil} to access the book remote service.
	 */
	
	public Book addBook(String bookName, String description, String authorName,int isbn, int price) throws PortalException,SystemException{
	
	
		return bookLocalService.addBook(bookName, description, authorName, isbn, price);
		
	}
	
	
}