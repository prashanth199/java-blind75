package com.prashanth.blind75.dp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class UniquePathsTest {
	
	private UniquePaths uniquePaths;

	@BeforeEach
	void setUp() throws Exception {
		
		uniquePaths = new UniquePaths();
	}

    static Stream<Arguments> provideTestCases() {
        return Stream.of(
            Arguments.of(1, 1, 1),
            Arguments.of(2, 2, 2),
            Arguments.of(3, 2, 3),
            Arguments.of(3, 7, 28)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testCalculateUniquePathsUsingBruteForce(int m, int n, int expected) {
        assertEquals(expected, uniquePaths.calculateUniquePathsUsingBruteForce(m, n));
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testCalculateUniquePathsUsingTopDownApproachOfDP(int m, int n, int expected) {
        assertEquals(expected, uniquePaths.calculateUniquePathsUsingTopDownApproachOfDP(m, n));
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testCalculateUniquePathsUsingBottomUpApproachOfDP(int m, int n, int expected) {
        assertEquals(expected, uniquePaths.calculateUniquePathsUsingBottomUpApproachOfDP(m, n));
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testCalculateUniquePathsUsingBottomApproachOfDPSpaceOptimization(int m, int n, int expected) {
        assertEquals(expected, uniquePaths.calculateUniquePathsUsingBottomApproachOfDPSpaceOptimization(m, n));
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testCalculateUniquePathsUsingCombinatorics(int m, int n, int expected) {
        assertEquals(expected, uniquePaths.calculateUniquePathsUsingCombinatorics(m, n));
    }

}
