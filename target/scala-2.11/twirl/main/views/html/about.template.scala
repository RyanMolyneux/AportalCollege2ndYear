
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object about_Scope0 {
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

class about extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("About", user)/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""
	"""),format.raw/*5.2*/("""<div class="col-sm-2">
	</div>
	<div class="col-sm-8">
	</div>

  <!-- HTML content for the index view -->
	    <div class="row">
	        <div class="col-sm-12">
	            <div class="col-sm-2">
	            </div>
	            <div class="col-sm-8">
	                <h2>About Us</h2>
	                <p>We are a website for fans of all things <a href="/manga.html" id="textDarkRed">Manga</a> and <a href="/anime" id="textDarkRed">Anime</a>, we provide access to anime and manga
                    available online aswell as allowing people to <a href="/products.html" id="textDarkRed">Purchase Products</a> related to anime and manga.</p>
 	               <p>We were founded in 2016 by a team of 4 people with the aim to make anime and manga more accessable to a wider audience.</p>
	                <p>We also strive to provide a sense of community for all users of our site with our <a href="/forum.html" id="textDarkRed">Forum</a> section allowing users to discuss anime, manga or anything else!</p>
	                <h3>Find us on social media!</h3>
	                <a href="https://www.facebook.com"><img src="facebook.png" alt="Facebook" style="width:10%"></a>
	                <a href="https://www.twitter.com"><img src="twitter.png" alt="Twitter" style="width:10%"></a>
	                <a href="https://www.instagram.com"><img src="insta.jpg" alt="Instagram" style="width:10%"></a>




            	</div>
            	<div class="col-sm-2">
            	</div>
            </div>
    	 </div>
    <!-- End of content for main -->
	</div>
	<div class="col-sm-2">
	</div>
""")))}),format.raw/*38.2*/("""
"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object about extends about_Scope0.about
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/about.scala.html
                  HASH: 12d12bdac2f2c303db9590b062ed761ebc47da06
                  MATRIX: 756->1|876->26|904->28|964->61|992->62|1038->81|1066->82|1094->83|1141->105|1168->124|1207->126|1235->128|2855->1718
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|69->38
                  -- GENERATED --
              */
          