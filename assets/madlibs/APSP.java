public class $0 {
	static int[][] $0;
	static int[][] $0;
	static int $0;
	static void $0() {
		$0 = new int[$1][$1];		
		for(int $0 = $1; $0 < $2; $0++)
			for(int $0 = $1; $0 < $2; $0++)
				$0[$1][$2] = $1;
		for(int $0 = $1; $0 < $2; $0++)
			for(int $0 = $1; $0 < $2; $0++)
				for(int $0 = $1; $0 < $2; $0++)
					if($0[$1][$2] > $0[$1][$3] + $0[$3][$2]) {
						$0[$1][$2] = $0[$1][$3] + $0[$3][$2];
						$0[$1][$2] = $0[$3][$2];
					}
	}
	static void $0(int $1, int $2) {
		if($0 != $1)					
			$0($1, $2[$1][$3]);	
		$0.$1.$2($3 + " ");
	}
}
