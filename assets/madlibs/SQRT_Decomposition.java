public class $0 {
	static int[] $0(int[] $1, int $2)
	{
		int $0 = (int) $1.$2($3) + $4;
		int[] $0 = new int[($1 + $2 - $3)/ $2];
		for(int $0 = $1; $0 < $2; ++$0)
			$0[$1 / $2] += $3[$1];
		return $0;
	}
	static int $0(int[] $1, int[] $2, int $3, int $4, int $5)
	{
		int $0 = $1, $2 = $3 / $4, $5 = $6 / $4;
		if($0 == $1)
			for(int $0 = $1; $0 <= $2; ++$0)
				$0 += $1[$2];
		else
		{
			for(int $0 = $1, $2 = ($3+$4) * $5 - $4; $0 <= $2; ++$0)
				$0 += $1[$2];
			for(int $0 = $1 + $2; $0 <= $3 - $2; ++$0)
				$0 += $1[$2];
			for(int $0 = $1 * $2; $0 <= $3; ++$0)
				$0 += $1[$2];
		}
		return $0;
	}
}