package com.example.Mapping.Reposteries;

import com.example.Mapping.Models.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepo extends JpaRepository<Model, Integer> {
}
