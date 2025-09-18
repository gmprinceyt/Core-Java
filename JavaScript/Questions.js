// const array = [2, 4, 6, 8, 10];

// Pairs in Array
// let count = 1;
// for (let i = 0; i < array.length; i++) {
//   for (let j = i + 1; j < array.length; j++) {
//     // Print Array Pairs
//     console.log(`Pair #${count} (${array[i]},${array[j]})`);
//     count++;
//   }
// }
// console.log("Total all Pairs: " + (array.length * (array.length - 1)) / 2);

// Print SubArrays
const array = [2, 4, 6, 8, 10];

for (let i = 0; i < array.length; i++){
  for (let j = i; j < array.length; j++){
    const sub = []
    for (let k = i; k <= j; k++){
      sub.push(array[k])
    };
    console.log(sub)
  }
}