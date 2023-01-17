#include<iostream>
#include<queue>
#include<cstring>
#include<algorithm>

using namespace std;

int n, m;
int arr[101][101];
bool visit[101][101];
int dx[4] = { 1, -1, 0, 0 };
int dy[4] = { 0, 0, -1, 1 };

int bfs() 
{
	queue<pair<pair<int, int>, int>> q;

	q.push(make_pair(make_pair(0, 0), 1));

	visit[0][0] = 1;

	while (!q.empty()) {
		int x = q.front().first.second;
		int y = q.front().first.first;
		int distance = q.front().second;

		q.pop();

		if (x == m - 1 && y == n - 1)
			return distance;

		for (int i = 0; i<4; i++) 
		{
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx < 0 || ny < 0 || nx >= m || ny >= n)
				continue;
			if (visit[ny][nx] == 1)
				continue;
			if (arr[ny][nx] != 1)
				continue;

			q.push(make_pair(make_pair(ny, nx), distance + 1));

			visit[ny][nx] = 1;
		}
	}
}

int main() {

	scanf("%d %d", &n, &m);

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < m; j++)
		{
			scanf("%1d", &arr[i][j]);
		}
	}

	printf("%d", bfs());

	return 0;
}
