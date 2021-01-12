/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on December 11, 2019, 8:25 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
    FILE *p;
    p = fopen( "C:\\Temp\\mytextfile.txt", "w");
    if(p == NULL){
        printf(" Can not open file. Error! ");
        return 0;
    }
    char c = getchar();
    while( c != 48){
        fputc(c, p);
        c = getchar();
    }
    fclose(p);
}


