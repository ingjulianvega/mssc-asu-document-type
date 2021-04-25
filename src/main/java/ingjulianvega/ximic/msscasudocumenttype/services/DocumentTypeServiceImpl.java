package ingjulianvega.ximic.msscasudocumenttype.services;


import ingjulianvega.ximic.msscasudocumenttype.configuration.ErrorCodeMessages;
import ingjulianvega.ximic.msscasudocumenttype.domain.DocumentTypeEntity;
import ingjulianvega.ximic.msscasudocumenttype.domain.repositories.DocumentTypeRepository;
import ingjulianvega.ximic.msscasudocumenttype.exception.DocumentTypeException;
import ingjulianvega.ximic.msscasudocumenttype.web.Mappers.DocumentTypeMapper;
import ingjulianvega.ximic.msscasudocumenttype.web.model.DocumentType;
import ingjulianvega.ximic.msscasudocumenttype.web.model.DocumentTypeDto;
import ingjulianvega.ximic.msscasudocumenttype.web.model.DocumentTypeList;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Slf4j
@Service
public class DocumentTypeServiceImpl implements DocumentTypeService {

    private final DocumentTypeRepository documentTypeRepository;
    private final DocumentTypeMapper documentTypeMapper;

    @Cacheable(cacheNames = "documentTypeListCache")
    @Override
    public DocumentTypeList get() {
        log.debug("get()...");
        return DocumentTypeList
                .builder()
                .documentTypeDtoList(documentTypeMapper.documentTypeEntityListToDocumentTypeDtoList(documentTypeRepository.findAllByOrderByName()))
                .build();
    }

    @Cacheable(cacheNames = "documentTypeCache")
    @Override
    public DocumentTypeDto getById(UUID id) {
        log.debug("getById()...");
        return documentTypeMapper.documentTypeEntityToDocumentTypeDto(
                documentTypeRepository.findById(id).orElseThrow(() -> new DocumentTypeException(ErrorCodeMessages.ARL_NOT_FOUND, "")));
    }

    @Override
    public void create(DocumentType documentType) {
        log.debug("create()...");
        documentTypeMapper.documentTypeEntityToDocumentTypeDto(
                documentTypeRepository.save(
                        documentTypeMapper.documentTypeDtoToDocumentTypeEntity(
                                DocumentTypeDto
                                        .builder()
                                        .name(documentType.getName())
                                        .abbreviation(documentType.getAbbreviation())
                                        .build())));
    }

    @Override
    public void updateById(UUID id, DocumentType documentType) {
        log.debug("updateById...");
        DocumentTypeEntity documentTypeEntity = documentTypeRepository.findById(id).orElseThrow(() -> new DocumentTypeException(ErrorCodeMessages.ARL_NOT_FOUND, ""));
        documentTypeEntity.setName(documentType.getName());
        documentTypeEntity.setAbbreviation((documentType.getAbbreviation()));

        documentTypeRepository.save(documentTypeEntity);
    }

    @Override
    public void deleteById(UUID id) {
        log.debug("deleteById...");
        documentTypeRepository.deleteById(id);
    }
}
