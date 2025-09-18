// Question Number 1;
// Ex- MOM === MOM -> true | a Words are some in reverse form
function isPalindrome(x) {
  return x < 0 ? false : x === +x.toString().split("").reverse().join("");
}

// Question Number 2;
// 0 1 1 2 3 5 8 13;
function Fibonacci(x) {
  if (x <= 1) return x;
  let a = 0;
  let b = 1;
  const fib = [];

  for (let i = 0; i < x; i++) {
    fib.push(a + b);
    let temp = b;
    b = a + b;
    a = temp;
  }
  return fib;
}
/** Example.
 * 0 + 1 -> 1
 * 1 + 1 -> 2
 * 1 + 2 -> 3
 * 2 + 3 -> 5
 * 3 + 5 -> 8
 */

// Question Number 3; Two Sum
function twoSum(arr, target) {
  for (let i = 0; i < arr.length; i++) {
    for (let j = i + 1; j < arr.length; j++) {
      if (arr[i] + arr[j] === target) return [i, j];
    }
  }

  return -1;
}
console.log(twoSum([1, 2, 4, 5, 6, 7], 10));


// Question Number 4 
function isAalgram(f,s){
    if (f.length !== s.length) return false;
    let a = f.split("").sort().join("");
    let b = s.split("").sort().join("");

    return a === b;
}
console.log(isAalgram("tac", "cat"))


