#include <iostream>
using namespace std;
// lecture 19 (********** bacha h.../**********************)
/*// array stl
#include <array>
int main()
{
  array<int, 4> a = {1, 2, 3, 4};
  // int n=a.si
  for (int i = 0; i < a.size(); i++)
  {
    cout << a[i] << endl;
  }
  cout << "array of 2nd element " << a.at(2) << endl;
  cout << "frount element  " << a.front() << endl;
  cout << "last element  " << a.back() << endl;
  cout << "check empty:-- " << a.empty() << endl;
}
*/
/*
// vector stl
#include <vector>
int main()
{
  vector<int> v;
  cout << "size of vaector " << v.size() << endl;         // it mean no of term in this place
  cout << "capicity of vaector " << v.capacity() << endl; // no of box in this vector(it make double in every push_back fxn)
  v.push_back(1);
  cout << "size of vaector " << v.size() << endl;
  cout << "capicity of vaector " << v.capacity() << endl;
  v.push_back(2);
  cout << "size of vaector " << v.size() << endl;
  cout << "capicity of vaector " << v.capacity() << endl;
  v.push_back(3);
  cout << "size of vaector " << v.size() << endl;
  cout << "capicity of vaector " << v.capacity() << endl;
  cout << "2nd element in vector " << v.at(2) << endl;
  cout << "front element " << v.front() << endl;
  cout << "end element " << v.back() << endl;
  cout << "before pop function" << endl;
  for (int i : v)
  {
    cout << i << " ";
  }
  cout << endl;
  v.pop_back();
  cout << "after pop function" << endl;
  for (int i : v)
  {
    cout << i << " ";
  }
  cout << endl;
  cout << "size of before " << v.size() << endl;
  v.clear();
  cout << "size of after " << v.size() << endl;
  cout << "capicity of vaector " << v.capacity() << endl;
  cout << "**************************" << endl;
  vector<int> a(6, 1);
  cout << "print a vector" << endl;
  for (int i : a)
  {
    cout << i << " ";
  }
  cout << endl;
  vector<int> copy(a);
  cout << "copy print a vector a" << endl;
  for (int i : copy)
  {
    cout << i << " ";
  }
  cout << endl;
}
*/
#include <deque>
int main()
{
  deque<int> d;
  d.push_back(1);
  d.push_front(2);
  // d.pop_front();
  // for (int i : d)
  // {
  //   cout << i << " ";
  // }

  // cout << endl;
  cout << "1 index element " << d.at(1) << endl;
  // use front , back , empty;
}
