import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileClass
{
    public static List<String> read(String fileName)
    {
        String file = "C:\\Users\\guill\\IdeaProjects\\MSPR_Generateur_HTML\\fichiers_data" + fileName;
        List<String> data = new ArrayList<String>();
        try(
                BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
                data.add(line);
            }
        }
        catch(
                IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return data;
    }

    public static List<String> readMateriel(String fileName)
    {
        String file = "C:\\Users\\guill\\IdeaProjects\\MSPR_Generateur_HTML\\fichiers_data" + fileName;
        List<String> data = new ArrayList<String>();
        try(
                BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
                data.add(line);
            }
        }
        catch(
                IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return data;
    }
}
