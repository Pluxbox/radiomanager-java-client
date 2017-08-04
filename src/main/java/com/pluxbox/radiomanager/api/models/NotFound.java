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

/**
 * NotFound
 */

public class NotFound {
  @SerializedName("error")
  private String error = null;

  @SerializedName("statusCode")
  private Long statusCode = null;

  public NotFound error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Given error, describes the problem.
   * @return error
  **/
  @ApiModelProperty(example = "Object not found", required = true, value = "Given error, describes the problem.")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public NotFound statusCode(Long statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Assigned StatusCode, is used in order to create a relationship between Error and Response.
   * @return statusCode
  **/
  @ApiModelProperty(example = "404", required = true, value = "Assigned StatusCode, is used in order to create a relationship between Error and Response.")
  public Long getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Long statusCode) {
    this.statusCode = statusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotFound notFound = (NotFound) o;
    return Objects.equals(this.error, notFound.error) &&
        Objects.equals(this.statusCode, notFound.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, statusCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotFound {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

