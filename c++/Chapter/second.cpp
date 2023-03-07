//******* ISME ARRAY STRING FUNCTION RECUSTION  POINTER ETC KA CODE H..**********
#include <bits/stdc++.h>
#include <climits> //array in max min
#include <string>  // use for string lesson
using namespace std;

/*
int n,prime=1;
cin>>n;
for (int i = 2; i <=sqrt(n); i++)
{
  if (n%i==0)
  {
    prime=0;
    cout<<"not prime"<<endl;
    break;
  }
}
if (prime)
{
  cout<<"prime"<<endl;
}
*/
//*** +NO IN ALL REMENDER *****
/*
int n,rem;
cin>>n;
while (n>0)
{
 rem=n%10;
 cout<<rem<<"\n";
 n=n/10;
}
*/
//** ARMSTROMG NUMBER**
//
/*
int n ,r;
cin>>n;
int sum=0,org_num=n;
while (n>0)
{
  r=n%10;
  sum=sum+r*r*r;
  n=n/10;
}
if (org_num==sum)
{
  cout<<"armstrong no"<<endl;
}
else
{
  cout<<"not armstrong no"<<endl;
}
*/
//***reversing no***
/*
int n,r;
int p_rem=0;
cin>>n;
while (n>0)
{
  r=n%10;
  p_rem=p_rem*10+r;
  n=n/10;
}
cout<<p_rem<<endl;
*/
// ****FACTORIAL NUMBER***;
/*
int n;
cin>>n;
int fac=1;
for (int i = 1; i <=n; i++)
{
   fac=fac*i;
}
cout<<fac<<endl;
*/
/// ***** FUBCTION START (prime no useing function)*****
/*
bool isprime(int num){
  for(int i=2;i<=num-1;i++){
    if (num%i==0)
    {
      return false;
    }
  }
  return true;
}
int main()
{
 int a,b;
 cin>>a>>b;
 for (int i = a; i <=b; i++)
 {
    if (isprime(i))
   {
     cout<<i<<endl;
    }
  }
  return 0;
}
*/
// ******(FIBONACCI SERIES)*********

void fib(int n)
{
  int t1 = 0;
  int t2 = 1;
  int next_term;
  for (int i = 1; i <= n; i++)
  {
    cout << t1 << endl;
    next_term = t1 + t2;
    t1 = t2;
    t2 = next_term;
  }
  return;
}
int main()
{
  int n;
  cin >> n;
  fib(n);
  return 0;
}

/*
int fac(int n){
  int fac=1;
  for (int i = 1; i <=n; i++)
  {
    fac =fac*i;
  }
  return fac;
}
int main(){
  int n;
  cin>>n;
  int ans = fac(n);
  cout<<ans<<endl;
  return 0;
}
*/
//*****(permotation and combination)********
/*
int fac(int n){
  int factorial=1;
  for (int i = 2; i <=n; i++)
  {
    factorial=factorial*i;
  }
  return factorial;
}
int main()
{
 int n,r;
 cin>>n>>r;
 int ans=fac(n)/(fac(r)*fac(n-r));
 cout<<ans<<endl;
  return 0;
}
*/
/*
int fac(int n){
  int factorial=1;
  for (int i = 2; i <=n; i++)
  {
    factorial=factorial*i;
  }
  return factorial;
}
int main(){
  int n;
  cin>>n;

  for (int i = 0; i<n; i++)
  {
    for (int j = 0; j <=i; j++)
    {
      cout<<fac(i)/(fac(j)*fac(i-j));
    }
    cout<<"\n";
  }
  return 0;
}
*/
/*
int main(){
  for (int i = 0; i <= 5; i++)
  {
    for (int j = 0; j <= 5; j++)
    {
      if (i==0||j==0||i==5||j==5)
      {
        cout<<"*";
      }
      else{
        cout<<" ";
      }

    }
    cout<<endl;

  }
  ****** search part in use function***********************
  return 0;
  int linerSearch(int key,int n,int arr[]){
  for (int i = 0; i <n; i++)
  {
    if (arr[i]==key)
    {
      return i;
    }
  }
  return 0;
}
int main(){
  int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++){
    cin>>arr[i];
  }
  int key;
  cin>>key;
cout<<linerSearch(key,n,arr)<<endl;

  return 0;
}
*/
// (ARRAY START ONE DAIMENCTON)
// int main(){
//   int array[4]={10,20,30,40};
//   cout<<array[1]<<endl;
//   return 0;
// }
/* *********** HOW TO INPUT IN ARRAY ********************
int main(){
  int n;
  cin>>n;
  int array[n];
  for (int  i = 1; i <=n; i++)
  {
    cin>>array[i];
  }
  for (int  i = 1; i <=n; i++)
  {
    cout<<array[i]<<" ";
  }


  return 0;
}
*/
//******( MAX AND MIN NUMBER IN ARRAY)*********
/*
int main(){
  int max=INT_MIN;
  int min=INT_MAX;
  int n;
  cin>>n;
  int array[n];
  for (int  i = 1; i <=n; i++)
  {
    cin>>array[i];
  }
  for (int  i = 1; i <=n; i++)
  {
    if (array[i]>max)
    {
      max=array[i];
    }
    if(array[i]<min){
      min=array[i];
    }
  }
  cout<<"maxNO="<<max<<"mainNO="<<min<<endl;

  return 0;
}
*/
//*********** BINARY SEARCH******** (DOUBT FOR IN THIS QUESTION)***********
/*
int binarysea(int arr[],int n,int key){
  int s=0;
  int e=n;
  while(s<=e){
    int mid=(s+e)/2;
    if (arr[mid]==key)
    {
      return mid;
    }
    else if (arr[mid]>key)
    {
      e=mid-1;
    }
    else{
      s=mid+1;
    }
  }
  return -1;
}
int main(){
  int n;
  cin>>n;
  int arr[n];
  for (int i = 0; i < n; i++)
  {
    cin>>arr[i];
  }
  int key;
  cin>>key;
  cout<<binarysea(arr,n,key)<<endl;
  return 0;
}
*/
//**********SORTING IN ARRAY********
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
  for (int i = 0; i < n - 1; i++)
  {
    for (int j = i + 1; j < n; j++)
    {
      if (arr[j] < arr[i])
      {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
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
// ********(BUBBLE SHOT IN ARRAY)
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
  for (int i = 0; i < n; i++)
  {
    int flag = 0;//******(USE FOR SAVE TIME OR TAKE LESS TIME COMPLICITY)
    for (int j = 0; j < n; j++)
    {
      if (arr[j] > arr[j + 1])
      {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
        flag = 1;
      }
    }
    if (flag == 0)
    {
      break;
    }
  }
  for (int i = 0; i < n; i++)
  {
    cout << arr[i] << " ";
    // cout << endl;
  }
  cout << endl;
  return 0;
}
*/
// *****(INSERTION SORT)********
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
  for (int i = 0; i < n; i++)
  {
    //int flag = 0;
    int temp = arr[i];
    int j = i - 1;
    while (j >= 0 && arr[j] > temp)
    {
      arr[j + 1] = arr[j];
      j--;
      //flag = 1;
    }
    arr[j + 1] = temp;
    }
  for (int i = 0; i < n; i++)
  {
    cout << arr[i] << " " << endl;
  }
  return 0;
}
*/
//********** NEW TOPIC WHICH NAME OF ARRAY IN 2D AND SOLVE ALL QUESTION********
//**** (HOW TO TAKE INPUT  AND OUTPUT )
/*
int main()
{
  int n, m;
  cin >> n >> m;
  int arr[n][m];
  for (int i = 0; i < n; i++)
  {
    for (int j = 0; j < m; j++)
    {
      cin >> arr[i][j];
    }
  }
  cout << "matrix or 2d array is look like a this" << endl;
  for (int i = 0; i < n; i++)
  {
    for (int j = 0; j < n; j++)
    {
      cout << arr[i][j] << " ";
    }
    cout << endl;
  }
  return 0;
}
*/
//  *** (SEARCHING IN 2D ARRAY)
/*
int main()
{
  int n, m;
  cin >> n >> m;
  int arr[n][m];
  for (int i = 0; i < n; i++)
  {
    for (int j = 0; j < m; j++)
    {
      cin >> arr[i][j];
    }
  }
  cout << "matrix or 2d array is look like a this" << endl;
  for (int i = 0; i < n; i++)
  {
    for (int j = 0; j < n; j++)
    {
      cout << arr[i][j] << " ";
    }
    cout << endl;
  }

  int x;
  cin >> x;
  int possition = 1;
  for (int i = 0; i < n; i++)
  {
    for (int j = 0; j < n; j++)
    {
      if (x != arr[i][j])
      {
        possition++;
      }
      else if (possition > n * m)
      {
        cout << "it number is not in this matrix" << endl;
      }
      else
      {
        cout << "matrix possitio is " << possition << endl;
      }
        }
  }

  return 0;
}
*/
//*******(charcetar of array)***********
//***(HOW TO PRINT IN CHAR)*****
/*
int main()
{
  char arr[100] = "apple is dirty";
  int i = 0;
  while (arr[i] != '\0')
  {
    cout << arr[i] << "";
    i++;
  }
  cout << endl;
  return 0;
}
*/
/*(take a charcerchar)
int main()
{
  char arr[100];
  cin >> arr;
  cout << arr << endl;

  return 0;
}
*/
// ************(POINTER ALL CONCEPT)**********
int main()
{
  // int a = 10;
  // int *aprt;
  // aprt = &a;
  // cout << &a << endl;
  // cout << aprt << endl;
  // cout << *aprt << endl;
  // cout << a << endl;
  //*aprt = 20;
  // aprt++;
  // cout << aprt << endl;
  // cout << a << endl;
  // cout << &aprt << endl;
  // int arr[] = {10, 20, 30};
  // cout << *arr << endl; //*arr write 0th value of arr arr in pointer not extent but pointer is extent
  // int *ptr = arr;
  // for (int i = 0; i < 3; i++)
  // {
  //   cout << *ptr << endl;
  //   cout << &ptr << endl;
  //   cout << &arr << endl;
  //   ptr++;
  // }
  // for (int i = 0; i < 3; i++)
  // {
  //   cout << *(arr + i) << endl;
  //   // arr++; it is illegal it take error
  // }
  // int *q;
  // int **q = &aprt;
  // cout << *q << endl;
  // cout << **q << endl;

  return 0;
}

// ***********(STRING CLASS)*****************
// int main(){
//   string str;
//   cin>>str;
//   cout<<str;

//   return 0;

// }
// int main(){
//    string str;
//    string str1(5,'n');
//    string str2="prince kumar";
//    cout<<str1<<endl;
//    cout<<str2<<endl;
//***********************
// string str;
// getline(cin,str);//use and write all word in a sentence ;
// cin>>str;
// string s1="fami";
// string s2="ly aapka";
// s1.append(s2);
// cout<<s1<<endl;
// cout<<s1 + s2<<endl;
// cout<<str<<endl;
// cout<<s1[3]<<endl;
//  string abc="difjfjdufiefdfksdjsjddj kdhednjdjk ";
//  abc.clear();//clear all word;
//  cout<<abc<<endl;
//  s
// string s1="nincooper";
// s1.erase(3,2);
// cout<<s1<<endl;
// cout<<s1.find("co")<<endl;
// cout<<s1.insert(2,"ten")<<endl;
// cout<<s1.size()<<endl;
// string s=s1.substr(6,4);
// cout<<s<<endl;
// string s1="7848";
// int x=stoi(s1);///***string to confort to interger
// cout<<x+2<<endl;
// int x=938;
// cout<<to_string(x)+"2"<<endl;///**** interger to confort string
// string str="skddjfJDKDJNDNSD";
// transform(s.begin),s,end()

// return 0;
//}
