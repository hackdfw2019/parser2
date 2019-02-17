package other_algorithms;

public class Precomputation {

	
	static int[] bitCount;

	static void pre(int n)
	{
		bitCount = new int[1<<n];
		for(int i = 0; i < n; i++)
			bitCount[1<<i] = 1;
		for(int i = 1; i < 1<<n; i++)
		{
			bitCount[i] = 1 + bitCount[i ^ (i & -i)];
			}
	}
	
	
	static int[] log2;
	
	static void computeLog()
	{
		log2 = new int[300000];			
		log2[1] = 0;
		for(int i = 1; i <= 16; ++i)
			for(int j = 1<<i; j <= 1<<(i + 1); ++j)
				log2[j] = i;

	}


}
