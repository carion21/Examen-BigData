import java.util.*
import scala.collection.immutable._

object ExamenBigData {

  def main(args: Array[String]): Unit = {

    val lt : List[String] = List("Julien", "Paul", "Jean", "rac", "trec", "joel", "ed", "chris", "maurice")
    val ltt : List[String] = traitementListe(lt)

    val ld = list_double()
    
    ld.foreach(elt => {
      println(elt.head)
      println(elt.last)
    })
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

  def list_double(): Unit = {

    val listurl : List[List[String]]
    var listesortie : List[List[String]]

    listurl = List(
      ("ecommercemag.fr", ""),
      ("https://www.journalducm.com/contact", "payant"),
      ("https://www.zatsaz.com/", ""),
      ("https://www.lerevenu.com/", ""),
      ("https://www.cadre-dirigfeant-magazine.com", "payant"),
      ("https://www.silicon.fr/services/contact#annoncer", "payant"),
      ("https://www.channelbiz.fr/nous-contacter/", ""),
      ("https://www.itespresso.fr", ""),
      ("https://www.industrie-mag.com/article4.html", "invite"),
      ("https://www.jesuisundev.com/article-invite/", "invite"),
      ("https://www.numerama.com/", "")
    )

    val pattern = Pattern.compile(".*'([^']*)'.*")

    listurl.foreach(element => {
      val tab : List[String]
      val matcher = pattern.matcher(element.head)
      if (matcher.matches) {
        tab = Array(matcher.group(1), element.last)
        tab :: listesortie
      }
    })
    
    return listesortie

  }

}
