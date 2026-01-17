// Matrix Addition
#define ROWS 2
#define COLS 2
#include<stdio.h>

int main()
{
    int i, j, sum = 0;
    float res[ROWS][COLS], x[ROWS][COLS] = {
        {2.1, 2.6},
        {6.6, 7.8},
    };
    float y[ROWS][COLS] = {
        {0.5, 7.7},
        {9.4, 3.8},
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

    
    // Array Y
    printf("\n-----------  Array Y -----------\n");
    for (i = 0; i < ROWS; i++)
    {
        for (j = 0; j < COLS; ++j)
        {
            printf("%.2f \t", y[i][j]);
        }
        printf("\n");
    }

    // Matrix Addition
    printf("\n-----------  Resultant Array -----------\n");
    for (i = 0; i < ROWS; i++)
    {
        for (j = 0; j < COLS; ++j)
        {
            //sum = x[i][j] + y[i][j];
            //res[i][j] = sum;
            res[i][j] = x[i][j] + y[i][j];
            printf("%.2f \t", res[i][j]);
        }
        printf("\n");
    }

    printf("\n");
    return 0;
}
