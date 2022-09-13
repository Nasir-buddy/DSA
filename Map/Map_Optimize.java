package DSA.Map;

import java.util.ArrayList;

public class Map_Optimize<K, V> {
    ArrayList<MapNode<K, V>> buckets;

    int size;
    int numBuckets;

    public Map_Optimize() {
        numBuckets = 5;
        buckets = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            buckets.add(null);
        }
    }

    private int getBucketIndex(K key) {
        // to get hashcode of the generic key ...
        int hashCode = key.hashCode();
        // to compress the hashcode
        return hashCode % numBuckets;
    }

    public int size() {
        return size;
    }

    public V removeKey(K key) {
        int bucketsIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketsIndex);
        MapNode<K, V> prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                size--;
                if (prev == null) {
                    buckets.set(bucketsIndex, head.next);
                } else {
                    prev.next = head.next;
                }
                return head.value;
            }
            prev = head;
            head = head.next;
        }
        return null;
    }

    public V getvalue(K key) {

        int bucketsIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketsIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public double loadFactor() {
        return(1.0* size)/numBuckets;
    }
    // rehashsing empty map .. 20 => 40 and so on .. 
    private void rehash() {
        System.out.println("Rehashing : buckets" + numBuckets + "Size " + size);
        ArrayList<MapNode<K, V>> temp = buckets;
        buckets = new ArrayList<>();
        for (int i = 0; i < 2 * numBuckets; i++) {
            buckets.add(null);
        }
        size = 0;
        numBuckets *= 2;
        for(int i = 0; i < temp.size(); i++){
            MapNode<K, V> head = temp.get(i);
            while( head != null){
                K key = head.key;
                V value = head.value;
                insert(key, value); 
                head = head.next;
            }
        }
    }

    public void insert(K key, V value) {
        int bucketsIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketsIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }

            head = head.next;
        }
        head = buckets.get(bucketsIndex);
        MapNode<K, V> newElementNode = new MapNode<K, V>(key, value);
        size++;
        newElementNode.next = head;
        buckets.set(bucketsIndex, newElementNode);

        // calculating load factor
        double loadFactor = (1.0 * size) / numBuckets;
        if (loadFactor > 0.7) {
            rehash();
        }
    }
}
