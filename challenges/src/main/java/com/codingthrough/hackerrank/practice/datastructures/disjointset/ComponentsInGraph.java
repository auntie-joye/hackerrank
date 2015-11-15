package com.codingthrough.hackerrank.practice.datastructures.disjointset;

/**
 * Problem Statement:
 * There are 2N values to represent nodes in a graph. They are divided into
 * two sets G and B. Each set has exactly N values. Set G is represent by
 * {G1,G2,?,GN}. G can take any value between 1 to N(inclusive). Set B is
 * represented by {B1,B2,?,BN}. B can take any value between N+1 to 2N(inclusive).
 * Same value can be chosen any number of times.
 * <p>
 * Here (G1,B1),(G2,B2),?(GN,BN) represents the edges of the graph.
 * <p>
 * Your task is to print the number of vertices in the smallest and the largest
 * connected components of the graph.
 * <p>
 * Note Single nodes should not be considered in the answer.
 * Input Format
 * <p>
 * First line contains an integer N.
 * Each of the next N lines contain two space-separated integers, ith line contains Gi and Bi.
 * <p>
 * Constraints:
 * 1?N?15000
 * 1?Gi?N
 * N+1?Bi?2N
 * <p>
 * Output Format:
 * <p>
 * Print two space separated integers, the number of vertices in the smallest and the largest components.
 * <p>
 * Sample Input:
 * <p>
 * 5
 * 1 6
 * 2 7
 * 3 8
 * 4 9
 * 2 6
 * Sample Output:
 * <p>
 * 2 4
 */
public class ComponentsInGraph {
    public static void main(String[] args) {

    }

    private static class UF {
        private int[] id;
        private int[] sz;

        private int maxRootSize;

        UF(int n) {
            id = new int[n];
            sz = new int[n];

            for (int i = 0; i < n; i++) {
                id[i] = i;
                sz[i] = 1;
            }

            maxRootSize = 1;
        }

        private int root(int p) {
            while (p != id[p]) {
                if (id[p] != id[id[p]]) {
                    id[p] = id[id[p]];
                    sz[id[p]] -= sz[p];
                }

                p = id[p];
            }

            return p;
        }

        void union(int p, int q) {
            int pRoot = root(p);
            int qRoot = root(q);

            if (pRoot == qRoot) {
                return;
            }

            if (sz[pRoot] > sz[qRoot]) {
                id[qRoot] = pRoot;
                sz[pRoot] += sz[qRoot];
                maxRootSize = Math.max(maxRootSize, sz[pRoot]);
            } else {
                id[pRoot] = qRoot;
                sz[qRoot] += sz[pRoot];
                maxRootSize = Math.max(maxRootSize, sz[qRoot]);
            }
        }

        int minRootSize() {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < id.length; i++) {
                if (id[i] == i) {
                    min = Math.min(min, sz[i]);
                }
            }

            return min;
        }

        int maxRootSize() {
            return maxRootSize;
        }
    }
}
