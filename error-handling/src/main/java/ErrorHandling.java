import java.io.IOException;
import java.util.Optional;

class ErrorHandling {

    void handleErrorByThrowingIllegalArgumentException() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        throw new IllegalArgumentException();
    }

    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        throw new IllegalArgumentException(message);
    }

    void handleErrorByThrowingAnyCheckedException() throws IOException {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        throw new IOException();
    }

    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message) throws IOException {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        throw new IOException(message);
    }

    void handleErrorByThrowingAnyUncheckedException() {
        // Delete this statement and write your own implementation.
        throw new ArithmeticException();
    }

    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message) {
        // Delete this statement and write your own implementation.
        throw new ArithmeticException(message);
    }

    void handleErrorByThrowingCustomCheckedException() throws CustomCheckedException {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        throw new CustomCheckedException();
    }

    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message)throws CustomCheckedException {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        throw new CustomCheckedException(message);
    }

    void handleErrorByThrowingCustomUncheckedException() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        throw new CustomUncheckedException();
    }

    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        throw new CustomUncheckedException(message);
    }

    Optional<Integer> handleErrorByReturningOptionalInstance(String integer) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        try {
            Integer res = Integer.parseInt(integer);
            return Optional.ofNullable(res);
        } catch (Exception e) {
            return Optional.empty();
        }
    }

}
