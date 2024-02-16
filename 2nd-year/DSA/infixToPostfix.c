#include <stdio.h>
#include <string.h>

int stack(char symbol) {
    switch (symbol) {
    case '+':
        return 2;
    case '-':
        return 2;
    case '*':
        return 4;
    case '/':
        return 4;
    case '^':
        return 4;
    case '%':
        return 6;
    case '(':
        return 0;
    case '#':
        return -1;
    default:
        return 8;
    }
}

int input(char symbol) {
    switch (symbol) {
    case '+':
        return 1;
    case '-':
        return 1;
    case '*':
        return 3;
    case '/':
        return 3;
    case '^':
        return 3;
    case '%':
        return 5;
    case '(':
        return 9;
    case ')':
        return 0;
    default:
        return 7;
    }
}

void infix_postfix(char infix[], char postfix[]) {
    int top = -1, j = 0, i;
    char s[30], symbol;
    s[++top] = '#';
    for (i = 0; i < strlen(infix); i++) {
        symbol = infix[i];
        while (stack(s[top]) > input(symbol)) {
            postfix[j++] = s[top--];
        }
        if (stack(s[top]) != input(symbol)) {
            s[++top] = symbol;
        } else {
            top--;
        }
    }
    while (s[top] != '#') {
        postfix[j++] = s[top--];
    }
    postfix[j] = '\0';
    printf("The postfix expression is %s\n", postfix);
}

int main() {
    char infix[20], postfix[20];
    strcpy(infix, "a+b");
    infix_postfix(infix, postfix);
    return 0;
}