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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GenreOutputOnly
 */

public class GenreOutputOnly {
  @SerializedName("_external_station_id")
  private Long externalStationId = null;

  public GenreOutputOnly externalStationId(Long externalStationId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenreOutputOnly genreOutputOnly = (GenreOutputOnly) o;
    return Objects.equals(this.externalStationId, genreOutputOnly.externalStationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalStationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenreOutputOnly {\n");
    
    sb.append("    externalStationId: ").append(toIndentedString(externalStationId)).append("\n");
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

