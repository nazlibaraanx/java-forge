# Java Starter Projects

A repository showcasing console applications and practical implementations developed throughout my Java learning journey, starting from core syntax fundamentals. Each completed project will be sequentially documented and added here.

---

## 📁 Projects

### 1. Grade Average Calculator (`GradeAverageCalculator.java`)
A console application that calculates weighted GPA and passing status based on Midterm, Final, and Quiz inputs provided by the user.

- **File:** `GradeAverageCalculator.java`
- **Key Implementations:**
  * Comparative usage of `System.console()` and `Scanner` classes for handling terminal input.
  * Parsing user text inputs into integers using `Integer.parseInt()`.
  * Weighted average calculation: `Midterm (30%) + Final (50%) + Quiz (20%)`.
  * Determining pass/fail status (`Passed` / `Failed`) based on a passing threshold of 50 using the ternary operator (`? :`).
- **Core Concepts:** `Scanner`, Data Types (`int`, `double`, `String`), Type Casting, Arithmetic Operators, Ternary Conditional Operator.

---

## 🚀 How to Run

To compile and execute the project from the command line:

```bash
# Compile the file
javac GradeAverageCalculator.java

# Run the application
java GradeAverageCalculator
