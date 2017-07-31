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
import com.pluxbox.radiomanager.api.models.BlockRelationsBroadcast;
import com.pluxbox.radiomanager.api.models.BroadcastRelationsModelType;
import com.pluxbox.radiomanager.api.models.ItemRelationsBlock;
import com.pluxbox.radiomanager.api.models.ItemRelationsCampaign;
import com.pluxbox.radiomanager.api.models.ItemRelationsContacts;
import com.pluxbox.radiomanager.api.models.ItemRelationsProgram;
import com.pluxbox.radiomanager.api.models.ItemRelationsTags;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ItemRelations
 */

public class ItemRelations {
  @SerializedName("block")
  private ItemRelationsBlock block = null;

  @SerializedName("broadcast")
  private BlockRelationsBroadcast broadcast = null;

  @SerializedName("program")
  private ItemRelationsProgram program = null;

  @SerializedName("contacts")
  private ItemRelationsContacts contacts = null;

  @SerializedName("tags")
  private ItemRelationsTags tags = null;

  @SerializedName("campaign")
  private ItemRelationsCampaign campaign = null;

  @SerializedName("model_type")
  private BroadcastRelationsModelType modelType = null;

  public ItemRelations block(ItemRelationsBlock block) {
    this.block = block;
    return this;
  }

   /**
   * Get block
   * @return block
  **/
  @ApiModelProperty(value = "")
  public ItemRelationsBlock getBlock() {
    return block;
  }

  public void setBlock(ItemRelationsBlock block) {
    this.block = block;
  }

  public ItemRelations broadcast(BlockRelationsBroadcast broadcast) {
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

  public ItemRelations program(ItemRelationsProgram program) {
    this.program = program;
    return this;
  }

   /**
   * Get program
   * @return program
  **/
  @ApiModelProperty(value = "")
  public ItemRelationsProgram getProgram() {
    return program;
  }

  public void setProgram(ItemRelationsProgram program) {
    this.program = program;
  }

  public ItemRelations contacts(ItemRelationsContacts contacts) {
    this.contacts = contacts;
    return this;
  }

   /**
   * Get contacts
   * @return contacts
  **/
  @ApiModelProperty(value = "")
  public ItemRelationsContacts getContacts() {
    return contacts;
  }

  public void setContacts(ItemRelationsContacts contacts) {
    this.contacts = contacts;
  }

  public ItemRelations tags(ItemRelationsTags tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public ItemRelationsTags getTags() {
    return tags;
  }

  public void setTags(ItemRelationsTags tags) {
    this.tags = tags;
  }

  public ItemRelations campaign(ItemRelationsCampaign campaign) {
    this.campaign = campaign;
    return this;
  }

   /**
   * Get campaign
   * @return campaign
  **/
  @ApiModelProperty(value = "")
  public ItemRelationsCampaign getCampaign() {
    return campaign;
  }

  public void setCampaign(ItemRelationsCampaign campaign) {
    this.campaign = campaign;
  }

  public ItemRelations modelType(BroadcastRelationsModelType modelType) {
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
    ItemRelations itemRelations = (ItemRelations) o;
    return Objects.equals(this.block, itemRelations.block) &&
        Objects.equals(this.broadcast, itemRelations.broadcast) &&
        Objects.equals(this.program, itemRelations.program) &&
        Objects.equals(this.contacts, itemRelations.contacts) &&
        Objects.equals(this.tags, itemRelations.tags) &&
        Objects.equals(this.campaign, itemRelations.campaign) &&
        Objects.equals(this.modelType, itemRelations.modelType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(block, broadcast, program, contacts, tags, campaign, modelType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemRelations {\n");
    
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
    sb.append("    broadcast: ").append(toIndentedString(broadcast)).append("\n");
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
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

