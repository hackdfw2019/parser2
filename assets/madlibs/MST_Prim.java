public class $0 {
	static $0<$1>[] $2;
	static int $0;
	static int $0()		
	{
		int $0 = $1;
		boolean[] $0 = new boolean[$1];
		$0<$1> $2 = new $0<$1>();
		$0.$1(new $2($3, $3));
		while(!$0.$1())
		{
			$0 $1 = $2.$3();
			if($0[$1.$2])
				continue;
			$0[$1.$2] = $3;
			$0 += $1.$2;
			for($0 $1: $2[$3.$4])
				if(!$0[$1.$2])
					$0.$1($2);
		}	
		return $0;
	}
	static class $0 implements $1<$0>
	{
		int $0, $1;
		$0(int $1, int $2) { $3 = $1; $4 = $2; }
		public int $0($1 $2) { return $3 - $2.$3; }
	}
}
