#include <bits/stdc++.h>
using namespace std;
/*
// ****** (find length of char)
int getlength(char name[])
{
  int cou = 0;
  for (int i = 0; name[i] != '\0'; i++)
  {
    cou++;
  }
  return cou;
}
int main()
{
  char name[20];
  cout << "enter your name";
  cin >> name;
  // name[2] = '\0';
  cout << "your name is ";
  cout << name << endl;
  cout << "length:" << getlength(name) << endl;
}
*/

// void getlin(char name[], int n)
// {
//   char name[6];
//   cin >> name;
//   for (int i = n; name[i] >= 0; i--)
//   {
//     cout << name[i] << endl;
//   }
// }

// void reverse(char name[], int n)
// {

//   for (int i = 0; i < n; i++)
//   {
//     cin >> name[i];
//   }
//   for (int i = n - 1; i >= 0; i--)
//   {
//     cout << name[i] << " ";
//   }
//   cout << endl;
// }
// int main()
// {
//   void reverse(char, int);
//   int n;
//   cin >> n;
//   char name[n];
//   // cin>>name[n];

//   reverse(n, name[n]);
// }
/*
void printarr(int arr[], int n)
{
  cout << "arr function ka start" << endl;
  for (int i = 0; i < n; i++)
  {
    cout << arr[i] << " ";
  }
  cout << endl;
}
int main()
{
  int fifth[15] = {1, 2, 3};
  // int n = 15;
  printarr(fifth, 10);
  int fifthlength = sizeof(fifth);
  cout << fifthlength << endl;
}
*/
/*///****** min number search****
int main()
{
  int n;
  cin >> n;
  int arr[n];
  int max = INT_MIN;
  // int min = INFINITY;
  for (int i = 0; i < n; i++)
  {
    cin >> arr[i];
  }
  for (int i = 0; i < n; i++)
  {
    if (arr[i] > max)
    {
      max = arr[i];
    }
    }
  cout << max << " ";
}
*/
/*
bool search(int arr[], int n, int put)
{
  for (int i = 0; i < n; i++)
  {
    if (arr[i] == put)
    {
      return 1;
    }
  }
  return 0;
}
int main()
{

  int n;
  cin >> n;
  int arr[n];
  for (int i = 0; i < n; i++)
  {
    cin >> arr[i];
  }
  int put;
  cin >> put;
  bool found = search(arr, 10, put);
  if (found)
  {
    cout << "present" << endl;
  }
  else
  {
    cout << "absent" << endl;
  }
}
*/
/*///// reverse in array
void reverse(int arr[], int n)
{
  int st = 0;
  int en = n - 1;
  while (st <= en)
  {
    swap(arr[st], arr[en]);
    st++;
    en--;
  }
}
void printarr(int arr[], int n)
{
  for (int i = 0; i < n; i++)
  {
    cout << arr[i] << " ";
  }
  cout << endl;
}
int main()
{
  int n;
  cin >> n;
  int arr[n];
  for (int i = 0; i < n; i++)
  {
    cin >> arr[i];
  }
  reverse(arr, n);

  printarr(arr, n);
}
*/
/*
question1.swap alternate;
find unique number in array;
find dublite in array;
array intercation;
find pairsum;
find tripulite sum;
sort 0 & 1;
*/
// (question number 1 h...)
// void altrev(int arr[], int n)
// {
//   int st = 0;
//   while (st <= n)
//   {
//     swap(arr[st], arr[st + 1]);
//     st = st + 2;
//   }
// }
// void printarr(int arr[], int n)
// {
//   for (int i = 0; i < n; i++)
//   {
//     cout << arr[i] << " ";
//   }
//   cout << endl;
// }
// int main()
// {
//   int n;
//   cin >> n;
//   int arr[n];
//   for (int i = 0; i < n; i++)
//   {
//     cin >> arr[i];
//   }
//   altrev(arr, n);

//   printarr(arr, n);
// }

//(question number 2)
// int main()
// {
//   int n, m;
//   cin >> n >> m;
//   int arr[n], prr[m];
//   int k=0;
//   for (int i = 0; i < n; i++)
//   {
//     cin >> arr[i];
//   }
//   for (int j = 0; j < m; j++)
//   {
//     cin >> prr[j];
//   }
//   for (int i = 0; i < n; i++)
//   {
//     for (int j = 1; i < n; j++)
//     {
//       if (arr[i] == arr[j])
//       {

//       }
//     }
//   }
/*
int main()
{
  int n, m, k;
  int p;
  int arr1[n], arr2[m], arr3[p];
  for (int i = 0; i < n; i++)
  {
    cin >> arr1[i];
  }
  for (int i = 0; i < m; i++)
  {
    cin >> arr2[i];
  }
  for (int i = 0; i < n; i++)
  {
    arr3[i] = arr1[i];
  }
  for (int i = 0; i < m; i++)
  {
    arr3[n + i] = arr2[i];
  }
  cout << arr3[5] << endl;
}
*/