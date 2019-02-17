package math;

public class Polynomial {

	static final double EPS = 1e-9;
	
	int degree, coeffs[];
	
	Polynomial(int[] c) { degree = c.length - 1; coeffs = c; }
	
	double evaluate(double x)		
	{
		double res = 0.0;
		for(int i = degree; i >= 0; --i)
			res = res * x + coeffs[i];
		return res;
	}
	
	Polynomial derivative()			
	{
		if(degree == 0)
			return new Polynomial(new int[1]);
		int[] c = new int[degree];
		for(int i = 0; i < degree; ++i)
			c[i] = coeffs[i + 1] * (i + 1);
		return new Polynomial(c);
	}
	
	double findGreatestRoot()
	{
		Polynomial d = derivative();
		double x1 = 1e6;				
		while(true)						
		{
			double x2 = x1 - evaluate(x1) / d.evaluate(x1);
			if(Math.abs(x1 - x2) < EPS)
				break;
			x1 = x2;
		}
		return x1;
	}
}
