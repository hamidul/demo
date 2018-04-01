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
import com.proliferay.book.service.base.BookLocalServiceBaseImpl;

/**
 * The implementation of the book local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.proliferay.book.service.BookLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Hamidul Islam
 * @see BookLocalServiceBaseImpl
 * @see com.proliferay.book.service.BookLocalServiceUtil
 */
public class BookLocalServiceImpl extends BookLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.proliferay.book.service.BookLocalServiceUtil} to access the book local service.
	 */
	
	public Book addBook(String bookName, String description, String authorName,int isbn, int price) throws PortalException,SystemException{
		checkDuplicateIsbn(isbn);
		long bookId = counterLocalService.increment();
		Book book = bookPersistence.create(bookId);
		book.setBookName(bookName);
		book.setDescription(description);
		book.setAuthorName(authorName);
		book.setIsbn(isbn);
		book.setPrice(price);
		
	
		bookPersistence.updateImpl(book);
		return book;
	}
	
	public Book updateBook(long bookId,String bookName, String description, String authorName,int isbn, int price) throws PortalException,SystemException{
		checkDuplicateIsbn(isbn);
		Book book = getBook(bookId);
		book.setBookId(bookId);
		book.setBookName(bookName);
		book.setDescription(description);
		book.setAuthorName(authorName);
		book.setIsbn(isbn);
		book.setPrice(price);
		bookPersistence.updateImpl(book); 
		return book;
	}
	
	protected void checkDuplicateIsbn(int isbn) throws DuplicateIsbnException{
		 try {
			Book book = bookPersistence.findByIsbn(isbn);
			if(book != null){
				throw new DuplicateIsbnException("Duplicate ISBN Exception"); 
			}
		} catch (NoSuchBookException e) {

		}
	}
}