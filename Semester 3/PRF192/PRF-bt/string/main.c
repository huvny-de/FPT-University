/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on December 4, 2019, 7:19 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*char s[] => char *s
 * char s[10][50] ( 10 str, 50 char) => char *s[]; => char **s
 */
int main(int argc, char** argv) {
    char love[20] = 'love love z'
    printf("Your word:\n %s\n", love);

    return (EXIT_SUCCESS);
}

