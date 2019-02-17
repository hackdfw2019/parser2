package strings;

public class PrefixAutomaton {

	
	static int[] prefixFunction(char[] s)		
	{
		int n = s.length, pi[] = new int[n];
		for(int i = 1, j = 0; i < n; ++i)		
		{
			while(j > 0 && s[i] != s[j])
				j = pi[j-1];
			if(s[i] == s[j])
				++j;
			pi[i] = j;
		}
		return pi;
	}

	
	static final int k = 26;					

	static int[][] prefixAutomaton(char[] s)	
	{
		int n = s.length;
		int[] pi = prefixFunction(s);
		int[][] aut = new int[k][n];		

		for(int c = 0; c < k; ++c)
			for(int i = 0; i < n; ++i)
				if(i > 0 && c != s[i] - 'a')
					aut[c][i] = aut[c][pi[i - 1]];
				else
					aut[c][i] = i + (c == s[i] - 'a' ? 1 : 0);
		return aut;
	}

}
