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

package com.proliferay.book.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for Book. This utility wraps
 * {@link com.proliferay.book.service.impl.BookServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Hamidul Islam
 * @see BookService
 * @see com.proliferay.book.service.base.BookServiceBaseImpl
 * @see com.proliferay.book.service.impl.BookServiceImpl
 * @generated
 */
@ProviderType
public class BookServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.proliferay.book.service.impl.BookServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.proliferay.book.model.Book addBook(
		java.lang.String bookName, java.lang.String description,
		java.lang.String authorName, int isbn, int price)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addBook(bookName, description, authorName, isbn, price);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static BookService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BookService, BookService> _serviceTracker = ServiceTrackerFactory.open(BookService.class);
}