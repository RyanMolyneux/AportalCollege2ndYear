
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminMedia_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class adminMedia extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[models.Media],List[models.Genre],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(media: List[models.Media], genre: List[models.Genre], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.81*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/admin/*4.7*/.adminMain("Media", user)/*4.32*/ {_display_(Seq[Any](format.raw/*4.34*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-2">
          <h4>Categories</h4>
            <div class="list-group">
                <!-- A link to display all products -->
                <a href=""""),_display_(/*11.27*/routes/*11.33*/.AdminController.adminMedia(0)),format.raw/*11.63*/("""" class="list-group-item">All genre</a>

                <!-- Start of For loop - For each c in categories add a list item -->
                <!-- Also show the number of products in each category -->
                """),_display_(/*15.18*/for(g <- genre) yield /*15.33*/ {_display_(Seq[Any](format.raw/*15.35*/("""
                    """),format.raw/*16.21*/("""<a href=""""),_display_(/*16.31*/routes/*16.37*/.AdminController.adminMedia(g.getGenre_ID)),format.raw/*16.79*/("""" class="list-group-item">"""),_display_(/*16.106*/g/*16.107*/.getGenre),format.raw/*16.116*/("""
                      """),format.raw/*17.23*/("""<span class="badge">"""),_display_(/*17.44*/g/*17.45*/.getMedia.size()),format.raw/*17.61*/("""</span>
                    </a>
                """)))}),format.raw/*19.18*/("""
            """),format.raw/*20.13*/("""</div>
      </div>
      <div class="col-sm-10">

          """),_display_(/*24.12*/if(flash.containsKey("success"))/*24.44*/ {_display_(Seq[Any](format.raw/*24.46*/("""
              """),format.raw/*25.15*/("""<div class="alert alert-success">
              """),_display_(/*26.16*/flash/*26.21*/.get("success")),format.raw/*26.36*/("""
              """),format.raw/*27.15*/("""</div>
          """)))}),format.raw/*28.12*/("""
          """),format.raw/*29.11*/("""<table class="table table-bordered table-hover table-condensed">
          <thead>
          <!-- The header row-->
          <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Genre</th>
            <th>Description</th>
            <th>Rating</th>
          </tr>
          </thead>
          <tbody>
            <!-- Product row(s) -->
					<!-- Start of For loop - For each p in products add a row -->
          """),_display_(/*43.12*/for(m <- media) yield /*43.27*/ {_display_(Seq[Any](format.raw/*43.29*/("""
			        """),format.raw/*44.12*/("""<tr>
                  <td>"""),_display_(/*45.24*/m/*45.25*/.getMedia_ID),format.raw/*45.37*/("""</td>
                  <td>"""),_display_(/*46.24*/m/*46.25*/.getTitle),format.raw/*46.34*/("""</td>
                        <td>
                        """),_display_(/*48.26*/for(g <- m.getGenre) yield /*48.46*/ {_display_(Seq[Any](format.raw/*48.48*/("""
                            """),_display_(/*49.30*/g/*49.31*/.getGenre),format.raw/*49.40*/(""",
                        """)))}),format.raw/*50.26*/("""
                        """),format.raw/*51.25*/("""</td>
                  <td>"""),_display_(/*52.24*/m/*52.25*/.getMediaDescription),format.raw/*52.45*/("""</td>
                  <td>"""),_display_(/*53.24*/m/*53.25*/.getMediaRating),format.raw/*53.40*/("""</td>
                  <td>"""),_display_(/*54.24*/m/*54.25*/.getAnimeURL),format.raw/*54.37*/("""</td>
                  <td>"""),_display_(/*55.24*/m/*55.25*/.getMangaURL),format.raw/*55.37*/("""</td>

                  <!-- Edit product button -->
                  <td>
                      <a href=""""),_display_(/*59.33*/routes/*59.39*/.AdminController.updateMedia(m.getMedia_ID)),format.raw/*59.82*/("""" class="btn-xs btn-danger">
                      <span class="glyphicon glyphicon-pencil"></span></a>
                  </td>
                  <!-- Delete product button -->
                  <td>
                      <a href=""""),_display_(/*64.33*/routes/*64.39*/.AdminController.deleteMedia(m.getMedia_ID)),format.raw/*64.82*/("""" class="btn-xs btn-danger"
                        onclick="return confirmDel();">
                        <span class="glyphicon glyphicon-trash"></span>
                      </a>
                  </td>
				    </tr>
					""")))}),format.raw/*70.7*/(""" """),format.raw/*70.8*/("""<!-- End of For loop -->
          </tbody>
        </table>
        <p>
          <a href=""""),_display_(/*74.21*/routes/*74.27*/.AdminController.addMedia()),format.raw/*74.54*/("""">
            <button class="btn btn-primary">Add a Series</button>
          </a>
        </p>
      </div>
  </div>

  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*83.27*/("""{"""),format.raw/*83.28*/("""
        """),format.raw/*84.9*/("""return confirm('Are you sure?');
    """),format.raw/*85.5*/("""}"""),format.raw/*85.6*/("""
  """),format.raw/*86.3*/("""</script>

  <!-- End of content for main -->
""")))}),format.raw/*89.2*/("""
"""))
      }
    }
  }

  def render(media:List[models.Media],genre:List[models.Genre],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(media,genre,user)

  def f:((List[models.Media],List[models.Genre],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (media,genre,user) => apply(media,genre,user)

  def ref: this.type = this

}


}

/**/
object adminMedia extends adminMedia_Scope0.adminMedia
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/admin/adminMedia.scala.html
                  HASH: 0436fb2e905280a04bbd1fcd699b07dc40b04e96
                  MATRIX: 810->1|984->80|1012->82|1072->115|1100->116|1146->135|1174->136|1202->137|1249->159|1261->164|1294->189|1333->191|1362->194|1628->433|1643->439|1694->469|1940->688|1971->703|2011->705|2060->726|2097->736|2112->742|2175->784|2230->811|2241->812|2272->821|2323->844|2371->865|2381->866|2418->882|2499->932|2540->945|2629->1007|2670->1039|2710->1041|2753->1056|2829->1105|2843->1110|2879->1125|2922->1140|2971->1158|3010->1169|3474->1606|3505->1621|3545->1623|3585->1635|3640->1663|3650->1664|3683->1676|3739->1705|3749->1706|3779->1715|3866->1775|3902->1795|3942->1797|3999->1827|4009->1828|4039->1837|4097->1864|4150->1889|4206->1918|4216->1919|4257->1939|4313->1968|4323->1969|4359->1984|4415->2013|4425->2014|4458->2026|4514->2055|4524->2056|4557->2068|4693->2177|4708->2183|4772->2226|5031->2458|5046->2464|5110->2507|5367->2734|5395->2735|5515->2828|5530->2834|5578->2861|5840->3095|5869->3096|5905->3105|5969->3142|5997->3143|6027->3146|6104->3193
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|36->5|42->11|42->11|42->11|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|47->16|47->16|48->17|48->17|48->17|48->17|50->19|51->20|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|59->28|60->29|74->43|74->43|74->43|75->44|76->45|76->45|76->45|77->46|77->46|77->46|79->48|79->48|79->48|80->49|80->49|80->49|81->50|82->51|83->52|83->52|83->52|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|90->59|90->59|90->59|95->64|95->64|95->64|101->70|101->70|105->74|105->74|105->74|114->83|114->83|115->84|116->85|116->85|117->86|120->89
                  -- GENERATED --
              */
          