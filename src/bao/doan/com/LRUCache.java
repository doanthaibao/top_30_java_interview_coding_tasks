package bao.doan.com;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

    private int size;

    private Map cache;

    public LRUCache(int size) {
        this.size = size;
        this.cache = new LinkedHashMap<String, String>(size) {

            @Override
            public boolean removeEldestEntry(Map.Entry eldest) {
                return size() > size;
            }
        };

    }

    public void put(String key, String value) {
        this.cache.put(key, value);
    }

    public void remove(String key) {
        this.cache.remove(key);
    }

    public String get(String key) {
        return (String) this.cache.get(key);
    }

    public static void main(String[] args) {
        // write your code here
        LRUCache cache = new LRUCache(3);
        cache.put("1", "1");
        cache.put("2", "2");
        cache.put("3", "3");
        cache.put("4", "4");
        System.out.println(cache.get("1"));
        System.out.println(cache.get("2"));
    }
}
