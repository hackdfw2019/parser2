package math.game_theory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class GamesOnGeneralGraphs {

	static boolean[] win, lose, vis;
	static int[] deg;							
	static ArrayList<Integer>[] adjList;		
	static int V;

	static void go()	
	{
		vis = new boolean[V];
		win = new boolean[V];
		lose = new boolean[V];
		Queue<Integer> q = new LinkedList<Integer>();
		
		while(!q.isEmpty())
		{
			int v = q.remove();
			for(int u: adjList[v])
				if(!vis[u])
				{
					if(lose[v])
						win[u] = true;
					else if(--deg[u] == 0)
						lose[u] = true;
					else
						continue;
					vis[u] = true;
					q.add(u);
				}
		}

		
	}
}
