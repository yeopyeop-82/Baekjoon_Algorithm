#include <iostream>

using namespace std;

int gcd(int a, int b)
{
	int r;
	while (b != 0)
	{
		r = a % b;
		a = b;
		b = r;
	}
	return a;
}

int lcm(int a, int b)
{
	int m;
	m = a * b;
	return m / gcd(a, b);
}

int main(void)
{
	int a, b;

	cin >> a;
	cin >> b;

	cout << gcd(a, b) << endl;
	cout << lcm(a, b) << endl;
	return 0;
}