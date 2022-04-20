const acceptIntoMovie = (age, isSupervised) => {
 if (age >= 15 || isSupervised) {
     return true;
 }
 return false;
}

console.log(acceptIntoMovie(16, false));