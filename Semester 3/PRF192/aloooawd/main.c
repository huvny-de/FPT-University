/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on December 9, 2019, 9:38 AM
 */

#include <stdio.h>
#include <stdlib.h>
/*#define max 100
/*
 * 
 */
void input( int mang[max]);
void output( int mang[max]);
/*void findMin( int mang[max]);
void findMax( int mang[max]);
void findMin2( int mang[max]);
*/int main(int argc, char** argv) {
    int mang[max];
    input( mang);
    printf(" Input number: ", &mang[i]);
    output( mang);
    
    return (EXIT_SUCCESS);
}
void input( int *mang){
    for( int i = 0; i < 10; i++){
        printf(" Input number #%d: ", i+1);
        scanf("%d", &mang[i]);
    }
}
void ouput( int mang[max]){
    printf(" Your input number: ");
    for ( int i= 0; i < 10; i++){
        printf(" %d", mang[i]);
    }
}
/*int findMin( mang[max]){
    for( int i = 0; i < 10; i++){
        if( min > mang[i]) 
            min = mang[i];
    }
    return min;
}
int findMax( int mang[max]){
    for( int i = 0; i < 10; i++){
        if( max < mang[i]) 
            max = mang[i];
    }
    return max;
}
int findMin2( int mang[max]){
    while( min2 != min )
        for( int i = 0; i < 10; i++){
        if( min2 > mang[i]) 
            min2 = mang[i];
        }
    return min2;
}*/*/
#include <stdio.h>
int main()
{  int n2= 10;
   int n1= 6;
   int n0= 5;
   printf("n2=%d, n1=%d, n0=%d\n", n2, n1, n0);
   int* p = &n1;
   *p=9;
   p++;
   *p=15;
   p--;
   p--;
   *p=-3;
   printf("n2=%d, n1=%d, n0=%d\n", n2, n1, n0);
   getchar();
   return 0;
}

