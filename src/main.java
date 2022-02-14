import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.io.File;

public class main
{
    public static void main(String[] args)
    {
        Menu.AfficheHT();
        GenerateAgents();
        ListeMateriel();
        ListeAgents();
    }

    public static void GenerateAgents()
    {
        File f = new File("C:\\Users\\guill\\IdeaProjects\\MSPR_Generateur_HTML\\fichiers_data");
        ArrayList<File> files = new ArrayList<File>(Arrays.asList(f.listFiles()));
        ReadFileClass Read = new ReadFileClass();
        for(File fi : files)
        {
            String agent[];
            agent = Read.readCharByChar(fi.getName());
            JavaInfo.AfficheHT();
        }
    }

    public static void ListeMateriel()
    {
        ReadFileClass Read = new ReadFileClass();
        String[] Materiel;
        Materiel = Read.readCharByChar("liste.txt");
        JavaLM.AfficheHT();
    }


    public static void ListeAgents()
    {
        ReadFileClass Read = new ReadFileClass();
        String Agents[];
        Agents = Read.readCharByChar("staff.txt");
        JavaLA.AfficheHT();
    }
}
