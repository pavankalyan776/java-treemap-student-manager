# 🎓 TreeMap Student Management System

A Java application demonstrating efficient student data management using TreeMap with intelligent navigation features.

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=java&logoColor=white)
![Data Structures](https://img.shields.io/badge/TreeMap-Navigation-blue)
![Status](https://img.shields.io/badge/Status-Complete-green)

## 📖 Overview

This project showcases the power of TreeMap for maintaining sorted student records with fast lookup and navigation capabilities. Students are automatically sorted alphabetically, making data retrieval intuitive and efficient.

## ✨ Features

- **Automatic Sorting**: Students maintained in alphabetical order
- **Fast Navigation**: Find first, last, next, and previous students
- **Student Management**: Add, update, search, and remove operations
- **Status Tracking**: Monitor enrollment status (ENROLLED, UNDER-REVIEW, REJECTED)
- **Clean Interface**: Simple menu-driven application

## 🏗️ Project Structure

```
src/
├── Student.java          # Student data model
├── ListManager.java      # Core TreeMap operations
└── WaitingList.java      # Main application interface
```

## 🚀 Quick Start

```bash
# Clone and run
git clone https://github.com/yourusername/java-treemap-student-manager.git
cd java-treemap-student-manager
javac *.java
java WaitingList
```

## 💻 Usage

The application includes 8 operations accessible through a simple menu:

| Option | Function | Description |
|--------|----------|-------------|
| 1 | List Students | Show all students alphabetically |
| 2 | Find Student | Search by last name |
| 3 | Update Status | Change student enrollment status |
| 4 | Remove Student | Delete student record |
| 5 | Find First | Get alphabetically first student |
| 6 | Find Last | Get alphabetically last student |
| 7 | Find Next | Get next student after given name |
| 8 | Find Previous | Get previous student before given name |

### Sample Data
```java
students[0] = new Student(1, "Bill", "Jones", "UNDER-REVIEW");
students[1] = new Student(2, "John", "Smith", "UNDER-REVIEW");
students[2] = new Student(3, "Wally", "Wiggles", "ENROLLED");
// ... more students
```

## 🔧 Technical Implementation

### TreeMap Benefits
- **O(log n)** search, insert, and delete operations
- **Automatic ordering** by keys (student last names)
- **Navigation methods** for efficient traversal
- **Memory efficient** with balanced tree structure

### Key Methods
```java
// Navigation operations using TreeMap methods
findFirstStudent()     → studentsMap.firstEntry()
findLastStudent()      → studentsMap.lastEntry()
findNextStudent()      → studentsMap.higherEntry()
findPreviousStudent()  → studentsMap.lowerEntry()
```

## 🎯 What I Learned

Working on this project helped me understand:
- **TreeMap vs HashMap** trade-offs and when to use each
- **Red-Black Tree** implementation and self-balancing properties  
- **Algorithm complexity** and performance considerations
- **Clean code practices** with proper separation of concerns

## 🔮 Future Ideas

- Add GUI with JavaFX
- Implement data persistence
- Create REST API endpoints
- Add comprehensive unit tests
- Export functionality (CSV/PDF)

---

*This project represents my interest in data structures, algorithms, and building efficient solutions. I enjoy working with Java collections and exploring how different data structures can solve problems in unique ways.*

## 🤝 Connect With Me

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/pavan-kalyan-406251231/)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/pavankalyan776)
[![Email](https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:kadavakollupavankalyan@gmail.com)

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

<div align="center">

**⭐ If you found this project helpful, please give it a star! ⭐**

*Crafted with ❤️ for learning and demonstration purposes*

</div>
