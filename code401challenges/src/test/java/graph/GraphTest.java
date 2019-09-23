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


}