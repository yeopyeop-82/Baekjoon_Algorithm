#define MAX 2187
#include <stdio.h>

int s[MAX][MAX] = {0, };
int n1 = 0;
int p1 = 0;
int zero = 0;

void paper (int i, int j, int n) {
    int count_p1 = 0;
    int count_zero = 0;

    for (int p = i; p < i + n; p++) {
        for (int q = j; q < j + n; q++) {
            if (s[p][q] == 1) {
                count_p1++;
            }
            else if (s[p][q] == 0) {
                count_zero++;
            }
        }
    }

    if (count_p1 == n*n) {
        p1++;
    }
    else if (count_zero == n*n) {
        zero++;
    }
    else if(!count_p1 && !count_zero){
        n1++;
    }
    else {
        for (int r = 0; r < 3; r++) {
            for (int s = 0; s< 3; s++) {
                paper(i + r * n / 3, j + s * n / 3, n / 3);
            }
        }
    }
}

int main(void) {

    int n;
    scanf("%d", &n);
    
    for (int i = 0; i < n*n; i++) {
        scanf("%d", &s[i/n][i%n]);
    }

    paper(0, 0, n);

    printf("%d\n", n1);
    printf("%d\n", zero);
    printf("%d\n", p1);

    return 0;
}