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
import com.pluxbox.radiomanager.api.models.PresenterRelationsBroadcasts;
import com.pluxbox.radiomanager.api.models.PresenterRelationsPrograms;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PresenterRelations
 */

public class PresenterRelations {
  @SerializedName("programs")
  private PresenterRelationsPrograms programs = null;

  @SerializedName("broadcasts")
  private PresenterRelationsBroadcasts broadcasts = null;

  @SerializedName("model_type")
  private BroadcastRelationsModelType modelType = null;

  public PresenterRelations programs(PresenterRelationsPrograms programs) {
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

  public PresenterRelations broadcasts(PresenterRelationsBroadcasts broadcasts) {
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

  public PresenterRelations modelType(BroadcastRelationsModelType modelType) {
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
    PresenterRelations presenterRelations = (PresenterRelations) o;
    return Objects.equals(this.programs, presenterRelations.programs) &&
        Objects.equals(this.broadcasts, presenterRelations.broadcasts) &&
        Objects.equals(this.modelType, presenterRelations.modelType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(programs, broadcasts, modelType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresenterRelations {\n");
    
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

