package animal.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // 400
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<String> handleBadRequest(BadRequestException e) {
        return ResponseEntity
                .badRequest()
                .body(e.getMessage());
    }

    // 404
    @ExceptionHandler(AnimalNotFoundException.class)
    public ResponseEntity<String> handleNotFound(AnimalNotFoundException e) {
        return ResponseEntity
                .status(404)
                .body(e.getMessage());
    }
}