// NodeRepository.java
package com.example.pathfinding.repository;

import com.example.pathfinding.model.Node;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NodeRepository extends JpaRepository<Node, Long> {
}
