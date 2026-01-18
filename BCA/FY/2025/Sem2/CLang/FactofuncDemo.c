#include<stdio.h>

// Factorial Fun

/*
DataType functionNaam([DataType parameters])
{


}
*/

void factorialDemo (float num)
{
    float res = 1;
    for (float i = 1; i <= num; i++)
    {
        res *= i;
    }
    
    printf("Factorial of %.2f is %.2f", num, res);
}

int main()
{
    // replace with user input
    float n = 5;
    factorialDemo(n);

    printf("\n");
    return 0;
}
