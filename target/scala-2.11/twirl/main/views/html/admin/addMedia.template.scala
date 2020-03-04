
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addMedia_Scope0 {
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

     object addMedia_Scope1 {
import helper._

class addMedia extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[play.data.Form[models.Media],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(addMediaForm: play.data.Form[models.Media], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.98*/("""

"""),format.raw/*6.102*/("""

"""),_display_(/*8.2*/admin/*8.7*/.adminMain("Add Media", user)/*8.36*/ {_display_(Seq[Any](format.raw/*8.38*/("""
	"""),format.raw/*9.2*/("""<div class="col-sm-3">
		</div>
		<div class="col-sm-6">
	<h3>Add a new Media</h3>
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*14.3*/form(action = routes.AdminController.addMediaSubmit(), 'class -> "form-horizontal",
		'role->"form", 'enctype -> "multipart/form-data")/*15.52*/ {_display_(Seq[Any](format.raw/*15.54*/("""
		
		"""),format.raw/*17.3*/("""<!-- Build the form, adding an input for each field -->
		<!-- Note the label parameter -->
		"""),_display_(/*19.4*/inputText(addMediaForm("title"), '_label -> "Title",'class -> "form-control")),format.raw/*19.81*/("""
		
		"""),format.raw/*21.3*/("""<label id="FormLabel">Description</label>
		<textarea row="5" name="mediaDescription" class="form-control"></textarea>
		"""),_display_(/*23.4*/for((value,name) <- Genre.options) yield /*23.38*/ {_display_(Seq[Any](format.raw/*23.40*/("""
			"""),format.raw/*24.4*/("""<br>
			<label id="FormLabel">"""),_display_(/*25.27*/name),format.raw/*25.31*/("""</label>
			<input type="checkbox" name="genSelect[]" value=""""),_display_(/*26.54*/value),format.raw/*26.59*/(""""
				"""),_display_(/*27.6*/if(addMediaForm("genre_ID").value != null)/*27.48*/ {_display_(Seq[Any](format.raw/*27.50*/("""
					"""),_display_(/*28.7*/if(Genre.inGenre(value.toLong,addMediaForm("media_ID").value.toLong))/*28.76*/ {_display_(Seq[Any](format.raw/*28.78*/("""
						"""),format.raw/*29.7*/("""checked
					""")))}),format.raw/*30.7*/("""				
				""")))}),format.raw/*31.6*/("""

			"""),format.raw/*33.4*/("""/>
		""")))}),format.raw/*34.4*/("""
		"""),_display_(/*35.4*/inputText(addMediaForm("mediaRating"), '_label -> "Rating",'class -> "form-control")),format.raw/*35.88*/("""
		"""),_display_(/*36.4*/inputText(addMediaForm("animeURL"), '_label -> "Anime link",'class -> "form-control")),format.raw/*36.89*/("""
		"""),_display_(/*37.4*/inputText(addMediaForm("mangaURL"), '_label -> "Manga link",'class -> "form-control")),format.raw/*37.89*/("""


		"""),format.raw/*40.3*/("""<!-- Image upload input -->
		<div class="container-fluid">
			<div class="row">
				<label>Image</label>
			</div>
			<div class="row">
				"""),_display_(/*46.6*/if(env.resource("public/images/mediaImages/covers/" + addMediaForm("media_ID").value() + ".jpg").isDefined)/*46.113*/ {_display_(Seq[Any](format.raw/*46.115*/("""
					"""),format.raw/*47.6*/("""<p><img src="/assets/images/mediaImages/covers/"""),_display_(/*47.54*/(addMediaForm("media_ID").value() + ".jpg")),format.raw/*47.97*/(""""/></p>
				""")))}/*48.7*/else/*48.12*/{_display_(Seq[Any](format.raw/*48.13*/("""
					"""),format.raw/*49.6*/("""<p><img src="/assets/images/mediaImages/covers/noImage.png"/></p>
				""")))}),format.raw/*50.6*/("""
			"""),format.raw/*51.4*/("""</div>
			<div class="row">
				<input class="btn-sm btn-default" type="file" name="upload">
			</div>
		</div>

		<!-- Hidden ID field - required for product updates -->
		"""),_display_(/*58.4*/inputText(addMediaForm("media_ID"), '_label -> "", 'hidden -> "hidden")),format.raw/*58.75*/("""

	"""),format.raw/*60.2*/("""<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Save" class="btn btn-primary">
			<a href=""""),_display_(/*63.14*/routes/*63.20*/.AdminController.adminMedia()),format.raw/*63.49*/(""""><button class="btn btn-warning">Cancel</button>
	  		</a>
  </div>
	""")))}),format.raw/*66.3*/(""" """),format.raw/*66.4*/("""<!-- End Form definition -->
			<div class="col-sm-3">
				</div>

	</div>
""")))}),format.raw/*71.2*/(""" """),format.raw/*71.3*/("""<!-- End of page content -->

"""))
      }
    }
  }

  def render(addMediaForm:play.data.Form[models.Media],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(addMediaForm,user,env)

  def f:((play.data.Form[models.Media],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (addMediaForm,user,env) => apply(addMediaForm,user,env)

  def ref: this.type = this

}


}
}

/**/
object addMedia extends addMedia_Scope0.addMedia_Scope1.addMedia
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/admin/addMedia.scala.html
                  HASH: f11ae47be4390d2fc8e400a08f498a8732ea129f
                  MATRIX: 865->109|1056->205|1086->308|1114->311|1126->316|1163->345|1202->347|1230->349|1405->498|1549->633|1589->635|1622->641|1743->736|1841->813|1874->819|2022->941|2072->975|2112->977|2143->981|2201->1012|2226->1016|2315->1078|2341->1083|2374->1090|2425->1132|2465->1134|2498->1141|2576->1210|2616->1212|2650->1219|2694->1233|2734->1243|2766->1248|2802->1254|2832->1258|2937->1342|2967->1346|3073->1431|3103->1435|3209->1520|3241->1525|3409->1667|3526->1774|3567->1776|3600->1782|3675->1830|3739->1873|3770->1887|3783->1892|3822->1893|3855->1899|3956->1970|3987->1974|4187->2148|4279->2219|4309->2222|4467->2353|4482->2359|4532->2388|4633->2459|4661->2460|4767->2536|4795->2537
                  LINES: 30->4|35->4|37->6|39->8|39->8|39->8|39->8|40->9|45->14|46->15|46->15|48->17|50->19|50->19|52->21|54->23|54->23|54->23|55->24|56->25|56->25|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|61->30|62->31|64->33|65->34|66->35|66->35|67->36|67->36|68->37|68->37|71->40|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|81->50|82->51|89->58|89->58|91->60|94->63|94->63|94->63|97->66|97->66|102->71|102->71
                  -- GENERATED --
              */
          