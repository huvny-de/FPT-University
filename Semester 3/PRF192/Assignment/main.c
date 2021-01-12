/* 
 * File:   main.c
 * Author: Henry
 *
 * Created on December 12, 2019, 7:20 AM
 */

#include <stdio.h>

#include <stdlib.h>

#include<string.h>

#include<windows.h>

#define MAX 100

/*
 * 
 */
typedef struct COUNTRY {
  char code[30];
  char name[30];
  float area;
  int population;
};

void input(int mang[10]);
int secondSmallestNum(int mang[10]);
void swap(int * a, int * b);
void swap2(int a, int b, struct COUNTRY list[MAX]);
void input2(struct COUNTRY list[MAX], int * n);
void display(struct COUNTRY country);
void displayAll(struct COUNTRY list[MAX], int n);
void sortPopulationDescending(struct COUNTRY list[MAX], int n);

int main() {
  struct COUNTRY list[MAX];
  char option2, c;
  int n, g;
  int mang[10];
  int option;
  do {
    printf("Please choose one of options below : \n");
    printf("1. Question 1\n");
    printf("2. Question 2\n");
    printf("3. Quit program\n");
    scanf("%d", & option);
    switch (option) {
    case 1:
      printf("Your choose is 1\nInput 10 integer numbers : \n");
      input(mang);
      printf("Your second smallest number is : %d\n\n", secondSmallestNum(mang));
      break;
    case 2:
      printf("Your choose is 2\n");
      input2(list, & n);
      printf("All information about your countries : \n");
      displayAll(list, n);
      printf("\nYour countries when they were sorted in descending order : \n");
      sortPopulationDescending(list, n);
      displayAll(list, n);
      printf("\n");
      break;
    case 3:
      option2 = 'y';
      break;

    }
  }
  while (option2 != 'y');

  return 0;
}

void input(int mang[10]) {
  for (int i = 0; i < 10; i++) {
    printf("Input the #%d number: ", i);
    scanf("%d", & mang[i]);
  }
}

void swap(int * a, int * b) {
  int temp = * a;
  * a = * b;
  * b = temp;
}

void swap2(int a, int b, struct COUNTRY list[MAX]) {
  struct COUNTRY temp = list[a];
  list[a] = list[b];
  list[b] = temp;
}

int secondSmallestNum(int mang[10]) {
  for (int i = 0; i < 10; i++) {
    for (int j = i + 1; j < 10; j++) {
      if (mang[i] > mang[j]) swap( & mang[i], & mang[j]);
    }
  }
  for (int j = 1; j < 10; j++) {
    if (mang[j] != mang[0]) {
      return mang[j];
      break;
    }
  }

}

void input2(struct COUNTRY list[MAX], int * n) {
  printf("Input number of country you have to manage: ");
  scanf("%d", n);
  for (int i = 0; i < * n; i++) {
    printf("Input information of country #%d: ", i+1);
    printf("\nCode: ");
    setvbuf(stdin,NULL,_IONBF,0);
    scanf("%[^\n]", list[i].code);
    printf("Name: ");
    setvbuf(stdin,NULL,_IONBF,0);
    scanf("%[^\n]", list[i].name);
    printf("Area: ");
    setvbuf(stdin,NULL,_IONBF,0);
    scanf("%f", & list[i].area);
    printf("Population: ");
    setvbuf(stdin,NULL,_IONBF,0);
    scanf("%d", & list[i].population);
    printf("\n");
  }
}

void display(struct COUNTRY country) {
  printf("\n - Code : %s", country.code);
  printf("\n - Name : %s", country.name);
  printf("\n - Area : %.1f", country.area);
  printf("\n - Population : %d", country.population);
}

void displayAll(struct COUNTRY list[MAX], int n) {
  for (int i = 0; i < n; i++) {
    display(list[i]);
    printf("\n");
  }
}

void sortPopulationDescending(struct COUNTRY list[MAX], int n) {
  for (int i = 0; i < n; i++) {
    for (int j = i + 1; j < n; j++) {
      if (list[i].population < list[j].population)
          swap2(i, j, list);
    }
  }
}