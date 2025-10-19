package app.neostream.backend.http.response;

import lombok.Data;

@Data
public class ErrorResponse {
    private final String message;
}
