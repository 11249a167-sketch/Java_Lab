import java.io.*;

public class FileOperations
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("student.txt");

        // Create file
        file.createNewFile();

        // Write to file
        FileWriter writer = new FileWriter(file);
        writer.write("Welcome to Java File Operations");
        writer.close();

        // Read from file
        FileReader reader = new FileReader(file);
        int ch;

        while ((ch = reader.read()) != -1)
        {
            System.out.print((char) ch);
        }

        reader.close();
    }
}