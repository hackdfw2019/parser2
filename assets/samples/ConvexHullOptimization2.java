package other_algorithms;


public class ConvexHullOptimization2 {

	long[] A, B, lst; 			
	int head, end;
	
	void addLine(long a, long b)		
	{
		while(end - head > 0)
		{
			lst[end - 1] = Math.floorDiv(b - B[end - 1], A[end - 1] - a);
			if(end - head == 1 || lst[end - 1] > lst[end - 2])
				break;
			--end;
		}
		A[end] = a;
		B[end] = b;
		lst[end] = Long.MAX_VALUE;
		++end;
	}
	
	long queryPointer(long x)	
	{
		while(lst[head] < x)
			++head;
		return A[head] * x + B[head];
	}
}
