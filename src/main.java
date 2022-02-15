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
        File f = new File("D:\\cours\\EPSI\\3eme_annee\\MSPR\\MSPR_Generateur_HTML\\fichiers_data");
        String pathNames[] = f.list();
        System.out.println(pathNames);
        System.out.println(f);
        ReadFileClass Read = new ReadFileClass();
        for(int i =0; i < pathNames.length; i++)
        {
            String agent[];
            agent = Read.readCharByChar("\\agent_data" + pathNames[i]);
            JavaInfo.AfficheHT(agent, pathNames[i]);
        }
    }

    public static void ListeMateriel()
    {
        ReadFileClass Read = new ReadFileClass();
        String[] Materiel;
        Materiel = Read.readCharByChar("liste.txt");
        JavaLM.AfficheHT(Materiel);
    }


    public static void ListeAgents()
    {
        ReadFileClass Read = new ReadFileClass();
        String Agents[];
        Agents = Read.readCharByChar("staff.txt");
        JavaLA.AfficheHT(Agents);
    }
}
