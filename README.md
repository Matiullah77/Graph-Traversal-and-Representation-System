📌 Project Explanation (Overview)

This project implements a graph data structure using adjacency list representation and applies two fundamental traversal algorithms: Breadth-First Search (BFS) and Depth-First Search (DFS). The system is designed to analyze how these algorithms perform on graphs of different sizes (10, 30, and 100 vertices) by measuring execution time using System.nanoTime(). The goal is to understand graph traversal behavior, compare algorithm performance, and study how graph size affects computational efficiency.

📌 Vertex Class Explanation

The Vertex class represents a single node in the graph. Each vertex has a unique integer identifier (id). This class provides basic structure for nodes and includes a constructor, a getter method, and a toString method for easy display. Although the main graph uses integer-based indexing in the adjacency list, the Vertex class represents the conceptual structure of a node in a graph.

📌 Edge Class Explanation

The Edge class represents a connection between two vertices in the graph. It contains two fields: source and destination, which define the direction or relationship between nodes. This class helps conceptually model graph connections, even though the adjacency list internally manages these relationships.

📌 Graph Class Explanation

The Graph class is the core component of the system. It uses an adjacency list to store the graph structure efficiently. Each vertex maintains a list of its neighboring vertices.

This class provides the following functionalities:

Adding edges between nodes
Printing the graph structure
Performing BFS traversal using a queue
Performing DFS traversal using recursion

The adjacency list representation ensures efficient storage and allows traversal algorithms to run in optimal time complexity of O(V + E), where V is the number of vertices and E is the number of edges.

📌 BFS (Breadth-First Search) Explanation

Breadth-First Search (BFS) is a graph traversal algorithm that explores nodes level by level. It starts from a selected node and visits all its neighbors before moving deeper into the graph.

BFS uses a queue data structure to manage the traversal order. It is commonly used for finding the shortest path in unweighted graphs and exploring nodes in layers.

Time Complexity: O(V + E)

📌 DFS (Depth-First Search) Explanation

Depth-First Search (DFS) is a graph traversal algorithm that explores as far as possible along each branch before backtracking. It uses recursion or a stack to visit nodes deeply before moving to the next branch.

DFS is useful for tasks such as pathfinding, cycle detection, and topological sorting.

Time Complexity: O(V + E)

📌 Experiment Class Explanation

The Experiment class is responsible for running performance tests on the graph. It generates graphs of different sizes (10, 30, and 100 vertices) and performs BFS and DFS on each graph.

It also measures execution time using System.nanoTime() before and after each traversal. This allows comparison of BFS and DFS performance under different conditions.

The class helps analyze how algorithm performance changes with increasing graph size.

📌 Main Class Explanation

The Main class is the entry point of the program. It creates an instance of the Experiment class and executes all test cases. It triggers the generation of graphs, runs BFS and DFS traversals, and prints execution results.

📌 Observations (Analysis Section)

From the experiments, it is observed that both BFS and DFS have similar time complexity of O(V + E). However, their actual execution time may vary depending on graph structure and traversal order. BFS may perform differently than DFS depending on how nodes are connected in the randomly generated graph. As graph size increases, execution time also increases due to more vertices and edges being processed.

📌 Reflection

Through this project, I learned how graph data structures are implemented using adjacency lists and how traversal algorithms like BFS and DFS work in practice. I understood the difference between level-based traversal (BFS) and depth-based traversal (DFS). I also learned how to measure algorithm performance using System.nanoTime() and analyze how input size affects execution time. One challenge was understanding how random graph structure affects traversal order and performance results.




Graph Size 10:

<img width="1917" height="929" alt="Screenshot 2026-05-09 155559" src="https://github.com/user-attachments/assets/45aac769-ceef-4b66-ae49-14456f962245" />



Graph Size 30:
<img width="1919" height="924" alt="Screenshot 2026-05-09 155613" src="https://github.com/user-attachments/assets/e5dedc8f-82e2-48da-a8d7-04d2834f5289" />




Graph Size 100:
<img width="1919" height="935" alt="Screenshot 2026-05-09 155630" src="https://github.com/user-attachments/assets/e0eba881-ff08-4216-9bbf-9c04a62014d2" />


