package math.combinatorics;

public class BinomialCoefficient {

	
	static long[][] comb;			
	
	static long nCr1(int n , int k)
	{
		if(n < k)
			return 0;
		if(k == 0 || k == n)
			return 1;
		if(comb[n][k] != -1)
			return comb[n][k];
		if(n - k < k)
			return comb[n][k] = nCr1(n, n - k);
		return comb[n][k] = nCr1(n - 1, k - 1) + nCr1(n - 1, k);
	}
	
	
	static void nCr2(int N)		
	{
		comb = new long[N][N];
		comb[0][0] = 1;
		for (int i = 1; i < N; i++)
		{
			comb[i][0] = 1;
			for (int j = 1; j <= i; j++)
				comb[i][j] = (comb[i-1][j] + comb[i-1][j-1]);		
		}
	}
	
	
	static long nCr3(int n, int k)		
	{
		if(n < k)					
			return 0;
		if(k == 0 || k == n)		
			return 1;
		if(comb[n][k] != -1)
			return comb[n][k];
		if(n - k < k)				
			return comb[n][k] = nCr3(n, n - k);		
		return comb[n][k] = n * nCr3(n - 1, k - 1) / k;
	}
	

	
	static int nCr4(int N, int K)		
	{
		if(K > N)
			return 0;
		int res = 1;
		for(int i = 1; i <= K; ++i)
			res = (N - K + i) * res / i;
		return res;
	}
}
