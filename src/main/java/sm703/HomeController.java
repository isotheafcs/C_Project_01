package sm703;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {

    @Get("/add/{a}/{b}")
    public Map<String, Object> addNumbers(int a, int b) {
        int sum = a + b;
        Map<String, Object> response = new HashMap<>();
        response.put("a", a);
        response.put("b", b);
        response.put("sum", sum);
        return response;
    }
}
