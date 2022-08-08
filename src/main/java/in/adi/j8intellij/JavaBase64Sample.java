package in.adi.j8intellij;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;
public class JavaBase64Sample {
    public static void main(String[] args) {
        try {
            String base64EncodedString =
                    Base64.getEncoder().encodeToString(
                            "Hello World basic".getBytes("utf-8"));
            System.out.println("Encoded string (Basic): "+base64EncodedString);

            byte[] base64DecodedBytes =
                    Base64.getDecoder().decode(base64EncodedString);
            System.out.println("Decoded original string: "
                    +new String(base64DecodedBytes,"utf-8"));

            base64EncodedString = Base64.getUrlEncoder().encodeToString(
                    "Hello world url".getBytes("utf-8"));
            System.out.println("\nEncoded string (URL): "+base64EncodedString);

            base64DecodedBytes =
                    Base64.getUrlDecoder().decode(base64EncodedString);
            System.out.println("Decoded original string: "
                    +new String(base64DecodedBytes,"utf-8"));

            StringBuilder str = new StringBuilder();
            for(int i=0; i<10; i++){
                str.append(UUID.randomUUID().toString());
            }
            byte[] mimeBytes = str.toString().getBytes("utf-8");
            String mineEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
            System.out.println("\nEncoded string (MIME): "+mineEncodedString);

        } catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }
}
