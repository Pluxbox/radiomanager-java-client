/*
 * RadioManager
 * RadioManager
 *
 * OpenAPI spec version: 2.0
 * Contact: support@pluxbox.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.pluxbox.radiomanager.api.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Block
 */

public class Block {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("broadcast_id")
  private Long broadcastId = null;

  @SerializedName("start")
  private OffsetDateTime start = null;

  @SerializedName("stop")
  private OffsetDateTime stop = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("deleted_at")
  private OffsetDateTime deletedAt = null;

  @SerializedName("_external_station_id")
  private Long externalStationId = null;

  public Block id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the current Block.
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "ID of the current Block.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Block broadcastId(Long broadcastId) {
    this.broadcastId = broadcastId;
    return this;
  }

   /**
   * Currently assigned Broadcast connected to the current Block, identified by the Broadcast ID.
   * @return broadcastId
  **/
  @ApiModelProperty(example = "1", required = true, value = "Currently assigned Broadcast connected to the current Block, identified by the Broadcast ID.")
  public Long getBroadcastId() {
    return broadcastId;
  }

  public void setBroadcastId(Long broadcastId) {
    this.broadcastId = broadcastId;
  }

  public Block start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * Start of the Block (formatted as a DateTime object), saved with an TimeZone.
   * @return start
  **/
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", required = true, value = "Start of the Block (formatted as a DateTime object), saved with an TimeZone.")
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public Block stop(OffsetDateTime stop) {
    this.stop = stop;
    return this;
  }

   /**
   * End of the Block (formatted as a DateTime object), saved with an TimeZone.
   * @return stop
  **/
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", required = true, value = "End of the Block (formatted as a DateTime object), saved with an TimeZone.")
  public OffsetDateTime getStop() {
    return stop;
  }

  public void setStop(OffsetDateTime stop) {
    this.stop = stop;
  }

  public Block createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Time of the creation of the Block (formatted as a DateTime object), saved with an TimeZone.
   * @return createdAt
  **/
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", required = true, value = "Time of the creation of the Block (formatted as a DateTime object), saved with an TimeZone.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Block updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Time of the last update of the Block (formatted as a DateTime object), saved with an TimeZone.
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", required = true, value = "Time of the last update of the Block (formatted as a DateTime object), saved with an TimeZone.")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Block deletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Moment when the Block got deleted (formatted as a DateTime object), saved with an TimeZone.
   * @return deletedAt
  **/
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", required = true, value = "Moment when the Block got deleted (formatted as a DateTime object), saved with an TimeZone.")
  public OffsetDateTime getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
  }

  public Block externalStationId(Long externalStationId) {
    this.externalStationId = externalStationId;
    return this;
  }

   /**
   * Get externalStationId
   * @return externalStationId
  **/
  @ApiModelProperty(value = "")
  public Long getExternalStationId() {
    return externalStationId;
  }

  public void setExternalStationId(Long externalStationId) {
    this.externalStationId = externalStationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Block block = (Block) o;
    return Objects.equals(this.id, block.id) &&
        Objects.equals(this.broadcastId, block.broadcastId) &&
        Objects.equals(this.start, block.start) &&
        Objects.equals(this.stop, block.stop) &&
        Objects.equals(this.createdAt, block.createdAt) &&
        Objects.equals(this.updatedAt, block.updatedAt) &&
        Objects.equals(this.deletedAt, block.deletedAt) &&
        Objects.equals(this.externalStationId, block.externalStationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, broadcastId, start, stop, createdAt, updatedAt, deletedAt, externalStationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Block {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    broadcastId: ").append(toIndentedString(broadcastId)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    externalStationId: ").append(toIndentedString(externalStationId)).append("\n");
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

