package models

import java.sql.{Date, ResultSet}
import javax.inject.{Inject, Singleton}

import play.api.db.Database

import scala.collection.mutable.{ArrayBuffer, ListBuffer}
/**
  * Created by casey on 5/5/17.
  */

@Singleton()
class MessageDB  @Inject() (db:Database){

  def toMessage(rs:ResultSet):Message = {
    Message(rs.getInt("id"),rs.getString("message"),rs.getDate("time").toLocalDate,rs.getInt("user_id"))
  }

  def create(message:Message) = {
    db.withConnection { conn =>
      val preStmt = conn.prepareStatement("" +
        "INSERT INTO messages" +
        "   (user_id," +
        "   message," +
        "   time)" +
        "Values" +
        "   (?,?,?)")
      preStmt.setInt(1,message.user_id)
      preStmt.setString(2,message.text)
      preStmt.setDate(3,Date.valueOf(message.date))

      preStmt.execute()
    }
  }


  def getRecent20:Seq[Message]= {
    val messages = ListBuffer[Message]()

    db.withConnection { conn =>
      val stmt = conn.createStatement
      val rs = stmt.executeQuery("SELECT * FROM messages ORDER BY id DESC LIMIT 20")

      while (rs.next()) {
        messages += toMessage(rs)
      }
    }
    return messages
  }


}
