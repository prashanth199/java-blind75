package com.prashanth.blind75.dp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TrieNode class represents a node in the Trie data structure
class TrieNode {
	// Map to store child nodes, where the key is a character and the value is the
	// corresponding TrieNode
	Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
	// Flag to indicate if the current node represents the end of a word
	boolean isWord = false;
}

//WordBreakUsingTrie class uses a Trie to solve the word break problem
public class WordBreakUsingTrie {

	// Root of the Trie
	private TrieNode root;
	// Memoization map to store results of subproblems (start index -> can the
	// substring be segmented)
	private Map<Integer, Boolean> memo;

	public WordBreakUsingTrie() {

		root = new TrieNode();
		memo = new HashMap<Integer, Boolean>();
	}

	private void insert(String word) {

		TrieNode node = root;

		for (char c : word.toCharArray()) {
			// If the current character is not a child of the current node, add it
			if (!node.children.containsKey(c)) {
				node.children.put(c, new TrieNode());
			}
			// Move to the child Node
			node = node.children.get(c);

		}
		// Mark end of the word
		node.isWord = true;
	}

	private boolean canSegmentFromIndex(String s, int start) {
		// Base case: If we've reached the end of the string, return true
		if (start == s.length()) {
			return true;
		}

		if (memo.containsKey(start)) {
			return memo.get(start);
		}

		TrieNode node = root;

		for (int i = start; i < s.length(); i++) {

			char currentChar = s.charAt(i);

			if (!node.children.containsKey(currentChar)) {
				break;
			}

			node = node.children.get(currentChar);

			if (node.isWord && canSegmentFromIndex(s, i + 1)) {

				memo.put(start, true);
				return true;
			}

		}
		memo.put(start, false);
		return false;
	}
	
	public boolean isStringSegmentable(String s, List<String> wordDict) {
		
		for(String word:wordDict) {
			
			insert(word);
		}
		
		return canSegmentFromIndex(s, 0);
		
		
	}

}
