
import java.util.Scanner;
//짝수의 합
public class Lv1n2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("정수 n을 입력하세요: ");
        int n = scanner.nextInt();
       
        int sum = sumNumbers(n);
       
        System.out.println("1부터 " + n + "까지의 짝수 합: " + sum);
       
        scanner.close();
    }
   
    public static int sumNumbers(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}