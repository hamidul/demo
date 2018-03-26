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

package com.proliferay.book.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the Book service. Represents a row in the &quot;BOOK_PORTLET&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.proliferay.book.model.impl.BookModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.proliferay.book.model.impl.BookImpl}.
 * </p>
 *
 * @author Hamidul Islam
 * @see Book
 * @see com.proliferay.book.model.impl.BookImpl
 * @see com.proliferay.book.model.impl.BookModelImpl
 * @generated
 */
@ProviderType
public interface BookModel extends BaseModel<Book> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a book model instance should use the {@link Book} interface instead.
	 */

	/**
	 * Returns the primary key of this book.
	 *
	 * @return the primary key of this book
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this book.
	 *
	 * @param primaryKey the primary key of this book
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the book ID of this book.
	 *
	 * @return the book ID of this book
	 */
	public long getBookId();

	/**
	 * Sets the book ID of this book.
	 *
	 * @param bookId the book ID of this book
	 */
	public void setBookId(long bookId);

	/**
	 * Returns the book name of this book.
	 *
	 * @return the book name of this book
	 */
	@AutoEscape
	public String getBookName();

	/**
	 * Sets the book name of this book.
	 *
	 * @param bookName the book name of this book
	 */
	public void setBookName(String bookName);

	/**
	 * Returns the description of this book.
	 *
	 * @return the description of this book
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this book.
	 *
	 * @param description the description of this book
	 */
	public void setDescription(String description);

	/**
	 * Returns the author name of this book.
	 *
	 * @return the author name of this book
	 */
	@AutoEscape
	public String getAuthorName();

	/**
	 * Sets the author name of this book.
	 *
	 * @param authorName the author name of this book
	 */
	public void setAuthorName(String authorName);

	/**
	 * Returns the isbn of this book.
	 *
	 * @return the isbn of this book
	 */
	public int getIsbn();

	/**
	 * Sets the isbn of this book.
	 *
	 * @param isbn the isbn of this book
	 */
	public void setIsbn(int isbn);

	/**
	 * Returns the price of this book.
	 *
	 * @return the price of this book
	 */
	public int getPrice();

	/**
	 * Sets the price of this book.
	 *
	 * @param price the price of this book
	 */
	public void setPrice(int price);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Book book);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Book> toCacheModel();

	@Override
	public Book toEscapedModel();

	@Override
	public Book toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}