<%@ include file="../init.jsp" %>

<portlet:actionURL name="addBook" var="addBookURL" />

<portlet:renderURL windowState="normal" var="backURL">
  <portlet:param name="jspPage" value="/book-portlet/view.jsp"></portlet:param>
</portlet:renderURL>

<liferay-ui:header
    backURL="<%= backURL %>"
    title="Back"
/>


<aui:form name="fm" action="<%=addBookURL.toString()%>" method="post">

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
        <aui:button name="addBook" type="submit" value="Add Book"  />
    </aui:button-row>
		
</aui:form>