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
import java.util.ArrayList;
import java.util.List;

/**
 * ItemInputOnly
 */

public class ItemInputOnly {
  @SerializedName("_previous_id")
  private Long previousId = null;

  @SerializedName("_before_id")
  private Long beforeId = null;

  @SerializedName("contacts")
  private List<Integer> contacts = null;

  @SerializedName("tags")
  private List<Integer> tags = null;

  public ItemInputOnly previousId(Long previousId) {
    this.previousId = previousId;
    return this;
  }

   /**
   * Get previousId
   * @return previousId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getPreviousId() {
    return previousId;
  }

  public void setPreviousId(Long previousId) {
    this.previousId = previousId;
  }

  public ItemInputOnly beforeId(Long beforeId) {
    this.beforeId = beforeId;
    return this;
  }

   /**
   * Get beforeId
   * @return beforeId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getBeforeId() {
    return beforeId;
  }

  public void setBeforeId(Long beforeId) {
    this.beforeId = beforeId;
  }

  public ItemInputOnly contacts(List<Integer> contacts) {
    this.contacts = contacts;
    return this;
  }

  public ItemInputOnly addContactsItem(Integer contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * Get contacts
   * @return contacts
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getContacts() {
    return contacts;
  }

  public void setContacts(List<Integer> contacts) {
    this.contacts = contacts;
  }

  public ItemInputOnly tags(List<Integer> tags) {
    this.tags = tags;
    return this;
  }

  public ItemInputOnly addTagsItem(Integer tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getTags() {
    return tags;
  }

  public void setTags(List<Integer> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemInputOnly itemInputOnly = (ItemInputOnly) o;
    return Objects.equals(this.previousId, itemInputOnly.previousId) &&
        Objects.equals(this.beforeId, itemInputOnly.beforeId) &&
        Objects.equals(this.contacts, itemInputOnly.contacts) &&
        Objects.equals(this.tags, itemInputOnly.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previousId, beforeId, contacts, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemInputOnly {\n");
    
    sb.append("    previousId: ").append(toIndentedString(previousId)).append("\n");
    sb.append("    beforeId: ").append(toIndentedString(beforeId)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

