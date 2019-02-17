public class $0 {
	static int $0;
	static $0<$1>[] $2, $3, $4;
	static $0<$1> $2;
	static boolean[] $0;
	static int $0;
	public static int $0()
	{
		$0 = new $1<$2>();
		$0 = new boolean[$1];
		$0 = $1;
		for(int $0 = $1; $0 < $2; ++$0)
			if(!$0[$1])
				$0($1, $2);
		$0 = new boolean[$1];
		$0 = $1;
		$0 = $1;
		while(!$0.$1())
		{		
			int $0 = $1.$2();
			if(!$0[$1])
			{
				$0++;
				$0($1, $2);
			}
		}
		return $0;
	}
	public static void $0(int $1, boolean $2)
	{
		$0[$1] = $2;
		for(int $0: $1[$2])
			if(!$0[$1])
				$0($1, $2);
		if($0)
			$0.$1($2);
	}
}
