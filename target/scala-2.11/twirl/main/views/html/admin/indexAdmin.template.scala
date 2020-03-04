
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object indexAdmin_Scope0 {
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

class indexAdmin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user : models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.55*/("""

"""),_display_(/*3.2*/admin/*3.7*/.adminMain("indexAdmin",user)/*3.36*/{_display_(Seq[Any](format.raw/*3.37*/("""
			"""),format.raw/*4.4*/("""<div class="col-sm-2">
			</div>
			<div class="col-sm-8">
				"""),_display_(/*7.6*/if(flash.containsKey("error"))/*7.36*/ {_display_(Seq[Any](format.raw/*7.38*/("""
					"""),format.raw/*8.6*/("""<div class="alert alert-warning">
						"""),_display_(/*9.8*/flash/*9.13*/.get("error")),format.raw/*9.26*/("""					
					"""),format.raw/*10.6*/("""</div>
				""")))}),format.raw/*11.6*/("""

				"""),format.raw/*13.5*/("""<div class="row">
				<div class="col-sm-2">
				</div>
				<div class="col-sm-8" id="AdminHomeWrapper">
					<div id ="AdminHomeHeader">
						<h1 id="textLightRed"> Admin Home</h1>					
					</div>
					<div id = "AdminHomeBody">
						<div class="page-header" id="AdminHomeTitle">					
							<h2 class="BreakWord"> ADMIN ACCESS ONLY UNAUTHORIZED USERS <br> WILL BE PROSECUTED!!! </h2>
						</div>
						<div class="row">
							<div class="col-sm-1">					
							</div>
							<div class="col-sm-10">
								<a href=""""),_display_(/*28.19*/controllers/*28.30*/.routes.AdminController.products()),format.raw/*28.64*/("""" class="btn btn-block" id="Buttons" alt="Link to edit products page">
								Edit Products
								</a>

								<a href=""""),_display_(/*32.19*/controllers/*32.30*/.routes.AdminController.adminMedia()),format.raw/*32.66*/("""" class="btn btn-block" id="Buttons">Edit Media</a>
								<a href=""""),_display_(/*33.19*/controllers/*33.30*/.routes.AdminController.adminAdvert()),format.raw/*33.67*/("""" class="btn btn-block" id="Buttons">Edit Advert</a>
								<a href=""""),_display_(/*34.19*/controllers/*34.30*/.routes.AdminController.adminSupport()),format.raw/*34.68*/("""" class="btn btn-block" id="Buttons">Support Queries</a>
							</div>
							<div class="col-sm-1">
							</div>
						</div>						
					</div>
					
				</div>
				<div class="col-sm-2">
				</div>
			</div>
		</div>
		<div class="col-sm-2">
		</div>


""")))}),format.raw/*50.2*/("""
"""))
      }
    }
  }

  def render(user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(user,env)

  def f:((models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (user,env) => apply(user,env)

  def ref: this.type = this

}


}

/**/
object indexAdmin extends indexAdmin_Scope0.indexAdmin
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/admin/indexAdmin.scala.html
                  HASH: 9029db9461ec5fc52c39e5440524a30b1db64979
                  MATRIX: 793->1|941->54|969->57|981->62|1018->91|1056->92|1086->96|1175->160|1213->190|1252->192|1284->198|1350->239|1363->244|1396->257|1434->268|1476->280|1509->286|2060->810|2080->821|2135->855|2287->980|2307->991|2364->1027|2461->1097|2481->1108|2539->1145|2637->1216|2657->1227|2716->1265|3003->1522
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|59->28|59->28|59->28|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|81->50
                  -- GENERATED --
              */
          