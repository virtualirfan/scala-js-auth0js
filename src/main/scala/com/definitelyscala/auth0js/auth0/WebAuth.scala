package com.definitelyscala.auth0js.auth0

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("auth0.WebAuth")
class WebAuth protected () extends js.Object {
  def this(options: AuthOptions) = this()
  var client: Authentication = js.native
  var popup: Popup = js.native
  var redirect: Redirect = js.native
  /**
   * Redirects to the hosted login page (`/authorize`) in order to initialize a new authN/authZ transaction
   *
   * @method authorize
   * @param {Object} options: https://auth0.com/docs/api/authentication#!#get--authorize_db
   */
  def authorize(options: js.Any): Unit = js.native
  /**
   * Parse the url hash and extract the returned tokens depending on the transaction.
   *
   * Only validates id_tokens signed by Auth0 using the RS256 algorithm using the public key exposed
   * by the `/.well-known/jwks.json` endpoint. Id tokens signed with other algorithms will not be
   * accepted.
   *
   * @method parseHash
   * @param {Object} options:
   * @param {String} options.state [OPTIONAL] to verify the response
   * @param {String} options.nonce [OPTIONAL] to verify the id_token
   * @param {String} options.hash [OPTIONAL] the url hash. If not provided it will extract from window.location.hash
   * @param {Function} callback: any(err, token_payload)
   */
  def parseHash(options: js.Any, callback: js.Function2[Auth0Error, js.Any, Any]): Unit = js.native
  /**
   * Decodes the id_token and verifies  the nonce.
   *
   * @method validateToken
   * @param {String} token
   * @param {String} state
   * @param {String} nonce
   * @param {Function} callback: function(err, {payload, transaction})
   */
  def validateToken(token: String, state: String, nonce: String, callback: js.Any): Unit = js.native
  /**
   * Executes a silent authentication transaction under the hood in order to fetch a new token.
   *
   * @method renewAuth
   * @param {Object} options: any valid oauth2 parameter to be sent to the `/authorize` endpoint
   * @param {Function} callback
   */
  def renewAuth(options: js.Any, callback: js.Function2[Auth0Error, js.Any, Any]): Unit = js.native
  /**
   * Initialices a change password transaction
   *
   * @method changePassword
   * @param {Object} options: https://auth0.com/docs/api/authentication#!#post--dbconnections-change_password
   * @param {Function} callback
   */
  def changePassword(options: js.Any, callback: js.Function2[Auth0Error, js.Any, Any]): Unit = js.native
  /**
   * Signs up a new user
   *
   * @method signup
   * @param {Object} options: https://auth0.com/docs/api/authentication#!#post--dbconnections-signup
   * @param {Function} callback
   */
  def signup(options: js.Any, callback: js.Any): Unit = js.native
  /**
   * Signs up a new user, automatically logs the user in after the signup and returns the user token.
   * The login will be done using /oauth/token with password-realm grant type.
   *
   * @method signupAndAuthorize
   * @param {Object} options: https://auth0.com/docs/api/authentication#!#post--dbconnections-signup
   * @param {Function} callback
   */
  def signupAndAuthorize(options: js.Any, callback: js.Function2[Auth0Error, js.Any, Any]): Unit = js.native
  /**
   * Redirects to the auth0 logout page
   *
   * @method logout
   * @param {Object} options: https://auth0.com/docs/api/authentication#!#get--v2-logout
   */
  def logout(options: js.Any): Unit = js.native
  def passwordlessStart(options: PasswordlessStartOptions, callback: js.Function2[Auth0Error, js.Any, Any]): Unit = js.native
  /**
   * Verifies the passwordless TOTP and redirects to finish the passwordless transaction
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
}