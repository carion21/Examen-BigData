
object ExamenBigData {

  def main(args: Array[String]): Unit = {
    println("bonjour")
    val maliste=List("Java","XYZ","amen","lausann")
    println(liste_Function(maliste))
  }

  def traitementListe(liste : List[String]): List[String] = {
    val nliste : List[String]
    liste.foreach(valeur => {
      if (valeur.matches("n$")){
        nliste.addString(valeur)
      }
    })
    return nliste
  }

}
