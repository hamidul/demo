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

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.proliferay.book.model.Book;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the book service. This utility wraps {@link com.proliferay.book.service.persistence.impl.BookPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Hamidul Islam
 * @see BookPersistence
 * @see com.proliferay.book.service.persistence.impl.BookPersistenceImpl
 * @generated
 */
@ProviderType
public class BookUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Book book) {
		getPersistence().clearCache(book);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Book> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Book> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Book> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Book> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Book update(Book book) {
		return getPersistence().update(book);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Book update(Book book, ServiceContext serviceContext) {
		return getPersistence().update(book, serviceContext);
	}

	/**
	* Returns the book where isbn = &#63; or throws a {@link NoSuchBookException} if it could not be found.
	*
	* @param isbn the isbn
	* @return the matching book
	* @throws NoSuchBookException if a matching book could not be found
	*/
	public static Book findByIsbn(int isbn)
		throws com.proliferay.book.exception.NoSuchBookException {
		return getPersistence().findByIsbn(isbn);
	}

	/**
	* Returns the book where isbn = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param isbn the isbn
	* @return the matching book, or <code>null</code> if a matching book could not be found
	*/
	public static Book fetchByIsbn(int isbn) {
		return getPersistence().fetchByIsbn(isbn);
	}

	/**
	* Returns the book where isbn = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param isbn the isbn
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching book, or <code>null</code> if a matching book could not be found
	*/
	public static Book fetchByIsbn(int isbn, boolean retrieveFromCache) {
		return getPersistence().fetchByIsbn(isbn, retrieveFromCache);
	}

	/**
	* Removes the book where isbn = &#63; from the database.
	*
	* @param isbn the isbn
	* @return the book that was removed
	*/
	public static Book removeByIsbn(int isbn)
		throws com.proliferay.book.exception.NoSuchBookException {
		return getPersistence().removeByIsbn(isbn);
	}

	/**
	* Returns the number of books where isbn = &#63;.
	*
	* @param isbn the isbn
	* @return the number of matching books
	*/
	public static int countByIsbn(int isbn) {
		return getPersistence().countByIsbn(isbn);
	}

	/**
	* Returns all the books where authorName = &#63;.
	*
	* @param authorName the author name
	* @return the matching books
	*/
	public static List<Book> findByAuthorName(java.lang.String authorName) {
		return getPersistence().findByAuthorName(authorName);
	}

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
	public static List<Book> findByAuthorName(java.lang.String authorName,
		int start, int end) {
		return getPersistence().findByAuthorName(authorName, start, end);
	}

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
	public static List<Book> findByAuthorName(java.lang.String authorName,
		int start, int end, OrderByComparator<Book> orderByComparator) {
		return getPersistence()
				   .findByAuthorName(authorName, start, end, orderByComparator);
	}

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
	public static List<Book> findByAuthorName(java.lang.String authorName,
		int start, int end, OrderByComparator<Book> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByAuthorName(authorName, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first book in the ordered set where authorName = &#63;.
	*
	* @param authorName the author name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book
	* @throws NoSuchBookException if a matching book could not be found
	*/
	public static Book findByAuthorName_First(java.lang.String authorName,
		OrderByComparator<Book> orderByComparator)
		throws com.proliferay.book.exception.NoSuchBookException {
		return getPersistence()
				   .findByAuthorName_First(authorName, orderByComparator);
	}

	/**
	* Returns the first book in the ordered set where authorName = &#63;.
	*
	* @param authorName the author name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book, or <code>null</code> if a matching book could not be found
	*/
	public static Book fetchByAuthorName_First(java.lang.String authorName,
		OrderByComparator<Book> orderByComparator) {
		return getPersistence()
				   .fetchByAuthorName_First(authorName, orderByComparator);
	}

	/**
	* Returns the last book in the ordered set where authorName = &#63;.
	*
	* @param authorName the author name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book
	* @throws NoSuchBookException if a matching book could not be found
	*/
	public static Book findByAuthorName_Last(java.lang.String authorName,
		OrderByComparator<Book> orderByComparator)
		throws com.proliferay.book.exception.NoSuchBookException {
		return getPersistence()
				   .findByAuthorName_Last(authorName, orderByComparator);
	}

	/**
	* Returns the last book in the ordered set where authorName = &#63;.
	*
	* @param authorName the author name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book, or <code>null</code> if a matching book could not be found
	*/
	public static Book fetchByAuthorName_Last(java.lang.String authorName,
		OrderByComparator<Book> orderByComparator) {
		return getPersistence()
				   .fetchByAuthorName_Last(authorName, orderByComparator);
	}

	/**
	* Returns the books before and after the current book in the ordered set where authorName = &#63;.
	*
	* @param bookId the primary key of the current book
	* @param authorName the author name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next book
	* @throws NoSuchBookException if a book with the primary key could not be found
	*/
	public static Book[] findByAuthorName_PrevAndNext(long bookId,
		java.lang.String authorName, OrderByComparator<Book> orderByComparator)
		throws com.proliferay.book.exception.NoSuchBookException {
		return getPersistence()
				   .findByAuthorName_PrevAndNext(bookId, authorName,
			orderByComparator);
	}

	/**
	* Removes all the books where authorName = &#63; from the database.
	*
	* @param authorName the author name
	*/
	public static void removeByAuthorName(java.lang.String authorName) {
		getPersistence().removeByAuthorName(authorName);
	}

	/**
	* Returns the number of books where authorName = &#63;.
	*
	* @param authorName the author name
	* @return the number of matching books
	*/
	public static int countByAuthorName(java.lang.String authorName) {
		return getPersistence().countByAuthorName(authorName);
	}

	/**
	* Caches the book in the entity cache if it is enabled.
	*
	* @param book the book
	*/
	public static void cacheResult(Book book) {
		getPersistence().cacheResult(book);
	}

	/**
	* Caches the books in the entity cache if it is enabled.
	*
	* @param books the books
	*/
	public static void cacheResult(List<Book> books) {
		getPersistence().cacheResult(books);
	}

	/**
	* Creates a new book with the primary key. Does not add the book to the database.
	*
	* @param bookId the primary key for the new book
	* @return the new book
	*/
	public static Book create(long bookId) {
		return getPersistence().create(bookId);
	}

	/**
	* Removes the book with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookId the primary key of the book
	* @return the book that was removed
	* @throws NoSuchBookException if a book with the primary key could not be found
	*/
	public static Book remove(long bookId)
		throws com.proliferay.book.exception.NoSuchBookException {
		return getPersistence().remove(bookId);
	}

	public static Book updateImpl(Book book) {
		return getPersistence().updateImpl(book);
	}

	/**
	* Returns the book with the primary key or throws a {@link NoSuchBookException} if it could not be found.
	*
	* @param bookId the primary key of the book
	* @return the book
	* @throws NoSuchBookException if a book with the primary key could not be found
	*/
	public static Book findByPrimaryKey(long bookId)
		throws com.proliferay.book.exception.NoSuchBookException {
		return getPersistence().findByPrimaryKey(bookId);
	}

	/**
	* Returns the book with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bookId the primary key of the book
	* @return the book, or <code>null</code> if a book with the primary key could not be found
	*/
	public static Book fetchByPrimaryKey(long bookId) {
		return getPersistence().fetchByPrimaryKey(bookId);
	}

	public static java.util.Map<java.io.Serializable, Book> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the books.
	*
	* @return the books
	*/
	public static List<Book> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<Book> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<Book> findAll(int start, int end,
		OrderByComparator<Book> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<Book> findAll(int start, int end,
		OrderByComparator<Book> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the books from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of books.
	*
	* @return the number of books
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static BookPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BookPersistence, BookPersistence> _serviceTracker =
		ServiceTrackerFactory.open(BookPersistence.class);
}