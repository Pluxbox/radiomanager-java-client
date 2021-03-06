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
import com.pluxbox.radiomanager.api.models.Genre;
import com.pluxbox.radiomanager.api.models.GenreOutputOnly;
import com.pluxbox.radiomanager.api.models.GenreRelations;
import com.pluxbox.radiomanager.api.models.GenreRelationsBroadcasts;
import com.pluxbox.radiomanager.api.models.GenreRelationsPrograms;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GenreResult
 */

public class GenreResult {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("urn")
  private String urn = null;

  @SerializedName("parent_id")
  private Long parentId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("broadcasts")
  private GenreRelationsBroadcasts broadcasts = null;

  @SerializedName("programs")
  private GenreRelationsPrograms programs = null;

  @SerializedName("_external_station_id")
  private Long externalStationId = null;

  public GenreResult id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "2617", required = true, value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GenreResult urn(String urn) {
    this.urn = urn;
    return this;
  }

   /**
   * Get urn
   * @return urn
  **/
  @ApiModelProperty(example = "urn:tva:metadata:cs:ContentCS:2013:3.1.1.1.3", value = "")
  public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public GenreResult parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(example = "2614", value = "")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public GenreResult name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Chat", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GenreResult broadcasts(GenreRelationsBroadcasts broadcasts) {
    this.broadcasts = broadcasts;
    return this;
  }

   /**
   * Get broadcasts
   * @return broadcasts
  **/
  @ApiModelProperty(value = "")
  public GenreRelationsBroadcasts getBroadcasts() {
    return broadcasts;
  }

  public void setBroadcasts(GenreRelationsBroadcasts broadcasts) {
    this.broadcasts = broadcasts;
  }

  public GenreResult programs(GenreRelationsPrograms programs) {
    this.programs = programs;
    return this;
  }

   /**
   * Get programs
   * @return programs
  **/
  @ApiModelProperty(value = "")
  public GenreRelationsPrograms getPrograms() {
    return programs;
  }

  public void setPrograms(GenreRelationsPrograms programs) {
    this.programs = programs;
  }

  public GenreResult externalStationId(Long externalStationId) {
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
    GenreResult genreResult = (GenreResult) o;
    return Objects.equals(this.id, genreResult.id) &&
        Objects.equals(this.urn, genreResult.urn) &&
        Objects.equals(this.parentId, genreResult.parentId) &&
        Objects.equals(this.name, genreResult.name) &&
        Objects.equals(this.broadcasts, genreResult.broadcasts) &&
        Objects.equals(this.programs, genreResult.programs) &&
        Objects.equals(this.externalStationId, genreResult.externalStationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, urn, parentId, name, broadcasts, programs, externalStationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenreResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    broadcasts: ").append(toIndentedString(broadcasts)).append("\n");
    sb.append("    programs: ").append(toIndentedString(programs)).append("\n");
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

