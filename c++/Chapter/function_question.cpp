#include <bits/stdc++.h>
using namespace std;
/* ***********EVEN ODD IS USE FUNCTON;
void iseven(){

  int n;
  cin>>n;

  if(n%2==0){
    cout<<n<<" is even number"<<"\n";
  }
  else{
    cout<<n<<" is odd number"<<"\n";
  }
}
int main(){
  // int n;
  // cin>>n;
  iseven();

 return 0;
}*/
/* ******* VOWEL AND CONSONTANT USEING FUNCTION******
void charvowel(){
  char p;
  cin>>p;
  int ischarcter;
  ischarcter=(p=='a'||p=='e'||p=='i'||p=='o'||p=='u');

  if (ischarcter)
  {
    cout<<"vowel"<<endl;
  }
  else{
    cout<<"consonant"<<endl;
  }
}
int main(){


  charvowel();

  return 0;
}
*/
/* ********** MAX OR MIN IN THREE NUMBER*********
void maxmin(){
  int a,b,c;
  cin>>a>>b>>c;
  if(a>b){
    if (a>c)
    {
      cout<<a<<endl;
    }
    else{
      cout<<c<<endl;
    }
  }
  else{
    if (b>c)
   {
     cout<<b<<endl;
   }
   else{
    cout<<c<<endl;
   }
  }

}
int main(){
  maxmin();
  return 0;
}
*/
/**************FACTOR ALL/*********
void factor(){
  int n;
  cin>>n;
  for (int i = 1; i <=n; i++)
  {
    if (n%i==0)
    {
      cout<<i<<endl;
    }
  }
}
int main(){
  factor();

  return 0;
}*/
/*
int sumu(int n){
  int sum=0;
  for (int i = 1; i <=n; i++)
  {
    sum=sum+i;
  }
  return sum;


}
int main()
{
  int n;
  cin>>n;
  cout<<sumu(n)<<endl;

}*/
/***********(PYTHORCURES THEOREM )
bool check(int x,int y,int z){
  if(x*x==y*y+z*z){
    return 1;
  }
  else if (y*y==x*x+z*z)
  {
    return 1;
  }
  else if (z*z==y*y+x*x)
  {
    return 1;
  }
  else{
    return 0;
  }
}
int main(){
  int x,y,z;
  cin>>x>>y>>z;
  if (check(x,y,z))
  {
    cout<<"pt"<<endl;
  }
  else{
    cout<<"not pt"<<endl;
  }
  return 0;
}*/
/* *****(binary to decimal convert mathmatical tool)
int binarytodecimal(int n){
  int x=1;
  int ans=0;
  while (n>0)
  {
    int y=n%10;
    ans=ans+y*x;
    x=x*2;
    n=n/10;
  }
  return ans;
}
int main() {
  int n;
  cin>>n;
  cout<<binarytodecimal(n)<<endl;
  return 0;
}
*/
/* ****(OCTAL TO DECIMAL NUMBER)**********
int octaltodecimal(int n){
  int x=1;
  int ans=0;
  while (n>0)
  {
    int y=n%10;
    ans=ans+y*x;
    x=x*8;
    n=n/10;
  }
  return ans;
}
int main(){
 int n;
 cin>>n;
 cout<<octaltodecimal(n)<<endl;
  return 0;
*/
int octaltohecal(int n)
{
  int x = 1;
  int ans = 0;
  while (n > 0)
  {
    int y = n % 10;
    ans = ans + y * x;
    x = x * 8;
    n = n / 10;
  }
  return ans;
}
int main()
{
  int n;
  cin >> n;
  cout << octaltohecal(n) << endl;
  return 0;
}
// ******** (binary convert all question practies of all again)******
