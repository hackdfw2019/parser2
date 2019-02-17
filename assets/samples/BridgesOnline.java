package graphs.traversal;

import java.util.ArrayList;

public class BridgesOnline {

	

	int[] block, comp, par, rank;
	int bridges, timer, time[];

	BridgesOnline(int V)
    {
        block = new int[V];
        comp = new int[V];
        par = new int[V];
        rank = new int[V];

        for(int i = 0; i < V; ++i)
        {
            block[i] = comp[i] = i;
            par[i] = -1;
        }
    }

    int getBlock(int x) { return block[x] == x ? x : (block[x] = getBlock(block[x])); }

    int getComp(int x) { return comp[x] == x ? x : (comp[x] = getComp(comp[x])); }

    void addEdge(int u, int v)
    {
        u = getBlock(u);
        v = getBlock(v);

        if(u == v)
            return;

        int cu = getComp(u), cv = getComp(v);
        if(cu != cv)
        {
            ++bridges;
            if(rank[cu] < rank[cv])
            {
                u ^= v; v ^= u; u ^= v;
                cu ^= cv; cv ^= cu; cu ^= cv;
            }
            makeRoot(v);
            par[v] = comp[v] = u;
            if(rank[cu] == rank[v])
                ++rank[cu];
        }
        else
            mergePath(u, v);
    }

    void makeRoot(int u)
    {
        int root = u, child = -1;
        while(u != -1)
        {
            int p = getBlock(par[u]);
            par[u] = child;
            comp[u] = root;
            child = u;
            u = p;
        }
        rank[root] = rank[child];
    }

    void mergePath(int u, int v)
    {
        ++timer;
        ArrayList<Integer> uPath = new ArrayList<>(1);
        ArrayList<Integer> vPath = new ArrayList<>(1);

        int lca = -1;
        while(true)
        {
            if(u != -1)
            {
                uPath.add(u);
                if(time[u] == timer) { lca = u; break; }

                time[u] = timer;
                u = getBlock(par[u]);
            }

            if(v != -1)
            {
                vPath.add(v);
                if(time[v] == timer) { lca = v; break; }
                time[v] = timer;
                v = getBlock(par[v]);
            }
        }

        for(int x: uPath)
        {
            block[x] = lca;
            if(x == lca) break;
            --bridges;
        }

        for(int x: vPath)
        {
            block[x] = lca;
            if(x == lca) break;
            --bridges;
        }
    }
}