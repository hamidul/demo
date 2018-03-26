<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@page import="com.proliferay.book.model.Book"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="com.proliferay.book.service.BookLocalServiceUtil"%>

<liferay-theme:defineObjects />

<portlet:defineObjects />