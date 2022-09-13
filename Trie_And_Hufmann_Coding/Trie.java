package DSA.Trie_And_Hufmann_Coding;

class TrieNode {
    char data;
    boolean isTermating;
    TrieNode childern[];
    // to remove for loop that is running till 26 in removing function ..
    int childCount;

    public TrieNode(char data) {
        this.data = data;
        isTermating = false;
        childern = new TrieNode[26];
        childCount = 0; 
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode('\0');
    }

    // not three imp functions that we will make in this file
    // add
    // search
    // remove
    // Now adding recursively
    // firstly we come to here .. with 0 length 
    private void add(TrieNode root, String word) {
        // checking base case is length is not 0 then we go to the next loop 
        if (word.length() == 0) {
            // if we on last word then we make the last word true termination 
            root.isTermating = true;
            return;
        }
        // finding NOTE 
        // then we find the n index from this formula of the character 
        int childIndex = word.charAt(0) - 'a';
        // then we find on that index .. that what is it on that root 
        TrieNode child = root.childern[childIndex];
        // checking n is present or not // but n is not present 
        if (child == null) {
            // then we make a new node corresponding to that index
            child = new TrieNode(word.charAt(0));
            // now we calling the recursion to finding the ote of the word NOTE ..
            root.childern[childIndex] = child;
            //after adding child count in tries node
            root.childCount++;
        }

        add(child, word.substring(1));
    }

    // search in Tries
    public boolean search(String word){
        return search(root , word);
    }

    private boolean search(TrieNode root , String word){
        if(word.length() == 0){
            return root.isTermating;
        }
        // finding NOTE 
        // then we find the n index from this formula of the character 
        int childIndex = word.charAt(0) - 'a';
        // then we find on that index .. that what is it on that root 
        TrieNode child = root.childern[childIndex];
        // checking n is present or not // but n is not present 
        if (child == null) {
            return false;
        }
        return search(child , word.substring(1));
    }
    public void add(String word) {
        add(root, word);
    }

    // removing from tree...
    public void remove(String word){
        remove(root , word);
    }

    private void remove(TrieNode root , String word){
        if(word.length()==0){
            root.isTermating = false;
            return ;
        }
        int childIndex = word.charAt(0) - 'a';
    // then we find on that index .. that what is it on that root 
    TrieNode child = root.childern[childIndex];
    if(child == null){
        return;
    }
    remove(child , word.substring(1));
    // we can remove child node only if it is non termination and its number of childern is 0
    if(! child.isTermating && child.childCount == 0){
        root.childern[childIndex] = null;
                child = null; 
                root.childCount--;
    }
    // if(!child.isTermating){
    //     int numChild = 0; 
    //     // for(int i = 0; i < 26; i++){
    //     //     if(child.childern[i] != null){
    //     //         numChild++;
    //     //     }
    //     // }
    //     if(numChild == 0){
    //         // then we can delete child .... 
    //         root.childern[childIndex] = null;
    //         child = null; 
            
    //     }
    // }
    }
}
