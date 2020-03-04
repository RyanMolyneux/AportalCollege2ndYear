
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addAdvert_Scope0 {
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

class addAdvert extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[models.Advert],models.users.Admin,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(advertisementForm : Form[models.Advert],admin : models.users.Admin,env : play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.97*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Advert",admin)/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
	"""),format.raw/*5.2*/("""<div class="col-sm-2">
	</div>
	<div class="col-sm-8">
		<div class="col-sm-2">
		</div>
		<div id="adminAdvertWrapper" class="col-sm-8">

			"""),_display_(/*12.5*/if(flash.containsKey("success"))/*12.37*/ {_display_(Seq[Any](format.raw/*12.39*/("""

			""")))}),format.raw/*14.5*/("""
			"""),_display_(/*15.5*/if(flash.containsKey("error"))/*15.35*/ {_display_(Seq[Any](format.raw/*15.37*/("""
			""")))}),format.raw/*16.5*/("""
			"""),format.raw/*17.4*/("""<div id="adminAdvertHeader">
				<h2>
					Add Advert
				</h2>
			</div>
			<div id="adminAdvertBody">
				"""),_display_(/*23.6*/helper/*23.12*/.form(action = routes.AdminController.addAdvertSubmit() ,'class -> "form-horizontal",'role -> "form",'enctype ->"multipart/form-data")/*23.146*/ {_display_(Seq[Any](format.raw/*23.148*/("""
				"""),format.raw/*24.5*/("""<div class="form-group">
					<label id="FormLabel">AdvertName</label>
					<input class="form-control" type="text" name="advertName" alt="Input Field for Advert name" />
				</div>	
				<div class="form-group">
					<label>Advert Image</label>
					"""),_display_(/*30.7*/if(env.resource("public/images/advertImages/thumbnails/"+advertisementForm("advertId").value()+".jpg").isDefined)/*30.120*/ {_display_(Seq[Any](format.raw/*30.122*/("""
						"""),format.raw/*31.7*/("""<p><img src="assets/images/advertImages/thumbnails/"""),_display_(/*31.59*/(advertisementForm("advertId").value()+".jpg")),format.raw/*31.105*/(""""/></p>
					""")))}/*32.8*/else/*32.13*/{_display_(Seq[Any](format.raw/*32.14*/("""
						"""),format.raw/*33.7*/("""<p><img src="assets/images/advertImages/thumbnails/noImage.png"/></p>
					""")))}),format.raw/*34.7*/("""	
					"""),format.raw/*35.6*/("""<p><input type="file" class="btn-sm" name="upload" /></p> 				
				</div>
				<input type="submit" id="Buttons" class="btn" value="Save"/>			
				""")))}),format.raw/*38.6*/("""
				"""),format.raw/*39.5*/("""<a href=""""),_display_(/*39.15*/routes/*39.21*/.AdminController.adminAdvert()),format.raw/*39.51*/("""" alt="Link to cancel adding advert" class="btn btn-warning">
				Cancel				
				</a>
			</div>
		</div>	
		<div class="col-sm-2">
		</div>
	</div>
	<div class="col-sm-2">
	</div>


""")))}),format.raw/*51.2*/("""
"""))
      }
    }
  }

  def render(advertisementForm:Form[models.Advert],admin:models.users.Admin,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(advertisementForm,admin,env)

  def f:((Form[models.Advert],models.users.Admin,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (advertisementForm,admin,env) => apply(advertisementForm,admin,env)

  def ref: this.type = this

}


}

/**/
object addAdvert extends addAdvert_Scope0.addAdvert
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/admin/addAdvert.scala.html
                  HASH: 078d3ca2dae141aad3d2016580e0ef1cf9f30ebe
                  MATRIX: 812->1|1017->96|1044->114|1071->116|1103->140|1142->142|1170->144|1339->287|1380->319|1420->321|1456->327|1487->332|1526->362|1566->364|1601->369|1632->373|1767->482|1782->488|1926->622|1967->624|1999->629|2276->880|2399->993|2440->995|2474->1002|2553->1054|2621->1100|2653->1115|2666->1120|2705->1121|2739->1128|2845->1204|2879->1211|3056->1358|3088->1363|3125->1373|3140->1379|3191->1409|3404->1592
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|35->5|42->12|42->12|42->12|44->14|45->15|45->15|45->15|46->16|47->17|53->23|53->23|53->23|53->23|54->24|60->30|60->30|60->30|61->31|61->31|61->31|62->32|62->32|62->32|63->33|64->34|65->35|68->38|69->39|69->39|69->39|69->39|81->51
                  -- GENERATED --
              */
          