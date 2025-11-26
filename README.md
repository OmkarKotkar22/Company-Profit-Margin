<h1 align="center">
  💰 Company Profit Margin Calculator (Java OOP)
</h1>

<p align="center">
  A concise Java application designed to calculate and demonstrate the profit margin of a company. It utilizes Object-Oriented Programming (OOP) principles to model the company entity and the calculation logic separately.
</p>

---

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-007396?style=for-the-badge&logo=java" />
  <img src="https://img.shields.io/badge/Concept-Encapsulation%20%26%20Calculation-4169E1?style=for-the-badge" />
  <img src="https://img.shields.io/badge/repo%20size-5%20KB-32CD32?style=for-the-badge" /> 
  <img src="https://img.shields.io/badge/Last%20Commit-26/11/2025-FF69B4?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Type-Console%20Application-8A2BE2?style=for-the-badge" />
</p>

---


## 📌 **Key Features & OOP Concepts**

### **1. Dedicated Entity Model**
* The **`Company.java`** class models the business entity, likely holding financial data such as revenue and cost of goods sold (COGS).

### **2. Calculation Logic Separation**
* The **`Profit_Margin.java`** class contains the main execution logic, handling user input and performing the profit margin calculation using data from the `Company` object.

### **3. Encapsulation**
* Demonstrates encapsulation by keeping company financial data private and accessing it via defined methods, ensuring data integrity during calculation.

### **4. Financial Metrics**
* Calculates the profit margin percentage using the formula: $$\text{Profit Margin} = \left( \frac{\text{Revenue} - \text{COGS}}{\text{Revenue}} \right) \times 100$$

---

## 🛠 Tech Stack

### 💻 Core Technology
- <img src="https://img.icons8.com/color/30/java-coffee-cup-logo--v1.png" width="22" /> **Java** (JDK 8+)
- **OOP** (Object-Oriented Programming)

### 🧱 Architecture
- **Console Application** structure.

---

## 📂 **Project Folder Structure**

<p align="center">
  <img src="https://img.shields.io/badge/Structure-Standard%20Java%20Package-90EE90?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Package-src%2FMargin-FFA07A?style=for-the-badge" />
</p>

The project follows a standard Java structure, with the source code residing in the `src/Margin/` package.

| File Name | Description | Role |
| :--- | :--- | :--- |
| `Company.java` | Defines the company entity and holds financial data. | **POJO/Data Model** 🏢 |
| `Profit_Margin.java` | Contains the `main` method and logic for calculating and printing the margin. | **Driver/Main Logic** ⚙️ |

Company-Profit-Margin/  
│  
├── bin/  
│     └── Margin/  
│         ├── Company.class  
│         └── Profit_Margin.class  
│   
├── src/  
│     └── Margin/  
│         ├── Company.java  
│         └── Profit_Margin.java  
│  
├── .classpath  
└── .project    

---

## ⚙️ **Installation and Setup**

To run this project locally, you need a Java Development Kit (JDK) installed on your system.

### **1. Clone the repository**
```bash
git clone [Your Repository URL]
```
## Navigate to the source directory
```
cd Company-Profit-Margin/src/Margin
```
## Compile the Java files
```
javac FileName.java
```

## Execute the main application class
```
java FileName
```
