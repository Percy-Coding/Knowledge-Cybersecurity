package com.bitcollege.knowledgecybersecuritywebservice.controller;

import com.bitcollege.knowledgecybersecuritywebservice.entity.Certificate;
import com.bitcollege.knowledgecybersecuritywebservice.entity.KnowledgeObjective;
import com.bitcollege.knowledgecybersecuritywebservice.service.CertificateService;
import com.bitcollege.knowledgecybersecuritywebservice.service.KnowledgeObjectiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KnowledgeObjectiveController {
    @Autowired
    private KnowledgeObjectiveService knowledgeObjectiveService;

    @GetMapping("/knowledge-objectives")
    public List<KnowledgeObjective> findByKnowledgeUnit(){
        return knowledgeObjectiveService.findAll();
    }
}
