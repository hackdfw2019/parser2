package math.number_theory;

import java.util.ArrayList;

public class PrimeFactorization {

	static ArrayList<Integer> primes;					

		
	static ArrayList<Integer> primeFactors(int N)		
	{
		ArrayList<Integer> factors = new ArrayList<Integer>();		
		int idx = 0, p = primes.get(idx);

		while(p * p <= N)
		{
			while(N % p == 0) { factors.add(p); N /= p; }
			p = primes.get(++idx);
		}

		if(N != 1)						
			factors.add(N);				
		return factors;
	}

	
	static long sumDiv(int N)
	{
		int idx = 0, p = primes.get(0);
		long ans = 1;
		while(p * p <= N)
		{
			int e = 0;
			while(N % p == 0) { N /= p; ++e; }
			ans *= (pow(p, e + 1) - 1) / (p - 1);
			p = primes.get(++idx);
		}
		if(N != 1)
			ans *= (pow(N, 2) - 1) / (N - 1);
		return ans;
	}
	
	
	static int phi(int N)
	{
		int ans = N, idx = 0, p = primes.get(0);
		while(p * p <= N)
		{
			if(N % p == 0)
				ans -= ans / p;
			while(N % p == 0)
				N /= p;
			p = primes.get(++idx);
		}
			
		if(N != 1) 
			ans -= ans / N;
		return ans;
	}

	static long pow(long a, int n)
	{
		long res = 1;
		while(n != 0)
		{
			if((n & 1) == 1)
				res *= a;
			a *= a;
			n >>= 1;			
		}
		return res;
	}
}
