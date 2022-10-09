import java.util.*;
//for each node(Vertex)

public class Vertex implements Comparable<Vertex> {

    public String name;//name of vertex like R0,R1....
    public List<Edge> adjacenciesList;// for adjacent vertex connected with edges
    public int distance = Integer.MAX_VALUE;//set distance to infinity
    private boolean visited=false; // to avoid looping crate visited node
    public Vertex predecessor;

    public Vertex(String name) {
        this.name = name;
        this.adjacenciesList = new ArrayList<>();
    }


    public void addEdge(Edge edge) {
        this.adjacenciesList.add(edge);
    }


    public boolean isVisited()// to identify if a Node is visited
    {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    //to return the vertex name R0,R1
    @Override
    public String toString() {
        return this.name;
    }

    //for the priorityQueue to compare vertexes
    @Override
    public int compareTo(Vertex otherVertex) {
        return Double.compare(this.distance, otherVertex.getDistance());
    }
}
