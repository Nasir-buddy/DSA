package DSA.Map;

import java.util.ArrayList;
public class Map<K, V> {
    ArrayList<MapNode<K, V>> buckets;

    int size;
    int numBuckets;

    public Map() {
        numBuckets = 20;
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

    public int size(){
        return size;
    }


    public V removeKey(K key){
        int bucketsIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketsIndex);
        MapNode<K, V> prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                if(prev == null){
                    buckets.set(bucketsIndex, head.next);
                }else{
                prev.next = head.next;
                }
                return head.value;
            }
            prev = head;
            head = head.next;
        }
        return null;
    }


    public V getvalue(K key){

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
        MapNode<K , V> newElementNode = new MapNode<K,V>(key, value); 
        newElementNode.next = head;
        buckets.set(bucketsIndex, newElementNode);

    }
}
