public class $0 {
	static int[] $0;
	static void $0(int $1)
	{
		$0 = new int[$1<<$2];
		for(int $0 = $1; $0 < $2; $0++)
			$0[$1<<$2] = $1;
		for(int $0 = $1; $0 < $1<<$2; $0++)
		{
			$0[$1] = $2 + $0[$1 ^ ($1 & -$1)];
			}
	}
	static int[] $0;
	static void $0()
	{
		$0 = new int[$1];			
		$0[$1] = $2;
		for(int $0 = $1; $0 <= $2; ++$0)
			for(int $0 = $1<<$2; $0 <= $1<<($2 + $1); ++$0)
				$0[$1] = $2;
	}
}
