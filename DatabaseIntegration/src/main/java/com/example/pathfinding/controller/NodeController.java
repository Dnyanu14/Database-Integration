// NodeController.java
package com.example.pathfinding.controller;

import com.example.pathfinding.model.Node;
import com.example.pathfinding.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nodes")
public class NodeController {

    private final NodeService nodeService;

    @Autowired
    public NodeController(NodeService nodeService) {
        this.nodeService = nodeService;
    }

    @GetMapping
    public List<Node> getAllNodes() {
        return nodeService.getAllNodes();
    }

    @GetMapping("/{id}")
    public Node getNodeById(@PathVariable Long id) {
        return nodeService.getNodeById(id);
    }

    @PostMapping
    public Node createNode(@RequestBody Node node) {
        return nodeService.createNode(node);
    }

    @PutMapping("/{id}")
    public Node updateNode(@PathVariable Long id, @RequestBody Node updatedNode) {
        return nodeService.updateNode(id, updatedNode);
    }

    @DeleteMapping("/{id}")
    public void deleteNode(@PathVariable Long id) {
        nodeService.deleteNode(id);
    }
}
