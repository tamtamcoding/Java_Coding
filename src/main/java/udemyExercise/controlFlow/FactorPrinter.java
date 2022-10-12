package udemyExercise.controlFlow;

public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(10);
    }
    public static void printFactors(int number){
        int printer = 0;
        if(number < 1){
            System.out.println("Invalid Value");

        }
        for(int i = 1 ; i <= number ; i++){
            if((number %  i ) == 0){
                printer = i;
                System.out.println(printer);
            }
        }
    }
}
