package other_algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;


class LIS {		
	
	static Stack<Integer> stack;	
	
	static int lis(int[] A, int n)		
	{
		ArrayList<Integer> L = new ArrayList<Integer>(); 
		int[] P = new int[n];			
		int[] L_id = new int[n];
		
		int lis = 0, lis_end = -1;
		for(int i = 0; i < n; ++i) 
		{
			int pos = Collections.binarySearch(L, A[i]);
			if (pos < 0) pos = -(pos + 1);

			if(pos >= L.size()) L.add(A[i]);
			else                 L.set(pos, A[i]);

			if(pos + 1 > lis)
			{
				lis = pos + 1;
				lis_end = i;
			}
			
			
			L_id[pos] = i;
			P[i] = pos > 0 ? L_id[pos-1] : -1;
		}
		
		stack = new Stack<Integer>();
		while(lis_end != -1)
		{
			stack.push(A[lis_end]);
			lis_end = P[lis_end];
		}
		return lis;
	}
}

