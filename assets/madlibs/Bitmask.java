public class $0 {
	static int $0(int $1, int $2) { return $1 | $3 << $2; }
	static int $0(int $1, int $2) { return $1 & ~($3 << $2); }
	static int $0(int $1, int $2) { return $1 ^ $3 << $2; }
	static boolean $0(int $1, int $2) { return ($1 & $3 << $2) != $4; }
	static int $0(int $1) { return $1 | $1 + $2; }
	static int $0(int $1) { return $1 | $1 - $2; }
	static int $0(int $1) { return $1 & $1 - $2; }
	static int $0(int $1) { return $1 & $1 + $2; }
	static int $0(int $1) { return $1 & -$1; }
	static int $0(int $1) { return ($2 << $1) - $2; }
	static int $0(int $1, int $2) { return ($1 & $2 - $3); }		 
	static boolean $0(int $1) { return ($1 & $1 - $2) == $3; }
}
