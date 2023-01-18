#include <iostream>
#include <cstring>
#include <queue>

using namespace std;

int n;
char RGB_map[100][100];
bool visit[100][100];

int dx[] = { 0, 0, 1, -1 };
int dy[] = { 1, -1, 0, 0 };

queue<pair<int, int> > q;

void print_arr()
{
	cout << "============================\n";
	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < n; j++)
		{
			cout << RGB_map[i][j];
		}
		cout << '\n';
	}
	cout << "============================\n";
	cout << '\n';
}

void bfs(int a, int b)
{
	q.push(make_pair(a, b));
	visit[a][b] = true;

	while (!q.empty())
	{
		int x = q.front().first;
		int y = q.front().second;
		q.pop();

		for (int i = 0; i < 4; i++)
		{
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && ny >= 0 && nx < n && ny < n)
			{
				if (visit[nx][ny] == false)
				{
					if (RGB_map[nx][ny] == RGB_map[x][y])
					{
						visit[nx][ny] = true;
						q.push(make_pair(nx, ny));
					}
				}
			}
		}
	}
}

int main(void)
{
	ios::sync_with_stdio(false);
	cin.tie(0);
	cout.tie(0);

	int normal_ans = 0;
	int colorBlindness_ans = 0;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < n; j++)
		{
			cin >> RGB_map[i][j];
		}
	}

	//print_arr();

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < n; j++)
		{
			if (visit[i][j] == false)
			{
				bfs(i, j);
				normal_ans++;
			}
		}
	}

	memset(visit, false, sizeof(visit));

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < n; j++)
		{
			if (RGB_map[i][j] == 'G')
			{
				RGB_map[i][j] = 'R';
			}
		}
	}

	//print_arr();

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < n; j++)
		{
			if (visit[i][j] == false)
			{
				bfs(i, j);
				colorBlindness_ans++;
			}
		}
	}

	cout << normal_ans << " " << colorBlindness_ans;

	//system("pause");

	return 0;
}
