package pl.pjatk.pawmec;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        String errorMessage = e.getMessage();

        String responseBody = "Exception occurred on request. Exception message: " + errorMessage;

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    }
}
