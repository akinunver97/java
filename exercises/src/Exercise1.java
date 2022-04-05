public class Exercise1 {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 500;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore +=1000;
            System.out.println("Your final score was " + finalScore);

        }
        //call with method
        if(gameOver){
            System.out.println("Following score is calculated by method named 'calculateScore'.");
            calculateScore(10000,8,500);
        }
    }


    public static void calculateScore(int score,int levelCompleted, int bonus){
        int finalScore = score + (levelCompleted*bonus);
        System.out.println("Your final score was " + finalScore);
    }


}
