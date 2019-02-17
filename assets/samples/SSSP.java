package graphs.shortest_path;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;


public class SSSP {

	static final int INF = (int)1e9;	
	static ArrayList<Edge>[] adjList;
	static int V;
	
	
	static int dijkstra(int S, int T)	
	{
		int[] dist = new int[V];
		Arrays.fill(dist, INF);
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		dist[S] = 0;
		pq.add(new Edge(S, 0));						
		while(!pq.isEmpty())
		{
			Edge cur = pq.remove();
			if(cur.node == T)						
				return dist[T];
			if(cur.cost > dist[cur.node])			
				continue;
			for(Edge nxt: adjList[cur.node])
				if(cur.cost + nxt.cost < dist[nxt.node])
					pq.add(new Edge(nxt.node, dist[nxt.node] = cur.cost + nxt.cost ));
		}
		return -1;
	}
	
	
	static boolean bellmanFord(int S)		
	{
		int[] dist = new int[V];
		Arrays.fill(dist, INF);
		dist[S] = 0;
		boolean modified = true;
		for(int k = 0; modified && k < V - 1; ++k)
		{
			modified = false;
			for(int u = 0; u < V; ++u)		
				for(Edge nxt: adjList[u])	
					if(dist[u] + nxt.cost < dist[nxt.node])
					{
						modified = true;
						dist[nxt.node] = dist[u] + nxt.cost;
					}
		}
		
		boolean hasNegCycle = false;
		for(int u = 0; u < V; ++u)
			for(Edge nxt: adjList[u])
				if(dist[u] + nxt.cost < dist[nxt.node])
					hasNegCycle = true;
		return hasNegCycle;
	}
	
	static class Edge implements Comparable<Edge>
	{
		int node, cost;
		
		Edge(int a, int b) { node = a;	cost = b; }
		
		public int compareTo(Edge e){ return cost - e.cost;	}
	}
}
