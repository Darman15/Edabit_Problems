let arr = [1, 2, 3, 4, 5];

const drop = (arr, val) => {
  return arr.slice(val)
}

console.log(drop(arr, 1))