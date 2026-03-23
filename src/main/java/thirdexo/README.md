#  Exercice 3 – Graphs (BFS & Shortest Path)






#  Dependency (Maven)

This project uses **JGraphT**.
you will find in pom.xml

---



#  Files Structure

```
thirdexo/
└── Wilaya.java   # Graph implementation (cities + routes)
```

---

#  Part B – Cities (Vertices)

The graph contains the following cities:

- Alger  
- Blida  
- Tipaza  
- Boumerdes  
- Medea  

---

# 🔗 Part C – Roads (Edges)

Initial connections:

- Alger – Blida  
- Alger – Tipaza  
- Alger – Boumerdes  
- Blida – Medea  

---

# 🔍 Features Implemented

## 1. Graph Creation
- Undirected graph using `SimpleWeightedGraph`

---

## 2. Adding Vertices
All cities are added using:

```java
wilgraph.addVertex("city name");
```

---

## 3. Adding Edges
Roads are added using:

```java
wilgraph.addEdge(source, target);
```

---

## 4. Display Graph Data

### Show all cities:
```java
wilgraph.vertexSet();
```

### Show all roads:
```java
wilgraph.edgeSet();
```

---

## 5. BFS Traversal (Breadth First Search)

BFS is performed starting from **Alger**:

```java
BreadthFirstIterator<String, DefaultWeightedEdge> it =
    new BreadthFirstIterator<>(wilgraph, "Alger");
```

✔ Displays visit order of cities
```java
 while(test.hasNext()){
            System.out.println(test.next());
        }
```

---

#  Part D – Graph Modifications

## ➕ Add isolated city

- Added: **Oran**
- Not connected to any city

✔ Result: Oran does NOT appear in BFS from Alger

---

## ➕ Add new road

- Added: **Tipaza – Medea**

✔ BFS result changes after adding this connection

---

#  Part E – Weighted Graph (Shortest Path)

##  Distances added:

- Alger – Blida = 50  
- Alger – Tipaza = 70  
- Alger – Boumerdes = 45  
- Blida – Medea = 90  
- Boumerdes – Tipaza = 80  
- Tipaza – Medea = 60  

---

##  Shortest Path Algorithm

Dijkstra algorithm is used:

```java
DijkstraShortestPath<String, DefaultWeightedEdge> shortpath =
    new DijkstraShortestPath<>(wilgraph);
```

---

## 📍 Shortest Path Results

### 1. Alger → Medea
searching the shortest path between alger and medea
```java
GraphPath<String, DefaultWeightedEdge> path1=shortpath.getPath("Alger", "Medea");
```
- Displays:
  - Total cost `getWeight`
  - Path taken `etVertexList()`
  

---

### 2. Boumerdes → Blida
searching the shortest path between boumerdes and blida
```java
GraphPath<String, DefaultWeightedEdge> path1=shortpath.getPath("Boumerdes", "Blida");
```
- Displays:
  - Total cost `getWeight`
  - Path taken `etVertexList()`

---
