
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object topic_Scope0 {
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

class topic extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[models.Topic,models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentTopic: models.Topic, user : models.users.User,env : play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.83*/("""
	"""),_display_(/*2.3*/main("Topic",user)/*2.21*/ {_display_(Seq[Any](format.raw/*2.23*/("""
"""),format.raw/*3.1*/("""<div class="col-sm-2">
</div>
	<div class="col-sm-8">
		<div class="row">
			
<div class="panel panel-default" style="margin-top:1em;">
<div class="panel-heading TextAlignCenter BreakWord" id="mediaTitleBanner">
<h4>"""),_display_(/*10.6*/currentTopic/*10.18*/.getName()),format.raw/*10.28*/("""</h4>
		</div>
	</div>
<a href=""""),_display_(/*13.11*/routes/*13.17*/.HomeController.addPost(currentTopic.getTopicId())),format.raw/*13.67*/(""""
 class="btn" id="ButtonsForum" style="margin:1em;">Add a Post</a>
	</div>

			"""),_display_(/*17.5*/for(c <- currentTopic.getPost()) yield /*17.37*/{_display_(Seq[Any](format.raw/*17.38*/("""
	
			"""),format.raw/*19.4*/("""<div class="panel panel-default" style="margin-bottom:1em;">
				<div class="panel-heading" id="mediaTitleBanner">
					<div class="row">
						<div class="col-sm-1">
							"""),_display_(/*23.9*/if(env.resource("public/images/userImages/"+c.getUser.getName()+".jpg").isDefined)/*23.91*/ {_display_(Seq[Any](format.raw/*23.93*/("""
							"""),format.raw/*24.8*/("""<img src="/assets/images/userImages/thumbnails/"""),_display_(/*24.56*/(c.getUser().getName()+".jpg")),format.raw/*24.86*/("""" class="img-thumbnail"/>
							""")))}/*25.10*/else/*25.15*/{_display_(Seq[Any](format.raw/*25.16*/("""
							"""),format.raw/*26.8*/("""<img src="/assets/images/userImages/thumbnails/default.png" class="img-thumbnail"/>
							""")))}),format.raw/*27.9*/("""						
						"""),format.raw/*28.7*/("""</div>

							<div class="col-sm-7 BreakWord">
							<h4 style="float:left;">  """),_display_(/*31.35*/c/*31.36*/.getUser().getName()),format.raw/*31.56*/(""" """),format.raw/*31.57*/("""</h4>
							</div>
								<br>
							<div class="col-sm-4 BreakWord">
							<h5 style="float:right;"> """),_display_(/*35.35*/c/*35.36*/.getPostDate()),format.raw/*35.50*/(""" """),format.raw/*35.51*/("""</h5>
							</div>
					</div>
			                </div>

					<div class="panel-body" id="mediaBorder">
					<div class="col-sm-9  BreakWord" >
						<p> """),_display_(/*42.12*/c/*42.13*/.getPostDescription()),format.raw/*42.34*/(""" """),format.raw/*42.35*/("""</p>
						
					</div>
				<div class="col-sm-3">
					"""),_display_(/*46.7*/if(user.getEmail == c.getUser.getEmail)/*46.46*/{_display_(Seq[Any](format.raw/*46.47*/("""
							"""),format.raw/*47.8*/("""<a href=""""),_display_(/*47.18*/routes/*47.24*/.HomeController.deletePost(c.getId() , currentTopic.getTopicId())),format.raw/*47.89*/("""" class="btn" id="ButtonsForum"style="margin:1em; 								float:right;">
										Delete</a>
					""")))}),format.raw/*49.7*/("""
				"""),format.raw/*50.5*/("""</div>

			</div>
			</div>
		""")))}),format.raw/*54.4*/("""


		


		"""),format.raw/*60.3*/("""</div>
<div class="col-sm-2">	


</div>
""")))}),format.raw/*65.2*/("""
"""))
      }
    }
  }

  def render(currentTopic:models.Topic,user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(currentTopic,user,env)

  def f:((models.Topic,models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (currentTopic,user,env) => apply(currentTopic,user,env)

  def ref: this.type = this

}


}

/**/
object topic extends topic_Scope0.topic
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/topic.scala.html
                  HASH: 5dab95dbe044e148e3ba44949db7832d4d594465
                  MATRIX: 790->1|966->82|994->85|1020->103|1059->105|1086->106|1329->323|1350->335|1381->345|1441->378|1456->384|1527->434|1634->515|1682->547|1721->548|1754->554|1955->729|2046->811|2086->813|2121->821|2196->869|2247->899|2300->934|2313->939|2352->940|2387->948|2509->1040|2549->1053|2658->1135|2668->1136|2709->1156|2738->1157|2872->1264|2882->1265|2917->1279|2946->1280|3130->1437|3140->1438|3182->1459|3211->1460|3294->1517|3342->1556|3381->1557|3416->1565|3453->1575|3468->1581|3554->1646|3684->1746|3716->1751|3777->1782|3814->1792|3885->1833
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|41->10|41->10|41->10|44->13|44->13|44->13|48->17|48->17|48->17|50->19|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|58->27|59->28|62->31|62->31|62->31|62->31|66->35|66->35|66->35|66->35|73->42|73->42|73->42|73->42|77->46|77->46|77->46|78->47|78->47|78->47|78->47|80->49|81->50|85->54|91->60|96->65
                  -- GENERATED --
              */
          