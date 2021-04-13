package ingjulianvega.ximic.msscasudocumenttype.exception;

import lombok.Getter;

@Getter
public class DocumentTypeException extends RuntimeException {

    private final String code;

    public DocumentTypeException(final String code, final String message) {
        super(message);
        this.code = code;
    }
}

