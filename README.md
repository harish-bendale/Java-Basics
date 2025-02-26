# Java
1) <h3>Abstraction</h3> <p>simplifies complexity by hiding unnecessary implementation details and exposing only essential features or behaviors through a well-defined interface. It allows users to interact with a system at a higher level of logic without needing to understand its internal workings.</p>


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