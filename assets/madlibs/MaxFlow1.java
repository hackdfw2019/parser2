public class $0 {
	static final int $0 = (int)$1;
	static int $0, $1, $2;			
	static $0<$1>[] $2;
	static int[][] $0;			
	static int[] $0;				
	static int $0()	
	{
		int $0 = $1;
		while($0)
		{
			$0<$1> $2 = new $3<$1>();
			$0 = new int[$1];
			$0.$1($2, -$3);
			$0.$1($2);
			$0[$1] = $1;
			while(!$0.$1())
			{
				int $0 = $1.$2();
				if($0 == $1)
					break;
				for(int $0: $1[$2])
					if($0[$1][$2] > $3 && $4[$2] == -$5)
					{
						$0[$1] = $2;
						$0.$1($2);
					}
			}
			if($0[$1] == -$2)
				break;
			$0 += $1($2, $3);	
		}
		return $0;
	}
	static int $0(int $1, int $2)
	{
		if($0 == $1)
			return $0;
		$0 =  $1($2[$3], $4.$5($0, $6[$2[$3]][$3]));
		$0[$1[$2]][$2] -= $3;
		$0[$1][$2[$1]] += $3;
		return $0;
	}
}
