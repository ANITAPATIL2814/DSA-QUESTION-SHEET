import java.util.*;

class wordladder {

    // Helper function to check if two words differ by only one character
    private boolean checkEdge(String u, String v) {
        int count = 0;
        for (int i = 0; i < u.length(); i++) {
            if (u.charAt(i) != v.charAt(i)) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }
        return count == 1;
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // If the endWord is not in the wordList, there's no possible transformation
        if (!wordList.contains(endWord)) {
            return 0;
        }

        // Add the beginWord to the wordList if it's not already there
        if (!wordList.contains(beginWord)) {
            wordList.add(beginWord);
        }

        // Create a mapping from words to their indices
        HashMap<String, Integer> hashmap = new HashMap<>();
        int index = 0;
        for (String word : wordList) {
            hashmap.put(word, index++);
        }

        // Create adjacency list
        int n = wordList.size();
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        // Build the graph (adjacency list)
        for (int i = 0; i < wordList.size(); i++) {
            for (int j = i + 1; j < wordList.size(); j++) {
                if (checkEdge(wordList.get(i), wordList.get(j))) {
                    int u = hashmap.get(wordList.get(i));
                    int v = hashmap.get(wordList.get(j));
                    adjList.get(u).add(v);
                    adjList.get(v).add(u);
                }
            }
        }

        // BFS initialization
        int start = hashmap.get(beginWord);
        int end = hashmap.get(endWord);
        int[] visited = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = 1;
        int level = 1;

        // BFS loop
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int curr = queue.poll();
                if (curr == end) {
                    return level;
                }
                for (int neighbor : adjList.get(curr)) {
                    if (visited[neighbor] == 0) {
                        visited[neighbor] = 1;
                        queue.add(neighbor);
                    }
                }
            }
            level++;
        }

        return 0;  // If no path is found
    }
}
