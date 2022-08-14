package de.lundy.radiogarden.exceptions;

public class InternalErrorException extends RuntimeException {

    public InternalErrorException(String message) {
        super(message);
    }

    public InternalErrorException(String message, Object... objects) {
        super(String.format(message, objects));
    }

}
