package org.example.qa_notes.Collections;

import java.util.*;
import java.util.List;
import java.util.Collection;



public class Collections {

    public static void main(String[] args) {
        // 4 types of collections: set, list, map, and queue


        // ========== Java Collections Framework ==========

        // main interface for collections --> java.util.Collection --> at top of Collections framework hierarchy
        // it contains important methods that every Collection class must implement such as:
        // - size()
        // - iterator()
        // - add()
        // - remove()
        // - clear()

        // There are 4 main (other) types of interfaces in Java, all of which inherit from Collection interface (but its part of Collections framework):
        // List, Set, Map, and Queue
        // They are part of the java.util package (e.g. java.util.List)
        // The Map is the only interface that doesn’t inherit from the Collection interface but it’s part of the Collections framework. All the collections framework interfaces are present in java.util package.

        // ========== 1. LIST ==========
        // - Ordered collection (elements are stored in order)
        // - Allows duplicate elements
        // - You can access elements by their index (e.g., list.get(0))
        //
        // Common implementations of List Interface:
        // - ArrayList: resizable array, fast access by index
        // - LinkedList: doubly linked list, fast insert/remove at ends
        //
        // Useful methods:
        // - add(element)
        // - get(index)
        // - set(index, element)
        // - remove(index or element)
        // - contains(element)
        //
        // Example:
        List names = new ArrayList<>();
        //add at last
        names.add(0, "0");

        //add at specified index
        names.add(1, "1");

        //replace
        names.set(1, "2");

        //remove
        names.remove("1");

        // ========== 2. SET ==========
        // - Unordered collection (no guarantees about order)
        // - Does NOT allow duplicates
        // - Used when uniqueness is important
        //
        // Common implementations of Set Interface:
        // - HashSet: fast lookup, no order
        // - LinkedHashSet: maintains insertion order
        // - TreeSet: sorted set (natural order or comparator)
        //
        // Useful methods:
        // - add(element)
        // - remove(element)
        // - contains(element)
        // - size()

        // NB --> Set interface doesn’t allow random-access to an element in the Collection.
        // You can use iterator or foreach loop to traverse the elements of a Set.
        //
        // Example:
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // will not be added again
        System.out.println(fruits.contains("Apple")); // true

        // ========== 3. MAP ==========
        // - Stores key-value pairs
        // - Keys must be unique, but values can duplicate
        // - Not a subtype of Collection interface
        //
        // Common implementations:
        // - HashMap: fast lookup, no order
        // - LinkedHashMap: maintains insertion order
        // - TreeMap: sorted by key
        //
        // Useful methods:
        // - put(key, value)
        // - get(key)
        // - containsKey(key)
        // - remove(key)
        // - keySet(), values(), entrySet()
        //
        // Example:
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        System.out.println(ages.get("Alice")); // 30

        // ========== 4. QUEUE ==========
        // - Designed for holding elements before processing
        // - Typically FIFO (first-in, first-out) --> Whatever the ordering used, the head of the queue is the element that would be removed by a call to remove or poll. In a FIFO queue, all new elements are inserted at the tail of the queue
        // - Some implementations support LIFO (e.g., Stack/Deque)
        //
        // Common implementations:
        // - LinkedList: can be used as Queue
        // - PriorityQueue: elements ordered by priority
        // - ArrayDeque: efficient double-ended queue
        //
        // Useful methods:
        // - offer(element) → add to the queue
        // - poll() → remove and return head of the queue
        // - peek() → view head without removing
        // - remove(), element() → throw exceptions if empty
        //
        // Example:
        Queue<String> tasks = new LinkedList<>();
        tasks.offer("Task 1");
        tasks.offer("Task 2");
        System.out.println(tasks.poll()); // Task 1

        // =============================
        // All collection types support:
        // - Iteration with for-each loops or iterators
        // - Use of generics (e.g., List<String>, Set<Integer>)

        // Bonus:
        // - Collections class has utility methods like sort(), reverse(), shuffle()
        //   Example: Collections.sort(myList);

        //// Implementation Classes
        // Java Collections framework provides implementation classes for core collection interfaces
        // Some important collection classes are:
        // - ArrayList
        // - LinkedList
        // - HashMap
        // - TreeMap
        // - HashSet
        // - TreeSet
        // All the collection classes are present in java.util and java.util.concurrent package.

        /// Checkout Diagram in folder for more thorough diagram of hierarchy

//        8. ListIterator Interface
//        An iterator for lists that allows the programmer to traverse the list in either direction,
//        modify the list during iteration, and obtain the iterator’s current position in the list.
//
//        Java ListIterator has no current element; its cursor position always lies between the element
//        that would be returned by a call to previous() and the element that would be returned by a call to next().
//
//        9. SortedSet Interface
//        SortedSet is a Set that maintains its elements in ascending order. Several additional operations are
//        provided to take advantage of the ordering. Sorted sets are used for naturally ordered sets, such as
//        word lists and membership rolls.
//
//        10. SortedMap Interface
//        A map that maintains its mappings in ascending key order. This is the Map analog of SortedSet.
//        Sorted maps are used for naturally ordered collections of key/value pairs, such as dictionaries and telephone directories.


        //


        // we can use arrays
        // but they have limitations
        // fixed length -->does not grow when more references need to be stored.
        // often allocate too much memory
        // clunky to update

        // a collection represents a group of objects
        // does NOT have a fixed size
        // defines API for manipulating collection content
        // - adding, removing and updating entries

        // Collection<E> interface
        // collection interface provides element handling (in methods)

        // when creating an instance of List any object type can be added to the list

        // generics --> provided compile-time checking
        // heavily used in collections
        // generic type is specified when instance is created
//        List<Book> dept = new List<Book>();
//        // ... or
//        List<Book> dept2 = new List<>();

        // generic type defines method parameter and return types
        // the get method now returns an instance of Book

        // can for loop over elements

        // collection interface provides the iterator method
        // the Iterator<E> interface
        // can remove elements while within iteration

        // List interface adds listIterator method
        // extends Iterator

//        ListIterator<Book> iterator = dept.listIterator();

        // there is also a class called Collection (Collections Class)
        // contains static utility methods that work on collections


        // the Set<E> Interface is a direct extension of Collection
        // does not add any methods

        // SortedSet<E> Interface --> extends Set interface
        // elements are sorted in order
        // must be a type of comparison mechanism for sorting

        // Comparable<T> Interface
        // Primitive wrappers and String implement java.lang.Comparable interface

        // Comparator<T> Interface
        //







    }


}
