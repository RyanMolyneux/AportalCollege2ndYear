
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addTopic_Scope0 {
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

     object addTopic_Scope1 {
import helper._

class addTopic extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[play.data.Form[models.Topic],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(addTopicForm: play.data.Form[models.Topic], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.98*/("""

"""),_display_(/*5.2*/main("Add Topic", user)/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
	"""),format.raw/*6.2*/("""<div class="col-sm-2">
	</div>
		<div class="col-sm-8">
			<div class="row">
	<h3>Add a new Topic</h3>
	
"""),_display_(/*12.2*/form(action = routes.HomeController.addTopicSubmit(), 'class -> "form-horizontal",
		'role->"form", 'enctype -> "multipart/form-data")/*13.52*/ {_display_(Seq[Any](format.raw/*13.54*/("""
	"""),_display_(/*14.3*/inputText(addTopicForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*14.68*/("""
"""),_display_(/*15.2*/inputText(addTopicForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*15.77*/("""
"""),_display_(/*16.2*/inputText(addTopicForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*16.91*/("""

			"""),format.raw/*18.4*/("""</div>
	<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Save" class="btn" id="ButtonsForum" style=" margin:1em;">
	<a href=""""),_display_(/*22.12*/routes/*22.18*/.HomeController.forum()),format.raw/*22.41*/("""" class="btn" id="ButtonsForum" style="margin:1em; float:right;">Cancel</a>
  </div>
		</div>
<div class="col-sm-2">
	</div>

	""")))}),format.raw/*28.3*/(""" """),format.raw/*28.4*/("""<!-- End Form definition -->

""")))}),format.raw/*30.2*/(""" """),format.raw/*30.3*/("""<!-- End of page content -->

"""))
      }
    }
  }

  def render(addTopicForm:play.data.Form[models.Topic],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(addTopicForm,user,env)

  def f:((play.data.Form[models.Topic],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (addTopicForm,user,env) => apply(addTopicForm,user,env)

  def ref: this.type = this

}


}
}

/**/
object addTopic extends addTopic_Scope0.addTopic_Scope1.addTopic
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/addTopic.scala.html
                  HASH: ed79f0c6804f64ce20722ab447fc29444b0f963f
                  MATRIX: 859->19|1050->115|1078->118|1109->141|1148->143|1176->145|1308->251|1451->385|1491->387|1520->390|1606->455|1634->457|1730->532|1758->534|1868->623|1900->628|2091->792|2106->798|2150->821|2308->949|2336->950|2397->981|2425->982
                  LINES: 30->3|35->3|37->5|37->5|37->5|38->6|44->12|45->13|45->13|46->14|46->14|47->15|47->15|48->16|48->16|50->18|54->22|54->22|54->22|60->28|60->28|62->30|62->30
                  -- GENERATED --
              */
          