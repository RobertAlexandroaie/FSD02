package fsd.lab;

import org.jgrapht.graph.SimpleWeightedGraph;

public class GraphUtils {

	public static void initGraph(SimpleWeightedGraph<Vertex, EnumWeightedEdge> graph) {
		graph.addVertex(new Vertex(0));
		graph.addVertex(new Vertex(1));
		graph.addVertex(new Vertex(2));
		graph.addVertex(new Vertex(3));
	}

}
