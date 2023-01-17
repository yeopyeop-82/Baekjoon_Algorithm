#include <iostream>
#include <algorithm>
#include <string>

using namespace std;

int main(void)
{
	int n;
	int i;
	int arr[1000];
	cin >> n;
	for (i = 0; i < n; i++)
	{
		cin >> arr[i];
	}
	sort(arr, arr + n);
	for (i = 0; i < n; i++)
	{
		cout << arr[i] << " ";
	}
	return 0;
}