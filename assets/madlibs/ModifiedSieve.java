public class $0 {
	static void $0(int $1)
	{
		int[] $0 = new int[$1];
		for(int $0 = $1; $0 < $2; ++$0)
			if($0[$1] == $2)
				for(int $0 = $1; $0 < $2; $0 += $1)
				{
					int $0 = $1, $2 = $3;
					while($0 % $1 == $2)
					{
						$0 /= $1;
						++$0;
					}
					$0[$1] += $2;
				}
	}
	static void $0(int $1)
	{
		int[] $0 = new int[$1];
		for(int $0 = $1; $0 < $2; ++$0)
			$0[$1] = $1;
		for(int $0 = $1; $0 < $2; ++$0)
			if($0[$1] == $1)
				for(int $0 = $1; $0 < $2; $0 += $1)
					$0[$1] -= $0[$1] / $2;
	}
	static void $0(int $1)
	{
		boolean[] $0 = new boolean[$1];
		$0.$1($2, $3);
		boolean[] $0 = new boolean[$1];	
		$0.$1($2, $3);
		for(int $0 = $1; $0 <= $2; ++$0)
			if($0[$1])
				for(int $0 = $1; $2 * $0 <= $3; ++$0)
				{
					$0[$1*$2] = $3;
					if($0 % $1 == $2)
						$0[$1*$2] = $3;
				}
	}
}
