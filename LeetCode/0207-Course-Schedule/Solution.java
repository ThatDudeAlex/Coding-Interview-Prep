class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>(numCourses);
        for (int i = 0; i <= numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        // Keep track of visited nodes and nodes in current path
        boolean[] visited = new boolean[numCourses];
        boolean[] inCurrentPath = new boolean[numCourses];

        for (int course = 0; course < numCourses; course++) {

            if (hasCycle(course, graph, visited, inCurrentPath)) {
                return false;
            }
        }

        return true;
    }

    private boolean hasCycle(int course, List<List<Integer>> graph, boolean[] visited, boolean[] inCurrentPath) {

        if (inCurrentPath[course]) {
            return true;
        } else if (visited[course]) {
            return false;
        }

        inCurrentPath[course] = true;
        visited[course] = true;

        // int preReq = graph.get(course);

        // Check all dependent courses
        for (int preReq : graph.get(course)) {
            if (hasCycle(preReq, graph, visited, inCurrentPath)) {
                return true;
            }
        }
        inCurrentPath[course] = false;

        return false;
    }
}