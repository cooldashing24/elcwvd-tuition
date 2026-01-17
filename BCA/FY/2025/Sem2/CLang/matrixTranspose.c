// Matrix's Transpose
#define ROWS 3
#define COLS 2
#include<stdio.h>

int main()
{
    int i, j;
    float x[ROWS][COLS] = {
        {2.1, 2.6},
        {6.6, 7.8},
        {4.6, 8.8},
    };

    // Array X
    printf("\n-----------  Array X -----------\n");
    for (i = 0; i < ROWS; i++)
    {
        for (j = 0; j < COLS; ++j)
        {
            printf("%.2f \t", x[i][j]);
        }
        printf("\n");
    }

    // Matrix Transpose
    printf("\n-----------  Matrix's Transpose -----------\n");
    for (i = 0; i < COLS; i++)
    {
        for (j = 0; j <  ROWS; ++j)
        {
            printf("%.2f \t", x[j][i]);
        }
        printf("\n");
    }

    printf("\n");
    return 0;
}
