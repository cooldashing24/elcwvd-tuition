// Matrix Addition
#define ROWS 2
#define COLS 2
#include<stdio.h>

int main()
{
    int i, j;
    float x[][COLS] = {
        {2.1, 2.6},
        {6.6, 7.8},
    };
    float y[][COLS] = {
        {0.5, 7.7},
        {9.4, 3.8},
    };

    // Array X
    printf("\n-----------  Array X -----------\n");
    for (i = 0; i < ROWS; i++)
    {
        for (j = 0; j < COLS; ++j)
        {
            printf("%.2f", x[i][j]);
        }
        printf("\n");
    }

    
    // Array Y
    printf("\n-----------  Array Y -----------\n");
    for (i = 0; i < ROWS; i++)
    {
        for (j = 0; j < COLS; ++j)
        {
            printf("%.2f", y[i][j]);
        }
    }
    

    printf("\n");
    return 0;
}
