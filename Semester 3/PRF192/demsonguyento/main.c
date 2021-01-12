/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on November 27, 2019, 8:59 AM
 */

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

/*
 * 
 */
void input(int mang[], int n);
void output(int mang[], int n);
int checkPrimeNumbers(int Number);// return 1 if it is a prime number else return 0;
int countPrimeNumbers(int mang[], int n);
void showPrimeNumbers(int mang[], int n);

int main(int argc, char** argv) {
    int n, mang[100];
    printf(" Input the number of elements: ");
    scanf("%d", &n);
    input(mang, n);
    printf("\n Your array: ");
    output(mang, n);
    printf("\n Amount of prime number in your array is: %d", countPrimeNumbers(mang, n));
    showPrimeNumbers(mang, n);
    return (EXIT_SUCCESS);
}
void input(int mang[], int n){
    for( int i = 0; i < n; i++){
        printf(" Input mang[%d] = ", i);
        scanf("%d", &mang[i]);
    }
}
void output(int mang[], int n){
    for( int i =0; i < n; i++){
        printf("%5d", mang[i]);
    }
}
int checkPrimeNumbers(int Number){
    if ( Number <= 1)
        return 0;
    for( int i = 2; i <= sqrt(Number); i++){
        if( Number % i == 0)
            return 0;
    }
    return 1;
}
int countPrimeNumbers(int mang[], int n){
    int count = 0;
    for( int i = 0; i < n; i++){
        if( checkPrimeNumbers(mang[i]) == 1)
            count++;
    }
    return count;
}
void showPrimeNumbers(int mang[], int n){
    for( int i = 0; i < n; i++){
        if( checkPrimeNumbers(mang[i]) == 1)
            printf("\n Prime number is: %d", mang[i]);
    }
}

