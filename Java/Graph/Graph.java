package graph;

import java.util.ArrayList;

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
}
