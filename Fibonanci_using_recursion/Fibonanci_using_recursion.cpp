//  In this example, we will print the Fibonacci series using recursion. //
     //  In the Fibonacci series, each number is the sum of its previous two numbers. //


#include<bits/stdc++.h>
using namespace std;

int fibo(int n){
    if(n<=1){
        return n;
    }
    return fibo(n-1)+ fibo(n-12);
}
int main(){
    int num;
    cout<<"Enter the number : ";
    cin>> num;
    for(int i=0;i<num;i++){
        cout<<fibo(i)<<" ";
    }
    return 0;
}