# Java
1) <h3>Abstraction</h3> <p>Abstraction simplifies complexity by hiding unnecessary implementation details and exposing only essential features or behaviors through a well-defined interface. It allows users to interact with a system at a higher level of logic without needing to understand its internal workings.</p>

2) <h3>Encapsulation</h3> <p>Encapsulation is an OOP principle that bundles data (attributes) and methods (behaviors) into a single unit (e.g., a class) while restricting direct access to internal data using access modifiers (e.g., private, protected). It enforces controlled interaction with the object’s state, typically through public methods (getters/setters), ensuring data integrity and reducing unintended side effects.</p>

3) <h3>Inheritance</h3> <p>Inheritance is an OOP principle that enables a class (child/subclass) to acquire properties and behaviors (fields/methods) from another class (parent/superclass), promoting code reuse and hierarchical modeling. It establishes an "is-a" relationship (e.g., a Car is a Vehicle), allowing subclasses to extend or override parent functionality while maintaining a logical hierarchy.</p>

4) <h3>Polymorphism</h3> <p>Polymorphism is an OOP principle that allows objects of different classes to be treated as instances of a common superclass or interface, enabling a single interface to represent diverse underlying forms. It simplifies code by letting you write generalized logic that works with multiple types, while still executing type-specific behavior at runtime.</p>

<h3>Acess Modifiers</h3>
<h3>1) Classes</h3>
<p>public , default</p>
<p>

 1. public -> Accessible everywhere.

 2. Default -> The class is accessible only within the same package.
<p>


<h3>2) Constructors, Methods, Variables</h3>
<p>public, default, protected, private</p>

<p>

 1. public -> Accessible everywhere.

 2. protected -> Same package + subclasses (even in other packages).

 3. default -> Only within the same package.

 4. private -> Only within the same class.
<p>

<h3>Non-access Modifiers</h3>
<h3>1) Classes</h3>
<p>final , abstract</p>
<p>

 1. final -> The class cannot be subclassed

 2. abstract -> The class cannot be instantiated and is meant to be subclassed.

final vs. abstract:

A class cannot be both final and abstract (contradictory purposes).

final methods prevent polymorphism; abstract methods enforce it.
<p>


<h3>2) Methods </h3>
<p>final, abstract, static </p>

<p>

 1. final -> Method cannot be overridden in subclasses.

 2. abstract -> Method has no implementation (valid only in abstract classes/interfaces).

 3. static -> Method belongs to the class, not instances.
<p>

<h3> 3) Variables </h3>
<p>final, static </p>

<p>

 1. final -> Variable’s value cannot be changed after initialization (constant).

 2. static -> Variable belongs to the class, not instances.

<p>

</break>
<p>Abstract methods are only permitted in abstract classes</p>
<p>

 1) Use == for primitive types (e.g., int, char, boolean) because they compare values directly.
 2) Use .equals() for objects (e.g., String, Integer) to compare the actual content.
 3) == on objects checks if they point to the same memory location, not the content.

</p>
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

<img src = "Screenshot 2025-03-04 at 5.39.14 PM.png"></img>