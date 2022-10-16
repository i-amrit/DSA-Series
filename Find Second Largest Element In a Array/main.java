/* 
Find The Second Largest Element In A Array

Given an array of integers, our task is to write a program that efficiently finds the second largest element present in the array.


Example 1:
Input: arr[] = {12, 35, 1, 10, 34, 1}
Output: The second largest element is 34.

Explanation: The largest element of the 
array is 35 and the second 
largest element is 34


Example 2:
Input: arr[] = {10, 5, 10}
Output: The second largest element is 5.

Explanation: The largest element of 
the array is 10 and the second 
largest element is 5
*/



public class SecondLargestInArrayExample{  
    public static int getSecondLargest(int[] a, int total){  
    int temp;  
    for (int i = 0; i < total; i++)   
            {  
                for (int j = i + 1; j < total; j++)   
                {  
                    if (a[i] > a[j])   
                    {  
                        temp = a[i];  
                        a[i] = a[j];  
                        a[j] = temp;  
                    }  
                }  
            }  
           return a[total-2];  
    }  
    public static void main(String args[]){  
    int a[]={12,35,1,10,34,1};  
    System.out.println("Second Largest Element Is : "+getSecondLargest(a,6));  
    }}  