import java.util.function.Function;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WrapAsync {

    public static Function<HttpServletRequest, HttpServletResponse> wrapAsync(AsyncHandler handler) {
        return (req, res) -> {
            try {
                handler.handle(req, res);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }

    @FunctionalInterface
    public interface AsyncHandler {
        void handle(HttpServletRequest req, HttpServletResponse res) throws Exception;
    }
}
