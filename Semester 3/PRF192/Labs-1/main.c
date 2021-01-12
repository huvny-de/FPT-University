/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on January 8, 2020, 4:13 PM
 */

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

/*
 * 
 */
int squareCheck(int n);
int main(int argc, char ** argv) {
  int n, D;
  do {
    printf("-- -- -- -- - Checking square number program-- -- -- -- - \n");
    printf("Enter an integer(not a negative number!): ");
    scanf("%d", & n);
    if (n < 0)
      printf(" Please do not enter a negative number!\n");
    else {
      if (squareCheck(n) == 1) {
          D = sqrt(n);
          printf(" It is a square number %d = %d x %d\n",  n, D, D);
      } else {
        printf(" %d is not a square number.\n", n);
      }
    }
  }while ( n >= 0);
}
int squareCheck(int n) {
  int i = sqrt(n);
  if (n == i * i) 
      return 1;
  return 0;
}

