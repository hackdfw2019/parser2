public class $0 {
	static int $0, $1, $2, $3[];	
	static $0<$1>[] $2;	
	static boolean[] $0;
	static int $0()
	{
		int $0 = $1;
		$0 = new int[$1];
		$0.$1($2, -$3);
		for(int $0 = $1; $0 < $2; ++$0)
		{
			$0 = new boolean[$1];
			$0 += $1($2);
		}
		return $0;
	}
	static int $0(int $1)	
	{
		$0[$1] = $2;
		for(int $0 : $1[$2])
			if($0[$1] == -$2 || !$3[$0[$1]] && $4($0[$1]) == $2)
			{
				$0[$1] = $2;
				return $0;
			}
		return $0;
	}
	static int[] $0, $1, $2;
	static final int $0 = $1, $2 = (int)$3;
	static int $0()
	{
		$0 = new int[$1 + $2];	
		$0 = new int[$1 + $2];	
		$0 = new int[$1 + $2];
		int $0 = $1;
		while($0())
			for(int $0 = $1; $0 <= $2; ++$0)
				if($0[$1] == $2 && $3($1))
					++$0;
		return $0;
	}	
	static boolean $0()
	{
		$0<$1> $2 = new $3<$1>();
		for(int $0 = $1; $0 <= $2; ++$0)
			if($0[$1] == $2)
			{
				$0[$1] = $2;
				$0.$1($2);
			}
			else
				$0[$1] = $2;
		$0[$1] = $2;
		while(!$0.$1())
		{
			int $0 = $1.$2();
			if($0[$1] < $0[$2])
				for(int $0 : $1[$2])
					if($0[$1[$2]] == $3)
					{
						$0[$1[$2]] = $0[$3] + $4;
						$0.$1($2[$3]);
					}
		}
		return $0[$1] != $2;
	}
	static boolean $0(int $1)
	{
		if($0 == $1)
			return $0;
		for(int $0 : $1[$2])
			if($0[$1[$2]] == $0[$3] + $4 && $5($1[$2]))
			{
				$0[$1] = $2;
				$0[$1] = $2;
				return $0;
			}
		$0[$1] = $2;
		return $0;
	}
}
