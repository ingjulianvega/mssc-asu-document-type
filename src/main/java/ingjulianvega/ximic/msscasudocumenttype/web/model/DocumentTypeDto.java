package ingjulianvega.ximic.msscasudocumenttype.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import java.io.Serializable;
import java.util.UUID;

import static ingjulianvega.ximic.msscasudocumenttype.configuration.ErrorCodeMessages.VALIDATION_ABBREVIATION_NULL;
import static ingjulianvega.ximic.msscasudocumenttype.configuration.ErrorCodeMessages.VALIDATION_NAME_NULL;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocumentTypeDto implements Serializable {
    static final long serialVersionUID = -6627010131733678493L;

    @Null
    private UUID id;
    @NotBlank(message = VALIDATION_NAME_NULL)
    private String name;
    @NotBlank(message = VALIDATION_ABBREVIATION_NULL)
    private String abbreviation;

}

