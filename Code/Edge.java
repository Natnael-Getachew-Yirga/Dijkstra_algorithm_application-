// Crate Edge(connection) between Vertex(Nodes) with link cost
public class Edge {
    private int Cost;//link cost of each node
    public Vertex source;//starting vertex
    public Vertex Dest;//destination node


    public Edge(int Cost, Vertex startVertex, Vertex targetVertex) {
        this.Cost = Cost;
        this.source = startVertex;
        this.Dest = targetVertex;

    }

    public double getWeight() {
        return Cost;
    }


    public Vertex getTargetVertex() {
        return Dest;
    }

}

