package forms


import javax.inject.Inject

import models.UserDB
import play.api.data.Form
import play.api.data.Forms._


class UserForms @Inject()(UserDB:UserDB){
  val login = Form(
    tuple(
      "username" -> text,
      "password" -> text
    ) verifying ("Invalid username or password", result => result match {
      case (username, password) => UserDB.authenticate(username, password).isDefined
    })
  )

  val join = Form(
    tuple(
      "username" -> nonEmptyText,
      "password" -> text
    ) verifying("Username taken", fields => !UserDB.findByUsername(fields._1).isDefined)
  )


}
