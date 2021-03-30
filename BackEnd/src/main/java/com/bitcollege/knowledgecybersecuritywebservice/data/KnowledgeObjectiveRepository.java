package com.bitcollege.knowledgecybersecuritywebservice.data;

import com.bitcollege.knowledgecybersecuritywebservice.entity.KnowledgeArea;
import com.bitcollege.knowledgecybersecuritywebservice.entity.KnowledgeObjective;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KnowledgeObjectiveRepository extends JpaRepository<KnowledgeObjective, Long> {

}
