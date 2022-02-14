public class JavaInfo {
    public static void AfficheHT(){
        String NomAG= "jean";

        System.out.println("""
                <!doctype html>
                <html lang="en">
                <head>
                  <meta charset="utf-8">
                  <title>fiche des references</title>
                </head>
                <body>
                <div class="container">
                      <h1>List_Agents</h1>
                      <ol class="Lagents">Liste ordonnée :
                              <li class="Lagent-item">Nom:"""+ NomAG + """
                              </li>
                            </ol>
                <div>
                </body>
                </html>
                """);

    }
}
