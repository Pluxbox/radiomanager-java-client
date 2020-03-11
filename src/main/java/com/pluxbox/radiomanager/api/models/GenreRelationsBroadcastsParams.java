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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GenreRelationsBroadcastsParams
 */

public class GenreRelationsBroadcastsParams {
  public static final String SERIALIZED_NAME_GENRE_ID = "genre_id";
  @SerializedName(SERIALIZED_NAME_GENRE_ID)
  private Integer genreId;


  public GenreRelationsBroadcastsParams genreId(Integer genreId) {
    
    this.genreId = genreId;
    return this;
  }

   /**
   * Get genreId
   * @return genreId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getGenreId() {
    return genreId;
  }


  public void setGenreId(Integer genreId) {
    this.genreId = genreId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenreRelationsBroadcastsParams genreRelationsBroadcastsParams = (GenreRelationsBroadcastsParams) o;
    return Objects.equals(this.genreId, genreRelationsBroadcastsParams.genreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genreId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenreRelationsBroadcastsParams {\n");
    sb.append("    genreId: ").append(toIndentedString(genreId)).append("\n");
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

