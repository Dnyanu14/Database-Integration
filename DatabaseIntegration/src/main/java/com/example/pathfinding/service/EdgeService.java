// EdgeService.java
package com.example.pathfinding.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pathfinding.model.Edge;
import com.example.pathfinding.repository.EdgeRepository;

@Service
public class EdgeService {

    private final EdgeRepository edgeRepository;

    @Autowired
    public EdgeService(EdgeRepository edgeRepository) {
        this.edgeRepository = edgeRepository;
    }

    public List<Edge> getAllEdges() {
        return edgeRepository.findAll();
    }

    public Edge getEdgeById(Long id) {
        return edgeRepository.findById(id).orElse(null);
    }

    public Edge createEdge(Edge edge) {
        return edgeRepository.save(edge);
    }

    public Edge updateEdge(Long id, Edge updatedEdge) {
        Edge existingEdge = edgeRepository.findById(id).orElse(null);
        if (existingEdge != null) {
            existingEdge.setStartNode(updatedEdge.getStartNode());
            existingEdge.setEndNode(updatedEdge.getEndNode());
            existingEdge.setWeight(updatedEdge.getWeight());
            return edgeRepository.save(existingEdge);
        }
        return null;
    }

    public void deleteEdge(Long id) {
        edgeRepository.deleteById(id);
    }
}
