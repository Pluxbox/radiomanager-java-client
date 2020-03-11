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
import com.pluxbox.radiomanager.api.models.TagRelationsBroadcasts;
import com.pluxbox.radiomanager.api.models.TagRelationsContacts;
import com.pluxbox.radiomanager.api.models.TagRelationsItems;
import com.pluxbox.radiomanager.api.models.TagRelationsPrograms;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TagRelations
 */

public class TagRelations {
  public static final String SERIALIZED_NAME_BROADCASTS = "broadcasts";
  @SerializedName(SERIALIZED_NAME_BROADCASTS)
  private TagRelationsBroadcasts broadcasts;

  public static final String SERIALIZED_NAME_PROGRAMS = "programs";
  @SerializedName(SERIALIZED_NAME_PROGRAMS)
  private TagRelationsPrograms programs;

  public static final String SERIALIZED_NAME_CONTACTS = "contacts";
  @SerializedName(SERIALIZED_NAME_CONTACTS)
  private TagRelationsContacts contacts;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private TagRelationsItems items;


  public TagRelations broadcasts(TagRelationsBroadcasts broadcasts) {
    
    this.broadcasts = broadcasts;
    return this;
  }

   /**
   * Get broadcasts
   * @return broadcasts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TagRelationsBroadcasts getBroadcasts() {
    return broadcasts;
  }


  public void setBroadcasts(TagRelationsBroadcasts broadcasts) {
    this.broadcasts = broadcasts;
  }


  public TagRelations programs(TagRelationsPrograms programs) {
    
    this.programs = programs;
    return this;
  }

   /**
   * Get programs
   * @return programs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TagRelationsPrograms getPrograms() {
    return programs;
  }


  public void setPrograms(TagRelationsPrograms programs) {
    this.programs = programs;
  }


  public TagRelations contacts(TagRelationsContacts contacts) {
    
    this.contacts = contacts;
    return this;
  }

   /**
   * Get contacts
   * @return contacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TagRelationsContacts getContacts() {
    return contacts;
  }


  public void setContacts(TagRelationsContacts contacts) {
    this.contacts = contacts;
  }


  public TagRelations items(TagRelationsItems items) {
    
    this.items = items;
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TagRelationsItems getItems() {
    return items;
  }


  public void setItems(TagRelationsItems items) {
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
    TagRelations tagRelations = (TagRelations) o;
    return Objects.equals(this.broadcasts, tagRelations.broadcasts) &&
        Objects.equals(this.programs, tagRelations.programs) &&
        Objects.equals(this.contacts, tagRelations.contacts) &&
        Objects.equals(this.items, tagRelations.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(broadcasts, programs, contacts, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagRelations {\n");
    sb.append("    broadcasts: ").append(toIndentedString(broadcasts)).append("\n");
    sb.append("    programs: ").append(toIndentedString(programs)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
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

