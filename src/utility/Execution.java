package utility;

import java.util.Properties;

public class Execution {
    public static void main(String[] args) {
        String value = null;
        String value2 = null;
        DataReader dataReader = new DataReader();
        value = dataReader.readMyTextFile("src\\test.txt");
        value2 = dataReader.readMyTextFile("src\\utility\\Information.txt");
        System.out.println("value is : " + value);
        System.out.println("value 2 is : " + value2);

        System.out.println("*************** new Properties Reader ******************");
        Properties properties1 = dataReader.getProperties("src\\new.properties");
        System.out.println(properties1.getProperty("name"));
        System.out.println(properties1.getProperty("id"));

        System.out.println("*************** PeopleNtech Properties Reader ******************");
        Properties properties2 = dataReader.getProperties("src\\utility\\PeopleNtech.properties");
        System.out.println(properties2.getProperty("year"));
        System.out.println(properties2.getProperty("date"));
        System.out.println(properties2.getProperty("subject"));


    }

}
