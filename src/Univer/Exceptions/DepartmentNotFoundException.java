package Univer.Exceptions;

public class DepartmentNotFoundException extends Exception{

    String message = "Факультет не найден";

    @Override
    public String getMessage() {
        return message;
    }
}
