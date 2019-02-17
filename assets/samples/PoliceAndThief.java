package math.game_theory;

import java.util.ArrayList;


public class PoliceAndThief {

	static final int[] dx = new int[] {0, 0, 0, -1, 1, -1, 1, -1, 1};
	static final int[] dy = new int[] {0, -1, 1, 0, 0, -1, 1, 1, -1};

	static final int POLICE = 0, THIEF = 1;
	static int R, C;
	static char[][] grid;
	
	static boolean[] vis, win, lose;
	static int[] deg;
	static ArrayList<Integer>[] adjList;
	

	static void findWinner()	
	{
		

		for(int turn = 0; turn < 2; ++ turn)
			for(int p = 0; p < R * C; ++p)
				for(int t = 0; t < R * C; ++t)
				{
					int px = p / C, py = p % C, tx = t / C, ty = t % C;
					if(grid[px][py] == '*' || grid[tx][ty] == '*')
						continue;
					int state = mapState(p, t, turn);
					
					if(turn == POLICE)
					{
						win[state] = p == t;
						lose[state] = !win[state] && grid[tx][ty] == 'E';
					}
					else
					{
						win[state] = grid[tx][ty] == 'E';
						lose[state] = !win[state] && p == t;
					}
					
					if(win[state] || lose[state])
						continue;
					
					
					int nxtState = mapState(p, t, turn ^ 1);
					adjList[nxtState].add(state);
					deg[state] = 1;
					
					
					int pk = turn == POLICE ? 1 : 0;
					int tk = turn == THIEF ? 1 : 0;
					for(int k = 1, end = turn == POLICE ? 8 : 4; k <= end; ++k)
					{
						
						int ppx = px + dx[k * pk], ppy = py + dy[k * pk];
						int ttx = tx + dx[k * tk], tty = ty + dy[k * tk];
						if(valid(ppx, ppy) && valid(ttx, tty))
						{
							nxtState = mapState(ppx * C + ppy, ttx * C + tty, turn ^ 1);
							adjList[nxtState].add(state);
							++deg[state];
						}
					}
				}



		
	}
	
	static boolean valid(int x, int y) { return x >= 0 && y >= 0 && x < R && y < C && grid[x][y] != '#'; }

	static int mapState(int p, int t, int turn) { return (p * R * C + t) * 2 + turn; }
}
