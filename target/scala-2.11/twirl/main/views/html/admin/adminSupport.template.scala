
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminSupport_Scope0 {
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

class adminSupport extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[models.users.User,play.api.Environment,List[models.supportQuery],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user : models.users.User, env : play.api.Environment,queries : List[models.supportQuery]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.92*/("""

"""),_display_(/*3.2*/admin/*3.7*/.adminMain("Admin Support", user)/*3.40*/ {_display_(Seq[Any](format.raw/*3.42*/("""
	"""),format.raw/*4.2*/("""<div class="col-sm-2">
	

			<!---Navigation Section of query page--->
	
			<h4 id="TextAlignCenter">Query Types</h4>
				
			<ul class="nav nav-pills nav-stacked">
				<li id="TextAlignCenter"><a id="OptionalSecondaryNavbar" href=""""),_display_(/*12.69*/routes/*12.75*/.AdminController.adminSupport(0,false)),format.raw/*12.113*/("""">All<span class="badge"  id="Badge">"""),_display_(/*12.151*/supportQuery/*12.163*/.findAll().size()),format.raw/*12.180*/("""</span></a></li>
				"""),_display_(/*13.6*/for(querytype <- QueryType.findAll()) yield /*13.43*/ {_display_(Seq[Any](format.raw/*13.45*/("""
				"""),format.raw/*14.5*/("""<li id="TextAlignCenter"><a id="OptionalSecondaryNavbar" href=""""),_display_(/*14.69*/routes/*14.75*/.AdminController.adminSupport(querytype.getQueryTypeID,false)),format.raw/*14.136*/("""">"""),_display_(/*14.139*/querytype/*14.148*/.getQueryTypeName()),format.raw/*14.167*/("""<span class="badge" id="Badge">"""),_display_(/*14.199*/querytype/*14.208*/.getQueryList().size()),format.raw/*14.230*/("""</span></a></li>
				""")))}),format.raw/*15.6*/("""				
			"""),format.raw/*16.4*/("""</ul>
				
				<h4 id="TextAlignCenter">Query Status</h4>
				
			<ul class="nav nav-pills nav-stacked">
				<li class="dropdown" id="TextAlignCenter">
					<a class="dropdown-toggle" data-toggle="dropdown" href="#" id="OptionalSecondaryNavbar">Choose Status
					<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href=""""),_display_(/*25.21*/routes/*25.27*/.AdminController.adminSupport(0,false)),format.raw/*25.65*/("""">UnAnswered</a><span class="badge" id="Badge"></span></li>
						<li><a href=""""),_display_(/*26.21*/routes/*26.27*/.AdminController.adminSupport(0,true)),format.raw/*26.64*/("""">Answered</a><span class="badge" id="Badge"></span></li>
					</ul>
				</li>
			</ul>





	</div>
	<div class="col-sm-8">
			<!---Main Section of query page--->
		<div class="row">		
			<div class="col-sm-1">
			</div>	
			<div class="col-sm-10" >
			"""),_display_(/*42.5*/if(flash.containsKey("success"))/*42.37*/ {_display_(Seq[Any](format.raw/*42.39*/("""
			"""),format.raw/*43.4*/("""<div class="alert alert-success">
			 """),_display_(/*44.6*/flash/*44.11*/.get("success")),format.raw/*44.26*/("""
			"""),format.raw/*45.4*/("""</div>
			""")))}),format.raw/*46.5*/("""
			"""),format.raw/*47.4*/("""<!---Start of each Querys body--->
				"""),_display_(/*48.6*/for(query <-queries) yield /*48.26*/ {_display_(Seq[Any](format.raw/*48.28*/("""
				"""),format.raw/*49.5*/("""<div class="row">
					<div class="col-sm-12" id="AdminSupportViewWrapper">
						<div id="AdminSupportViewHeader" >
							<h2>"""),_display_(/*52.13*/query/*52.18*/.getQueryType().getQueryTypeName()),format.raw/*52.52*/("""</h2>
						</div>
							
						<div id="AdminSupportViewBody">
							<p>USER : """),_display_(/*56.19*/query/*56.24*/.getQueryingCustomer().getName()),format.raw/*56.56*/(""" """),format.raw/*56.57*/("""<span id="FloatRight">Date Time : """),_display_(/*56.92*/query/*56.97*/.getQueryDate()),format.raw/*56.112*/("""</span><br>EMAIL : """),_display_(/*56.132*/query/*56.137*/.getQueryingCustomer().getEmail()),format.raw/*56.170*/("""<span id="FloatRight">ANSWERED : """),_display_(/*56.204*/query/*56.209*/.getQueryStatus()),format.raw/*56.226*/("""</span></p>
							<pre>"""),_display_(/*57.14*/query/*57.19*/.getQueryDescription()),format.raw/*57.41*/("""</pre>
							<a href=""""),_display_(/*58.18*/routes/*58.24*/.AdminController.changeQueryStatus(query.getQueryID())),format.raw/*58.78*/("""" class="btn" id="Buttons">
							 Answered
						        </a>
						</div>
					</div>
				</div>
				""")))}),format.raw/*64.6*/("""
					
			"""),format.raw/*66.4*/("""<!---End of each Query's body.--->
					
					
			</div>
			<div class="col-sm-1">
			</div>
				
		</div>
	</div>
	<div class="col-sm-2">
	</div>
""")))}),format.raw/*77.2*/("""
"""))
      }
    }
  }

  def render(user:models.users.User,env:play.api.Environment,queries:List[models.supportQuery]): play.twirl.api.HtmlFormat.Appendable = apply(user,env,queries)

  def f:((models.users.User,play.api.Environment,List[models.supportQuery]) => play.twirl.api.HtmlFormat.Appendable) = (user,env,queries) => apply(user,env,queries)

  def ref: this.type = this

}


}

/**/
object adminSupport extends adminSupport_Scope0.adminSupport
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/admin/adminSupport.scala.html
                  HASH: 268ba0edeaa6bedc6a57c72e7db973bbcd37c7d2
                  MATRIX: 823->1|1008->91|1036->94|1048->99|1089->132|1128->134|1156->136|1416->369|1431->375|1491->413|1557->451|1579->463|1618->480|1666->502|1719->539|1759->541|1791->546|1882->610|1897->616|1980->677|2011->680|2030->689|2071->708|2131->740|2150->749|2194->771|2246->793|2281->801|2656->1149|2671->1155|2730->1193|2837->1273|2852->1279|2910->1316|3191->1571|3232->1603|3272->1605|3303->1609|3368->1648|3382->1653|3418->1668|3449->1672|3490->1683|3521->1687|3587->1727|3623->1747|3663->1749|3695->1754|3851->1883|3865->1888|3920->1922|4030->2005|4044->2010|4097->2042|4126->2043|4188->2078|4202->2083|4239->2098|4287->2118|4302->2123|4357->2156|4419->2190|4434->2195|4473->2212|4525->2237|4539->2242|4582->2264|4633->2288|4648->2294|4723->2348|4858->2453|4895->2463|5073->2611
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|45->14|45->14|45->14|45->14|46->15|47->16|56->25|56->25|56->25|57->26|57->26|57->26|73->42|73->42|73->42|74->43|75->44|75->44|75->44|76->45|77->46|78->47|79->48|79->48|79->48|80->49|83->52|83->52|83->52|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|95->64|97->66|108->77
                  -- GENERATED --
              */
          