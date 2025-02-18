import java.util.LinkedHashMap;

class Solution {
    static class LRUCache {
        LinkedHashMap<Integer, Integer> map = null;
        int capacity = 0;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.map = new LinkedHashMap<>(capacity * 2, 0.75f, true);
        }

        public int get(int key) {
            return (map.containsKey(key)) ? map.get(key) : -1;
        }

        public void put(int key, int value) {
            map.put(key, value);

            if (map.size() > this.capacity)
                map.remove(map.entrySet().iterator().next().getKey());
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */