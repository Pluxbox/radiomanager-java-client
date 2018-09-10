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
import com.pluxbox.radiomanager.api.models.ModelTypeRelationsBroadcasts;
import com.pluxbox.radiomanager.api.models.ModelTypeRelationsCampaigns;
import com.pluxbox.radiomanager.api.models.ModelTypeRelationsContacts;
import com.pluxbox.radiomanager.api.models.ModelTypeRelationsItems;
import com.pluxbox.radiomanager.api.models.ModelTypeRelationsPresenters;
import com.pluxbox.radiomanager.api.models.ModelTypeRelationsPrograms;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ModelTypeRelations
 */

public class ModelTypeRelations {
  @SerializedName("campaigns")
  private ModelTypeRelationsCampaigns campaigns = null;

  @SerializedName("broadcasts")
  private ModelTypeRelationsBroadcasts broadcasts = null;

  @SerializedName("programs")
  private ModelTypeRelationsPrograms programs = null;

  @SerializedName("contacts")
  private ModelTypeRelationsContacts contacts = null;

  @SerializedName("presenters")
  private ModelTypeRelationsPresenters presenters = null;

  @SerializedName("items")
  private ModelTypeRelationsItems items = null;

  public ModelTypeRelations campaigns(ModelTypeRelationsCampaigns campaigns) {
    this.campaigns = campaigns;
    return this;
  }

   /**
   * Get campaigns
   * @return campaigns
  **/
  @ApiModelProperty(value = "")
  public ModelTypeRelationsCampaigns getCampaigns() {
    return campaigns;
  }

  public void setCampaigns(ModelTypeRelationsCampaigns campaigns) {
    this.campaigns = campaigns;
  }

  public ModelTypeRelations broadcasts(ModelTypeRelationsBroadcasts broadcasts) {
    this.broadcasts = broadcasts;
    return this;
  }

   /**
   * Get broadcasts
   * @return broadcasts
  **/
  @ApiModelProperty(value = "")
  public ModelTypeRelationsBroadcasts getBroadcasts() {
    return broadcasts;
  }

  public void setBroadcasts(ModelTypeRelationsBroadcasts broadcasts) {
    this.broadcasts = broadcasts;
  }

  public ModelTypeRelations programs(ModelTypeRelationsPrograms programs) {
    this.programs = programs;
    return this;
  }

   /**
   * Get programs
   * @return programs
  **/
  @ApiModelProperty(value = "")
  public ModelTypeRelationsPrograms getPrograms() {
    return programs;
  }

  public void setPrograms(ModelTypeRelationsPrograms programs) {
    this.programs = programs;
  }

  public ModelTypeRelations contacts(ModelTypeRelationsContacts contacts) {
    this.contacts = contacts;
    return this;
  }

   /**
   * Get contacts
   * @return contacts
  **/
  @ApiModelProperty(value = "")
  public ModelTypeRelationsContacts getContacts() {
    return contacts;
  }

  public void setContacts(ModelTypeRelationsContacts contacts) {
    this.contacts = contacts;
  }

  public ModelTypeRelations presenters(ModelTypeRelationsPresenters presenters) {
    this.presenters = presenters;
    return this;
  }

   /**
   * Get presenters
   * @return presenters
  **/
  @ApiModelProperty(value = "")
  public ModelTypeRelationsPresenters getPresenters() {
    return presenters;
  }

  public void setPresenters(ModelTypeRelationsPresenters presenters) {
    this.presenters = presenters;
  }

  public ModelTypeRelations items(ModelTypeRelationsItems items) {
    this.items = items;
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public ModelTypeRelationsItems getItems() {
    return items;
  }

  public void setItems(ModelTypeRelationsItems items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelTypeRelations modelTypeRelations = (ModelTypeRelations) o;
    return Objects.equals(this.campaigns, modelTypeRelations.campaigns) &&
        Objects.equals(this.broadcasts, modelTypeRelations.broadcasts) &&
        Objects.equals(this.programs, modelTypeRelations.programs) &&
        Objects.equals(this.contacts, modelTypeRelations.contacts) &&
        Objects.equals(this.presenters, modelTypeRelations.presenters) &&
        Objects.equals(this.items, modelTypeRelations.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaigns, broadcasts, programs, contacts, presenters, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelTypeRelations {\n");
    
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
    sb.append("    broadcasts: ").append(toIndentedString(broadcasts)).append("\n");
    sb.append("    programs: ").append(toIndentedString(programs)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    presenters: ").append(toIndentedString(presenters)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

