/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on November 18, 2019, 7:20 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*way 2:
 * int num = 100;
 * int i = 1;
 * for (; i <= num; i++) {
        if( i % 9 == 0)
            printf("%4d", i);
    }
 * 
 * way 3:
 * int i = 1;
 * for(; ;){
 *  if(i % 9 == 0)
 *     printf("%4d", i);
 *       if ( i > num )
 *             break; 
 * }
 */
int main(int argc, char** argv) {
    int num = 100;
    for (int i = 1; i <= num; i++) {
        if( i % 9 == 0)
            printf("%4d", i);
    }

    return (EXIT_SUCCESS);
}

