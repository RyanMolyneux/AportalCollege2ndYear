
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object forum_Scope0 {
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

class forum extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[models.Topic],models.users.User,String,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(topics: List[models.Topic], user: models.users.User,filter:String, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.96*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Forum", user)/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
 <div class="col-sm-2">

 </div>
  <div class="col-sm-8">

<div class="row">
			<div class="col-sm-4">

			</div>
			<div class="col-sm-4" id="SearchBar">
					<!---Search Bar Form--->
				<div class="col-sm-12" id="setWidth">
					<form class="navbar-form" action=""""),_display_(/*18.41*/routes/*18.47*/.HomeController.forum()),format.raw/*18.70*/("""" method="get" id="marginLeft">
						<div class="input-group" >
							<input type="search" id="searchbox" name="filter" class="form-control" placeholder="Search">

							<div class="input-group-btn">
								<button type="submit" class="btn btn-default" id="textDarkBrown">
									<i class="glyphicon glyphicon-search">
									</i>
								</button>
							</div>
						</div>
					</form>
				</div>
			</div>
			<div class="col-sm-4">
			</div>
		</div>
          <!--forum page-->

               
                
                    <a href=""""),_display_(/*39.31*/routes/*39.37*/.HomeController.addTopic()),format.raw/*39.63*/("""" class="btn" id="ButtonsForum" style="margin:1em;">
                        Add a Topic
                    </a>

  """),_display_(/*43.4*/for(top <- topics) yield /*43.22*/ {_display_(Seq[Any](format.raw/*43.24*/("""

          """),format.raw/*45.11*/("""<div class="panel panel-default" style="margin: 1em;">
              <div class="panel-heading" id="mediaTitleBanner">
		<div class=" BreakWord" >
                   <a href=""""),_display_(/*48.30*/routes/*48.36*/.HomeController.topic(top.getTopicId)),format.raw/*48.73*/("""" style="text-decoration: none;" id="ButtonsForum">
                   <h4>"""),_display_(/*49.25*/top/*49.28*/.getName()),format.raw/*49.38*/("""</h4>
                   </a>
		</div>
              </div>

              <div class="panel-body" id="mediaBorder">
		<div class="col-sm-12  BreakWord" >
                  <p>"""),_display_(/*56.23*/top/*56.26*/.getDescription()),format.raw/*56.43*/("""</p>
		</div>
              </div>
          </div>



          """),_display_(/*63.12*/if(user.getRole == "admin")/*63.39*/ {_display_(Seq[Any](format.raw/*63.41*/("""
                  """),format.raw/*64.19*/("""<a href=""""),_display_(/*64.29*/routes/*64.35*/.HomeController.deleteTopic(top.getTopicId)),format.raw/*64.78*/("""" class="btn" id="ButtonsForum">DELETE</a>
          """)))}),format.raw/*65.12*/("""
  """)))}),format.raw/*66.4*/("""
  





         """),format.raw/*73.10*/("""</div>

  <div class="col-sm-2">

  </div>
""")))}),format.raw/*78.2*/("""

"""))
      }
    }
  }

  def render(topics:List[models.Topic],user:models.users.User,filter:String,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(topics,user,filter,env)

  def f:((List[models.Topic],models.users.User,String,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (topics,user,filter,env) => apply(topics,user,filter,env)

  def ref: this.type = this

}


}

/**/
object forum extends forum_Scope0.forum
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/forum.scala.html
                  HASH: 23417aaef225cfdf269c0f98cedbdfd53c0d8851
                  MATRIX: 803->1|992->95|1020->97|1080->130|1108->131|1154->150|1182->151|1210->152|1257->174|1284->193|1323->195|1352->198|1687->506|1702->512|1746->535|2328->1090|2343->1096|2390->1122|2534->1240|2568->1258|2608->1260|2648->1272|2851->1448|2866->1454|2924->1491|3027->1567|3039->1570|3070->1580|3274->1757|3286->1760|3324->1777|3417->1843|3453->1870|3493->1872|3540->1891|3577->1901|3592->1907|3656->1950|3741->2004|3775->2008|3821->2026|3895->2070
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|49->18|49->18|49->18|70->39|70->39|70->39|74->43|74->43|74->43|76->45|79->48|79->48|79->48|80->49|80->49|80->49|87->56|87->56|87->56|94->63|94->63|94->63|95->64|95->64|95->64|95->64|96->65|97->66|104->73|109->78
                  -- GENERATED --
              */
          