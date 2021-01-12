/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on November 27, 2019, 8:35 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
    int n;
    printf("input n: ");
    scanf("%d",&n);
    int a[n];
    int i;
    for( i = 0; i < n; i++){
        printf(" a[%d]: ", i);
        scanf("%d", &a[i]);
    }
    int high = a[0];
    for( i = 1; i < n; i++){
        if ( high < a[i])
            high = a[i];
    }
    printf("\n The max value of array is %d", n, high);
    int max;
    for ( i = 0; i < n; i++){
        if( a[i] == high ){
            max++;
        }
    }
    printf(" Max appear %d time in array\n",max);
    int b[n],j;
    int k, l, temp;
    for( j = 0; j < n; j++)
        b[j] = a[j];
    for( k = 0; k < n; k++){
        for( l = k+1; l < n; l++){
            if( b[k] < b[l]){
                temp = b[k];
                b[k] = b[l];
                b[l] = temp;
            }
        }
    }
    printf(" Arrange positions from large to small: ");
    for( k = 0; k < n; k++){
        printf("\n Number at a[%d] is %d", i, b[k]);   
        return 0;
    }
    return (EXIT_SUCCESS);
}
