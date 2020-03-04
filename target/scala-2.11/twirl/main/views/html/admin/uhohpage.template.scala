
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object uhohpage_Scope0 {
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

class uhohpage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en-IE">

	<head>
		<title>Uh Oh</title>
		  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  		  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  		  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>	
	</head>
	<body>
		
			"""),_display_(/*12.5*/if(flash.containsKey("exception"))/*12.39*/ {_display_(Seq[Any](format.raw/*12.41*/("""
			"""),format.raw/*13.4*/("""<div class="jumbotron">			
			 	<h2 style="text-align:center;">"""),_display_(/*14.38*/flash/*14.43*/.get("exception")),format.raw/*14.60*/("""</h2>
			</div>
			""")))}),format.raw/*16.5*/("""
		
		
	"""),format.raw/*19.2*/("""</body>
</html>	
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object uhohpage extends uhohpage_Scope0.uhohpage
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/admin/uhohpage.scala.html
                  HASH: e89f3be7bb8bc8e7756f0c2da1761a13e7b10480
                  MATRIX: 839->0|1256->391|1299->425|1339->427|1370->431|1461->495|1475->500|1513->517|1563->537|1598->545
                  LINES: 32->1|43->12|43->12|43->12|44->13|45->14|45->14|45->14|47->16|50->19
                  -- GENERATED --
              */
          