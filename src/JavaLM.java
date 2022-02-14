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

        System.out.println("""
                <!doctype html>
                <html lang="en">
                <head>
                  <meta charset="utf-8">
                  <title>fiche des references</title>
                </head>
                <body>
                <div class="container">
                      <h1>List_Materiel</h1>
                      <ol class="Lmat">Liste ordonnée :
                              <li class="Lmat-item">mousqueton:"""+ Mat1 + """
                              </li>
                              <li class="Lmat-item">gants:"""+ Mat2 + """
                              </li>
                              <li class="Lmat-item">brassard:"""+ Mat3 + """
                              </li>
                              <li class="Lmat-item">menottes:"""+ Mat4 + """
                              </li>
                              <li class="Lmat-item">cyno:"""+ Mat5 + """
                               </li>
                              <li class="Lmat-item">talky:"""+ Mat6 + """
                              </li>
                              <li class="Lmat-item">lampe:"""+ Mat7 + """
                              </li>
                              <li class="Lmat-item">kit:"""+ Mat8 + """
                              </li>
                              <li class="Lmat-item">taser:"""+ Mat9 + """
                              </li>
                              <li class="Lmat-item">lacrymo:"""+ Mat10 + """
                              </li>
                            </ol> 
                <div>
                </body>
                </html>
                """);

    }
}
