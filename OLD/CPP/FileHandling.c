#include <stdio.h>
int main()
{
    FILE *fp;
    char ch;
    // opening file in read mode
    fp = fopen("Raghav.txt", "r");
    while (1)
    {
        ch = fgetc(fp);
        if (ch == EOF)
            break;
        printf("%c", ch);
    }
    fclose(fp);
    // writing to file in write mode
    fp = fopen("main.txt", "w");
    fprintf(fp, "Hello file by fprintf...\n");
    fclose(fp);
    return 0;
}