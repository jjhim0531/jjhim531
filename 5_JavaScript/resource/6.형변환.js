/**
 * 형변환
 *
 * 1. 명시적
 * 2. 묵시적
 *
 */

let age = 45;

//명시적
let strAge = age.toString();
console.log(typeof strAge);

//묵시적
let tmp = age + "";
console.log(typeof tmp);

/*

    명시적 형변환
*/

console.log((100).toString());
console.log(true.toString());
console.log(Infinity.toString());

//숫자타입으로 변환
console.log(parseInt("0"));
console.log(parseFloat("3.14"));
console.log(+"0");

//boolean
console.log(!"true");
let isTrue = "false";
//문자열이 존재하기만 하면 true. 예를 들어 'false'라고 적혀있어도 true가 반환된다.

let member = {
  name: "jiwon",
};
console.log(member == { name: "jiwon" });
console.log({ name: "jiwon" } == { name: "jiwon" });
