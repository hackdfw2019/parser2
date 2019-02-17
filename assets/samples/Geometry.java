package geometry;

public class Geometry {

	static final double INF = 1e9, EPS = 1e-9;		
	
	static double degToRad(double d) { return d * Math.PI / 180.0; }

	static double radToDeg(double r) { return r * 180.0 / Math.PI; }
	
	static double round(double x) {	return Math.round(x * 1000) / 1000.0; }  
	
	
	static double vTetra(double[] sides)
	{
		double[] coff = new double[3];
		for(int i = 0; i < 3; i++)
			coff[i] = sides[(i+1)%3] * sides[(i+1)%3] + sides[(i+2)%3] * sides[(i+2)%3] - sides[5 - i] * sides[5 - i];

		double sqrt = 4 * sides[0] * sides[0] * sides[1] * sides[1] * sides[2] * sides[2];
		for(int i = 0; i < 3; i++)
			sqrt -= coff[i] * coff[i] * sides[i] * sides[i];
		sqrt += coff[0] * coff[1] * coff[2];

		return 1 / 12.0 * Math.sqrt(sqrt);
	}
}
