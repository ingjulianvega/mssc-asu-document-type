package ingjulianvega.ximic.msscasudocumenttype.services;



import ingjulianvega.ximic.msscasudocumenttype.web.model.DocumentType;
import ingjulianvega.ximic.msscasudocumenttype.web.model.DocumentTypeDto;
import ingjulianvega.ximic.msscasudocumenttype.web.model.DocumentTypeList;

import java.util.UUID;

public interface DocumentTypeService {
    DocumentTypeList get();

    DocumentTypeDto getById(UUID id);

    void create(DocumentType documentType);

    void updateById(UUID id, DocumentType documentType);

    void deleteById(UUID id);
}
