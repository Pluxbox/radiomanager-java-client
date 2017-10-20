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
import com.pluxbox.radiomanager.api.models.BlockRelationsProgram;
import com.pluxbox.radiomanager.api.models.BroadcastRelationsBlocks;
import com.pluxbox.radiomanager.api.models.BroadcastRelationsItems;
import com.pluxbox.radiomanager.api.models.BroadcastRelationsModelType;
import com.pluxbox.radiomanager.api.models.BroadcastRelationsTags;
import com.pluxbox.radiomanager.api.models.PresenterEPGResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BroadcastEPGRelations
 */

public class BroadcastEPGRelations {
  @SerializedName("items")
  private BroadcastRelationsItems items = null;

  @SerializedName("blocks")
  private BroadcastRelationsBlocks blocks = null;

  @SerializedName("program")
  private BlockRelationsProgram program = null;

  @SerializedName("tags")
  private BroadcastRelationsTags tags = null;

  @SerializedName("presenters")
  private List<PresenterEPGResult> presenters = null;

  @SerializedName("model_type")
  private BroadcastRelationsModelType modelType = null;

  public BroadcastEPGRelations items(BroadcastRelationsItems items) {
    this.items = items;
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public BroadcastRelationsItems getItems() {
    return items;
  }

  public void setItems(BroadcastRelationsItems items) {
    this.items = items;
  }

  public BroadcastEPGRelations blocks(BroadcastRelationsBlocks blocks) {
    this.blocks = blocks;
    return this;
  }

   /**
   * Get blocks
   * @return blocks
  **/
  @ApiModelProperty(value = "")
  public BroadcastRelationsBlocks getBlocks() {
    return blocks;
  }

  public void setBlocks(BroadcastRelationsBlocks blocks) {
    this.blocks = blocks;
  }

  public BroadcastEPGRelations program(BlockRelationsProgram program) {
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

  public BroadcastEPGRelations tags(BroadcastRelationsTags tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public BroadcastRelationsTags getTags() {
    return tags;
  }

  public void setTags(BroadcastRelationsTags tags) {
    this.tags = tags;
  }

  public BroadcastEPGRelations presenters(List<PresenterEPGResult> presenters) {
    this.presenters = presenters;
    return this;
  }

  public BroadcastEPGRelations addPresentersItem(PresenterEPGResult presentersItem) {
    if (this.presenters == null) {
      this.presenters = new ArrayList<PresenterEPGResult>();
    }
    this.presenters.add(presentersItem);
    return this;
  }

   /**
   * Get presenters
   * @return presenters
  **/
  @ApiModelProperty(value = "")
  public List<PresenterEPGResult> getPresenters() {
    return presenters;
  }

  public void setPresenters(List<PresenterEPGResult> presenters) {
    this.presenters = presenters;
  }

  public BroadcastEPGRelations modelType(BroadcastRelationsModelType modelType) {
    this.modelType = modelType;
    return this;
  }

   /**
   * Get modelType
   * @return modelType
  **/
  @ApiModelProperty(value = "")
  public BroadcastRelationsModelType getModelType() {
    return modelType;
  }

  public void setModelType(BroadcastRelationsModelType modelType) {
    this.modelType = modelType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BroadcastEPGRelations broadcastEPGRelations = (BroadcastEPGRelations) o;
    return Objects.equals(this.items, broadcastEPGRelations.items) &&
        Objects.equals(this.blocks, broadcastEPGRelations.blocks) &&
        Objects.equals(this.program, broadcastEPGRelations.program) &&
        Objects.equals(this.tags, broadcastEPGRelations.tags) &&
        Objects.equals(this.presenters, broadcastEPGRelations.presenters) &&
        Objects.equals(this.modelType, broadcastEPGRelations.modelType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, blocks, program, tags, presenters, modelType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BroadcastEPGRelations {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    blocks: ").append(toIndentedString(blocks)).append("\n");
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    presenters: ").append(toIndentedString(presenters)).append("\n");
    sb.append("    modelType: ").append(toIndentedString(modelType)).append("\n");
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
