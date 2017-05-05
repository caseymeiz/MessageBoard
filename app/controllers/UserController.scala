package controllers

import javax.inject.{Inject, Singleton}

import forms.UserForms
import models.UserDB
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc.{Action, Controller}
import views.html
import util.AuthenticatedAction


/**
  * Created by casey on 5/5/17.
  */
@Singleton()
class UserController  @Inject() (val messagesApi: MessagesApi) (UserDB:UserDB,UserForms:UserForms,AuthenticatedAction:AuthenticatedAction) extends Controller with I18nSupport {

  def login = Action { implicit request =>
    Ok(views.html.login(UserForms.login))
  }


  def join =  Action {implicit request =>
    Ok(views.html.join(UserForms.join))
  }


  def create = Action {implicit request =>
    UserForms.join.bindFromRequest.fold(
      formWithErrors => BadRequest(html.join(formWithErrors)),{ user =>
        UserDB.create(user._1,user._2)
        Redirect(routes.MessageController.list()).withSession("username" -> user._1)
      }
    )
  }


  def authenticate = Action { implicit request =>
    UserForms.login.bindFromRequest.fold(
      formWithErrors => BadRequest(html.login(formWithErrors)),
      user => Redirect(routes.MessageController.list()).withSession("username" -> user._1)
    )
  }




  def logout = Action {
    Redirect(routes.UserController.login).withNewSession
  }
}
