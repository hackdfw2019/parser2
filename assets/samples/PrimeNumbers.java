package math.number_theory;

import java.util.ArrayList;

public class PrimeNumbers {

	
	static ArrayList<Integer> primes;
	static int[] isComposite;

	static void sieve(int N)	
	{
		isComposite = new int[N+1];					
		isComposite[0] = isComposite[1] = 1;			
		primes = new ArrayList<Integer>();

		for (int i = 2; i <= N; ++i) 					
			if (isComposite[i] == 0) 					
			{
				primes.add(i);
				if(1l * i * i <= N)
					for (int j = i * i; j <= N; j += i)	
						isComposite[j] = 1;
			}   
	}

	
	static boolean isPrime(int N)
	{
		if(N < isComposite.length)
			return isComposite[N] == 0;
		for(int p: primes)					
			if(N%p==0)
				return false;
		return true;
	}
	
	
	static void sieveLinear(int N)
	{
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int[] lp = new int[N + 1];								
		for(int i = 2; i <= N; ++i)
		{
			if(lp[i] == 0)
			{
				primes.add(i);
				lp[i] = i;
			}
			int curLP = lp[i];
			for(int p: primes)
				if(p > curLP || p * i > N)
					break;
				else
					lp[p * i] = i;
		}
	}
}
