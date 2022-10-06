#include<stdio.h>
#include<string.h>
#define size 50
char stack[size];
int top=-1;

void push(char ch){
	stack[++top]=ch;
}
char pop(){
	return stack[top--];
}
int isNumber(char ch){
	if((ch>='0' && ch<='9') || (ch>='a' && ch<='z'))
	return 1;
	return 0;
}
int isOperator(char ch){
	if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
	return 1;
	return 0;
}
int isOpenPerenthesis(char ch){
	if(ch=='(')
	return 1;
	return 0;
}
int isClosePerenthesis(char ch){
	if(ch==')')
	return 1;
	return 0;
}
int precedence(char ch){
	switch(ch){
		case '(':
			return 2;
        case '*':
            return 3;
        case '/':
            return 3;
        case '+':
            return 2;
        case '-':
            return 2;
    }
}
int main(){
	char infix[100],postfix[100];
	printf("Enter one infix expresion\n");
	fgets(infix,sizeof(infix),stdin);
	
	int i=0,j=0;
	char cha;
	while(infix[i]!='\0'){
		if(isOperator(infix[i])){
			if(precedence(infix[i])<precedence(stack[top])){
			postfix[j]=pop();
			j++;
			push(infix[i]);
			}
			else{
			push(infix[i]);
			}
		}
		if(isOpenPerenthesis(infix[i]))
		push(infix[i]);

		if(isNumber(infix[i])){
			postfix[j]=infix[i];
			j++;
		}

		if(isClosePerenthesis(infix[i])){
			while(1){
				cha=pop();
				if(cha=='(')
				break;
				postfix[j]=cha;
				j++;
			}
		}
		i++;
	}
	while(top!=-1){
		postfix[j]=pop();
		j++;
	}
	puts(postfix);

	return 0;
}