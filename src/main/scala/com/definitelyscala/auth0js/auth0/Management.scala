package com.definitelyscala.auth0js.auth0

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("auth0.Management")
class Management protected () extends js.Object {
  def this(options: ManagementOptions) = this()
  /**
   * Returns the user profile. https://auth0.com/docs/api/management/v2#!/Users/get_users_by_id
   *
   * @method getUser
   * @param {String} userId
   * @param {Function} callback
   */
  def getUser(userId: String, callback: js.Function2[Auth0Error, js.Any, Any]): Unit = js.native
  /**
   * Updates the user metdata. It will patch the user metdata with the attributes sent.
   * https://auth0.com/docs/api/management/v2#!/Users/patch_users_by_id
   *
   * @method patchUserMetadata
   * @param {String} userId
   * @param {Object} userMetadata
   * @param {Function} callback
   */
  def patchUserMetadata(userId: String, userMetadata: js.Any, callback: js.Function2[Auth0Error, js.Any, Any]): Unit = js.native
  /**
   * Link two users. https://auth0.com/docs/api/management/v2#!/Users/post_identities
   *
   * @method linkUser
   * @param {String} userId
   * @param {String} secondaryUserToken
   * @param {Function} callback
   */
  def linkUser(userId: String, secondaryUserToken: String, callback: js.Function2[Auth0Error, js.Any, Any]): Unit = js.native
}