package ingjulianvega.ximic.msscasudocumenttype.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocumentType {

  private String name;
  private String abbreviation;

}

