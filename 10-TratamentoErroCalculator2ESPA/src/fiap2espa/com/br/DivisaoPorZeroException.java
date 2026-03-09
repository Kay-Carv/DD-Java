package fiap2espa.com.br;

public class DivisaoPorZeroException extends RuntimeException {
    public DivisaoPorZeroException(String message) {
        super(message);
    }

    public  DivisaoPorZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}

