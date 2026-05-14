# Dijkstras
Implement Dijkstras Alg to find shortest distance between state capitols

Assignment 6
CS 3345

STRUCTURE
==========
Vertex.java defines the Vertex class
Main.java contains the matrix, edges, and Dijkstra's algorithm


DIJKSTRA'S ALGORITHM
======================
All vertex distances start at 9999 (infinity) except 0 which is set to 0.
We repeatedly pick an unvisited vertex with the smallest distance, set it to found then update its neighbors if we can find a shorter path


DISTANCE MATRIX
================
Distances between all 48 capitals are stored in a 48x48 matrix which defaults to 9999
The diagonal is set to 0 and the edges are loaded symmetrically so matrix[u][v] = matrix[v][u].


VERTEX ARRAY
=============
Each state is a Vertex object. The vertex can be found (bool), has a distance (dist), and has a previous vertex (prev)