/**
 * 클로저
 * 
 * "클로저는 어떤 함수와 해당 함수가 선언된 정적 환경의 조합이다."
 * 
 * "내부 함수에서 외부 함수의 변수를 사용할 때 우리는 클로저라고한다."
 * (상위 함수보다 하위함수가 더 오래 살아있는 경우)
 */

//전역변수 선언
let num = 5;
let num1 = 5;
let num2 = 5;
let num3 = 5;

//getNum은 inner 함수를 반환하며, 이 반환된 함수는 num에 대한 클로저를 생성합니다.
function getNum() {
    let num = 5; // `getNum` 함수의 지역 변수
    
    function inner() {
        num++; // `num` 값을 증가
        return num;
    }

    return inner; // `inner` 함수 반환
}


let run = getNum();

console.log(run()); // 6 -> `num`이 5에서 6으로 증가
console.log(run()); // 7 -> `num`이 6에서 7로 증가
console.log(run()); // 8 -> `num`이 7에서 8로 증가
console.log(run()); // 9 -> `num`이 8에서 9로 증가
console.log(run()); // 10 -> `num`이 9에서 10으로 증가
console.log(run()); // 11 -> `num`이 10에서 11로 증가

let run1 = getNum();
let run2 = getNum();

console.log(run1()); // 6 (새로운 `num` 변수 생성)
console.log(run1()); // 7
console.log(run2()); // 6 (새로운 `num` 변수 생성)
console.log(run2()); // 7



function out(outValue){
    function inner(innerValue){
        console.log("outValue : " + outValue)
        console.log("innerValue : " + innerValue)
    }

    return inner; 
}

const numOutFunk = out('외부함수');
numOutFunk('내부함수');


function getNumber(){
    let number = 5;

    function inner(){
        number++;
        return number;
    }

    return inner;
}

//변수선언을 해서 함수를 할당할 때 클로저가 생성된다. //그 후에 console.log에 변수를 넣어준다.
//console.log에 함수 자체를 넣어주면 매번 초기화되어서 한번밖에 사용못한다. 클로저의 의미가 없다.
let run3 = getNumber();
let run4 = getNumber();
let run5 = getNumber();

console.log("run3 :" + run3()); // run3 :6 (run3 클로저 안의 number는 5에서 1 증가하여 6)
console.log("run3 :" + run3()); // run3 :7 (run3 클로저 안의 number는 6에서 1 증가하여 7)
console.log("run3 :" + run3()); // run3 :8 (run3 클로저 안의 number는 7에서 1 증가하여 8)

console.log("run4 :" + run4()); // run4 :6 (run4 클로저 안의 number는 독립적으로 5에서 1 증가하여 6)
console.log("run4 :" + run4()); // run4 :7 (run4 클로저 안의 number는 6에서 1 증가하여 7)

console.log("run5 :" + run5()); // run5 :6 (run5 클로저 안의 number는 독립적으로 5에서 1 증가하여 6)
console.log("run5 :" + run5()); // run5 :7 (run5 클로저 안의 number는 6에서 1 증가하여 7)
console.log("run5 :" + run5()); // run5 :8 (run5 클로저 안의 number는 7에서 1 증가하여 8)
