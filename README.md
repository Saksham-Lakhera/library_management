# library_management
This system is build for maintaining books in library,anyone can easily deploy it,
where only members are allowed to issue books and all the members details are stored.
Bools details are also stored, and if anyone have issued the book they can be easily viewed.

This project is also based on utilizing concepts of java such as

#### list,
#### hash set,
#### array list,
#### reader,
#### iterator etc.
This project is even useful at school or college level as it give insight of basic 
#### java and javafx.

## Modules
Project consist of 8 screens
##### 1.LOGIN
##### 2.HOME
##### 3.ADD BOOK
##### 4.ISSUE BOOK
##### 5.ADD MEMBER
##### 6.BOOK LIST
##### 7.RETURN BOOK
##### 8.SEARCH MEMBER

## LOGIN
LOGIN page is for the administrator only, no one else can login,this project have 3 login admin one with 
username="saksham" and password="sl".
The login user name and password are hardcoded and can be changed by changing values in maincontroller.java
![LOGIN](https://github.com/Saksham-Lakhera/library_management/blob/master/images/login.JPG)

## HOME
HOME contains 6 buttons each of them refering or linking to another page.
![HOME](https://github.com/Saksham-Lakhera/library_management/blob/master/images/main.JPG)

## ADD BOOK
It contains 4 text block which are ID,NAME,AUTHOR,PUBLICATION these fields must be entered,
after clicking on ADD BOOKS button book is added to the database.

![LOGIN](https://github.com/Saksham-Lakhera/library_management/blob/master/images/add.JPG)

## ISSUE BOOK
It contains two text block MEMBER ID,BOOK ID these two must be filled,
if any of the two values are wrong books is not issued,
and if book is already issued to someone it is not issued as it's not available.
![ISSUE BOOK](https://github.com/Saksham-Lakhera/library_management/blob/master/images/book_issue.JPG)

## ADD MEMBER
It contains 4 text block which are ID,NAME,PHONE,EMAIL these fields must be entered,
no two member can have same member id,
after clicking on ADD MEMBER button member is added to the database.

![ADD MEMBER](https://github.com/Saksham-Lakhera/library_management/blob/master/images/new_member.JPG)

## BOOK LIST
It shows all the books available in library with details

![BOOK LIST](https://github.com/Saksham-Lakhera/library_management/blob/master/images/book_list.JPG)

## RETURN BOOK
It contains two text block MEMBER ID,BOOK ID these two must be filled,
if any of the two values are wrong there is an error.
if no book is issued or some other book is issued to member,then error is displyed.
![BOOK LIST](https://github.com/Saksham-Lakhera/library_management/blob/master/images/return.JPG)

## SEARCH MEMBERS
It contains 2 text box any of the text box can be used for searching,they can be searched either by their id's or by their name,
all the books details issued to the member is also displayed.

![SEARCH MEMBERS](https://github.com/Saksham-Lakhera/library_management/blob/master/images/search_member.JPG)


## TO DO

as this project is build by using basic java, the database is a text file,so in all the controllers java files path must be changed.


