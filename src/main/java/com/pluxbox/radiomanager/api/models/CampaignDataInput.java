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
import com.pluxbox.radiomanager.api.models.Campaign;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * CampaignDataInput
 */

public class CampaignDataInput {
  @SerializedName("model_type_id")
  private Long modelTypeId = null;

  @SerializedName("field_values")
  private List<Object> fieldValues = null;

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

  public CampaignDataInput modelTypeId(Long modelTypeId) {
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

  public CampaignDataInput fieldValues(List<Object> fieldValues) {
    this.fieldValues = fieldValues;
    return this;
  }

  public CampaignDataInput addFieldValuesItem(Object fieldValuesItem) {
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

  public CampaignDataInput title(String title) {
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

  public CampaignDataInput start(OffsetDateTime start) {
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

  public CampaignDataInput stop(OffsetDateTime stop) {
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

  public CampaignDataInput recommended(Boolean recommended) {
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

  public CampaignDataInput description(String description) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignDataInput campaignDataInput = (CampaignDataInput) o;
    return Objects.equals(this.modelTypeId, campaignDataInput.modelTypeId) &&
        Objects.equals(this.fieldValues, campaignDataInput.fieldValues) &&
        Objects.equals(this.title, campaignDataInput.title) &&
        Objects.equals(this.start, campaignDataInput.start) &&
        Objects.equals(this.stop, campaignDataInput.stop) &&
        Objects.equals(this.recommended, campaignDataInput.recommended) &&
        Objects.equals(this.description, campaignDataInput.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelTypeId, fieldValues, title, start, stop, recommended, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignDataInput {\n");
    
    sb.append("    modelTypeId: ").append(toIndentedString(modelTypeId)).append("\n");
    sb.append("    fieldValues: ").append(toIndentedString(fieldValues)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    recommended: ").append(toIndentedString(recommended)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

