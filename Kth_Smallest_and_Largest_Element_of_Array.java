/*QUESTION- You are given an array consisting of 'N' distinct integers and a positive integer 'K'.
Find out Kth smallest and Kth largest integer in array.It is guaranteed that K is not greater than
 the size of array.*/



import java.util.*;
public class practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int len =sc.nextInt();
        int[] arr= new int[len];
        System.out.println("Enter the elements: ");
        for(int i =0;i<len;i++){
        arr[i]=sc.nextInt();
        }
      System.out.println("Enter the value of k");
        int m =sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] >= arr[j]) {
                    int k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
            }

        }
        
            System.out.print("The Kth smallest "+arr[arr.length-m]+ " and Kth largest element is "+arr[m-1]);
        }
    }