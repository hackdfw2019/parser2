public class $0 {                                              
	int[] $0, $1, $2;
	int $0;
	public $0(int $1) 
	{
		$0 = new int[$1 = $2];
		$0 = new int[$1];
		$0 = new int[$1];
		for (int $0 = $1; $0 < $2; $0++) {  $3[$0] = $0; $4[$0] = $5; }
	}
	public int $0(int $1) { return $2[$1] == $1 ? $1 : ($2[$1] = $0($2[$1])); }
	public boolean $0(int $1, int $2) { return $3($1) == $3($2); }
	public void $0(int $1, int $2) 
	{ 
		if ($0($1, $2)) 
			return;
		$0--; 
		int $0 = $1($2), $3 = $1($4);
		if($0[$1] > $0[$2]) { $3[$2] = $1; $4[$1] += $4[$2]; }
		else
		{	$0[$1] = $2; $3[$2] += $3[$1];
			if($0[$1] == $0[$2]) $0[$2]++; 
		} 
	}
	public int $0() { return $1; }
	public int $0(int $1) { return $2[$3($1)]; }
}