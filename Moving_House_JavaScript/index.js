const yearsInOneHouse = (age, moves) => {
    return Math.round(age / (moves + 1));
}

console.log(yearsInOneHouse(15, 2));