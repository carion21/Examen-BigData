import scala.util.matching.Regex

object ExamenBigData {
  def main(args: Array[String]): Unit = {

    val lt : List[String] = List("Julien", "Paul", "Jean", "rac", "trec", "joel", "ed", "chris", "maurice")
    val ltt : List[String] = traitementListe(lt)

    val ld : Unit = list_double()
  }

  def traitementListe(liste : List[String]): List[String] = {
    return liste.filter(l => l.endsWith("n"))
  }

  def list_double(): Unit = {

    val listurl : List[List[String]] = List(
      List("ecommercemag.fr", ""),
      List("https://www.journalducm.com/contact", "payant"),
      List("https://www.zatsaz.com/", ""),
      List("https://www.lerevenu.com/", ""),
      List("https://www.cadre-dirigfeant-magazine.com", "payant"),
      List("https://www.silicon.fr/services/contact#annoncer", "payant"),
      List("https://www.channelbiz.fr/nous-contacter/", ""),
      List("https://www.itespresso.fr", ""),
      List("https://www.industrie-mag.com/article4.html", "invite"),
      List("https://www.jesuisundev.com/article-invite/", "invite"),
      List("https://www.numerama.com/", "")
    )

    var listsortie : List[List[String]] = List()

    val pattern = """(?:([http|https]://)?)(?:(www\.)?)([A-Za-z0-9._%+-]+)[/]?(?:.*)""".r

    listurl.foreach(element => {
      element.head match {
        case pattern(domaine) => {
          val tab : List[String] = List(domaine, element.last)
          tab :: listsortie
        }
        case _ => print("not found!")
      }
    })

    return listsortie


  }
}
