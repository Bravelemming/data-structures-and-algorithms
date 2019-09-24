package graph;

import java.util.ArrayList;
import java.util.List;

public class GetEdge {
    //vars
    List<Vertex> search;
    List<Vertex> cities;
    Vertex first;
    //constructor
    public GetEdge(Graph graph, List<String> list){
        this.cities = translateStringToVertex(graph, list);
        this.first = cities.get(0);
        this.search = graph.breadth_first_search(first);
    }

    //methods
    List<Vertex> translateStringToVertex(Graph graph, List<String>list){
        List<Vertex> cities = new ArrayList<>();
        //for all the vertexes in the graph
        for ( Vertex v : graph.adjacentVertices.keySet()) {
            String value = v.getValue();
            //if list has the value of the vertex,
            if (list.contains(value) ) {
                //add to search
                cities.add(v);
            }
        }
        return cities ;
    }
}
