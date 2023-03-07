#include <bits/stdc++.h>
using namespace std;
/*
// recusion ;--1*******
int factorial(int n)
{
  // base case of recusion part
  if (n == 0)
  {
    return 1;
  }
  // recusion call again- again(tarika;1)
  // int chota=factorial(n-1);
  // int bara=n*chota;
  // return bara;
  return n * factorial(n - 1);
}
int main()
{
  int n;
  cin >> n;
  int p = factorial(n);
  cout << p << endl;
}
*/
/*
// question 2 of recusion solve****
int powerof2(int n)
{
  if (n == 0)
  {
    return 1;
  }
  return 2 * powerof2(n - 1);
}
int main()
{
  int n;
  cin >> n;
  int ans = powerof2(n);
  cout << ans << endl;
}
*/
/*
// number table of n tak****
void table(int n)
{
  if (n == 0)
  {
    return;
  }
  cout << n << endl;
  table(n - 1);
}

int main()
{
  int n;
  cin >> n;
  cout << "table of number\n";
  table(n);
}
*/
/*
// (power of any number)
int powerof(int n, int p)
{
  if (n == 0)
  {
    return 1;
  }
  return p * powerof(n - 1, p);
}
int main()
{
  int n, p;
  cin >> n >> p;
  int ans = powerof(n, p);
  cout << ans << endl;
}
*/
/*
// sum of n number*******
int fib(int n)
{
  if (n == 0)
  {
    return n;
  }
  int ch = fib(n - 1);
  int bra = n + ch;
  return bra;
}
int main()
{
  int n;
  cin >> n;
  // int ans = fib(n);
  cout << fib(n) << endl;
}
*/
/*
//***(increase and decreage(both order))******
void doblecoun(int n)
{
  if (n == 0)
  {
    return;
  }
  cout << n << endl;
  doblecoun(n - 1);
  cout << n << endl;
}
int main()
{
  int n;
  cin >> n;
  doblecoun(n);
}
*/
/*
//******* (ZIG--ZAG)question useing recustion ****
void anynum(int n)
{
  if (n == 0)
  {
    return;
  }
  cout << "pre" << n << endl;
  anynum(n - 1);
  cout << "in" << n << endl;
  anynum(n - 1);
  cout << "post" << n << endl;
}
int main()
{
  int n;
  cin >> n;
  anynum(n);
}
*/
/*
//******(TOWER OF HANOI QUESTION)*******
void towerofhanoi(int n, char so, char dis, char hel)
{
  if (n == 0)
  {
    return;
  }
  towerofhanoi(n - 1, so, hel, dis);
  cout << "move to " << so << " to " << hel << endl;
  towerofhanoi(n - 1, hel, dis, so);
}
int main()
{
  towerofhanoi(3, 'a', 'b', 'c');
}
*/
/*
//(display an array use recusionin opposite side)
void display(int n, int arr[])
{
  if (n == 0)
  {
    return;
  }
  cout << arr[n - 1] << endl;
  display(n - 1, arr); // doubt for this line
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
  display(n, arr);
}
*/
/*(try to clear my doubt in array)
int main()
{
  int n = 5;
  int arr[n] = {34, 56, 78, 33, 23};
  for (int i = 0; i < n; i++)
  {
    cout << arr[i] << " ";
  }
  cout << endl;
}
*/
/*
// array print in same side of all
void display(int n, int arr[], int p)
{
  if (p == n)
  {
    return;
  }
  cout << arr[p] << endl;
  display(n, arr, p + 1); // doubt for this line
}
int main()
{
  int n;
  int p = 0;
  cin >> n;
  int arr[n];
  for (int i = 0; i < n; i++)
  {
    cin >> arr[i];
  }
  display(n, arr, p);
}
*/
/*
max find useing recusion
void maxnum(int n, int arr[])
{
  int max = INT_MIN;
  if (n == 0)
  {
    return;
  }
  if (arr[n - 1] > max)
  {
    max = arr[n - 1];
  }
  maxnum(n - 1, arr);
  cout << max << endl;
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
  maxnum(n, arr);
}
*/
/*(SUM OF Nth NUMBER)
int sum(int n, int su)
{
  if (n == 0)
  {
    return su;
  }
  su = su + n;
  // cout << su << endl;
  return sum(n - 1, su);
}
int main()
{
  int n;
  cin >> n;
  int su = 0;
  cout << sum(n, su) << endl;
  ;
}
*/
/*//(sum of array in recusion)
int sum(int arr[], int n, int i, int su)
{
  if (n == 0)
  {
    return su;
  }
  su = su + arr[i];
  return sum(arr, n - 1, i + 1, su);
}
int main()
{
  int arr[6] = {10, 20, 30, 40};
  int n = sizeof(arr) / sizeof(int);
  int su = 0;
  cout << sum(arr, n, 0, su) << endl;
}
*/
bool incr(int arr[], int n)
{
  if (n == 1)
  {
    return true;
  }
  bool restarr = incr(arr + 1, n - 1);
  return (arr[0] < arr[1] && restarr);
}
int main()
{
  int n;
  int arr[] = {1, 2, 3, 4, 5};
  cout << incr(arr, 5) << endl;
}