package thirdexo;


import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;
import org.jgrapht.traverse.BreadthFirstIterator;


public class Wilaya {
    public static void main(String[] args) {
        Graph<String, DefaultWeightedEdge> wilgraph=new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
        
        wilgraph.addVertex("Alger");
        wilgraph.addVertex("Blida");
        wilgraph.addVertex("Tipaza");
        wilgraph.addVertex("Boumerdes");
        wilgraph.addVertex("Medea");

        wilgraph.addEdge("Alger", "Blida");
        wilgraph.addEdge("Alger", "Tipaza");
        wilgraph.addEdge("Alger", "Boumerdes");
        wilgraph.addEdge("Blida","Medea" );

        System.out.println("displaying all wilaya");
        System.out.println(wilgraph.vertexSet());

        System.out.println("Display all roads");
        System.out.println(wilgraph.edgeSet());

        BreadthFirstIterator<String, DefaultWeightedEdge> test=new BreadthFirstIterator<>(wilgraph, "Alger");
        
        while(test.hasNext()){
            System.out.println(test.next());
        }

        wilgraph.addVertex("Oran");
        BreadthFirstIterator<String, DefaultWeightedEdge> test1=new BreadthFirstIterator<>(wilgraph, "Alger");

        System.out.println("after adding oran");        
        
        while(test1.hasNext()){
            System.out.println(test1.next());
        }

        wilgraph.addEdge("Tipaza", "Medea");
        BreadthFirstIterator<String, DefaultWeightedEdge> test2=new BreadthFirstIterator<>(wilgraph, "Alger");

        
        System.out.println("display after adding road between tipaza and medea");
        while(test2.hasNext()){
            System.out.println(test2.next());
        }
        wilgraph.setEdgeWeight("Alger", "Blida", 50);
        wilgraph.setEdgeWeight("Alger", "Tipaza",70);
        wilgraph.setEdgeWeight("Alger", "Boumerdes",45);
        wilgraph.setEdgeWeight("Blida", "Medea", 90);
        wilgraph.addEdge("Boumerdes", "Tipaza");
        wilgraph.setEdgeWeight("Boumerdes", "Tipaza", 80);
        wilgraph.setEdgeWeight("Tipaza", "Medea",60);

        DijkstraShortestPath<String ,DefaultWeightedEdge> shortpath=new DijkstraShortestPath<>(wilgraph);
        
        System.out.println("the shortes path between algeria and medea is ");
        GraphPath<String, DefaultWeightedEdge> path1=shortpath.getPath("Alger", "Medea");
        System.out.println(path1.getWeight());

        GraphPath<String, DefaultWeightedEdge> path2=shortpath.getPath("Boumerdes", "Blida");
        System.out.println("the shortes path  between boumerdes and blida is ");
        System.out.println(path2.getWeight());

        System.out.println("display the path between alger and medea");
        System.out.println(path1.getVertexList());

        System.out.println("display the path between boumerder and blida");
        System.out.println(path2.getVertexList());







        








    }

    

    
}
