public class $0 {
	static $0[] $1;
	static int $0;
	static int $0()		
	{
		int $0 = $1;
		$0.$1($2);
		$0 $1 = new $0($2);
		for($0 $1: $2)
			if($0.$1($2.$3, $2.$4))
				$0 += $1.$2;
		return $0;
	}
	static class $0 implements $1<$0>
	{
		int $0, $1, $2;
		$0(int $1, int $2, int $3) {	$4 = $1; $5 = $2; $6 = $3; }
		public int $0($1 $2) { return $3 - $2.$3; }
	}
	static class $0 {                                              
		int[] $0, $1;
		$0(int $1) 
		{
			$0 = new int[$1];
			$0 = new int[$1];
			for (int $0 = $1; $0 < $2; $0++) 
				$0[$1] = $1;
		}
		int $0(int $1) { return $2[$1] == $1 ? $1 : ($2[$1] = $0($2[$1])); }
		boolean $0(int $1, int $2) 
		{ 
			$0 = $1($0);
			$0 = $1($0);
			if($0 == $1)
				return $0;
			if ($0[$1] > $0[$2]) 
				$0[$1] = $2;
			else
			{	
				$0[$1] = $2;
				if($0[$1] == $0[$2])
					++$0[$1]; 
			} 
			return $0;
		}
	}
}
