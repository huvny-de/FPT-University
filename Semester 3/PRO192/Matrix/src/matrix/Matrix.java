/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class Matrix {

    int arr[][], row, col;

    public Matrix() {
        row = col = 0;
        arr = new int[100][100];
    }

    public int[][] getArr() {
        return arr;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setArr(int[][] arr) {
        this.arr = arr;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Matrix(int[][] arr, int row, int col) {
        this.arr = arr;
        this.row = row;
        this.col = col;
    }

    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Input numbers of row: ");
        row = s.nextInt();
        s = new Scanner(System.in);
        System.out.println("Input numbers of column: ");
        col = s.nextInt();
        s = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Input array elements at array[" + i + "]" + "[" + j + "]");
                arr[i][j] = s.nextInt();
            }
        }
    }

    public void display() {
        System.out.println("Your array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        Matrix x = new Matrix();
        System.out.println("Input Array: ");
        x.input();
        x.display();
    }

}
