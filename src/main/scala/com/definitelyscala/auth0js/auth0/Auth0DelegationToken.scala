package com.definitelyscala.auth0js.auth0

import scala.scalajs.js

@js.native
trait Auth0DelegationToken extends js.Object {
  /** The length of time in seconds the token is valid for. */
  var ExpiresIn: Double = js.native
  /** The JWT for delegated access.  */
  var idToken: String = js.native
  /** The type of token being returned. Possible values: "Bearer"  */
  var tokenType: String = js.native
}