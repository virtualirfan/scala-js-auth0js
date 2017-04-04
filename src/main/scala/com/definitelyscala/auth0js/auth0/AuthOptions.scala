package com.definitelyscala.auth0js.auth0

import scala.scalajs.js

@js.native
trait AuthOptions extends js.Object {
  var domain: String = js.native
  var clientID: String = js.native
  var responseType: String = js.native
  var responseMode: String = js.native
  var redirectUri: String = js.native
  var scope: String = js.native
  var audience: String = js.native
  var leeway: Double = js.native
  var _disableDeprecationWarnings: Boolean = js.native
  var _sendTelemetry: Boolean = js.native
  var _telemetryInfo: js.Any = js.native
}