package Lesson12.Exceptions;

public class StudentNotFoundException extends Exception{

    String message = "Такой студент не найден";

    @Override
    public String getMessage() {
        return message;
    }
}