package Univer.Exceptions;

public class MentorNotFoundException extends Exception {

    String message;

    public MentorNotFoundException(String mentorName) {
        message = "Препод " + mentorName + " не найден";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
