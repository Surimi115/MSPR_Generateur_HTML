import java.util.List;
import java.util.ArrayList;

public class main
{
    public static void main(String[] args)
    {

    }

    public static void login()
    {
        //page de login
        //verif de connectio
    }

    public static int accueil()
    {
        int choixUtil = 0;
        //page accueil
        return choixUtil;
    }

    public static void ListeMateriel()
    {
        ReadFileClass Read = new ReadFileClass();
        List<String> Materiel = new ArrayList<String>();
        Materiel = Read.read("ListeMeteriel.txt");
        //affichage page liste matériel
    }

    public static void FicheAgent()
    {
        ReadFileClass Read = new ReadFileClass();
        List<String> InfosAgent = new ArrayList<String>();
        InfosAgent = Read.read( "FicheAgent.txt");
        //affichage fiche agent + piece d'identité
    }

    public static void ListeAgents()
    {
        ReadFileClass Read = new ReadFileClass();
        List<String> Agents = new ArrayList<String>();
        Agents = Read.read("FicheAgent.txt");
        //affichage liste des agents
    }
}
