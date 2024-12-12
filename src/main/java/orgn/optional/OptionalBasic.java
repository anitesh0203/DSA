package orgn.optional;

import java.util.Optional;

public class OptionalBasic {
    public static void main(String[] args) {
        String str = null;
        Optional<String> optional = Optional.ofNullable(str);
        System.out.println(optional.isPresent()?optional.get():"nothing is here");

    }
}
