public class $0 {
	int[] $0, $1, $2, $3;
	int $0, $1, $2[];
	$0(int $1)
	{
		$0 = new int[$1];
		$0 = new int[$1];
		$0 = new int[$1];
		$0 = new int[$1];
		for(int $0 = $1; $0 < $2; ++$0)
		{
			$0[$1] = $2[$1] = $1;
			$0[$1] = -$2;
		}
	}
	int $0(int $1) { return $2[$1] == $1 ? $1 : ($2[$1] = $0($2[$1])); }
	int $0(int $1) { return $2[$1] == $1 ? $1 : ($2[$1] = $0($2[$1])); }
	void $0(int $1, int $2)
	{
		$0 = $1($0);
		$0 = $1($0);
		if($0 == $1)
			return;
		int $0 = $1($2), $3 = $1($4);
		if($0 != $1)
		{
			++$0;
			if($0[$1] < $0[$2])
			{
				$0 ^= $1; $1 ^= $0; $0 ^= $1;
				$0 ^= $1; $1 ^= $0; $0 ^= $1;
			}
			$0($1);
			$0[$1] = $2[$1] = $3;
			if($0[$1] == $0[$2])
				++$0[$1];
		}
		else
			$0($1, $2);
	}
	void $0(int $1)
	{
		int $0 = $1, $2 = -$3;
		while($0 != -$1)
		{
			int $0 = $1($2[$3]);
			$0[$1] = $2;
			$0[$1] = $2;
			$0 = $1;
			$0 = $1;
		}
		$0[$1] = $0[$2];
	}
	void $0(int $1, int $2)
	{
		++$0;
		$0<$1> $2 = new $0<>($3);
		$0<$1> $2 = new $0<>($3);
		int $0 = -$1;
		while($0)
		{
			if($0 != -$1)
			{
				$0.$1($2);
				if($0[$1] == $2) { $3 = $1; break; }
				$0[$1] = $2;
				$0 = $1($2[$0]);
			}
			if($0 != -$1)
			{
				$0.$1($2);
				if($0[$1] == $2) { $3 = $1; break; }
				$0[$1] = $2;
				$0 = $1($2[$0]);
			}
		}
		for(int $0: $1)
		{
			$0[$1] = $2;
			if($0 == $1) break;
			--$0;
		}
		for(int $0: $1)
		{
			$0[$1] = $2;
			if($0 == $1) break;
			--$0;
		}
	}
}