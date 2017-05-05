package forms

import play.api.data.Form
import play.api.data.Forms._

/**
  * Created by casey on 5/5/17.
  */
class MessageFroms {
  val messagetext = Form(
    single(
      "message" -> nonEmptyText
    )
  )
}
