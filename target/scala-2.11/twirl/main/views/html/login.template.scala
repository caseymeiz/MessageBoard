
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[scala.Tuple2[String, String]],Flash,play.api.i18n.Messages,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[(String,String)])(implicit flash: Flash, messages: play.api.i18n.Messages, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.112*/("""



"""),_display_(/*5.2*/main("Login")/*5.15*/{_display_(Seq[Any](format.raw/*5.16*/("""
    """),format.raw/*6.5*/("""<div class="container" id="login">
        <div class="col-md-4 col-md-offset-4">
            <div class="dialog">
                """),_display_(/*9.18*/helper/*9.24*/.form(routes.UserController.authenticate )/*9.66*/{_display_(Seq[Any](format.raw/*9.67*/("""
                    """),format.raw/*10.21*/("""<h2 class="form-signin-heading">Please sign in</h2>
                    """),_display_(/*11.22*/form/*11.26*/.globalError.map/*11.42*/ { error =>_display_(Seq[Any](format.raw/*11.53*/("""
                        """),format.raw/*12.25*/("""<p class="error">
                            """),_display_(/*13.30*/error/*13.35*/.message),format.raw/*13.43*/("""
                        """),format.raw/*14.25*/("""</p>
                    """)))}),format.raw/*15.22*/("""

                    """),_display_(/*17.22*/flash/*17.27*/.get("success").map/*17.46*/ { message =>_display_(Seq[Any](format.raw/*17.59*/("""
                        """),format.raw/*18.25*/("""<p class="success">
                            """),_display_(/*19.30*/message),format.raw/*19.37*/("""
                        """),format.raw/*20.25*/("""</p>
                    """)))}),format.raw/*21.22*/("""

                    """),format.raw/*23.21*/("""<div class="form-group">
                        """),_display_(/*24.26*/helper/*24.32*/.inputText(form("username"),'_label -> "Username",'_showConstraints -> false , 'class ->"form-control", 'placeholder ->"Username")),format.raw/*24.162*/("""
                        """),_display_(/*25.26*/helper/*25.32*/.inputText(form("password"),'type -> "password",'_label -> "Password",'_showConstraints -> false , 'class ->"form-control", 'placeholder ->"Password")),format.raw/*25.182*/("""
                    """),format.raw/*26.21*/("""</div>

                    <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
                """)))}),format.raw/*29.18*/("""
                """),format.raw/*30.17*/("""<div id="createAccount">or <a href=""""),_display_(/*30.54*/routes/*30.60*/.UserController.join()),format.raw/*30.82*/("""">create an account</a></div>

            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(form:Form[scala.Tuple2[String, String]],flash:Flash,messages:play.api.i18n.Messages,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(form)(flash,messages,request)

  def f:((Form[scala.Tuple2[String, String]]) => (Flash,play.api.i18n.Messages,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (form) => (flash,messages,request) => apply(form)(flash,messages,request)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Fri May 05 14:52:09 EDT 2017
                  SOURCE: /Users/casey/Documents/TheBoard/app/views/login.scala.html
                  HASH: ab294214b1a8f10a1f62e34a25f2ee3637dba3d6
                  MATRIX: 598->1|804->111|834->116|855->129|893->130|924->135|1082->267|1096->273|1146->315|1184->316|1233->337|1333->410|1346->414|1371->430|1420->441|1473->466|1547->513|1561->518|1590->526|1643->551|1700->577|1750->600|1764->605|1792->624|1843->637|1896->662|1972->711|2000->718|2053->743|2110->769|2160->791|2237->841|2252->847|2404->977|2457->1003|2472->1009|2644->1159|2693->1180|2849->1305|2894->1322|2958->1359|2973->1365|3016->1387
                  LINES: 20->1|25->1|29->5|29->5|29->5|30->6|33->9|33->9|33->9|33->9|34->10|35->11|35->11|35->11|35->11|36->12|37->13|37->13|37->13|38->14|39->15|41->17|41->17|41->17|41->17|42->18|43->19|43->19|44->20|45->21|47->23|48->24|48->24|48->24|49->25|49->25|49->25|50->26|53->29|54->30|54->30|54->30|54->30
                  -- GENERATED --
              */
          