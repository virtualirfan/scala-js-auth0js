package com.definitelyscala.auth0js.auth0

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("auth0.Popup")
class Popup protected () extends js.Object {
  def this(client: js.Any, options: js.Any) = this()
  /**
   * Initializes the popup window and returns the instance to be used later in order to avoid being blocked by the browser.
   *
   * @method preload
   * @param {Object} options: receives the window height and width and any other window feature to be sent to window.open
   */
  def preload(options: js.Any): js.Dynamic = js.native
  /**
   * Internal use.
   *
   * @method getPopupHandler
   */
  def getPopupHandler(options: js.Any, preload: Boolean): js.Dynamic = js.native
  /**
   * Opens in a popup the hosted login page (`/authorize`) in order to initialize a new authN/authZ transaction
   *
   * @method authorize
   * @param {Object} options: https://auth0.com/docs/api/authentication#!#get--authorize_db
   * @param {Function} callback
   */
  def authorize(options: js.Any, callback: js.Any): Unit = js.native
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
   * Verifies the passwordless TOTP and returns the requested token
   *
   * @method passwordlessVerify
   * @param {Object} options:
   * @param {Object} options.type: `sms` or `email`
   * @param {Object} options.phoneNumber: only if type = sms
   * @param {Object} options.email: only if type = email
   * @param {Object} options.connection: the connection name
   * @param {Object} options.verificationCode: the TOTP code
   * @param {Function} callback
   */
  def passwordlessVerify(options: js.Any, callback: js.Any): Unit = js.native
  /**
   * Signs up a new user and automatically logs the user in after the signup.
   *
   * @method signupAndLogin
   * @param {Object} options: https://auth0.com/docs/api/authentication#!#post--dbconnections-signup
   * @param {Function} callback
   */
  def signupAndLogin(options: js.Any, callback: js.Any): Unit = js.native
}