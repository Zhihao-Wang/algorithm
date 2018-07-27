package cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class FIFOCache<k,v> extends LinkedHashMap<k,v> {

    private  final int SIZE;
    public FIFOCache(int size){
        super();
        SIZE=size;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<k, v> eldest) {

        return size()>SIZE;
    }


}
