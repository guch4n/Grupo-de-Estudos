document.addEventListener("DOMContentLoaded", loadTasks);

function addTask() {
    let inputValue = document.querySelector("input").value.trim();

    if (inputValue === "") {
        alert("Por favor, digite uma tarefa.");
        return;
    }

    let li = document.createElement("li");
    li.innerHTML = inputValue + 
        '<span onclick="completeTask(this)" class="checkButton">✅</span>' + 
        '<span onclick="deleteTask(this)" class="deleteButton">❌</span>';

    document.querySelector("ul.onGoing").appendChild(li);
    document.querySelector("input").value = '';

    saveTasks();
}

function deleteTask(span) {
    span.parentElement.remove();
    saveTasks();
}

function completeTask(span) {
    const taskText = span.parentElement.childNodes[0].textContent;

    let completedLi = document.createElement("li");
    completedLi.innerHTML = taskText + 
        '<span onclick="deleteTask(this)" class="deleteButton">❌</span>';

    document.querySelector("ul.concludes").appendChild(completedLi);
    span.parentElement.remove();

    saveTasks();
}

function saveTasks() {
    const ongoingTasks = Array.from(document.querySelectorAll("ul.onGoing li"))
        .map(li => li.childNodes[0].textContent);

    const completedTasks = Array.from(document.querySelectorAll("ul.concludes li"))
        .map(li => li.childNodes[0].textContent);

    localStorage.setItem("ongoingTasks", JSON.stringify(ongoingTasks));
    localStorage.setItem("completedTasks", JSON.stringify(completedTasks));
}

function loadTasks() {
    const ongoingTasks = JSON.parse(localStorage.getItem("ongoingTasks")) || [];
    const completedTasks = JSON.parse(localStorage.getItem("completedTasks")) || [];

    ongoingTasks.forEach(text => {
        let li = document.createElement("li");
        li.innerHTML = text + 
            '<span onclick="completeTask(this)" class="checkButton">✅</span>' + 
            '<span onclick="deleteTask(this)" class="deleteButton">❌</span>';
        document.querySelector("ul.onGoing").appendChild(li);
    });

    completedTasks.forEach(text => {
        let li = document.createElement("li");
        li.innerHTML = text + 
            '<span onclick="deleteTask(this)" class="deleteButton">❌</span>';
        document.querySelector("ul.concludes").appendChild(li);
    });
}