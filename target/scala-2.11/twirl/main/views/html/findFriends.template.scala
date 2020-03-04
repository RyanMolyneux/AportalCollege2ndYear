
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object findFriends_Scope0 {
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

class findFriends extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[models.users.Customer,List[models.users.Customer],play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentCustomer: models.users.Customer , customers: List[models.users.Customer],env : play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.110*/("""

"""),_display_(/*3.2*/main("Friend Portal",currentCustomer)/*3.39*/ {_display_(Seq[Any](format.raw/*3.41*/("""

	"""),format.raw/*5.2*/("""<div class="col-sm-3">
	
	
	</div>
	<div class="col-sm-6" id="findFriendsWrapper">




		
			<div id="findFriendsHeader">
				<h2>Find Friends</h2>			
			</div>
			<div class="row">
			<div class="col-sm-4">
			</div>
			<!---Start of Search Bar Form--->
			<div class="col-sm-4" >
				
					<form class="navbar-form" action=""""),_display_(/*24.41*/routes/*24.47*/.HomeController.findFriends()),format.raw/*24.76*/("""" method="GET" id="marginLeft">
						<div class="input-group" >
							<input type="search" name="name"  class="form-control" placeholder="Search">
								
							<div class="input-group-btn">
								<button type="submit" class="btn btn-default" id="textDarkBrown">
									<i class="glyphicon glyphicon-search">
									</i>
								</button>
							</div>
						</div>
					</form>
			</div>
			
			<div class="col-sm-4">
			</div>  
			</div>

			<!---End of Search Bar Form--->


			<div id="findFriendsBody">
				"""),_display_(/*46.6*/if(flash.containsKey("success"))/*46.38*/ {_display_(Seq[Any](format.raw/*46.40*/("""
					"""),format.raw/*47.6*/("""<div class="alert alert-success">
					"""),_display_(/*48.7*/flash/*48.12*/.get("success")),format.raw/*48.27*/("""				
					"""),format.raw/*49.6*/("""</div>
				""")))}),format.raw/*50.6*/("""

				
				"""),_display_(/*53.6*/if(flash.containsKey("error"))/*53.36*/ {_display_(Seq[Any](format.raw/*53.38*/("""
					"""),format.raw/*54.6*/("""<div class="alert alert-warning">
					"""),_display_(/*55.7*/flash/*55.12*/.get("error")),format.raw/*55.25*/("""			
					"""),format.raw/*56.6*/("""</div>
				""")))}),format.raw/*57.6*/("""
				"""),_display_(/*58.6*/for(customer <-customers) yield /*58.31*/ {_display_(Seq[Any](format.raw/*58.33*/("""
					"""),format.raw/*59.6*/("""<div class="row">
						<div class="col-sm-12">
						"""),_display_(/*61.8*/if(env.resource("public/images/userImages/"+customer.getName()+".jpg").isDefined)/*61.89*/ {_display_(Seq[Any](format.raw/*61.91*/("""
						"""),format.raw/*62.7*/("""<img src="assets/images/userImages/thumbnails/"""),_display_(/*62.54*/(customer.getName()+".jpg")),format.raw/*62.81*/("""" id="FloatLeft" class="img-responsive img-thumbnail" id="marginLeft"/>
						""")))}/*63.9*/else/*63.14*/{_display_(Seq[Any](format.raw/*63.15*/("""
						"""),format.raw/*64.7*/("""<img src="assets/images/userImages/thumbnails/default.png" id="FloatLeft" class="img-responsive img-thumbnail"/ id="marginLeft">
						""")))}),format.raw/*65.8*/("""
						"""),format.raw/*66.7*/("""<h3>"""),_display_(/*66.12*/customer/*66.20*/.getName()),format.raw/*66.30*/("""</h3>
						<a href=""""),_display_(/*67.17*/controllers/*67.28*/.routes.HomeController.sendRequest(customer.getName())),format.raw/*67.82*/("""" class="btn" id="smallButtons">Send Friend Request</a> 					
						</div>
					</div>
					<hr>
				""")))}),format.raw/*71.6*/("""
			"""),format.raw/*72.4*/("""</div>		
		
	</div>
	<div class="col-sm-3">
	</div>
""")))}),format.raw/*77.2*/("""
"""))
      }
    }
  }

  def render(currentCustomer:models.users.Customer,customers:List[models.users.Customer],env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(currentCustomer,customers,env)

  def f:((models.users.Customer,List[models.users.Customer],play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (currentCustomer,customers,env) => apply(currentCustomer,customers,env)

  def ref: this.type = this

}


}

/**/
object findFriends extends findFriends_Scope0.findFriends
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/findFriends.scala.html
                  HASH: e23a57655013a10f1cb8e03061452d5ff3127b63
                  MATRIX: 821->1|1025->109|1053->112|1098->149|1137->151|1166->154|1520->481|1535->487|1585->516|2135->1040|2176->1072|2216->1074|2249->1080|2315->1120|2329->1125|2365->1140|2402->1150|2444->1162|2482->1174|2521->1204|2561->1206|2594->1212|2660->1252|2674->1257|2708->1270|2744->1279|2786->1291|2818->1297|2859->1322|2899->1324|2932->1330|3013->1385|3103->1466|3143->1468|3177->1475|3251->1522|3299->1549|3396->1629|3409->1634|3448->1635|3482->1642|3648->1778|3682->1785|3714->1790|3731->1798|3762->1808|3811->1830|3831->1841|3906->1895|4038->1997|4069->2001|4152->2054
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|55->24|55->24|55->24|77->46|77->46|77->46|78->47|79->48|79->48|79->48|80->49|81->50|84->53|84->53|84->53|85->54|86->55|86->55|86->55|87->56|88->57|89->58|89->58|89->58|90->59|92->61|92->61|92->61|93->62|93->62|93->62|94->63|94->63|94->63|95->64|96->65|97->66|97->66|97->66|97->66|98->67|98->67|98->67|102->71|103->72|108->77
                  -- GENERATED --
              */
          