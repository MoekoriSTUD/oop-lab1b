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
   It tells the compiler that the list can only contain elements of type Book or its subclasses.

• Explain why final does not prevent books.add(...).
   When final applied to an object reference, it means that the reference variable cannot be reassigned to point to a different ArrayList object. But as long as variable books    continues to reference the same list, the contents of the ArrayList can be added, removed or modified.

• Explain what the enhanced for loop variable represents.
   As in the code:
      for (Book book : books) {
       // ...
      }
   The loop variable book represents a reference to the current element being iterated over in the books list during each iteration.

• Describe what findBookByTitle returns for a known and an unknown title.
   For a known title it returns a direct reference to the matching Book object whose title matches the search. For an unknown it returns null.

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


Lab 5 ===========================================================================================================

• Briefly explain the difference between the throw statement inside Book and the catch block used by the caller.
    If I understood correctly, the throw statement changes a message of an error and catch, on the other hand, catches 
    any errors and does whatever is placed inside curly brackets.

• Record what Path.of(...) does and name one Path method and one Files method used in the lab.
    Path.of(...) essentially creates a path to a file specified in arguments.
    Files.createDirectories(file.getParent()); -- both Path method and Files method that were used in the lab.

• State that Lab 5 adds exception handling and CSV persistence to the Library application.
    Lab 5 add exception handling and CSV persistence to the Library application. It was done using try-catch construct
    and 2 newly discovered libraries: Path and Files (Path is used to create and use paths to a file, and Files is used
    to actually create and manipulate a file that was pointed at by Path).

• Explain the difference between unchecked NumberFormatException and checked IOException.
    Unchecked NumberFormatException does not require a try-catch construct to run, checked IOException requires
    try-catch construct in order to even be compiled.

• Explain the difference between Path and Files.
    Path is used to create and use paths to a file, and Files is used
    to actually create and manipulate a file that was pointed at by Path

• Explain how ON_LOAN is restored without adding setStatus().
    It is restored basically by re-borrowing a book if its availability is confirmed by .csv file. And if it is ON_LOAN
    it just uses borrowBook() method to restore a status. If it is available, it does nothing because book status is
    AVAILABLE by default.

• Record any material AI assistance used.
    None
