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
 * StationResultStationStartDays
 */

public class StationResultStationStartDays {
  @SerializedName("monday")
  private String monday = null;

  @SerializedName("tuesday")
  private String tuesday = null;

  @SerializedName("wednesday")
  private String wednesday = null;

  @SerializedName("thursday")
  private String thursday = null;

  @SerializedName("friday")
  private String friday = null;

  @SerializedName("saturday")
  private String saturday = null;

  @SerializedName("sunday")
  private String sunday = null;

  public StationResultStationStartDays monday(String monday) {
    this.monday = monday;
    return this;
  }

   /**
   * Get monday
   * @return monday
  **/
  @ApiModelProperty(example = "6:00", value = "")
  public String getMonday() {
    return monday;
  }

  public void setMonday(String monday) {
    this.monday = monday;
  }

  public StationResultStationStartDays tuesday(String tuesday) {
    this.tuesday = tuesday;
    return this;
  }

   /**
   * Get tuesday
   * @return tuesday
  **/
  @ApiModelProperty(example = "6:00", value = "")
  public String getTuesday() {
    return tuesday;
  }

  public void setTuesday(String tuesday) {
    this.tuesday = tuesday;
  }

  public StationResultStationStartDays wednesday(String wednesday) {
    this.wednesday = wednesday;
    return this;
  }

   /**
   * Get wednesday
   * @return wednesday
  **/
  @ApiModelProperty(example = "6:00", value = "")
  public String getWednesday() {
    return wednesday;
  }

  public void setWednesday(String wednesday) {
    this.wednesday = wednesday;
  }

  public StationResultStationStartDays thursday(String thursday) {
    this.thursday = thursday;
    return this;
  }

   /**
   * Get thursday
   * @return thursday
  **/
  @ApiModelProperty(example = "6:00", value = "")
  public String getThursday() {
    return thursday;
  }

  public void setThursday(String thursday) {
    this.thursday = thursday;
  }

  public StationResultStationStartDays friday(String friday) {
    this.friday = friday;
    return this;
  }

   /**
   * Get friday
   * @return friday
  **/
  @ApiModelProperty(example = "6:00", value = "")
  public String getFriday() {
    return friday;
  }

  public void setFriday(String friday) {
    this.friday = friday;
  }

  public StationResultStationStartDays saturday(String saturday) {
    this.saturday = saturday;
    return this;
  }

   /**
   * Get saturday
   * @return saturday
  **/
  @ApiModelProperty(example = "6:00", value = "")
  public String getSaturday() {
    return saturday;
  }

  public void setSaturday(String saturday) {
    this.saturday = saturday;
  }

  public StationResultStationStartDays sunday(String sunday) {
    this.sunday = sunday;
    return this;
  }

   /**
   * Get sunday
   * @return sunday
  **/
  @ApiModelProperty(example = "6:00", value = "")
  public String getSunday() {
    return sunday;
  }

  public void setSunday(String sunday) {
    this.sunday = sunday;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StationResultStationStartDays stationResultStationStartDays = (StationResultStationStartDays) o;
    return Objects.equals(this.monday, stationResultStationStartDays.monday) &&
        Objects.equals(this.tuesday, stationResultStationStartDays.tuesday) &&
        Objects.equals(this.wednesday, stationResultStationStartDays.wednesday) &&
        Objects.equals(this.thursday, stationResultStationStartDays.thursday) &&
        Objects.equals(this.friday, stationResultStationStartDays.friday) &&
        Objects.equals(this.saturday, stationResultStationStartDays.saturday) &&
        Objects.equals(this.sunday, stationResultStationStartDays.sunday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monday, tuesday, wednesday, thursday, friday, saturday, sunday);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StationResultStationStartDays {\n");
    
    sb.append("    monday: ").append(toIndentedString(monday)).append("\n");
    sb.append("    tuesday: ").append(toIndentedString(tuesday)).append("\n");
    sb.append("    wednesday: ").append(toIndentedString(wednesday)).append("\n");
    sb.append("    thursday: ").append(toIndentedString(thursday)).append("\n");
    sb.append("    friday: ").append(toIndentedString(friday)).append("\n");
    sb.append("    saturday: ").append(toIndentedString(saturday)).append("\n");
    sb.append("    sunday: ").append(toIndentedString(sunday)).append("\n");
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

