/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on December 11, 2019, 9:05 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {

    return (EXIT_SUCCESS);
}
void readFile( char *filename){
    FILE *p;
    p = fopen( file name, "r");
    if( p == NULL){
        printf(" Can not open file. Error!");
        return;
    }
    char c = fgetc(p);
    while( c != EOF){
        putchar(c);
        c = fgetc(p);
    }
    fclose(p);
}
void

