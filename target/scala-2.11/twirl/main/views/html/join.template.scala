
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object join_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class join extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[scala.Tuple2[String, String]],Flash,play.api.i18n.Messages,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[(String,String)])(implicit flash: Flash, messages: play.api.i18n.Messages, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.112*/("""



"""),_display_(/*5.2*/main("Join")/*5.14*/{_display_(Seq[Any](format.raw/*5.15*/("""
    """),format.raw/*6.5*/("""<div class="container" id="login">
        <div class="col-md-4 col-md-offset-4">
            <div class="dialog">
                """),_display_(/*9.18*/helper/*9.24*/.form(routes.UserController.create )/*9.60*/{_display_(Seq[Any](format.raw/*9.61*/("""

                    """),format.raw/*11.21*/("""<h2 class="form-signin-heading">Create an account</h2>
                    """),_display_(/*12.22*/form/*12.26*/.globalError.map/*12.42*/ { error =>_display_(Seq[Any](format.raw/*12.53*/("""
                        """),format.raw/*13.25*/("""<p class="error">
                            """),_display_(/*14.30*/error/*14.35*/.message),format.raw/*14.43*/("""
                        """),format.raw/*15.25*/("""</p>
                    """)))}),format.raw/*16.22*/("""

                    """),_display_(/*18.22*/flash/*18.27*/.get("success").map/*18.46*/ { message =>_display_(Seq[Any](format.raw/*18.59*/("""
                        """),format.raw/*19.25*/("""<p class="success">
                            """),_display_(/*20.30*/message),format.raw/*20.37*/("""
                        """),format.raw/*21.25*/("""</p>
                    """)))}),format.raw/*22.22*/("""

                    """),format.raw/*24.21*/("""<div class="form-group">
                        """),_display_(/*25.26*/helper/*25.32*/.inputText(form("username"),'_label -> "Username",'_showConstraints -> false , 'class ->"form-control", 'placeholder ->"Username")),format.raw/*25.162*/("""
                        """),_display_(/*26.26*/helper/*26.32*/.inputText(form("password"),'type -> "password",'_label -> "Password",'_showConstraints -> false , 'class ->"form-control", 'placeholder ->"Password")),format.raw/*26.182*/("""
                    """),format.raw/*27.21*/("""</div>

                    <button class="btn btn-lg btn-primary btn-block" type="submit">Join</button>

                """)))}),format.raw/*31.18*/("""
                """),format.raw/*32.17*/("""<div id="loginLink"><a href=""""),_display_(/*32.47*/routes/*32.53*/.UserController.login()),format.raw/*32.76*/("""">already have an account?</a></div>


            </div>
        </div>
    </div>
""")))}),format.raw/*38.2*/("""
"""))
      }
    }
  }

  def render(form:Form[scala.Tuple2[String, String]],flash:Flash,messages:play.api.i18n.Messages,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(form)(flash,messages,request)

  def f:((Form[scala.Tuple2[String, String]]) => (Flash,play.api.i18n.Messages,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (form) => (flash,messages,request) => apply(form)(flash,messages,request)

  def ref: this.type = this

}


}

/**/
object join extends join_Scope0.join
              /*
                  -- GENERATED --
                  DATE: Fri May 05 14:57:39 EDT 2017
                  SOURCE: /Users/casey/Documents/TheBoard/app/views/join.scala.html
                  HASH: b2b73a208dd285c548d99b656c785a6df59cc1fd
                  MATRIX: 596->1|802->111|832->116|852->128|890->129|921->134|1079->266|1093->272|1137->308|1175->309|1225->331|1328->407|1341->411|1366->427|1415->438|1468->463|1542->510|1556->515|1585->523|1638->548|1695->574|1745->597|1759->602|1787->621|1838->634|1891->659|1967->708|1995->715|2048->740|2105->766|2155->788|2232->838|2247->844|2399->974|2452->1000|2467->1006|2639->1156|2688->1177|2842->1300|2887->1317|2944->1347|2959->1353|3003->1376|3118->1461
                  LINES: 20->1|25->1|29->5|29->5|29->5|30->6|33->9|33->9|33->9|33->9|35->11|36->12|36->12|36->12|36->12|37->13|38->14|38->14|38->14|39->15|40->16|42->18|42->18|42->18|42->18|43->19|44->20|44->20|45->21|46->22|48->24|49->25|49->25|49->25|50->26|50->26|50->26|51->27|55->31|56->32|56->32|56->32|56->32|62->38
                  -- GENERATED --
              */
          