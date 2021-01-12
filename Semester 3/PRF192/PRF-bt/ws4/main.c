/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on November 27, 2019, 7:15 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
void input(float mang[], int n);
void output(float mang[], int n);
float findMax(float mang [], int n);
float findMin(float mang [], int n);
void displayMaxvalues(float mang[], int n);
void sortAcessding(float mang[], int n);
void swap(float *a, float *b);
int main(int argc, char** argv) {
    int n;
    printf(" Input the number of elements: ");
    scanf("%d", &n);
    float mang[n];
    input(mang, n);
    printf("\n Your array");
    output(mang, n);
    printf("\n The maximum value in your array is: %.lf ", findMax(mang, n));
    printf("\n The minium value in your array is: %.lf ", findMin(mang, n));
    sortAcessding(mang, n);
    printf("\n Your array after acessding: ");
    output(mang, n);
    displayMaxValuePosition(mang, n);
    
        return (EXIT_SUCCESS);
}
void input( float mang[], int n ){
    for ( int i = 0; i < n; i++ ){
        printf( " Input the element value at position %d: ", i);
        scanf("%f", &mang[i]);
    }
}
void output( float mang[], int n ){
    for( int i = 0; i < n; i ++ ){
        printf(" %5.1f ", mang[i]);
    }
}
float findMax(float mang[], int n){
    float max = mang[0];
    for(int i = 0; i < n; i++){
        if( mang[i] > max)
            max = mang[i];
    }
    return max;
}
float findMin(float mang[], int n){
    float min = mang[0];
    for(int i = 0; i < n; i++){
        if( mang[i] < min)
            min = mang[i];
    }
    return min;
}
void displayMaxValuePosition(float mang[], int n){
    for( int i = 0; i < n; i++){
        if ( mang[i] == findMax(mang, n)){
            printf("\n The position of max value: %d", i);
        }
    }
    
}
void sortAcessding(float mang[], int n){
    for ( int i = 0; i < n-1; i++){
        for( int j = i + 1; j < n; j++){
            if(mang[i] > mang [j])
                swap(&mang[i], &mang[j]);
        }
    }
    
}
void swap(float *a, float *b){
    float temp = *a;
    *a = *b;
    *b = temp;
    
}