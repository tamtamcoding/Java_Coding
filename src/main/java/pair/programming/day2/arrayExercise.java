package pair.programming.day2;

public class arrayExercise {
    public static void main(String[] args) {
        int[] numbers = new int[15];
        numbers[0] = 1;
        int sum = 0;
        int average = 0;

        for (int i = 0;i< numbers.length-1;i++){
            if(numbers[i] == 1){
                System.out.println(numbers[i]);
            }

            System.out.println(numbers[i] + numbers[i]);
            numbers[i+1] = numbers[i] + numbers [i];

        }
        for(int i = 0;i<numbers.length;i++){
            sum = sum + numbers[i];
            average = sum/ numbers.length;
            System.out.println(sum);
        }

        System.out.println("sum of 15 array " + sum);
        System.out.println("average is : " + average);

    }
}
