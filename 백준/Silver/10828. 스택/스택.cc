#include <iostream>
#include <stack>
#include <string>

using namespace std;

int main(void)
{
	int n;
	int i;
	cin >> n;
	stack<int> s;
	for (i = 0; i < n; i++)
	{
		string order;
		cin >> order;
		if (order == "push")
		{
			int temp;
			cin >> temp;
			s.push(temp);
		}
		else if (order == "pop")
		{
			if (s.empty())
				cout << -1 << '\n';
			else
			{
				cout << s.top() << '\n';
				s.pop();
			}
		}
		else if (order == "size")
		{
			cout << s.size() << '\n';
		}
		else if (order == "empty")
		{
			if (s.empty())
				cout << 1 << '\n';
			else
				cout << 0 << '\n';
		}
		else if (order == "top")
		{
			if (s.empty())
				cout << -1 << '\n';
			else
				cout << s.top() << '\n';
		}
	}
}