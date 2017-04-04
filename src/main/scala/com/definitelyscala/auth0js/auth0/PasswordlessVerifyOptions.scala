package com.definitelyscala.auth0js.auth0

import scala.scalajs.js

@js.native
trait PasswordlessVerifyOptions extends js.Object {
  var connection: String = js.native
  var verificationCode: String = js.native
  var phoneNumber: String = js.native
  var email: String = js.native
}