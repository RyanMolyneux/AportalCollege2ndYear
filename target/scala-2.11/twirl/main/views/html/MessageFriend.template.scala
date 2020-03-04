
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object MessageFriend_Scope0 {
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

class MessageFriend extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[models.users.Customer,models.Chat,List[models.Message],Form[models.Message],play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentCustomer : models.users.Customer,currentChat : models.Chat,messages : List[models.Message],messageForm : Form[models.Message], env : play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.164*/("""

"""),_display_(/*3.2*/main("Chat",currentCustomer)/*3.30*/ {_display_(Seq[Any](format.raw/*3.32*/("""
	"""),format.raw/*4.2*/("""<div class="col-sm-2">
	</div>
	<div class="col-sm-8">
	 <div class="col-sm-12" id="findFriendsWrapper">
		<div id="findFriendsHeader">
		<h3> """),_display_(/*9.9*/currentChat/*9.20*/.getChatName()),format.raw/*9.34*/("""	"""),format.raw/*9.35*/("""</h3>	
		</div>
		
		<div id="findFriendsBody" >
			"""),_display_(/*13.5*/for(message <- messages) yield /*13.29*/ {_display_(Seq[Any](format.raw/*13.31*/("""
			  
			   """),format.raw/*15.7*/("""<div class="row">
				<div class="col-sm-12">			

					<div class="row" id="marginTop">
			  			<div class="col-sm-12 BreakWord" >
							"""),_display_(/*20.9*/if(env.resource("public/images/userImages/"+message.getCustomer().getName()+".jpg").isDefined)/*20.103*/ {_display_(Seq[Any](format.raw/*20.105*/("""

							"""),format.raw/*22.8*/("""<img src="/assets/images/userImages/thumbnails/"""),_display_(/*22.56*/(message.getCustomer().getName()+".jpg")),format.raw/*22.96*/("""" class="img-responsive img-thumbnail" """),_display_(/*22.136*/if(message.getCustomer().getName().equals(currentCustomer.getName()))/*22.205*/ {_display_(Seq[Any](format.raw/*22.207*/(""" """),format.raw/*22.208*/("""id="FloatRight" """)))}/*22.226*/else/*22.231*/{_display_(Seq[Any](format.raw/*22.232*/(""" """),format.raw/*22.233*/("""id="FloatLeft"""")))}),format.raw/*22.248*/("""/>
							""")))}/*23.10*/else/*23.15*/{_display_(Seq[Any](format.raw/*23.16*/("""
							"""),format.raw/*24.8*/("""<img src="/assets/images/userImages/thumbnails/default.png" class="img-responsive img-thumbnail" """),_display_(/*24.106*/if(message.getCustomer().getName().equals(currentCustomer.getName()))/*24.175*/ {_display_(Seq[Any](format.raw/*24.177*/(""" """),format.raw/*24.178*/("""id="FloatRight" """)))}/*24.196*/else/*24.201*/{_display_(Seq[Any](format.raw/*24.202*/(""" """),format.raw/*24.203*/("""id="FloatLeft"""")))}),format.raw/*24.218*/("""/>
""")))}),format.raw/*25.2*/("""
						
					
							"""),format.raw/*28.8*/("""<h4 """),_display_(/*28.13*/if(message.getCustomer().getName().equals(currentCustomer.getName()))/*28.82*/ {_display_(Seq[Any](format.raw/*28.84*/(""" """),format.raw/*28.85*/("""id="FloatRight" """)))}/*28.103*/else/*28.108*/{_display_(Seq[Any](format.raw/*28.109*/(""" """),format.raw/*28.110*/("""id="FloatLeft"""")))}),format.raw/*28.125*/(""">"""),_display_(/*28.127*/message/*28.134*/.getCustomer().getName()),format.raw/*28.158*/("""</h4>				
						</div>					
					</div>
					<div class="row">
						<div class="col-sm-12" """),_display_(/*32.31*/if(message.getCustomer().getName().equals(currentCustomer.getName()))/*32.100*/ {_display_(Seq[Any](format.raw/*32.102*/(""" """),format.raw/*32.103*/("""id="MessageBox" """)))}/*32.121*/else/*32.126*/{_display_(Seq[Any](format.raw/*32.127*/(""" """),format.raw/*32.128*/("""id="MessageBox2"""")))}),format.raw/*32.145*/(""">
				
							<p class="BreakWord" """),_display_(/*34.30*/if(message.getCustomer().getName().equals(currentCustomer.getName()))/*34.99*/ {_display_(Seq[Any](format.raw/*34.101*/(""" """),format.raw/*34.102*/("""id="TextAlignRight" """)))}/*34.124*/else/*34.129*/{_display_(Seq[Any](format.raw/*34.130*/(""" """),format.raw/*34.131*/("""id="TextAlignLeft"""")))}),format.raw/*34.150*/(""">"""),_display_(/*34.152*/message/*34.159*/.getMessageDesc()),format.raw/*34.176*/("""</p>
						</div>
					</div>
					<p """),_display_(/*37.10*/if(message.getCustomer().getName().equals(currentCustomer.getName()))/*37.79*/ {_display_(Seq[Any](format.raw/*37.81*/(""" """),format.raw/*37.82*/("""id="TextAlignRight" """)))}/*37.104*/else/*37.109*/{_display_(Seq[Any](format.raw/*37.110*/(""" """),format.raw/*37.111*/("""id="TextAlignLeft"""")))}),format.raw/*37.130*/(""">"""),_display_(/*37.132*/message/*37.139*/.getMessageTime()),format.raw/*37.156*/("""</p>
				</div>
			 
			</div>			
			
		      """)))}),format.raw/*42.10*/("""
		"""),format.raw/*43.3*/("""<form action=""""),_display_(/*43.18*/routes/*43.24*/.HomeController.MessageFriendSubmit(currentChat.getChatId())),format.raw/*43.84*/("""" method="POST" id="marginTop">		
			<div class="form-group">
				<textarea row="10" class="form-control" required name="messageDesc"></textarea>
			</div>
				<button type="submit" class="btn" id="smallButtons">Send</button>
		</form>			
			</div>
	  </div>	
			
	</div>
	
	<div class="col-sm-2">
	</div>


""")))}),format.raw/*58.2*/("""
"""))
      }
    }
  }

  def render(currentCustomer:models.users.Customer,currentChat:models.Chat,messages:List[models.Message],messageForm:Form[models.Message],env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(currentCustomer,currentChat,messages,messageForm,env)

  def f:((models.users.Customer,models.Chat,List[models.Message],Form[models.Message],play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (currentCustomer,currentChat,messages,messageForm,env) => apply(currentCustomer,currentChat,messages,messageForm,env)

  def ref: this.type = this

}


}

/**/
object MessageFriend extends MessageFriend_Scope0.MessageFriend
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/MessageFriend.scala.html
                  HASH: 36121634801c8427f60e65c3ae8b1e7d261e2468
                  MATRIX: 851->1|1109->163|1137->166|1173->194|1212->196|1240->198|1409->342|1428->353|1462->367|1490->368|1569->421|1609->445|1649->447|1689->460|1854->599|1958->693|1999->695|2035->704|2110->752|2171->792|2239->832|2318->901|2359->903|2389->904|2426->922|2440->927|2480->928|2510->929|2557->944|2587->956|2600->961|2639->962|2674->970|2800->1068|2879->1137|2920->1139|2950->1140|2987->1158|3001->1163|3041->1164|3071->1165|3118->1180|3152->1184|3200->1205|3232->1210|3310->1279|3350->1281|3379->1282|3416->1300|3430->1305|3470->1306|3500->1307|3547->1322|3577->1324|3594->1331|3640->1355|3760->1448|3839->1517|3880->1519|3910->1520|3947->1538|3961->1543|4001->1544|4031->1545|4080->1562|4143->1598|4221->1667|4262->1669|4292->1670|4333->1692|4347->1697|4387->1698|4417->1699|4468->1718|4498->1720|4515->1727|4554->1744|4620->1783|4698->1852|4738->1854|4767->1855|4808->1877|4822->1882|4862->1883|4892->1884|4943->1903|4973->1905|4990->1912|5029->1929|5107->1976|5137->1979|5179->1994|5194->2000|5275->2060|5614->2369
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|40->9|40->9|40->9|40->9|44->13|44->13|44->13|46->15|51->20|51->20|51->20|53->22|53->22|53->22|53->22|53->22|53->22|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|55->24|55->24|55->24|55->24|55->24|55->24|55->24|56->25|59->28|59->28|59->28|59->28|59->28|59->28|59->28|59->28|59->28|59->28|59->28|59->28|59->28|63->32|63->32|63->32|63->32|63->32|63->32|63->32|63->32|63->32|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|73->42|74->43|74->43|74->43|74->43|89->58
                  -- GENERATED --
              */
          