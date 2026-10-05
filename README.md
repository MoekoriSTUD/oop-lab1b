Record what you observed
   1. Seven-day call reaches Book.borrowBook(), but the fifteen-day call does not because the seven-day one is not wrapped by try-catch and
      is in range of 1 to 14. The fifteen-day one, on the other hand, is wrapped in try-catch and therefore out of range, it throws an error.
   2. First book is AVAILABLE before the fifteen-day call because it gets returned right before this line of code.

The JDK version and Java package.
   Open the project in IntelliJ with JDK 24 and run Main.java.

Why the constructor checks for null before calling isBlank().
   Invoking any method on a null reference results in a NullPointerException, so we need to check null before everything else.

Why title, author and pageCount are final while status is not.
   Because we want to prevent accidental changes of book's title, author and page count as that data is static, while status is dynamic and can be changed.

Why Book uses borrowBook and returnBook rather than a status setter.
   1. Its the only way to make the program user friendly without using GUI.
   2. There are validations in these methods, so, for instance, already borrowed book can't be borrowed again.

Which checks belong in Book and which belong in LibraryService.
   Book:
      author, title are not empty and page count is >= 1\
      book is available or book is on loan

   LibraryService:
      if book is not null when returning
      if book is not null when loaning and loan duration is in range of 1 to 14 days

The results of a successful loan, a rejected loan, a rejected return and the Maven build.
   Successful loan
      status = BookStatus.ON_LOAN
   
   Rejected loan
      Book must not be null
      Loan days must be from 1 to 14
      Book is already on loan
   
   Rejected return
      Book must not be null
      Book is already available
   
   Maven Build
      BUILD SUCCESS

Your debugger observations and any material AI assistance.
   Everything runs as it is supposed to without any material AI assistance.


LAB 4 ===============================================================================
Lab 4 changes LibraryService from working with a single supplied Book to owning a
List<Book>.

• Explain what List<Book> tells the compiler.


• Explain why final does not prevent books.add(...).

• Explain what the enhanced for loop variable represents.

• Describe what findBookByTitle returns for a known and an unknown title.


• Explain why removeBook reuses findBookByTitle instead of writing another search loop.
    There's no point in writing another search loop if we can just use method.
    It simply saves time and is more efficient.

• Explain which responsibilities belong to Main, LibraryService and Book.
    - Main
        is used for creating objects, calling LibraryService and printing results.
    - LibraryService
        used to hold the List, find Books and check loan rules.
    - Book
        protects variables with 'final', validates borrowing and returning.

• Record BUILD SUCCESS, the final count and any material AI assistance used.
    [INFO] Building jar: C:\Users\VladyslavSkubak-STUD\IdeaProjects\oop-lab1b\target\book-tracker-1.0-SNAPSHOT.jar
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  2.431 s
    [INFO] Finished at: 2026-10-05T13:34:34+01:00
    [INFO] ------------------------------------------------------------------------