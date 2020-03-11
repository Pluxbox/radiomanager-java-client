/*
 * RadioManager
 * RadioManager
 *
 * The version of the OpenAPI document: 2.0
 * Contact: support@pluxbox.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.pluxbox.radiomanager.api.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.pluxbox.radiomanager.api.models.BlockRelationsProgram;
import com.pluxbox.radiomanager.api.models.BroadcastRelationsBlocks;
import com.pluxbox.radiomanager.api.models.BroadcastRelationsGenre;
import com.pluxbox.radiomanager.api.models.BroadcastRelationsItems;
import com.pluxbox.radiomanager.api.models.BroadcastRelationsModelType;
import com.pluxbox.radiomanager.api.models.BroadcastRelationsPresenters;
import com.pluxbox.radiomanager.api.models.BroadcastRelationsTags;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BroadcastRelations
 */

public class BroadcastRelations {
  public static final String SERIALIZED_NAME_GENRE = "genre";
  @SerializedName(SERIALIZED_NAME_GENRE)
  private BroadcastRelationsGenre genre;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private BroadcastRelationsItems items;

  public static final String SERIALIZED_NAME_BLOCKS = "blocks";
  @SerializedName(SERIALIZED_NAME_BLOCKS)
  private BroadcastRelationsBlocks blocks;

  public static final String SERIALIZED_NAME_PROGRAM = "program";
  @SerializedName(SERIALIZED_NAME_PROGRAM)
  private BlockRelationsProgram program;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private BroadcastRelationsTags tags;

  public static final String SERIALIZED_NAME_PRESENTERS = "presenters";
  @SerializedName(SERIALIZED_NAME_PRESENTERS)
  private BroadcastRelationsPresenters presenters;

  public static final String SERIALIZED_NAME_MODEL_TYPE = "model_type";
  @SerializedName(SERIALIZED_NAME_MODEL_TYPE)
  private BroadcastRelationsModelType modelType;


  public BroadcastRelations genre(BroadcastRelationsGenre genre) {
    
    this.genre = genre;
    return this;
  }

   /**
   * Get genre
   * @return genre
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BroadcastRelationsGenre getGenre() {
    return genre;
  }


  public void setGenre(BroadcastRelationsGenre genre) {
    this.genre = genre;
  }


  public BroadcastRelations items(BroadcastRelationsItems items) {
    
    this.items = items;
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BroadcastRelationsItems getItems() {
    return items;
  }


  public void setItems(BroadcastRelationsItems items) {
    this.items = items;
  }


  public BroadcastRelations blocks(BroadcastRelationsBlocks blocks) {
    
    this.blocks = blocks;
    return this;
  }

   /**
   * Get blocks
   * @return blocks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BroadcastRelationsBlocks getBlocks() {
    return blocks;
  }


  public void setBlocks(BroadcastRelationsBlocks blocks) {
    this.blocks = blocks;
  }


  public BroadcastRelations program(BlockRelationsProgram program) {
    
    this.program = program;
    return this;
  }

   /**
   * Get program
   * @return program
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BlockRelationsProgram getProgram() {
    return program;
  }


  public void setProgram(BlockRelationsProgram program) {
    this.program = program;
  }


  public BroadcastRelations tags(BroadcastRelationsTags tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BroadcastRelationsTags getTags() {
    return tags;
  }


  public void setTags(BroadcastRelationsTags tags) {
    this.tags = tags;
  }


  public BroadcastRelations presenters(BroadcastRelationsPresenters presenters) {
    
    this.presenters = presenters;
    return this;
  }

   /**
   * Get presenters
   * @return presenters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BroadcastRelationsPresenters getPresenters() {
    return presenters;
  }


  public void setPresenters(BroadcastRelationsPresenters presenters) {
    this.presenters = presenters;
  }


  public BroadcastRelations modelType(BroadcastRelationsModelType modelType) {
    
    this.modelType = modelType;
    return this;
  }

   /**
   * Get modelType
   * @return modelType
  **/
  @javax.annotation.Nullable
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
    BroadcastRelations broadcastRelations = (BroadcastRelations) o;
    return Objects.equals(this.genre, broadcastRelations.genre) &&
        Objects.equals(this.items, broadcastRelations.items) &&
        Objects.equals(this.blocks, broadcastRelations.blocks) &&
        Objects.equals(this.program, broadcastRelations.program) &&
        Objects.equals(this.tags, broadcastRelations.tags) &&
        Objects.equals(this.presenters, broadcastRelations.presenters) &&
        Objects.equals(this.modelType, broadcastRelations.modelType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genre, items, blocks, program, tags, presenters, modelType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BroadcastRelations {\n");
    sb.append("    genre: ").append(toIndentedString(genre)).append("\n");
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

