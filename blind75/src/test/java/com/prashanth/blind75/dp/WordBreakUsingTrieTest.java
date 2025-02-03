package com.prashanth.blind75.dp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class WordBreakUsingTrieTest {
	
	private WordBreakUsingTrie wordBreakUsingTrie;

	@BeforeEach
	void setUp() throws Exception {
		
		wordBreakUsingTrie = new WordBreakUsingTrie();
	}

	@ParameterizedTest
	@MethodSource("providedTestCases")
	@DisplayName("Using Trie")
	void testCase1(String s, List<String> wordDict, boolean expected) {

		boolean actual = wordBreakUsingTrie.isStringSegmentable(s, wordDict);

		assertEquals(expected, actual);
	}

	private static Stream<Arguments> providedTestCases() {

		return Stream.of(Arguments.of("leetcode", Arrays.asList("leet", "code"), true),
				Arguments.of("applepenapple", Arrays.asList("apple", "pen"), true),
				Arguments.of("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat"), false));

	}

}
