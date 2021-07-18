package ingjulianvega.ximic.msscasudocumenttype.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import java.io.Serializable;
import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocumentTypeDto implements Serializable {
    static final long serialVersionUID = -6627010131733678493L;

    @Null
    private UUID id;
    @NotBlank
    private String name;
    @NotBlank
    private String abbreviation;

}

