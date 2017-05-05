package models

import java.time.LocalDate

/**
  * Created by casey on 5/5/17.
  */
case class Message(id:Int,text:String,date:LocalDate,user_id:Int)
