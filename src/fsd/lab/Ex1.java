package fsd.lab;

import static fsd.lab.GraphUtils.initGraph;

import java.util.Iterator;

import org.jgrapht.Graphs;
import org.jgrapht.graph.SimpleWeightedGraph;

import mpi.MPI;

public class Ex1 {

	public static void main(String[] args) {
		int rootRank = 0;
		int tag = 333;
		String message = "message";
		int currentRank = MPI.COMM_WORLD.Rank();
		int size = MPI.COMM_WORLD.Size();
		int[] parent = new int[size];
		SimpleWeightedGraph<Vertex, EnumWeightedEdge> graph = new SimpleWeightedGraph<>(EnumWeightedEdge.class);
		initGraph(graph);

		MPI.Init(args);

		if (currentRank == rootRank) {
			Iterator<Vertex> iterator = graph.vertexSet().iterator();
			Vertex vertex = null;
			while (iterator.hasNext()) {
				vertex = iterator.next();
				if (vertex.getValue() == rootRank) {
					break;
				}
			}
			if (vertex != null && vertex.getParent() == null) {
				vertex.setParent(vertex);
				for (Vertex neighbour : Graphs.neighborListOf(graph, vertex)) {
					MPI.COMM_WORLD.Send(message, 0, message.length(), MPI.OBJECT, neighbour.getValue(), tag);
				}
			}
		}

		while (true) {
			//TODO
			break;
		}

		MPI.Finalize();
	}
}
