let members = [
    "최지원",
    "김지원",
    "이지원",
    "박지원",
    "남궁지원"
]

//* push - 배열의 끝에 새로운 요소를 추가 후 배열의 새로운 길이 반환
console.log(members.push("신지원")) //6 

console.log(members)//["최지원", "김지원", "이지원", "박지원", "남궁지원", "신지원"]
let users = [];
let newUser = { id: 1, name: "John" };
users.push(newUser); // 데이터를 배열에 추가



//* splice(인덱스, 갯수) -> 원본에 영향을 준다(제거된 요소들을 반환한다.)
console.log(members.splice(2, 3))// 2번 인덱스부터 3개의 요소 제거["이지원", "박지원", "남궁지원"] // 제거된 요소
console.log(members)//["최지원", "김지원", "신지원"] // 제거 후 남은 배열

let arr = ["a", "d"];
arr.splice(1, 0, "b", "c"); // 1번 인덱스에 "b", "c" 삽입
console.log(arr); // ["a", "b", "c", "d"]


//* slice(인덱스, 마지막인덱스 - 1) -> 원본에 영향x
//array.slice(startIndex, endIndex); - endIndex를 생략하면 배열의 끝까지 추출.

console.log(members.slice(1, 5))// 1번 인덱스부터 4번 인덱스까지 반환// ["남궁지원", "신지원"] // 추출된 요소
console.log(members)//["최지원", "남궁지원", "신지원"] // 원본 배열 (변경 없음)


let arr1 = ["a", "b", "c", "d", "e"];
let sliced = arr1.slice(1, 4); // 1번 인덱스부터 3번 인덱스까지 추출
console.log(sliced); // ["b", "c", "d"]
console.log(arr1);    // ["a", "b", "c", "d", "e"] (원본 배열은 변하지 않음)

let arr2 = ["a", "b", "c", "d", "e"];
console.log(arr2.slice(2)); // ["c", "d", "e"] (2번 인덱스부터 끝까지 추출)

let arr3 = ["a", "b", "c", "d", "e"];
console.log(arr3.slice(-3, -1)); // ["c", "d"] (-3번 인덱스부터 -1번 직전까지 추출)

let students = ["Alice", "Bob", "Charlie", "David"];
let topStudents = students.slice(0, 2); // 상위 2명 추출
console.log(topStudents); // ["Alice", "Bob"]


console.log("-----------------------------------")


members = [
    "최지원",
    "김지원",
    "이지원",
    "박지원",
    "남궁지원"
]

let member2 = [
    ...members
]//...은 전체복사(얕은복사)를 의미

let choi = {
    name: "jiwon",
    age: 21,
    gender: "남",
}

choi = {
    ...choi,
    age: 20
}//같은 키가 이미 존재하면, 나중에 추가된 값으로 덮어씌워집니다.

let choi2 = {
    ...choi
}

console.log(choi2)
/*
출력결과
{
    name: "jiwon",
    age: 20,
    gender: "남"
}
*/

let original = { name: "Alice", age: 30 };
let copy = { ...original, age: 25 }; // age 속성을 업데이트
console.log(original); // { name: "Alice", age: 30 }
console.log(copy);     // { name: "Alice", age: 25 }


console.log("-----------------------------------------")

let nested = { name: "Alice", details: { age: 30 } };

// 얕은 복사
let shallowCopy = { ...nested };

// 참조가 동일하므로, 하나를 수정하면 다른 객체에도 영향을 줌
shallowCopy.details.age = 25;
console.log(nested.details.age); // 25


console.log("-----------------------------------------")

//* join() -> 배열을 문자열로 변경해줌
//array.join(separator); - 기본값은 쉼표(,)

console.log(member2.join()); // "최지원,김지원,이지원,박지원,남궁지원"
console.log(member2.join('/')); // "최지원/김지원/이지원/박지원/남궁지원"
console.log(member2.join(' ')); // "최지원 김지원 이지원 박지원 남궁지원"


//* sort()-> 배열을 문자열로 변경해줌
member2.sort();
console.log(member2)//유니코드 순서대로 정렬해줌 - "김지원", "남궁지원", "박지원", "이지원", "최지원"
console.log(member2.reverse())//반대로 뒤집어줌 - "최지원", "이지원", "박지원", "남궁지원", "김지원"

//숫자를 문자열로 변환하면 기본적으로 유니코드 순서로 정렬해준다.
let numbers = [10, 2, 1];
numbers.sort();
console.log(numbers); // [1, 10, 2] (유니코드 순서)


let numbers1 = [10, 5, 20, 15];
numbers1.sort((a, b) => a - b); // 오름차순
console.log(numbers1); // [5, 10, 15, 20]

numbers1.sort((a, b) => b - a); // 내림차순
console.log(numbers1); // [20, 15, 10, 5]

console.log("-----------------------------------------------------------")

let numbers3 = [1, 9, 7, 5, 3]
console.log(numbers3);

//a,b를 비교한다
// 1) a를 b보다 나중에 정렬하고 싶다면(뒤에두고 싶다면) 0보다 큰수를 반환 => 보통 1
// 2) a를 b보다 먼저 정렬하려면 (앞에두려면) 0보다 작은 숫자를 반환 => 보통 -1
// 3) 원래순서 유지하고 싶다면 0을 반환
numbers3.sort((a, b) => {
    // return a > b ? 1 : -1; //오름차순정렬
    return a < b ? 1 : -1; //내림차순정렬
});
console.log(numbers3);

console.log("-----------------------------------------------------------")
let people = [
    { name: "Alice", age: 25 },
    { name: "Bob", age: 20 },
    { name: "Charlie", age: 30 }
];

// 나이 기준 오름차순 정렬
people.sort((a, b) => a.age < b.age ? -1 : 1);
console.log(people);
// [
//     { name: "Bob", age: 20 },
//     { name: "Alice", age: 25 },
//     { name: "Charlie", age: 30 }
// ]

console.log("-----------------------------------------------------------")

//* map
//기존배열의 요소를 전부 반복하면서
//return된 값으로 새로운 배열을 만들어주는 함수
//기존의 배열을 이용해 새로운 배열을 만들어준다.
// let tmpMember = member2.map(function(m, i){return m;}) // [0,1,2,3,4]

let userList = [
    {
        userKey: 1,
        userName: "최지원",
        age: 22,
    }, {
        userKey: 2,
        userName: "김수민",
        age: 47,
    }, {
        userKey: 3,
        userName: "박지수",
        age: 35,
    }
]

let buyHistory = [
    {
        userKey: 2,
        productName: "TV",
        price: 50000
    }, {
        userKey: 2,
        productName: "모니터",
        price: 20000
    }, {
        userKey: 1,
        productName: "컴퓨터",
        price: 150000
    }, {
        userKey: 3,
        productName: "냉장고",
        price: 10000
    }, {
        userKey: 1,
        productName: "가습기",
        price: 7500
    },
]
 
/*
array.map((currentValue, index, array) => {
    // 작업 내용
});
*/

/*
array.map((currentElement, index) => {
    // currentElement는 배열의 현재 요소
    // index는 현재 요소의 인덱스
});

let buyHistory = [
    { userKey: 2, productName: "TV", price: 50000 },
    { userKey: 1, productName: "컴퓨터", price: 150000 }
];

let result = buyHistory.map((item, idx) => {
    return {
        ...item,
        index: idx + 1
    };
});

console.log(result);
//이런식으로 map의()은 원하는대로 변수명을 선언할 수 있다.

*/

buyHistory = buyHistory.map((history) => {
    for (const user of userList) {
        //user, userList도 원하는대로 선언가능하다.
        if (user.userKey === history.userKey) {
            return {
                ...user,
                ...history,
            }
        }
    }
})
console.log(buyHistory)
/* userkey를 기준으로 병합된 결과 반환
[
    { userKey: 2, userName: "김수민", age: 47, productName: "TV", price: 50000 },
    { userKey: 2, userName: "김수민", age: 47, productName: "모니터", price: 20000 },
    { userKey: 1, userName: "최지원", age: 22, productName: "컴퓨터", price: 150000 },
    { userKey: 3, userName: "박지수", age: 35, productName: "냉장고", price: 10000 },
    { userKey: 1, userName: "최지원", age: 22, productName: "가습기", price: 7500 }
]

*/
for (let user of userList) {
    user = { userKey: 99, userName: "테스트", age: 30 }; // 재할당
    console.log(user);
}
//user에  재할당을 하려면 let으로 선언.

//병합된 데이터에 **index**를 추가합니다.
buyHistory = buyHistory.map((h, i) => {
    return {
        ...h,
        index: i + 1, // i는 0부터 시작하므로, +1을 해서 1부터 시작하는 숫자를 만듦
    }
})

console.log(buyHistory)
/*
[
    { userKey: 2, userName: "김수민", age: 47, productName: "TV", price: 50000, index: 1 },
    { userKey: 2, userName: "김수민", age: 47, productName: "모니터", price: 20000, index: 2 },
    { userKey: 1, userName: "최지원", age: 22, productName: "컴퓨터", price: 150000, index: 3 },
    { userKey: 3, userName: "박지수", age: 35, productName: "냉장고", price: 10000, index: 4 },
    { userKey: 1, userName: "최지원", age: 22, productName: "가습기", price: 7500, index: 5 }
]

*/

console.log("-------------------------------------------------------")

// * filter
//array.filter(callback);
//callback : 각요소에 대해 실행할 함수
//return값이  배열에서 특정 조건에 맞는 요소만 추출하여 새로운 배열을 반환
//(false요소를 제외하고 true인 요소만 가져올 때)
let numbers2 = [1, 6, 7, 9, 10, 21];
let tmp2 = [];
// for(let n of numbers2){
//     if(n % 2 === 0) {
//         tmp2.push(n);
//     }
// }
tmp2 = numbers2.filter(n => n % 2 === 0);
console.log(tmp2); // [6, 10]



//내가 삭제하고자하는게 userKey === 2인 것
buyHistory = buyHistory.filter(h => h.userKey !== 2)
console.log(buyHistory)
/*
[
    { userKey: 1, productName: "컴퓨터", price: 150000 },
    { userKey: 3, productName: "냉장고", price: 10000 },
    { userKey: 1, productName: "가습기", price: 7500 }
]
*/

//* find()
// return되는 조건에 값이 true인 첫 요소를 반환
// 모든요소가 조건에 부합하지 않는다면(false를 리턴한다면) undefind를 반환
console.log(tmp2.find(function (n) {
    return n % 2 === 0;
}));

//* findIndex();
// return되는 조건에 값이 true인 첫 요소의 인덱스를 반환
// 모든요소가 조건에 부합하지 않는다면(false를 리턴한다면) -1을 반환
console.log(tmp2.findIndex(function (n) {
    return n % 2 === 1;
}));
