public class JavaLA {
    public static void AfficheHT(){
        String NomID= "jean";
        String PremonID="patrick";
        String Poste="Surveillance entrepôt";
        String MatUT="lampe";

        System.out.println("""
                <!doctype html>
                <html lang="en">
                <head>
                  <meta charset="utf-8">
                  <title>fiche des references</title>
                </head>
                <body>
                <div class="container">
                      <h1>ID_agent</h1>
                      <ol class="Lid">Liste ordonnée :
                              <li class="Lid-item">Nom"""+ NomID + """
                              </li>
                              <li class="Lid-item">Prenom"""+ PremonID + """
                              </li>
                              <li class="Lid-item">Poste"""+ Poste + """
                              </li>
                            </ol>
                      <h2>Materiel</h2>
                      <ol class="Lmateriel">Liste ordonnée :
                              <li class="Lid-item">Nom"""+ MatUT + """
                              </li>
                            </ol>
                <div>
                </body>
                </html>
                """);

    }
}
