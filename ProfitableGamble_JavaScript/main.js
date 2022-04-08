const profitableGamble = (prob, prize, pay) => {
  if (prob * prize > pay) {
    return true;
  } else {
    return false;
  }
};

console.log(profitableGamble(0.2, 50, 9));
