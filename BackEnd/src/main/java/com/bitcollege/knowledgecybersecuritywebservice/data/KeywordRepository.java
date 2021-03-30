package com.bitcollege.knowledgecybersecuritywebservice.data;

import com.bitcollege.knowledgecybersecuritywebservice.entity.Certificate;
import com.bitcollege.knowledgecybersecuritywebservice.entity.Keyword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface KeywordRepository extends JpaRepository<Certificate, Long> {


    @Query(value = "select * from certificate c\n" +
            "join ku_certificate ku_c on ku_c.fk_certificate = c.id\n" +
            "where ku_c.fk_knowledge_unit = ?1", nativeQuery = true)
    public List<Keyword> findTop4ByKnowledgeUnitIdAndSectorId(Long knowledgeUnitId, Long sectorId);
}
