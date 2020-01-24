/*
 * Bybit API
 * ## REST API for the Bybit Exchange. Base URI: [https://api-testnet.bybit.com]  
 *
 * OpenAPI spec version: 1.0.0
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
import java.math.BigDecimal;

/**
 * Get funding record response
 */
@ApiModel(description = "Get funding record response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-24T20:01:33.839+08:00")
public class FundingRecords {
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("user_id")
  private BigDecimal userId = null;

  @SerializedName("coin")
  private String coin = null;

  @SerializedName("wallet_id")
  private BigDecimal walletId = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("amount")
  private String amount = null;

  @SerializedName("tx_id")
  private String txId = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("wallet_balance")
  private String walletBalance = null;

  @SerializedName("exec_time")
  private String execTime = null;

  @SerializedName("cross_seq")
  private BigDecimal crossSeq = null;

  public FundingRecords id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public FundingRecords userId(BigDecimal userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUserId() {
    return userId;
  }

  public void setUserId(BigDecimal userId) {
    this.userId = userId;
  }

  public FundingRecords coin(String coin) {
    this.coin = coin;
    return this;
  }

   /**
   * Get coin
   * @return coin
  **/
  @ApiModelProperty(value = "")
  public String getCoin() {
    return coin;
  }

  public void setCoin(String coin) {
    this.coin = coin;
  }

  public FundingRecords walletId(BigDecimal walletId) {
    this.walletId = walletId;
    return this;
  }

   /**
   * Get walletId
   * @return walletId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getWalletId() {
    return walletId;
  }

  public void setWalletId(BigDecimal walletId) {
    this.walletId = walletId;
  }

  public FundingRecords type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FundingRecords amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public FundingRecords txId(String txId) {
    this.txId = txId;
    return this;
  }

   /**
   * Get txId
   * @return txId
  **/
  @ApiModelProperty(value = "")
  public String getTxId() {
    return txId;
  }

  public void setTxId(String txId) {
    this.txId = txId;
  }

  public FundingRecords address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public FundingRecords walletBalance(String walletBalance) {
    this.walletBalance = walletBalance;
    return this;
  }

   /**
   * Get walletBalance
   * @return walletBalance
  **/
  @ApiModelProperty(value = "")
  public String getWalletBalance() {
    return walletBalance;
  }

  public void setWalletBalance(String walletBalance) {
    this.walletBalance = walletBalance;
  }

  public FundingRecords execTime(String execTime) {
    this.execTime = execTime;
    return this;
  }

   /**
   * Get execTime
   * @return execTime
  **/
  @ApiModelProperty(value = "")
  public String getExecTime() {
    return execTime;
  }

  public void setExecTime(String execTime) {
    this.execTime = execTime;
  }

  public FundingRecords crossSeq(BigDecimal crossSeq) {
    this.crossSeq = crossSeq;
    return this;
  }

   /**
   * Get crossSeq
   * @return crossSeq
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCrossSeq() {
    return crossSeq;
  }

  public void setCrossSeq(BigDecimal crossSeq) {
    this.crossSeq = crossSeq;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundingRecords fundingRecords = (FundingRecords) o;
    return Objects.equals(this.id, fundingRecords.id) &&
        Objects.equals(this.userId, fundingRecords.userId) &&
        Objects.equals(this.coin, fundingRecords.coin) &&
        Objects.equals(this.walletId, fundingRecords.walletId) &&
        Objects.equals(this.type, fundingRecords.type) &&
        Objects.equals(this.amount, fundingRecords.amount) &&
        Objects.equals(this.txId, fundingRecords.txId) &&
        Objects.equals(this.address, fundingRecords.address) &&
        Objects.equals(this.walletBalance, fundingRecords.walletBalance) &&
        Objects.equals(this.execTime, fundingRecords.execTime) &&
        Objects.equals(this.crossSeq, fundingRecords.crossSeq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, coin, walletId, type, amount, txId, address, walletBalance, execTime, crossSeq);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundingRecords {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    coin: ").append(toIndentedString(coin)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    walletBalance: ").append(toIndentedString(walletBalance)).append("\n");
    sb.append("    execTime: ").append(toIndentedString(execTime)).append("\n");
    sb.append("    crossSeq: ").append(toIndentedString(crossSeq)).append("\n");
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

