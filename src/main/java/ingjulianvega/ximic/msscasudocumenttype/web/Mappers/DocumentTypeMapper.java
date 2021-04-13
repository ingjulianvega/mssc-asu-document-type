package ingjulianvega.ximic.msscasudocumenttype.web.Mappers;


import ingjulianvega.ximic.msscasudocumenttype.domain.DocumentTypeEntity;
import ingjulianvega.ximic.msscasudocumenttype.web.model.DocumentTypeDto;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper(uses = DateMapper.class)
public interface DocumentTypeMapper {
    DocumentTypeDto documentTypeEntityToDocumentTypeDto(DocumentTypeEntity arlEntity);

    DocumentTypeEntity documentTypeDtoToDocumentTypeEntity(DocumentTypeDto arlDto);

    ArrayList<DocumentTypeDto> documentTypeEntityListToDocumentTypeDtoList(List<DocumentTypeEntity> arlEntityList);
}
