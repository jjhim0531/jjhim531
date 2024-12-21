console.log("Hello World");

/**
 * js의 변수 선언
 * 
 * 1) var - 사용하지 않는다.
 * 2) let 
 * 3) const
 */

var name = "최지원";
var age = 55;
var height = 190.7;
var isTrue = true;

var name = "김수민";
console.log(name + " " + age + " " + height + " " + isTrue) 

/**
 * let은 var에서 같은이름의 중복생성을 하지 못하게 만든 자료형이다.
 * 다만 let과 var는 모두 값을 변경하는 것은 가능하다.(재할당 가능)
 */

let name2 = "최지원";

name2 = "김수민";

/**
 * const는 상수를 표현하기위한 자료형
 * 값을 변경할 수 없음(재할당 불가능)
 */

const name3 = "최지원";

// name2 = "김지원";

/**
 * js네이밍 규칙
 * 
 * 변수이름 지을 때
 * 1) 일반적으로 영어를 사용하며 문자와 숫자 모두 사용할 수 있음
 * 2) 특수문자는 언더스코어와 달러를 사용할 수 있음
 * 3) 숫자로 시작하면 안됨
 * 4) 키워드를 변수명으로 사용하면 안됨
 * 
 * 네이밍 타입
 * 1) camelCase -> 대부분의 언어에서 많이 사용하며 단어의 시작마다 대문자로 구분해준다.
 * 2) snake_case -> 파이썬에서 주로 사용하며 단어의 시작마다 _로 구분해준다.
 * 3) PascalCase  -> c#및 ms계열의 언어에서 많이 사용하며 매단어 시작은 무조건 대문자로한다.
 */

let $name = "김민수"
let _name = "최민수"

 
/**
 * Data Types
 * 
 * 여섯개의 원시타입과 한개의 Object타입이 있다.
 * 
 * 1) Number
 * 2) String
 * 3) Boolean
 * 4) undefined
 * 5) null
 * 6) Symbol
 * 
 * 7)Object
 *   - Function
 *   - Array
 *   - Object
 * ...
 */

//Number 타입
const age2 = 55;
const tempature = -10
const pi = 3.14

// console.log(age2, tampature, pi)
console.log(typeof age2)
console.log(typeof tampature)
console.log(typeof pi)

console.log(typeof Infinity)
console.log(typeof -Infinity)


// String타입
const name4 = "최지원 66살"
const num1 = 55
console.log(num1 == "55")//타입변환을 허용하고 값만 비교
console.log(num1 === "55")//타입변환을 허용하지 않고 값과 타입을 모두 비교.
//(js에서는 가급적 === 사용하는 것을 권장.(정확한 비교))


console.log("안녕하세요 저는 최지원입니다. \n \t 나이는 51살입니다.")
/*
\n: 새 줄
\t: 탭
\\: 백슬래시 출력
\": 큰따옴표 출력
\': 작은따옴표 출력
*/


//Boolean 타입
const isTrue2 = true;
const isFalse = false;
console.log(typeof isTrue2)
console.log(typeof isFalse)

/**
 * undefined
 * 
 * 개발자가 직접 값을 초기화하지 않았을 때
 * 지정되는 값이다.(자동할당)
 * 
 * undefined를 직접 넣어주는 것은 지양해야한다.
 */

let num2;
console.log(num2 === undefined);

/**
 * null 타입
 * undefined와 동일하게 값이 없음을 표시
 * 다만 js에서는 개발자가 직접 명시적으로 없는 값을 초기화할 때 사용(의도적 사용)
 */

let init = null;
console.log(null);

if(!init){
    console.log("null이 아니다.")
}

/**
 * Symbol타입
 * 
 * 유일무이한 값을 생성할 때
 * 다른 원시값들과 다르게 Symbol함수를 호출해서 사용
 */

const tmp1 = '1';
const tmp2 = '1';
console.log(tmp1 === tmp2)// true (문자열은 값과 타입이 같으면 동일)

const symbol1 = Symbol('1');
const symbol2 = Symbol('1');
console.log(symbol1, symbol2)//Symbol(1) Symbol(1) (각각 고유한 Symbol)
console.log(symbol1 === symbol2)//false(같은 type(string)과 값을 가져도 서로 다른 symbol로 인식된다.)

/**
 * Object타입
 * 
 * 키 : 벨류 쌍으로 이루어져있다.
 * key : value
 */

const man = {
    name : "최지원",
    age : 47,
    address : "경기도",
    value : "강사",
    printInfo : function(){
        console.log(this.name + "입니다.")
        return "10";
    }
}

 man.value = "무직";//객체의 속성값은 언제든 변경가능하다.
  
 let func1 = man.printInfo();//"최지원입니다."가 출력되고, 함수의 반환값 "10"이 func1에 저장된다. func1의 값은 문자열 "10"이다.
 let func2 = man.printInfo;//man.printInfo를 호출하지 않고 참조만 한다.
 let value2 = func2();//func2는 man.printInfo를 참조하므로 value2와 func1의 결과는 동일.

console.log(typeof man);

/**
 * Array타입
 * 
 * 값을 리스트로 나열할 수 있는타입
 */

const arr1 = [];
arr1.push("빨간색");//배열명.push("추가할 값"); - 배열의 끝에 데이터 추가.
arr1.push("주황색");
arr1.push("파란색");
console.log(arr.pop());//arr.pop()의 결과는 "파란색"입니다.// pop후에 메서드 상태 = ["빨간색", "주황색"]
//즉 pop메서드는 배열의 마지막 요소 "파란색"을 제거하고, 그 제거된 값을 반환합니다.
//배열이 빈 상태에서 pop()을 호출하면 undefined를 반환합니다.
console.log(arr[0],arr[1])//["빨간색", "주황색"]

const arr2 = ["빨간색", "주황색", "파란색"];
//shift는 첫 번째 요소를 제거한 후, 그 제거된 값을 반환
console.log(arr2.shift()); // "빨간색" (첫 번째 요소 제거)
console.log(arr2);         // ["주황색", "파란색"] (나머지 배열)


let globalVar2 = "전역 변수 let";
console.log(window.globalVar2); // undefined
//let과 const는 var와 달리 전역 객체에 포함되지 않으며, 스코프가 더 제한적입니다.
//따라서, let과 const로 선언된 전역 변수는 window 객체의 속성이 되지 않습니다.
