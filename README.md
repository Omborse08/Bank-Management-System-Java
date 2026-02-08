# Bank Management System (Core Java)

A console-based **Bank Management System** built using **Core Java** to deeply understand and practice **Object-Oriented Programming (OOP)** fundamentals.

This project was created without copying tutorials, focusing on **thinking-driven design**, clean separation of responsibilities, and real-world logic.

---

## 🚀 Features

- Create bank accounts with name and PIN
- Auto-generated unique Account ID
- Secure login using Account ID + PIN
- Deposit money with validation
- Withdraw money with balance and input checks
- View account balance
- Menu-driven console interface

---

## 🧠 OOP Concepts Used

- **Encapsulation**
  - Private fields
  - Controlled access via methods
- **Constructors**
  - Valid object creation
- **Separation of Concerns**
  - `BankAccount` → Entity (data + rules)
  - `BankAccountManager` → Manager (account storage & search)
  - `BankAccountFrontend` → UI (input/output handling)
- **Array of Objects**
- **Object collaboration**
- **Basic validation logic**

---

## 📁 Project Structure

src/
└── Bank/
├── BankAccount.java
├── BankAccountManager.java
└── BankAccountFrontend.java

yaml
Copy code

---

## ▶️ How to Run

1. Clone the repository
2. Compile all `.java` files
3. Run `BankAccountFrontend`
4. Follow the on-screen menu options

---

## 🔧 Future Improvements

- Replace arrays with `ArrayList`
- Add proper exception handling
- Improve PIN security (no direct exposure)
- Persist data using files or a database
- Refactor UI code for better readability

---

## 👤 Author

Built by **[Om Borse]** while learning Core Java and mastering OOP fundamentals.

---

## 📌 Note

This project focuses on **clarity of design and OOP thinking**, not on frameworks or UI.
