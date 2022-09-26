#include <stdio.h>
int main()
{
    FILE *fp;
    char ch;

    

    fp = fopen("main.txt", "w");
    fprintf(fp, "Hello file by fprintf...\n");
    fclose(fp);
    fp = fopen("main.txt", "r");
    while (1)
    {
        ch = fgetc(fp);
        if (ch == EOF)
            break;
        printf("%c", ch);
    }
    fclose(fp)
    return 0;
}