public class ExperiencePoints {

//    public static String getXP(int[] c) {
//        int veryEasy = c[0] * 5;
//        System.out.println(veryEasy);
//        int easy = c[1] * 10;
//        System.out.println(easy);
//        int medium = c[2] * 20;
//        System.out.println(medium);
//        int hard = c[3] * 40;
//        System.out.println(hard);
//        int veryHard = c[4] * 80;
//        System.out.println(veryHard);
//        String sum = Integer.toString(veryEasy + easy + medium + hard + veryHard);
//        System.out.println(sum);
//        return sum + "XP";
//
//    }

    public static String getXP(int[] c) {
        int sum = 0;
        int[] points = {5, 10, 20, 40, 80};
        String newSum = null;
        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i]);
            sum += (c[i] * points[i]);
            newSum = Integer.toString(sum);

        }
        return newSum;

    }

}
