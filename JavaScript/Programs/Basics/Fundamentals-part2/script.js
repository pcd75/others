/*
'use strict';

let hasDriverLic = flase;
const passTest = true;

if(passTest) hasDriversLic = true;
if(hasDriverLic) console.log('I can drive :D');

const interface = 'Audio';
const private = 123;
*/

/*
// function
function logger(){
    console.log('my name is nath');
}
// call running invoking function
logger();
logger();

function makeJuice(apples,oranges){
    console.log(apples, oranges);
    const juice = `Juice with ${apples} apples and ${oranges} oranges`;
    return juice;
}

const juice = makeJuice(5,4);
console.log(juice);
console.log(makeJuice(1,2));
makeJuice(8,0);
*/

/*
// function declaration
function calcAge(birthyear){
    return 2023 - birthyear;
}

const age1 = calcAge(1998);

const calcAge2 = function (birthyear){
    return 2023 - birthyear;
}

const age2 = calcAge2(1998);

console.log(age1, age2)
*/

/*
// arrow function
const calcAge3 = birthYear =>  2023 - birthYear;
const age3 = calcAge3(1998);
console.log(age3);

const years4Retirement = birthYear => {
    const age = 2023 - birthYear;
    const retirment = 65 - age;
    return retirment; 
}

console.log(years4Retirement(1998));
*/

/*
function cutFruit(fruit){
    return fruit * 4; 
}
function makeJuice(apples,oranges){
    const applePieces = cutFruit(apples);
    const orangPiece = cutFruit(oranges);
    
    console.log(apples, oranges);
    const juice = `Juice with ${applePieces} pieces of apple and ${orangPiece} pieces of oranges`;
    return juice;
}
console.log(makeJuice(3,4));

*/

// Arrays
/*
const friends = ['Rahul','Santosh','Amit'];
console.log(friends)

const years = new Array(1991,1992,1993);

console.log(friends[0]);

friends[2] = 'John'
console.log(friends)

const firstName = 'Adinath';
const Adinath = [firstName, 'Java Dev','2022-2042', 'pune',friends]
console.log(Adinath)

*/

/*const arr = ['asd','qwe','zxc']
console.log(arr)
const newValue = arr.push('mnb')
console.log(arr)
arr.unshift('abc')
console.log(arr)
arr.pop();
console.log(arr)
arr.shift();
console.log(arr)

*/

// object

/*
const jonasArray = [
    'jonas',
    'trainer',
    2000-2015,
    'usa',
    ['micheal','john','steve']
];

const jonas = {
     firstName: 'jonas',
     lastName: 'parker',
     job: 'trainer',
     age:2022-1998,
     loc: 'usa',
     friends: ['micheal','john','steve']
};

console.log(jonas)

const nameKey = 'Name';
console.log(jonas['first' + nameKey])
console.log(jonas['last' + nameKey])

const interestedIn = prompt('What do u know about jonas?')


if(jonas[interestedIn]){
    console.log(jonas[interestedIn])
}else{
    console.log('No such information avilable! choose other')
}

jonas.location = "CA";
jonas['twitter'] = '@jonasparker';
console.log(jonas)

*/

// object methods
/*
const jonas = {
    firstName: 'jonas',
    lastName: 'parker',
    birthyear: 1999,
    job: 'trainer',
    age:2022-1998,
    loc: 'usa',
    friends: ['micheal','john','steve'],

    calcAge: function (){
        console.log(this)
        return 2023 - this.birthyear;
    }
};

console.log(jonas.calcAge());
*/

// for loop

/*
for(let i=1;i<=10;i++){
    console.log(`Lifting weight ${i}`)
}
*/

const jonasArray = [
    'jonas',
    'trainer',
    2000-2015,
    'usa',
    ['micheal','john','steve']
];

const types = []

for(let i=0; i< jonasArray.length;i++){
    console.log(jonasArray[i], typeof jonasArray[i])
    types.push(typeof jonasArray[i])
}

console.log(types)

// continue and break
for(let i=0; i< jonasArray.length;i++){
    if(typeof jonasArray[i] !== 'string') continue;
    console.log(jonasArray[i], typeof jonasArray[i])
}

for(let i=0; i< jonasArray.length;i++){
    if(typeof jonasArray[i] === 'number') break;
    console.log(jonasArray[i], typeof jonasArray[i])
}

// while loop
let i = 1;
while(i<=10){
    console.log(i)
    i++
}






