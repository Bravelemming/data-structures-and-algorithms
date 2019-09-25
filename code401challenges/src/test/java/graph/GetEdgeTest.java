package graph;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GetEdgeTest {

    @Test
    public void airlinesTestOne() {
        Graph graph = new Graph();

        Vertex vone = graph.addVertex("Mordor");
        Vertex vtwo = graph.addVertex("C317");
        Vertex vthree = graph.addVertex("Soho");
        Vertex vfour = graph.addVertex("Morty Smith");
        Edge e = graph.addEdgeAtoB(vone, vtwo, 2);
        Edge e2 = graph.addEdgeAtoB(vtwo, vthree, 3);
        Edge e3 = graph.addEdgeAtoB(vthree, vfour, 4);

        List<String> list = new ArrayList<>();
        list.add("Mordor");
        list.add("C317");
        list.add("Soho");

        GetEdge getEdge = new GetEdge(graph, list);

        String actual = getEdge.airlines();

        System.out.println(actual);
    }
    @Test
    public void airlinesTestTwo() {
        Graph graph = new Graph();

        Vertex vone = graph.addVertex("Mordor");
        Vertex vtwo = graph.addVertex("C317");
        Vertex vthree = graph.addVertex("Soho");
        Vertex vfour = graph.addVertex("Morty Smith");
        Vertex vfive = graph.addVertex("summer");
        Vertex vsix = graph.addVertex("winter");
        Vertex vseven = graph.addVertex("fall");
        Vertex veight = graph.addVertex("spring");
        Edge e = graph.addEdgeAtoB(vone, vtwo, 3);
        Edge e2 = graph.addEdgeAtoB(vtwo, vthree, 2);
        Edge e3 = graph.addEdgeAtoB(vthree, vfour, 1);
        Edge e4 = graph.addEdgeAtoB(vthree, vone, 4);
        Edge e5 = graph.addEdgeAtoB(vfive, vseven, 5);
        Edge e6 = graph.addEdgeAtoB(veight, vsix, 6);

        List<String> list = new ArrayList<>();
        list.add("summer");
        list.add("fall");

        GetEdge getEdge = new GetEdge(graph, list);

        String actual = getEdge.airlines();

        System.out.println(actual);
    }
}