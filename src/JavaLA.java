import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class JavaLA {
    public static void AfficheHT(String lisagent[]){

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
                      """;
                for(int i = 0; i < lisagent.length; i++)
                {
                    contante += """
                            <li class="Lid-item" > Nom:""" + lisagent[i] + """
                            </li>""";

                }
               contante += """
                    </ol >
                </div>
                </body>
                </html>
                """;
        try(var pw = new PrintWriter("agent.html")) {
            pw.write(contante);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
