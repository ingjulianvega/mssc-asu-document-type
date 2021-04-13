package ingjulianvega.ximic.msscasudocumenttype.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocumentTypeList implements Serializable {

  static final long serialVersionUID = -938544001690545196L;

  public ArrayList<DocumentTypeDto> documentTypeDtoList;

}

