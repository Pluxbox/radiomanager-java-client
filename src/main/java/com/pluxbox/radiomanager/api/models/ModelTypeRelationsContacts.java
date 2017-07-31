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
import com.pluxbox.radiomanager.api.models.ModelTypeRelationsCampaignsParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ModelTypeRelationsContacts
 */

public class ModelTypeRelationsContacts {
  @SerializedName("href")
  private String href = null;

  @SerializedName("model")
  private String model = null;

  @SerializedName("operation")
  private String operation = null;

  @SerializedName("params")
  private ModelTypeRelationsCampaignsParams params = null;

  public ModelTypeRelationsContacts href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(example = "https://radiomanager.pluxbox.com/api/v2/contacts?model_type_id=1", value = "")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ModelTypeRelationsContacts model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(example = "Contact", value = "")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public ModelTypeRelationsContacts operation(String operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @ApiModelProperty(example = "listContacts", value = "")
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public ModelTypeRelationsContacts params(ModelTypeRelationsCampaignsParams params) {
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @ApiModelProperty(value = "")
  public ModelTypeRelationsCampaignsParams getParams() {
    return params;
  }

  public void setParams(ModelTypeRelationsCampaignsParams params) {
    this.params = params;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelTypeRelationsContacts modelTypeRelationsContacts = (ModelTypeRelationsContacts) o;
    return Objects.equals(this.href, modelTypeRelationsContacts.href) &&
        Objects.equals(this.model, modelTypeRelationsContacts.model) &&
        Objects.equals(this.operation, modelTypeRelationsContacts.operation) &&
        Objects.equals(this.params, modelTypeRelationsContacts.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, model, operation, params);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelTypeRelationsContacts {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

