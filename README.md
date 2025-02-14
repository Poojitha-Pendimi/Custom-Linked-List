Custom Doubly Linked List in Java

Introduction
This repository contains a custom implementation of a **Doubly Linked List (DLL) in Java**.  
A Doubly Linked List is a data structure where each node contains references to both its **previous** and **next** nodes, allowing bidirectional traversal.

 Features
- Insert elements **at the beginning, end, or a specific position**.
- Delete elements from **any position**.
- Search for an element in the list.
- Display the list in **forward and reverse order**.
- Supports **dynamic memory allocation** (nodes grow as needed).

 Implementation Details
The **DoublyLinkedList** class consists of:
- **Node Class**: Defines a node with `data`, `next`, and `prev` pointers.
- **insertAtBeginning()**: Adds a node at the start.
- **insertAtEnd()**: Adds a node at the end.
- **insertAtPosition()**: Inserts a node at a given index.
- **deleteNode()**: Removes a node from any position.
- **displayForward()**: Prints the list from head to tail.
- **displayBackward()**: Prints the list from tail to head.
