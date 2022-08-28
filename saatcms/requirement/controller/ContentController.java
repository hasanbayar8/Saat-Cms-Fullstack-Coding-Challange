package com.example.saatcms.requirement.controller;

import com.example.saatcms.requirement.main.Content;
import com.example.saatcms.requirement.services.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/content")
public class ContentController {
    private final ContentService contentService;

    @Autowired
    public ContentController(ContentService contentService) {
        this.contentService = contentService;
    }

    @GetMapping
    public List<Content> getContent() {
        return contentService.getContent();
    }

    @PostMapping
    public void registerNewContent(@RequestBody Content content) {
        contentService.addNewContent(content);
    }
}
