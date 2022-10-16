#include<bits/stdc++.h>
using namespace std;

void generateAllStrings(int K, char str[], int n){
    if(n==K){
        cout<<str<<" ";
        return;
    }
    if(str[n-1]=='0'){
        str[n]='0';
        generateAllStrings(K,str,n+1);
        str[n]='1';
        generateAllStrings(K,str,n+1);
    }

    if(str[n-1]=='1'){
        str[n]='0';
        generateAllStrings(K,str,n+1);
    }
}

void generateString(int K){
    if(K<=0){
        return;
    }
    char str[K];

    int n=1;

    str[0]='0';
    generateAllStrings(K,str,n);

    str[0]='1';
    generateAllStrings(K,str,n);

}

int main(){
    int K=4;
    generateString(K);
    return 0;
}