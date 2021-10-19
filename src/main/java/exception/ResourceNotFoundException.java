package exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//catch the error (exception)
public class ResourceNotFoundException extends RuntimeException {
    @ResponseStatus (value = HttpStatus.NOT_FOUND)
//    what is this?
//    starting the user ID from 1 and it's unique
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException() {

    }
}
