#include <iostream>
using namespace std;
int main(){
    int x;
    cin>>x;
    for(int i=0;i<x;i++){
        for(int j=0;j<x;j++){
            if(i%2==0)cout<<"* ";
            else cout<<" *";
        }
        cout<<endl;
    }
}