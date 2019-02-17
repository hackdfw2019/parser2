package math;

public class Exponentiation {
	
	
	static int pow(int a, int e)	
	{
		int res = 1;
		while(e > 0)
		{
			if((e & 1) == 1)
				res *= a;
			a *= a;
			e >>= 1;
		}
		return res;
	}
	
	
	static int modPow(int a, int e, int mod)	
	{
		a %= mod;
		int res = 1;
		while(e > 0)
		{
			if((e & 1) == 1)
				res = (res * a) % mod;
			a = (a * a) % mod;
			e >>= 1;
		}
		return res;
	}
	
	
	static int[][] matMul(int[][] A, int[][] B, int p, int q, int r)	
	{
		int[][] C = new int[p][r];
		for(int i = 0; i < p; ++i)
			for(int j = 0; j < r; ++j)
				for(int k = 0; k < q; ++k)
					C[i][j] += A[i][k] * B[k][j];
		return C;
	}
	
	
	static int[][] matPow(int[][] base, int p)
	{
		int n = base.length;
		int[][] ans = new int[n][n];
		for(int i = 0; i < n; i++)
			ans[i][i] = 1;
		while(p != 0)
		{
			if((p & 1) == 1)
				ans = matMul(ans, base, n, n, n);
			base = matMul(base, base, n, n, n);
			p >>= 1;
		}
		
		return ans;
	}
	
	
	static String powBig(int a, int b)
	{
		int[] ret = new int[5000];
		ret[4999] = 1;
		while(b-->0)
		{
			int c = 0;
			for(int j = 4999; j >= 0; --j)
			{
				int p = c + a * ret[j];
				c = p/10;
				ret[j] = p%10;
				
			}
		}
		String s = "";
		for(int i = 0; i < ret.length; ++i)
			if(!s.isEmpty() || ret[i] != 0)
				s += ret[i];
		return s;
	}
}
