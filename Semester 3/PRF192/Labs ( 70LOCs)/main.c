/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on January 10, 2020, 3:06 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {

    return (EXIT_SUCCESS);
}
int Menu(int choice){
    printf("--------Menu--------");
    printf("Please choose your option");
    printf("1. Definition of a prime.\n2. Definition of Fibonacci sequence. ");
    scanf("%d", &choice);
    return choice;
}


