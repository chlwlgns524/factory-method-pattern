package factoryMethod.exception;

public class DefectiveProductException extends RuntimeException {

    public DefectiveProductException() {
    }

    public DefectiveProductException(String message) {
        super(message);
    }

}
