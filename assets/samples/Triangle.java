package geometry;

public class Triangle {

	static final double EPS = 1e-9;
	
	Point a, b, c;
	double ab, bc, ca;

	Triangle(Point p, Point q, Point r)	
	{
		a = p;
		if(Point.ccw(p, q, r)) { b = q; c = r; }
		else { b = r; c = q; }

		ab = a.dist(b); bc = b.dist(c); ca = c.dist(a);
	}

	double perm()
	{
		return ab + bc + ca;
	}

	double area()
	{
		double s = (ab + bc + ca) / 2.0;
		return Math.sqrt(s * (s - ab) * (s - bc) * (s - ca));		
	}

	double area2() 
	{  return Math.abs(a.x * b.y - a.y * b.x + b.x * c.y - b.y * c.x + c.x * a.y - c.y * a.x) / 2.0; }
	

	double area3()
	{
		return 0.5 * ((c.y - a.y) * (b.x - a.x) - (b.y - a.y) * (c.x - a.x));
	}

	double rInCircle()
	{
		return area() / (perm() * 0.5);
	}

	Point inCenter()				
	{
		double p = perm();
		double x = (a.x * bc + b.x * ca + c.x * ab) / p;
		double y = (a.y * bc + b.y * ca + c.y * ab) / p;
		return new Point(x, y);
	}

	double rCircumCircle()
	{
		return ab * bc * ca / (4.0 * area());
	}

	Point circumCircle() 
	{
		double bax = b.x - a.x, bay = b.y - a.y;
		double cax = c.x - a.x, cay = c.y - a.y;

		double e = bax * (a.x + b.x) + bay * (a.y + b.y);
		double f = cax * (a.x + c.x) + cay * (a.y + c.y);
		double g = 2.0 * (bax * (c.y - b.y) - bay * (c.x - b.x));

		if (Math.abs(g) < EPS) return null;

		return new Point((cay*e - bay*f) / g, (bax*f - cax*e) / g);

	}

	static double areaMedians(double ma, double mb, double mc)		
	{
		double s = (ma + mb + mc) / 2.0;							
		return Math.sqrt(s * (s - ma) * (s - mb) * (s - mc)) * 4.0 / 3.0;
	}

	static double areaHeights(double ha, double hb, double hc)		
	{
		double ha_1 = 1.0 / ha, hb_1 = 1.0 / hb, hc_1 = 1.0 / hc;
		double s = (ha_1 + hb_1 + hc_1) / 2.0;
		return 1.0 / (Math.sqrt(s * (s - ha_1) * (s - hb_1) * (s - hc_1)) * 4.0);
	}

}
