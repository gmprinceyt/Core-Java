// Remove Dublicate
const arr = [1, 1, 2, 3, 2, 3, 6, 7]; // -> [1,2,3,6,7];

function RemoveDublicate(arr) {
  const sort = arr.sort((a, b) => a - b); // [1,1,2,2,3,3,6,7]
  let i = 0;

  for (let j = 1; j < sort.length; j++) {
    if (arr[i] === arr[j]) {
      sort.pop(i);
    }
    i++;
  }

  return sort;
}

console.log(RemoveDublicate([...arr]));
