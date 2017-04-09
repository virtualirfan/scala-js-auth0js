package com.definitelyscala.auth0js.auth0

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("auth0.DBConnection")
class DBConnection protected () extends js.Object {
  def this(request: js.Any, option: js.Any) = this()
  /**
   * Signup a new user
   *
   * @method signup
   * @param {Object} options: https://auth0.com/docs/api/authentication#!#post--dbconnections-signup
   * @param {Function} calback
   */
  def signup(options: js.Any, callback: js.Any): Unit = js.native
  /**
   * Initializes the change password flow
   *
   * @method signup
   * @param {Object} options: https://auth0.com/docs/api/authentication#!#post--dbconnections-change_password
   * @param {Function} callback
   */
  def changePassword(options: ChangePasswordOptions, callback: js.Any): Unit = js.native
}