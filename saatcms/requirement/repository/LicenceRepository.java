package com.example.saatcms.requirement.repository;

import com.example.saatcms.requirement.main.Licence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenceRepository
        extends JpaRepository<Licence, Long> {
}
