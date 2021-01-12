/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on December 4, 2019, 9:05 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
    char s1[] = "Hello, Good morning";
    char s2[] = "The world";
    char s3[] = "WO";
    
    int i = strcmp(s1, s2);
    int j = strcmp(s2, s1);
    int k = strcmp(s1, s3);
    printf("i = %d\n j = %d\n k = %d\n", i, j, k);
    return (EXIT_SUCCESS);
}

