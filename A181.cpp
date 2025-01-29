#include <iostream>
using namespace std;
#include <string>
int main(){
    int x,y;
    cin>>x>>y;
    string z=to_string(y);
    for(int i=z.size()-1;i>=0;i--){
        int r= (z[i]-48)*x;
        cout<<r<<endl;
    }
    cout<<x*y;
    return 0;
}