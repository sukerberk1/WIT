#include <stdio.h>
///************************************************************************
int MyRead(char* myStr){
    int x;
    printf("%s",myStr);
    scanf("%d",&x);
    return x;
    }
///************************************************************************
///************************************************************************
int main(){
    int x;

    x = MyRead("x? = ");
    printf("x = %d\n",x);

    return 0;
    }
/**1

x? = 5
x = 5

*/

/**
x? = 11
x = 11

*/








