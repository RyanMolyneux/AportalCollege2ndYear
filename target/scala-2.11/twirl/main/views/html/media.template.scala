
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object media_Scope0 {
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

class media extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[List[models.Media],List[models.Genre],Long,String,models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(media: List[models.Media], genre: List[models.Genre], genId: Long, filter: String, user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.137*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Media", user)/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""
	"""),format.raw/*5.2*/("""<!-- Search bar -->


	<div class="col-sm-2">
		<br>
		<br>

		<h4 id="TextAlignCenter">Media Genres</h4>



		<ul class="nav nav-pills nav-stacked">
			<li id="TextAlignCenter"><a id="OptionalSecondaryNavbar" href=""""),_display_(/*17.68*/routes/*17.74*/.HomeController.media(0, "")),format.raw/*17.102*/("""">Clear Filters</a></li>
		"""),_display_(/*18.4*/for(gen <-genre) yield /*18.20*/ {_display_(Seq[Any](format.raw/*18.22*/("""
			"""),format.raw/*19.4*/("""<li id="TextAlignCenter"><a id="OptionalSecondaryNavbar" href=""""),_display_(/*19.68*/routes/*19.74*/.HomeController.media(gen.getGenre_ID)),format.raw/*19.112*/("""">"""),_display_(/*19.115*/gen/*19.118*/.getGenre()),format.raw/*19.129*/("""</a></li>
		""")))}),format.raw/*20.4*/("""
		"""),format.raw/*21.3*/("""</ul>

	</div>

	<div class="col-sm-8">
			<!-- Search bar -->
		<div class="row">

			<div class="col-sm-4">

			</div>
			<div class="col-sm-4" id="SearchBar">
					<!---Search Bar Form--->
				<div class="col-sm-12" id="setWidth">
					<form class="navbar-form" action=""""),_display_(/*35.41*/routes/*35.47*/.HomeController.media(genId)),format.raw/*35.75*/("""" method="get" id="marginLeft">
						<div class="input-group" >
							<input type="search" id="searchbox" name="filter" value=""""),_display_(/*37.66*/filter),format.raw/*37.72*/("""" class="form-control" placeholder="Search">

							<div class="input-group-btn">
								<button type="submit" class="btn btn-default" id="textDarkBrown">
									<i class="glyphicon glyphicon-search">
									</i>
								</button>
							</div>
						</div>
					</form>
				</div>
			</div>
			<div class="col-sm-4">
			</div>
		</div>
		<br>

			<!--Media page-->
		"""),_display_(/*55.4*/for(med <-media) yield /*55.20*/ {_display_(Seq[Any](format.raw/*55.22*/("""
			"""),format.raw/*56.4*/("""<div class="panel panel-default">
				<div class="panel-heading" id="mediaTitleBanner"><h4><b>"""),_display_(/*57.62*/med/*57.65*/.getTitle()),format.raw/*57.76*/("""</b></h4></div>
				<div class="panel-body" id="mediaBorder">
					<div class="col-sm-2">
						<img src="/assets/images/mediaImages/covers/"""),_display_(/*60.52*/(med.getMedia_ID + ".jpg")),format.raw/*60.78*/("""" class="image-responsive" id="setWidth" alt="Image of Product/Manga/Anime.">
					</div>
					<p>"""),_display_(/*62.10*/med/*62.13*/.getMediaDescription()),format.raw/*62.35*/("""</p>
					<a href=""""),_display_(/*63.16*/routes/*63.22*/.HomeController.moreMediaInfo(med.getMedia_ID)),format.raw/*63.68*/("""">Read More</a>
				</div>
			</div>
		""")))}),format.raw/*66.4*/("""
		
		"""),format.raw/*68.3*/("""<br>
		<br>
	</div>
	<div class="col-sm-2">

	</div>
""")))}),format.raw/*74.2*/("""
"""))
      }
    }
  }

  def render(media:List[models.Media],genre:List[models.Genre],genId:Long,filter:String,user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(media,genre,genId,filter,user,env)

  def f:((List[models.Media],List[models.Genre],Long,String,models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (media,genre,genId,filter,user,env) => apply(media,genre,genId,filter,user,env)

  def ref: this.type = this

}


}

/**/
object media extends media_Scope0.media
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/media.scala.html
                  HASH: f8c109e1d19addc332f5cfa6d2fa5b96a3bf8806
                  MATRIX: 827->1|1058->136|1086->138|1146->171|1174->172|1220->191|1248->192|1276->193|1323->215|1350->234|1389->236|1417->238|1661->455|1676->461|1726->489|1780->517|1812->533|1852->535|1883->539|1974->603|1989->609|2049->647|2080->650|2093->653|2126->664|2169->677|2199->680|2500->954|2515->960|2564->988|2721->1118|2748->1124|3149->1499|3181->1515|3221->1517|3252->1521|3374->1616|3386->1619|3418->1630|3586->1771|3633->1797|3759->1896|3771->1899|3814->1921|3861->1941|3876->1947|3943->1993|4013->2033|4046->2039|4130->2093
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|50->19|50->19|50->19|50->19|51->20|52->21|66->35|66->35|66->35|68->37|68->37|86->55|86->55|86->55|87->56|88->57|88->57|88->57|91->60|91->60|93->62|93->62|93->62|94->63|94->63|94->63|97->66|99->68|105->74
                  -- GENERATED --
              */
          