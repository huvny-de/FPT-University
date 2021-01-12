/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on December 24, 2019, 12:14 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
    int choice = 6;
    switch(choice){
        case 2:
            printf("case2");
        case 4:
            printf("case4");
        case 6:
            printf("case6\n");
        case 7:
            printf("case7\n");
        case 9:
            printf("case9\n");
        default:
            printf("The other cases!\n");
        
    }

    return 0;
}

