# Java Design Patterns

## Overview
This repository serves as a comprehensive guide to understanding Design Patterns in Java. Design patterns are proven solutions to specific, recurring problems in software design. They represent best practices evolved over a long period by experienced object-oriented software developers.

These patterns are not specific algorithms or libraries; rather, they are concepts or blueprints that can be applied to solve design problems in a flexible and reusable way.

## Why Learn Design Patterns?
* **Standardized Vocabulary:** They provide a shared language for developers (e.g., saying "we should use a Singleton here" communicates a complex idea instantly).
* **Best Practices:** They promote cleaner code, better architecture, and easier maintenance.
* **Scalability:** They help build systems that are easier to extend and modify without breaking existing functionality.

---

## 1. Creational Patterns
**Focus:** Object creation mechanisms.
These patterns abstraction the instantiation process. They help make a system independent of how its objects are created, composed, and represented.



* **Singleton:** Ensures that a class has only one unique instance and provides a global point of access to it. This is often used for logging, driver objects, caching, and thread pool services.
* **Factory Method:** Defines an interface for creating an object but allows subclasses to alter the type of objects that will be created. It promotes loose coupling by eliminating the need to bind application-specific classes into the code.
* **Abstract Factory:** Provides an interface for creating families of related or dependent objects without specifying their concrete classes. It is essentially a factory of factories.
* **Builder:** Separates the construction of a complex object from its representation. This allows the same construction process to create different representations, which is particularly useful when an object has many optional parameters.
* **Prototype:** Used when creating a new instance is costly. It creates new objects by copying (cloning) an existing instance rather than creating a new one from scratch.

---

## 2. Structural Patterns
**Focus:** Class and Object composition.
These patterns explain how to assemble objects and classes into larger structures while keeping these structures flexible and efficient.



* **Adapter:** Allows objects with incompatible interfaces to work together. It acts as a bridge between two unrelated interfaces (like a card reader acts as an adapter between a memory card and a laptop).
* **Decorator:** Allows behavior to be added to an individual object, dynamically, without affecting the behavior of other objects from the same class. This is a flexible alternative to subclassing for extending functionality.
* **Facade:** Provides a simplified interface to a library, a framework, or any other complex set of classes. It hides the complexity of the subsystem and provides a clean entry point.
* **Proxy:** Provides a placeholder or surrogate for another object to control access to it. This is often used for lazy loading, access control, logging, or remote object interaction.
* **Composite:** Composes objects into tree structures to represent part-whole hierarchies. It allows clients to treat individual objects and compositions of objects uniformly.

---

## 3. Behavioral Patterns
**Focus:** Communication between Objects.
These patterns differ from structural patterns because they emphasize the flow of control and the specific algorithms used for communication between objects.



* **Observer:** Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. This is the core of event-driven programming.
* **Strategy:** Defines a family of algorithms, encapsulates each one, and makes them interchangeable. It allows the algorithm to vary independently from the clients that use it.
* **Template Method:** Defines the skeleton of an algorithm in a method, deferring some steps to subclasses. It lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
* **Command:** Encapsulates a request as an object, thereby allowing for parameterization of clients with different requests, queueing, and logging of requests.
* **Iterator:** Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
* **State:** Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

---

## Key Principles of Design
While implementing these patterns, this project adheres to the foundational Object-Oriented Design principles (SOLID):
1.  **Single Responsibility Principle:** A class should have one, and only one, reason to change.
2.  **Open/Closed Principle:** Entities should be open for extension but closed for modification.
3.  **Liskov Substitution Principle:** Derived classes must be substitutable for their base classes.
4.  **Interface Segregation Principle:** Many client-specific interfaces are better than one general-purpose interface.
5.  **Dependency Inversion Principle:** Depend upon abstractions, not concretions.
