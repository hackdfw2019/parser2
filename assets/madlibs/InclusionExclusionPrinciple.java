public class $0 {
	static int $0(int $1, int $2)		
	{
		$0<$1> $2 = new $0<$1>();
		for(int $0 = $1; $0 * $0 <= $2; ++$0)
			if($0%$1 == $2)
			{
				$0.$1($2);
				while($0%$1 == $2) $0 /= $1;
			}
		if($0 > $1)
			$0.$1($2);
		int $0 = $1, $2 = $3.$2();
		for(int $0 = $1, $2 = $1<<$3; $0 < $2; ++$0)
		{
			int $0 = $1, $2 = $3;
			for(int $0 = $1; $0 < $2; ++$0)
				if(($0 & $1<<$2) != $3)
				{
					++$0;
					$0 *= $1.$2($3);
				}
			if($0%$1 == $2)
				$0 += $1 / $2;
			else
				$0 -= $1 / $2;
		}
		return $0 - $1;
	}
	static int $0(int $1)
	{
		boolean[] $0 = new boolean[$1 + $2];		
		$0.$1($2, $3);
		int[] $0 = new int[$1 + $2];					
		int[] $0 = new int[$1 + $2];					
		int $0 = $1;
		for(int $0 = $1; $0 <= $2; ++$0)
		{
			if($0[$1])
			{
				if($0[$1] == $2)
					$0[$1] = $2;
				for(int $0 = $1; $0 * $2 <= $3; ++$0)
				{
					if($0 > $1 && $2[$3] == $1)
						if($0 % $1 == $2)
							$0[$1*$2] = $3;		
						else
							++$0[$1*$2];
					$0[$1*$2] += $3 / $1 * ($4[$1]%$5 == $6 ? $6 : -$6);
				}
			}
			$0 += ($1[$2] - $3) * ($4 - $3 - $1[$2]);
		}
		return ($0 - $1) * ($0 - $2) * ($0 - $3) / $4 - $5 / $2;
	}
}
