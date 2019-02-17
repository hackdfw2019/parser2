public class $0 {
	static $0<$1> $2;
	static int[] $0;
	static void $0(int $1)	
	{
		$0 = new int[$1+$2];					
		$0[$1] = $0[$2] = $2;			
		$0 = new $1<$2>();
		for (int $0 = $1; $0 <= $2; ++$0) 					
			if ($0[$1] == $2) 					
			{
				$0.$1($2);
				if($0 * $1 * $1 <= $2)
					for (int $0 = $1 * $1; $0 <= $2; $0 += $1)	
						$0[$1] = $2;
			}   
	}
	static boolean $0(int $1)
	{
		if($0 < $1.$2)
			return $0[$1] == $2;
		for(int $0: $1)					
			if($0%$1==$2)
				return $0;
		return $0;
	}
	static void $0(int $1)
	{
		$0<$1> $2 = new $0<$1>();
		int[] $0 = new int[$1 + $2];								
		for(int $0 = $1; $0 <= $2; ++$0)
		{
			if($0[$1] == $2)
			{
				$0.$1($2);
				$0[$1] = $1;
			}
			int $0 = $1[$2];
			for(int $0: $1)
				if($0 > $1 || $0 * $2 > $3)
					break;
				else
					$0[$1 * $2] = $2;
		}
	}
}
