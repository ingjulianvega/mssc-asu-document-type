package ingjulianvega.ximic.msscasudocumenttype.bootstrap;


import ingjulianvega.ximic.msscasudocumenttype.domain.DocumentTypeEntity;
import ingjulianvega.ximic.msscasudocumenttype.domain.repositories.DocumentTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@RequiredArgsConstructor
@Component
public class DocumentTypeLoader implements CommandLineRunner {

    private final DocumentTypeRepository documentTypeRepository;

    @Override
    public void run(String... args) throws Exception {
        if (documentTypeRepository.count() == 0) {
            loadDocumentTypeObjects();
        }
    }

    private void loadDocumentTypeObjects() {
        documentTypeRepository.saveAll(Arrays.asList(
                DocumentTypeEntity.builder().name("NUMERO DE IDENTIFICACIÓN PERSONAL").abbreviation("NIP").build(),
                DocumentTypeEntity.builder().name("TARJETA DE IDENTIDAD").abbreviation("TI").build(),
                DocumentTypeEntity.builder().name("PASAPORTE").abbreviation("PAP").build(),
                DocumentTypeEntity.builder().name("CÉDULA DE CIUDADANIA").abbreviation("CC").build(),
                DocumentTypeEntity.builder().name("CÉDULA DE EXTRANJERIA").abbreviation("CE").build(),
                DocumentTypeEntity.builder().name("REGISTRO CIVIL DE NACIMIENTO").abbreviation("RC").build()
        ));
    }
}
