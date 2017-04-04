package com.definitelyscala.auth0js.auth0

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("auth0.Redirect")
class Redirect protected () extends js.Object {
  def this(client: js.Any, options: js.Any) = this()
  /**
   * Initializes the legacy Lock login flow in a popup
   *
   * @method loginWithCredentials
   * @param {Object} options
   * @param {Function} callback
   * @deprecated `webauth.popup.loginWithCredentials` will be soon deprecated, use `webauth.client.login` instead.
   */
  def loginWithCredentials(options: js.Any, callback: js.Any): Unit = js.native
  /**
   * Signs up a new user and automatically logs the user in after the signup.
   *
   * @method signupAndLogin
   * @param {Object} options: https://auth0.com/docs/api/authentication#!#post--dbconnections-signup
   * @param {Function} callback
   */
  def signupAndLogin(options: js.Any, callback: js.Any): Unit = js.native
}