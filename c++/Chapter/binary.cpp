#include <bits/stdc++.h>
using namespace std;
/*
int binary(int arr[], int size, int key)
{
  int start = 0;
  int end = size - 1;
  // int mid = (start + end) / 2;// it is right but it is not solve all case (if mid value is so bigger that time show error)check note
  int mid = (start + (end - start) / 2);
  while (start <= end)
  {
    if (arr[mid] == key)
    {
      return mid + 1;
    }
    else if (key > arr[mid])
    {
      start = mid + 1;
    }
    else
    {
      end = mid - 1;
    }
    //int mid = (start + (end - start) / 2);  it is right but it is not solve all case (if mid value is so biigger that time show error)check note
    mid = (start + (end - start) / 2);
  }
  return -1;
}
int main()
{
  int even[6] = {2, 4, 12, 14, 16, 35};
  int odd[5] = {4, 6, 7, 8, 9};
  int p = binary(even, 6, 12);
  if (p == -1)
  {
    cout << "key is not present in whole array" << endl;
  }
  else
  {
    cout << p << endl;
  }
  // cout << binary(odd, 5, 6) << endl;
}
*/
// question.1 = first and last position an element in sorted array in sorting array;
int firstoccur(int arr[], int size, int key)
{
  int start = 0;
  int end = size - 1;
  int mid = (start + (end - start) / 2);
  int ans = -1;
  while (start <= end)
  {
    if (arr[mid] == key)
    {
      ans = mid + 1; // store and and check if before mid key is present or not beacause it find left most accerence;
      end = mid - 1; // move accerence or check key is present or not
    }
    if (key > arr[mid])
    {
      start = mid + 1; // move accerence or check key is present or not
    }
    else
    {
      end = mid - 1; // move accerence or check key is present or not
    }
    mid = (start + (end - start) / 2);
  };
  return ans;
}
int lastoccur(int arr[], int size, int key)
{
  int start = 0;
  int end = size - 1;
  int mid = (start + (end - start) / 2);
  int ans = -1;
  while (start <= end)
  {
    if (arr[mid] == key)
    {
      ans = mid + 1;   // store and and check if after mid key is present or not beacause it find right most accerence;
      start = mid + 1; // move accerence or check key is present or not
    }
    else if (key > arr[mid])
    {
      start = mid + 1; // move accerence or check key is present or not
    }
    else
    {
      end = mid - 1; // move accerence or check key is present or not
    }
    mid = (start + (end - start) / 2);
  };
  return ans;
}
int main()
{
  int even[8] = {1, 2, 3, 3, 3, 4, 5, 7};
  int odd[5] = {4, 6, 7, 8, 9};
  int p = firstoccur(even, 8, 5);
  cout << "first occur " << p << endl;
  cout << "last occur in array " << lastoccur(even, 8, 3);
  // cout << binary(odd, 5, 6) << endl;
}
// lecture 13,14,15 dekhna h..
/*
// pivet method solve examole in (brote force)
int main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    int sa=0;
    for(int i=0;i<n;i++){
        sa=sa+arr[i];
    }
    int sl=0;
    sa=sa-arr[0];
    for(int i=0;i<n;i++){
        sl=sl+arr[i];
        sa=sa-arr[i+1];
        //cout<<sl<<" "<<sa<<endl;
        if(sl==sa){
            cout<<sl<<" "<<i+1<<endl;
            break;
        }
    }
    cout<<"prince";
    return 0;
}
*/
/*
// pivot for babber sir
int pivot(int arr[],int n){
        int s=0;
        int e=n-1;
        int mid=(s+(e-s)/2);
        while(s<e){
            if(arr[mid]>=arr[0]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return arr[s];
    }
    int main(){
   int arr[5]={9,10,17,3,8};
   cout<<pivot(arr,5)<<endl;

}
*/
/*
// searching and roating for babber sir (it divided into rhree part)
//***1.(first binary search) 2. (piovet property algorithem) 3.(find position function and write function)

 int pivot(int arr[],int n){
        int s=0;
        int e=n-1;
        int mid=s+(e-s)/2;
        while(s<e){
            if(arr[mid]>=arr[0]){
                s=mid+1;
            }
            else{
                e=mid;
            }
            mid=s+(e-s)/2;
        }
        return s;
    }
int binary(int arr[], int s,int e, int size, int key)
{
  int start = s;
  int end = e;
  int mid = (start + (end - start) / 2);
  while (start <= end)
  {
    if (arr[mid] == key)
    {
      return mid + 1;
    }
    else if (key > arr[mid])
    {
      start = mid + 1;
    }
    else
    {
      end = mid - 1;
    }
    mid = (start + (end - start) / 2);
  }
  return -1;
}
int position(int arr[],int n,int key){
    int piavot=pivot(arr,n);
    cout<<piavot<<endl;
    if(key>=arr[piavot]&&key<=arr[n-1] ){
     return binary(arr,piavot,n-1,n,key);
  }
  else{
      return binary(arr,0,piavot-1,n,key);
  }
}
 int main(){
     int n;
     int arr[5]={10,17,1,2,3};
     //int key=10;
     cout<< position(arr,5,17)<<endl;
 }
 */

//(square root in banary search)
//***(1).take 0 to n number and every number first square then check it is less then or not it take : -- --(root n);
//***(2).follow binary search and it take logn time;
//*****here use long beacause if i take long number then compiler out of range so that by it long long
int getsquare(int n)
{
  int s = 0;
  int e = n;
  long long int mid = s + (e - s) / 2;
  long long int ans = -1;
  while (s <= e)
  {
    long long int square = mid * mid;
    if (square == n)
    {
      return mid;
    }
    if (square > n)
    {
      e = mid - 1;
    }
    else
    {
      ans = mid;
      s = mid + 1;
    }
    mid = s + (e - s) / 2;
  };
  return ans;
};
int main()
{
  int n = 36;
  cout << getsquare(36) << endl;
}
