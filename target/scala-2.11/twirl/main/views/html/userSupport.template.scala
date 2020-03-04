
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object userSupport_Scope0 {
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

class userSupport extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.users.User,Form[models.supportQueryForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user : models.users.User, queryForm : Form[models.supportQueryForm]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.71*/("""
"""),_display_(/*3.2*/main("User Support", user)/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""

	"""),format.raw/*5.2*/("""<div class="col-sm-2">
	</div>
	<div class="col-sm-8">
			<div class="row">			
				<div class="col-sm-2">
				</div>
				<div class="col-sm-8" id="SupportWrapper">
					<div id="SupportHeader">
						<h1 id="textLightRed">Support</h1>
					</div>
				
					<div id="SupportBody">	
						"""),_display_(/*17.8*/if(flash.containsKey("success"))/*17.40*/ {_display_(Seq[Any](format.raw/*17.42*/("""
							"""),format.raw/*18.8*/("""<div class="alert alert-success" class="TextAlignCenter">
							"""),_display_(/*19.9*/flash/*19.14*/.get("success")),format.raw/*19.29*/("""						
							"""),format.raw/*20.8*/("""</div>
						""")))}),format.raw/*21.8*/(""" 
						"""),_display_(/*22.8*/if(flash.containsKey("error"))/*22.38*/ {_display_(Seq[Any](format.raw/*22.40*/("""
							"""),format.raw/*23.8*/("""<div class="alert alert-warning" class="TextAlignCenter">
							"""),_display_(/*24.9*/flash/*24.14*/.get("error")),format.raw/*24.27*/("""						
							"""),format.raw/*25.8*/("""</div>
						""")))}),format.raw/*26.8*/("""
						
						"""),format.raw/*28.7*/("""<div class="page-header" id="SupportHeader">
						 	<h2>Need Help ? <span id="textLightRed">OR</span> Genral Query</h2>
						</div>
						<div id="SupportBody">
							<p>
							Well Below you can choose the type of query you have for us and enter it into the text area,We Are here to help Queries 					 may take up to 48 Hours before reply has been sent to your email.
							</p>			
					
							"""),_display_(/*36.9*/helper/*36.15*/.form(action = routes.HomeController.submitQuery(),'class -> "form-horizontal",'role -> "form")/*36.110*/ {_display_(Seq[Any](format.raw/*36.112*/("""
								"""),format.raw/*37.9*/("""<div class="form-group">
								
								"""),_display_(/*39.10*/for((value,name) <- QueryType.options) yield /*39.48*/ {_display_(Seq[Any](format.raw/*39.50*/("""
								"""),format.raw/*40.9*/("""<input type="radio" name="queryTypeId" value=""""),_display_(/*40.56*/value),format.raw/*40.61*/(""""/>"""),_display_(/*40.65*/name),format.raw/*40.69*/("""
								""")))}),format.raw/*41.10*/("""	
								"""),format.raw/*42.9*/("""</div>
								<div class="form-group">
									<label id="FormLabel">Query Text Area </label>
									<textarea rows="5" name="description" required class="form-control"></textarea>
								</div>
								
								<button type="submit" class="btn" id="Buttons">Submit</button>
							""")))}),format.raw/*49.9*/("""
						"""),format.raw/*50.7*/("""</div>
					</div>
				</div>
				<div class="col-sm-2">
				</div>
			</div>		
	</div>
	<div class="col-sm-2">
	</div>

""")))}),format.raw/*60.2*/("""
"""))
      }
    }
  }

  def render(user:models.users.User,queryForm:Form[models.supportQueryForm]): play.twirl.api.HtmlFormat.Appendable = apply(user,queryForm)

  def f:((models.users.User,Form[models.supportQueryForm]) => play.twirl.api.HtmlFormat.Appendable) = (user,queryForm) => apply(user,queryForm)

  def ref: this.type = this

}


}

/**/
object userSupport extends userSupport_Scope0.userSupport
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/userSupport.scala.html
                  HASH: f3f3b5d3f75b02456e5d47a8388fe6c60ec5686e
                  MATRIX: 798->1|977->70|1004->89|1038->115|1077->117|1106->120|1420->408|1461->440|1501->442|1536->450|1628->516|1642->521|1678->536|1719->550|1763->564|1798->573|1837->603|1877->605|1912->613|2004->679|2018->684|2052->697|2093->711|2137->725|2178->739|2606->1141|2621->1147|2726->1242|2767->1244|2803->1253|2873->1296|2927->1334|2967->1336|3003->1345|3077->1392|3103->1397|3134->1401|3159->1405|3200->1415|3237->1425|3555->1713|3589->1720|3741->1842
                  LINES: 27->1|32->1|33->3|33->3|33->3|35->5|47->17|47->17|47->17|48->18|49->19|49->19|49->19|50->20|51->21|52->22|52->22|52->22|53->23|54->24|54->24|54->24|55->25|56->26|58->28|66->36|66->36|66->36|66->36|67->37|69->39|69->39|69->39|70->40|70->40|70->40|70->40|70->40|71->41|72->42|79->49|80->50|90->60
                  -- GENERATED --
              */
          