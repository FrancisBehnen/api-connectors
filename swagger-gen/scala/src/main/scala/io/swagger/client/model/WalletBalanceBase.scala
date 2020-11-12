/**
 * Bybit API
 * ## REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]  
 *
 * OpenAPI spec version: 0.2.10
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class WalletBalanceBase (
  retCode: Option[Number] = None,
  retMsg: Option[String] = None,
  extCode: Option[String] = None,
  extInfo: Option[String] = None,
  result: Option[Any] = None,
  timeNow: Option[String] = None
)

