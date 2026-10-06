import java.io.*;

public class FileIOStream
{
    public static void main(String[] args) throws IOException
    {
        String data = "Java IO Streams Example";

        FileOutputStream fout = new FileOutputStream("data.txt");
        fout.write(data.getBytes());
        fout.close();

        FileInputStream fin = new FileInputStream("data.txt");
        int ch;

        while ((ch = fin.read()) != -1)
        {
            System.out.print((char) ch);
        }

        fin.close();
    }
}
