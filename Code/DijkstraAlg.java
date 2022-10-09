import java.util.*;

public class DijkstraAlg {

    public void DijkstraAlgorithm(Vertex sourceVertex){

        sourceVertex.setDistance(0);//set source vertex 0
        PriorityQueue<Vertex> pq = new PriorityQueue<>();
        pq.add(sourceVertex);
        sourceVertex.setVisited(true);

        while( !pq.isEmpty() ){
            // Getting the minimum distance vertex from priority queue
            Vertex actualVertex = pq.poll();

            for(Edge edge : actualVertex.adjacenciesList){

                Vertex v = edge.getTargetVertex();
                if(!v.isVisited())
                {
                    double newDistance = actualVertex.getDistance() + edge.getWeight();

                    if( newDistance < v.getDistance() ){
                        v.setDistance((int) newDistance);
                        v.setPredecessor(actualVertex);
                        pq.add(v);
                    }
                }
            }
            actualVertex.setVisited(true);
        }
    }

    public List<Vertex> ShortestPathTo(Vertex targetVertex){
        List<Vertex> path = new ArrayList<>();

        for(Vertex vertex=targetVertex;vertex!=null;vertex=vertex.getPredecessor()){
            path.add(vertex);
        }

        Collections.reverse(path);
        return path;
    }

}
