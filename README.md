# Java Fundamentals: A Beginner's Complete Guide

Welcome to Java! This documentation is designed to guide you through the fundamental building blocks of Java programming step by step.

**How each module is organized:**
1. Each subtopic has a **Definition** followed by a **Code Example**.
2. At the end of every module, there is a **Run the Code** section with a complete program and its actual output.

---

## Module 1: Variables and Data Types

### Part A: Variables

#### 1. What is a Variable?

**Definition:** A **variable** is a container that holds data (values) while your Java program is running. It represents a specific memory location where you can store and retrieve temporary data. Every variable must be declared with a specific data type.

**Code Example:**
```java
int score = 90; // int is the data type, score is the variable, 90 is the value
```

#### 2. Naming Conventions of Variables

**Definition:** Variable names should follow these rules and conventions:
* **Use Descriptive Names:** Choose names that clearly describe the purpose of the variable (e.g., `age`, `totalAmount`).
* **lowerCamelCase:** Start the first word in lowercase, and capitalize the first letter of each subsequent word (e.g., `firstName`, `isLoggedIn`).
* **Valid Starting Character:** Must start with a letter (`a-z`, `A-Z`), an underscore (`_`), or a dollar sign (`$`). It cannot start with a digit.
* **Case-Sensitive:** `age` and `Age` are two different variables.
* **Avoid Keywords:** Do not use Java reserved keywords like `int`, `class`, or `public`.

**Code Example:**
```java
int totalAmount = 500;      // good: descriptive + lowerCamelCase
boolean isLoggedIn = true;  // good

// int 1stPlace = 1;        // wrong: starts with a digit
// int class = 5;           // wrong: reserved keyword
```

#### 3. Initialization

**Definition:** Declaring a variable and assigning its value at the same time (in one line).

**Code Example:**
```java
byte age = 25;
```

#### 4. Declaration + Assignment

**Definition:** Declaring the variable first, then assigning a value to it on a later line.

**Code Example:**
```java
byte choice;
choice = 1;
```

#### 5. Multiple Variables

**Definition:** Declaring multiple variables of the same type in one line, separated by commas.

**Code Example:**
```java
byte age1 = 25, age2 = 29, age3 = 23;
```

#### 6. Variables are Mutable

**Definition:** You can change or re-assign the value of a variable at any time during execution. To prevent re-assignment, declare the variable with the `final` keyword.

**Code Example:**
```java
int score = 22;
score = 23;                 // value is updated

final double PI = 3.14159;  // final: cannot be re-assigned
```

---

### Part B: Data Types

#### 1. What is a Data Type?

**Definition:** Data types specify the different sizes and values that can be stored in a variable. Java has two main categories: **Primitive** and **Non-Primitive**. The 8 primitive types are covered below; the non-primitive types are covered in Module 6.

**Code Example:**
```java
int age = 25;          // primitive (whole number)
String name = "Jareth"; // non-primitive (text)
```

> **Note:** The default values listed below apply when the variable is declared inside a class but outside any method (a field). Variables declared inside a method have no default value and must be assigned before use.

#### 2. `boolean`

**Definition:** Stores only `true` or `false`. (Default: `false`)

**Code Example:**
```java
boolean isLoggedIn = true;   // is the user logged in?
boolean isLightOn = false;   // is the room light on?
```

#### 3. `char`

**Definition:** Stores a single character enclosed in single quotes. (Default: `'\u0000'`)

**Code Example:**
```java
char grade = 'A';        // student's letter grade
char menuChoice = 'Y';   // menu option
```

#### 4. `byte`

**Definition:** Stores small whole numbers from **-128 to 127**. (Default: `0`)

**Code Example:**
```java
byte age = 25;            // person's age
byte batteryLevel = 85;   // smartphone battery percentage
```

#### 5. `short`

**Definition:** Stores whole numbers from **-32,768 to 32,767**. (Default: `0`)

**Code Example:**
```java
short manufactureYear = 2024;  // vehicle's manufacturing year
short classSize = 45;          // students in a small classroom
```

#### 6. `int`

**Definition:** Stores whole numbers from **-2,147,483,648 to 2,147,483,647**. This is the standard choice for whole numbers. (Default: `0`)

**Code Example:**
```java
int population = 150000;   // population of a town
int videoViews = 104520;   // video view count
```

#### 7. `long`

**Definition:** Stores very large whole numbers. The value must end with an `L`. Use it when a value is too large for `int`. (Default: `0L`)

**Code Example:**
```java
long worldPopulation = 8100000000L;  // global population
long fileBytes = 5000000000L;        // file size in bytes
```

#### 8. `float`

**Definition:** Stores decimal numbers with about 6-7 significant digits. The value must end with an `f`. (Default: `0.0f`)

**Code Example:**
```java
float babyWeight = 3.25f;    // baby's weight in kilograms
float temperature = 36.6f;   // body temperature
```

#### 9. `double`

**Definition:** Stores decimal numbers with about 15 significant digits. This is the standard choice for decimal numbers. The `d` suffix is optional. (Default: `0.0d`)

> **Warning:** `float` and `double` can have small rounding errors (e.g., `0.1 + 0.2` gives `0.30000000000000004`). For exact money calculations in real applications, use `BigDecimal` instead.

**Code Example:**
```java
double price = 154.75;           // product price
double pi = 3.14159265359;       // scientific constant
```

---

### Run the Code (Module 1)

```java
public class Module1Demo {
    public static void main(String[] args) {

        System.out.println("=== VARIABLES ===");

        // Initialization
        byte age = 25;
        System.out.println("Initialization: age = " + age);

        // Declaration + Assignment
        byte choice;
        choice = 1;
        System.out.println("Declaration + Assignment: choice = " + choice);

        // Multiple variables
        byte age1 = 25, age2 = 29, age3 = 23;
        System.out.println("Multiple variables: " + age1 + ", " + age2 + ", " + age3);

        // Mutable
        int score = 22;
        System.out.println("Before re-assign: score = " + score);
        score = 23;
        System.out.println("After re-assign: score = " + score);

        // final
        final double PI = 3.14159;
        System.out.println("final variable: PI = " + PI);

        System.out.println("\n=== PRIMITIVE DATA TYPES ===");

        boolean isLoggedIn = true;
        char grade = 'A';
        byte batteryLevel = 85;
        short manufactureYear = 2024;
        int population = 150000;
        long worldPopulation = 8100000000L;
        float babyWeight = 3.25f;
        double price = 154.75;

        System.out.println("boolean: isLoggedIn = " + isLoggedIn);
        System.out.println("char: grade = " + grade);
        System.out.println("byte: batteryLevel = " + batteryLevel);
        System.out.println("short: manufactureYear = " + manufactureYear);
        System.out.println("int: population = " + population);
        System.out.println("long: worldPopulation = " + worldPopulation);
        System.out.println("float: babyWeight = " + babyWeight);
        System.out.println("double: price = " + price);
        System.out.println("double rounding error: 0.1 + 0.2 = " + (0.1 + 0.2));
    }
}
```

**Output:**
```
=== VARIABLES ===
Initialization: age = 25
Declaration + Assignment: choice = 1
Multiple variables: 25, 29, 23
Before re-assign: score = 22
After re-assign: score = 23
final variable: PI = 3.14159

=== PRIMITIVE DATA TYPES ===
boolean: isLoggedIn = true
char: grade = A
byte: batteryLevel = 85
short: manufactureYear = 2024
int: population = 150000
long: worldPopulation = 8100000000
float: babyWeight = 3.25
double: price = 154.75
double rounding error: 0.1 + 0.2 = 0.30000000000000004
```

---

## Module 2: Operators

An **operator** is a symbol used to perform operations on variables and values.

### 1. Unary Operators

**Definition:** Operators that work on a **single** operand: `++` (increment), `--` (decrement), `-` (negation), and `!` (logical complement). Pre-increment (`++a`) changes the value first, then uses it. Post-increment (`a++`) uses the value first, then changes it.

**Code Example:**
```java
int a = 10;
System.out.println(++a);  // 11 (increase first, then print)
System.out.println(a++);  // 11 (print first, then increase to 12)
System.out.println(--a);  // 11
System.out.println(-a);   // -11
System.out.println(!true); // false
```

### 2. Arithmetic Operators

**Definition:** Used for math operations: `+` (addition), `-` (subtraction), `*` (multiplication), `/` (division), `%` (modulus, the remainder). Dividing two `int` values gives an `int` (the decimal part is dropped).

**Code Example:**
```java
int x = 20, y = 6;
System.out.println(x + y);  // 26
System.out.println(x / y);  // 3 (integer division)
System.out.println(x % y);  // 2 (remainder)
```

### 3. Assignment Operators

**Definition:** Used to assign values. The compound forms (`+=`, `-=`, `*=`, `/=`, `%=`) perform an operation and assign the result in one step.

**Code Example:**
```java
int num = 10;
num += 5;   // num = 15
num *= 2;   // num = 30
```

### 4. Relational Operators

**Definition:** Compare two values and return a `boolean` (`true` or `false`): `==`, `!=`, `<`, `>`, `<=`, `>=`.

**Code Example:**
```java
int p = 15, q = 20;
System.out.println(p == q);  // false
System.out.println(p < q);   // true
```

### 5. Logical Operators

**Definition:** Combine boolean conditions: `&&` (AND, both must be true), `||` (OR, at least one must be true), `!` (NOT, reverses the result).

**Code Example:**
```java
int age = 22;
boolean hasLicense = true;
System.out.println(age >= 18 && hasLicense);  // true
System.out.println(age < 18 || hasLicense);   // true
System.out.println(!hasLicense);              // false
```

### 6. Bitwise Operators

**Definition:** Work on the individual **bits** (binary digits) of numbers: `&` (AND), `|` (OR), `^` (XOR), `~` (NOT).

**Code Example:**
```java
int m = 12, n = 10;  // 12 = 1100, 10 = 1010 in binary
System.out.println(m & n);  // 8  (1000)
System.out.println(m | n);  // 14 (1110)
System.out.println(m ^ n);  // 6  (0110)
System.out.println(~m);     // -13
```

### 7. Shift Operators

**Definition:** Move the bits of a number: `<<` (left shift, doubles the value per shift), `>>` (right shift, halves it), and `>>>` (unsigned right shift, fills with zeros).

**Code Example:**
```java
int val = 8;
System.out.println(val << 1);   // 16
System.out.println(val >> 1);   // 4
System.out.println(-8 >>> 28);  // 15
```

### 8. Ternary Operator

**Definition:** A short form of `if-else` written as `condition ? valueIfTrue : valueIfFalse`.

**Code Example:**
```java
int num1 = 12, num2 = 25;
int max = (num1 > num2) ? num1 : num2;
System.out.println(max);  // 25
```

---

### Run the Code (Module 2)

```java
public class OperatorDemo {
    public static void main(String[] args) {
        System.out.println("=== 1. UNARY OPERATORS ===");
        int a = 10;
        boolean flag = true;
        System.out.println("Pre-increment (++a): " + (++a));
        System.out.println("Post-increment (a++): " + (a++));
        System.out.println("Pre-decrement (--a): " + (--a));
        System.out.println("Unary minus (-a): " + (-a));
        System.out.println("Logical complement (!flag): " + (!flag));

        System.out.println("\n=== 2. ARITHMETIC OPERATORS ===");
        int x = 20, y = 6;
        System.out.println("Addition (20 + 6): " + (x + y));
        System.out.println("Subtraction (20 - 6): " + (x - y));
        System.out.println("Multiplication (20 * 6): " + (x * y));
        System.out.println("Division (20 / 6): " + (x / y));
        System.out.println("Modulus (20 % 6): " + (x % y));

        System.out.println("\n=== 3. ASSIGNMENT OPERATORS ===");
        int num = 10;
        num += 5;
        System.out.println("After num += 5: " + num);
        num -= 3;
        System.out.println("After num -= 3: " + num);
        num *= 2;
        System.out.println("After num *= 2: " + num);
        num /= 4;
        System.out.println("After num /= 4: " + num);
        num %= 4;
        System.out.println("After num %= 4: " + num);

        System.out.println("\n=== 4. RELATIONAL OPERATORS ===");
        int p = 15, q = 20;
        System.out.println("15 == 20: " + (p == q));
        System.out.println("15 != 20: " + (p != q));
        System.out.println("15 < 20: " + (p < q));
        System.out.println("15 > 20: " + (p > q));
        System.out.println("15 <= 20: " + (p <= q));
        System.out.println("15 >= 20: " + (p >= q));

        System.out.println("\n=== 5. LOGICAL OPERATORS ===");
        int age = 22;
        boolean hasLicense = true;
        System.out.println("age >= 18 && hasLicense: " + (age >= 18 && hasLicense));
        System.out.println("age < 18 || hasLicense: " + (age < 18 || hasLicense));
        System.out.println("!hasLicense: " + (!hasLicense));

        System.out.println("\n=== 6. BITWISE OPERATORS ===");
        int m = 12, n = 10;
        System.out.println("12 & 10 (AND): " + (m & n));
        System.out.println("12 | 10 (OR): " + (m | n));
        System.out.println("12 ^ 10 (XOR): " + (m ^ n));
        System.out.println("~12 (NOT): " + (~m));

        System.out.println("\n=== 7. SHIFT OPERATORS ===");
        int val = 8;
        System.out.println("Left Shift (8 << 1): " + (val << 1));
        System.out.println("Right Shift (8 >> 1): " + (val >> 1));
        System.out.println("Unsigned Right Shift (-8 >>> 28): " + (-8 >>> 28));

        System.out.println("\n=== 8. TERNARY OPERATOR ===");
        int num1 = 12, num2 = 25;
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("Max of 12 and 25: " + max);
    }
}
```

**Output:**
```
=== 1. UNARY OPERATORS ===
Pre-increment (++a): 11
Post-increment (a++): 11
Pre-decrement (--a): 11
Unary minus (-a): -11
Logical complement (!flag): false

=== 2. ARITHMETIC OPERATORS ===
Addition (20 + 6): 26
Subtraction (20 - 6): 14
Multiplication (20 * 6): 120
Division (20 / 6): 3
Modulus (20 % 6): 2

=== 3. ASSIGNMENT OPERATORS ===
After num += 5: 15
After num -= 3: 12
After num *= 2: 24
After num /= 4: 6
After num %= 4: 2

=== 4. RELATIONAL OPERATORS ===
15 == 20: false
15 != 20: true
15 < 20: true
15 > 20: false
15 <= 20: true
15 >= 20: false

=== 5. LOGICAL OPERATORS ===
age >= 18 && hasLicense: true
age < 18 || hasLicense: true
!hasLicense: false

=== 6. BITWISE OPERATORS ===
12 & 10 (AND): 8
12 | 10 (OR): 14
12 ^ 10 (XOR): 6
~12 (NOT): -13

=== 7. SHIFT OPERATORS ===
Left Shift (8 << 1): 16
Right Shift (8 >> 1): 4
Unsigned Right Shift (-8 >>> 28): 15

=== 8. TERNARY OPERATOR ===
Max of 12 and 25: 25
```

---

## Module 3: Decision Making & User Input

### 1. Simple `if` Statement

**Definition:** Executes a block of code only if the condition is `true`.

**Code Example:**
```java
int temperature = 35;
if (temperature > 30) {
    System.out.println("It's a hot day.");
}
```

### 2. `if-else` Statement

**Definition:** Adds an alternative block that runs when the condition is `false`.

**Code Example:**
```java
int score = 70;
if (score >= 75) {
    System.out.println("Passed");
} else {
    System.out.println("Failed");
}
```

### 3. `if-else-if` Ladder

**Definition:** Chains multiple conditions together. Java checks them from top to bottom and runs the first block whose condition is `true`.

**Code Example:**
```java
int mark = 88;
if (mark >= 90) {
    System.out.println("Grade: A");
} else if (mark >= 80) {
    System.out.println("Grade: B");
} else if (mark >= 70) {
    System.out.println("Grade: C");
} else {
    System.out.println("Grade: F");
}
```

### 4. Nested `if` Statement

**Definition:** Placing an `if` statement inside another `if` statement for multi-layered logic.

**Code Example:**
```java
int finalScore = 85;
boolean isEnrolled = true;

if (isEnrolled) {
    if (finalScore >= 75) {
        System.out.println("Passed with valid enrollment!");
    } else {
        System.out.println("Failed despite enrollment.");
    }
}
```

### 5. `switch` Statement

**Definition:** An alternative to long `if-else-if` ladders when evaluating a single variable against fixed choices. Use `break` to stop after a matching case; without it, execution "falls through" and continues running the next cases.

**Code Example:**
```java
int day = 2;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid day");
}
```

### 6. User Input via `Scanner`

**Definition:** The `Scanner` class (from the `java.util` package) lets you accept input from the user. Call `close()` when you are done to release the resource.

> **Common pitfall:** After `nextInt()` or `nextDouble()`, the Enter key stays in the buffer. Call `input.nextLine();` once to consume it before reading a `String` with `nextLine()`.

**Code Example:**
```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = input.nextLine();
System.out.println("Hello, " + name + "!");
input.close();
```

---

### Run the Code (Module 3)

```java
import java.util.Scanner;

public class DecisionDemo {
    public static void main(String[] args) {
        System.out.println("=== 1. SIMPLE IF ===");
        int temperature = 35;
        if (temperature > 30) {
            System.out.println("It's a hot day.");
        }

        System.out.println("\n=== 2. IF-ELSE ===");
        int score = 70;
        if (score >= 75) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        System.out.println("\n=== 3. IF-ELSE-IF LADDER ===");
        int mark = 88;
        if (mark >= 90) {
            System.out.println("Grade: A");
        } else if (mark >= 80) {
            System.out.println("Grade: B");
        } else if (mark >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        System.out.println("\n=== 4. NESTED IF ===");
        int finalScore = 85;
        boolean isEnrolled = true;
        if (isEnrolled) {
            if (finalScore >= 75) {
                System.out.println("Passed with valid enrollment!");
            } else {
                System.out.println("Failed despite enrollment.");
            }
        }

        System.out.println("\n=== 5. SWITCH STATEMENT ===");
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        System.out.println("\n=== 6. USER INPUT (Scanner) ===");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        input.close();
    }
}
```

**Output** (the user typed `Jareth` when asked for the name):
```
=== 1. SIMPLE IF ===
It's a hot day.

=== 2. IF-ELSE ===
Failed

=== 3. IF-ELSE-IF LADDER ===
Grade: B

=== 4. NESTED IF ===
Passed with valid enrollment!

=== 5. SWITCH STATEMENT ===
Tuesday

=== 6. USER INPUT (Scanner) ===
Enter your name: Jareth
Hello, Jareth!
```

---

## Module 4: Loops

Loops execute a block of code repeatedly until a specified condition is met, reducing code duplication.

### 1. `for` Loop

**Definition:** Used when the exact number of iterations is known ahead of time. It has three parts: initialization, condition, and update.

**Code Example:**
```java
for (int i = 0; i <= 5; i++) {
    System.out.print(i + " ");  // 0 1 2 3 4 5
}
```

### 2. `while` Loop

**Definition:** An **entry-controlled** loop. The condition is checked *before* each execution, so the body may never run if the condition is false from the start.

**Code Example:**
```java
int i = 0;
while (i <= 5) {
    System.out.print(i + " ");  // 0 1 2 3 4 5
    i++;
}
```

### 3. `do-while` Loop

**Definition:** An **exit-controlled** loop. The condition is checked *after* the body, which guarantees the code runs **at least once**.

**Code Example:**
```java
int i = 0;
do {
    System.out.print(i + " ");  // 0 1 2 3 4 5
    i++;
} while (i <= 5);
```

### 4. Nested `for` Loop

**Definition:** A loop placed inside another loop. For every single iteration of the **outer** loop, the **inner** loop runs all of its iterations from start to finish. It is commonly used for tables, grids, and patterns.

**Code Example:**
```java
// Multiplication table
for (int row = 1; row <= 3; row++) {
    for (int col = 1; col <= 3; col++) {
        System.out.print(row * col + " ");
    }
    System.out.println();  // new line after each row
}

// Star pattern
for (int row = 1; row <= 4; row++) {
    for (int star = 1; star <= row; star++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

---

### Run the Code (Module 4)

```java
public class LoopDemo {
    public static void main(String[] args) {
        System.out.print("for loop:      ");
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " ");
        }

        System.out.print("\nwhile loop:    ");
        int j = 0;
        while (j <= 5) {
            System.out.print(j + " ");
            j++;
        }

        System.out.print("\ndo-while loop: ");
        int k = 0;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 5);

        System.out.print("\ndo-while (condition already false): ");
        int n = 10;
        do {
            System.out.print(n + " ");
            n++;
        } while (n <= 5);

        System.out.println("\n\nnested for loop (multiplication table):");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print(row * col + " ");
            }
            System.out.println();
        }

        System.out.println("\nnested for loop (star pattern):");
        for (int row = 1; row <= 4; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

**Output:**
```
for loop:      0 1 2 3 4 5 
while loop:    0 1 2 3 4 5 
do-while loop: 0 1 2 3 4 5 
do-while (condition already false): 10 

nested for loop (multiplication table):
1 2 3 
2 4 6 
3 6 9 

nested for loop (star pattern):
* 
* * 
* * * 
* * * * 
```

---

## Module 5: Jump Statements (`break`, `continue`, `return`)

Jump statements transfer control of execution to another part of your program.

### 1. `break`

**Definition:** Completely terminates a loop or a `switch` statement early.

**Code Example:**
```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) { break; }
    System.out.print(i + " ");  // 1 2 3 4
}
```

### 2. `continue`

**Definition:** Skips the current iteration and moves on to the next one.

**Code Example:**
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) { continue; }
    System.out.print(i + " ");  // 1 2 4 5
}
```

### 3. `return`

**Definition:** Exits from the current method entirely.

**Code Example:**
```java
public static void checkAge(int age) {
    if (age < 18) {
        System.out.println("Minor. Method ends here.");
        return;  // method ends here for minors
    }
    System.out.println("Adult.");
}
```

---

### Run the Code (Module 5)

```java
public class JumpDemo {
    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Minor. Method ends here.");
            return;
        }
        System.out.println("Adult.");
    }

    public static void main(String[] args) {
        System.out.print("break:    ");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) { break; }
            System.out.print(i + " ");
        }

        System.out.print("\ncontinue: ");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) { continue; }
            System.out.print(i + " ");
        }

        System.out.println("\nreturn:");
        checkAge(15);
        checkAge(20);
    }
}
```

**Output:**
```
break:    1 2 3 4 
continue: 1 2 4 5 
return:
Minor. Method ends here.
Adult.
```

---

## Module 6: Non-Primitive Data Types

**Definition:** Non-primitive data types (also called **reference types**) are more complex than the 8 primitive types. They include Classes, Strings (`String`), Arrays, and Interfaces. Their default value is `null`.

**Code Example:**
```java
String studentName = "Jareth";   // String
int[] scores = {90, 85, 100};    // Array
```

---

### Part A: Arrays

An **array** is a container that holds **multiple values of the same data type** under a single variable name. Each value is called an **element**, and each element has an **index** (position number) that **starts at 0**.

Arrays come in two kinds: **Single-Dimensional** (a simple list) and **Multi-Dimensional** (an array of arrays, like a table). We will cover both.

---

### Single-Dimensional Array

#### 1. Declare an Array with Elements

**Definition:** Declare the array and give its values right away using curly braces `{ }`. The size is set automatically based on the number of values.

> **Note:** Printing an array variable directly (e.g., `System.out.println(scores)`) shows a memory reference, not the contents. Use `Arrays.toString(array)` (from `java.util.Arrays`) or a loop to display the values.

**Code Example:**
```java
int[] scores = {90, 85, 100, 75, 88};
String[] fruits = {"Apple", "Banana", "Mango"};
double[] prices = new double[]{19.5, 25.0, 40.75};  // another way to write it
```

#### 2. Access (Invoke) an Element

**Definition:** Use the array name with the element's **index** inside square brackets: `arrayName[index]`. The first element is at index `0` and the last is at `length - 1`. You can also use the index to change an element's value. Using an index outside this range causes an `ArrayIndexOutOfBoundsException`.

**Code Example:**
```java
System.out.println(scores[0]);  // 90 (first element)
System.out.println(scores[4]);  // 88 (last element)

String[] colors = {"Red", "Green", "Blue"};
colors[1] = "Yellow";           // change the element at index 1
```

#### 3. Get the Length of an Array

**Definition:** Use the `length` property: `arrayName.length`. It returns the number of elements. Note that there are **no parentheses** (unlike `String`'s `length()` method).

**Code Example:**
```java
System.out.println(scores.length);      // 5
System.out.println(fruits.length);      // 3
System.out.println(scores.length - 1);  // 4 (the last index)
```

#### 4. Traverse an Array Using a `for` Loop

**Definition:** Traversing means visiting every element one by one. A `for` loop uses the index (`i`) from `0` up to `length - 1`, so you can access each element and also know its position.

**Code Example:**
```java
for (int i = 0; i < scores.length; i++) {
    System.out.println("scores[" + i + "] = " + scores[i]);
}
```

#### 5. Traverse an Array Using a `for-each` Loop

**Definition:** A simpler loop that goes through each element directly, without using an index. Read it as "for each `fruit` in `fruits`". Use it when you only need the values, not the positions.

**Code Example:**
```java
for (String fruit : fruits) {
    System.out.println(fruit);
}
```

#### 6. Declare an Array with a Specified Size Only

**Definition:** Use the `new` keyword with the size inside square brackets: `new dataType[size]`. The array is created with the given number of slots, and each slot is filled with a **default value** (`0` for numbers, `0.0` for decimals, `false` for boolean, `null` for objects like `String`). Assign real values later using the index.

**Code Example:**
```java
int[] numbers = new int[5];       // [0, 0, 0, 0, 0]
String[] names = new String[3];   // [null, null, null]
double[] amounts = new double[2]; // [0.0, 0.0]

numbers[0] = 10;
numbers[4] = 50;                  // [10, 0, 0, 0, 50]
```

#### 7. Accept Values for an Array Using `Scanner`

**Definition:** Create an array with a specified size, then use a loop to ask the user for each value with `Scanner` and store it in the matching index.

**Code Example:**
```java
Scanner input = new Scanner(System.in);
int[] userValues = new int[3];

for (int i = 0; i < userValues.length; i++) {
    System.out.print("Enter value " + (i + 1) + ": ");
    userValues[i] = input.nextInt();
}
```

#### 8. Traverse the Array to Display Its Contents

**Definition:** After storing the values, traverse the array with a loop to print each element.

**Code Example:**
```java
for (int value : userValues) {
    System.out.print(value + " ");
}
```

---

### Multi-Dimensional Array (2D Array)

A **2D array** is an array of arrays, organized like a table with **rows** and **columns**. Each element needs **two indexes**: `array[row][column]`. Both indexes start at 0.

#### 1. Declare a 2D Array with Elements

**Definition:** Use double square brackets `[][]` and nested curly braces. Each inner `{ }` is one **row**.

**Code Example:**
```java
// rows = students, columns = subjects
int[][] grades = {
    {90, 85, 88},   // row 0 (student 1)
    {78, 92, 80}    // row 1 (student 2)
};
```

#### 2. Access (Invoke) an Element

**Definition:** Use two indexes: `arrayName[row][column]`. You can also use them to change a value.

**Code Example:**
```java
System.out.println(grades[0][1]);  // 85 (row 0, column 1)
System.out.println(grades[1][2]);  // 80 (row 1, column 2)

int[][] table = {{1, 2}, {3, 4}};
table[0][1] = 20;                  // change the element at row 0, column 1
```

#### 3. Get the Length of a 2D Array

**Definition:** `arrayName.length` gives the number of **rows**. `arrayName[0].length` gives the number of **columns** in row 0.

**Code Example:**
```java
System.out.println(grades.length);     // 2 (rows)
System.out.println(grades[0].length);  // 3 (columns)
```

#### 4. Traverse a 2D Array Using a `for` Loop

**Definition:** Use a **nested `for` loop**: the outer loop goes through the rows, and the inner loop goes through the columns of each row.

**Code Example:**
```java
for (int row = 0; row < grades.length; row++) {
    for (int col = 0; col < grades[row].length; col++) {
        System.out.print(grades[row][col] + " ");
    }
    System.out.println();  // new line after each row
}
```

#### 5. Traverse a 2D Array Using a `for-each` Loop

**Definition:** Use a nested `for-each` loop. The outer loop picks each **row** (which is itself a 1D array, `int[]`), and the inner loop picks each **value** in that row.

**Code Example:**
```java
for (int[] row : grades) {
    for (int grade : row) {
        System.out.print(grade + " ");
    }
    System.out.println();
}
```

#### 6. Declare a 2D Array with a Specified Size Only

**Definition:** Use `new dataType[rows][columns]`. All slots are filled with default values until you assign real ones.

**Code Example:**
```java
int[][] empty = new int[2][3];  // 2 rows, 3 columns: [[0, 0, 0], [0, 0, 0]]
```

#### 7. Accept Values for a 2D Array Using `Scanner`

**Definition:** Create the 2D array with a specified size, then use a nested `for` loop to ask the user for each value and store it in `[row][column]`.

**Code Example:**
```java
Scanner input = new Scanner(System.in);
int[][] userMatrix = new int[2][3];

for (int row = 0; row < userMatrix.length; row++) {
    for (int col = 0; col < userMatrix[row].length; col++) {
        System.out.print("Enter value for [" + row + "][" + col + "]: ");
        userMatrix[row][col] = input.nextInt();
    }
}
```

#### 8. Traverse the 2D Array to Display Its Contents

**Definition:** After storing the values, traverse with a nested loop to print the table row by row.

**Code Example:**
```java
for (int[] row : userMatrix) {
    for (int value : row) {
        System.out.print(value + " ");
    }
    System.out.println();
}
```

#### 9. Jagged Array

**Definition:** A **jagged array** is a 2D array where each row can have a **different number of columns**. In a regular 2D array, every row has the same length. In a jagged array, each row is its own separate array, so you can set the size of each row individually. Because the rows differ in length, always use `array[row].length` (not a fixed number) when traversing.

**Code Example:**
```java
// 1. Declare with elements (each row has a different length)
int[][] jagged = {
    {1, 2},           // row 0: 2 elements
    {3, 4, 5, 6},     // row 1: 4 elements
    {7}               // row 2: 1 element
};

// 2. Declare with the number of rows only, then set the size of each row
int[][] sized = new int[3][];  // 3 rows, columns not set yet
sized[0] = new int[2];         // row 0 has 2 columns
sized[1] = new int[4];         // row 1 has 4 columns
sized[2] = new int[1];         // row 2 has 1 column

// Traverse: use each row's own length
for (int row = 0; row < jagged.length; row++) {
    for (int col = 0; col < jagged[row].length; col++) {
        System.out.print(jagged[row][col] + " ");
    }
    System.out.println();
}
```

---

### Run the Code (Module 6: Arrays)

#### Single-Dimensional Array

```java
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        System.out.println("=== 1. DECLARE AN ARRAY WITH ELEMENTS ===");
        int[] scores = {90, 85, 100, 75, 88};
        String[] fruits = {"Apple", "Banana", "Mango"};
        double[] prices = new double[]{19.5, 25.0, 40.75};
        System.out.println("scores: " + Arrays.toString(scores));
        System.out.println("fruits: " + Arrays.toString(fruits));
        System.out.println("prices: " + Arrays.toString(prices));

        System.out.println("\n=== 2. ACCESS AN ELEMENT ===");
        System.out.println("First score (scores[0]): " + scores[0]);
        System.out.println("Last score (scores[4]): " + scores[4]);
        String[] colors = {"Red", "Green", "Blue"};
        colors[1] = "Yellow";
        System.out.println("After colors[1] = \"Yellow\": " + Arrays.toString(colors));

        System.out.println("\n=== 3. GET THE LENGTH ===");
        System.out.println("scores.length: " + scores.length);
        System.out.println("fruits.length: " + fruits.length);
        System.out.println("Last index of scores: " + (scores.length - 1));

        System.out.println("\n=== 4. TRAVERSE USING A FOR LOOP ===");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "] = " + scores[i]);
        }

        System.out.println("\n=== 5. TRAVERSE USING A FOR-EACH LOOP ===");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\n=== 6. DECLARE AN ARRAY WITH A SPECIFIED SIZE ONLY ===");
        int[] numbers = new int[5];
        String[] names = new String[3];
        double[] amounts = new double[2];
        System.out.println("new int[5]:      " + Arrays.toString(numbers));
        System.out.println("new String[3]:   " + Arrays.toString(names));
        System.out.println("new double[2]:   " + Arrays.toString(amounts));
        numbers[0] = 10;
        numbers[4] = 50;
        System.out.println("After assigning: " + Arrays.toString(numbers));

        System.out.println("\n=== 7. ACCEPT VALUES USING SCANNER ===");
        Scanner input = new Scanner(System.in);
        int[] userValues = new int[3];
        for (int i = 0; i < userValues.length; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            userValues[i] = input.nextInt();
        }

        System.out.println("\n=== 8. TRAVERSE TO DISPLAY CONTENTS ===");
        for (int value : userValues) {
            System.out.print(value + " ");
        }
        System.out.println();
        input.close();
    }
}
```

**Output** (the user typed `10`, `20`, `30` when asked for values):
```
=== 1. DECLARE AN ARRAY WITH ELEMENTS ===
scores: [90, 85, 100, 75, 88]
fruits: [Apple, Banana, Mango]
prices: [19.5, 25.0, 40.75]

=== 2. ACCESS AN ELEMENT ===
First score (scores[0]): 90
Last score (scores[4]): 88
After colors[1] = "Yellow": [Red, Yellow, Blue]

=== 3. GET THE LENGTH ===
scores.length: 5
fruits.length: 3
Last index of scores: 4

=== 4. TRAVERSE USING A FOR LOOP ===
scores[0] = 90
scores[1] = 85
scores[2] = 100
scores[3] = 75
scores[4] = 88

=== 5. TRAVERSE USING A FOR-EACH LOOP ===
Apple
Banana
Mango

=== 6. DECLARE AN ARRAY WITH A SPECIFIED SIZE ONLY ===
new int[5]:      [0, 0, 0, 0, 0]
new String[3]:   [null, null, null]
new double[2]:   [0.0, 0.0]
After assigning: [10, 0, 0, 0, 50]

=== 7. ACCEPT VALUES USING SCANNER ===
Enter value 1: 10
Enter value 2: 20
Enter value 3: 30

=== 8. TRAVERSE TO DISPLAY CONTENTS ===
10 20 30 
```

#### Multi-Dimensional Array (2D)

```java
import java.util.Arrays;
import java.util.Scanner;

public class MultiArrayDemo {
    public static void main(String[] args) {

        System.out.println("=== 1. DECLARE A 2D ARRAY WITH ELEMENTS ===");
        // rows = students, columns = subjects
        int[][] grades = {
            {90, 85, 88},
            {78, 92, 80}
        };
        System.out.println("grades: " + Arrays.deepToString(grades));

        System.out.println("\n=== 2. ACCESS AN ELEMENT ===");
        System.out.println("grades[0][1]: " + grades[0][1]);
        System.out.println("grades[1][2]: " + grades[1][2]);
        int[][] table = {{1, 2}, {3, 4}};
        table[0][1] = 20;
        System.out.println("After table[0][1] = 20: " + Arrays.deepToString(table));

        System.out.println("\n=== 3. GET THE LENGTH ===");
        System.out.println("Rows (grades.length): " + grades.length);
        System.out.println("Columns (grades[0].length): " + grades[0].length);

        System.out.println("\n=== 4. TRAVERSE USING NESTED FOR LOOP ===");
        for (int row = 0; row < grades.length; row++) {
            for (int col = 0; col < grades[row].length; col++) {
                System.out.print(grades[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("\n=== 5. TRAVERSE USING NESTED FOR-EACH LOOP ===");
        for (int[] row : grades) {
            for (int grade : row) {
                System.out.print(grade + " ");
            }
            System.out.println();
        }

        System.out.println("\n=== 6. DECLARE A 2D ARRAY WITH A SPECIFIED SIZE ONLY ===");
        int[][] empty = new int[2][3];
        System.out.println("new int[2][3]: " + Arrays.deepToString(empty));

        System.out.println("\n=== 7. ACCEPT VALUES USING SCANNER ===");
        Scanner input = new Scanner(System.in);
        int[][] userMatrix = new int[2][3];
        for (int row = 0; row < userMatrix.length; row++) {
            for (int col = 0; col < userMatrix[row].length; col++) {
                System.out.print("Enter value for [" + row + "][" + col + "]: ");
                userMatrix[row][col] = input.nextInt();
            }
        }

        System.out.println("\n=== 8. TRAVERSE TO DISPLAY CONTENTS ===");
        for (int[] row : userMatrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
```

**Output** (the user typed `10`, `20`, `30`, `40`, `50`, `60` when asked for values):
```
=== 1. DECLARE A 2D ARRAY WITH ELEMENTS ===
grades: [[90, 85, 88], [78, 92, 80]]

=== 2. ACCESS AN ELEMENT ===
grades[0][1]: 85
grades[1][2]: 80
After table[0][1] = 20: [[1, 20], [3, 4]]

=== 3. GET THE LENGTH ===
Rows (grades.length): 2
Columns (grades[0].length): 3

=== 4. TRAVERSE USING NESTED FOR LOOP ===
90 85 88 
78 92 80 

=== 5. TRAVERSE USING NESTED FOR-EACH LOOP ===
90 85 88 
78 92 80 

=== 6. DECLARE A 2D ARRAY WITH A SPECIFIED SIZE ONLY ===
new int[2][3]: [[0, 0, 0], [0, 0, 0]]

=== 7. ACCEPT VALUES USING SCANNER ===
Enter value for [0][0]: 10
Enter value for [0][1]: 20
Enter value for [0][2]: 30
Enter value for [1][0]: 40
Enter value for [1][1]: 50
Enter value for [1][2]: 60

=== 8. TRAVERSE TO DISPLAY CONTENTS ===
10 20 30 
40 50 60 
```

---

### Part B: Strings

#### 1. What is a String?

**Definition:** A **String** is a sequence of characters (text) enclosed in **double quotes** `" "`, such as a name, a sentence, or a password. `String` is **not** a primitive data type. It is a **class** (a non-primitive / reference type), so a String variable holds an **object** and can use many built-in **methods** to work with text. Its default value is `null`. Strings are also **immutable**: once created, a String cannot be changed. Methods like `toUpperCase()` do not modify the original, they **return a new String**.

**Code Example:**
```java
String name = "Jareth";
String message = "Hello, World!";
```

#### 2. Create a String by String Literal

**Definition:** Assign text in double quotes directly to a variable. Java stores literals in a special memory area called the **String Pool**. If the same literal already exists in the pool, Java **reuses** it instead of creating a new object. This is the most common way to create a String.

**Code Example:**
```java
String s1 = "Java";
String s2 = "Java";   // reuses the same object from the String Pool

System.out.println(s1 == s2);  // true (same object)
```

#### 3. Create a String by `new` Keyword

**Definition:** Use the `new` keyword to create a String object. It **always creates a new object** in memory, even if the same text already exists. Because of this, two Strings with the same text are different objects, so `==` (which compares memory references) gives `false`. To compare the **text/content**, use `equals()`.

**Code Example:**
```java
String s3 = new String("Java");
String s4 = new String("Java");

System.out.println(s3 == s4);       // false (different objects)
System.out.println(s3.equals(s4));  // true (same text)

String s1 = "Java";
System.out.println(s1 == s3);       // false (pool object vs new object)
System.out.println(s1.equals(s3));  // true (same text)
```

---

### String Methods

The Java `String` class provides many methods to perform operations on text. In the examples below, `text` is `"Hello Java"` unless stated otherwise.

#### 1. `charAt()`

**Definition:** Returns the **character** at a given index. Like arrays, the first character is at index `0`. An index outside the valid range causes a `StringIndexOutOfBoundsException`.

**Code Example:**
```java
String text = "Hello Java";
System.out.println(text.charAt(0));  // H
System.out.println(text.charAt(6));  // J
```

#### 2. `length()`

**Definition:** Returns the **number of characters** in the String (spaces are counted too). Note the **parentheses**: for Strings it is `length()`, while for arrays it is `length` (no parentheses).

**Code Example:**
```java
System.out.println(text.length());  // 10
```

#### 3. `toLowerCase()`

**Definition:** Returns a new String with **all letters in lowercase**.

**Code Example:**
```java
System.out.println(text.toLowerCase());  // hello java
```

#### 4. `toUpperCase()`

**Definition:** Returns a new String with **all letters in uppercase**. The original String stays unchanged because Strings are immutable.

**Code Example:**
```java
System.out.println(text.toUpperCase());  // HELLO JAVA
System.out.println(text);                // Hello Java (unchanged)
```

#### 5. `equals()`

**Definition:** Compares the **content** of two Strings and returns `true` or `false`. It is **case-sensitive**. Use `equals()` instead of `==` to compare Strings.

**Code Example:**
```java
System.out.println("Java".equals("Java"));  // true
System.out.println("Java".equals("java"));  // false
```

#### 6. `equalsIgnoreCase()`

**Definition:** Compares the content of two Strings **ignoring uppercase/lowercase differences**.

**Code Example:**
```java
System.out.println("Java".equalsIgnoreCase("java"));  // true
```

#### 7. `concat()`

**Definition:** Joins (appends) one String to the end of another and returns the combined String. The `+` operator does the same thing.

**Code Example:**
```java
String first = "Hello";
String second = " World";
System.out.println(first.concat(second));  // Hello World
System.out.println(first + second);        // Hello World
```

#### 8. `contains()`

**Definition:** Checks if the String has a certain sequence of characters. Returns `true` or `false`. It is case-sensitive.

**Code Example:**
```java
System.out.println(text.contains("Java"));    // true
System.out.println(text.contains("Python"));  // false
```

#### 9. `endsWith()`

**Definition:** Checks if the String **ends with** the given text. Returns `true` or `false`.

**Code Example:**
```java
String fileName = "report.pdf";
System.out.println(fileName.endsWith(".pdf"));   // true
System.out.println(fileName.endsWith(".docx"));  // false
```

#### 10. `startsWith()`

**Definition:** Checks if the String **starts with** the given text. Returns `true` or `false`.

**Code Example:**
```java
System.out.println(text.startsWith("Hello"));  // true
System.out.println(text.startsWith("Java"));   // false
```

#### 11. `indexOf()`

**Definition:** Returns the **index of the first occurrence** of a character or text. If it is not found, it returns **`-1`**.

**Code Example:**
```java
System.out.println(text.indexOf("Java"));    // 6
System.out.println(text.indexOf('l'));       // 2 (first 'l' only)
System.out.println(text.indexOf("Python"));  // -1 (not found)
```

#### 12. `isEmpty()`

**Definition:** Returns `true` if the String has **no characters** (length is 0). A String with only a space is **not** empty.

**Code Example:**
```java
String empty = "";
String space = " ";
System.out.println(empty.isEmpty());  // true
System.out.println(space.isEmpty());  // false
System.out.println(text.isEmpty());   // false
```

#### 13. `trim()`

**Definition:** Returns a new String with the **leading and trailing spaces removed**. Spaces in the middle are kept.

**Code Example:**
```java
String messy = "   Java   ";
System.out.println("[" + messy + "]");         // [   Java   ]
System.out.println("[" + messy.trim() + "]");  // [Java]
```

#### 14. `replace()`

**Definition:** Returns a new String where every occurrence of a character (or text) is **replaced** with another one.

**Code Example:**
```java
System.out.println(text.replace('l', 'L'));          // HeLLo Java
System.out.println(text.replace("Java", "World"));   // Hello World
```

#### 15. `toCharArray()`

**Definition:** Converts the String into a **`char` array**, where each character becomes one element. This lets you use array features (like loops) on the characters.

**Code Example:**
```java
char[] letters = "Java".toCharArray();

for (char c : letters) {
    System.out.print(c + " ");  // J a v a
}
System.out.println(letters.length);  // 4
```

#### 16. `nextLine().charAt()`

**Definition:** The `Scanner` class has no method for reading a single `char`. To get one character from the user, read the whole line with `nextLine()` (which returns a String), then call `charAt(0)` on it to get the **first character**.

**Code Example:**
```java
Scanner input = new Scanner(System.in);
System.out.print("Enter your answer (Yes/No): ");
char firstLetter = input.nextLine().charAt(0);
System.out.println("First letter: " + firstLetter);
```

#### 17. `valueOf()`

**Definition:** A **static** method that converts a value of another data type (`int`, `double`, `boolean`, `char`, etc.) into a **String**. It is called on the `String` class itself: `String.valueOf(value)`.

**Code Example:**
```java
String fromInt = String.valueOf(100);       // "100"
String fromDouble = String.valueOf(3.5);    // "3.5"
String fromBoolean = String.valueOf(true);  // "true"

System.out.println(fromInt + 1);  // 1001 (it is text now, so 1 is joined, not added)
```

---

### Run the Code (Module 6: Strings)

```java
import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {

        System.out.println("=== 1. WHAT IS A STRING ===");
        String name = "Jareth";
        System.out.println("name = " + name);

        System.out.println("\n=== 2. CREATE BY STRING LITERAL ===");
        String s1 = "Java";
        String s2 = "Java";
        System.out.println("s1 = " + s1 + ", s2 = " + s2);
        System.out.println("s1 == s2: " + (s1 == s2));

        System.out.println("\n=== 3. CREATE BY NEW KEYWORD ===");
        String s3 = new String("Java");
        String s4 = new String("Java");
        System.out.println("s3 = " + s3 + ", s4 = " + s4);
        System.out.println("s3 == s4: " + (s3 == s4));
        System.out.println("s3.equals(s4): " + s3.equals(s4));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1.equals(s3): " + s1.equals(s3));

        System.out.println("\n=== STRING METHODS ===");
        String text = "Hello Java";

        System.out.println("\n--- 1. charAt() ---");
        System.out.println("text.charAt(0): " + text.charAt(0));
        System.out.println("text.charAt(6): " + text.charAt(6));

        System.out.println("\n--- 2. length() ---");
        System.out.println("text.length(): " + text.length());

        System.out.println("\n--- 3. toLowerCase() ---");
        System.out.println("text.toLowerCase(): " + text.toLowerCase());

        System.out.println("\n--- 4. toUpperCase() ---");
        System.out.println("text.toUpperCase(): " + text.toUpperCase());
        System.out.println("text after both calls: " + text);

        System.out.println("\n--- 5. equals() ---");
        System.out.println("\"Java\".equals(\"Java\"): " + "Java".equals("Java"));
        System.out.println("\"Java\".equals(\"java\"): " + "Java".equals("java"));

        System.out.println("\n--- 6. equalsIgnoreCase() ---");
        System.out.println("\"Java\".equalsIgnoreCase(\"java\"): " + "Java".equalsIgnoreCase("java"));

        System.out.println("\n--- 7. concat() ---");
        String first = "Hello";
        String second = " World";
        System.out.println("first.concat(second): " + first.concat(second));
        System.out.println("first + second: " + (first + second));

        System.out.println("\n--- 8. contains() ---");
        System.out.println("text.contains(\"Java\"): " + text.contains("Java"));
        System.out.println("text.contains(\"Python\"): " + text.contains("Python"));

        System.out.println("\n--- 9. endsWith() ---");
        String fileName = "report.pdf";
        System.out.println("fileName.endsWith(\".pdf\"): " + fileName.endsWith(".pdf"));
        System.out.println("fileName.endsWith(\".docx\"): " + fileName.endsWith(".docx"));

        System.out.println("\n--- 10. startsWith() ---");
        System.out.println("text.startsWith(\"Hello\"): " + text.startsWith("Hello"));
        System.out.println("text.startsWith(\"Java\"): " + text.startsWith("Java"));

        System.out.println("\n--- 11. indexOf() ---");
        System.out.println("text.indexOf(\"Java\"): " + text.indexOf("Java"));
        System.out.println("text.indexOf('l'): " + text.indexOf('l'));
        System.out.println("text.indexOf(\"Python\"): " + text.indexOf("Python"));

        System.out.println("\n--- 12. isEmpty() ---");
        String empty = "";
        String space = " ";
        System.out.println("empty.isEmpty(): " + empty.isEmpty());
        System.out.println("space.isEmpty(): " + space.isEmpty());
        System.out.println("text.isEmpty(): " + text.isEmpty());

        System.out.println("\n--- 13. trim() ---");
        String messy = "   Java   ";
        System.out.println("Before trim: [" + messy + "]");
        System.out.println("After trim:  [" + messy.trim() + "]");

        System.out.println("\n--- 14. replace() ---");
        System.out.println("text.replace('l', 'L'): " + text.replace('l', 'L'));
        System.out.println("text.replace(\"Java\", \"World\"): " + text.replace("Java", "World"));

        System.out.println("\n--- 15. toCharArray() ---");
        char[] letters = "Java".toCharArray();
        for (char c : letters) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println("letters.length: " + letters.length);

        System.out.println("\n--- 16. nextLine().charAt() ---");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your answer (Yes/No): ");
        char firstLetter = input.nextLine().charAt(0);
        System.out.println("First letter: " + firstLetter);
        input.close();

        System.out.println("\n--- 17. valueOf() ---");
        String fromInt = String.valueOf(100);
        String fromDouble = String.valueOf(3.5);
        String fromBoolean = String.valueOf(true);
        System.out.println("String.valueOf(100): " + fromInt);
        System.out.println("String.valueOf(3.5): " + fromDouble);
        System.out.println("String.valueOf(true): " + fromBoolean);
        System.out.println("fromInt + 1: " + (fromInt + 1));
    }
}
```

**Output** (the user typed `Yes` when asked for the answer):
```
=== 1. WHAT IS A STRING ===
name = Jareth

=== 2. CREATE BY STRING LITERAL ===
s1 = Java, s2 = Java
s1 == s2: true

=== 3. CREATE BY NEW KEYWORD ===
s3 = Java, s4 = Java
s3 == s4: false
s3.equals(s4): true
s1 == s3: false
s1.equals(s3): true

=== STRING METHODS ===

--- 1. charAt() ---
text.charAt(0): H
text.charAt(6): J

--- 2. length() ---
text.length(): 10

--- 3. toLowerCase() ---
text.toLowerCase(): hello java

--- 4. toUpperCase() ---
text.toUpperCase(): HELLO JAVA
text after both calls: Hello Java

--- 5. equals() ---
"Java".equals("Java"): true
"Java".equals("java"): false

--- 6. equalsIgnoreCase() ---
"Java".equalsIgnoreCase("java"): true

--- 7. concat() ---
first.concat(second): Hello World
first + second: Hello World

--- 8. contains() ---
text.contains("Java"): true
text.contains("Python"): false

--- 9. endsWith() ---
fileName.endsWith(".pdf"): true
fileName.endsWith(".docx"): false

--- 10. startsWith() ---
text.startsWith("Hello"): true
text.startsWith("Java"): false

--- 11. indexOf() ---
text.indexOf("Java"): 6
text.indexOf('l'): 2
text.indexOf("Python"): -1

--- 12. isEmpty() ---
empty.isEmpty(): true
space.isEmpty(): false
text.isEmpty(): false

--- 13. trim() ---
Before trim: [   Java   ]
After trim:  [Java]

--- 14. replace() ---
text.replace('l', 'L'): HeLLo Java
text.replace("Java", "World"): Hello World

--- 15. toCharArray() ---
J a v a 
letters.length: 4

--- 16. nextLine().charAt() ---
Enter your answer (Yes/No): Yes
First letter: Y

--- 17. valueOf() ---
String.valueOf(100): 100
String.valueOf(3.5): 3.5
String.valueOf(true): true
fromInt + 1: 1001
```

---

## Module 7: Math Class

**Definition:** The `Math` class is a built-in Java class (in the `java.lang` package, so **no import is needed**) that provides methods for common mathematical operations. All its methods are **static**, which means you call them directly on the class, like `Math.sqrt(16)`, without creating an object. It also provides two constants: `Math.PI` (3.14159...) and `Math.E` (2.71828...).

**Code Example:**
```java
System.out.println(Math.sqrt(16));  // 4.0
System.out.println(Math.PI);        // 3.141592653589793
```

### 1. `Math.abs()`

**Definition:** Returns the **absolute value** of a number (its distance from zero, so it is never negative).

**Code Example:**
```java
System.out.println(Math.abs(-15));   // 15
System.out.println(Math.abs(-3.5));  // 3.5
System.out.println(Math.abs(20));    // 20
```

### 2. `Math.max()`

**Definition:** Returns the **larger** of two values.

**Code Example:**
```java
System.out.println(Math.max(10, 25));  // 25
System.out.println(Math.max(-5, -2));  // -2
```

### 3. `Math.min()`

**Definition:** Returns the **smaller** of two values.

**Code Example:**
```java
System.out.println(Math.min(10, 25));  // 10
System.out.println(Math.min(-5, -2));  // -5
```

### 4. `Math.pow()`

**Definition:** Returns the first number **raised to the power** of the second: `Math.pow(base, exponent)`. It always returns a `double`.

**Code Example:**
```java
System.out.println(Math.pow(2, 3));    // 8.0  (2 x 2 x 2)
System.out.println(Math.pow(5, 2));    // 25.0
System.out.println(Math.pow(9, 0.5));  // 3.0  (a power of 0.5 is a square root)
```

### 5. `Math.sqrt()`

**Definition:** Returns the **square root** of a number. It always returns a `double`.

**Code Example:**
```java
System.out.println(Math.sqrt(16));  // 4.0
System.out.println(Math.sqrt(2));   // 1.4142135623730951
```

### 6. `Math.round()`

**Definition:** **Rounds** a decimal number to the **nearest whole number**. A value of `.5` or more rounds up (towards the larger number). It returns a `long` when given a `double`, and an `int` when given a `float`.

**Code Example:**
```java
System.out.println(Math.round(4.6));   // 5
System.out.println(Math.round(4.4));   // 4
System.out.println(Math.round(4.5));   // 5
System.out.println(Math.round(-4.5));  // -4 (rounds towards the larger number)
```

### 7. `Math.ceil()`

**Definition:** **Rounds up** to the next whole number (ceiling), towards the larger value. It returns a `double`.

**Code Example:**
```java
System.out.println(Math.ceil(4.1));   // 5.0
System.out.println(Math.ceil(-4.1));  // -4.0
```

### 8. `Math.floor()`

**Definition:** **Rounds down** to the previous whole number (floor), towards the smaller value. It returns a `double`.

**Code Example:**
```java
System.out.println(Math.floor(4.9));   // 4.0
System.out.println(Math.floor(-4.1));  // -5.0
```

### 9. `Math.random()`

**Definition:** Returns a random `double` that is **greater than or equal to `0.0` and less than `1.0`** (it never returns exactly `1.0`). To get a random whole number in a range, multiply, cast to `int`, and add the starting number:

`(int) (Math.random() * count) + min`

where `count` is how many numbers are in the range (for 1 to 6, the count is 6) and `min` is the lowest number.

**Code Example:**
```java
double randomValue = Math.random();                // e.g., 0.6957391538700064
int diceRoll = (int) (Math.random() * 6) + 1;      // random number from 1 to 6
int randomInRange = (int) (Math.random() * 50) + 1; // random number from 1 to 50
```

### 10. `Math.log()`

**Definition:** Returns the **natural logarithm** (base *e*) of a number.

**Code Example:**
```java
System.out.println(Math.log(Math.E));  // 1.0
System.out.println(Math.log(10));      // 2.302585092994046
```

### 11. `Math.log10()`

**Definition:** Returns the **logarithm base 10** of a number (the power you raise 10 to in order to get that number).

**Code Example:**
```java
System.out.println(Math.log10(100));   // 2.0 (10^2 = 100)
System.out.println(Math.log10(1000));  // 3.0 (10^3 = 1000)
```

### 12. `Math.exp()`

**Definition:** Returns **e raised to the power of x** (`e^x`), where *e* is about 2.71828.

**Code Example:**
```java
System.out.println(Math.exp(0));  // 1.0
System.out.println(Math.exp(1));  // 2.718281828459045
System.out.println(Math.exp(2));  // 7.38905609893065
```

### 13. `Math.sin()`

**Definition:** Returns the **sine** of an angle. The angle must be in **radians**, not degrees. Use `Math.toRadians(degrees)` to convert degrees to radians.

**Code Example:**
```java
System.out.println(Math.sin(0));                     // 0.0
System.out.println(Math.sin(Math.PI / 2));           // 1.0 (90 degrees)
System.out.println(Math.sin(Math.toRadians(90)));    // 1.0
```

### 14. `Math.cos()`

**Definition:** Returns the **cosine** of an angle in **radians**.

**Code Example:**
```java
System.out.println(Math.cos(0));        // 1.0
System.out.println(Math.cos(Math.PI));  // -1.0 (180 degrees)
```

### 15. `Math.tan()`

**Definition:** Returns the **tangent** of an angle in **radians**.

> **Note:** Trigonometric results can show tiny rounding errors because they are stored as `double` (like `0.9999999999999999` instead of `1.0`).

**Code Example:**
```java
System.out.println(Math.tan(0));            // 0.0
System.out.println(Math.tan(Math.PI / 4)); // 0.9999999999999999 (about 1.0, for 45 degrees)
```

---

### Mini App: Lotto Simulator (using `Math.random()`)

**Definition:** A lotto draw picks several numbers that must all be **unique** (no number appears twice). Since `Math.random()` can produce the same number more than once, the program must **check for duplicates** before saving each number. It combines what we learned: an array, `Math.random()`, loops, and `break`.

This simulator draws **6 unique numbers from 1 to 42** (a "6/42" lotto):
1. Generate a random number from 1 to 42.
2. Check the array to see if the number was already drawn.
3. If it is new, save it. If it is a duplicate, skip it and generate again.
4. Repeat until 6 unique numbers are saved.
5. Sort the numbers (`Arrays.sort()`) and display them.

**Code Example:**
```java
import java.util.Arrays;

public class LottoSimulator {
    public static void main(String[] args) {
        int totalNumbers = 6;   // how many numbers to draw
        int maxNumber = 42;     // numbers range from 1 to 42

        int[] lotto = new int[totalNumbers];
        int count = 0;          // how many unique numbers drawn so far

        while (count < totalNumbers) {
            int number = (int) (Math.random() * maxNumber) + 1;  // 1 to 42

            // check if the number was already drawn
            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (lotto[i] == number) {
                    isDuplicate = true;
                    break;
                }
            }

            // save the number only if it is unique
            if (!isDuplicate) {
                lotto[count] = number;
                count++;
            }
        }

        Arrays.sort(lotto);  // arrange from smallest to largest

        System.out.println("=== LOTTO SIMULATOR (6/42) ===");
        System.out.print("Winning numbers: ");
        for (int number : lotto) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
```

---

### Run the Code (Module 7)

#### Math Methods

```java
public class MathDemo {
    public static void main(String[] args) {

        System.out.println("=== 1. Math.abs() ===");
        System.out.println("Math.abs(-15): " + Math.abs(-15));
        System.out.println("Math.abs(-3.5): " + Math.abs(-3.5));
        System.out.println("Math.abs(20): " + Math.abs(20));

        System.out.println("\n=== 2. Math.max() ===");
        System.out.println("Math.max(10, 25): " + Math.max(10, 25));
        System.out.println("Math.max(-5, -2): " + Math.max(-5, -2));

        System.out.println("\n=== 3. Math.min() ===");
        System.out.println("Math.min(10, 25): " + Math.min(10, 25));
        System.out.println("Math.min(-5, -2): " + Math.min(-5, -2));

        System.out.println("\n=== 4. Math.pow() ===");
        System.out.println("Math.pow(2, 3): " + Math.pow(2, 3));
        System.out.println("Math.pow(5, 2): " + Math.pow(5, 2));
        System.out.println("Math.pow(9, 0.5): " + Math.pow(9, 0.5));

        System.out.println("\n=== 5. Math.sqrt() ===");
        System.out.println("Math.sqrt(16): " + Math.sqrt(16));
        System.out.println("Math.sqrt(2): " + Math.sqrt(2));

        System.out.println("\n=== 6. Math.round() ===");
        System.out.println("Math.round(4.6): " + Math.round(4.6));
        System.out.println("Math.round(4.4): " + Math.round(4.4));
        System.out.println("Math.round(4.5): " + Math.round(4.5));
        System.out.println("Math.round(-4.5): " + Math.round(-4.5));

        System.out.println("\n=== 7. Math.ceil() ===");
        System.out.println("Math.ceil(4.1): " + Math.ceil(4.1));
        System.out.println("Math.ceil(-4.1): " + Math.ceil(-4.1));

        System.out.println("\n=== 8. Math.floor() ===");
        System.out.println("Math.floor(4.9): " + Math.floor(4.9));
        System.out.println("Math.floor(-4.1): " + Math.floor(-4.1));

        System.out.println("\n=== 9. Math.random() ===");
        double randomValue = Math.random();
        int diceRoll = (int) (Math.random() * 6) + 1;
        int randomInRange = (int) (Math.random() * 50) + 1;
        System.out.println("Math.random(): " + randomValue);
        System.out.println("Dice roll (1-6): " + diceRoll);
        System.out.println("Random number (1-50): " + randomInRange);

        System.out.println("\n=== 10. Math.log() ===");
        System.out.println("Math.log(Math.E): " + Math.log(Math.E));
        System.out.println("Math.log(10): " + Math.log(10));

        System.out.println("\n=== 11. Math.log10() ===");
        System.out.println("Math.log10(100): " + Math.log10(100));
        System.out.println("Math.log10(1000): " + Math.log10(1000));

        System.out.println("\n=== 12. Math.exp() ===");
        System.out.println("Math.exp(0): " + Math.exp(0));
        System.out.println("Math.exp(1): " + Math.exp(1));
        System.out.println("Math.exp(2): " + Math.exp(2));

        System.out.println("\n=== 13. Math.sin() ===");
        System.out.println("Math.sin(0): " + Math.sin(0));
        System.out.println("Math.sin(Math.PI / 2): " + Math.sin(Math.PI / 2));
        System.out.println("Math.sin(Math.toRadians(90)): " + Math.sin(Math.toRadians(90)));

        System.out.println("\n=== 14. Math.cos() ===");
        System.out.println("Math.cos(0): " + Math.cos(0));
        System.out.println("Math.cos(Math.PI): " + Math.cos(Math.PI));

        System.out.println("\n=== 15. Math.tan() ===");
        System.out.println("Math.tan(0): " + Math.tan(0));
        System.out.println("Math.tan(Math.PI / 4): " + Math.tan(Math.PI / 4));
    }
}
```

**Output** (the values in section 9 are random, so they change every time you run the program):
```
=== 1. Math.abs() ===
Math.abs(-15): 15
Math.abs(-3.5): 3.5
Math.abs(20): 20

=== 2. Math.max() ===
Math.max(10, 25): 25
Math.max(-5, -2): -2

=== 3. Math.min() ===
Math.min(10, 25): 10
Math.min(-5, -2): -5

=== 4. Math.pow() ===
Math.pow(2, 3): 8.0
Math.pow(5, 2): 25.0
Math.pow(9, 0.5): 3.0

=== 5. Math.sqrt() ===
Math.sqrt(16): 4.0
Math.sqrt(2): 1.4142135623730951

=== 6. Math.round() ===
Math.round(4.6): 5
Math.round(4.4): 4
Math.round(4.5): 5
Math.round(-4.5): -4

=== 7. Math.ceil() ===
Math.ceil(4.1): 5.0
Math.ceil(-4.1): -4.0

=== 8. Math.floor() ===
Math.floor(4.9): 4.0
Math.floor(-4.1): -5.0

=== 9. Math.random() ===
Math.random(): 0.6957391538700064
Dice roll (1-6): 2
Random number (1-50): 4

=== 10. Math.log() ===
Math.log(Math.E): 1.0
Math.log(10): 2.302585092994046

=== 11. Math.log10() ===
Math.log10(100): 2.0
Math.log10(1000): 3.0

=== 12. Math.exp() ===
Math.exp(0): 1.0
Math.exp(1): 2.718281828459045
Math.exp(2): 7.38905609893065

=== 13. Math.sin() ===
Math.sin(0): 0.0
Math.sin(Math.PI / 2): 1.0
Math.sin(Math.toRadians(90)): 1.0

=== 14. Math.cos() ===
Math.cos(0): 1.0
Math.cos(Math.PI): -1.0

=== 15. Math.tan() ===
Math.tan(0): 0.0
Math.tan(Math.PI / 4): 0.9999999999999999
```

#### Lotto Simulator

Run the Lotto Simulator program from the Mini App section above.

**Output** (the numbers are different every time you run it, but they are always unique and sorted):

Run 1:
```
=== LOTTO SIMULATOR (6/42) ===
Winning numbers: 1 7 11 16 20 33 
```

Run 2:
```
=== LOTTO SIMULATOR (6/42) ===
Winning numbers: 2 6 17 23 28 35 
```
