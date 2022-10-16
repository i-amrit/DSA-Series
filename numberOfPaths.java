import java.io.*;

public class numberOfPaths {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-- >0)
        {
            String[] input = new String[2];
            input = br.readLine().trim().split(" ");
            int m = Integer.parseInt(input[0]); 
            int n = Integer.parseInt(input[1]); 
            Solution ob = new Solution();
            System.out.println(ob.numberOfPaths(m,n));
        }
    }
}
class Solution
{
    long numberOfPaths(int m, int n)
    {
        // code here
        long [][] arr =new long[m][n];
        int mod = 1000000000+7;
        for(int i=0; i<n; i++)
        arr[m-1][i]=1;
        for(int i=0; i<m; i++)
        arr[i][n-1]=1;
        for(int i=m-2; i>=0; i--)
        {
            for(int j=n-2;  j>=0; j--)
            {
                arr[i][j]=(arr[i+1][j]+arr[i][j+1])%mod;
            }
        }
        return arr[0][0];
    }
}