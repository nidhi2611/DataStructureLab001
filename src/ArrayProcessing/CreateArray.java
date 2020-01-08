package ArrayProcessing;

import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int sizeOfArray = sc.nextInt();//entering size of the array
        int[] array = new int[sizeOfArray];//creating a array
        CreateArray createArray = new CreateArray();//object creation
        createArray.enterElementsInArray(array, sizeOfArray, sc);//function for creating array
        System.out.println("Printing array created by scanner class");
        createArray.printArray(array);//function fr printing array made by scanner class
        createArray.calculateSumAndAverage(array);//calculating sum average array
        System.out.println("printing array created by static initialization");
        createArray.createArrayUsingStatic(array);//creating array using static initialization
        createArray.printArray(array);//printing new array
        System.out.println("Creating element by command line");
        for (int i = 0; i < args.length && i < array.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }
        createArray.printArray(array);
    }

    public void enterElementsInArray(int arr[], int k, Scanner scanner) {//enetring element using scanner
        for (int i = 0; i < k; i++) {
            arr[i] = scanner.nextInt();
        }
    }


    public void printArray(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public void calculateSumAndAverage(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum = " + sum);
        System.out.println("Average =" + (sum / arr.length));
    }

    public void createArrayUsingStatic(int arr[]) {
        arr[0] = 10;
        arr[1] = 10;
        arr[2] = 10;
        arr[3] = 10;
        arr[4] = 10;
        arr[5] = 10;
        arr[6] = 10;
        arr[7] = 10;
        arr[8] = 10;
        arr[9] = 10;

    }

}
