public class Main {
    public static void main(String[] args) {

        Vertex PC0= new Vertex("R0");
        Vertex PC1= new Vertex("R1");
        Vertex PC2= new Vertex("R2");
        Vertex PC3= new Vertex("R3");
        Vertex PC4= new Vertex("R4");
        Vertex PC5= new Vertex("R5");
        Vertex PC6= new Vertex("R6");
        Vertex PC7= new Vertex("R7");


        PC0.addEdge(new Edge(16, PC0, PC3));

        PC3.addEdge(new Edge(15, PC3, PC6));
        PC3.addEdge(new Edge(10, PC3, PC1));

        PC1.addEdge(new Edge(2, PC1, PC2));
        PC1.addEdge(new Edge(14, PC1, PC4));
        PC1.addEdge(new Edge(10, PC1, PC3));

        PC2.addEdge(new Edge(12, PC2, PC4));
        PC2.addEdge(new Edge(20, PC2, PC5));
        PC2.addEdge(new Edge(2, PC2, PC1));

        PC5.addEdge(new Edge(15, PC5, PC4));
        PC5.addEdge(new Edge(1, PC5, PC7));
        PC5.addEdge(new Edge(20, PC5, PC2));

        PC4.addEdge(new Edge(15, PC4, PC5));
        PC4.addEdge(new Edge(12, PC4, PC2));
        PC4.addEdge(new Edge(14, PC4, PC1));
        PC4.addEdge(new Edge(13, PC4, PC6));

        PC7.addEdge(new Edge(17, PC7, PC3));
        PC7.addEdge(new Edge(1, PC7, PC5));

        PC6.addEdge(new Edge(13, PC6, PC4));
        PC6.addEdge(new Edge(15, PC6, PC3));
        PC6.addEdge(new Edge(17, PC6, PC7));




        DijkstraAlg shortestPath = new DijkstraAlg();
        shortestPath.DijkstraAlgorithm(PC0);


        System.out.println("****************************************************************");

        System.out.println("Smallest Cost from PC0 to PC7: " + PC7.getDistance() +
                "\t Forwarding Routers Shortest Path from PC0 to PC7: " + shortestPath.ShortestPathTo(PC7));



    }


}

