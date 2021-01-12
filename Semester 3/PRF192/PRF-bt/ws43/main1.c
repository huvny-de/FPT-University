/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on November 27, 2019, 9:00 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
    int *p,n;
    printf("input n: ");
    scanf("%d", &n);
    p=(int*)malloc(n * sizeof(int));
    int i;
    for( i = 0; i < n; i++){
        printf("input element #%d: ",i);
        scanf("%d",( p + i));
    }
    for ( i = 0; i < n; i++){
        printf("%4d",*( p + i));
    }
    int high=*p;//tim max
    for( i = 1; i < n; i++){
        if (high<*( p + i))
            high =*( p + i);
    }
    printf("\n Max value in your array is %d\n",high);
    int max;
    for ( i = 0; i < n; i++){
        if(*( p + i)==high){
            max++;
        }
    }
    printf("Max appear %d in array\n",max);
    int *o;
    o=(int*)malloc(n * sizeof(int));
    int j,k,l,temp;
    for( j = 0; j < n; j++)
        *(o+j)=*(p+j);
    for( k = 0; k < n; k++){
        for( l = k+1; l < n; l++){
            if(*( o + k)<*( o + l)){
                temp=*( o + k);
                *( o + k)=*( o + l);
                *( o + l)=temp;
            }               
        }        
    }
    printf(" Arrange positions from large to small: \n");
    for( k = 0; k < n; k++)           
        printf("\n Number at array is %d",*( o + k));
    return 0;
}

