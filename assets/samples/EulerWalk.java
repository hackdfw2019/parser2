package graphs.trees;

import java.util.*;

class EulerWalk {		

	static ArrayList<Integer>[] children;
	static int[] E, L, tin, tout;
	static int N, t;

	static void dfs(int u, int depth) 
	{
		tin[u] = t;
		E[t] = u;
		L[t++] = depth;
		for(int v: children[u])
		{
			dfs(v, depth + 1);
			E[t] = u;                
			L[t++] = depth;
		}
		tout[u] = t - 1;
	}

	static void eulerWalk(int root) 
	{
		t = 0;
		E = new int[N<<1]; 				
		L = new int[N<<1]; 				
		tin = new int[N];				
		tout = new int[N];				
		Arrays.fill(tin, -1);
		Arrays.fill(tout, -1);
		dfs(root, 0);
	}
}
