let var1 = 9;
let var2 = 9;
//Equal ===
console.log(var1 === var2)
//NotEqual !=
console.log(var1 != var2)
//Greater than
console.log(var1 > var2)
//Less than
console.log(var1 < var2)
//Greater than equal to
console.log(var1 >= var2)
//Less than equal to
console.log(var1 <= var2)

//let num1 = 100;
//let num2 = 1000;
 
//let result = (num1 < num2) ? "yay" : "nay";
 
//console.log(result);

//IF_ELSE

let num1 = 314;
let num2 = 314;
if(num1<num2)
{
    console.log('Num1 is less than Num2');
}
else if (num1>num2)
{
    console.log('Num1 is greater than Num2');
}
else {
    console.log('Num1 is Equal to Num2');
}

//========================FOR=======================

for (var i = 1000; i <= 100; i += 2)
{
    console.log("This is position for I: " + i);
}
 
var j = 1000;
 
while (j <= 100)
{
    console.log("This is position for J: " + j);
    j += 2;
}
 
var k = 1000;
 
do
{
    console.log("This is position for K: " + k);
    k += 2;
} while (k <= 100)
let awesomeVar = 0;


//==========================SWITCH========================

switch (awesomeVar)
{
    case 0:
    console.log("This is 0");
    break;
 
    case 1:
    console.log("This is 1");
    break;
 
    case 2:
    console.log("This is 2");
    break;
 
    case 3:
    console.log("This is 3");
    break;
 
    case 4:
    console.log("This is 4");
    break;
 
    case 5:
    console.log("This is 5");
    break;
 
    default:
    console.log("This is the default value");
    break;
}