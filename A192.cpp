#include <iostream>
using namespace std;

int recursive(int x);

int main(){
    int x;
    cin>>x;
    cout<<recursive(x);
    return 0;
}

int recursive(int x){
    if(x==0) return 0;
    if(x==1) return 1;
    else return x+recursive(x-1);
}