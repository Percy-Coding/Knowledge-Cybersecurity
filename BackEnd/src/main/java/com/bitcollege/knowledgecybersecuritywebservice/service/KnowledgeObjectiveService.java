package com.bitcollege.knowledgecybersecuritywebservice.service;

import com.bitcollege.knowledgecybersecuritywebservice.entity.KnowledgeArea;
import com.bitcollege.knowledgecybersecuritywebservice.entity.KnowledgeObjective;

import java.util.List;
import java.util.Map;

public interface KnowledgeObjectiveService {
    public List<Map<String, Object >> findByKnowledgeUnitIdAndSectorId(Long knowledgeUnitId, Long sectorId);
}
