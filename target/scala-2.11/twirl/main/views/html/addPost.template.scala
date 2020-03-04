
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addPost_Scope0 {
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

class addPost extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[models.PostForm],models.Topic,models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(addPostForm: Form[models.PostForm],currentTopic : models.Topic, user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.118*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Post", user)/*5.24*/ {_display_(Seq[Any](format.raw/*5.26*/("""

"""),format.raw/*7.1*/("""<!-- Use the views.html.helpers package to create the form -->
	<div class="col-sm-2">
	</div>
		<div class="col-sm-8">
			<div class="row">
<h3>Add a new Post</h3>
<form action=""""),_display_(/*13.16*/routes/*13.22*/.HomeController.addPostSubmit()),format.raw/*13.53*/("""" method="POST">
<textarea row="10" name="postDescription" class="form-control" placeholder="Enter post..."> </textarea>
<input type="hidden" name="postTopicId" value=""""),_display_(/*15.49*/currentTopic/*15.61*/.getTopicId()),format.raw/*15.74*/("""">
<input type="hidden" name="email" value=""""),_display_(/*16.43*/currentTopic/*16.55*/.getUser()),format.raw/*16.65*/("""">

			</div>
		

	
		
<!-- submit button -->
<div class="actions">
	<input type="submit" value="Save" class="btn" id="ButtonsForum" style="float:left;margin:1em;">
	<a href=""""),_display_(/*26.12*/routes/*26.18*/.HomeController.topic(currentTopic.getTopicId())),format.raw/*26.66*/("""" class="btn" id="ButtonsForum" style="margin:1em;">
	Cancel</a>
</div>	
		</div>
	<div class="col-sm-2">
	</div>

</form>
<!-- End Form definition -->

""")))}),format.raw/*36.2*/(""" """),format.raw/*36.3*/("""<!-- End of page content -->



"""))
      }
    }
  }

  def render(addPostForm:Form[models.PostForm],currentTopic:models.Topic,user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(addPostForm,currentTopic,user,env)

  def f:((Form[models.PostForm],models.Topic,models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (addPostForm,currentTopic,user,env) => apply(addPostForm,currentTopic,user,env)

  def ref: this.type = this

}


}

/**/
object addPost extends addPost_Scope0.addPost
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/addPost.scala.html
                  HASH: 6eda158ff4406b4ad84d9faf681a52c655c44a21
                  MATRIX: 816->1|1043->117|1071->136|1098->138|1128->160|1167->162|1195->164|1402->344|1417->350|1469->381|1665->550|1686->562|1720->575|1792->620|1813->632|1844->642|2047->818|2062->824|2131->872|2315->1026|2343->1027
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|37->7|43->13|43->13|43->13|45->15|45->15|45->15|46->16|46->16|46->16|56->26|56->26|56->26|66->36|66->36
                  -- GENERATED --
              */
          