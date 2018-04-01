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

package com.proliferay.book.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.proliferay.book.exception.NoSuchBookException;
import com.proliferay.book.model.Book;

/**
 * The persistence interface for the book service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Hamidul Islam
 * @see com.proliferay.book.service.persistence.impl.BookPersistenceImpl
 * @see BookUtil
 * @generated
 */
@ProviderType
public interface BookPersistence extends BasePersistence<Book> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BookUtil} to access the book persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the book where isbn = &#63; or throws a {@link NoSuchBookException} if it could not be found.
	*
	* @param isbn the isbn
	* @return the matching book
	* @throws NoSuchBookException if a matching book could not be found
	*/
	public Book findByIsbn(int isbn) throws NoSuchBookException;

	/**
	* Returns the book where isbn = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param isbn the isbn
	* @return the matching book, or <code>null</code> if a matching book could not be found
	*/
	public Book fetchByIsbn(int isbn);

	/**
	* Returns the book where isbn = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param isbn the isbn
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching book, or <code>null</code> if a matching book could not be found
	*/
	public Book fetchByIsbn(int isbn, boolean retrieveFromCache);

	/**
	* Removes the book where isbn = &#63; from the database.
	*
	* @param isbn the isbn
	* @return the book that was removed
	*/
	public Book removeByIsbn(int isbn) throws NoSuchBookException;

	/**
	* Returns the number of books where isbn = &#63;.
	*
	* @param isbn the isbn
	* @return the number of matching books
	*/
	public int countByIsbn(int isbn);

	/**
	* Returns all the books where authorName = &#63;.
	*
	* @param authorName the author name
	* @return the matching books
	*/
	public java.util.List<Book> findByAuthorName(java.lang.String authorName);

	/**
	* Returns a range of all the books where authorName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param authorName the author name
	* @param start the lower bound of the range of books
	* @param end the upper bound of the range of books (not inclusive)
	* @return the range of matching books
	*/
	public java.util.List<Book> findByAuthorName(java.lang.String authorName,
		int start, int end);

	/**
	* Returns an ordered range of all the books where authorName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param authorName the author name
	* @param start the lower bound of the range of books
	* @param end the upper bound of the range of books (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching books
	*/
	public java.util.List<Book> findByAuthorName(java.lang.String authorName,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Book> orderByComparator);

	/**
	* Returns an ordered range of all the books where authorName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param authorName the author name
	* @param start the lower bound of the range of books
	* @param end the upper bound of the range of books (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching books
	*/
	public java.util.List<Book> findByAuthorName(java.lang.String authorName,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Book> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first book in the ordered set where authorName = &#63;.
	*
	* @param authorName the author name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book
	* @throws NoSuchBookException if a matching book could not be found
	*/
	public Book findByAuthorName_First(java.lang.String authorName,
		com.liferay.portal.kernel.util.OrderByComparator<Book> orderByComparator)
		throws NoSuchBookException;

	/**
	* Returns the first book in the ordered set where authorName = &#63;.
	*
	* @param authorName the author name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book, or <code>null</code> if a matching book could not be found
	*/
	public Book fetchByAuthorName_First(java.lang.String authorName,
		com.liferay.portal.kernel.util.OrderByComparator<Book> orderByComparator);

	/**
	* Returns the last book in the ordered set where authorName = &#63;.
	*
	* @param authorName the author name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book
	* @throws NoSuchBookException if a matching book could not be found
	*/
	public Book findByAuthorName_Last(java.lang.String authorName,
		com.liferay.portal.kernel.util.OrderByComparator<Book> orderByComparator)
		throws NoSuchBookException;

	/**
	* Returns the last book in the ordered set where authorName = &#63;.
	*
	* @param authorName the author name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book, or <code>null</code> if a matching book could not be found
	*/
	public Book fetchByAuthorName_Last(java.lang.String authorName,
		com.liferay.portal.kernel.util.OrderByComparator<Book> orderByComparator);

	/**
	* Returns the books before and after the current book in the ordered set where authorName = &#63;.
	*
	* @param bookId the primary key of the current book
	* @param authorName the author name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next book
	* @throws NoSuchBookException if a book with the primary key could not be found
	*/
	public Book[] findByAuthorName_PrevAndNext(long bookId,
		java.lang.String authorName,
		com.liferay.portal.kernel.util.OrderByComparator<Book> orderByComparator)
		throws NoSuchBookException;

	/**
	* Removes all the books where authorName = &#63; from the database.
	*
	* @param authorName the author name
	*/
	public void removeByAuthorName(java.lang.String authorName);

	/**
	* Returns the number of books where authorName = &#63;.
	*
	* @param authorName the author name
	* @return the number of matching books
	*/
	public int countByAuthorName(java.lang.String authorName);

	/**
	* Caches the book in the entity cache if it is enabled.
	*
	* @param book the book
	*/
	public void cacheResult(Book book);

	/**
	* Caches the books in the entity cache if it is enabled.
	*
	* @param books the books
	*/
	public void cacheResult(java.util.List<Book> books);

	/**
	* Creates a new book with the primary key. Does not add the book to the database.
	*
	* @param bookId the primary key for the new book
	* @return the new book
	*/
	public Book create(long bookId);

	/**
	* Removes the book with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookId the primary key of the book
	* @return the book that was removed
	* @throws NoSuchBookException if a book with the primary key could not be found
	*/
	public Book remove(long bookId) throws NoSuchBookException;

	public Book updateImpl(Book book);

	/**
	* Returns the book with the primary key or throws a {@link NoSuchBookException} if it could not be found.
	*
	* @param bookId the primary key of the book
	* @return the book
	* @throws NoSuchBookException if a book with the primary key could not be found
	*/
	public Book findByPrimaryKey(long bookId) throws NoSuchBookException;

	/**
	* Returns the book with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bookId the primary key of the book
	* @return the book, or <code>null</code> if a book with the primary key could not be found
	*/
	public Book fetchByPrimaryKey(long bookId);

	@Override
	public java.util.Map<java.io.Serializable, Book> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the books.
	*
	* @return the books
	*/
	public java.util.List<Book> findAll();

	/**
	* Returns a range of all the books.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of books
	* @param end the upper bound of the range of books (not inclusive)
	* @return the range of books
	*/
	public java.util.List<Book> findAll(int start, int end);

	/**
	* Returns an ordered range of all the books.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of books
	* @param end the upper bound of the range of books (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of books
	*/
	public java.util.List<Book> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Book> orderByComparator);

	/**
	* Returns an ordered range of all the books.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of books
	* @param end the upper bound of the range of books (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of books
	*/
	public java.util.List<Book> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Book> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the books from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of books.
	*
	* @return the number of books
	*/
	public int countAll();
}