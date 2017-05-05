
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addmessage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class addmessage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[String],Flash,play.api.i18n.Messages,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[(String)])(implicit flash: Flash, messages: play.api.i18n.Messages, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.105*/("""

"""),_display_(/*3.2*/main("New Message")/*3.21*/{_display_(Seq[Any](format.raw/*3.22*/("""
    """),format.raw/*4.5*/("""<div class="container" id="login">
        <div class="col-md-6 col-md-offset-3">
            <div class="dialog">
    """),_display_(/*7.6*/helper/*7.12*/.form(routes.MessageController.create )/*7.51*/{_display_(Seq[Any](format.raw/*7.52*/("""

        """),format.raw/*9.9*/("""<h2 >Create message</h2>
        """),_display_(/*10.10*/form/*10.14*/.globalError.map/*10.30*/ { error =>_display_(Seq[Any](format.raw/*10.41*/("""
            """),format.raw/*11.13*/("""<p class="error">
                """),_display_(/*12.18*/error/*12.23*/.message),format.raw/*12.31*/("""
            """),format.raw/*13.13*/("""</p>
        """)))}),format.raw/*14.10*/("""



        """),format.raw/*18.9*/("""<div class="form-group">
            """),_display_(/*19.14*/helper/*19.20*/.textarea(form("message"),'rows -> "8",'_label -> "Message",'_showConstraints -> false , 'class ->"form-control", 'placeholder ->"Enter message")),format.raw/*19.165*/("""
        """),format.raw/*20.9*/("""</div>

        <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
    """)))}),format.raw/*23.6*/("""

    """),format.raw/*25.5*/("""</div>
    </div>
    </div>
""")))}))
      }
    }
  }

  def render(form:Form[String],flash:Flash,messages:play.api.i18n.Messages,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(form)(flash,messages,request)

  def f:((Form[String]) => (Flash,play.api.i18n.Messages,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (form) => (flash,messages,request) => apply(form)(flash,messages,request)

  def ref: this.type = this

}


}

/**/
object addmessage extends addmessage_Scope0.addmessage
              /*
                  -- GENERATED --
                  DATE: Fri May 05 15:01:34 EDT 2017
                  SOURCE: /Users/casey/Documents/TheBoard/app/views/addmessage.scala.html
                  HASH: 12eac4b62f63d18f4e6b93c1086dcf79eaa91e9e
                  MATRIX: 586->1|785->104|813->107|840->126|878->127|909->132|1054->252|1068->258|1115->297|1153->298|1189->308|1250->342|1263->346|1288->362|1337->373|1378->386|1440->421|1454->426|1483->434|1524->447|1569->461|1608->473|1673->511|1688->517|1855->662|1891->671|2021->771|2054->777
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|31->7|31->7|31->7|31->7|33->9|34->10|34->10|34->10|34->10|35->11|36->12|36->12|36->12|37->13|38->14|42->18|43->19|43->19|43->19|44->20|47->23|49->25
                  -- GENERATED --
              */
          