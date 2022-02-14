import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class JavaLM {

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
