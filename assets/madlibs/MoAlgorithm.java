public class $0 {
	static int $0;				
	static int[] $0;			
	static void $0(int $1)
	{
		if(++$0[$1] == $2)	
			++$0;
	}
	static void $0(int $1)
	{
		if(--$0[$1] == $2)	
			--$0;
	}
	static int[] $0(int[] $1, $2[] $3)
	{
		$0.$1 = (int) $2.$3($2.$4($5.$6));
		$0.$1($2);
		int $0 = $1, $2 = -$3, $4[] = new int[$5.$6];;
		for($0 $1: $2)
		{
			while($0 < $1.$2) $3($4[++$0]);
			while($0 > $1.$2)  $3($4[--$0]);
			while($0 < $1.$2)  $3($4[$0++]);
			while($0 > $1.$2) $3($4[$0--]);
			$0[$1.$2] = $3;
		}
		return $0;
	}
	static class $0 implements $1<$0>
	{
		static int $0;				
		int $0, $1, $2;
		$0(int $1, int $2, int $3)
		{
			$0 = $1; $2 = $3; $4 = $5;
		}
		public int $0($1 $2)
		{
			if($0 / $1 != $2.$0 / $1)
				return $0 / $1 - $2.$0 / $1;
			return $0 - $1.$0;
		}	
	}
}
