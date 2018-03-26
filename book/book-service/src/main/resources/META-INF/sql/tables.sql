create table BOOK_PORTLET (
	bookId LONG not null primary key,
	bookName VARCHAR(75) null,
	description VARCHAR(75) null,
	authorName VARCHAR(75) null,
	isbn INTEGER,
	price INTEGER
);