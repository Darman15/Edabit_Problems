public class Main {

    public static void main(String[] args) {

       Person personOne = new Person("John", 21, 23000);
        Person personTwo = new Person("Steve", 32, 40000);
        Person personThree = new Person("Martin", 16, 2700);

        Person[] Persons = {personOne, personTwo, personThree};

        getBudgets(Persons);


    }

    public static double getBudgets (Person[] persons){
        double answer = 0;
        for (int i = 0; i < persons.length; i++) {
            answer += persons[i].getBudget();
        }
        System.out.println(answer);
       return answer;
    }
}
