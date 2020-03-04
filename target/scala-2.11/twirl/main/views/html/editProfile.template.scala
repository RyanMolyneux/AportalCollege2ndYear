
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editProfile_Scope0 {
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

class editProfile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.users.Customer,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentCustomer : models.users.Customer,env : play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.70*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Edit Profile",currentCustomer)/*4.38*/ {_display_(Seq[Any](format.raw/*4.40*/("""

				"""),format.raw/*6.5*/("""<div class="col-sm-2">
				</div>
				<div class="col-sm-8">
					
					<div class="col-sm-2">
					</div>
					
					<div class="col-sm-8" id="SignIn-UpWrapper">
						
						<div id="SignIn-UpHeader">
							<span id="TextAlignCenter"><h2 id="textLightRed"> Profile </h2></span>
						</div>		
						<div id="SignIn-UpBody">
							"""),_display_(/*19.9*/if(flash.containsKey("success"))/*19.41*/ {_display_(Seq[Any](format.raw/*19.43*/("""
								"""),format.raw/*20.9*/("""<div class="alert alert-success TextAlignCenter">
									"""),_display_(/*21.11*/flash/*21.16*/.get("success")),format.raw/*21.31*/("""
								"""),format.raw/*22.9*/("""</div>
							""")))}),format.raw/*23.9*/("""
							"""),_display_(/*24.9*/if(flash.containsKey("error"))/*24.39*/ {_display_(Seq[Any](format.raw/*24.41*/("""
								"""),format.raw/*25.9*/("""<div class="alert alert-warning TextAlignCenter">
									"""),_display_(/*26.11*/flash/*26.16*/.get("error")),format.raw/*26.29*/("""
								"""),format.raw/*27.9*/("""</div>
							""")))}),format.raw/*28.9*/("""
							"""),format.raw/*29.8*/("""<div class="row">
					
								<div class="page-header TextAlignCenter">
									<h3>Options</h3>
								</div>
								
									<a href=""""),_display_(/*35.20*/routes/*35.26*/.ShoppingController.viewOrders()),format.raw/*35.58*/("""" class="btn btn-block" id="Buttons"> View Orders History</a>
									<a href=""""),_display_(/*36.20*/controllers/*36.31*/.security.routes.LoginSignUpController.editProfilePhoto()),format.raw/*36.88*/("""" class="btn btn-block" id="Buttons"> Edit Profile Picture</a>
				
								
							</div>
						</div>
					</div>
					<div class="co-sm-2">
					</div>				
				</div>
				<div class="col-sm-2">
				</div>
						
				


""")))}),format.raw/*51.2*/("""
"""))
      }
    }
  }

  def render(currentCustomer:models.users.Customer,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(currentCustomer,env)

  def f:((models.users.Customer,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (currentCustomer,env) => apply(currentCustomer,env)

  def ref: this.type = this

}


}

/**/
object editProfile extends editProfile_Scope0.editProfile
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/editProfile.scala.html
                  HASH: b9fd3a67c0caa2b3e10df96640c58e075b474575
                  MATRIX: 793->1|971->69|998->87|1025->89|1069->125|1108->127|1140->133|1501->468|1542->500|1582->502|1618->511|1705->571|1719->576|1755->591|1791->600|1836->615|1871->624|1910->654|1950->656|1986->665|2073->725|2087->730|2121->743|2157->752|2202->767|2237->775|2407->918|2422->924|2475->956|2583->1037|2603->1048|2681->1105|2934->1328
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|36->6|49->19|49->19|49->19|50->20|51->21|51->21|51->21|52->22|53->23|54->24|54->24|54->24|55->25|56->26|56->26|56->26|57->27|58->28|59->29|65->35|65->35|65->35|66->36|66->36|66->36|81->51
                  -- GENERATED --
              */
          