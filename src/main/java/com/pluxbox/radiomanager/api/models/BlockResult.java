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
import com.pluxbox.radiomanager.api.models.Block;
import com.pluxbox.radiomanager.api.models.BlockRelations;
import com.pluxbox.radiomanager.api.models.BlockRelationsBroadcast;
import com.pluxbox.radiomanager.api.models.BlockRelationsItems;
import com.pluxbox.radiomanager.api.models.BlockRelationsProgram;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * BlockResult
 */

public class BlockResult {
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

  @SerializedName("items")
  private BlockRelationsItems items = null;

  @SerializedName("broadcast")
  private BlockRelationsBroadcast broadcast = null;

  @SerializedName("program")
  private BlockRelationsProgram program = null;

  public BlockResult id(Long id) {
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

  public BlockResult broadcastId(Long broadcastId) {
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

  public BlockResult start(OffsetDateTime start) {
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

  public BlockResult stop(OffsetDateTime stop) {
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

  public BlockResult createdAt(OffsetDateTime createdAt) {
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

  public BlockResult updatedAt(OffsetDateTime updatedAt) {
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

  public BlockResult deletedAt(OffsetDateTime deletedAt) {
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

  public BlockResult externalStationId(Long externalStationId) {
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

  public BlockResult items(BlockRelationsItems items) {
    this.items = items;
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public BlockRelationsItems getItems() {
    return items;
  }

  public void setItems(BlockRelationsItems items) {
    this.items = items;
  }

  public BlockResult broadcast(BlockRelationsBroadcast broadcast) {
    this.broadcast = broadcast;
    return this;
  }

   /**
   * Get broadcast
   * @return broadcast
  **/
  @ApiModelProperty(value = "")
  public BlockRelationsBroadcast getBroadcast() {
    return broadcast;
  }

  public void setBroadcast(BlockRelationsBroadcast broadcast) {
    this.broadcast = broadcast;
  }

  public BlockResult program(BlockRelationsProgram program) {
    this.program = program;
    return this;
  }

   /**
   * Get program
   * @return program
  **/
  @ApiModelProperty(value = "")
  public BlockRelationsProgram getProgram() {
    return program;
  }

  public void setProgram(BlockRelationsProgram program) {
    this.program = program;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockResult blockResult = (BlockResult) o;
    return Objects.equals(this.id, blockResult.id) &&
        Objects.equals(this.broadcastId, blockResult.broadcastId) &&
        Objects.equals(this.start, blockResult.start) &&
        Objects.equals(this.stop, blockResult.stop) &&
        Objects.equals(this.createdAt, blockResult.createdAt) &&
        Objects.equals(this.updatedAt, blockResult.updatedAt) &&
        Objects.equals(this.deletedAt, blockResult.deletedAt) &&
        Objects.equals(this.externalStationId, blockResult.externalStationId) &&
        Objects.equals(this.items, blockResult.items) &&
        Objects.equals(this.broadcast, blockResult.broadcast) &&
        Objects.equals(this.program, blockResult.program);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, broadcastId, start, stop, createdAt, updatedAt, deletedAt, externalStationId, items, broadcast, program);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    broadcastId: ").append(toIndentedString(broadcastId)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    externalStationId: ").append(toIndentedString(externalStationId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    broadcast: ").append(toIndentedString(broadcast)).append("\n");
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
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

