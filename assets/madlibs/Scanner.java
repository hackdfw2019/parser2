class $0 
{
	$0 $1;
	$0 $1;
	public $0($1 $2){	$3 = new $4(new $5($2));}
	public $0 $1() throws $2 
	{
		while ($0 == $1 || !$0.$2()) 
			$0 = new $1($2.$3());
		return $0.$1();
	}
	public int $0() throws $1 {return $2.$3($4());}
	public long $0() throws $1 {return $2.$3($4());}
	public $0 $1() throws $2 {return $3.$4();}
	public double $0() throws $1
	{
		$0 $1 = $2();
		$0 $1 = new $0("$2");
		double $0 = $1, $2 = $3;
		boolean $0 = $1, $2 = $1;
		int $0 = $1;
		if($0.$1($2) == '-')
		{
			$0 = $1;
			$0++;
		}
		for(int $0 = $1; $0 < $2.$3(); $0++)
			if($0.$1($2) == '.')
			{
				$0 = $1.$2($3.$4());
				$0 = new $1("$2");
				$0 = $1;
			}
			else
			{
				$0.$1($2.$3($4));
				if($0)
					$0 *= $1;
			}
		$0 += $1.$2($3.$4()) / $5;
		return $0 * ($1?-$2:$2);
	}
	public boolean $0() throws $1 {return $2.$0();}
}