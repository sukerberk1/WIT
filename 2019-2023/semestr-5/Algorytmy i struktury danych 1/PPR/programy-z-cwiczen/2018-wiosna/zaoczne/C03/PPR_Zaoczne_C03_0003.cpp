#include <iostream>
using namespace std;
///*******************************************************************************
///*******************************************************************************
int MyRead(int);
int MyAbs(int);
int MyAdd(int, int);
///*******************************************************************************
///*******************************************************************************
int MyRead(int i){
    int x;
    cout<<"x"<<i<<" ?=";
    cin>>x;

    return x;
    }
///*******************************************************************************
int MyAbs(int x){
    if(x<0) return -x;
    return x;
    }
///*******************************************************************************
int MyAdd(int x1, int x2){
    return x1 + x2;
    }
///*******************************************************************************
///*******************************************************************************
int main(){
    int x;

    x = MyRead(1);
    cout<<"|"<<x<<"| = "<<MyAbs(x)<<endl;

    return 0;
    }
