package classWork20Recipe;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class RecipeRunner {

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

        MyParser parser = new MyParser();
        parser.parseGSON();
        //parser.fromGSON();
        parser.parseDOM();
    }
}
