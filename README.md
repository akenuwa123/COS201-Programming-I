
# COS 201 — Computer Programming I
**Practical Coursework Repository (Weeks 1–3)**

---

## Student Information
> [!IMPORTANT]
> Please update the editable placeholders below with your personal academic details before final submission.

- **Full Name:** `AKENUWA OMONUWA KELVIN`
- **Matriculation Number:** `25/16790`
- **Programme of Study:** `CYBERSECURITY`
- **Course Code:** `COS 201`
- **Course Title:** `Computer Programming I`
- **Lecturer:** `Dr. Ajilore Opeoluwa`
- **Repository URL:** `https://github.com/akenuwa123/COS201-Programming-I`

---

## Project Overview
This repository contains the complete practical programming assignments, source code, and technical documentation for **COS 201 — Computer Programming I** covering Weeks 1 through 3. The coursework emphasizes foundational computer science principles, structured algorithm design, professional coding practices, defensive input validation, and Git version control.

---

## Learning Objectives (Weeks 1–3)

### Week 1: Introduction to Programming and Problem-Solving
- Understand the definition and purpose of computer programs and programming.
- Comprehend the Input-Processing-Output (IPO) model and Program Development Life Cycle (PDLC).
- Distinguish between algorithms, pseudocode, flowcharts, and source code.
- Write, compile, and execute an introductory Java program.
- Initialize version control using Git and GitHub.

### Week 2: Development Environment and First Java Program
- Understand the roles of the JDK, the Java compiler (`javac`), and the Java Virtual Machine (JVM).
- Master terminal compilation and execution of Java classes.
- Learn class structure, access modifiers, method signatures (`main`), and output statements (`print`, `println`).
- Practice disciplined debugging and understand version control workflows (saving vs. committing vs. pushing).

### Week 3: Variables, Data Types, Expressions, and Input/Output
- Declare, initialize, and manipulate variables and constants.
- Differentiate primitive types (`int`, `double`, `char`, `boolean`) from reference types (`String`).
- Apply arithmetic expressions, operator precedence, and understand integer division vs. type casting.
- Accept interactive console input using `java.util.Scanner` and format output using `printf`.
- Implement defensive input validation to reject invalid scores, zero divisors, and negative prices.

---

## Repository Structure

```
COS201-Programming-I/
├── README.md                          # Main project documentation and run guide
├── .gitignore                         # Ignores compiled bytecode (*.class) and IDE configs
├── week01/
│   └── FirstProgram.java              # Week 1: Intro program, discipline rationale, learning goal
├── week02/
│   ├── HelloWorld.java                # Week 2: Course & academic info display
│   └── StudentProfile.java            # Week 2: Interactive student profile generator
├── week03/
│   ├── SimpleCalculator.java          # Week 3: Arithmetic calculator with zero-divisor check
│   ├── AverageCalculator.java         # Week 3: Student score average calculator with range validation (0-100)
│   └── ItemCost.java                  # Week 3: Inventory cost calculator with quantity & price validation
└── docs/
    └── assignment-guide.md            # Detailed learning notes, concepts, and paper activity prompts
```

---

## Program Summary

| Directory | Source File | Description |
| :--- | :--- | :--- |
| `week01/` | `FirstProgram.java` | Introductory program displaying course details, editable discipline relevance reasons, and an editable student learning goal. |
| `week02/` | `HelloWorld.java` | Displays structured academic metadata (course, title, week, topic, goal) using standard output. |
| `week02/` | `StudentProfile.java` | Interactive program prompting for name, programme, and course code, then printing a formatted student profile. |
| `week03/` | `SimpleCalculator.java` | Prompts for two double numbers, calculates sum, difference, product, and safely calculates quotient (preventing zero division). Formats to 2 decimal places. |
| `week03/` | `AverageCalculator.java` | Prompts for student name and 3 course scores; validates that each score is between 0 and 100; calculates total and floating-point average (`total / 3.0`). |
| `week03/` | `ItemCost.java` | Prompts for item name, quantity, and unit price; enforces quantity > 0 and price >= 0; computes total cost formatted to 2 decimal places. |

---

## Prerequisites and Environment Setup

To compile and run the programs in this repository, you need the **Java Development Kit (JDK)** version 17 or higher installed.

### Verify Installed Java Versions
Open your terminal or command prompt and run:
```bash
javac -version
java -version
```
Expected output should indicate an active JDK and JRE (e.g., OpenJDK 21 or 27).

---

## Compilation and Execution Guide

All commands below should be executed from your terminal. You can run them either from the repository root or by navigating into the specific week folder.

### Week 1 Programs
```bash
# Navigate to week01 folder
cd week01

# Compile
javac FirstProgram.java

# Run
java FirstProgram
```

### Week 2 Programs
```bash
# Navigate to week02 folder
cd week02

# 1. HelloWorld
javac HelloWorld.java
java HelloWorld

# 2. StudentProfile
javac StudentProfile.java
java StudentProfile
```

### Week 3 Programs
```bash
# Navigate to week03 folder
cd week03

# 1. SimpleCalculator
javac SimpleCalculator.java
java SimpleCalculator

# 2. AverageCalculator
javac AverageCalculator.java
java AverageCalculator

# 3. ItemCost
javac ItemCost.java
java ItemCost
```

---

## Test Cases and Verification Results

Every program has been compiled and tested with realistic inputs, boundary conditions, and invalid data.

### 1. `FirstProgram.java` (Week 1)
- **Execution:** Synchronous run
- **Output:**
  ```text
  ==================================================
  Course: COS 201 - Computer Programming I
  Programme: [CYBERSECURITY]
  ==================================================
  Why Programming is Important to My Discipline:
  1. Problem Solving: It allows us to break down complex problems into clear, computational steps.
  2. Security & Automation: It enables defensive security automation, log analysis, and safe input validation.
  3. Software Construction: It provides the practical foundation needed to build reliable, scalable applications.
  --------------------------------------------------
  My Goal: To master core Java programming principles, develop clean coding habits, and build reliable software.
  ==================================================
  ```
- **Status:** PASS

### 2. `HelloWorld.java` (Week 2)
- **Execution:** Synchronous run
- **Output:**
  ```text
  COURSE: COS 201
  COURSE TITLE: Computer Programming I
  PROGRAMME: [CYBERSECURITY]
  WEEK: 2
  TOPIC: Development Environment and Java
  GOAL: To learn how to write, compile, and execute Java programs.
  ```
- **Status:** PASS

### 3. `StudentProfile.java` (Week 2)
- **Inputs:**
  - Name: `Amina Bello`
  - Programme: `Cybersecurity`
  - Course Code: `COS 201`
- **Output:**
  ```text
  ----------------------------------------
              STUDENT PROFILE             
  ----------------------------------------
  Student Name : Amina Bello
  Programme    : Cybersecurity
  Course Code  : COS 201
  ----------------------------------------
  Profile generated successfully.
  ```
- **Status:** PASS

### 4. `SimpleCalculator.java` (Week 3)
- **Test Case 1 (Standard):** First Number = `20.5`, Second Number = `4.0`
  - Sum: `24.50` | Difference: `16.50` | Product: `82.00` | Quotient: `5.13`
- **Test Case 2 (Zero Divisor Boundary):** First Number = `15.0`, Second Number = `0.0`
  - Sum: `15.00` | Difference: `15.00` | Product: `0.00` | Quotient: `Division is undefined for a zero divisor.`
- **Status:** PASS (Properly handled zero divisor without runtime arithmetic crash)

### 5. `AverageCalculator.java` (Week 3)
- **Inputs:**
  - Name: `Amina Bello`
  - Course 1: `75.5`
  - Course 2: `110` (Invalid out-of-bounds input) $\rightarrow$ Rejected $\rightarrow$ Re-entered `85.0`
  - Course 3: `92.0`
- **Calculations:**
  - Total: $75.50 + 85.00 + 92.00 = 252.50$
  - Average: $252.50 / 3.0 = 84.17$
- **Output:**
  ```text
  ----------------------------------------
              STUDENT RESULT              
  ----------------------------------------
  Student Name : Amina Bello
  Total Score  : 252.50
  Average Score: 84.17
  ----------------------------------------
  ```
- **Status:** PASS (Score validation cleanly rejected 110 and reprompted)

### 6. `ItemCost.java` (Week 3)
- **Inputs:**
  - Item Name: `Notebooks`
  - Quantity: `-2` (Invalid negative quantity) $\rightarrow$ Rejected $\rightarrow$ Re-entered `5`
  - Unit Price: `-50` (Invalid negative price) $\rightarrow$ Rejected $\rightarrow$ Re-entered `250.75`
- **Calculations:**
  - Total Cost: $5 \times 250.75 = 1253.75$
- **Output:**
  ```text
  ----------------------------------------
              PURCHASE SUMMARY            
  ----------------------------------------
  Item Name  : Notebooks
  Quantity   : 5
  Unit Price : 250.75
  Total Cost : 1253.75
  ----------------------------------------
  ```
- **Status:** PASS (Negative inputs rejected; currency values formatted to 2 decimal places)

---

## Written Activities Note
> [!NOTE]
> The COS 201 lecture note specifies written activities for Week 1 (Activity A: IPO components, Activity B: Algorithm design, and Activity C: Pseudocode & Flowcharts). **These written exercises are designated for submission on paper to the lecturer.**
> 
> The exact questions and instructions have been preserved in [`docs/assignment-guide.md`](docs/assignment-guide.md#written-activities-designated-for-paper-submission) for your reference. Do not confuse paper submissions with the GitHub practical submission.

---

## Git Workflow and Submission Checklist

Follow these steps when committing and submitting your assignment:

1. **Review Local Changes:**
   Open your terminal in the repository root or open GitHub Desktop:
   ```bash
   git status
   ```
2. **Personalize Placeholders:**
   Update your full name, matriculation number, and programme in `README.md`, `FirstProgram.java`, and `HelloWorld.java`.
3. **Stage and Commit:**
   Stage the completed files and commit with clear, descriptive messages:
   ```bash
   git add .
   git commit -m "Complete COS 201 Weeks 1-3 practical programs and documentation"
   ```
4. **Push to GitHub:**
   Upload your local commits to your remote repository:
   ```bash
   git push -u origin main
   ```
5. **Verify Online:**
   Visit your repository at `https://github.com/akenuwa123/COS201-Programming-I` and verify that all directories (`week01`, `week02`, `week03`, `docs`), Java files, and `README.md` are present and readable.
6. **Submit to Lecturer:**
   Copy your repository URL and submit it via the lecturer's Google Form:
   👉 **[COS 201 Practical Submission Google Form](https://docs.google.com/forms/d/e/1FAIpQLScfFS-TTZZdgAZ9qPEFp8gNJpHCu0cYudvHJizNCbKOACAb1A/viewform?usp=header)**
