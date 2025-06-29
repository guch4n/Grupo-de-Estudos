# 📝 To-Do List (Task Manager)

Este é um simples gerenciador de tarefas desenvolvido com **HTML**, **CSS** e **JavaScript puro**, que permite ao usuário:

- Adicionar tarefas pendentes
- Marcar tarefas como concluídas
- Excluir tarefas de ambas as listas
- Armazenar os dados localmente usando `localStorage`, garantindo que tarefas não se percam ao recarregar ou fechar a página

---

## 🚀 Funcionalidades

### ✅ Adicionar Tarefa
- Digite uma tarefa no campo de texto e clique em **"Add"**.
- Tarefas vazias ou com apenas espaços em branco não são permitidas.

### 🔁 Marcar como Concluída
- Clique no ícone ✅ ao lado de uma tarefa para movê-la da lista **Ongoing Tasks** para **Completed Tasks**.

### ❌ Excluir Tarefa
- Clique no ícone ❌ para remover permanentemente uma tarefa, esteja ela pendente ou concluída.

### 💾 Persistência com Local Storage
- Todas as tarefas são salvas automaticamente no navegador.
- Mesmo após fechar ou atualizar a página, suas tarefas permanecem salvas.

---

## 📁 Estrutura do Projeto
to-do-list/

├── index.html         # HTML structure

├── style.css          # CSS styling

└── scripts.js         # JavaScript logic


## 🧠 Como funciona

1. **`addTask()`**: Adiciona uma nova tarefa na lista "Ongoing Tasks" e atualiza o localStorage.
2. **`completeTask()`**: Move a tarefa para a lista "Completed Tasks".
3. **`deleteTask()`**: Remove uma tarefa de qualquer uma das listas.
4. **`saveTasks()`**: Salva as listas atuais em localStorage.
5. **`loadTasks()`**: Carrega as listas salvas do localStorage ao abrir a página.



## 💡 Requisitos

Nenhuma instalação necessária. Basta abrir o arquivo `index.html` em um navegador moderno.

---

## 📄 Licença

Este projeto é livre para uso educacional ou pessoal.

---

## ✨  Melhorias Futuras (sugestões)

- Edição de tarefas
- Filtros por categoria ou status
- Tema escuro/claro
- Integração com backend (Firebase, por exemplo)
