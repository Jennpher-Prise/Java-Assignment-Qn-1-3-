import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];
        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 15; i++) {
            System.out.println(arr[i]);
        }
        int num = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < 15; i++) {
            if (arr[i] == num) {
                System.out.println("the number found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("number not found in this array");
        }
        int[] arr2 = new int[15];
        for (int i = 0; i < 15; i++) {
            arr2[i] = arr[14 - i];
        }
        for (int i = 0; i < 15; i++) {
            System.out.println(arr2[i]);
        }
        int sum = 0;
        int product = 1;
        for (int i = 0; i < 15; i++) {
            sum += arr[i];
            product *= arr[i];
        }
        System.out.println(product);
        System.out.println(sum);
    }
}