package com.bitcollege.knowledgecybersecuritywebservice.service.implementation;

import com.bitcollege.knowledgecybersecuritywebservice.data.KnowledgeAreaRepository;
import com.bitcollege.knowledgecybersecuritywebservice.data.KnowledgeObjectiveRepository;
import com.bitcollege.knowledgecybersecuritywebservice.entity.KnowledgeArea;
import com.bitcollege.knowledgecybersecuritywebservice.entity.KnowledgeObjective;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KnowledgeObjectiveService implements com.bitcollege.knowledgecybersecuritywebservice.service.KnowledgeObjectiveService {

    @Autowired
    private KnowledgeObjectiveRepository knowledgeObjectiveRepository;

    @Override
    public List<KnowledgeObjective> findAll() {
        return knowledgeObjectiveRepository.findAll();
    }
}
