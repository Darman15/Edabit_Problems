//Given two arrays, which represent two sandwiches,
// return whether both sandwiches use the same type of bread.
// he bread will always be found at the start and end of the array.

//Given two arrays, which represent two sandwiches,
// return whether both sandwiches use the same type of bread.
// The bread will always be found at the start and end of the array.

public class Main {

    public static void main(String[] args) {

        String [] sandwichOne = {"White bread", "lettuce", "White bread"};
        String [] sandwichTwo = {"White bread", "tomato", "White bread"};

        System.out.println(Sandwiches.hasSameBread(sandwichOne, sandwichTwo));

    }
}
