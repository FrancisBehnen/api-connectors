/*
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


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LinearClosedPnlRecordResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T14:39:31.513+08:00")
public class LinearClosedPnlRecordResult {
  @SerializedName("avg_entry_price")
  private Double avgEntryPrice = null;

  @SerializedName("avg_exit_price")
  private Double avgExitPrice = null;

  @SerializedName("closed_pnl")
  private Double closedPnl = null;

  @SerializedName("closed_size")
  private Double closedSize = null;

  @SerializedName("created_at")
  private Long createdAt = null;

  @SerializedName("cum_entry_value")
  private Double cumEntryValue = null;

  @SerializedName("cum_exit_value")
  private Double cumExitValue = null;

  @SerializedName("exec_type")
  private String execType = null;

  @SerializedName("fill_count")
  private Integer fillCount = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("leverage")
  private Double leverage = null;

  @SerializedName("order_id")
  private String orderId = null;

  @SerializedName("order_price")
  private Double orderPrice = null;

  @SerializedName("order_type")
  private String orderType = null;

  @SerializedName("qty")
  private Double qty = null;

  @SerializedName("side")
  private String side = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("user_id")
  private Long userId = null;

  public LinearClosedPnlRecordResult avgEntryPrice(Double avgEntryPrice) {
    this.avgEntryPrice = avgEntryPrice;
    return this;
  }

   /**
   * Get avgEntryPrice
   * @return avgEntryPrice
  **/
  @ApiModelProperty(value = "")
  public Double getAvgEntryPrice() {
    return avgEntryPrice;
  }

  public void setAvgEntryPrice(Double avgEntryPrice) {
    this.avgEntryPrice = avgEntryPrice;
  }

  public LinearClosedPnlRecordResult avgExitPrice(Double avgExitPrice) {
    this.avgExitPrice = avgExitPrice;
    return this;
  }

   /**
   * Get avgExitPrice
   * @return avgExitPrice
  **/
  @ApiModelProperty(value = "")
  public Double getAvgExitPrice() {
    return avgExitPrice;
  }

  public void setAvgExitPrice(Double avgExitPrice) {
    this.avgExitPrice = avgExitPrice;
  }

  public LinearClosedPnlRecordResult closedPnl(Double closedPnl) {
    this.closedPnl = closedPnl;
    return this;
  }

   /**
   * Get closedPnl
   * @return closedPnl
  **/
  @ApiModelProperty(value = "")
  public Double getClosedPnl() {
    return closedPnl;
  }

  public void setClosedPnl(Double closedPnl) {
    this.closedPnl = closedPnl;
  }

  public LinearClosedPnlRecordResult closedSize(Double closedSize) {
    this.closedSize = closedSize;
    return this;
  }

   /**
   * Get closedSize
   * @return closedSize
  **/
  @ApiModelProperty(value = "")
  public Double getClosedSize() {
    return closedSize;
  }

  public void setClosedSize(Double closedSize) {
    this.closedSize = closedSize;
  }

  public LinearClosedPnlRecordResult createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public LinearClosedPnlRecordResult cumEntryValue(Double cumEntryValue) {
    this.cumEntryValue = cumEntryValue;
    return this;
  }

   /**
   * Get cumEntryValue
   * @return cumEntryValue
  **/
  @ApiModelProperty(value = "")
  public Double getCumEntryValue() {
    return cumEntryValue;
  }

  public void setCumEntryValue(Double cumEntryValue) {
    this.cumEntryValue = cumEntryValue;
  }

  public LinearClosedPnlRecordResult cumExitValue(Double cumExitValue) {
    this.cumExitValue = cumExitValue;
    return this;
  }

   /**
   * Get cumExitValue
   * @return cumExitValue
  **/
  @ApiModelProperty(value = "")
  public Double getCumExitValue() {
    return cumExitValue;
  }

  public void setCumExitValue(Double cumExitValue) {
    this.cumExitValue = cumExitValue;
  }

  public LinearClosedPnlRecordResult execType(String execType) {
    this.execType = execType;
    return this;
  }

   /**
   * Get execType
   * @return execType
  **/
  @ApiModelProperty(value = "")
  public String getExecType() {
    return execType;
  }

  public void setExecType(String execType) {
    this.execType = execType;
  }

  public LinearClosedPnlRecordResult fillCount(Integer fillCount) {
    this.fillCount = fillCount;
    return this;
  }

   /**
   * Get fillCount
   * @return fillCount
  **/
  @ApiModelProperty(value = "")
  public Integer getFillCount() {
    return fillCount;
  }

  public void setFillCount(Integer fillCount) {
    this.fillCount = fillCount;
  }

  public LinearClosedPnlRecordResult id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LinearClosedPnlRecordResult leverage(Double leverage) {
    this.leverage = leverage;
    return this;
  }

   /**
   * Get leverage
   * @return leverage
  **/
  @ApiModelProperty(value = "")
  public Double getLeverage() {
    return leverage;
  }

  public void setLeverage(Double leverage) {
    this.leverage = leverage;
  }

  public LinearClosedPnlRecordResult orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(value = "")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public LinearClosedPnlRecordResult orderPrice(Double orderPrice) {
    this.orderPrice = orderPrice;
    return this;
  }

   /**
   * Get orderPrice
   * @return orderPrice
  **/
  @ApiModelProperty(value = "")
  public Double getOrderPrice() {
    return orderPrice;
  }

  public void setOrderPrice(Double orderPrice) {
    this.orderPrice = orderPrice;
  }

  public LinearClosedPnlRecordResult orderType(String orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * Get orderType
   * @return orderType
  **/
  @ApiModelProperty(value = "")
  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public LinearClosedPnlRecordResult qty(Double qty) {
    this.qty = qty;
    return this;
  }

   /**
   * Get qty
   * @return qty
  **/
  @ApiModelProperty(value = "")
  public Double getQty() {
    return qty;
  }

  public void setQty(Double qty) {
    this.qty = qty;
  }

  public LinearClosedPnlRecordResult side(String side) {
    this.side = side;
    return this;
  }

   /**
   * Get side
   * @return side
  **/
  @ApiModelProperty(value = "")
  public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }

  public LinearClosedPnlRecordResult symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @ApiModelProperty(value = "")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public LinearClosedPnlRecordResult userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinearClosedPnlRecordResult linearClosedPnlRecordResult = (LinearClosedPnlRecordResult) o;
    return Objects.equals(this.avgEntryPrice, linearClosedPnlRecordResult.avgEntryPrice) &&
        Objects.equals(this.avgExitPrice, linearClosedPnlRecordResult.avgExitPrice) &&
        Objects.equals(this.closedPnl, linearClosedPnlRecordResult.closedPnl) &&
        Objects.equals(this.closedSize, linearClosedPnlRecordResult.closedSize) &&
        Objects.equals(this.createdAt, linearClosedPnlRecordResult.createdAt) &&
        Objects.equals(this.cumEntryValue, linearClosedPnlRecordResult.cumEntryValue) &&
        Objects.equals(this.cumExitValue, linearClosedPnlRecordResult.cumExitValue) &&
        Objects.equals(this.execType, linearClosedPnlRecordResult.execType) &&
        Objects.equals(this.fillCount, linearClosedPnlRecordResult.fillCount) &&
        Objects.equals(this.id, linearClosedPnlRecordResult.id) &&
        Objects.equals(this.leverage, linearClosedPnlRecordResult.leverage) &&
        Objects.equals(this.orderId, linearClosedPnlRecordResult.orderId) &&
        Objects.equals(this.orderPrice, linearClosedPnlRecordResult.orderPrice) &&
        Objects.equals(this.orderType, linearClosedPnlRecordResult.orderType) &&
        Objects.equals(this.qty, linearClosedPnlRecordResult.qty) &&
        Objects.equals(this.side, linearClosedPnlRecordResult.side) &&
        Objects.equals(this.symbol, linearClosedPnlRecordResult.symbol) &&
        Objects.equals(this.userId, linearClosedPnlRecordResult.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avgEntryPrice, avgExitPrice, closedPnl, closedSize, createdAt, cumEntryValue, cumExitValue, execType, fillCount, id, leverage, orderId, orderPrice, orderType, qty, side, symbol, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinearClosedPnlRecordResult {\n");
    
    sb.append("    avgEntryPrice: ").append(toIndentedString(avgEntryPrice)).append("\n");
    sb.append("    avgExitPrice: ").append(toIndentedString(avgExitPrice)).append("\n");
    sb.append("    closedPnl: ").append(toIndentedString(closedPnl)).append("\n");
    sb.append("    closedSize: ").append(toIndentedString(closedSize)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    cumEntryValue: ").append(toIndentedString(cumEntryValue)).append("\n");
    sb.append("    cumExitValue: ").append(toIndentedString(cumExitValue)).append("\n");
    sb.append("    execType: ").append(toIndentedString(execType)).append("\n");
    sb.append("    fillCount: ").append(toIndentedString(fillCount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    leverage: ").append(toIndentedString(leverage)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderPrice: ").append(toIndentedString(orderPrice)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
