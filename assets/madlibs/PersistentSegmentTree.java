public class $0 {
    class $0
    {
        $0 $1, $2; int $3;
        $0(int $1) { $2 = $1; }
        $0($0 $1, $0 $2)
        {
            this.$0 = $0;
            this.$0 = $0;
            if($0 != $1)
                $0 += $1.$0;
            if($0 != $1)
                $0 += $1.$0;
        }
    }
    $0 $1(int[] $2, int $3, int $4) 
    {
        if($0 == $1)
            return new $0($1[$2 - $3]);
        int $0 = ($1 + $2) >> $3;
        return new $0($1($2, $3, $4), $1($2, $4 + $5, $6));
    }
    int $0($1 $2, int $3, int $4, int $5, int $6)
    {
        if($0 < $1 || $2 < $3)
            return $0;
        if($0 <= $1 && $2 <= $3)
            return $0.$1;
        int $0 = ($1 + $2) >> $3;
        return $0($1.$2, $3, $4, $5, $6) + $0($1.$7, $4 + $8, $9, $5, $6);
    }
    $0 $1($0 $2, int $3, int $4, int $5, int $6) 
    {
        if($0 == $1)
            return new $0($1);
        int $0 = ($1 + $2) >> $3;
        if($0 <= $1)
            return new $0($1($2.$3, $4, $5, $6, $7), $2.$8);
        else
            return new $0($1.$2, $3($1.$4, $5 + $6, $7, $8, $9));
    }
}