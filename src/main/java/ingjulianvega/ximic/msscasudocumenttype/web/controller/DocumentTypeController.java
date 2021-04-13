package ingjulianvega.ximic.msscasudocumenttype.web.controller;


import ingjulianvega.ximic.msscasudocumenttype.services.DocumentTypeService;
import ingjulianvega.ximic.msscasudocumenttype.web.model.DocumentType;
import ingjulianvega.ximic.msscasudocumenttype.web.model.DocumentTypeDto;
import ingjulianvega.ximic.msscasudocumenttype.web.model.DocumentTypeList;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class DocumentTypeController implements DocumentTypeI {
    private final DocumentTypeService documentTypeService;

    @Override
    public ResponseEntity<DocumentTypeList> get() {
        return new ResponseEntity<>(documentTypeService.get(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<DocumentTypeDto> getById(@NotNull UUID id) {
        return new ResponseEntity<>(documentTypeService.getById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> create(@NotNull @Valid DocumentType documentType) {
        documentTypeService.create(documentType);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> updateById(@NotNull UUID id, @NotNull @Valid DocumentType documentType) {
        documentTypeService.updateById(id, documentType);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<Void> deleteById(@NotNull UUID id) {
        documentTypeService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}