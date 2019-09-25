package graph;

import java.util.ArrayList;
import java.util.List;

public class GetEdge {
    //vars
    List<Vertex> search;
    List<String> cities;
    Vertex first;
    Graph graph;
    //constructor
    public GetEdge(Graph graph, List<String> list){
        this.graph = graph;
        this.cities = list;
        //this.first = cities.get(0);
        //this.search = graph.breadth_first_search(first);
    }

    //methods
    public String airlines(){
        int price = 0;
        for (int i = 0 ; i < cities.size() ; i ++ ){
            Vertex city = translateStringToVertex(cities.get(i));
            System.out.println("landing at: " + city.getValue());
            //if its the last city, break out.
            if (cities.indexOf(cities.get(i)) == cities.size()-1) break;
            //if we can't get an adjacent list of edges, false.
            if (graph.adjacentVertices.get(city) == null) return "false, 0";
            //grab edges of current city
            List<Edge> edges = graph.adjacentVertices.get(city);
            // for each edge
            for (Edge connection : edges){
                Vertex connectionCity = connection.getVertex();
                System.out.println("connectionCity name: "+ connection.getVertex().getValue());
                System.out.println("connectionCity weight: "+ connection.getWeight());

                int connectionPrice = connection.getWeight();
                System.out.println();
                //if the name of the city (in cities) matches the city (in the adj list)
                if ( connectionCity.getValue().equals(cities.get(i+1)) ){
                    //add to price
                    price = price + connectionPrice;
                    System.out.println("adding price: " + price + " for this city: " + connectionCity.getValue());
                }
                else {
                    System.out.println("did not add price.");
                }
            }
        }
        return "true, " + price;
    }


    Vertex translateStringToVertex(String s){
        Vertex city = null;
        //for all the vertexes in the graph
        for ( Vertex v : graph.adjacentVertices.keySet()) {
            String value = v.getValue();
            //if list has the value of the vertex,
            if (s.equals(value) ) {
                //add to search
                city = v;
            }
        }
        return city;
    }
}
