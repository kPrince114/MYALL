#include <bits/stdc++.h>
using namespace std;
//****(pointer basic)
// int main()
//{
//****** CODE STUDIO PAR QUESTION PRACTIES KARNA H..;
/*
int n = 5;
int m = 6;
int *p = &n;       // when you deceleiar pointer make sure (*)use symboll;
cout << p << endl; // p means address of n
cout << *p << endl;
cout << &p << endl;
cout << &n << endl; // also similary to p
p = &m;             // change of pointer (not right *p beacause now poiner is doing change)
cout << *p << endl;

int n = 5;
int a = n;
a++;
cout << "value are not change  " << n << endl;
int *p = &n;
cout << "before " << n << endl;
(*p)++;
cout << "after " << n << endl;
// COPY IN POINTER CODE IN DOWN
int *c = p;
cout << p << "--" << c << endl;
cout << *p << "--" << *c << endl;
cout << "before " << c << endl;
c = c + 1; // next address par chala jaega c ka address;
cout << "after " << c << endl;
*/
//}
//*********************(pointer second day)**************************
/*
int main()
{ // pointer array ka all code h.. idar

  int arr[10] = {2, 4, 6, 45, 89, 345};
  cout << "address of first index= " << arr << endl;
  cout << "address of first index= " << &arr[0] << endl;
  cout << "value of first index " << *arr << endl;
  cout << "address of first index " << *arr + 6 << endl;   // 6 increase in value
  cout << "address of first index " << *(arr + 1) << endl; // value at 1 location
  cout << "address of first index " << *(arr) + 1 << endl; // 0 index value me 1 increase
  int i = 4;
  cout << "new tarika magaa aaya = " << i[arr] << endl;
  cout << "arr bits size nikal lena h.. " << sizeof(arr) << endl; // 40=10*4
  int *p = &arr[0];
  cout << sizeof(p) << endl;  // pointer 8 bite congime karata h..
  cout << sizeof(*p) << endl; // 0 location par value ka size bataega
  cout << sizeof(&p) << endl; // hai to address par pointer ko show karata h..
  int temp[10] = {34, 23, 45};
  cout << sizeof(temp) << endl;
  cout << "0 index me value ka size store karta h..= " << sizeof(*temp) << endl;
  cout << "0 index par address ka size jo poiner = " << sizeof(&temp) << endl;
  cout << &temp << "," << &temp[0] << "," << temp << "," << endl; // all same code mean
  // some diffrent point
  cout << " dono change rahega value ka " << endl;
  int *pon = &temp[0];
  cout << &temp[0] << endl;
  cout << &pon << endl;
  // ERROR SHOW KARANAH..
  // temp = temp + 1
  cout << "dosra diffrence aa gaya h.." << endl;
  cout << pon << endl; // let us it address 710
  pon = pon + 1;
  cout << pon << endl; // to isaka address 714 hoga

  // CHARCHTER ARRAY POINTER H...
  /*
  int arr[5] = {1, 2, 3, 4};
  char ch[7] = "princ"; // char hamesa null value par gatam karata h..
  cout << arr << endl;  // address of 0th index
  cout << ch << endl;   // but cout work diffrent tarika in char
  char *c = &ch[0];
  cout << c << endl;
}
*/
//*******************function useing pointer****************
/*
void print(int *p)
{
  cout << p << endl;
  cout << *p << endl;
  // p = p + 1;
  cout << "afer " << p << endl;
  *p = *p + 1;
  // cout << "value change by 1 " << *p << endl;//samchana h.. bad me
}
int main()
{
  int value = 9;
  int *p = &value;
  print(p);
  cout << "value change by 1 = " << *p << endl;
}
*/
// ************problem of pointer*****************
// int main()
//{
/*
float f = 10.5;
float p = 2.5;
float *ptr = &f;
(*ptr)++;
*ptr = p;
cout << *ptr << " " << f << " " << p;
*/
// 3th question
// int b = 10;
// int *a = &b;
// cout << &b << endl;
// cout << a << endl;
// cout << &a << endl;
// doubt h .............
// char ch = 'a';
// cout << ch << endl;
// char *ptr = &ch;
// ch = ch + 2;
// cout << "qustion" << endl;
// cout << *ptr << endl;
// int arr[] = {2, 4, 6, 45, 89, 345};
// cout << (arr + 1) << endl;
// cout << "address of first index= " << arr << endl;
// cout << "address of first index= " << &arr[0] << endl;
// cout << "value of first index " << *arr << endl;
// cout << "address of first index " << *arr + 6 << endl;   // 6 increase in value
// cout << "address of first index " << *(arr + 4) << endl; // value at 1 location
// cout << "address of first index " << *(arr) + 1 << endl; // 0 index value me 1 increase
//}
//****************** DOUBLE POINTER LEARN*********************
void update(int **p2)
{
  // p2 =p2+1;
  // kuch change hoga -- no
  // *p2=*p2+1;
  // kuch change hoga-- yes;
  // **p2=**p2+1;
  // kuch change hoga -- yes
}
int main()
{
  int i = 9;
  int *p1 = &i;
  int **p2 = &p1;
  cout << "value of i print " << i << endl;
  cout << "value of i print  " << *p1 << endl;
  cout << "value of i print " << **p2 << endl;
  cout << "address of i index " << &i << endl;
  cout << "address of i index " << p1 << endl;
  cout << "address of i index " << *p2 << endl;
  cout << "address of p index " << &p1 << endl;
  cout << "address of p index " << p2 << endl;
  cout << "address of p2 index " << &p2 << endl;
}

//************************subject====reference variable*****************************
/*//(create variable and print)
int main()
{
  int i = 5;
  int &j = i;
  cout << i << endl;
  i++;
  cout << i << endl;
  i++;
  cout << i << endl;
  cout << j << endl;
}
*/
// void update(int n)
// {
//   int num = n;
//   num++;
//   int &ans = num;
//   cout << ans << endl;
// }
/*
void update(int &m)
{
  m++;
}
*/
/*
int update(int &m)//call by function se aa raha h.. value &m ka;
{
  int num = m;
  int &ans = num;
  return ans;
}
int main()
{
  int n = 5;
  cout << "before n=" << n << endl;
  update(n);
  cout << "after function call n=" << n << endl;
}
*/
/*
// how to take heap
int getsum(int *arr, int n)
{
  int sum = 0;
  for (int i = 0; i < n; i++)
  {
    sum = sum + arr[i];
  }
  return sum;
}
int main()
{
  int n;
  cin >> n;
  int *arr = new int[n];
  for (int i = 0; i < n; i++)
  {
    cin >> arr[i];
  }
  int ans = getsum(arr, n);
  cout << ans << endl;
}
*/
///.>>>>>>>>>>>>>>(2d array)>>>>>>>>>>>>>>>>>>>>
/*
int main()
{
  //<<<<<<<<<< same row and same colum <<<<<<<<<<<<

  int n;
  cin >> n;
  // create a 2d array;
  int **arr = new int *[n];
  for (int i = 0; i < n; i++)
  {
    arr[i] = new int[n];
  }
  // >.>>>>>>teking a input in 2d array
  for (int i = 0; i < n; i++)
  {
    for (int j = 0; j < n; j++)
    {
      cin >> arr[i][j];
    }
  }
  cout << endl;
  for (int i = 0; i < n; i++)
  {
    for (int j = 0; j < n; j++)
    {
      cout << arr[i][j] << " ";
    }
    cout << endl;
  }

  //<<<<<<<<< diffrent row and diffrent colum<<<<<<<;

  int row;
  cin >> row;

  int col;
  cin >> col;
  int **arr = new int *[row];
  for (int i = 0; i < row; i++)
  {
    arr[i] = new int[col];
  }
  // >.>>>>>>teking a input in 2d array
  for (int i = 0; i < row; i++)
  {
    for (int j = 0; j < col; j++)
    {
      cin >> arr[i][j];
    }
  }
  cout << endl;
  for (int i = 0; i < row; i++)
  {
    for (int j = 0; j < col; j++)
    {
      cout << arr[i][j] << " ";
    }
    cout << endl;
  }
  //<<<<<*** relase in memory in heap <<<<<<<<<;
  for (int i = 0; i < row; i++)
  {
    delete[] arr[i];
  }
  delete[] arr;

}
*/
// ************** object oriented programing(OOPs)*************
/*
class hero
{
  // properties
  char leval = 90;

public:
  int health;
  char princ;
  void print()
  {
    cout << "leval of" << leval << endl;
  }
};
int main()
{
  hero ramesh;
  ramesh.health = 80;
  cout << ramesh.health << endl;
  cout << "size; " << sizeof(hero) << endl;
}
*/
// class hero
// {
//   // properties
//   // by defolt it is privite class
// public:
//   char leval;
//   int health;
//   char princ;
// hero(){
//   cout<<"conserter call"<<endl;
// }

// hero(int health)
// {
//   cout << "this -> " << this << endl;
//   this->health = health;
// }
// void setHealth(int h)
// {
//   health = h;
// }
// hero()
//
//};
// int main()
//{
// // static allocation
// hero a;
// cout << "health is" << a.leval << endl;
// // dynamically allocation
// hero *p = new hero;
// p->leval = 'a';
// p->health = 80;
// cout << "leval of :" << p->leval << endl;
// cout << "health is : " << (*p).health << endl;
//*************************************************************
// cout << "before call " << endl;
// hero ramesh;
// cout << "after call " << endl;
// hero *r = new hero; // dynamoc call in  constercuter
//********************************************
//   hero ramesh(10);
//   cout << "addres of ramesh" << &ramesh << endl;
//   ramesh.health;
// }
