import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Menu {
    public static void AfficheHT() {

       var contante= """
                <!doctype html>
                <html lang="en">
                <head>
                  <meta charset="utf-8">
                  <title>fiche des references</title>
                </head>
                <body>
                <div class="container">
                      <h1>GO Securi</h1>
                      <ol class="Lagents">Menu
                              <li class="Lmenu-list"><a href="Lmat.html">Liste du materiel</a></li>
                              <li class="Lmenu-list"><a href="info.html">Mes Info</a></li>
                              <li class="Lmenu-list"><a href="agent.html">Liste des agents</a></li>
                            </ol>
                </div>
                </body>
                </html>
                """;
        try(var pw = new PrintWriter("menu.html")) {
            pw.write(contante);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
