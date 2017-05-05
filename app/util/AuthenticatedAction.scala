package util

import javax.inject.Inject

import models._
import play.api.mvc._

import scala.concurrent.Future


class AuthenticatedAction @Inject() (UserDB:UserDB) extends ActionBuilder[AuthenticatedRequest] {

  def invokeBlock[A](
                      request: Request[A],
                      block: AuthenticatedRequest[A] => Future[Result]): Future[Result] = {
    request.session.get("username")
      .flatMap(UserDB.findByUsername(_))
      .map(user => block(new AuthenticatedRequest(user, request)))
      .getOrElse(Future.successful(Results.Forbidden))
  }
}
