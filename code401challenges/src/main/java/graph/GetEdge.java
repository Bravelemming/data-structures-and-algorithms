package graph;

import java.util.ArrayList;
import java.util.List;

public class GetEdge {
    //vars
    List<Vertex> search;
    List<Vertex> cities;
    Vertex first;
    Graph graph;
    //constructor
    public GetEdge(Graph graph, List<String> list){
        this.graph = graph;
        this.cities = translateStringToVertex(graph, list);
        this.first = cities.get(0);
        this.search = graph.breadth_first_search(first);
    }

    //methods
    public String airlines(){
        int price = 0;
        for (Vertex v : cities){
            System.out.println("v: " + v.getValue());
            //if its the last city, break out.
            if (cities.indexOf(v) == cities.size()-1) break;
            //if we can't get an adjacent list of edges, false.
            if (graph.adjacentVertices.get(v) == null) return "false, 0";
            //grab edges of current city
            List<Edge> edges = graph.adjacentVertices.get(v);
            // for each edge
            for (Edge e : edges){
                Vertex city = e.getVertex();
                System.out.println("e.GetVertex(): "+ e.getVertex().getValue());
                int singlePrice = e.getWeight();
                System.out.println();
                //if the name of the city (in cities) matches the city (in the adj list)
                if (v.getValue().equals(city.getValue())){
                    //add to price
                    price = price + singlePrice;
                    System.out.println("price: " + price);
                }
            }
        }
        return "true, " + price;
    }


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
