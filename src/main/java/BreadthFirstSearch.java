public class BreadthFirstSearch { public static int[] bfs(int[][] graph) {CISQueue q = new CISQueue(0);boolean[] visited = new boolean[graph.length];int[] path = new int[graph.length];path[0] = 0;int idx = 0;visited[0] = true;while (!q.isEmpty()) {         int currentNode = (int)q.dequeue();         visited[currentNode] = true;         path[idx] = currentNode;idx++;int[] temp = graph[currentNode];for (int i = 0; i < temp.length; i++) {if (!visited[temp[i]]) {visited[temp[i]] = true;q.enqueue(temp[i]);}}     }return path;}}