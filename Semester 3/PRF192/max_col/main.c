/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on November 29, 2019, 8:13 AM
 */

#include <stdio.h>
#include <stdlib.h>
#define MAX_ROW 100
#define MAX_COL 100
void input(float array[][MAX_COL], int *rows, int *columns);
void output(float array[][MAX_COL], int rows, int columns);
float findMax(float array[][MAX_COL], int rows, int columns);
float findMin(float array[][MAX_COL], int rows, int columns);
int countMaxvalues(float array[][MAX_COL], int rows, int columns);

/*
 * 
 */
int main(int argc, char** argv) {
    float array[MAX_ROW][MAX_COL];
    int rows, columns;
    input(array, &rows, &columns);
    printf(" Your array is: \n");
    output(array, rows, columns);
    return (EXIT_SUCCESS);
    printf("\n The maxium value is: %5.lf", findMax( array, rows, columns));
}

void input(float array[][MAX_COL], int *rows, int *columns) {
    int r, c;
    printf(" Please input the number of rows: ");
    scanf("%d", &r);
    printf(" Please input the number of columns: ");
    scanf("%d", &c);
    *rows = r;
    *columns = c;
    float temp;
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            printf(" Input array[%d][%d] = ", i, j);
            scanf("%f", &temp);
            array[i][j] = temp;
        }
    }
}

void output(float array[][MAX_COL], int rows, int columns){
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++){
            printf("%5.1f", array[i][j]);
        }
        printf("\n");
    }
}
float findMAX(float array[][MAX_COL], int rows, int columns){
    float max = array[0][0];
    for( int i = 0; i < rows; i++){
        for( int j = 0; j < columns; j++){
            if ( max < array[i][j])
                max = array[i][j];
        }
    }
    return max;    
}
float findMin(float array[][MAX_COL], int rows, int columns){
     float min = array[0][0];
    for( int i = 0; i > rows; i++){
        for( int j = 0; j > columns; j++){
            if ( min > array[i][j])
                min = array[i][j];
        }
    }
     return min;
}
int countMaxvalues(float array[][MAX_COL], int rows, int columns){
    
}
