package classWork20Recipe;

import classWork20HTTPClient.Search;
import gherkin.deps.com.google.gson.Gson;
import gherkin.deps.com.google.gson.GsonBuilder;
import gherkin.deps.com.google.gson.stream.JsonReader;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MyParser {

    private static final String JSON="src/test/resources/testData/recipe.json";
    private static final String JSON_1="src/test/resources/testData/recipe_1.json";
    private static final String XML="src/test/resources/testData/recipe.xml";

    public void parseGSON() throws FileNotFoundException{
        Gson gson = new Gson();
        Recipe recipe = gson.fromJson(new JsonReader(new FileReader(JSON)),Recipe.class);
        System.out.println(recipe.getRecipename());
        System.out.println(recipe.getIngredlist());
        System.out.println(recipe.getPreptime());
    }

    public static String fromGSON(Search search) throws FileNotFoundException {
        //Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Gson gson = new Gson();
        List<Ingredient> ingridientList = new ArrayList<>();
        ingridientList.add(new Ingredient("tomato", 3));
        ingridientList.add(new Ingredient("carrot", 1));
        ingridientList.add(new Ingredient("oil", 2));
        Recipe recipe = new Recipe("salat", ingridientList, 15);
        //System.out.println(gson.toJson(recipe));
        return gson.toJson(search);
    }

    public void parseDOM() throws ParserConfigurationException, IOException, SAXException{
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        File file = new File(XML);
        System.out.println(file.toString());
        Document doc = builder.parse(file);
        System.out.println(doc.getElementsByTagName("recipename").item(0).getTextContent());
    }


}
