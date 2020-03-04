
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminMain_Scope0 {
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

     object adminMain_Scope1 {
import controllers.security.LoginSignUpController
import controllers.security

class adminMain extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.57*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang="en-IE">
    <head>
        <title>Anime</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width , initial-scale=1">
        <link rel="stylesheet" media="screen" href="base.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


        """),format.raw/*17.62*/("""

        """),format.raw/*19.9*/("""<meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" media="screen" href=""""),_display_(/*21.54*/routes/*21.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*21.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*22.59*/routes/*22.65*/.Assets.versioned("images/icon.png")),format.raw/*22.101*/("""">







    </head>
    <body>

        <div class="jumbotron" id="Title">
            <img src="/assets/images/logos/3.png" alt="logo name." id="logoIcon">
            <img src="/assets/images/logos/2.png" alt="logo icon"  id="logoName">
        </div>

            <!---Container & Structure for the Content of the page.--->
        <div class="container-fluid">
            <div class="row">
                    <!---Left hand Side of Container.--->
                <div class="col-sm-2" >

                </div>

                    <!---Center of Container.--->
                <div class="col-sm-8">

                        <!---Navigation Links--->
                    <div class="navbar-header" id="BackgroundDarkGrey">

                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#NavbarResponsive">

                            <span class="glyphicon glyphicon-th-list" id="textDarkRed"></span>

                        </button>

                    </div>
                        <!---Start of Mobile Friendly collapse Navbar--->
                    <div class="collapse navbar-collapse" id="NavbarResponsive" >
                        <div class="row">
                            <nav class="navbar">

                                    <!---This is Used to Restructure the Navbar for Mobile Users.--->
                                <div class="col-sm-1">
                                </div>
                                <div class="col-sm-2" id="NavLeftBar">
                                    <ul class="nav navbar-nav">
                                        <li>
                                            <a href=""""),_display_(/*70.55*/controllers/*70.66*/.routes.AdminController.indexAdmin()),format.raw/*70.102*/("""" alt="Home Link."><span class="glyphicon glyphicon-home" id="textDarkRed"></span></a>
                                        </li>
                                        <li>
                                            <a href=""""),_display_(/*73.55*/controllers/*73.66*/.security.routes.LoginSignUpController.logout),format.raw/*73.111*/("""" alt="Link to Sign Out." id="textDarkRed">Logout</a>
                                        </li>
                                    </ul>


                                </div>

                                <div class="col-sm-6" id="NavCentBar">

                                        <!---Nav Click Links--->
                                    <div class="col-sm-3">
                                    </div>

                                    <div class="col-sm-6">
                                        <ul class="nav navbar-nav">
                                            <li>
                                                <a href=""""),_display_(/*89.59*/routes/*89.65*/.HomeController.products()),format.raw/*89.91*/("""" id="textDarkRed">Products</a>
                                            </li>
                                            <li>
                                                <a href=""""),_display_(/*92.59*/routes/*92.65*/.HomeController.media()),format.raw/*92.88*/("""" id="textDarkRed">Media</a>
                                            </li>
                                            <li>
                                                <a href=""""),_display_(/*95.59*/routes/*95.65*/.HomeController.forum()),format.raw/*95.88*/("""" id="textDarkRed">Forum</a>
                                            </li>
                                        </ul>
                                    </div>




                                </div>
                                <div class="col-sm-2" id="NavRightBar">


                                        <!---Cart & SignUp,SignIn Nav Links--->
                                    <ul class="nav navbar-nav navbar-right">
                                        <li>
                                            <a href="" alt="Cart Link."><span class="glyphicon glyphicon-shopping-cart" id="textDarkRed"></span></a>
                                        </li>

                                        <li>
                                            <a href=""""),_display_(/*114.55*/controllers/*114.66*/.security.routes.LoginSignUpController.login()),format.raw/*114.112*/("""" alt="SignUp&SignIn Link."><span class="glyphicon glyphicon-user" id="textDarkRed"></span></a>
                                        </li>
                                    </ul>

                                </div>
                                <div class="col-sm-1">
                                </div>

                                    <!---End of Row--->
                            </nav>
                        </div>
                            <!---End of Mobile Friendly collapse Navbar--->
                    </div>

                </div>

                    <!---Right hand Side of Container.--->
                <div class="col-sm-2">
                </div>
            </div>
                <!---Start of Content addition Section--->
            <div class="row">
        """),_display_(/*136.10*/content),format.raw/*136.17*/("""
            """),format.raw/*137.13*/("""</div>
                <!---End of Content addition Section--->

                <!---End of Page Links Support/About Us and Others Such as Social Media--->


            <div class="row">
                <div class="col-sm-2">
                </div>
                <div class="col-sm-8" id="FooterTop">
                    <p>www.<span id="textLightRed">A</span>portal.ie</p>
                </div>
                <div class="col-sm-2">
                </div>
            </div>
            <div class="row">
                <div class="col-sm-2">

                </div>
                <div class="col-sm-8" id="FooterBottom">
                    <a href=""""),_display_(/*157.31*/routes/*157.37*/.HomeController.userSupport()),format.raw/*157.66*/("""" alt="Link." id="FooterLink">
                        <p>User Support.</p>
                    </a>

                    <a href=""""),_display_(/*161.31*/routes/*161.37*/.HomeController.about()),format.raw/*161.60*/("""" alt="Link." id="FooterLink">
                        <p>About Us.</p>
                    </a>
                </div>
                <div class="col-sm-2">
                </div>
            </div>

        </div>
            <!---DIV above is the end of the Container.--->
    </body>
</html>


"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}
}

/**/
object adminMain extends adminMain_Scope0.adminMain_Scope1.adminMain
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/admin/adminMain.scala.html
                  HASH: 4ba44a04580fdaf817cce7866e0e97a052ff43f3
                  MATRIX: 892->81|1042->136|1070->138|1662->755|1699->765|1849->888|1864->894|1927->935|2015->996|2030->1002|2088->1038|3809->2732|3829->2743|3887->2779|4146->3011|4166->3022|4233->3067|4918->3725|4933->3731|4980->3757|5196->3946|5211->3952|5255->3975|5468->4161|5483->4167|5527->4190|6337->4972|6358->4983|6427->5029|7262->5836|7291->5843|7333->5856|8023->6518|8039->6524|8090->6553|8250->6685|8266->6691|8311->6714
                  LINES: 31->3|36->3|38->5|50->17|52->19|54->21|54->21|54->21|55->22|55->22|55->22|103->70|103->70|103->70|106->73|106->73|106->73|122->89|122->89|122->89|125->92|125->92|125->92|128->95|128->95|128->95|147->114|147->114|147->114|169->136|169->136|170->137|190->157|190->157|190->157|194->161|194->161|194->161
                  -- GENERATED --
              */
          