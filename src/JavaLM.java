import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class JavaLM {

    public static void AfficheHT(String lismato[]){
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
                      """;
               for(int i = 0; i < lismato.length; i++)
               {
                   contante += """
                           <li class="Lid-item" > Nom:""" + lismato[i] + """
                           </li>""";

               }
              contante += """
                </div>
                </body>
                </html>
                """;
        try(var pw = new PrintWriter("D:\\cours\\EPSI\\3eme_annee\\MSPR\\MSPR_Generateur_HTML\\Lmat.html")) {
            pw.write(contante);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
