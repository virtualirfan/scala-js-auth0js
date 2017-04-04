package com.definitelyscala.auth0js.auth0

import scala.scalajs.js

@js.native
trait Auth0DecodedHash extends js.Object {
  var accessToken: String = js.native
  var idToken: String = js.native
  var idTokenPayload: js.Any = js.native
  var refreshToken: String = js.native
  var state: String = js.native
  var expiresIn: Double = js.native
  var tokenType: String = js.native
}