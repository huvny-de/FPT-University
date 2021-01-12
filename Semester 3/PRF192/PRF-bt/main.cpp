/* 
 * File:   main.cpp
 * Author: Henry
 *
 * Created on November 15, 2019, 8:14 AM
 */
#include<stdio.h>
#include <cstdlib>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    int a,b,c;
    printf(" Input a = ");
    scanf( "%d", &a);
    printf(" Input b = ");
    scanf( "%d", &b);
    printf(" Input c = ");
    scanf( "%d", &c);
    if (a < b)
        a = b;
    if (a < c)
        a = c;
    printf("GTLN = : %d", a);
    

    return (EXIT_SUCCESS);
}

