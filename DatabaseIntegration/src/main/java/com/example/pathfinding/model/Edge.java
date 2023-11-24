// Edge.java
package com.example.pathfinding.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Edge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "start_node_id")
    private Node startNode;

    @ManyToOne
    @JoinColumn(name = "end_node_id")
    private Node endNode;

    private double weight;

    // Constructors

    public Edge() {
        // Default constructor
    }

    public Edge(Node startNode, Node endNode, double weight) {
        this.startNode = startNode;
        this.endNode = endNode;
        this.weight = weight;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Node getStartNode() {
        return startNode;
    }

    public void setStartNode(Node startNode) {
        this.startNode = startNode;
    }

    public Node getEndNode() {
        return endNode;
    }

    public void setEndNode(Node endNode) {
        this.endNode = endNode;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // toString() method for better logging and debugging

    @Override
    public String toString() {
        return "Edge{" +
                "id=" + id +
                ", startNode=" + startNode +
                ", endNode=" + endNode +
                ", weight=" + weight +
                '}';
    }
}
