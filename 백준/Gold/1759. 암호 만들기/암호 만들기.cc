#include <iostream>
#include <algorithm>

using namespace std;

char password[16];
char temp[16];
int l;
int c;

bool check(char a[])
{
	int mo = 0;
	int ja = 0;
	int i = 0;

	for (i = 0; a[i] != '\0'; i++)
	{
		if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' ||
			a[i] == 'o' || a[i] == 'u')
		{
			mo++;
		}
		else
		{
			ja++;
		}
	}
	return (mo >= 1 && ja >= 2);
}

void dfs(int start, int dep)
{
	if (dep == l)
	{
		if (check(temp))
		{
			for (int i = 0; i < l; i++)
			{
				cout << temp[i];
			}

			cout << '\n';
		}
		return;
	}
	for (int i = start; i < c; i++)
	{

		temp[dep] = password[i];
		dfs(i + 1, dep + 1);
	}
}

int main(void)
{
	ios::sync_with_stdio(false);
	cin.tie(0);
	cout.tie(0);

	cin >> l;
	cin >> c;
	for (int i = 0; i < c; i++)
	{
		cin >> password[i];
	}

	sort(password, password + c);

	dfs(0, 0);
}