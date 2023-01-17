#include<iostream>
#include<string>

using namespace std;

int count = 0;
void groupCheck(string a);

int main(void)
{
	int n, i;
	cin >> n;
	string str;


	for (i = 0; i < n; i++)
	{
		cin >> str;
		groupCheck(str);
	}

	cout << count;
	
	return 0;
}

void groupCheck(string a)
{
	int length = a.size();
	int i, j;

	for (i = 0; i < length; i++)
	{
		if (a[i] != a[i + 1])
		{
			for (j = i + 2; j < length; j++)
			{
				if (a[j] == a[i])
					return;
			}
		}
	}

	count++;
}