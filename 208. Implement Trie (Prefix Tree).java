class TrieNode {
    // Initialize your data structure here.
    TrieNode[] child;
    boolean isLeaf;
    
    public TrieNode() {
        child = new TrieNode[26];
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode n = root;
        if(word==null || word.length()==0) return;
        for(int i=0; i<word.length(); i++){
            if(n.child[word.charAt(i)-'a']==null)  n.child[word.charAt(i)-'a'] = new TrieNode();
         
            n = n.child[word.charAt(i)-'a'];
        }
        n.isLeaf = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        if(word==null || word.length()==0) return true;
        TrieNode n = root;
        for(int i=0; i<word.length(); i++){
            if(n.child[word.charAt(i)-'a']==null) return false;
            n = n.child[word.charAt(i)-'a'];
        }
        return n.isLeaf;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        if(prefix==null || prefix.length()==0) return true;
        TrieNode n = root;
        for(int i=0; i<prefix.length(); i++){
            if(n.child[prefix.charAt(i)-'a']==null) return false;
            n = n.child[prefix.charAt(i)-'a'];
        }
        return true;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");