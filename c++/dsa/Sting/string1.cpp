#include <bits/stdc++.h>
using namespace std;
//(1).revese array:-1.make new array and push 2.swap array 3.recusion mathod
/*
void reverse(int array[], int start, int end)
{
  if (end == (start + end) / 2)
  {
    return;
  }
  int temp = array[start];
  array[start] = array[end - 1];
  array[end - 1] = temp;
  reverse(array, start + 1, end - 1);
}
int main()
{
  int array[5] = {12, 3, 4, 5, 6};
  reverse(array, 0, 5);
  int n = sizeof(array) / sizeof(int);
  cout << n << endl;
  for (int i = 0; i < n; i++)
  {
    cout << array[i] << endl;
  }
  return 0;
}
*/
//(2).min amd max number of array;
/*
int main()
{
  int n;
  cin >> n;
  int arr[n];
  for (int i = 0; i < n; i++)
  {
    cin >> arr[i];
  }
  int max = INT_MIN;
  int min = INT_MAX;
  for (int i = 0; i < n; i++)
  {
    if (min > arr[i])
    {
      min = arr[i];
    }
    if (max < arr[i])
    {
      max = arr[i];
    }
  }
  cout << min << " " << max << endl;
  // for (int i = 0; i < n; i++)
  // {
  //   cout << arr[i] + " ";
  // }
  // cout << endl;

  return 0;
}
*/
//(3)=>Array	Find the "Kth" max and min element of an array **
/*
int main()
{
  int arr[] = {1, 0, 3, 9, 6, 7, 3, 4, 2, 0};
  // **some point to complet **
  // 1.take set function after sorting ;
  // 2.find set of function;
  int n = sizeof(arr) / sizeof(arr[0]);
  int k;
  cin >> k;
  sort(arr, arr + n);
  for (int i = 0; i < n; ++i)
    cout << arr[i] << " ";
  cout << endl;
  cout << arr[k - 1] << endl;
  return 0;
}
*/
/*
(4) Array	Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
int main()
{
  int n;
  cin >> n;
  int arr[n];
  for (int i = 0; i < n; i++)
  {
    cin >> arr[i];
  }
  int c0 = 0, c1 = 0, c2 = 0;
  for (int i = 0; i < n; i++)
  {
    if (arr[i] == 0)
    {
      c0++;
    }
    else if (arr[i] == 1)
    {
      c1++;
    }
    else
    {
      c2++;
    }
  }
  int x = 0;
  for (int s = 0; s < c0; s++)
  {
    arr[x] = 0;
    x++;
  }
  for (int p = 0; p < c1; p++)
  {
    arr[x] = 1;
    x++;
  }
  for (int r = 0; r < c2; r++)
  {
    arr[x] = 2;
    x++;
  }
  for (int i = 0; i < n; i++)
  {
    cout << arr[i] << " ";
  }
  cout << endl;
}
*/
/*
q(5) Array Move all the negative elements to one side of the array
    int main()
{
  int n;
  cin >> n;
  int arr[n];
  for (int i = 0; i < n; i++)
  {
    cin >> arr[i];
  }
  int j = 0;
  for (int i = 0; i < n; i++)
  {
    if (arr[i] < 0)
    {
      swap(arr[i], arr[j]);
      j++;
    }
  }
  for (int i = 0; i < n; i++)
  {
    cout << arr[i] << " ";
  }
  cout << endl;
  return 0;
}
*/

(6) Array Find the Union and Intersection of the two sorted arrays.
    //(1)using set theory and find intersection and union
    //(2)second normal mathod;
    int main()
{

  return 0;
}
