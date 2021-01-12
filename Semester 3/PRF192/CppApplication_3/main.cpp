#include<stdio.h>
int main(int argc, char *argv[]) {
	int a,b;
	float result;
	char pheptoan;
	printf("input a,b:");
	scanf("%d%d", &a, &b);
	setvbuf(stdin,Null,_IONBF,0);
	printf("input operator(+,-,*,/):");
	scanf("%c",&pheptoan);
		switch (pheptoan)
		{
		case '+':
			result = a+b;
			printf("%d+%d=%.2f",a,b,result);
			break;
		case '-':
			result = a-b;
			printf("d-%d=%.2f",a,b,result);
			break;
		case '*':
			result=a*b;
			printf("%d*%d = %.2f",a,b,result);
			break;
		case '/':
			result=(float)a/(float)b;
			printf("%d/%d=%.2f",a,b,result);
			break;
		default:
			printf("your operator is not valid.");
			break;
		}
	return 0;
}