package DSA.Trie_And_Hufmann_Coding;

public class Trie_Use {
    public static void main(String[] args) {
        Trie t = new Trie();
        t.add("this");
        t.add("new");
        

        long start = System.nanoTime();
        System.out.println(t.search("this"));
        System.out.println(t.search("new"));
        t.remove("new");
        System.out.println(t.search("new"));
        long end = System.nanoTime();
        System.out.println("Program took : " + (end - start) / 1000000. + "ms");
    }
}
