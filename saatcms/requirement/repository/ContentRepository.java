package com.example.saatcms.requirement.repository;

import com.example.saatcms.requirement.main.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository
        extends JpaRepository<Content, Long>{
}
