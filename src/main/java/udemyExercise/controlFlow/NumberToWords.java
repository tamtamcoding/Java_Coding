package udemyExercise.controlFlow;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(100);
        System.out.println(reverse(100));
        System.out.println(getDigitCount(100));

    }
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }
        int digit = getDigitCount(number);
        number = reverse(number);
        for (int i = 0; i < digit; i++) {
            int hello = number % 10;

                switch (hello) {
                    case 0:
                        System.out.println(" ZERO ");
                        break;
                    case 1:
                        System.out.println(" ONE ");
                        break;
                    case 2:
                        System.out.println(" TWO ");
                        break;
                    case 3:
                        System.out.println(" THREE ");
                        break;
                    case 4:
                        System.out.println(" FOUR ");
                        break;
                    case 5:
                        System.out.println(" FIVE ");
                        break;
                    case 6:
                        System.out.println(" SIX ");
                        break;
                    case 7:
                        System.out.println(" SEVEN ");
                        break;
                    case 8:
                        System.out.println(" EIGHT ");
                        break;
                    case 9:
                        System.out.println(" NINE ");
                        break;
                    default:
                        break;

                }
                number = number / 10;


        }
        }
    public static int reverse(int number){
        int reverseNumber = 0;
       while(number !=0){
        int digit = number % 10;
        reverseNumber = (reverseNumber * 10) + digit;
        number = number / 10;
       }
        return reverseNumber;
    }
    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        int counter = 0;
        while(number != 0){
            number = number / 10;
            counter++;
        }
        return counter;
    }
//public static void numberToWords(int number){
//    if(number<0) System.out.print("Invalid Value");
//    int count = getDigitCount(number);
//    number = reverse(number);
//    for(int i=0; i<count; i++){
//        int digit = number%10;
//        switch(digit){
//            case 0:
//                System.out.print("Zero "); break;
//            case 1:
//                System.out.print("One "); break;
//            case 2:
//                System.out.print("Two "); break;
//            case 3:
//                System.out.print("Three "); break;
//            case 4:
//                System.out.print("Four "); break;
//            case 5:
//                System.out.print("Five "); break;
//            case 6:
//                System.out.print("Six "); break;
//            case 7:
//                System.out.print("Seven "); break;
//            case 8:
//                System.out.print("Eight "); break;
//            case 9:
//                System.out.print("Nine "); break;
//            default: break;
//        }
//        number /= 10;
//    }
//}
//
//    public static int reverse(int number) {
//        int reverse = 0;
//        while(number!=0) {
//            reverse = (reverse*10) + number%10;
//            number /= 10;
//        }
//        return reverse;
//    }
//
//    public static int getDigitCount(int number){
//        if (number<0) return -1;
//        int count = 0;
//        while(number !=0){
//            count++;
//            number = number/10;
//        }
////        do {
////            count++;
////            number /= 10;
////        } while (number>0);
//        return count;
//    }
}
