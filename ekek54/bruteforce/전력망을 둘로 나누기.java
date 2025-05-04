import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) { //i번 인덱스의 wire는 생략
            DisjointSet disjointSet = new DisjointSet(n);
            for (int j = 0; j < n - 1; j++) { // 모든 와이어를 순회
                if (j == i) continue; // i번 와이어는 생략
                disjointSet.union(wires[j][0] - 1, wires[j][1] - 1); // wire의 a노드와 b노드를 연결
                //System.out.println(Arrays.toString(disjointSet.parent)); //노드 연결에 따라 서로소 집합의 변화 확인
            }
            answer = Math.min(answer, Math.abs(n - 2 * disjointSet.sizeOf(0)));
        }
        return answer;
    }
}

// 서로소 집합은 그래프에서 노드의 포함 관계를 나타낼 때 사용
class DisjointSet {
    private int N;
    public int[] parent;

    public DisjointSet(int N) {
        this.N = N;
        this.parent = new int[N];
        for (int i = 0; i < N; i++) {
            parent[i] = i;
        }
    }

    private int find(int a) {
        if (a == parent[a]) return a;
        parent[a] = find(parent[a]);
        return parent[a];
    }

    public boolean union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a > b) {
            parent[a] = b;
            return true;
        }
        if (a == b) {
            return false;
        }
        parent[b] = a;
        return true;
    }

    public int sizeOf(int idx) {
        int root = find(idx);
        int result = 0;
        for (int i = 0; i < N; i++) {
            if (root == find(i)) result++;
        }
        // System.out.println(Arrays.toString(parent));
        return result;
    }
}