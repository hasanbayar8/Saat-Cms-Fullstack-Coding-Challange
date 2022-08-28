package com.example.saatcms.requirement.services;

import com.example.saatcms.requirement.main.Licence;
import com.example.saatcms.requirement.repository.LicenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicenceService {
    private final LicenceRepository licenceRepository;

    @Autowired
    public LicenceService(LicenceRepository licenceRepository) {
        this.licenceRepository = licenceRepository;
    }

    public List<Licence> getLicence() {
        return licenceRepository.findAll();
    }

    public void addNewLicence(Licence licence) {
        licenceRepository.save(licence);
    }
}
