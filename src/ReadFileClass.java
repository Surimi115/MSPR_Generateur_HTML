import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileClass
{
    public static String[] readCharByChar(String fileName)
    {
        String file = "D:\\cours\\EPSI\\3eme_annee\\MSPR\\MSPR_Generateur_HTML\\fichiers_data\\" + fileName;
        String[] data;
        String ligne = "";
        try(
                BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            int c;
            while ((c = br.read()) != -1)
            {
                ligne += (char)c;
            }
        }
        catch(
                IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        data = ligne.split("    ");
        return data;
    }
}
