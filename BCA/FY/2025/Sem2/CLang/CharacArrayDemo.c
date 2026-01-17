// Character Array
#define ROWS 4
#define COLS 50
#include<stdio.h>

int main()
{
    int i, j;
    char x[ROWS][COLS] = {
        "Janu",
        "Niku",
        "Hiru",
        "Jay",
    };

    // Character Array
    printf("\n-----------  Array X -----------\n");
    for (i = 0; i < ROWS; i++)
    {
        for (j = 0; j < COLS; ++j)
        {
            printf("%c", x[i][j]);
        }
        printf("\n");
    }

    printf("\n");
    return 0;
}
