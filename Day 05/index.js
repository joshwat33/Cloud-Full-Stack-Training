//console.log("Hey there!!")
//variables
let a = 5;
let b= 6.7;

var c;

//console.log(a+b, c, a-b, a*b);
if(a>b){
    console.log("hi");
}else if(a<b){
    console.log("bye");
}else{
    console.log("lost");
}

// for(let i=0; i<5; i++){
//     console.log(i);
// }

let i=0;
while(i<5){
    i++;
}

do{
    i++;
}while(i<10);

//console.log(i);

let arr = [1,"sam",true, undefined, null, 90];
let arr2 = [2,3,4,5];

//arr.filter(e => e%2 == 0).forEach(e => console.log(e));
//arr.filter(e => typeof e==="number").map(e => e*2).forEach(e => console.log(e));

arr.sort();
console.log(arr.filter(e => (typeof e === "number")).reduce((acc,e) => {
    return acc+e;
},0));
console.log(...arr,...arr2);

//console.log(arr.indexOf("sam"));

// arr.forEach(function(e){
//     console.log(e);
// });

//arr.forEach(e => console.log(e));

// let s = function(a,b){
//     return a+b;
// }

let s = (a,b) => a+b;

//console.log(s(3,4));

if(typeof a==="number"){
    console.log("a is a number");
}

//typeof(a)
let obj = {
    name: "arun",
    role: "trainee",
    exp: null
}

console.log(obj)
console.log(obj.name)

let cal = {
    sum: (...e) => e.reduce((acc,e) => acc + e, 0),
    sub: (...e) => e.reduce((acc,e) => acc - e, 0),
    mul: (...e) => e.reduce((acc,e) => acc * e, 0),
    div: (...e) => e.reduce((acc,e) => acc / e, 0)
}

console.log("Sum: "+cal.sum(1,2));
// == (value)

// === (value and type)

// console.log(arr);
// for(let ele of arr){
//     console.log(ele); //gives elements
// }
// for(let ele in arr){
//     console.log(ele);  //gives indexes
// }

let a1=5;
function sum(a1=10,b){
    console.log(a1,b);
    return a1+b;
}

//console.log(sum(undefined,7));

//var a2 = 5;
function closure(){
    let a2;    
    //console.log(a2);
    function inner(){
        a2=5;
        console.log(a2);
    }
    inner();
    console.log(a2);

}

//closure();
let str = "Aaryan";

console.log(str.length);
console.log(str.toUpperCase());
console.log(str.includes("Aa"));

const con = 6;
console.log("This is my program "+a+", "+b+", "+con);
