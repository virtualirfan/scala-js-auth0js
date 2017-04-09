package com.definitelyscala.auth0js.auth0

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("auth0.Authentication")
class Authentication protected () extends js.Object {
  def this(options: AuthOptions) = this()
  var passwordless: PasswordlessAuthentication = js.native
  var dbConnection: DBConnection = js.native
  /**
   * Builds and returns the `/authorize` url in order to initialize a new authN/authZ transaction
   *
   * @method buildAuthorizeUrl
   * @param {Object} options: https://auth0.com/docs/api/authentication#!#get--authorize_db
   */
  def buildAuthorizeUrl(options: js.Any): String = js.native
  /**
   * Builds and returns the Logout url in order to initialize a new authN/authZ transaction
   *
   * @method buildLogoutUrl
   * @param {Object} options: https://auth0.com/docs/api/authentication#!#get--v2-logout
   */
  def buildLogoutUrl(options: js.Any = js.native): String = js.native
  /**
   * Makes a call to the `oauth/token` endpoint with `password` grant type
   *
   * @method loginWithDefaultDirectory
   * @param {Object} options: https://auth0.com/docs/api-auth/grant/password
   * @param {Function} callback
   */
  def loginWithDefaultDirectory(options: js.Any, callback: js.Function2[Auth0Error, js.Any, Any]): Unit = js.native
  /**
   * Makes a call to the `/ro` endpoint
   * @param {any}      options
   * @param {Function} callback
   * @deprecated `loginWithResourceOwner` will be soon deprecated, user `login` instead.
   */
  def loginWithResourceOwner(options: js.Any, callback: js.Function2[Auth0Error, js.Any, Any]): Unit = js.native
  /**
   * Makes a call to the `oauth/token` endpoint with `password-realm` grant type
   * @param {any}     options
   * @param {Function} callback
   */
  def login(options: js.Any, callback: js.Function2[Auth0Error, js.Any, Any]): Unit = js.native
  /**
   * Makes a call to the `oauth/token` endpoint
   * @param {any}      options
   * @param {Function} callback
   */
  def oauthToken(options: js.Any, callback: js.Function2[Auth0Error, js.Any, Any]): Unit = js.native
  /**
   * Makes a call to the `/ssodata` endpoint
   *
   * @method getSSOData
   * @param {Boolean} withActiveDirectories
   * @param {Function} callback
   * @deprecated `getSSOData` will be soon deprecated.
   */
  def getSSOData(callback: js.Function2[Auth0Error, js.Any, Any]): Unit = js.native
  /**
   * Makes a call to the `/ssodata` endpoint
   *
   * @method getSSOData
   * @param {Boolean} withActiveDirectories
   * @param {Function} callback
   * @deprecated `getSSOData` will be soon deprecated.
   */
  def getSSOData(withActiveDirectories: Boolean, callback: js.Function2[Auth0Error, js.Any, Any]): Unit = js.native
  /**
   * Makes a call to the `/userinfo` endpoint and returns the user profile
   *
   * @method userInfo
   * @param {String} accessToken
   * @param {Function} callback
   */
  def userInfo(token: String, callback: js.Function2[Auth0Error, js.Any, Any]): Unit = js.native
  /**
   * Makes a call to the `/delegation` endpoint
   *
   * @method delegation
   * @param {Object} options: https://auth0.com/docs/api/authentication#!#post--delegation
   * @param {Function} callback
   * @deprecated `delegation` will be soon deprecated.
   */
  def delegation(options: js.Any, callback: js.Function2[Auth0Error, Auth0DelegationToken, Any]): js.Dynamic = js.native
  /**
   * Fetches the user country based on the ip.
   *
   * @method getUserCountry
   * @param {Function} callback
   */
  def getUserCountry(callback: js.Function2[Auth0Error, js.Any, Any]): Unit = js.native
}