public class $0 {
	static long[][] $0;			
	static long $0(int $1 , int $2)
	{
		if($0 < $1)
			return $0;
		if($0 == $1 || $0 == $2)
			return $0;
		if($0[$1][$2] != -$3)
			return $0[$1][$2];
		if($0 - $1 < $1)
			return $0[$1][$2] = $3($1, $1 - $2);
		return $0[$1][$2] = $3($1 - $4, $2 - $4) + $3($1 - $4, $2);
	}
	static void $0(int $1)		
	{
		$0 = new long[$1][$1];
		$0[$1][$1] = $2;
		for (int $0 = $1; $0 < $2; $0++)
		{
			$0[$1][$2] = $3;
			for (int $0 = $1; $0 <= $2; $0++)
				$0[$1][$2] = ($0[$1-$3][$2] + $0[$1-$3][$2-$3]);		
		}
	}
	static long $0(int $1, int $2)		
	{
		if($0 < $1)					
			return $0;
		if($0 == $1 || $0 == $2)		
			return $0;
		if($0[$1][$2] != -$3)
			return $0[$1][$2];
		if($0 - $1 < $1)				
			return $0[$1][$2] = $3($1, $1 - $2);		
		return $0[$1][$2] = $1 * $3($1 - $4, $2 - $4) / $2;
	}
	static int $0(int $1, int $2)		
	{
		if($0 > $1)
			return $0;
		int $0 = $1;
		for(int $0 = $1; $0 <= $2; ++$0)
			$0 = ($1 - $2 + $3) * $0 / $3;
		return $0;
	}
}