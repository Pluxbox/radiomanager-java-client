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
import com.pluxbox.radiomanager.api.models.BroadcastRelationsModelType;
import com.pluxbox.radiomanager.api.models.Contact;
import com.pluxbox.radiomanager.api.models.ContactOutputOnly;
import com.pluxbox.radiomanager.api.models.ContactRelations;
import com.pluxbox.radiomanager.api.models.ContactRelationsItems;
import com.pluxbox.radiomanager.api.models.ContactRelationsTags;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * ContactResult
 */

public class ContactResult {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_DELETED_AT = "deleted_at";
  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  private OffsetDateTime deletedAt;

  public static final String SERIALIZED_NAME_EXTERNAL_STATION_ID = "_external_station_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_STATION_ID)
  private Long externalStationId;

  public static final String SERIALIZED_NAME_MODEL_TYPE_ID = "model_type_id";
  @SerializedName(SERIALIZED_NAME_MODEL_TYPE_ID)
  private Long modelTypeId;

  public static final String SERIALIZED_NAME_FIELD_VALUES = "field_values";
  @SerializedName(SERIALIZED_NAME_FIELD_VALUES)
  private Object fieldValues;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FIRSTNAME = "firstname";
  @SerializedName(SERIALIZED_NAME_FIRSTNAME)
  private String firstname;

  public static final String SERIALIZED_NAME_LASTNAME = "lastname";
  @SerializedName(SERIALIZED_NAME_LASTNAME)
  private String lastname;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private ContactRelationsTags tags;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private ContactRelationsItems items;

  public static final String SERIALIZED_NAME_MODEL_TYPE = "model_type";
  @SerializedName(SERIALIZED_NAME_MODEL_TYPE)
  private BroadcastRelationsModelType modelType;


  public ContactResult id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public ContactResult createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ContactResult updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ContactResult deletedAt(OffsetDateTime deletedAt) {
    
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Get deletedAt
   * @return deletedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", value = "")

  public OffsetDateTime getDeletedAt() {
    return deletedAt;
  }


  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
  }


  public ContactResult externalStationId(Long externalStationId) {
    
    this.externalStationId = externalStationId;
    return this;
  }

   /**
   * Get externalStationId
   * @return externalStationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getExternalStationId() {
    return externalStationId;
  }


  public void setExternalStationId(Long externalStationId) {
    this.externalStationId = externalStationId;
  }


  public ContactResult modelTypeId(Long modelTypeId) {
    
    this.modelTypeId = modelTypeId;
    return this;
  }

   /**
   * Get modelTypeId
   * @return modelTypeId
  **/
  @ApiModelProperty(example = "1", required = true, value = "")

  public Long getModelTypeId() {
    return modelTypeId;
  }


  public void setModelTypeId(Long modelTypeId) {
    this.modelTypeId = modelTypeId;
  }


  public ContactResult fieldValues(Object fieldValues) {
    
    this.fieldValues = fieldValues;
    return this;
  }

   /**
   * Get fieldValues
   * @return fieldValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getFieldValues() {
    return fieldValues;
  }


  public void setFieldValues(Object fieldValues) {
    this.fieldValues = fieldValues;
  }


  public ContactResult email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "info@example.com", value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public ContactResult firstname(String firstname) {
    
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @ApiModelProperty(example = "Foo", required = true, value = "")

  public String getFirstname() {
    return firstname;
  }


  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }


  public ContactResult lastname(String lastname) {
    
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @ApiModelProperty(example = "Bar", required = true, value = "")

  public String getLastname() {
    return lastname;
  }


  public void setLastname(String lastname) {
    this.lastname = lastname;
  }


  public ContactResult phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "035-12345678910", value = "")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public ContactResult tags(ContactRelationsTags tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(required = true, value = "")

  public ContactRelationsTags getTags() {
    return tags;
  }


  public void setTags(ContactRelationsTags tags) {
    this.tags = tags;
  }


  public ContactResult items(ContactRelationsItems items) {
    
    this.items = items;
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContactRelationsItems getItems() {
    return items;
  }


  public void setItems(ContactRelationsItems items) {
    this.items = items;
  }


  public ContactResult modelType(BroadcastRelationsModelType modelType) {
    
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
    ContactResult contactResult = (ContactResult) o;
    return Objects.equals(this.id, contactResult.id) &&
        Objects.equals(this.createdAt, contactResult.createdAt) &&
        Objects.equals(this.updatedAt, contactResult.updatedAt) &&
        Objects.equals(this.deletedAt, contactResult.deletedAt) &&
        Objects.equals(this.externalStationId, contactResult.externalStationId) &&
        Objects.equals(this.modelTypeId, contactResult.modelTypeId) &&
        Objects.equals(this.fieldValues, contactResult.fieldValues) &&
        Objects.equals(this.email, contactResult.email) &&
        Objects.equals(this.firstname, contactResult.firstname) &&
        Objects.equals(this.lastname, contactResult.lastname) &&
        Objects.equals(this.phone, contactResult.phone) &&
        Objects.equals(this.tags, contactResult.tags) &&
        Objects.equals(this.items, contactResult.items) &&
        Objects.equals(this.modelType, contactResult.modelType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, deletedAt, externalStationId, modelTypeId, fieldValues, email, firstname, lastname, phone, tags, items, modelType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactResult {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    externalStationId: ").append(toIndentedString(externalStationId)).append("\n");
    sb.append("    modelTypeId: ").append(toIndentedString(modelTypeId)).append("\n");
    sb.append("    fieldValues: ").append(toIndentedString(fieldValues)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

