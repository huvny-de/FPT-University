/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on November 27, 2019, 9:02 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
    int *p,n,m;
    printf("input row:");
    scanf("%d",&n);
    printf("input col:");
    scanf("%d",&m);
    p=(int*)malloc(n*m * sizeof(int));
    for (int i = 0; i < n; i++){
        for (int j = 0; j < m; j++) {
            printf(" input value at arr[%d][%d] = ", i, j);
            scanf("%d",( p + m * i + j));
            }
        }
    printf(" Your 2D array:\n");
    for(int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++){
            printf("%4d",*( p + m * i + j));
        }
        printf("\n");
    }
    int high=*p;
    for (int i = 0; i < n; i++)
        {
        for(int j = 0; j < m; j++){
            if(high <*( p + m * i + j))
                high = *( p + m * i + j);
        }
    }
    int low=*p;
    for (int i = 0; i < n; i++)
        {
        for(int j = 0; j < m; j++){    
            if(low>*( p + m * i + j))
                low=*( p + m * i + j);
        }
    }        
    printf("Max of array[%d][%d] is:%d \n",n,m,high);
    printf("Min of array[%d][%d] is:%d \n",n,m,low);
    int Max,countmax=0;
    for (int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++){
            if(*( p + m * i + j) == high){
                Max=high;
                countmax++;   
            }
        }
    }
    printf("\nMax appear %d",countmax);
    return (EXIT_SUCCESS);
}

