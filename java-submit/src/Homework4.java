import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println("두 수의 최대공약수는 " + gcd(m, n) + "입니다.");

    }

   /*public static int gcd(int m, int n){
        if (n == 0) return m;
        else if (m > n) return gcd(n, m % n);
        else return gcd(m, n % m);
    }*/

    // 반복문 바꾸기
    public static int gcd(int m, int n){
        while(n != 0) {
            if (m > n) {
                int temp = m;
                m = n;
                n = temp % n;
            } else {
                n = n % m;
            }
        }
        return m;
    }

}

