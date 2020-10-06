package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
	ArrayList<ArrayList<Integer>> graph;
	int nodes;

	public Graph(int nodes) {
		this.nodes = nodes;
		graph = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < nodes; i++)
			graph.add(new ArrayList<Integer>());
	}

	public void addEdge(int v, int u) {
		graph.get(v).add(u);
		graph.get(u).add(v);
	}

	public void printGraph() {
		for (int i = 0; i < nodes; i++) {
			System.out.print("Node " + i);
			for (int x : graph.get(i)) {
				System.out.print(" -> " + x);
			}
			System.out.println();
		}
	}

	public void breadthFirstSearch(int start) {
		boolean visited[] = new boolean[nodes];
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		System.out.println("Breadth First Search Traverse");
		visited[start] = true;

		while (q.isEmpty() == false) {
			int node = q.poll();
			System.out.print(node + " ");
			for (int x : graph.get(node)) {
				if (visited[x] == false) {
					visited[x] = true;
					q.add(x);
				}
			}
		}
	}

	public void depthFirstSearch(int start) {
		boolean visited[] = new boolean[nodes];
		System.out.print("\nDepth First Search Traverse\n");
		dfsUtil(start, visited);
	}

	public void dfsUtil(int node, boolean[] visited) {
		visited[node] = true;
		System.out.print(node + " ");
		for (int x : graph.get(node)) {
			if(visited[x]==false) {
				dfsUtil(x, visited);
			}
		}
	}
}