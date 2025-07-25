

## Challenge 1: Find the Longest Word

**Description**:  
We want a function that takes an `ArrayList` of words and returns the longest word. If multiple words have the same maximum length, return the first one.

**Function Signature**:
```java
public static String findLongestWord(ArrayList<String> words)
```

**Example Input**:
```java
["apple", "banana", "strawberry", "pear"]
```

**Example Output**:
```
"strawberry"
```

---

## Challenge 2: Remove Even Numbers

**Description**:  
We want a function that takes an `ArrayList` of integers and removes all even numbers from the list. The function should modify the original list.

**Function Signature**:
```java
public static void removeEvenNumbers(ArrayList<Integer> numbers)
```

**Example Input**:
```java
[1, 2, 3, 4, 5, 6]
```

**Modified List After Function Call**:
```java
[1, 3, 5]
```

---


## Challenge 3: Greet and Sort Unique Long Names

**Description**:  
We want a function that takes an `ArrayList` of names and returns a **new** `ArrayList` of personalized greetings.

The function should:
1. **Remove duplicates** from the list.
2. **Ignore names with 4 or fewer characters**.
3. **Sort** the remaining names alphabetically.
4. Return a list of greetings in the format:  
   `"Hello, <Name>!"` (preserve name casing as in input).

**Function Signature**:
```java
public static ArrayList<String> generateGreetings(ArrayList<String> names)
```

**Example Input**:
```java
["Amy", "Jonathan", "Amy", "Joe", "Samantha", "Charlie", "Eli", "Jonathan"]
```

**Example Output**:
```java
["Hello, Charlie!", "Hello, Jonathan!", "Hello, Samantha!"]
```

---
