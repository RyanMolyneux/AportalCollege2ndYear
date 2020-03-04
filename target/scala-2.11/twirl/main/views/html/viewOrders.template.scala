
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object viewOrders_Scope0 {
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

class viewOrders extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

"""),_display_(/*3.2*/main("viewOrders",customer)/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    """),format.raw/*4.5*/("""<div class="col-sm-2">
    </div>
    <div class="col-sm-8">
        <div class="table-responsive">
            """),_display_(/*8.14*/for( order <- customer.getOrders()) yield /*8.49*/{_display_(Seq[Any](format.raw/*8.50*/("""
            """),format.raw/*9.13*/("""<table class="table table-bordered table-condensed">
                <thead>
                    <tr>
                        <th>Order Date</th>
                        <th>Items Ordered</th>
                    </tr>
                </thead>
                <tbody>
			
		"""),_display_(/*18.4*/for(item <- order.getItems()) yield /*18.33*/ {_display_(Seq[Any](format.raw/*18.35*/("""
                    """),format.raw/*19.21*/("""<tr>
                        <td>"""),_display_(/*20.30*/order/*20.35*/.getOrderDate()),format.raw/*20.50*/("""</td>
                        <td>"""),_display_(/*21.30*/item/*21.34*/.getProduct().getName()),format.raw/*21.57*/("""</td>
                    </tr>
		""")))}),format.raw/*23.4*/("""
                """),format.raw/*24.17*/("""</tbody>
            </table>
            """)))}),format.raw/*26.14*/("""
        """),format.raw/*27.9*/("""</div>
    </div>
    <div class="col-sm-2">
    </div>
""")))}),format.raw/*31.2*/("""
"""))
      }
    }
  }

  def render(customer:models.users.Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((models.users.Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


}

/**/
object viewOrders extends viewOrders_Scope0.viewOrders
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/viewOrders.scala.html
                  HASH: 3243e7314f852fa80dc042b3e7bd432fd316e688
                  MATRIX: 770->1|898->34|926->37|961->64|1000->66|1031->71|1170->184|1220->219|1258->220|1298->233|1599->508|1644->537|1684->539|1733->560|1794->594|1808->599|1844->614|1906->649|1919->653|1963->676|2028->711|2073->728|2147->771|2183->780|2270->837
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|39->8|39->8|39->8|40->9|49->18|49->18|49->18|50->19|51->20|51->20|51->20|52->21|52->21|52->21|54->23|55->24|57->26|58->27|62->31
                  -- GENERATED --
              */
          