// NodeService.java
package com.example.pathfinding.service;

import com.example.pathfinding.model.Node;
import com.example.pathfinding.repository.NodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NodeService {

    private final NodeRepository nodeRepository;

    @Autowired
    public NodeService(NodeRepository nodeRepository) {
        this.nodeRepository = nodeRepository;
    }

    public List<Node> getAllNodes() {
        return nodeRepository.findAll();
    }

    public Node getNodeById(Long id) {
        return nodeRepository.findById(id).orElse(null);
    }

    public Node createNode(Node node) {
        return nodeRepository.save(node);
    }

    public Node updateNode(Long id, Node updatedNode) {
        Node existingNode = nodeRepository.findById(id).orElse(null);
        if (existingNode != null) {
            existingNode.setName(updatedNode.getName());
            return nodeRepository.save(existingNode);
        }
        return null;
    }

    public void deleteNode(Long id) {
        nodeRepository.deleteById(id);
    }
}
