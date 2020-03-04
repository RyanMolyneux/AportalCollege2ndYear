
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object moreMediaInfo_Scope0 {
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

class moreMediaInfo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.Media,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(selectedMedia: models.Media, user : models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""


"""),_display_(/*4.2*/main("Media Info",user)/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""

				"""),format.raw/*6.5*/("""<div class="col-sm-2">
				</div>
				<div class="col-sm-8">

					<div class="row" id="moreMediaInfoBody">

						<div class="col-sm-1">
						</div>
						<div class="col-sm-3">
							<img src="/assets/images/mediaImages/covers/"""),_display_(/*15.53*/(selectedMedia.getMedia_ID() +".jpg")),format.raw/*15.90*/("""" class="image-responsive" id="setWidth" alt="Image of Product/Manga/Anime.">
						</div>
						<div class="col-sm-6">
							<h3><b>"""),_display_(/*18.16*/selectedMedia/*18.29*/.getTitle()),format.raw/*18.40*/("""</b></h3>
						
							<p>"""),_display_(/*20.12*/selectedMedia/*20.25*/.getMediaDescription()),format.raw/*20.47*/("""</p>

							<pre id="FloatLeft">Genre:"""),_display_(/*22.35*/selectedMedia/*22.48*/.printGenList()),format.raw/*22.63*/("""</pre>
							<pre id="FloatLeft" >Rating: """),_display_(/*23.38*/selectedMedia/*23.51*/.getMediaRating()),format.raw/*23.68*/("""/10</pre>
							<br>
							<br>
							<br>
							<br>
							<br>
							<p>Watch the Anime: <a href=""""),_display_(/*29.38*/selectedMedia/*29.51*/.getAnimeURL),format.raw/*29.63*/("""" alt="Anime">GoGoAnime</a></p>
							<p>Read the Manga: <a href=""""),_display_(/*30.37*/selectedMedia/*30.50*/.getMangaURL),format.raw/*30.62*/("""" alt="Manga">GoGoManga</a></p>
							<br>
							<br>
							<br>
							
						</div>
						
					
					

					</div>	
				</div>
				<div class="col-sm-2">
				</div>
				


""")))}),format.raw/*47.2*/("""



	"""),format.raw/*51.28*/("""
"""),format.raw/*52.39*/("""
	"""),format.raw/*53.27*/("""
"""),format.raw/*54.6*/("""
"""))
      }
    }
  }

  def render(selectedMedia:models.Media,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(selectedMedia,user)

  def f:((models.Media,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (selectedMedia,user) => apply(selectedMedia,user)

  def ref: this.type = this

}


}

/**/
object moreMediaInfo extends moreMediaInfo_Scope0.moreMediaInfo
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/moreMediaInfo.scala.html
                  HASH: 76227e78f4cb54fde4472f8697ad2e71e5f6a952
                  MATRIX: 785->1|935->56|964->60|995->83|1034->85|1066->91|1325->323|1383->360|1545->495|1567->508|1599->519|1654->547|1676->560|1719->582|1786->622|1808->635|1844->650|1915->694|1937->707|1975->724|2109->831|2131->844|2164->856|2259->924|2281->937|2314->949|2523->1128|2556->1159|2585->1198|2615->1225|2643->1231
                  LINES: 27->1|32->1|35->4|35->4|35->4|37->6|46->15|46->15|49->18|49->18|49->18|51->20|51->20|51->20|53->22|53->22|53->22|54->23|54->23|54->23|60->29|60->29|60->29|61->30|61->30|61->30|78->47|82->51|83->52|84->53|85->54
                  -- GENERATED --
              */
          