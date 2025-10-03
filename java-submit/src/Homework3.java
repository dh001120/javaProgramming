import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.print("수를 입력하세요: ");
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        int min = array[0];

        for(int i = 1; i < n; i++){
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}
