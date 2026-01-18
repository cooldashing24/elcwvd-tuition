#include<stdio.h>
// Menu Driven Arithmetic Fun

void display (float a, float b)
{
    printf("\n-------");
    printf("\nValue of First Variable: %.2f", a);
    printf("\nValue of Second Variable: %.2f", b);
}

float add (float x, float y)
{
    display(x, y);
    return x + y;
}

float sub (float m, float n)
{
    display(m, n);
    return m - n;
}

float mul (float x, float y)
{
    display(x, y);
    return x * y;
}

float div (float x, float y)
{
    display(x, y);
    return x / y;
}

int rem (float x, float y)
{
    display(x, y);
    return (int)x % (int)y;
}

int main()
{
    // float z = add(0, 6);
    // printf("\nSum: %.2f", z);

    // printf("\nSub: %.2f", sub(10.6, 0.8));

    char choice;
    printf("\nPress '+' for Add");
    printf("\nPress '-' for Sub");
    printf("\nPress '*' for Mul");
    printf("\nPress '/' for Div");
    printf("\nPress '%%' for Rem");
    printf("\nEnter your choice: ");
    scanf("%c", &choice);

    float n1, n2;
    printf("\nEnter two #s: ");
    scanf("%f %f", &n1, &n2);
    
    switch (choice)
    {
        case '+':
            printf("\nSum: %.2f", add(n1, n2));
            break;

        case '-':
            printf("\nMinus: %.2f", sub(n1, n2));
            break;

        case '*':
            printf("\nGunakaar: %.2f", mul(n1, n2));
            break;

        case '/':
            printf("\nBhagakaar: %.2f", div(n1, n2));
            break;

        case '%':
            printf("\nRemainder: %d", rem(n1, n2));
            break;
        
        default:
            break;
    }

    printf("\n");
    return 0;
}
