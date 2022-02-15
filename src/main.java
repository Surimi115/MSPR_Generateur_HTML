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
        File f = new File("C:\\Users\\guill\\IdeaProjects\\MSPR_Generateur_HTML\\fichiers_data\\agent_data\\");
        ArrayList<File> files = new ArrayList<File>(Arrays.asList(f.listFiles()));
        ReadFileClass Read = new ReadFileClass();
        for(File fi : files)
        {
            String agent[];
            String BrutData = "";
            //System.out.println(fi.getName());
            BrutData = Read.readCharByChar("agent_data\\" + fi.getName());
            agent = BrutData.split("\\r?\\n");
            //System.out.println(agent);
            JavaInfo.AfficheHT(agent, fi.getName());
        }
    }

    public static void ListeMateriel()
    {
        ReadFileClass Read = new ReadFileClass();
        String[] Materiel;
        String BrutData = "";
        BrutData = Read.readCharByChar("liste.txt");
        Materiel = BrutData.split("    ");
        JavaLM.AfficheHT(Materiel);
    }


    public static void ListeAgents()
    {
        ReadFileClass Read = new ReadFileClass();
        String Agents[];
        String BrutData = "";
        BrutData = Read.readCharByChar("staff.txt");
        Agents = BrutData.split("\\r?\\n");
        JavaLA.AfficheHT(Agents);
    }
}
