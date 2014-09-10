#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "sort_search.h"

int n;

int arrayInt [] =    {2,4,7,3,7,3,8,2,9,4,8,4,9,4,7,4,1,0};
int sortedArray [] = {0,1,2,2,3,3,4,4,4,4,4,7,7,7,8,8,9,9};

void printList(int listArray []){
    int i;
    for(i = 0;i < n;i++){
        printf("%d, ",listArray[i]);
    }
}

int main(int argc, char** argv) {
//    int found = binSearch(0);

//    if(found){
//        printf("Data ditemukan");
//    } else {
//        printf("Data tidak ditemukan");
//    }
    int i;
    n = 100;
    int anArray [n];

    for(i = 0; i < n; i++){ //generate data
        anArray[i] = random()/1000000;
    }

    printList(anArray);

    printf("\n");
    //n = (sizeof(anArray)/sizeof(int)); // get length of array
    //bubbleSort(anArray);

    quickSort(anArray,0,n-1);
    printList(anArray);
    return 0;
}
