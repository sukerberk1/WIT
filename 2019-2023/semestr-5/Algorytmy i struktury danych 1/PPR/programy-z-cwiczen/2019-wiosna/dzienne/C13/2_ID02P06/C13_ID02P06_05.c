#include<stdio.h>
#include<stdlib.h>
///**************************************************************
typedef struct TmpList {
    int data;
    struct TmpList * next;
    }MyList;
///**************************************************************
///**************************************************************

///**************************************************************
///**************************************************************

int main(){
    MyList mL0, mL1, mL2, mL3;
    MyList *pL0, *pL1, *pL2, *pL3;

    pL0 = &mL0;
    pL1 = &mL1;
    pL2 = &mL2;
    pL3 = &mL3;

    pL0->next = pL1;
    pL0->next->next = pL2;
    pL0->next->next->next = pL3;
    pL0->next->next->next->next = NULL;

    pL0->data = 0;
    pL0->next->data = 1;
    pL0->next->next->data = 2;
    pL0->next->next->next->data = 3;


    printf("%d\n", pL0->data);
    printf("%d\n", pL0->next->data);
    printf("%d\n", pL0->next->next->data);
    printf("%d\n", pL0->next->next->next->data);
    printf("------------------------------------\n");

    return 0;
    }
