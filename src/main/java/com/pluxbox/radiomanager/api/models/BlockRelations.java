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
import com.pluxbox.radiomanager.api.models.BlockRelationsBroadcast;
import com.pluxbox.radiomanager.api.models.BlockRelationsItems;
import com.pluxbox.radiomanager.api.models.BlockRelationsProgram;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BlockRelations
 */

public class BlockRelations {
  @SerializedName("items")
  private BlockRelationsItems items = null;

  @SerializedName("broadcast")
  private BlockRelationsBroadcast broadcast = null;

  @SerializedName("program")
  private BlockRelationsProgram program = null;

  public BlockRelations items(BlockRelationsItems items) {
    this.items = items;
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public BlockRelationsItems getItems() {
    return items;
  }

  public void setItems(BlockRelationsItems items) {
    this.items = items;
  }

  public BlockRelations broadcast(BlockRelationsBroadcast broadcast) {
    this.broadcast = broadcast;
    return this;
  }

   /**
   * Get broadcast
   * @return broadcast
  **/
  @ApiModelProperty(value = "")
  public BlockRelationsBroadcast getBroadcast() {
    return broadcast;
  }

  public void setBroadcast(BlockRelationsBroadcast broadcast) {
    this.broadcast = broadcast;
  }

  public BlockRelations program(BlockRelationsProgram program) {
    this.program = program;
    return this;
  }

   /**
   * Get program
   * @return program
  **/
  @ApiModelProperty(value = "")
  public BlockRelationsProgram getProgram() {
    return program;
  }

  public void setProgram(BlockRelationsProgram program) {
    this.program = program;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockRelations blockRelations = (BlockRelations) o;
    return Objects.equals(this.items, blockRelations.items) &&
        Objects.equals(this.broadcast, blockRelations.broadcast) &&
        Objects.equals(this.program, blockRelations.program);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, broadcast, program);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockRelations {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    broadcast: ").append(toIndentedString(broadcast)).append("\n");
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
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
