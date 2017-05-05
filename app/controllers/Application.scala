package controllers

import play.api.mvc._
import javax.inject.{Inject,Singleton}

import models.{UserDB}
import play.api.i18n.{I18nSupport, MessagesApi}
import forms.UserForms

@Singleton
class Application @Inject() (val messagesApi: MessagesApi) (UserDB:UserDB,UserForms:UserForms) extends Controller with I18nSupport  {


  def index = Action { implicit request =>
    val user = request.session.get("username").flatMap(UserDB.findByUsername(_))

    if(user.isDefined){
      Redirect(routes.MessageController.list())
    } else {
      Redirect(routes.UserController.login())
    }

  }



}