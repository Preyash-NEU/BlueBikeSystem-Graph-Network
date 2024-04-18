package GraphPSA;

import java.util.HashMap;
import java.util.Map;

public class GraphNetwork {
    Map<Character, Map<Character, Integer>> graph;

    public GraphNetwork() {
        graph = new HashMap<>();
        //Represents the Graph with 15 vertices comprising of various stations across the city
        for (char c = 'A'; c <= 'L'; c++) {
            graph.put(c, new HashMap<>());
        }
    }

    	//Adding an directed edge for the graph which takes in a start, end and the weight
    public void addEdge(char start, char end, int weight) {
        graph.get(start).put(end, weight);
    }

    public int getWeight(char start, char end) {
        return graph.get(start).getOrDefault(end, -1);
    }
}
