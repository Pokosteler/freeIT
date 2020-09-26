package lesson13;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;

public class XMLValidator {
    public static void main(String[] args) {
        boolean answer = validateXMLSchema
                ("src\\lesson13\\devices.xsd", "src\\lesson13\\devices.xml");
        System.out.println("Result: " + answer);
    }

    private static boolean validateXMLSchema(String xsdPath, String xmlPath) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return false;
        }
        return true;
    }
}
