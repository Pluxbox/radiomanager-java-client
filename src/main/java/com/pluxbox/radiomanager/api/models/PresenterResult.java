/*
 * Pluxbox Radiomanager Client
 * Pluxbox RadioManager gives you the power, flexibility and speed you always wanted in a lightweight and easy-to-use web-based radio solution. With Pluxbox RadioManager you can organise your radio workflow and automate your omnichannel communication with your listeners. We offer wide range specialised services for the radio and connections like Hybrid Radio, Visual Radio, your website and social media without losing focus on your broadcast. For more information visit https://pluxbox.com
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
import com.pluxbox.radiomanager.api.models.BroadcastRelationsModelType;
import com.pluxbox.radiomanager.api.models.Presenter;
import com.pluxbox.radiomanager.api.models.PresenterOutputOnly;
import com.pluxbox.radiomanager.api.models.PresenterRelations;
import com.pluxbox.radiomanager.api.models.PresenterRelationsBroadcasts;
import com.pluxbox.radiomanager.api.models.PresenterRelationsPrograms;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * PresenterResult
 */

public class PresenterResult {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("deleted_at")
  private OffsetDateTime deletedAt = null;

  @SerializedName("_external_station_id")
  private Long externalStationId = null;

  @SerializedName("model_type_id")
  private Long modelTypeId = null;

  @SerializedName("field_values")
  private List<Object> fieldValues = null;

  @SerializedName("firstname")
  private String firstname = null;

  @SerializedName("lastname")
  private String lastname = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("programs")
  private PresenterRelationsPrograms programs = null;

  @SerializedName("broadcasts")
  private PresenterRelationsBroadcasts broadcasts = null;

  @SerializedName("model_type")
  private BroadcastRelationsModelType modelType = null;

  public PresenterResult id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PresenterResult updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", required = true, value = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public PresenterResult createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", required = true, value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public PresenterResult deletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Get deletedAt
   * @return deletedAt
  **/
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", required = true, value = "")
  public OffsetDateTime getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
  }

  public PresenterResult externalStationId(Long externalStationId) {
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

  public PresenterResult modelTypeId(Long modelTypeId) {
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

  public PresenterResult fieldValues(List<Object> fieldValues) {
    this.fieldValues = fieldValues;
    return this;
  }

  public PresenterResult addFieldValuesItem(Object fieldValuesItem) {
    if (this.fieldValues == null) {
      this.fieldValues = new ArrayList<Object>();
    }
    this.fieldValues.add(fieldValuesItem);
    return this;
  }

   /**
   * Get fieldValues
   * @return fieldValues
  **/
  @ApiModelProperty(value = "")
  public List<Object> getFieldValues() {
    return fieldValues;
  }

  public void setFieldValues(List<Object> fieldValues) {
    this.fieldValues = fieldValues;
  }

  public PresenterResult firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @ApiModelProperty(example = "Foo", value = "")
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public PresenterResult lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @ApiModelProperty(example = "Bar", value = "")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public PresenterResult active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public PresenterResult name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "FooBar", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PresenterResult programs(PresenterRelationsPrograms programs) {
    this.programs = programs;
    return this;
  }

   /**
   * Get programs
   * @return programs
  **/
  @ApiModelProperty(value = "")
  public PresenterRelationsPrograms getPrograms() {
    return programs;
  }

  public void setPrograms(PresenterRelationsPrograms programs) {
    this.programs = programs;
  }

  public PresenterResult broadcasts(PresenterRelationsBroadcasts broadcasts) {
    this.broadcasts = broadcasts;
    return this;
  }

   /**
   * Get broadcasts
   * @return broadcasts
  **/
  @ApiModelProperty(value = "")
  public PresenterRelationsBroadcasts getBroadcasts() {
    return broadcasts;
  }

  public void setBroadcasts(PresenterRelationsBroadcasts broadcasts) {
    this.broadcasts = broadcasts;
  }

  public PresenterResult modelType(BroadcastRelationsModelType modelType) {
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
    PresenterResult presenterResult = (PresenterResult) o;
    return Objects.equals(this.id, presenterResult.id) &&
        Objects.equals(this.updatedAt, presenterResult.updatedAt) &&
        Objects.equals(this.createdAt, presenterResult.createdAt) &&
        Objects.equals(this.deletedAt, presenterResult.deletedAt) &&
        Objects.equals(this.externalStationId, presenterResult.externalStationId) &&
        Objects.equals(this.modelTypeId, presenterResult.modelTypeId) &&
        Objects.equals(this.fieldValues, presenterResult.fieldValues) &&
        Objects.equals(this.firstname, presenterResult.firstname) &&
        Objects.equals(this.lastname, presenterResult.lastname) &&
        Objects.equals(this.active, presenterResult.active) &&
        Objects.equals(this.name, presenterResult.name) &&
        Objects.equals(this.programs, presenterResult.programs) &&
        Objects.equals(this.broadcasts, presenterResult.broadcasts) &&
        Objects.equals(this.modelType, presenterResult.modelType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, updatedAt, createdAt, deletedAt, externalStationId, modelTypeId, fieldValues, firstname, lastname, active, name, programs, broadcasts, modelType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresenterResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    externalStationId: ").append(toIndentedString(externalStationId)).append("\n");
    sb.append("    modelTypeId: ").append(toIndentedString(modelTypeId)).append("\n");
    sb.append("    fieldValues: ").append(toIndentedString(fieldValues)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    programs: ").append(toIndentedString(programs)).append("\n");
    sb.append("    broadcasts: ").append(toIndentedString(broadcasts)).append("\n");
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
