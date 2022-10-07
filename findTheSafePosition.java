/*

---------------Find the Safe Position------------------

There are n people standing in a circle (numbered clockwise 1 to n) waiting to be executed.
The counting begins at point 1 in the circle and proceeds around the circle in a fixed direction (clockwise). 
In each step, a certain number of people are skipped and the next person is executed. 
The elimination proceeds around the circle (which is becoming smaller and smaller as 
the executed people are removed), until only the last person remains, who is given freedom.
Given the total number of persons n and a number k which indicates that k-1 persons are 
skipped and kth person is killed in circle. The task is to choose the place in the initial 
circle so that you are the last one remaining and so survive.

Example 1:

Input:
n = 2, k = 1
Output:
2
Explanation:
Here, n = 2 and k = 1, then safe position is
2 as the person at 1st position will be killed.
Example 2:

Input:
n = 4, k = 2
Output:
1
Explanation:
The safe position is 1.

Expected Time Complexity: O(n*n)
Expected Auxiliary Space: O(n)

 */


import java.io.*;
import java.util.*;
    
 
public class findTheSafePosition {
    public static void main(String[] args) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(read.readLine());
            while (t-- > 0) {
                String S[] = read.readLine().trim().split(" ");
                
                int n = Integer.parseInt(S[0]);
                int k = Integer.parseInt(S[1]);
    
                Solution ob = new Solution();
                System.out.println(ob.safePos(n,k));
            }
    }
}
    class Solution {
        static int safePos(int n, int k) {
            // code here
            if(n==1)
            return 1;
            return(safePos(n-1,k)+k-1)%n+1;
        }
    };