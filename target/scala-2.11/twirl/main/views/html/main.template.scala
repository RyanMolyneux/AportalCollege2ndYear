
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

     object main_Scope1 {
import controllers.security.LoginSignUpController
import controllers.security

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

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
					
					     <a href=""""),_display_(/*72.21*/routes/*72.27*/.HomeController.index()),format.raw/*72.50*/("""" alt="Home Link."><span class="glyphicon glyphicon-home" id="textDarkRed"></span></a>
					
                                        </li>
					
					"""),_display_(/*76.7*/if(user!=null)/*76.21*/ {_display_(Seq[Any](format.raw/*76.23*/("""
                                        """),format.raw/*77.41*/("""<li>

                                            """),_display_(/*79.46*/if(user.getRole() == "customer")/*79.78*/ {_display_(Seq[Any](format.raw/*79.80*/("""

                                               """),format.raw/*81.48*/("""<a href="" alt="Drop Down menu." id="textDarkRed" type="button" data-toggle="dropdown">More<span class="caret"></span>
                                            	<ul class="dropdown-menu">
							                        <li><a href=""""),_display_(/*83.46*/routes/*83.52*/.HomeController.findFriends()),format.raw/*83.81*/("""" id="textDarkRed" alt="Link to friend search page.">find friends</a></li>
							                        <li><a href=""""),_display_(/*84.46*/routes/*84.52*/.HomeController.Chat(0)),format.raw/*84.75*/("""" id="textDarkRed" alt="Link to chat page.">Chat</a></li>
							                        <li><a href=""""),_display_(/*85.46*/controllers/*85.57*/.security.routes.LoginSignUpController.logout),format.raw/*85.102*/("""" alt="Link to Sign Out." id="textDarkRed">Logout</a></li>
						                        </ul>
                                            """)))}/*87.47*/else/*87.52*/{_display_(Seq[Any](format.raw/*87.53*/("""
                                                    """),format.raw/*88.53*/("""<a href=""""),_display_(/*88.63*/controllers/*88.74*/.security.routes.LoginSignUpController.logout()),format.raw/*88.121*/("""" alt="Link to logout." id="textDarkRed">Logout</a>
                                            """)))}),format.raw/*89.46*/("""


                    """)))}),format.raw/*92.22*/("""
					"""),format.raw/*93.6*/("""</li>

                                    </ul>


                                </div>

                                <div class="col-sm-6" id="NavCentBar">

                                        <!---Nav Click Links--->
                                    <div class="col-sm-3">
                                    </div>

                                    <div class="col-sm-6">
                                        <ul class="nav navbar-nav">
                                            <li>
                                                <a href=""""),_display_(/*109.59*/routes/*109.65*/.HomeController.products()),format.raw/*109.91*/("""" id="textDarkRed">Products</a>
                                            </li>
                                            <li>
                                                <a href=""""),_display_(/*112.59*/routes/*112.65*/.HomeController.media()),format.raw/*112.88*/("""" id="textDarkRed">Media</a>
                                            </li>
                                            <li>
                                                <a href=""""),_display_(/*115.59*/routes/*115.65*/.HomeController.forum()),format.raw/*115.88*/("""" id="textDarkRed">Forum</a>
                                            </li>
                                        </ul>
                                    </div>




                                </div>
                                <div class="col-sm-2" id="NavRightBar">


                                        <!---Cart & SignUp,SignIn Nav Links--->
                                    <ul class="nav navbar-nav navbar-right">
                                        <li>
                                            <a href=""""),_display_(/*130.55*/routes/*130.61*/.ShoppingController.showBasket),format.raw/*130.91*/("""" alt="Cart Link."><span class="glyphicon glyphicon-shopping-cart" id="textDarkRed"></span></a>
                                        </li>

                                        <li>
					    """),_display_(/*134.11*/if(user == null)/*134.27*/ {_display_(Seq[Any](format.raw/*134.29*/("""
                                            """),format.raw/*135.45*/("""<a href=""""),_display_(/*135.55*/controllers/*135.66*/.security.routes.LoginSignUpController.login()),format.raw/*135.112*/("""" alt="SignUp&SignIn Link."><span class="glyphicon glyphicon-user" id="textDarkRed"></span></a>
					    """)))}/*136.12*/else/*136.17*/{_display_(Seq[Any](format.raw/*136.18*/("""
					    """),format.raw/*137.10*/("""<a href=""""),_display_(/*137.20*/controllers/*137.31*/.security.routes.LoginSignUpController.editProfile()),format.raw/*137.83*/("""" alt="Edit Profile Link."><span class="glyphicon glyphicon-user" id="textDarkRed"></span></a>
					    """)))}),format.raw/*138.11*/("""
                                        """),format.raw/*139.41*/("""</li>
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
                    <!---Right Side of Content Section for optional nav links--->
            	"""),_display_(/*164.15*/content),format.raw/*164.22*/("""
            """),format.raw/*165.13*/("""</div>
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
                    <a href=""""),_display_(/*185.31*/routes/*185.37*/.HomeController.userSupport()),format.raw/*185.66*/("""" alt="Link." id="FooterLink">
                        <p>User Support.</p>
                    </a>

                    <a href=""""),_display_(/*189.31*/routes/*189.37*/.HomeController.about()),format.raw/*189.60*/("""" alt="Link." id="FooterLink">
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
object main extends main_Scope0.main_Scope1.main
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/main.scala.html
                  HASH: 0de16527f28543882c908f2fae0d04f7f20d01cf
                  MATRIX: 871->81|1021->136|1049->138|1641->755|1678->765|1828->888|1843->894|1906->935|1994->996|2009->1002|2067->1038|3767->2711|3782->2717|3826->2740|4003->2891|4026->2905|4066->2907|4135->2948|4213->2999|4254->3031|4294->3033|4371->3082|4634->3318|4649->3324|4699->3353|4846->3473|4861->3479|4905->3502|5035->3605|5055->3616|5122->3661|5281->3802|5294->3807|5333->3808|5414->3861|5451->3871|5471->3882|5540->3929|5668->4026|5723->4050|5756->4056|6349->4621|6365->4627|6413->4653|6630->4842|6646->4848|6691->4871|6905->5057|6921->5063|6966->5086|7535->5627|7551->5633|7603->5663|7829->5861|7855->5877|7896->5879|7970->5924|8008->5934|8029->5945|8098->5991|8224->6098|8238->6103|8278->6104|8317->6114|8355->6124|8376->6135|8450->6187|8587->6292|8657->6333|9446->7094|9475->7101|9517->7114|10207->7776|10223->7782|10274->7811|10434->7943|10450->7949|10495->7972
                  LINES: 31->3|36->3|38->5|50->17|52->19|54->21|54->21|54->21|55->22|55->22|55->22|105->72|105->72|105->72|109->76|109->76|109->76|110->77|112->79|112->79|112->79|114->81|116->83|116->83|116->83|117->84|117->84|117->84|118->85|118->85|118->85|120->87|120->87|120->87|121->88|121->88|121->88|121->88|122->89|125->92|126->93|142->109|142->109|142->109|145->112|145->112|145->112|148->115|148->115|148->115|163->130|163->130|163->130|167->134|167->134|167->134|168->135|168->135|168->135|168->135|169->136|169->136|169->136|170->137|170->137|170->137|170->137|171->138|172->139|197->164|197->164|198->165|218->185|218->185|218->185|222->189|222->189|222->189
                  -- GENERATED --
              */
          