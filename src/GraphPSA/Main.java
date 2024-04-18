package GraphPSA;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GraphNetwork network = new GraphNetwork();

        // Defining the Graph vertices, edges, and weights
        network.addEdge('A', 'B', 5);
        network.addEdge('A', 'C', 3);
        network.addEdge('B', 'D', 2);
        network.addEdge('B', 'E', 4);
        network.addEdge('C', 'F', 7);
        network.addEdge('C', 'G', 6);
        network.addEdge('D', 'H', 1);
        network.addEdge('D', 'I', 3);
        network.addEdge('E', 'J', 2);
        network.addEdge('E', 'K', 4);
        network.addEdge('F', 'L', 5);
        network.addEdge('F', 'A', 3);
        network.addEdge('G', 'B', 2);
        network.addEdge('H', 'C', 4);
        network.addEdge('I', 'D', 1);

        Scanner scanner = new Scanner(System.in);
        char algorithmChoice;

        do {
            System.out.println("Choose an algorithm to apply:");
            System.out.println("1. Breadth-First Search (BFS) Algorithm");
            System.out.println("2. Depth-First Search (DFS) Algorithm");
            System.out.println("3. Single Source Shortest Path Algorithm");
            System.out.print("Enter your choice (1, 2 or 3): ");
            algorithmChoice = scanner.next().charAt(0);
            scanner.nextLine();

            switch (algorithmChoice) {
            	case '1':
            		System.out.print("Enter the starting vertex for BFS traversal: ");
            		char stVertex = scanner.next().charAt(0);
            		scanner.nextLine();
            		System.out.println("BFS traversal starting from vertex '" + stVertex + "':");
            		BFSAlgorithm bfs = new BFSAlgorithm(network);
            		bfs.bfs(stVertex);
            		break;
                case '2':
                    System.out.print("Enter the starting vertex for DFS traversal: ");
                    char startVertex = scanner.next().charAt(0);
                    scanner.nextLine();
                    System.out.println("DFS traversal starting from vertex '" + startVertex + "':");
                    DFSAlgorithm dfs = new DFSAlgorithm(network);
                    dfs.dfs(startVertex);
                    break;
                case '3':
                    System.out.print("Enter the starting vertex for SSSP calculation: ");
                    char sourceVertex = scanner.next().charAt(0);
                    scanner.nextLine(); // Consume newline character
                    SingleSourceShortestPath sssp = new SingleSourceShortestPath(network);
                    Map<Character, Integer> shortestDistances = sssp.dijkstra(sourceVertex);
                    
                    System.out.println("Shortest distances from vertex " + sourceVertex + ":");
                    for (Map.Entry<Character, Integer> entry : shortestDistances.entrySet()) {
                        System.out.println("Distance to vertex " + entry.getKey() + ": " + entry.getValue());
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
               
            }

            System.out.print("\nDo you want to continue? (y/n): ");
            algorithmChoice = scanner.next().charAt(0);
            scanner.nextLine();
        } while (algorithmChoice == 'y' || algorithmChoice == 'Y');

        scanner.close();
    }
}



