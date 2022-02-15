import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class JavaInfo {
    public static void AfficheHT(String infoangent[],String imgagent){
        String nomFichier = imgagent.replace(".txt", ".JPG");
        String CheminImg = "C:\\Users\\guill\\IdeaProjects\\MSPR_Generateur_HTML\\fichiers_data\\";
        var contante="""
                <!doctype html>
                <html lang="en">
                <head>
                  <meta charset="utf-8">
                  <title>fiche des references</title>
                </head>
                <body>
                <div class="container">
                      <h1>ID_agent</h1>
                      <ol class="Lid">
                              <li class="Lid-item">Nom:"""+infoangent[0]+ """
                              </li>
                              <li class="Lid-item">Prenom:"""+infoangent[1]+ """
                              </li>
                              <li class="Lid-item">Poste:"""+infoangent[2]+ """
                            </li>
                            </ol>
                      <img class="fit-picture"
                           src="\" """+ CheminImg + nomFichier + """ 
                       ">
                </div>
                </body>
                </html>
                """;
        try(var pw = new PrintWriter("HTML_files\\info.html")) {
            pw.write(contante);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
