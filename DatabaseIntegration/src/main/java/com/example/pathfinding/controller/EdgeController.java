// EdgeController.java
package com.example.pathfinding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pathfinding.model.Edge;
import com.example.pathfinding.service.EdgeService;

@RestController
@RequestMapping("/api/edges")
public class EdgeController {

    private final EdgeService edgeService;

    @Autowired
    public EdgeController(EdgeService edgeService) {
        this.edgeService = edgeService;
    }

    @GetMapping
    public List<Edge> getAllEdges() {
        return edgeService.getAllEdges();
    }

    @GetMapping("/{id}")
    public Edge getEdgeById(@PathVariable Long id) {
        return edgeService.getEdgeById(id);
    }

    @PostMapping
    public Edge createEdge(@RequestBody Edge edge) {
        return edgeService.createEdge(edge);
    }

    @PutMapping("/{id}")
    public Edge updateEdge(@PathVariable Long id, @RequestBody Edge updatedEdge) {
        return edgeService.updateEdge(id, updatedEdge);
    }

    @DeleteMapping("/{id}")
    public void deleteEdge(@PathVariable Long id) {
        edgeService.deleteEdge(id);
    }
}
