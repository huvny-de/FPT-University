#include<stdio.h>

int main()
{	int a , b;
	float result;
	char pheptoan;
	
	
	printf("Enter a:");
	scanf("%d, &a");
	printf("Enter b:");
	scanf("%d, &b");
	printf("Enter an operator (+, -, *, /): ");
	scanf("%c", &pheptoan);
	
	switch(pheptoan)
	{
		case '+':
			result = a+b;
			printf("%d +%d = %.2f", a, b, result);
			break;
		case '-':
			result = a-b;
			printf("%d-%d = %.2f", a, b, result);
			break;
		case '*':
			result = a*b;
			printf("%d*%d = %.2f", a, b, result);	
			break;
		case '/':
			result = a+b;
			printf("%d*%d = %.2f", a, b, result);
			break;	
		default:
			printf("Your operator is not valid!");
			break;
	}
	
	return 0;
}