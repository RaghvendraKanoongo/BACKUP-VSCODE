#include <stdio.h>
int main()
{
    FILE *fp;
    char ch;

    fp = fopen("Raghav.txt", "r");
    
    fclose(fp);

    fp = fopen("Raghav.txt", "w");
    fprintf(fp, "Hello file by fprintf...\n");
    fclose(fp);
    return 0;
}