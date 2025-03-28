package math;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("/factors/{n}")
    public Map<String, Object> getFactors(@PathVariable int n) {
        List<Integer> factors = calculateFactors(n);
        return Map.of(
            "operation", "factors",
            "input", n,
            "output", factors.stream().map(String::valueOf).collect(Collectors.joining(", "))
        );
    }

    @GetMapping("/primes/{n}")
    public Map<String, Object> getPrimes(@PathVariable int n) {
        List<Integer> primes = calculatePrimes(n);
        return Map.of(
            "operation", "primes",
            "input", n,
            "output", primes.stream().map(String::valueOf).collect(Collectors.joining(", "))
        );
    }

    private List<Integer> calculateFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }

    private List<Integer> calculatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (calculateFactors(i).size() == 2) {
                primes.add(i);
            }
        }
        return primes;
    }
}
