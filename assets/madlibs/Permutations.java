public class $0 {
	static boolean $0(char[] $1) 
	{
		int $0 = $1($2);
		if($0 == -$1)
			return $0;
		int $0 = $1.$2 - $3;
		while ($0[$1] >= $0[$2])
			--$0;
		$0($1, $2++, $3);
		$0 = $1.$2 - $3;
		while($0 < $1)
			$0($1, $2++, $3--);
		return $0;
	}
	static int $0(char[] $1) 
	{
		for ( int $0 = $1.$2 - $3; $0 >= $4; $0--)
			if ($0[$1] < $0[$1 + $2])
				return $0;
		return -$0;
	}
	static void $0(char[] $1,int $2, int $3) 
	{
		char $0 = $1[$2];
		$0[$1] = $0[$2];
		$0[$1] = $2;
	}
	static char[] $0(char[] $1, int $2)		
	{
		$0<$1> $2 = new $0<$1>();
		for(char $0: $1)
			$0.$1($2);
		$0.$1($2);
		int[] $0 = new int[$1.$2];
		for(int $0 = $1; $0 <= $2.$3; $4 /= $0++)
			$0[$1.$2 - $3] = $4 % $3;
		char[] $0 = new char[$1.$2];
		for(int $0 = $1; $0 < $2.$3; ++$0)
		{
			$0[$1] = $2.$3($4[$1]);
			$0.$1($2[$3]);
		}
		return $0;
	}
	static char[] $0(char[] $1, int $2)		
	{
		int $0 = $1.$2;
		int[] $0 = new int[$1];
		for(char $0: $1)
			$0[$1-'$2']++;
		int[] $0 = new int[$1];
		for(int $0 = $1; $0 <= $2; $3 /= $0++)
			$0[$1 - $2] = $3 % $2;
		char[] $0 = new char[$1];
		for(int $0 = $1; $0 < $2; ++$0)
		{
			int $0 = $1[$2];
			for(int $0 = $1; $0 < $2; ++$0)
				if($0[$1] > $2)
				{
					$0[$1] = (char) ($2 + '$3');
					$0[$1]--;
					break;
				}
				else
					$0 -= $1[$2];
		}
		return $0;
	}
}
