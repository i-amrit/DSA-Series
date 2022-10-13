#include <bits/stdc++.h>
typedef long long ll;
using namespace std;

double solution(vector<int> &nums1, vector<int> &nums2)
{
  double median;
  int m = nums1.size();
  int n = nums2.size();
  int arr[m + n];
  for (int i = 0; i < m; ++i)
  {
    arr[i] = nums1[i];
  }
  for (int i = 0; i < n; ++i)
  {
    arr[m + i] = nums2[i];
  }
  sort(arr, arr + m + n);
  if ((m + n) % 2 == 0)
  {
    int f = (m + n) / 2;
    int s = (m + n) / 2 + 1;
    median = (arr[f] + arr[s - 2]) / 2.0;
  }
  else
  {
    int mid = (m + n) / 2;
    median = arr[mid];
  }
  return median;
}

int main()
{
  // code
  vector<int> a{1, 3}, b{2};
  cout << solution(a, b);
  return 0;
}
