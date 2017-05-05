package models

import java.sql.ResultSet
import javax.inject.{Inject, Singleton}

import play.api.db.Database

/**
  * Created by casey on 5/5/17.
  */
@Singleton()
class UserDB @Inject() (db:Database){
  def toUser(rs:ResultSet):User = {
    User(rs.getInt("id"),rs.getString("username"))
  }


  def findByUsername(username:String):Option[User] = {
    db.withConnection { conn =>
      val preStmt = conn.prepareStatement("" +
        "SELECT * FROM users " +
        "WHERE username = ?")
      preStmt.setString(1, username)
      val rs = preStmt.executeQuery()

      // return user if found
      if (rs.next()) Option(toUser(rs)) else None

    }
  }

  def findById(id:Long):Option[User] = {
    db.withConnection { conn =>
      val preStmt = conn.prepareStatement("" +
        "SELECT * FROM users " +
        "WHERE id = ?")
      preStmt.setLong(1, id)
      val rs = preStmt.executeQuery()

      // return user if found
      if (rs.next()) Option(toUser(rs)) else None

    }
  }


  def authenticate(username: String, password: String): Option[User] = {
    db.withConnection { conn =>
      val preStmt = conn.prepareStatement("" +
        "SELECT * FROM users " +
        "WHERE username = ? AND password = ?")
      preStmt.setString(1, username)
      preStmt.setString(2, password)

      val rs = preStmt.executeQuery()

      // return user if found
      if (rs.next()) Option(toUser(rs)) else None
    }
  }


  def create(username:String,password:String): Option[User] = {
    db.withConnection { conn =>
      val preStmt = conn.prepareStatement("INSERT INTO users(username, password) VALUES (?,?)")
      preStmt.setString(1, username)
      preStmt.setString(2, password)

      preStmt.executeUpdate()

      val rs = preStmt.getGeneratedKeys()
      if(rs.next())
        findById(rs.getLong(1))
      else
        None
    }
  }


}
