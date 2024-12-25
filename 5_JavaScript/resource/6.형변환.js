/**
 * 형변환
 * 
 * 1. 명시적
 * 2. 묵시적
 */

let age = 45;

// 명시적 형변환
let strAge = age.toString();
console.log(typeof strAge); // "string"

// 묵시적 형변환
let tmp = age + "";
console.log(typeof tmp); // "string"


/*
    명시적 형변환
*/

console.log((100).toString());     // "100"
console.log((true).toString());    // "true"
console.log((Infinity).toString()); // "Infinity"


//숫자타입으로 변환
console.log(parseInt('0'));     // 0
console.log(parseFloat('3.14')); // 3.14
console.log(+'0');              // 0


//boolean
console.log(!'true')//''이렇게만 적으면 false를 의미한다.
let isTrue = 'false';



let member = {
    name : "jiwon"
}

console.log(member == {name : "jiwon"})
//member 변수는 { name: "jiwon" }라는 객체를 참조하고 있습니다.
// { name: "jiwon" }라는 객체 리터럴은 새로운 객체를 생성합니다.
//두 객체는 동일한 내용을 가지고 있지만, 서로 다른 메모리 참조를 가지고 있으므로 false가 반환됩니다.

console.log({name : "jiwon"} == {name : "jiwon"})
//이 비교 역시 두 개의 독립적인 객체 리터럴을 비교합니다.
//각각 새로운 메모리 참조를 생성하므로 동일하지 않습니다.
//따라서 결과는 false입니다.

//* 객체의 내용이 같은지 비교하려면 JSON.stringify()를 사용하면된다.
console.log(JSON.stringify(member) == JSON.stringify({ name: "jiwon" })); 
// true
