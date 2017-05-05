package controllers

import javax.inject.{Inject, Singleton}

import forms.{MessageFroms, UserForms}
import models.{Message, MessageDB, UserDB}
import java.time._
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc.Controller
import util.AuthenticatedAction

/**
  * Created by casey on 5/5/17.
  */
@Singleton()
class MessageController  @Inject() (val messagesApi: MessagesApi) (UserDB:UserDB,UserForms:UserForms, MessageDB:MessageDB, MessageForms:MessageFroms,AuthenticatedAction:AuthenticatedAction) extends Controller with I18nSupport{

  def add = AuthenticatedAction { implicit request =>
    Ok(views.html.addmessage(MessageForms.messagetext))
  }


  def create = AuthenticatedAction { implicit request =>
    MessageForms.messagetext.bindFromRequest.fold({ formWithErrors =>
      BadRequest(views.html.addmessage(formWithErrors))
    },{ messagetext =>
      MessageDB.create(Message(-1,messagetext,LocalDate.now,request.user.id))
      Redirect(routes.MessageController.list)

    })
  }

  def list = AuthenticatedAction {implicit request =>
    Ok(views.html.messages(request.user,MessageDB.getRecent20,UserDB))
  }
}
