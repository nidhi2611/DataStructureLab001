package ArrayProcessing;

import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] array = new int[sizeOfArray];
        CreateArray createArray = new CreateArray();
        createArray.enterElementsInArray(array, sizeOfArray, sc);
        createArray.calculateSumAndAverage(array);
    }

    public void enterElementsInArray(int arr[], int k, Scanner scanner) {
        for (int i = 0; i < k; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public void calculateSumAndAverage(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum = " + sum);
        System.out.println("Average =" + (sum / arr.length));
    }
}
