package graph;

public class Edge {
    //vars
    int weight;
    Vertex vertex;

    //cons
    public Edge(int weight, Vertex vertex){
        this.weight = weight;
        this.vertex = vertex;
    }

    //methods

    public String print(){
        return ("v: " + this.getVertex().getValue() + "w: " + this.getWeight() );
    }

    //gets and sets

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Vertex getVertex() {
        return vertex;
    }

    public void setVertex(Vertex vertex) {
        this.vertex = vertex;
    }
}
