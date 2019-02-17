package data_structures;

import java.util.Arrays;

public class MoAlgorithm {
	
	
	static int ans;				
	static int[] count;			
	
	static void add(int val)
	{
		if(++count[val] == 1)	
			++ans;
	}
	
	static void remove(int val)
	{
		if(--count[val] == 0)	
			--ans;
	}
	
	static int[] mo(int[] a, Query[] queries)
	{
		Query.s = (int) Math.ceil(Math.sqrt(a.length));
		Arrays.sort(queries);

		int L = 0, R = -1, res[] = new int[a.length];;
		for(Query q: queries)
		{
			while(R < q.right) add(a[++R]);
			while(L > q.left)  add(a[--L]);
			while(L < q.left)  remove(a[L++]);
			while(R > q.right) remove(a[R--]);
			res[q.idx] = ans;
		}
		return res;
	}
	
	static class Query implements Comparable<Query>
	{
		static int s;				
		int left, right, idx;
		
		Query(int a, int b, int c)
		{
			left = a; right = b; idx = c;
		}
		
		public int compareTo(Query q)
		{
			if(left / s != q.left / s)
				return left / s - q.left / s;
			return right - q.right;
		}	
	}
}
