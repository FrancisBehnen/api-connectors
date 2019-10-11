/**
 * Bybit API
 * ## REST API for the Bybit Exchange. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class KlineRes (
  symbol: Option[String] = None,
  interval: Option[String] = None,
  openTime: Option[Number] = None,
  open: Option[String] = None,
  high: Option[String] = None,
  low: Option[String] = None,
  close: Option[String] = None,
  volume: Option[String] = None
)
