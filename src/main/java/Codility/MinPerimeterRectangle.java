package Codility;

public class MinPerimeterRectangle {
    public static void main(String[] args) {
        System.out.println(solution(30));
    }
    public static int solution(int N){
        int sqrtN = (int) (Math.sqrt(N));
        int parameter = (1 * 2) + (N * 2);
        for(int i = sqrtN ; i > 0; i--){
        if(N % i == 0){
            int A = i;
            int B = N / i;
            parameter = (A * 2) +(B *2);
            break;
        }
        }
        return parameter;
    }
}
