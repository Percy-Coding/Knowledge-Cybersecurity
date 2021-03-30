package com.bitcollege.knowledgecybersecuritywebservice.service;

import com.bitcollege.knowledgecybersecuritywebservice.entity.KnowledgeArea;
import com.bitcollege.knowledgecybersecuritywebservice.entity.KnowledgeObjective;

import java.util.List;

public interface KnowledgeObjectiveService {
    public List<KnowledgeObjective> findAll();
}
