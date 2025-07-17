package Controllers;
import java.util.HashMap;
import java.util.Map;

public class EjerciciosPD {
//-----------------------------------------------------------------------------
    public long getFibonaci(int n){
        if (n <= 1){
            return (long) n;
        }
        return getFibonaci(n-1) + getFibonaci(n-2);
        
    }
//-----------------------------------------------------------------------------
    public long getFibonaciPD(int n){
        Map<Integer,Long> cache = new HashMap<>();

        return getFibonaciCache(n,cache);
    }

    private long getFibonaciCache(int n, Map<Integer,Long> cache){
        if (n <= 1) {
            return n;
        }

        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        long resultado = getFibonaciCache(n - 1, cache) + getFibonaciCache(n - 2, cache);
        cache.put(n, resultado);

        return resultado;
    }
//-----------------------------------------------------------------------------
}

