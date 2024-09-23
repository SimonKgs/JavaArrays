public class Scores {

    public static void main(String[] args) {

        int[] scores = {8, 6, 2, 3, 4, 5, 10, 3, 8, 6};

        int total = 0;

        for (int score : scores){
            total += score;
        }


        System.out.printf("\n" +
                "The average of the students is %.2f", (total / (double)scores.length));



    }

}
