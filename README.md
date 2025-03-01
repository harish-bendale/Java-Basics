# Java
1) <h3>Abstraction</h3> <p>Abstraction simplifies complexity by hiding unnecessary implementation details and exposing only essential features or behaviors through a well-defined interface. It allows users to interact with a system at a higher level of logic without needing to understand its internal workings.</p>

2) <h3>Encapsulation</h3> <p>Encapsulation is an OOP principle that bundles data (attributes) and methods (behaviors) into a single unit (e.g., a class) while restricting direct access to internal data using access modifiers (e.g., private, protected). It enforces controlled interaction with the object’s state, typically through public methods (getters/setters), ensuring data integrity and reducing unintended side effects.</p>

3) <h3>Inheritance</h3> <p>Inheritance is an OOP principle that enables a class (child/subclass) to acquire properties and behaviors (fields/methods) from another class (parent/superclass), promoting code reuse and hierarchical modeling. It establishes an "is-a" relationship (e.g., a Car is a Vehicle), allowing subclasses to extend or override parent functionality while maintaining a logical hierarchy.</p>

4) <h3>Polymorphism</h3> <p>Polymorphism is an OOP principle that allows objects of different classes to be treated as instances of a common superclass or interface, enabling a single interface to represent diverse underlying forms. It simplifies code by letting you write generalized logic that works with multiple types, while still executing type-specific behavior at runtime.</p>

<h2>1. Class Access Modifiers</h2>
    <table>
        <tr>
            <th>Modifier</th>
            <th>Accessibility</th>
        </tr>
        <tr>
            <td><code>public</code></td>
            <td>Accessible <strong>everywhere</strong></td>
        </tr>
        <tr>
            <td><code>default</code></td>
            <td>Accessible only within the same package (no explicit keyword)</td>
        </tr>
    </table>

    <h2>2. Constructor/Method/Field Access Modifiers</h2>
    <table>
        <tr>
            <th>Modifier</th>
            <th>Accessibility</th>
        </tr>
        <tr>
            <td><code>public</code></td>
            <td>Accessible everywhere (any class/package)</td>
        </tr>
        <tr>
            <td><code>protected</code></td>
            <td>Same package + subclasses (even in other packages)</td>
        </tr>
        <tr>
            <td><code>default</code></td>
            <td>Same package only (no explicit keyword)</td>
        </tr>
        <tr>
            <td><code>private</code></td>
            <td>Same class only</td>
        </tr>
    </table>

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