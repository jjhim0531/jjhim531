/*
    Scope
    변수나 함수가 접근할 수 있는 유효범위
*/

var number1 = 20;//전역변수

function test1(){
    console.log(number1);//20
}

//test1();

function test2(){
    var number1 = 40;//지역변수
    console.log(number1);//40
}

//test2();

var number1 = 20;

function test3(){
    var number1 = 40;
    test4();
    console.log("number1 : " + number1);// number1 : 40  - test3에서 지역 변수 출력
   
    
}

function test4(){
    var number2 = 11;
    console.log("number1 : " + number1);//number1 : 20  - test4에서 전역 변수 출력
    console.log("number2 : " + number2);// number2 : 11  - test4에서 지역 변수 출력
   
}

test3();
console.log(number1); //20  - 전역 변수 출력


/*
    JS -> Lexical Scope
    선언된 위치가 상위 스코프를 정한다.

    Dynamic Scope
    실행한 위치가 상위 스코프를 정한다.
*/

// var i = 1000;
// for(var i = 0; i < 10; i++){
//     console.log(i);
// }
// console.log("i = " + i);//i=10
//var의 스코프는 함수 스코프입니다.
//for 루프 내부에서 var i를 선언하면, 이는 루프 외부에서도 같은 변수로 간주됩니다.
//따라서, var i = 1000 선언은 for 루프에서 var i에 의해 덮어씌워집니다.
//for 루프가 종료되면, i는 마지막 증가 값인 10을 갖게 됩니다.=> 사용 비추천
 
let i = 1000;
for(let i = 0; i < 10; i++){
    console.log(i);//i=10
}
console.log("i = " + i);//i=1000
//**let은 블록 스코프(Block Scope)**를 가집니다.
//for 루프 내부의 let i는 루프 내부에서만 유효합니다.
//루프 외부의 let i = 1000은 별도의 변수로 동작합니다.
//for 루프가 종료되더라도, 외부의 i는 영향을 받지 않습니다. 따라서 i = 1000이 출력됩니다.=> 사용 추천