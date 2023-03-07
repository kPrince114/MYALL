#include <bits/stdc++.h>
using namespace std;
/*
****(IMPORTANT POINT FOR MAKE MY END)*******
*****(take h main ka return h.. function ka)********
*/
/*
// ***********take nothing return nothing************;
void sum(void)
{
  int a, b, c;
  cin >> a >> b;
  c = a + b;
  cout << c << endl;
}
int main()
{
  sum();
}
*/
/*
//******* TAKE SOMETHING RETURN NOTHING******;
//void add(int ,int)// golobal nature ka banata h..
int main()
{
  void add(int, int);//(batata h ki take take something) and add ke pahle batata h ki return nothing ka h..
  int x, y;
  cin >> x >> y;
  add(x, y);// call by function or actual argument
}
void add(int a, int b)//foraml arguments
{
  int c;
  c = a + b;
  cout << c << endl;
}
*/
/*
// TAKE NOTHING RETURN SOMETHINDG*****
int add()
{
  int a, b, c;
  cin >> a >> b;
  c = a + b;
  return c;
}
int add(void);
int main()
{
  int s;
  s = add();
  cout << s << endl;
}
*/
/*
// take something return something;
int add(int, int);
int add(int a, int b)
{
  int c;
  c = a + b;
  return c;
}

int main()
{
  int x, y, c;
  cin >> x >> y;
  int s = add(x, y);
  cout << s << endl;
}
*/
//***(POINTER KA SUAATH)*****
int main()
{
  int x = 5;
  cout << x << endl;
  cout << &x << endl;
}
