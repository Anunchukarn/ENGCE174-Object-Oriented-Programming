import java.util.Random;
import java.util.Scanner;

public class lab3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your random value : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println("-----------------------");
        for (int i = 0; i < n; i++) {
            System.out.println("Array[" + i + "] = " + arr[i]);
        }
    }
}
