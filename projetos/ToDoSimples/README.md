# 📝 To-Do List (Task Manager)

This is a simple **Task Manager** built using **HTML**, **CSS**, and **Vanilla JavaScript**. It allows users to:

- Add new tasks
- Mark tasks as completed
- Delete tasks
- Persist tasks using `localStorage`, so they are saved even after closing or refreshing the browser

---

## 🚀 Features

### ✅ Add Task
- Enter a task and click **"Add"**.
- Blank or whitespace-only tasks are not allowed.

### 🔁 Mark as Completed
- Click the ✅ icon to move a task from **Ongoing Tasks** to **Completed Tasks**.

### ❌ Delete Task
- Click the ❌ icon to delete a task from either list.

### 💾 Persistent Storage
- Tasks are automatically saved to your browser's localStorage.
- They persist across sessions without any backend.

---

## 📁 Project Structure

```
to-do-list/
├── index.html         # HTML structure
├── style.css          # CSS styling
└── scripts.js         # JavaScript logic
```

---

## 🧠 How It Works

1. **`addTask()`**: Adds a task to the ongoing list and updates localStorage.
2. **`completeTask()`**: Moves a task to the completed list.
3. **`deleteTask()`**: Deletes a task from either list.
4. **`saveTasks()`**: Saves the current state to localStorage.
5. **`loadTasks()`**: Loads saved tasks on page load.

---

## 💡 Requirements

No installation required. Simply open the `index.html` file in any modern browser.

---

## 📷 Screenshot (optional)

You can include a screenshot of your app:

```html
<img src="screenshot.png" width="600px" alt="App UI Example" />
```

---

## 📄 License

This project is open for educational and personal use.

---

## ✨ Future Improvements (Suggestions)

- Edit tasks
- Filter tasks by status or category
- Light/Dark theme toggle
- Backend integration (e.g., Firebase)

---

Made with ❤️ using Vanilla JavaScript!
