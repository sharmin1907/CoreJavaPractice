package utility;

import java.io.*;
import java.util.Properties;

public class DataReader {
    // homework1 -- Create a parameterized writeMethod
    // so user should be able to write whatever they want to
    // wherever they want to
    /*public static void main(String[] args) {
        // for your understanding :
        // FileWriter fileWriter = new FileWriter("src\\test.txt");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\test.txt", false));
            bufferedWriter.write("test writing using buffered writer");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/


    public String readMyTextFile(String filePath) {
        String container;
        String finalText = null;
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((container = bufferedReader.readLine()) != null) {
                finalText = container;
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return finalText;
    }

    public  Properties getProperties(String filePath){
        Properties properties = new Properties();
        try {
            InputStream inputStream = new FileInputStream(filePath);
            properties.load(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;

    }

    public static void main(String[] args) {


    }
}


