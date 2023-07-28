package EvenAndOddClassifier;

import java.util.Scanner;
public class EvenAndOddClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] even = new int[5];
        int[] odd = new int[5];
        int value;
        int j = 0;
        int k = 0;

        for (int i=0; i<=5; i++){
            System.out.print("Enter number that needs to be added to Even or Odd list: ");
            value = sc.nextInt();
            if(value % 2 == 0){
                even[j] = value;
                j++;
            }
            else{
                odd[k] = value;
                k++;
            }
        }
        System.out.print("Elements in Even Array are as follows: ");
        for (int i: even) {
            if(i!=0) {
                System.out.print(i + " ");
            }
            else
                continue;
        }

        System.out.println("");
        System.out.print("Elements in Odd Array are as follows: ");
        for (int i: odd) {
            if(i!=0) {
                System.out.print(i + " ");
            }
            else
                continue;
        }
    }
}
