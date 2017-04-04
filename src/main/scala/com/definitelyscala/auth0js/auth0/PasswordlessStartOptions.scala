package com.definitelyscala.auth0js.auth0

import scala.scalajs.js

@js.native
trait PasswordlessStartOptions extends js.Object {
  var connection: String = js.native
  var send: String = js.native
  var phoneNumber: String = js.native
  var email: String = js.native
  var authParams: js.Any = js.native
}