package com.example.saatcms.requirement.controller;

import com.example.saatcms.requirement.main.Licence;
import com.example.saatcms.requirement.services.LicenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/licence")
public class LicenceController {
    private final LicenceService licenceService;

    @Autowired
    public LicenceController(LicenceService licenceService) {
        this.licenceService = licenceService;
    }

    @GetMapping
    public List<Licence> getLicence() {
        return licenceService.getLicence();
    }

    @PostMapping
    public void registerNewLicence(@RequestBody Licence licence) {
        licenceService.addNewLicence(licence);
    }
}
