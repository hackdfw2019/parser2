public class $0 {
	static final double $0 = $1-$2;
	int $0, $1[];
	$0(int[] $1) { $2 = $1.$3 - $4; $5 = $1; }
	double $0(double $1)		
	{
		double $0 = $1.$1;
		for(int $0 = $1; $0 >= $2; --$0)
			$0 = $0 * $1 + $2[$3];
		return $0;
	}
	$0 $1()			
	{
		if($0 == $1)
			return new $0(new int[$1]);
		int[] $0 = new int[$1];
		for(int $0 = $1; $0 < $2; ++$0)
			$0[$1] = $2[$1 + $3] * ($1 + $3);
		return new $0($1);
	}
	double $0()
	{
		$0 $1 = $2();
		double $0 = $1;				
		while($0)						
		{
			double $0 = $1 - $2($1) / $3.$2($1);
			if($0.$1($2 - $3) < $4)
				break;
			$0 = $1;
		}
		return $0;
	}
}
