package com.example.saatcms.requirement.services;

import com.example.saatcms.requirement.main.Content;
import com.example.saatcms.requirement.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentService {
    private final ContentRepository contentRepository;

    @Autowired
    public ContentService(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    public List<Content> getContent() {
        return contentRepository.findAll();
    }

    public void addNewContent(Content content) {
        contentRepository.save(content);
    }
}
