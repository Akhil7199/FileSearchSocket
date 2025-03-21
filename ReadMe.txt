Here's a clean and detailed `README.md` for your project:

---

# 📡 JSON File Search Over Network Using Socket Programming

This project demonstrates how to search for a specific **case number** inside multiple JSON files located on a remote machine using **socket programming** in Java. It consists of a **server-client model** where:

- The **server** runs on a remote machine and scans a specified directory for JSON files.
- The **client** connects to the server over a specified IP address and port, requests a search for a case number, and retrieves the results.

---

## 🚀 Why This Implementation?

In an enterprise or distributed environment where multiple servers store large amounts of data in JSON format, searching for specific information across multiple servers can be challenging. This project solves this problem by:

✅ Enabling **fast and secure** search over the network.  
✅ Reducing manual effort by automating file scanning and pattern matching.  
✅ Allowing seamless file access and search from different nodes within the same subnet.  

---

## 📚 How It Works

### 🖥️ Server Workflow

1. The server listens on a **specific IP address and port** (`10.0.10.31:3344` by default).
2. It waits for client connections and accepts requests to search for a **case number**.
3. Upon receiving a request, the server:
    - Reads the directory path and case number sent by the client.
    - Scans the specified directory recursively for JSON files.
    - Searches for the given **case number** using pattern matching.
    - Returns the names of all files where the case number is found.
4. The results are sent back to the client.

---

### 📡 Client Workflow

1. The client connects to the server over a specified **IP address and port**.
2. It sends the **directory path** and **case number** to the server.
3. It waits to receive a list of files where the case number is found.
4. The client prints the results or indicates if no match was found.

---

## 🛠️ Project Structure

```
/FileSearchSocket
├── /src
│   ├── /com/example/demo
│   │   ├── FileServer.java     // Server to scan directory and search case number
│   │   └── FileClient.java     // Client to connect and send search requests
├── /config
│   └── settings.properties    // Configuration file for IP, port, and directory
├── /data
│   └── sample.json            // Sample JSON files for testing
└── README.md                  // Detailed project documentation
```

---

## ⚙️ Technologies Used

- Java (Socket Programming)
- Regular Expressions (Pattern Matching)
- File I/O for reading JSON files
- Networking (TCP/IP communication)

---

## 📄 JSON File Format Example

Ensure that the JSON files have a consistent format, for example:

```json
{
  "caseNumber": "123",
  "name": "John Doe",
  "status": "Open"
}
```

The server looks for a **caseNumber** match based on the client request.

---

## 📥 How to Set Up and Run

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/FileSearchSocket.git
cd FileSearchSocket
```

---

### 2. Configure the Settings

Open the `config/settings.properties` file and modify the following parameters if needed:

```
server.ip=10.0.10.31
server.port=3344
search.directory=/opt/VIL/test/
```

- `server.ip` – The IP address of the server.
- `server.port` – The port on which the server listens.
- `search.directory` – The directory path containing JSON files.

---

### 3. Build the Project

Compile the Java files:

```bash
cd src/com/example/demo
javac FileServer.java FileClient.java
```

---

### 4. Run the Server

To run the server:

```bash
java com.example.demo.FileServer
```

The server will start and listen for incoming connections.

---

### 5. Run the Client

To run the client:

```bash
java com.example.demo.FileClient
```

You will be prompted to enter the directory path and case number:

```
Enter directory path: /opt/VIL/test/
Enter case number: 123
```

If a match is found, the client will receive and print the names of files that contain the case number.

---

## 🔥 How to Use

### Searching for Case Number

1. Launch the server on the remote machine where the JSON files are stored.
2. Run the client on your local machine or any other machine in the same network.
3. Provide the directory path and case number to the client.
4. The client will receive the list of matching files from the server.

---

## ⚡ Example Usage

### Case 1: Case Number Found

```
Enter directory path: /opt/VIL/test/
Enter case number: 123
Case number found in file: test1.json
Case number found in file: test3.json
```

### Case 2: Case Number Not Found

```
Enter directory path: /opt/VIL/test/
Enter case number: 999
Case number not found in any file.
```

---

## 🔐 Security Considerations

- Ensure that only trusted clients can connect to the server.
- Use a firewall to restrict access to the server’s port.
- Consider encrypting the data exchanged between the client and the server.

---

## 📝 Potential Use Cases

1. **Data Analytics Pipelines** – To scan large volumes of files for specific case numbers.
2. **File Integrity Checks** – Ensuring case records are consistent across multiple servers.
3. **Network Monitoring Tools** – Automate file scanning on remote nodes.

---

## 🧩 Troubleshooting

### Bind Exception
- Ensure that the IP address is correct.
- Verify that the port is not already in use.

### Connection Timeout
- Check the firewall settings.
- Confirm the server is running and accessible.

---

## 🎯 Future Enhancements

✅ Add multi-threading for handling multiple client requests simultaneously.  
✅ Support for different file formats (CSV, XML, etc.)  
✅ Implement secure data transmission using TLS/SSL.

---

## 🤝 Contributing

Contributions are welcome! Feel free to raise issues, submit pull requests, or suggest new features.

---

## 📧 Contact

For any questions or support, reach out at:

- 📧 Email: akhil7199@gmail.com

---

Happy coding! 🎉
