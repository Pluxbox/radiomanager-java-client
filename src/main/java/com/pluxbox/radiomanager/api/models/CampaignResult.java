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
import com.pluxbox.radiomanager.api.models.BroadcastRelationsModelType;
import com.pluxbox.radiomanager.api.models.Campaign;
import com.pluxbox.radiomanager.api.models.CampaignOutputOnly;
import com.pluxbox.radiomanager.api.models.CampaignRelations;
import com.pluxbox.radiomanager.api.models.CampaignRelationsItems;
import com.pluxbox.radiomanager.api.models.Item;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * CampaignResult
 */

public class CampaignResult {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("deleted_at")
  private OffsetDateTime deletedAt = null;

  @SerializedName("item")
  private Item item = null;

  @SerializedName("_external_station_id")
  private Long externalStationId = null;

  @SerializedName("model_type_id")
  private Long modelTypeId = null;

  @SerializedName("field_values")
  private Object fieldValues = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("start")
  private OffsetDateTime start = null;

  @SerializedName("stop")
  private OffsetDateTime stop = null;

  @SerializedName("recommended")
  private Boolean recommended = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("items")
  private CampaignRelationsItems items = null;

  @SerializedName("model_type")
  private BroadcastRelationsModelType modelType = null;

  public CampaignResult id(Long id) {
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

  public CampaignResult updatedAt(OffsetDateTime updatedAt) {
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

  public CampaignResult createdAt(OffsetDateTime createdAt) {
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

  public CampaignResult deletedAt(OffsetDateTime deletedAt) {
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

  public CampaignResult item(Item item) {
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @ApiModelProperty(value = "")
  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }

  public CampaignResult externalStationId(Long externalStationId) {
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

  public CampaignResult modelTypeId(Long modelTypeId) {
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

  public CampaignResult fieldValues(Object fieldValues) {
    this.fieldValues = fieldValues;
    return this;
  }

   /**
   * Get fieldValues
   * @return fieldValues
  **/
  @ApiModelProperty(value = "")
  public Object getFieldValues() {
    return fieldValues;
  }

  public void setFieldValues(Object fieldValues) {
    this.fieldValues = fieldValues;
  }

  public CampaignResult title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "FooBar", value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CampaignResult start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", required = true, value = "")
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public CampaignResult stop(OffsetDateTime stop) {
    this.stop = stop;
    return this;
  }

   /**
   * Get stop
   * @return stop
  **/
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", required = true, value = "")
  public OffsetDateTime getStop() {
    return stop;
  }

  public void setStop(OffsetDateTime stop) {
    this.stop = stop;
  }

  public CampaignResult recommended(Boolean recommended) {
    this.recommended = recommended;
    return this;
  }

   /**
   * Get recommended
   * @return recommended
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isRecommended() {
    return recommended;
  }

  public void setRecommended(Boolean recommended) {
    this.recommended = recommended;
  }

  public CampaignResult description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "<div class=\\'rm-content\\'></div>\\n", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CampaignResult items(CampaignRelationsItems items) {
    this.items = items;
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public CampaignRelationsItems getItems() {
    return items;
  }

  public void setItems(CampaignRelationsItems items) {
    this.items = items;
  }

  public CampaignResult modelType(BroadcastRelationsModelType modelType) {
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
    CampaignResult campaignResult = (CampaignResult) o;
    return Objects.equals(this.id, campaignResult.id) &&
        Objects.equals(this.updatedAt, campaignResult.updatedAt) &&
        Objects.equals(this.createdAt, campaignResult.createdAt) &&
        Objects.equals(this.deletedAt, campaignResult.deletedAt) &&
        Objects.equals(this.item, campaignResult.item) &&
        Objects.equals(this.externalStationId, campaignResult.externalStationId) &&
        Objects.equals(this.modelTypeId, campaignResult.modelTypeId) &&
        Objects.equals(this.fieldValues, campaignResult.fieldValues) &&
        Objects.equals(this.title, campaignResult.title) &&
        Objects.equals(this.start, campaignResult.start) &&
        Objects.equals(this.stop, campaignResult.stop) &&
        Objects.equals(this.recommended, campaignResult.recommended) &&
        Objects.equals(this.description, campaignResult.description) &&
        Objects.equals(this.items, campaignResult.items) &&
        Objects.equals(this.modelType, campaignResult.modelType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, updatedAt, createdAt, deletedAt, item, externalStationId, modelTypeId, fieldValues, title, start, stop, recommended, description, items, modelType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    externalStationId: ").append(toIndentedString(externalStationId)).append("\n");
    sb.append("    modelTypeId: ").append(toIndentedString(modelTypeId)).append("\n");
    sb.append("    fieldValues: ").append(toIndentedString(fieldValues)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    recommended: ").append(toIndentedString(recommended)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

