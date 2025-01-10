let todoList = localStorage.getItem("todoList") ?
    JSON.parse(localStorage.getItem("todoList")) : [];

//로컬 스토리지는 브라우저에서 제공하는 데이터 저장소로, 문자열(String) 형태로 데이터를 저장하고 관리할 수 있습니다.

//localStorage.getItem("todoList") 불러온 데이터는 JSON 형식의 문자열로 반환됩니다.

//JSON.stringify(객체 | 배열) -> 객체, 배열을 string(JSON 형식의 문자열)으로 변환
//JSON.parse(변환된문자열) -> 문자열 데이터를 원래의 JavaScript 객체, 배열로 변경

//localStorage.setItem("키", "벨류") -> localStorage영역에 key, value형태로 데이터 저장
//key: 데이터를 저장할 때 사용하는 이름(여기서는 'todoList').
//value: 저장할 데이터(문자열 형태, 여기서는 JSON.stringify(todoList)의 결과).

//localStorage.getItem("키") -> localStorage영역에 데이터를 key로 불러오는 것

window.onload = function () {
    drawTodoList();
}

//할일을 todoList에 넣기
function addTodo() {
    //input요소 가져오기
    const searchInput = document.querySelector("#search-bar input");

    //새로운 객체를 todoList 배열에 추가합니다.
    todoList.push({
        title: searchInput.value,//사용자가 입력한 텍스트를 가져옵니다.
        date: new Date().getTime(),//"현재 시간(유일한 식별자)" - 반환값은 항상 숫자 형태이며, 유일성을 보장
        isDone: false// // 완료 여부
    });

    localStorage.setItem('todoList', JSON.stringify(todoList));
    //로컬 스토리지에 todoList라는 이름의 배열을 JSON 문자열로 변환(JSON.stringify()) 후 로컬 스토리지에 저장합니다.

    searchInput.value = "";
    drawTodoList();
}

//할일목록을 ui에 나타내기
function drawTodoList() {

    // todoUl =  클래스가 .todo-list인 첫 번째 요소를 선택한 객체
    const todoUl = document.querySelector(".todo-list");
    console.log(todoUl); // <ul class="todo-list"></ul>
    todoUl.innerHTML = "";
    //새로 추가되거나 삭제된 항목을 반영하기 위해 기존 목록을 지우고 배열의 모든 항목을 다시 렌더링합니다.


    for (let todo of todoList) {
        const todoLi = document.createElement('li')    //<ul> 요소에 자식 요소(<li>)를 추가
                                                        // <li></li>
                                                        
        todoLi.innerText = todo.title;                 // <li>숙제하기</li>
        todoLi.className = todo.isDone ? 'done' : '';  //완료된 항목은 클래스 "done"을 추가하여 스타일 변경.
        todoUl.appendChild(todoLi);

        //todoLi를 클릭하면, 해당 항목(todo)을 매개변수로 전달하여 toggleStatus() 함수가 실행되어 isDone 상태가 반전됩니다.
        todoLi.onclick = function () {
            toggleStatus(todo);
        }

        const removeBtn = document.createElement('div');// <div></div>생성
        removeBtn.className = 'todo-remove-btn';
        removeBtn.innerHTML = '<i class="fa-solid fa-x"></i>';
        todoLi.appendChild(removeBtn);

        //x 버튼 클릭 시 removeTodo() 함수 실행.
        removeBtn.onclick = function () {
            removeTodo(todo)
        }
    }

    //targetTodo는 클릭된 항목(즉, todoLi에 연결된 todo 객체)입니다.
    const toggleStatus = function (targetTodo) {
        // 1. 완료 상태 반전
        //.map => todoList 배열을 순회하면서, 클릭된 항목(targetTodo)과 동일한 항목(t)을 찾습니다.
        //비교 조건:
            //t.date === targetTodo.date: 날짜(고유 식별자)가 같은지 확인.
            //t.title === targetTodo.title: 제목도 같은지 확인.
        todoList = todoList.map(function (t) {
            if (t.date === targetTodo.date && t.title === targetTodo.title) {
                t.isDone = !t.isDone;
            }
            return t;
        });

        // 2. 로컬 스토리지 업데이트
        localStorage.setItem('todoList', JSON.stringify(todoList));

        // 3. UI 갱신
        drawTodoList();
    };


    //숙제하기, 1725582055367
    const removeTodo = function (removeTodo) {
        //.filter - filter를 사용해 배열에서 특정 조건에 해당하는 항목만 제외. 원본 배열을 변경하지 않음.
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