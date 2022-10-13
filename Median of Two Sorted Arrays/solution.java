import java.util.Arrays;

class Solution {
  public static double solve(int[] nums1, int[] nums2) {
    double median;
    int m = nums1.length;
    int n = nums2.length;
    int arr[] = new int[n + m];
    for (int i = 0; i < m; ++i) {
      arr[i] = nums1[i];
    }
    for (int i = 0; i < n; ++i) {
      arr[m + i] = nums2[i];
    }
    Arrays.sort(arr);
    if ((m + n) % 2 == 0) {
      int f = (m + n) / 2;
      int s = (m + n) / 2 + 1;
      median = (arr[f] + arr[s - 2]) / 2.0;
    } else {
      int mid = (m + n) / 2;
      median = arr[mid];
    }
    return median;
  }

  public static void main(String[] args) {
    int[] nums1 = { 1, 3 };
    int[] nums2 = { 2 };
    System.out.println(solve(nums1, nums2));
  }
}
