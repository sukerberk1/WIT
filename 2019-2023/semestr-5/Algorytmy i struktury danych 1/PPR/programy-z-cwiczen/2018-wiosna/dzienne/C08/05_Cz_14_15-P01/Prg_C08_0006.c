#include<stdio.h>
#include<stdlib.h>
/************************************************************************/
/************************************************************************/
typedef void (*ptrMyText)();
typedef int (*ptrMyComp)(int, int);
/************************************************************************/
/************************************************************************/
int MyRead();
void MyText();
void MyText1();
void MyText2();
int MyAdd(int, int);
int MyMul(int, int);
int MyQqq(int, int);
/************************************************************************/
/************************************************************************/
int MyRead(){
    int x;
    printf("x ?=");
    scanf("%d", &x);

    return x;
    }
/************************************************************************/
void MyText(){
    printf("*********** MyText ************\n");
    printf("--------------> ");
    MyText1();
    printf("--------------> ");
    MyText2();
    }
/************************************************************************/
void MyText1(){
    printf(">>>>>>>>>>>>>> MyText1\n");
    }
/************************************************************************/
void MyText2(){
    printf("//////////////////////// MyText2\n");
    }
/************************************************************************/
int MyAdd(int x, int y){
    return x + y;
    }
/************************************************************************/
int MyMul(int x, int y){
    return x * y;
    }
/************************************************************************/
int MyQqq(int x, int y){
    int i,j;
    for(i=0;i<x;++i){
        for(j=0;j<y+x-i;++j)
            printf("* ");
        printf("\n");
        }
    return 0;
    }
/************************************************************************/
/************************************************************************/
int main(){
    ptrMyComp* mT;
    unsigned sT, i;
    sT=6;
    mT = (ptrMyComp*)malloc(sizeof(ptrMyComp)*sT);

    mT[0]=MyAdd;
    mT[1]=MyMul;
    mT[2]=MyMul;
    mT[3]=MyAdd;
    mT[4]=MyQqq;
    mT[5]=MyQqq;


    for(i=0;i<sT;++i)
        printf("res = %d\n", mT[i](i,5));

    return 0;
    }
