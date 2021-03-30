package com.bitcollege.knowledgecybersecuritywebservice.service;

import com.bitcollege.knowledgecybersecuritywebservice.entity.Certificate;
import com.bitcollege.knowledgecybersecuritywebservice.entity.KnowledgeArea;

import java.util.List;

public interface CertificateService {
    public List<Certificate> findByKnowledgeUnitId(Long knowledgeUnitId);
}
