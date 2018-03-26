<%@ include file="../init.jsp" %>

<%
	Book book = (Book) request.getAttribute("book");
%>


<portlet:renderURL windowState="normal" var="backURL">
  <portlet:param name="jspPage" value="/book-portlet/view.jsp"></portlet:param>
</portlet:renderURL>


<portlet:actionURL name="updateBook" var="updateBookURL" />


<liferay-ui:header
    backURL="<%= backURL %>"
    title="Back"
/>



<aui:form name="fm" method="post" action="<%= updateBookURL.toString()%>">
	<aui:model-context bean="<%=book%>" model="<%=Book.class%>" />
	<aui:input name="bookName" label="Book Name"/>
	<aui:input type="textarea" name="description" label="Description"/>
	<aui:input name="authorName" label="Author Name"/>
	<aui:input name="isbn" label="ISBN">
		 <aui:validator name="digits"/>
	</aui:input>
	<aui:input name="price" label="Price">
		 <aui:validator name="digits"/>
	</aui:input>
	<aui:button-row>
        <aui:button name="updateBook" type="submit" value="Update Book"  />
    </aui:button-row>
		
</aui:form>