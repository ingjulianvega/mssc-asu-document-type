package ingjulianvega.ximic.msscasudocumenttype.domain.repositories;


import ingjulianvega.ximic.msscasudocumenttype.domain.DocumentTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.UUID;

public interface DocumentTypeRepository extends JpaRepository<DocumentTypeEntity, UUID>, JpaSpecificationExecutor<DocumentTypeEntity> {
    List<DocumentTypeEntity> findAllByOrderByName();
}
