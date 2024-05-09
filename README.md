# BlueBikeSystem

## Introduction
BlueBikeSystem is a project that simulates a network of bike stations represented as vertices connected by edges representing the distance covered by the bikes. This project aims to analyze various algorithms applied to the graph network, including BFS, DFS, SSSP (Dijkstra's Algorithm), and MSSP (Floyd Warshall's Algorithm).

## Proposal
The project proposes creating a graph network for the Blue-Bike System, where bikes act as vertices and edges represent the distance covered by the bikes. Since a bike can be dropped at any location, including the pickup location, cyclic edges are also present. The weight for the edges is the distance covered by the bike.

## Aim
The aim of the project is to create the network and run various algorithms to perform analysis, including:
1. Breadth First Search (BFS)
2. Depth First Search (DFS)
3. Single Source Shortest Path (SSSP) - Dijkstra's Algorithm
4. Multiple Source Shortest Path (MSSP) - Floyd Warshall's Algorithm

## Implementation
The project is implemented using Java, where a graph is created with multiple vertices representing bike stations and edges between two stations with weights as the distance between them.

### Algorithms Implemented
1. **Breadth First Search (BFS)**: Used to traverse the graph in a breadth-first manner.
2. **Depth First Search (DFS)**: Used to traverse the graph in a depth-first manner.
3. **Single Source Shortest Path (SSSP)**: Implemented Dijkstra's Algorithm to find the shortest path from a single source to all other vertices.
4. **Multiple Source Shortest Path (MSSP)**: Implemented Floyd Warshall's Algorithm to find the shortest paths between all pairs of vertices.

## Repository
The project repository contains the following components:
- **src**: Contains the Java source code files for the project.
- **data**: Contains any data files used in the project (if applicable).
- **README.md**: This file providing an overview of the project.
- **Documentation**: Contains additional documentation or reports related to the project (if applicable).

## Usage
To use the BlueBikeSystem project:
1. Clone the repository to your local machine.
2. Import the project into your preferred Java IDE.
3. Run the main program or specific algorithms to analyze the graph network.

## Contributors
- [Preyash Mehta](https://www.linkedin.com/in/preyash-mehta/) - Project Lead

## License
This project is licensed under the [MIT License](link-to-license-file).
