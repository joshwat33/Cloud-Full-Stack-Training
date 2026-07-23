// greet();
// function greet(){
//     console.log("Good morning!!");
// }

// function start(func){
//     func();
// }

// start(greet);
// console.log(a);
//let a = 5;
//console.log(a);

// const c = setTimeout(() => {
//     console.log("Hey joshwa")
// },1000);
// clearTimeout(c);
// let count = 0;
// const d = setInterval(() => {
//     console.log("Hi there")
//     count++;
//     if(count>5){
//         clearInterval(d);
//     }
// }, 1000);
// console.log("Hey bro!!");

function getData(){
    return new Promise((resolve,reject) => {
        setTimeout(() => {
            if(1==1){
                resolve("Data received");
            }else{
                reject("Data rejected");
            }
        },1000)
    })
}

getData().then(data => console.log(data)).catch(err => console.log(err));

// fetch("https://jsonplaceholder.typicode.com/todos/1")
//     .then(res => res.json())
//     .then(data => console.log(data))
//     .catch(err => console.log(err));

fetch("https://jsonplaceholder.typicode.com/todos")
    .then(res => res.json())
    .then(data => data.filter(d => d.completed == true))
    .then(data => console.log(data.reduce((acc,curr) => acc + curr.id, 0)))
    .catch(err => console.log(err));