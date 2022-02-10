public class Challenge {

    public static int calculator(int num1, char operator, int num2) {
        int answer = 0;

        switch (operator) {
            case '+':
                answer =  num1 + num2;
                break;
            case '-':
                 answer =  num1 - num2;
                break;
            case '/':
                if (num2 == 0) {
                    answer = 0;
                } else {
                    answer = num1 / num2;
                }
               break;
            case '*':
               answer =   num1 * num2;
                break;
            default:
                break;
        }
        return answer;
    }
}
