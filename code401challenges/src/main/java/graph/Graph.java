package graph;

import java.util.*;

public class Graph {
    //vars
    HashMap<Vertex, List<Edge>> adjacentVertices;

    //constructor
    public Graph (){
        adjacentVertices = new HashMap<>();
    }

    //methods
    Vertex addVertex(String value) {
        Vertex v = new Vertex(value);
        //does not double add an existing vertex
        List<Edge> e = new ArrayList<>();
        this.adjacentVertices.putIfAbsent( v, e );
        return v;
    }

    void removeVertex(String value) {
        for ( Vertex v : adjacentVertices.keySet()){
            if (v.getValue().equals(value)){
                //remove the list at key v
                adjacentVertices.remove(v);
            }
            else {
                //get list
                List<Edge> list = adjacentVertices.get(v);
                //iterate and get the edges
                for (Edge edge : list) {
                    if (edge.getVertex().getValue().equals(value)){
                        //remove edge
                        list.remove(edge);
                    }
                }
            }
        }

    }

    Edge addEdgeBi(Vertex vA, Vertex vB, int weightA, int weightB) {
        //edges
        Edge etoA = new Edge(weightA, vA);
        Edge etoB = new Edge(weightB, vB);
        //get lists at key
        List<Edge> listA = adjacentVertices.get(vA);
        List<Edge> listB = adjacentVertices.get(vB);
        //add edge from A to B, and B to A.
        listA.add(etoB);
        listB.add(etoA);

        return etoA;
    }

    Edge addEdgeAtoB(Vertex vA, Vertex vB, int weight) {
        //edge
        Edge e = new Edge(weight, vB);
        //get lists at key A
        List<Edge> listA = adjacentVertices.get(vA);
        //add edge from A to B.
        listA.add(e);
        return e;
    }

    Edge removeEdge(Vertex vA, Vertex vB) {
        //call lists, remove if they exist.
        List<Edge> adjacentA = adjacentVertices.get(vA);
        if (adjacentA != null) {
            for (Edge e : adjacentA) {
                //if that edge exists
                if (e.getVertex().equals(vB)) {
                    adjacentA.remove(e);
                    return e;
                }
            }
        }
        return null;
    }

    List<Edge> getAdjacentVerticesOfString(String value) {
        for (Vertex v : adjacentVertices.keySet()){
            if (v.getValue().equals(value)){
                return this.adjacentVertices.get( v );
            }
        }
        return null;
    }

    List<Edge> getAdjacentVerticesOf(Vertex v) {
        return this.adjacentVertices.get( v );
    }

    boolean has(String value) {
        for (Vertex v : adjacentVertices.keySet()){
            if (v.getValue().equals(value)){
                return true;
            }
        }
        return false;
    }

    public String print(Vertex v){
        StringBuilder sb = new StringBuilder("");
        List<Edge> list = this.adjacentVertices.get(v);
        if (!list.isEmpty()){
            for (Edge e : list){
                sb.append(e.print());
            }
        }
        return sb.toString();
    }

    int size(){
        return this.adjacentVertices.size();
    }

    // code challenge 36 - breadth first search
    //helper function, didnt end up using it but i'm totally keeping it.
    void recursiveAddToList(Vertex current, Queue<Vertex> toBeWalked, List<Vertex> seen){
        //if null, exit
        if (current == null){
            return;
        }
        //iterate tobewalked
        while (toBeWalked != null) {
            //grab list of edges
            List<Edge> el = this.adjacentVertices.get(current);
            //for each edge
            for (Edge e : el) {
                //if we haven't seen it
                if (!seen.contains(e.getVertex())) {
                    //add it to seen
                    seen.add(e.getVertex());
                    //add it to queue
                    toBeWalked.add(e.getVertex());
                }
            }
            //move current forward
            current = toBeWalked.poll();
        }

    }

    List<Vertex> breadth_first_search(Vertex v){
        //vars
        Vertex current = v;
        List<Vertex> seen = new ArrayList<>();
        Queue<Vertex> toBeWalked = new LinkedList<>();
        //setup
        seen.add(v);
        toBeWalked.add(v);

        //iterate tobewalked
        while ( current!= null ) {
            //grab list of edges
            List<Edge> el = this.adjacentVertices.get(current);
            //for each edge
            for (Edge e : el) {
                //if we haven't seen it
                if (!seen.contains(e.getVertex())) {
                    //add it to seen
                    seen.add(e.getVertex());
                    //add it to queue
                    toBeWalked.add(e.getVertex());
                }
            }
            //move current forward
            current = toBeWalked.poll();
        }
        return seen;
    }


    //gets and sets
    public HashMap<Vertex, List<Edge>> getAdjacentVertices() {
        return adjacentVertices;
    }
    public void setAdjacentVertices(HashMap<Vertex, List<Edge>> adjacentVertices) {
        this.adjacentVertices = adjacentVertices;
    }
}


