
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminAdvert_Scope0 {
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

class adminAdvert extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[models.Advert],models.users.Admin,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(adverts : List[models.Advert],admin : models.users.Admin,env : play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.87*/("""

"""),_display_(/*3.2*/main("Admin Advert",admin)/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""
	"""),format.raw/*4.2*/("""<div class="col-sm-2">
	</div>
	<div class="col-sm-8">
		<div class="col-sm-1">
		</div>
		<div id="adminAdvertWrapper" class="col-sm-10">
			
			<div id="adminAdvertHeader" >
				<h2> Edit Advertisements </h2>			
			</div>
			<div id="adminAdvertBody">
				"""),_display_(/*15.6*/if(flash.containsKey("success"))/*15.38*/ {_display_(Seq[Any](format.raw/*15.40*/("""
					"""),format.raw/*16.6*/("""<div class="alert alert-success">
					"""),_display_(/*17.7*/flash/*17.12*/.get("success")),format.raw/*17.27*/("""					
					"""),format.raw/*18.6*/("""</div>				
				""")))}),format.raw/*19.6*/("""
				"""),format.raw/*20.5*/("""<table class="table table-bordered table-hover table-condensed">	
					<thead>
						<tr>
							<th>
							Advert ID
							</th>
							<th>
							Advert Name
							</th>
							<th>
							Advert Admin
							</th>
							<th>
							Date Added
							</th>
							<th>
							Remove Advert
							</th>
							
						</tr>
					<thead>
					<tbody>
						"""),_display_(/*42.8*/for(advert <- adverts) yield /*42.30*/ {_display_(Seq[Any](format.raw/*42.32*/("""
						"""),format.raw/*43.7*/("""<tr>
							<td>
							"""),_display_(/*45.9*/advert/*45.15*/.getAdvertId()),format.raw/*45.29*/("""
							"""),format.raw/*46.8*/("""</td>
							<td>
							"""),_display_(/*48.9*/advert/*48.15*/.getAdvertName()),format.raw/*48.31*/("""
							"""),format.raw/*49.8*/("""</td>
							<td>
							"""),_display_(/*51.9*/advert/*51.15*/.getAdvertAdmin().getName()),format.raw/*51.42*/("""
							"""),format.raw/*52.8*/("""</td>
							<td>
							"""),_display_(/*54.9*/advert/*54.15*/.getAdvertDateAdded()),format.raw/*54.36*/("""
							"""),format.raw/*55.8*/("""</td>
							<td>
							<a href=""""),_display_(/*57.18*/routes/*57.24*/.AdminController.deleteAdvert(advert.getAdvertId())),format.raw/*57.75*/("""" alt="Link to delete advert" class="btn-xs btn-danger">
							<span class="glyphicon glyphicon-trash"> </span>
							</a>							
							</td>
						</tr>
						""")))}),format.raw/*62.8*/("""
					"""),format.raw/*63.6*/("""</tbody>
				</table>
				<a href=""""),_display_(/*65.15*/routes/*65.21*/.AdminController.addAdvert()),format.raw/*65.49*/("""" id="Buttons" class="btn">Add Advert</a>
			</div>
		</div>	
		<div class="col-sm-1">
		</div>
	</div>
	<div class="col-sm-2">
	</div>
""")))}),format.raw/*73.2*/("""
"""))
      }
    }
  }

  def render(adverts:List[models.Advert],admin:models.users.Admin,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(adverts,admin,env)

  def f:((List[models.Advert],models.users.Admin,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (adverts,admin,env) => apply(adverts,admin,env)

  def ref: this.type = this

}


}

/**/
object adminAdvert extends adminAdvert_Scope0.adminAdvert
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/admin/adminAdvert.scala.html
                  HASH: 60c916d6888b65f1b05f9875cf9fb156f7840036
                  MATRIX: 816->1|996->86|1024->89|1058->115|1097->117|1125->119|1410->378|1451->410|1491->412|1524->418|1590->458|1604->463|1640->478|1678->489|1724->505|1756->510|2145->873|2183->895|2223->897|2257->904|2308->929|2323->935|2358->949|2393->957|2445->983|2460->989|2497->1005|2532->1013|2584->1039|2599->1045|2647->1072|2682->1080|2734->1106|2749->1112|2791->1133|2826->1141|2888->1176|2903->1182|2975->1233|3169->1397|3202->1403|3265->1439|3280->1445|3329->1473|3496->1610
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|50->19|51->20|73->42|73->42|73->42|74->43|76->45|76->45|76->45|77->46|79->48|79->48|79->48|80->49|82->51|82->51|82->51|83->52|85->54|85->54|85->54|86->55|88->57|88->57|88->57|93->62|94->63|96->65|96->65|96->65|104->73
                  -- GENERATED --
              */
          