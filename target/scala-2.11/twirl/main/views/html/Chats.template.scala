
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object Chats_Scope0 {
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

class Chats extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[models.users.Customer,List[models.FriendList],List[models.FriendList],Long,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentCustomer: models.users.Customer,friends : List[models.FriendList],pendingFriends : List[models.FriendList],option: Long, env : play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.158*/("""

"""),_display_(/*3.2*/main("Chat Portal",currentCustomer)/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
	"""),format.raw/*4.2*/("""<div class="col-sm-4">
	</div>
	<div class="col-sm-4" id="findFriendsWrapper">
			<div id="findFriendsHeader" >
				<h2>Friends</h2>			
			</div>
			
			<div id="findFriendsBody">
				<div class="btn-group btn-group-justified"> 
					
					<a href=""""),_display_(/*14.16*/controllers/*14.27*/.routes.HomeController.Chat(0)),format.raw/*14.57*/("""" class="btn btn-default" id="navButtons" >Chat Friends</a>
					<a href=""""),_display_(/*15.16*/controllers/*15.27*/.routes.HomeController.Chat(1)),format.raw/*15.57*/("""" class="btn btn-default" id="navButtons">Friend Requests</a>
				</div>
 
				"""),_display_(/*18.6*/if(flash.containsKey("success"))/*18.38*/ {_display_(Seq[Any](format.raw/*18.40*/("""
					"""),format.raw/*19.6*/("""<div class="alert alert-success">
						<p>"""),_display_(/*20.11*/flash/*20.16*/.get("success")),format.raw/*20.31*/("""</p>				
					</div>
				""")))}),format.raw/*22.6*/("""
				"""),_display_(/*23.6*/if(flash.containsKey("error"))/*23.36*/ {_display_(Seq[Any](format.raw/*23.38*/("""
					"""),format.raw/*24.6*/("""<div class="alert alert-warning">
						<p>"""),_display_(/*25.11*/flash/*25.16*/.get("error")),format.raw/*25.29*/("""</p>
					</div>
				""")))}),format.raw/*27.6*/("""
			





				"""),_display_(/*34.6*/if(option == 0)/*34.21*/{_display_(Seq[Any](format.raw/*34.22*/("""
					"""),_display_(/*35.7*/for(friend <- friends) yield /*35.29*/ {_display_(Seq[Any](format.raw/*35.31*/("""
						"""),format.raw/*36.7*/("""<div class="row" id="marginTop">
							<a href=""""),_display_(/*37.18*/controllers/*37.29*/.routes.HomeController.MessageFriend(friend.getFriendListName())),format.raw/*37.93*/("""">
								<div class="col-sm-2">
							
								"""),_display_(/*40.10*/if(env.resource("public/images/userImages/"+friend.getFriendListName()+".jpg").isDefined)/*40.99*/ {_display_(Seq[Any](format.raw/*40.101*/("""
										"""),format.raw/*41.11*/("""<img src="/assets/images/userImages/thumbnails/"""),_display_(/*41.59*/(friend.getFriendListName() +".jpg")),format.raw/*41.95*/("""" class="img-responsive img-thumbnail"/>
								""")))}/*42.11*/else/*42.16*/{_display_(Seq[Any](format.raw/*42.17*/("""
								"""),format.raw/*43.9*/("""<img src="/assets/images/userImages/thumbnails/default.png" class="img-responsive img-thumbnail"/>								
								""")))}),format.raw/*44.10*/("""
								"""),format.raw/*45.9*/("""</div>
								<div class="col-sm-10" style="color:black;">
									<h3> """),_display_(/*47.16*/friend/*47.22*/.getFriendListName()),format.raw/*47.42*/("""</h3>
								</div>							
							</a>		
						</div>			
					""")))}),format.raw/*51.7*/("""
				""")))}/*52.7*/else/*52.12*/{_display_(Seq[Any](format.raw/*52.13*/("""
					"""),_display_(/*53.7*/for(pendingFriend <-pendingFriends) yield /*53.42*/ {_display_(Seq[Any](format.raw/*53.44*/("""
						"""),format.raw/*54.7*/("""<div class="row" id="marginTop">
							<div class="col-sm-2">
								"""),_display_(/*56.10*/if(env.resource("public/images/userImages/"+pendingFriend.getFriendListName()+".jpg").isDefined)/*56.106*/ {_display_(Seq[Any](format.raw/*56.108*/("""
									"""),format.raw/*57.10*/("""<img src="/assets/images/userImages/thumbnails/"""),_display_(/*57.58*/(pendingFriend.getFriendListName()+".jpg")),format.raw/*57.100*/("""" class="img-responsive img-thumbnail"/>
								""")))}/*58.11*/else/*58.16*/{_display_(Seq[Any](format.raw/*58.17*/("""
									"""),format.raw/*59.10*/("""<img src="/assets/images/userImages/thumbnails/default.png" class="img-responsive img-thumbnail"/>
								
								""")))}),format.raw/*61.10*/("""
							"""),format.raw/*62.8*/("""</div>
							<div class="col-sm-10">
								<h3> """),_display_(/*64.15*/pendingFriend/*64.28*/.getFriendListName()),format.raw/*64.48*/("""</h3>
								<a href=""""),_display_(/*65.19*/controllers/*65.30*/.routes.HomeController.addFriend(option,pendingFriend.getFriendListName())),format.raw/*65.104*/("""" class="btn" id="smallButtons">Accept</a><a href=""""),_display_(/*65.156*/controllers/*65.167*/.routes.HomeController.declineRequest(pendingFriend.getFriendListName())),format.raw/*65.239*/("""" class="btn btn-warning">Decline</a>
							</div>
						</div>
					""")))}),format.raw/*68.7*/("""
				""")))}),format.raw/*69.6*/("""
				
			"""),format.raw/*71.4*/("""</div>
		
	</div>
	<div class="col-sm-4">
	</div>


""")))}),format.raw/*78.2*/("""
"""))
      }
    }
  }

  def render(currentCustomer:models.users.Customer,friends:List[models.FriendList],pendingFriends:List[models.FriendList],option:Long,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(currentCustomer,friends,pendingFriends,option,env)

  def f:((models.users.Customer,List[models.FriendList],List[models.FriendList],Long,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (currentCustomer,friends,pendingFriends,option,env) => apply(currentCustomer,friends,pendingFriends,option,env)

  def ref: this.type = this

}


}

/**/
object Chats extends Chats_Scope0.Chats
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/Chats.scala.html
                  HASH: 289ddc10823753ce09cbb4e2ce2a1853244ec822
                  MATRIX: 834->1|1086->157|1114->160|1157->195|1196->197|1224->199|1501->449|1521->460|1572->490|1674->565|1694->576|1745->606|1851->686|1892->718|1932->720|1965->726|2036->770|2050->775|2086->790|2142->816|2174->822|2213->852|2253->854|2286->860|2357->904|2371->909|2405->922|2457->944|2498->959|2522->974|2561->975|2594->982|2632->1004|2672->1006|2706->1013|2783->1063|2803->1074|2888->1138|2966->1189|3064->1278|3105->1280|3144->1291|3219->1339|3276->1375|3345->1426|3358->1431|3397->1432|3433->1441|3580->1557|3616->1566|3718->1641|3733->1647|3774->1667|3868->1731|3892->1738|3905->1743|3944->1744|3977->1751|4028->1786|4068->1788|4102->1795|4201->1867|4307->1963|4348->1965|4386->1975|4461->2023|4525->2065|4594->2116|4607->2121|4646->2122|4684->2132|4832->2249|4867->2257|4946->2309|4968->2322|5009->2342|5060->2366|5080->2377|5176->2451|5256->2503|5277->2514|5371->2586|5472->2657|5508->2663|5544->2672|5627->2725
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|45->14|45->14|45->14|46->15|46->15|46->15|49->18|49->18|49->18|50->19|51->20|51->20|51->20|53->22|54->23|54->23|54->23|55->24|56->25|56->25|56->25|58->27|65->34|65->34|65->34|66->35|66->35|66->35|67->36|68->37|68->37|68->37|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|75->44|76->45|78->47|78->47|78->47|82->51|83->52|83->52|83->52|84->53|84->53|84->53|85->54|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|90->59|92->61|93->62|95->64|95->64|95->64|96->65|96->65|96->65|96->65|96->65|96->65|99->68|100->69|102->71|109->78
                  -- GENERATED --
              */
          