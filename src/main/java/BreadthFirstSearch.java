
public class BreadthFirstSearch {

    /** bfs will take an Adjacency List as input and return an array containing the order of nodes traversed via a Breadth First Search.
     *
     * @param graph - an Adjacency List
     * @return - an array containing the order of nodes traversed via a Breadth First Search.
     */
    public static int[] bfs(int[][] graph) {

        // Create a Queue and add the first node (0) to it. Use your Queue class that you just created!
        CISQueue q = new CISQueue(0);
        // Create a visited array. This array will track whether we have visited a specific node.
        boolean[] visited = new boolean[graph.length];
        // Create a bfs path array and a bfs path index. This array will track the order that the nodes were visited.
        int[] path = new int[graph.length];
        path[0] = 0;
        int idx = 0;
        // Add the first node (0) to the queue.

        // Record the first node (0) as visited.
        visited[0] = true;
        // Time to traverse the graph! While the queue is not empty ...
        while (!q.isEmpty()) {
            // Dequeue (poll) the queue and store this value in a variable called currentNode.
            int currentNode = (int)q.dequeue();
            // Record this node as visited.
            visited[currentNode] = true;
            // Add this node to the path and update the path index.

            path[idx] = currentNode;
            idx++;
            // Obtain an array of this node's neighbouring/adjacent nodes.
            int[] temp = graph[currentNode];
            // Explore the current nodes neighbouring nodes. For each neighbouring node ...
            for (int i = 0; i < temp.length; i++) {
                if (!visited[temp[i]]) {
                    visited[temp[i]] = true;
                    q.enqueue(temp[i]);
                }
            }
            // If a neighbour hasn't been visited before ...

            // Record the neighbour as visited.

            // Add the neighbour to the queue.
        }
        // Return bfs path.
        return path;
        
    }
}
