package com.definitelyscala.auth0js.auth0

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("auth0.PasswordlessAuthentication")
class PasswordlessAuthentication protected () extends js.Object {
  def this(request: js.Any, option: js.Any) = this()
  /**
         * Builds and returns the passwordless TOTP verify url in order to initialize a new authN/authZ transaction
         *
         * @method buildVerifyUrl
         * @param {Object} options
         * @param {Function} callback
         */
  def buildVerifyUrl(options: js.Any): String = js.native
  /**
         * Initializes a new passwordless authN/authZ transaction
         *
         * @method start
         * @param {Object} options: https://auth0.com/docs/api/authentication#passwordless
         * @param {Function} callback
         */
  def start(options: PasswordlessStartOptions, callback: js.Any): Unit = js.native
  /**
         * Verifies the passwordless TOTP and returns an error if any.
         *
         * @method buildVerifyUrl
         * @param {Object} options
         * @param {Function} callback
         */
  def verify(options: js.Any, callback: js.Any): Unit = js.native
}