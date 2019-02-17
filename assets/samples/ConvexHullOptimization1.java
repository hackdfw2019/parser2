package other_algorithms;


public class ConvexHullOptimization1 {

	long[] A, B; 			
	int ptr, len;
	
	void addLine(long a, long b)		
	{
		while(len >= 2 && 
			 (A[len - 2] - A[len - 1]) * (b - B[len - 1]) <= (A[len - 1] - a) * (B[len - 1] - B[len - 2]))
			--len;
		A[len] = a;
		B[len] = b;
		++len;
	}
	
	long queryPointer(long x)	
	{
		ptr = Math.min(ptr, len - 1);
		while(ptr < len - 1 && A[ptr + 1] * x + B[ptr + 1] <= A[ptr] * x + B[ptr])
			++ptr;
		return A[ptr] * x + B[ptr];
	}
	
	long queryBS(long x)			
	{
		int ans = 0;
		int lo = 1, hi = len - 1;
		while(lo <= hi)
		{
			int mid = lo + hi >> 1;
			
			if(B[mid] - B[mid - 1] <= x * (A[mid - 1] - A[mid]))
			{
				ans = cur;
				lo = mid + 1;
			}
			else
				hi = mid - 1;
		}
		return A[ans] * x + B[ans];
	}
}
