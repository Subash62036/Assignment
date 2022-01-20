import java.util.Scanner;

public class ArrayAdd {
    public void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum of array elements =" + sum);
    }

    public void SeondLarge(int[] arr) {
        int temp, i;
        for (i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }


    public static void main(String[] args) {
        int [] arr =new int [5];
        int i;
        System.out.println("Enter any five number");
        Scanner sc = new Scanner(System.in);
        for(i = 0 ; 5 > i; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayAdd ref = new ArrayAdd();
        ref.sum(arr);
        ref.SeondLarge( arr);
        System.out.println(" Second Largest no of array =" + arr[3]);

    }
}
