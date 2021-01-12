/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on November 20, 2019, 7:31 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
    int arr[]={20,2,5,8,12,15,32,19,21};
    for (int i = 0, i < 9, i++){
        printf("arr[%d] = %d", i, arr[i]);
    }
}
    return (EXIT_SUCCESS);
}