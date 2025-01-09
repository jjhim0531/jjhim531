let todoList = localStorage.getItem("todoList") ? 
                JSON.parse(localStorage.getItem("todoList")) : [];

 //localStorage.getItem("todoList") 불러온 데이터는 JSON 형식의 문자열로 반환됩니다.

//JSON.stringify(객체 | 배열) -> 객체, 배열을 string으로 변환
//JSON.parse(변환된문자열) -> 문자열 데이터를 원래의 JavaScript 객체, 배열로 변경

//localStorage.setItem("키", "벨류") -> localStorage영역에 key, value형태로 데이터 저장
//localStorage.getItem("키") -> localStorage영역에 데이터를 key로 불러오는 것

window.onload = function(){
    drawTodoList();
}

//할일을 todoList에 넣기
function addTodo(){
    //input요소 가져오기
    const searchInput = document.querySelector("#search-bar input");

    //새로운 객체를 todoList 배열에 추가합니다.
    todoList.push({
        title : searchInput.value,//사용자가 입력한 텍스트를 가져옵니다.
        date : new Date().getTime(),//"현재 시간(유일한 식별자)" - 반환값은 항상 숫자 형태이며, 유일성을 보장
        isDone : false// // 완료 여부
    });

    localStorage.setItem('todoList', JSON.stringify(todoList));
    //todoList 배열을 JSON 문자열로 변환(JSON.stringify()) 후 로컬 스토리지에 저장합니다.

    searchInput.value = "";
    drawTodoList();
}

//할일목록을 ui에 나타내기
function drawTodoList(){
    
    const todoUl = document.querySelector(".todo-list");
    todoUl.innerHTML = "";

    for(let todo of todoList){
        const todoLi = document.createElement('li')    // <li></li>
        todoLi.innerText = todo.title;                 // <li>숙제하기</li>
        todoLi.className = todo.isDone ? 'done' : '';  //완료된 항목은 클래스 "done"을 추가하여 스타일 변경.
        todoUl.appendChild(todoLi);

        //클릭하면 toggleStatus() 함수가 실행되어 isDone 상태가 반전됩니다.
        todoLi.onclick = function(){
            toggleStatus(todo);
        }

        const removeBtn = document.createElement('div');
        removeBtn.className = 'todo-remove-btn';
        removeBtn.innerHTML = '<i class="fa-solid fa-x"></i>';
        todoLi.appendChild(removeBtn);
    
        //x 버튼 클릭 시 removeTodo() 함수 실행.
        removeBtn.onclick = function(){
            removeTodo(todo)
        }
    }

    const toggleStatus = function(targetTodo){
        todoList = todoList.map(function(t){
            if (t.date === targetTodo.date && t.title === targetTodo.title) {
                t.isDone = !t.isDone;
            }
            return t;
        })
        localStorage.setItem('todoList', JSON.stringify(todoList));
        drawTodoList();
    }

    //숙제하기, 1725582055367
    const removeTodo = function(removeTodo){
        todoList = todoList.filter(t => !(t.date === removeTodo.date && removeTodo.title === t.title))
        localStorage.setItem('todoList', JSON.stringify(todoList));
        drawTodoList();
    }

    

}






















/*
function addTodo(){
    const searchInput = document.querySelector("#search-bar input")

    const todoLi = document.createElement('li') // <li></li>
    todoLi.innerText = searchInput.value;// <li>밥먹기</li>

    const removeBtn = document.createElement('div');
    removeBtn.className = 'todo-remove-btn';
    removeBtn.innerHTML = '<i class="fa-solid fa-x"></i>';
    todoLi.appendChild(removeBtn);

    removeBtn.onclick = function(){
        $(this.parentNode).remove();
    }

    const todoUl = document.querySelector(".todo-list");
    todoUl.appendChild(todoLi);
}
*/