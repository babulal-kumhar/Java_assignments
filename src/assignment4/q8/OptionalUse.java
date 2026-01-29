package assignment4.q8;

import java.util.Optional;

public class OptionalUse {
    public static void main(String[] args) {
        String name="Babulal Kumhar";
        Optional<String> opt=Optional.ofNullable(name);
        System.out.println(opt.orElse("No Value"));
    }
}
