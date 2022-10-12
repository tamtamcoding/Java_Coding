package udemyExercise;


public class methodChallange {
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + "you manage to get " + position);

    }
    public static int calculatePosition(int playerScore ){
        if(playerScore >= 1000){
            return 1;
        }else if (playerScore>=500 && playerScore<1000){
            return 2;
        }else if(playerScore>=200 && playerScore<500){
            return 3;
        }else
            return 4;
    }
    public static void main(String[] args) {
        String name;
        int position;
        int playerScore = calculatePosition(1000);
        displayHighScorePosition("Tam",playerScore);

         playerScore = calculatePosition(500);
        displayHighScorePosition("Tam",playerScore);

         playerScore = calculatePosition(300);
        displayHighScorePosition("Tam",playerScore);

         playerScore = calculatePosition(100);
        displayHighScorePosition("Tam",playerScore);


    }
}
