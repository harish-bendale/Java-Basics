# Java

1) Use == for primitive types (e.g., int, char, boolean) because they compare values directly.
2) Use .equals() for objects (e.g., String, Integer) to compare the actual content.
3) == on objects checks if they point to the same memory location, not the content.

Exception Hierarchy
Throwable
├── Error
│   ├── OutOfMemoryError
│   ├── StackOverflowError
│   └── LinkageError
└── Exception
    ├── Checked Exceptions
    │   ├── IOException
    │   ├── SQLException
    │   └── ClassNotFoundException
    └── Unchecked Exceptions (RuntimeException)
        ├── NullPointerException
        ├── ArrayIndexOutOfBoundsException
        ├── ArithmeticException
        └── IllegalArgumentException

1) Checked Exceptions: Must be handled explicitly (either caught or declared).

2) Unchecked Exceptions: Do not need to be handled explicitly.

3) Errors: Typically not caught or handled by applications.