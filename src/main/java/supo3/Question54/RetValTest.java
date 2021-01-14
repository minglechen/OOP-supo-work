package supo3.Question54;

import java.util.NoSuchElementException;

public class RetValTest {
    public static String extractCamEmail(String sentence) {
        if (sentence==null || sentence.length()==0)
            throw new IllegalArgumentException();
        String tokens[] = sentence.split(" "); // split into tokens
        for (int i=0; i< tokens.length; i++) {
            if (tokens[i].endsWith("@cam.ac.uk")) {
                return tokens[i];
            }
        }
        throw new NoSuchElementException();
    }
    public static void main(String[] args) {
        try{
            String ret=RetValTest.extractCamEmail("My email is rkh23@cam.ac.uk");
            System.out.println("Success: "+ret);
        } catch (IllegalArgumentException e){
            System.out.println("Supplied string empty");

        } catch (NoSuchElementException e){
            System.out.println("No @cam address in supplied string");
        }

    }
}