
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object messages_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class messages extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[User,Seq[Message],UserDB,Flash,play.api.i18n.Messages,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user:User,messagelist:Seq[Message],UserDB:UserDB)(implicit flash:Flash, messages: play.api.i18n.Messages, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.132*/("""

"""),_display_(/*3.2*/main("Messages")/*3.18*/{_display_(Seq[Any](format.raw/*3.19*/("""
    """),format.raw/*4.5*/("""<div class="container messages">

        <a href=""""),_display_(/*6.19*/routes/*6.25*/.MessageController.create),format.raw/*6.50*/("""" class="btn-sm btn btn-primary ">New Message</a>
        <a href=""""),_display_(/*7.19*/routes/*7.25*/.UserController.logout),format.raw/*7.47*/("""" class="btn-sm btn btn-warning ">Logout</a>


        <table class="table">
            <thead >
                <tr>
                    <th>User</th>
                    <th>Time</th>
                    <th>Message</th>
                </tr>
            </thead>
            <tbody>
                 """),_display_(/*19.19*/for(m <- messagelist) yield /*19.40*/ {_display_(Seq[Any](format.raw/*19.42*/("""
                     """),format.raw/*20.22*/("""<tr>
                         <td>"""),_display_(/*21.31*/UserDB/*21.37*/.findById(m.user_id).get.username),format.raw/*21.70*/("""</td>
                         <td>"""),_display_(/*22.31*/m/*22.32*/.date.toString),format.raw/*22.46*/("""</td>
                         <td>"""),_display_(/*23.31*/m/*23.32*/.text),format.raw/*23.37*/("""</td>
                     </tr>
                 """)))}),format.raw/*25.19*/("""
            """),format.raw/*26.13*/("""</tbody>
        </table>
    </div>

""")))}))
      }
    }
  }

  def render(user:User,messagelist:Seq[Message],UserDB:UserDB,flash:Flash,messages:play.api.i18n.Messages,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(user,messagelist,UserDB)(flash,messages,request)

  def f:((User,Seq[Message],UserDB) => (Flash,play.api.i18n.Messages,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (user,messagelist,UserDB) => (flash,messages,request) => apply(user,messagelist,UserDB)(flash,messages,request)

  def ref: this.type = this

}


}

/**/
object messages extends messages_Scope0.messages
              /*
                  -- GENERATED --
                  DATE: Fri May 05 15:14:26 EDT 2017
                  SOURCE: /Users/casey/Documents/TheBoard/app/views/messages.scala.html
                  HASH: 52f2765ed087f8eb76dcadd95fd682b401557f6d
                  MATRIX: 594->1|820->131|848->134|872->150|910->151|941->156|1019->208|1033->214|1078->239|1172->307|1186->313|1228->335|1560->640|1597->661|1637->663|1687->685|1749->720|1764->726|1818->759|1881->795|1891->796|1926->810|1989->846|1999->847|2025->852|2107->903|2148->916
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|30->6|30->6|30->6|31->7|31->7|31->7|43->19|43->19|43->19|44->20|45->21|45->21|45->21|46->22|46->22|46->22|47->23|47->23|47->23|49->25|50->26
                  -- GENERATED --
              */
          