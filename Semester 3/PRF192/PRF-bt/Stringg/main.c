/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on December 4, 2019, 8:09 AM
 */

#include <stdio.h>
#include <stdlib.h>
/*
 * 
 */
void getstr( char s[50], int max)
int main(int argc, char** argv) {
    getstr(s, c, max);
    printf(" %s", s);
    

    return (EXIT_SUCCESS);
}
void getstr( char s[50], int max){
    int i, c;
    i = 0;
    while(( c = getchar()) != '\n' && c != EOF)
        if( i < max)
            s[i++] = (char) c;
    s[i] = '\0';
}


