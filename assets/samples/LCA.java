package graphs.trees;

import java.util.Arrays;


public class LCA {

	
	static int N, L[], P[][];			
	
	static void preprocessParents(int root, int[] T)	
	{
		int k = 0; while(1<<k+1 < N) ++k;		
		
		P = new int[N][k + 1];
		
		for(int i = 0; i < N; i++)
			Arrays.fill(P[i], -1);
		
		
		for(int i = 0; i < N; ++i)
			P[i][0] = T[i];					
		
		for(int j = 1; j <= k; j++)			
			for(int i = 0; i < N; i++)
				if(P[i][j-1] != -1)
					P[i][j] = P[P[i][j-1]][j-1];
	}
	
	 static int query(int p, int q)		
	 {
		  
		 if (L[p] < L[q]) { p ^= q; q ^= p; p ^= q; }
		 
		 
		 int k = 0;
		 while(1<<k+1 <= L[p])
			 ++k;
		 
		 
		 for (int i = k; i >= 0; --i)
			 if (L[p] - (1<<i) >= L[q])
				 p = P[p][i];
		 
		 if (p == q)
			 return p;
		 
		 
		 for (int i = k; i >= 0; --i)
			 if (P[p][i] != -1 && P[p][i] != P[q][i])
			 {
				 p = P[p][i]; q = P[q][i];
			 }
		 
		 return P[p][0];
	 }	
	
	 
}
