package udemyExercise.controlFlow;

public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        int totalBig = bigCount * 5;
        int total = totalBig + smallCount;
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        else if(goal == 4){
            return true;
        }
        else if((totalBig % goal) == 0){
            return true;
        }
        else if(total >= goal){
            return true;
        }
        return false;
    }
}
