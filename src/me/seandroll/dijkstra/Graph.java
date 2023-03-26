package me.seandroll.djikstra;

import java.util.*;

public class Graph {
    private HashMap<String, Node> graph = new HashMap<>();

    public void addNode(Node node) {
        this.graph.put(node.getName(), node);
    }

    public Node getNode(String name) {
        return this.graph.get(name);
    }

    public HashMap<Node, Double> findShortestPath(Node start, Node end) {
        HashMap<Node, Double> accessible = new HashMap<>();
        accessible.put(start, 0.0);
        for(Node node : getAllAccessible(start)) {
            accessible.put(node, Double.POSITIVE_INFINITY);
        }
        if(!accessible.containsValue(end)) return null;
        Map<Node, Double> neighbors  = start.getNeighbors();










        return null;
    }

    public Set<Node> getAllAccessible(Node node) {
        Set<Node> neighbors = node.getNeighbors().keySet();
        for(Node neighbor: neighbors) {
            neighbors.addAll(getAllAccessible(neighbor));
        }
        return neighbors;
    }



}
