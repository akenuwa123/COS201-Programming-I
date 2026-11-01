# COS 201 — Computer Programming I: Comprehensive Assignment Guide
**Course:** COS 201 — Computer Programming I  
**Lecturer:** Dr. Ajilore Opeoluwa  
**Target Programmes:** CSC (Computer Science), CYB (Cybersecurity), INS (Information Systems), SEN (Software Engineering), ICH (Industrial Chemistry)  
**Programming Language:** Java (Standard JDK)  

---

## Table of Contents
1. [Overview and Pedagogical Context](#1-overview-and-pedagogical-context)
2. [Week 1: Introduction to Programming and Problem-Solving](#2-week-1-introduction-to-programming-and-problem-solving)
   - [What is a Computer Program?](#what-is-a-computer-program)
   - [Programming and Problem-Solving](#programming-and-problem-solving)
   - [The Program Development Life Cycle (PDLC)](#the-program-development-life-cycle-pdlc)
   - [The Input-Processing-Output (IPO) Model](#the-input-processing-output-ipo-model)
   - [Representations: Algorithm vs. Pseudocode vs. Flowchart vs. Source Code](#representations-algorithm-vs-pseudocode-vs-flowchart-vs-source-code)
   - [Common Categories of Programming Errors](#common-categories-of-programming-errors)
   - [Compiling and Running FirstProgram.java](#compiling-and-running-firstprogramjava)
   - [Written Activities Designated for Paper Submission](#written-activities-designated-for-paper-submission)
3. [Week 2: Development Environment and First Java Program](#3-week-2-development-environment-and-first-java-program)
   - [Understanding the JDK, JVM, and Java Compiler](#understanding-the-jdk-jvm-and-java-compiler)
   - [Verifying the Environment: java -version and javac -version](#verifying-the-environment-java--version-and-javac--version)
   - [Compiling and Executing from the Terminal](#compiling-and-executing-from-the-terminal)
   - [Why the Class Name and Filename Must Match](#why-the-class-name-and-filename-must-match)
   - [Version Control Fundamentals: Saving vs. Committing vs. Pushing](#version-control-fundamentals-saving-vs-committing-vs-pushing)
   - [Identifying and Fixing Basic Syntax Errors](#identifying-and-fixing-basic-syntax-errors)
4. [Week 3: Variables, Data Types, Expressions, and Input/Output](#4-week-3-variables-data-types-expressions-and-inputoutput)
   - [Variables, Constants, and Memory Storage](#variables-constants-and-memory-storage)
   - [Declaration, Initialization, and Assignment](#declaration-initialization-and-assignment)
   - [Primitive Data Types vs. Reference Types (String)](#primitive-data-types-vs-reference-types-string)
   - [Arithmetic Operators and Precedence Rules](#arithmetic-operators-and-precedence-rules)
   - [Integer Division vs. Floating-Point Division and Explicit Type Casting](#integer-division-vs-floating-point-division-and-explicit-type-casting)
   - [Keyboard Input Handling with Scanner (Buffer Behavior)](#keyboard-input-handling-with-scanner-buffer-behavior)
   - [Console Output Formatting: print(), println(), and printf()](#console-output-formatting-print-println-and-printf)
   - [Why Defensive Input Validation and Testing Matter](#why-defensive-input-validation-and-testing-matter)
5. [Verification of Requirements from Lecture Notes](#5-verification-of-requirements-from-lecture-notes)

---

## 1. Overview and Pedagogical Context
This guide accompanies the practical programming coursework for **COS 201 — Computer Programming I**. It is designed to reinforce fundamental computational thinking, good programming habits, cybersecurity-aware practices (such as input validation and credential hygiene), and version control best practices for university students.

All practical programs are written in standard Java and maintained within a single version-controlled repository: `COS201-Programming-I`.

---

## 2. Week 1: Introduction to Programming and Problem-Solving

### What is a Computer Program?
A **computer program** is a sequence of precise, unambiguous instructions written in a programming language that tells a computer how to perform a specific task or solve a particular computational problem. 

Without instructions, hardware is inert. Programs enable computers to:
- Process student grades and generate transcripts.
- Manage customer accounts and inventory balances.
- Automate log parsing to detect unauthorized access attempts (Cybersecurity).
- Model computational systems and manage databases.

### Programming and Problem-Solving
**Computer programming** is the comprehensive discipline of understanding a problem, designing an algorithmic solution, writing source code, testing it against boundary cases, debugging defects, and maintaining the software over its operational lifetime.

Programming is first and foremost an exercise in **problem-solving**. A programmer does not begin by typing code; they must first analyze the problem, determine the desired output, identify the required input, and determine the exact sequence of logical steps required to transform the input into output.

### The Program Development Life Cycle (PDLC)
Professional software development follows systematic stages:
1. **Problem Analysis:** Understanding what the program must accomplish and specifying clear requirements.
2. **Algorithm Design:** Devising a step-by-step logic plan using algorithms, pseudocode, and flowcharts.
3. **Coding / Implementation:** Translating the algorithm into a formal programming language (e.g., Java).
4. **Compilation:** Converting human-readable source code into machine-executable or virtual machine bytecode.
5. **Testing and Debugging:** Executing the program with diverse test cases (normal, boundary, invalid) and correcting bugs.
6. **Documentation and Maintenance:** Explaining how the code works and updating it as requirements evolve.

### The Input-Processing-Output (IPO) Model
Every software application operates on the **IPO model**:
- **Input:** Data supplied to the program from users, files, sensors, or networks.
- **Processing:** The computational steps, arithmetic calculations, or logical decisions performed on the data.
- **Output:** The resulting information communicated back to the user, saved to storage, or transmitted across a network.

```
+---------------+      +------------------+      +----------------+
|     INPUT     | ---> |    PROCESSING    | ---> |     OUTPUT     |
| (Raw Data /   |      |  (Calculations / |      |  (Results /    |
| User Entries) |      | Logical Decisions|      | Display Info)  |
+---------------+      +------------------+      +----------------+
```

### Representations: Algorithm vs. Pseudocode vs. Flowchart vs. Source Code
Understanding how logic evolves from concept to executable code is foundational:

1. **Algorithm:** A finite, step-by-step sequence of instructions designed to solve a problem. It is independent of any programming language and written in plain, unambiguous human language.
2. **Pseudocode:** A structured, informal representation of an algorithm that resembles code syntax (using constructs like `IF`, `THEN`, `ELSE`, `WHILE`, `OUTPUT`), but omits language-specific syntax rules.
3. **Flowchart:** A visual diagram representing the sequence of operations using standardized graphical symbols:
   - *Oval / Rounded Rectangle (Terminator):* Start and End points.
   - *Parallelogram (Input/Output):* Reading data or displaying results.
   - *Rectangle (Process):* Arithmetic calculations or assignments.
   - *Diamond (Decision):* Conditional branching (`True` / `False`).
   - *Arrows (Flow lines):* Direction of execution.
4. **Source Code:** The final, formal implementation written in a specific language (e.g., Java) adhering strictly to that language's syntax and grammar.

#### Comparison Example: Calculating Average of Three Scores
- **Algorithm:**
  1. Start.
  2. Read score1, score2, score3.
  3. Compute sum = score1 + score2 + score3.
  4. Compute average = sum / 3.
  5. Display average.
  6. Stop.

- **Pseudocode:**
  ```text
  BEGIN
      INPUT score1, score2, score3
      total = score1 + score2 + score3
      average = total / 3.0
      OUTPUT "Average is: ", average
  END
  ```

- **Flowchart Logic:**
  ```text
  [Start] --> [/Input score1, score2, score3/] --> [total = score1 + score2 + score3]
          --> [average = total / 3.0] --> [/Output average/] --> [Stop]
  ```

- **Java Source Code:**
  ```java
  double total = score1 + score2 + score3;
  double average = total / 3.0;
  System.out.println("Average: " + average);
  ```

### Common Categories of Programming Errors
1. **Syntax Errors:** Violations of Java's grammatical rules (e.g., missing semicolons, unmatched curly braces, misspelled keywords). Detected by the compiler (`javac`) before the program can run.
2. **Runtime Errors (Exceptions):** Errors that occur while the program is executing (e.g., division by zero, reading unexpected text when a number was expected `InputMismatchException`).
3. **Logical Errors:** Bugs where the program compiles and executes without crashing, but produces incorrect results due to flawed logic (e.g., using integer division `210 / 4` resulting in truncation, or calculating `total / 2` instead of `total / 3`).

### Compiling and Running FirstProgram.java
From the root repository directory:
```bash
cd week01
javac FirstProgram.java
java FirstProgram
```

---

### Written Activities Designated for Paper Submission
> [!IMPORTANT]
> The COS 201 lecture note explicitly states that the following activities are **to be written on paper for submission to the lecturer**. They are reproduced here verbatim from Section 15 of the Week 1 lecture note so that students have the exact prompt text readily accessible.

#### Activity A — Identify the IPO Components
*For each problem, write the input, process, and output:*
1. Calculate the area of a rectangle with length 12 and width 5.
2. Calculate the average of four examination scores.
3. Determine whether a number is positive, negative, or zero.
4. Calculate the total price of six items costing ₦250 each.
5. Calculate the number of failed login attempts recorded in a sample security log.

#### Activity B — Write Algorithms
*Write an algorithm for each task. For each algorithm, identify its input, processing steps, and output:*
1. Write an algorithm for each task:
2. Accept two numbers and display their sum.
3. Calculate the area of a circle using $A = \pi r^2$.
4. Accept a student's score and determine whether the student passed, using 50 as the pass mark.
5. Accept three numbers and display the largest.
6. Calculate the total cost of items purchased, given quantity and unit price.

#### Activity C — Pseudocode and Flowcharts
*Choose any two problems from Activity B. For each selected problem:*
1. Write the algorithm in numbered steps.
2. Convert the algorithm into pseudocode.
3. Draw a flowchart using the correct graphical symbols.

---

## 3. Week 2: Development Environment and First Java Program

### Understanding the JDK, JVM, and Java Compiler
Java is designed around the principle of "Write Once, Run Anywhere" (WORA). This architecture depends on three components:

1. **Java Development Kit (JDK):** The complete software development package containing the compiler (`javac`), standard class libraries, development utilities, and the runtime environment.
2. **Java Compiler (`javac`):** Translates human-readable Java source files (`.java`) into platform-independent intermediate instructions known as **bytecode** (`.class`).
3. **Java Virtual Machine (JVM):** The execution engine that interprets or Just-In-Time (JIT) compiles bytecode into native machine instructions for the host operating system.

```
+--------------------+         +-------------------+         +--------------------+         +-------------------+
|  Java Source Code  |  javac  |   Java Bytecode   |   JVM   |   Native Machine   |  Execution  |  Program Output   |
| (HelloWorld.java)  | ------> | (HelloWorld.class)| ------> |    Instructions    | ----------> |  (Console Screen) |
+--------------------+         +-------------------+         +--------------------+         +-------------------+
```

### Verifying the Environment: java -version and javac -version
Before compiling, verify that both the runtime and compiler are accessible in your system's PATH:
```bash
javac -version
java -version
```
Both commands must report a valid version number (e.g., OpenJDK / Oracle JDK 17, 21, or 27).

### Compiling and Executing from the Terminal
To compile a program:
```bash
javac HelloWorld.java
```
This produces `HelloWorld.class`.

To run the program:
```bash
java HelloWorld
```
> [!NOTE]
> Do NOT include `.class` or `.java` when running the application with `java`. Provide only the class name.

### Why the Class Name and Filename Must Match
In Java, if a class is declared as `public`:
```java
public class HelloWorld { ... }
```
The file MUST be named exactly `HelloWorld.java`, matching uppercase and lowercase characters precisely. Java is strictly case-sensitive. If the names mismatch, the compiler issues an error such as:
`class HelloWorld is public, should be declared in a file named HelloWorld.java`.

### Version Control Fundamentals: Saving vs. Committing vs. Pushing
- **Saving (`Ctrl + S`):** Writes changes to your local disk file. The version control system sees this as an uncommitted modification.
- **Committing (`git commit`):** Records a permanent snapshot of staged changes into the local repository database history along with a descriptive log message. Commits exist only on your computer until pushed.
- **Pushing (`git push`):** Uploads all local commits across your local branch to the remote repository (e.g., GitHub), making them visible to lecturers and collaborators.

### Identifying and Fixing Basic Syntax Errors
A classic beginner error is the missing semicolon:
```java
System.out.println("Learning Java") // Error: ';' expected
```
**Systematic Debugging Technique:**
1. Read the compiler error message: notice the file name, line number, and error description.
2. Navigate directly to that line in your code editor.
3. Check the end of the statement or surrounding braces.
4. Correct the syntax, save the file, recompile (`javac`), and verify.

---

## 4. Week 3: Variables, Data Types, Expressions, and Input/Output

### Variables, Constants, and Memory Storage
- **Variable:** A named memory location whose stored value can change during program execution.
- **Constant:** A memory location whose value cannot be modified once assigned. In Java, constants are declared using the `final` keyword (e.g., `final double PI = 3.14159;`).

### Declaration, Initialization, and Assignment
- **Declaration:** Informs the compiler of the variable's name and data type:
  ```java
  int studentAge;
  ```
- **Initialization:** Assigning a starting value at the time of declaration:
  ```java
  int studentAge = 20;
  ```
- **Assignment:** Updating or changing the value stored in an existing variable:
  ```java
  studentAge = 21;
  ```

### Primitive Data Types vs. Reference Types (String)
Java has two main categories of data types:
1. **Primitive Data Types (8 basic types):**
   - Integers: `byte` (8-bit), `short` (16-bit), `int` (32-bit), `long` (64-bit).
   - Floating-point numbers: `float` (32-bit), `double` (64-bit standard).
   - Character: `char` (16-bit Unicode character, enclosed in single quotes `'A'`).
   - Boolean: `boolean` (`true` or `false`).
2. **Reference Types (e.g., `String`, Arrays, Objects):**
   - `String` is a Java class representing a sequence of characters, enclosed in double quotes `"Amina Bello"`. It contains built-in methods for manipulation.

### Arithmetic Operators and Precedence Rules
Java evaluates expressions using standard mathematical precedence:
1. Parentheses: `()`
2. Multiplicative operators: `*` (multiplication), `/` (division), `%` (modulus / remainder)
3. Additive operators: `+` (addition), `-` (subtraction)

*Left-to-right associativity* applies for operators of identical precedence.

### Integer Division vs. Floating-Point Division and Explicit Type Casting
A frequent source of logical bugs in introductory programming is **integer division**:
```java
int a = 5;
int b = 2;
double result = a / b; // Evaluates to 2.0, NOT 2.5!
```
*Why?* Because both operands `a` and `b` are integers, Java performs integer division and truncates the fractional component to `2`. Then `2` is widened to `2.0`.

**The Solution:** Use explicit casting or floating-point literals:
```java
double result = (double) a / b; // Evaluates to 2.5
// or
double average = total / 3.0; // Using 3.0 forces floating-point division
```

### Keyboard Input Handling with Scanner (Buffer Behavior)
Keyboard input is captured using `java.util.Scanner`:
```java
Scanner input = new Scanner(System.in);
```

#### The `nextInt()` followed by `nextLine()` Buffer Quirk
When reading numeric data using `input.nextInt()` or `input.nextDouble()`, Scanner reads the numeric characters but leaves the trailing newline (`\n`) keypress in the input stream buffer.
If a subsequent call to `input.nextLine()` is made, it immediately consumes that leftover newline and returns an empty string without waiting for the user to type!

**Standard Remedy:** Consume the newline before reading subsequent string input:
```java
int quantity = input.nextInt();
input.nextLine(); // Consume remaining newline character
System.out.print("Enter full name: ");
String name = input.nextLine(); // Now reads correctly
```

### Console Output Formatting: print(), println(), and printf()
- `System.out.print(...)`: Prints text without moving to a new line.
- `System.out.println(...)`: Prints text and terminates the current line (moves cursor to next line).
- `System.out.printf(...)`: Prints formatted text using format specifiers:
  - `%s`: String
  - `%d`: Decimal integer
  - `%.2f`: Floating-point number rounded to 2 decimal places
  - `%n`: Platform-independent line separator

*Example:*
```java
System.out.printf("Total: ₦%.2f%n", 1250.5);
// Output: Total: ₦1250.50
```

### Why Defensive Input Validation and Testing Matter
In real-world computing and cybersecurity, software cannot assume that input is benign or well-formed. Programs must practice **defensive programming**:
- Checking divisor values before division prevents runtime arithmetic exceptions (`ArithmeticException`).
- Checking academic score ranges ($0 \le \text{score} \le 100$) prevents invalid averages.
- Checking inventory quantities ($quantity > 0$) and prices ($price \ge 0$) prevents corrupt transaction data.

---

## 5. Verification of Requirements from Lecture Notes
Every program, structure, and guideline in this repository was cross-checked directly against the official lecture note:
- **Document:** `COS 201-Note-1-3.pdf`
- **Lecturer:** Dr. Ajilore Opeoluwa
- **Sections Verified:**
  - Week 1 Practical (FirstProgram.java & GitHub setup): Pages 10–13
  - Week 1 Written Activities (Activity A, B, C): Pages 13–14
  - Week 2 Development Environment & First Program (HelloWorld.java & StudentProfile.java): Pages 15–24
  - Week 3 Variables, Calculator, AverageCalculator, ItemCost: Pages 25–39
  - Submission Form URL: Verified exact Google Form URL
