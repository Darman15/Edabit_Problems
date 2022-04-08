const footballPoints = (wins, draws, losses) => {
  return wins * 3 + draws * 1;
};

console.log(footballPoints(3, 4, 2));
