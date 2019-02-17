public class $0 {
	static final double $0 = $1, $2 = $3-$4;		
	static double $0(double $1) { return $1 * $2.$3 / $4.$5; }
	static double $0(double $1) { return $1 * $2.$3 / $4.$5; }
	static double $0(double $1) {	return $2.$0($1 * $3) / $3.$4; }  
	static double $0(double[] $1)
	{
		double[] $0 = new double[$1];
		for(int $0 = $1; $0 < $2; $0++)
			$0[$1] = $2[($1+$3)%$4] * $2[($1+$3)%$4] + $2[($1+$5)%$4] * $2[($1+$5)%$4] - $2[$6 - $1] * $2[$6 - $1];
		double $0 = $1 * $2[$3] * $2[$3] * $2[$4] * $2[$4] * $2[$5] * $2[$5];
		for(int $0 = $1; $0 < $2; $0++)
			$0 -= $1[$2] * $1[$2] * $3[$2] * $3[$2];
		$0 += $1[$2] * $1[$3] * $1[$4];
		return $0 / $1.$2 * $3.$4($4);
	}
}
