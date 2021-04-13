package ingjulianvega.ximic.msscasudocumenttype.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class DocumentTypeEntity extends BaseEntity {

    private String name;
    private String abbreviation;

}
