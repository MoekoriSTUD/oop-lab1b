1. Seven-day call reaches Book.borrowBook(), but the fifteen-day call does not because the seven-day one is not wrapped by try-catch and
   is in range of 1 to 14. The fifteen-day one, on the other hand, is wrapped in try-catch and therefore out of range, it throws an error.
2. First book is AVAILABLE before the fifteen-day call because it gets returned right before this line of code.
