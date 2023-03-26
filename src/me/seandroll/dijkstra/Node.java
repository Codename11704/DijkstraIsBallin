package me.seandroll.djikstra;

import java.util.HashMap;

public class Node {
    private final String name;
    private HashMap<Node, Double> neighbors = new HashMap<>();

    public Node(String name) {
        this.name = name;
    }

    public void addNeighbor(Node newNeighbor, double weight) {
        this.neighbors.put(newNeighbor, weight);
        newNeighbor.addNeighbor(this, weight);
    }

    public HashMap<Node, Double> getNeighbors() {
        return this.neighbors;
    }

    public double getWeight(Node neighbor) {
        return this.neighbors.get(neighbor);
    }


    public String getName() {
        return this.name;
    }
}
