package ArrayProcessing;

import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] array = new int[sizeOfArray];
        CreateArray createArray = new CreateArray();
        createArray.enterElementsInArray(array, sizeOfArray, sc);

    }

    public void enterElementsInArray(int arr[], int k, Scanner scanner) {
        for (int i = 0; i < k; i++) {
            arr[i] = scanner.nextInt();
        }
    }
}
