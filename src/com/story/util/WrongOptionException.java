package com.story.util;

public class WrongOptionException extends IllegalArgumentException {

    public WrongOptionException() {
        super();
    }

    public WrongOptionException(String s) {
        super(s);
    }

    public WrongOptionException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongOptionException(Throwable cause) {
        super(cause);
    }
}
