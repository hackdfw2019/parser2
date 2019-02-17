package math;

import java.math.BigInteger;

public class NewtonMethod {

	
		
	static final double EPS = 1e-15;
	
	
	static double sqrt(double n)
	{
		double x = 1;
		while(true)
		{
			double nx = (x + n / x) / 2;
			if(Math.abs(nx - x) < EPS)
				break;
			x = nx;
		}
		return x;
	}
	
	
	static int nearestInteger(int n)
	{
		int x = 1;
		boolean dec = false;
		while(true)
		{
			int nx = x + n / x >> 1;
			if(x == nx || nx > x && dec)
				break;
			dec = nx < x;
			x = nx;
		}
		return x;
	}
	
	
	static BigInteger nearestInteger(BigInteger n)
	{
		BigInteger x = BigInteger.ONE.shiftLeft(n.bitLength() >> 1);
		boolean dec = false;
		while(true)
		{
			BigInteger nx = x.add(n.divide(x)).shiftRight(1);
			int cmp = nx.compareTo(x);
			if(cmp == 0 || cmp > 0 && dec)
				break;
			dec = cmp < 0;
			x = nx;
		}
		return x;
	}
}
