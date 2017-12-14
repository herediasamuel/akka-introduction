package introducton.api.first

import javax.ws.rs.GET

import akka.actor.ActorRef
import akka.http.scaladsl.model.{HttpRequest, StatusCodes}
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.specs2.mutable.Specification
import org.specs2.mock.Mockito
import akka.http.scaladsl.testkit.ScalatestRouteTest
import org.mockito.Matchers
import org.scalatest.WordSpec
import org.scalatest.concurrent.ScalaFutures
import org.specs2.mutable.Specification

/**
  * Created by SmarClarity on 13-12-2017.
  */
@RunWith(classOf[JUnitRunner])
class WebServerTest extends WordSpec with Matchers with ScalaFutures with ScalatestRouteTest with Specification {

  override val userRegistryActor: ActorRef =

  lazy val routes = route


  "The authentication should " >> {

    "succeed if the user does have the right password" >> {

      val request = HttpRequest(uri = "/users")

      request ~> routes ~> check {
        status should ===(StatusCodes.OK)

    }

}
