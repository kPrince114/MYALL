#include <bits/stdc++.h>
using namespace std;
/*
class hero
{
  //
public:
  int health;
  char name;
};
int main()
{
  hero h1;
  h1.health = 90;
  h1.name = 'p';
  // object create kar diya

  cout << "size of " << sizeof(h1) << endl;
  cout << "healtb is " << h1.health << endl;
  cout << "healtb is " << h1.name << endl;
}
*/
class hero
{
  //
private:
  int health;

public:
  char leval;
  int getHealth()
  {
    return health;
  }
  char getleval()
  {
    return leval;
  }
  void setheal(int h)
  {
    health = h;
  }
  void setleval(char ch)
  {
    leval = ch;
  }
};
int main()
{
  hero h1;
  cout << "healtb is " << h1.getHealth() << endl;
  h1.setheal(50);
  // object create kar diya
  cout << "healtb is " << h1.getHealth() << endl;
}