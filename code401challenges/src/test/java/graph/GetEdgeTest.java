package graph;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GetEdgeTest {

    @Test
    public void airlines() {
        Graph graph = new Graph();

        Vertex vone = graph.addVertex("Mordor");
        Vertex vtwo = graph.addVertex("C317");
        Vertex vthree = graph.addVertex("Soho");
        Vertex vfour = graph.addVertex("Morty Smith");
        Edge e = graph.addEdgeAtoB(vone, vtwo, 3);
        Edge e2 = graph.addEdgeAtoB(vtwo, vthree, 3);
        Edge e3 = graph.addEdgeAtoB(vthree, vfour, 3);

        List<String> list = new ArrayList<>();
        list.add("Mordor");
        list.add("C317");
        list.add("Soho");

        GetEdge getEdge = new GetEdge(graph, list);

        String actual = getEdge.airlines();

        System.out.println(actual);
    }
}