package graph;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GraphTest {

    @Before
    public void setUp() throws Exception {

//        graph.addVertex("Grimley the Orthodontist");
//        graph.addVertex("Susan from accounting");
//        graph.addVertex("Denver the Last Dinosaur");
//        graph.addVertex("Shiela the cat");
//        graph.addEdgeBi("Shiela the cat", "Denver the Last Dinosaur");
//        graph.addEdgeAtoB("Susan from accounting", "Grimley the Orthodontist");
//        graph.addEdgeAtoB("Ultron the defender", "Susan from accounting");
    }

    @Test
    public void addVertexTest() {
        Graph graph = new Graph();
        String name = "Ultron the defender";
        Vertex vfive = graph.addVertex(name);

        assertTrue( graph.has(name) );
    }
    @Test
    public void addVertexTestNull() {
        Graph graph = new Graph();
        String name = "Ultron the defender";
        String fail = "Ultron";
        Vertex vone = graph.addVertex(name);
        assertFalse( graph.has(fail) );
    }

    @Test
    public void addGraphEmpty() {
        Graph graph = new Graph();
        assertTrue( graph.getAdjacentVertices().isEmpty() );
    }


    @Test
    public void removeVertex() {
        Graph graph = new Graph();
        String name = "Ultron the defender";
        Vertex vfive = graph.addVertex(name);

        graph.removeVertex(name);
        assertNull(graph.adjacentVertices.get(vfive) );
    }

    @Test
    public void addEdgeBi() {
        Graph graph = new Graph();
        String name = "Ultron the defender";

        Vertex vone = graph.addVertex("Grimley the Orthodontist");
        Vertex vtwo = graph.addVertex("Susan from accounting");

        Edge e = graph.addEdgeBi(vone, vtwo, 3, 2);
        List<Edge> list = graph.adjacentVertices.get(vtwo);

        assertTrue(list.contains(e));
    }

    @Test
    public void addEdgeAtoB() {
        Graph graph = new Graph();
        String name = "Ultron the defender";

        Vertex vone = graph.addVertex("Grimley the Orthodontist");
        Vertex vtwo = graph.addVertex("Susan from accounting");

        Edge e = graph.addEdgeAtoB(vone, vtwo, 3);

        List<Edge> list = graph.adjacentVertices.get(vone);

        assertTrue(list.contains(e));

    }

    @Test
    public void removeEdges() {

        Graph graph = new Graph();

        Vertex vone = graph.addVertex("Grimley the Orthodontist");
        Vertex vtwo = graph.addVertex("Susan from accounting");

        Edge e = graph.addEdgeAtoB(vone, vtwo, 3);

        Edge removed = graph.removeEdge(vone, vtwo);

        List<Edge> list = graph.adjacentVertices.get(vone);


        assertFalse(list.contains(removed));
    }

    @Test
    public void printTest() {

        Graph graph = new Graph();
        String name = "Ultron the defender";

        Vertex vone = graph.addVertex("Grimley the Orthodontist");
        Vertex vtwo = graph.addVertex("Susan from accounting");

        Edge e = graph.addEdgeAtoB(vone, vtwo, 3);

        List<Edge> list = graph.adjacentVertices.get(vone);

        String actual = graph.print(vone);

        String expected = "v: Susan from accountingw: 3";

        assertEquals(expected, actual);
    }

    @Test
    public void sizeTest() {

        Graph graph = new Graph();

        Vertex vone = graph.addVertex("Grimley the Orthodontist");
        Vertex vtwo = graph.addVertex("Susan from accounting");

        Edge e = graph.addEdgeAtoB(vone, vtwo, 3);

        List<Edge> list = graph.adjacentVertices.get(vone);

        int actual = graph.size();

        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void getVertexsOfTest() {

        Graph graph = new Graph();

        Vertex vone = graph.addVertex("Grimley the Orthodontist");
        Vertex vtwo = graph.addVertex("Susan from accounting");

        Edge e = graph.addEdgeAtoB(vone, vtwo, 3);

        List<Edge> list = graph.getAdjacentVerticesOf(vone);


        assertNotNull(list);
    }

    @Test
    public void breathFirstSearchTest() {
        Graph graph = new Graph();

        Vertex vone = graph.addVertex("Grimley the Orthodontist");
        Vertex vtwo = graph.addVertex("Susan from accounting");
        Vertex vthree = graph.addVertex("Rick Sanchez");
        Vertex vfour = graph.addVertex("Morty Smith");
        Edge e = graph.addEdgeAtoB(vone, vtwo, 3);
        Edge e2 = graph.addEdgeAtoB(vtwo, vthree, 3);
        Edge e3 = graph.addEdgeAtoB(vthree, vfour, 3);

        List<Vertex> list = graph.breadth_first_search(vone);

        StringBuilder sb = new StringBuilder("");

        for (Vertex v : list){
            sb.append(v.getValue());
        }
        String s = sb.toString();
        String expected = "Grimley the OrthodontistSusan from accountingRick SanchezMorty Smith";

        assertEquals(s, expected);

    }

    @Test
    public void depthFirstSearchTest() {
        Graph graph = new Graph();

        Vertex vone = graph.addVertex("Grimley the Orthodontist");
        Vertex vtwo = graph.addVertex("Susan from accounting");
        Vertex vthree = graph.addVertex("Rick Sanchez");
        Vertex vfour = graph.addVertex("Morty Smith");
        Edge e = graph.addEdgeAtoB(vone, vtwo, 3);
        Edge e2 = graph.addEdgeAtoB(vtwo, vthree, 3);
        Edge e3 = graph.addEdgeAtoB(vthree, vfour, 3);

        List<Vertex> list = graph.depth_first_search(vone);

        StringBuilder sb = new StringBuilder("");

        for (Vertex v : list) {
            sb.append(v.getValue() + " ");
        }
        String s = sb.toString();
        String expected = "Grimley the Orthodontist Susan from accounting Rick Sanchez Morty Smith ";

        assertEquals(s, expected);
    }

    @Test
    public void depthFirstSearchTestTwo() {
        Graph graph = new Graph();

        Vertex vone = graph.addVertex("Grimley the Orthodontist");
        Vertex vtwo = graph.addVertex("Susan from accounting");
        Vertex vthree = graph.addVertex("Rick Sanchez");
        Vertex vfour = graph.addVertex("Morty Smith");
        Vertex vfive = graph.addVertex("Bob");
        Vertex vsix = graph.addVertex("CTHULU WHO RISES FROM THE DEEP");

        Edge e = graph.addEdgeAtoB(vone, vtwo, 3);
        Edge e2 = graph.addEdgeAtoB(vtwo, vthree, 3);
        Edge e3 = graph.addEdgeAtoB(vthree, vfour, 3);
        Edge e4 = graph.addEdgeAtoB(vthree, vfive, 3);
        Edge e5 = graph.addEdgeAtoB(vfour, vsix, 3);
        Edge e6 = graph.addEdgeAtoB(vone, vsix, 3);

        List<Vertex> list = graph.depth_first_search(vone);

        StringBuilder sb = new StringBuilder("");

        for (Vertex v : list) {
            sb.append(v.getValue() + " ");
        }
        String s = sb.toString();
        String expected = "Grimley the Orthodontist Susan from accounting Rick Sanchez Morty Smith CTHULU WHO RISES FROM THE DEEP Bob ";

        assertEquals(s, expected);
    }
}