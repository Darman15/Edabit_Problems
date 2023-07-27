public class Main {
    public static void main(String[] args) {

        int[] nums = {-24,-29,-92,-11,-17};

        secondLargest(nums);
    }

    public static int secondLargest(int[] num) {
        int largest = Integer.MIN_VALUE + 1;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
            for (int j = 0; j < num.length; j++) {
                if (num[j] > secondLargest && num[i] > num[j]) {
                    secondLargest = num[j];
                }
            }

        }
        return secondLargest;
    }
}