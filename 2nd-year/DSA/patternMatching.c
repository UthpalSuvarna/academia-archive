#include <stdio.h>

char STR[100], PAT[100], REP[100], RES[100];

int pattern_match_replace() {
    int i = 0, c = 0, m = 0, k = 0, j = 0, flag = 0;
    while (STR[c] != '\0') {
        if (STR[m] == PAT[i]) {
            i++;
            m++;
            if (PAT[i] == '\0') {
                flag = 1;
                for (k = 0; REP[k] != '\0'; k++, j++) {
                    RES[j] = REP[k];
                }
                i = 0;
                c = m;
            }
        } else {
            RES[j] = STR[c];
            j++;
            c++;
            m = c;
            i = 0;
        }
    }
    RES[j] = '\0'; 
    return flag;
}


int main()
{
    int ch;
    printf("\n Enter the string: ");
    scanf("%s", STR);
    printf("\n Enter the pattern: ");
    scanf("%s", PAT);
    printf("\n Enter the replacement: ");
    scanf("%s", REP);
    ch = pattern_match_replace();
    if (ch == 1)
    {
        printf("\n The resultant string is: %s", RES);
    }
    else
    {
        printf("\n Pattern not found");
    }
    return 0;
}