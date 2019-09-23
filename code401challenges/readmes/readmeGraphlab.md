# implement a Graph
- Author: Jack Daniel Kinne.
- Challenge by: Codefellows.
<!-- Short summary or background information -->
- implement a Graph as an adjacency list

## Challenge
<!-- Description of the challenge -->
- AddNode()
- Adds a new node to the graph
- Takes in the value of that node
- Returns the added node
- AddEdge()
- Adds a new edge between two nodes in the graph
- Include the ability to have a “weight”
- Takes in the two nodes to be connected by the edge
- Both nodes should already be in the Graph
- GetNodes()
- Returns all of the nodes in the graph as a collection (set, list, or similar)
- GetNeighbors()
- Returns a collection of nodes connected to the given node
- Takes in a given node
- Include the weight of the connection in the returned collection
- Size()
- Returns the total number of nodes in the graph
  
## Approach & Efficiency
- use a hashmap, key is vertex, value is List of Edge
- A vertex has a string value.
- An edge has a int weight and vertex its pointing to.
- addVertex()
- removeVertex()
- addEdgeBi()
- addEdgeAtoB()
- removeEdge()
- has()
- print()

## Testing
- Node can be successfully added to the graph
- An edge can be successfully added to the graph
- A collection of all nodes can be properly retrieved from the graph
- All appropriate neighbors can be retrieved from the graph
- Neighbors are returned with the weight between nodes included
- The proper size is returned, representing the number of nodes in the graph
- A graph with only one node and edge can be properly returned
- An empty graph properly returns null

## credits and contributions
- Demi the dog
- Ginger the dog
- https://www.baeldung.com/java-graphs
