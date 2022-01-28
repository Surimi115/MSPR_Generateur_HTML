import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class JavaLM {

    public static void AfficheHT(){
        String Mat1= "Mousqueton";
        String Mat2= "Gants d’intervention";
        String Mat3= "Brassard de sécurité";
        String Mat4= "Porte menottes";
        String Mat5= "Bandeau agent cynophile";
        String Mat6= "Talkies walkies";
        String Mat7= "Lampe Torche";
        String Mat8= "Kit oreillette";
        String Mat9= "Tasers";
        String Mat10="Bombes lacrymogènes";

        var contante="""
                <!doctype html>
                <html lang="en">
                <head>
                  <meta charset="utf-8">
                  <title>fiche des references</title>
                </head>
                <body>
                <div class="container">
                      <h1>List_Materiel</h1>
                      <ol class="Lmat">
                      </ol>
                </div>
                </body>
                </html>
                """;
        try(var pw = new PrintWriter("Lmat.html")) {
            pw.write(contante);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
