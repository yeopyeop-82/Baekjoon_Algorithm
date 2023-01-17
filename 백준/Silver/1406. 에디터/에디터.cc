#include <iostream>
#include <vector>
#include <string>
#include <stack>

using namespace std;

int main(void)
{
	ios::sync_with_stdio(false);
	cin.tie(0);
	cout.tie(0);

	int n;
	char c;
	string s;
	cin >> s;

	stack<char> l;
	stack<char> r;

	for (int i = 0; i < s.size(); i++)
	{
		l.push(s[i]);
	}

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		char order;
		cin >> order;
		if (order == 'L' && l.empty() == false)
		{
			r.push(l.top());
			l.pop();
		}
		else if (order == 'D' && r.empty() == false)
		{
			l.push(r.top());
			r.pop();
		}
		else if (order == 'B' && l.empty() == false)
		{
			l.pop();
		}
		else if (order == 'P')
		{
			char temp;
			cin >> temp;
			l.push(temp);
		}
	}

	while (l.empty() == false)
	{
		r.push(l.top());
		l.pop();
	}

	while (r.empty() == false)
	{
		cout << r.top();
		r.pop();
	}

	cout << '\n';

	return 0;
}