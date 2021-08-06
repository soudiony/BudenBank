package Unicode;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicode {
    public static void main(String[] args) {
        String letra = "Casa";
        System.out.println(letra.codePointAt(1));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());
    }
}
