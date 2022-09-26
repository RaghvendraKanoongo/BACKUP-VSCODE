#include <stdio.h>
int main()
{
    FILE *fp;
    char ch;


   fclose(fp);

    fp = fopen("main.txt", "w");
    fprintf(fp, "Hello file by fprintf...\n");
    fclose(fp);
    return 0;
}