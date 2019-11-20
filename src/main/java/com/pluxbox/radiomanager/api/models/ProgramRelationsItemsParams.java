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
 * ProgramRelationsItemsParams
 */

public class ProgramRelationsItemsParams {
  @SerializedName("program_id")
  private Integer programId = null;

  public ProgramRelationsItemsParams programId(Integer programId) {
    this.programId = programId;
    return this;
  }

   /**
   * Get programId
   * @return programId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getProgramId() {
    return programId;
  }

  public void setProgramId(Integer programId) {
    this.programId = programId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgramRelationsItemsParams programRelationsItemsParams = (ProgramRelationsItemsParams) o;
    return Objects.equals(this.programId, programRelationsItemsParams.programId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(programId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramRelationsItemsParams {\n");
    
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
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

