package graphs.special;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;





public class MCBM {


	static int V, n, m, match[];	
	static ArrayList<Integer>[] adjList;	
	static boolean[] vis;
	static int go()
	{
		
		int matches = 0;
		match = new int[m];
		Arrays.fill(match, -1);
		for(int i = 0; i < n; ++i)
		{
			vis = new boolean[n];
			matches += aug(i);
		}
		return matches;
	}
	
	static int aug(int u)	
	{
		vis[u] = true;
		for(int v : adjList[u])
			if(match[v] == -1 || !vis[match[v]] && aug(match[v]) == 1)
			{
				match[v] = u;
				return 1;
			}
		return 0;
	}
	


	static int[] pair_U, pair_V, dist;
	static final int NIL = 0, INF = (int)1e9;
	static int hopcroftKarp()
	{
		pair_U = new int[n + 1];	
		pair_V = new int[m + 1];	
		dist = new int[n + 1];
		
		int matching = 0;
		while(bfs())
			for(int u = 1; u <= n; ++u)
				if(pair_U[u] == NIL && dfs(u))
					++matching;
		return matching;
	}	
	static boolean bfs()
	{
		Queue<Integer> q = new LinkedList<Integer>();
		for(int u = 1; u <= n; ++u)
			if(pair_U[u] == NIL)
			{
				dist[u] = 0;
				q.add(u);
			}
			else
				dist[u] = INF;
		dist[NIL] = INF;
		while(!q.isEmpty())
		{
			int u = q.remove();
			if(dist[u] < dist[NIL])
				for(int v : adjList[u])
					if(dist[pair_V[v]] == INF)
					{
						dist[pair_V[v]] = dist[u] + 1;
						q.add(pair_V[v]);
					}
		}
		return dist[NIL] != INF;
	}
	
	static boolean dfs(int u)
	{
		if(u == NIL)
			return true;
		
		for(int v : adjList[u])
			if(dist[pair_V[v]] == dist[u] + 1 && dfs(pair_V[v]))
			{
				pair_U[u] = v;
				pair_V[v] = u;
				return true;
			}
		dist[u] = INF;
		return false;
		
					
	}
	
	
	

	
}
