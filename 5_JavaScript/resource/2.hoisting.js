/**
 * Hoisting
 */
var name;
let name3;

console.log(name); // undefined (변수 선언은 호이스팅되지만 값 할당은 호이스팅되지 않으므로 나중에 수행됨)
var name = "jiwon";
console.log(name); // jiwon


/**
 * Hoisting은 뭘까?
 * 
 * 모든 변수 선언문이 코드의 최상단으로 이동되는 것처럼 느껴지는 현상
 * var(tdz없음)와 다르게 let과 const는
 * tdz(Temporal Dead Zone(임시 사각지대))를 이용하여
 * 마치 호이스팅이 일어나지 않은 것처럼 동작하게 해준다.
 * (선언 이전에 변수를 사용할 경우 ReferenceError가 발생. 
 * 즉, 선언 전에 변수에 접근하는 것을 방지해 코드의 안전성을 높임)
 * 
 */
/*
*tdz - 스코프의 시작부터 변수 선언이 실제로 실행될 때까지의 구간
*/

console.log(name2); // ReferenceError: Cannot access 'name2' before initialization
let name2 = "jiwon";
console.log(name2); // jiwon
