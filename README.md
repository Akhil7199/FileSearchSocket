
# JSON File Search Over Network Using Socket Programming

Welcome to the repository for **JSON File Search Over Network** using **Java Socket Programming**. This project demonstrates how to search for a specific **case number** inside multiple JSON files located on a remote machine using a **server-client model**.

---

## Task 1: Server Implementation

### Description

The server runs on a **specific IP address and port** and listens for client requests. Upon receiving a request:

- It scans a specified directory for JSON files.
- Reads the content of each file.
- Searches for a case number using a regular expression.
- Sends the results back to the client.

### Key Learnings

- Gained proficiency in **Java Socket Programming** to enable client-server communication.
- Improved knowledge of **file I/O operations** and pattern matching using **regular expressions**.
- Enhanced understanding of handling multiple client connections using sockets.

---

## Task 2: Client Implementation

### Description

The client connects to the server using the specified **IP address and port**. It:

- Sends the directory path and case number to the server.
- Waits for the server’s response.
- Displays the name of the file where the case number was found or notifies the user if the case number was not found.

### Key Learnings

- Developed an understanding of **client-server architecture** using sockets.
- Learned to handle communication between client and server effectively.
- Improved error handling and data validation in network applications.

---

## Setup and Usage

### 📦 Prerequisites

Ensure you have the following installed:

- Java Development Kit (JDK) (version 11+ recommended).
- Basic knowledge of Java and socket programming.
- IDE or terminal to compile and run Java programs.

---



### 📥 Clone the Repository

```bash
git clone https://github.com/YOUR_GITHUB_USERNAME/json-file-search-socket.git
cd json-file-search-socket
```


---

### 🛠️ Compile the Code

```bash
javac FileServer.java
javac FileClient.java
```

---

### 🚀 Run the Server

```bash
java FileServer
```

The server will start listening on the specified IP (`10.0.10.31`) and port (`3344`).

---

### 📡 Run the Client

```bash
java FileClient
```

- The client will prompt for the directory path and the case number to search.
- Enter the required information, and the client will send the request to the server.

---

## How It Works

### 🔌 Server Workflow

1. The server listens on a **specific IP address and port** (`10.0.10.31:3344` by default).
2. It waits for client connections and accepts requests to search for a **case number**.
3. Upon receiving a request, it scans a specified directory for JSON files.
4. It reads the content of each file and searches for the case number using a regular expression.
5. If a match is found, the server sends the filename back to the client.
6. The connection is closed after sending the result.

### 🖥️ Client Workflow

1. The client connects to the server using the specified IP address and port.
2. It sends the directory path and the case number to the server.
3. It waits for the server’s response.
4. If the case number is found:

```
Case number found in file: example.json
```

5. If the case number is not found:

```
Case number not found in any file.
```

---

## Technologies Used

- **Backend**: Java Socket Programming, File I/O, Regular Expressions.
- **Communication**: TCP/IP for client-server interaction.
- **Data Parsing**: JSON file parsing using Java I/O.

---

## Project Directory Structure

```bash
├── FileServer.java
├── FileClient.java
└── README.md
```

---

## 📚 Future Enhancements

- Add support for searching multiple case numbers in a single request.
- Implement authentication for client-server communication.
- Enable parallel processing for faster file scanning.

---

## Author

**Your Name**  
LinkedIn: https://www.linkedin.com/in/akhil-kumar-9a882b235/

Feel free to explore the code and provide feedback or ask questions!



✅ **What’s Changed:**
- Structured sections with `## Task`, `## Setup`, and `## How It Works`.
- Added `## Project Directory Structure` for easy navigation.
- Clean and consistent formatting for a professional look.
- Followed the format of your original request to ensure consistency.

This version will look clean and professional on your GitHub repository! 🚀 Let me know if you need help with anything else! 😊



