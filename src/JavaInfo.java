import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class JavaInfo {
    public static void AfficheHT(){

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
                              <li class="Lid-item">Nom:</li>
                              <li class="Lid-item">Prenom:</li>
                              <li class="Lid-item">Poste:</li>
                            </ol>
                      <img class="fit-picture"
                           src="">
                </div>
                </body>
                </html>
                """;
        try(var pw = new PrintWriter("info.html")) {
            pw.write(contante);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
