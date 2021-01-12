/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on November 29, 2019, 9:55 AM
 */

#include <stdio.h>
#include <stdlib.h>

void input( int *array, int *n);
void output( int *array, int *n);
/*
 * 
 */
int main(int argc, char** argv) {
    
    return (EXIT_SUCCESS);
}
void input(int *array, int *n){
    *n =0;
    int = a;
    do{
        printf(" Input value: ");
        scanf("%d", &a);
        array[*n] = a;
        (*n)++;
    }
    while(a ! = 0);
}
void output(int *array, int n){
    for( int i = 0; i < n; i++){
        printf("%4d", array[i]);//printf("%4d", *(array + i));
    }
}
void count( int x, int *array, int n){
    int count = 0;
    for( int i = 0; i < n; i++){
        if( x == array[i])
            count++;
    }
    return count;
}