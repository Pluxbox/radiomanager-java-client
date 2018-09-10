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
 * Program
 */

public class Program {
  @SerializedName("model_type_id")
  private Long modelTypeId = null;

  @SerializedName("field_values")
  private Object fieldValues = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("disabled")
  private Boolean disabled = null;

  @SerializedName("genre_id")
  private Long genreId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("short_name")
  private String shortName = null;

  @SerializedName("medium_name")
  private String mediumName = null;

  @SerializedName("website")
  private String website = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("recommended")
  private Boolean recommended = null;

  @SerializedName("language")
  private String language = null;

  @SerializedName("pty_code_id")
  private Long ptyCodeId = null;

  public Program modelTypeId(Long modelTypeId) {
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

  public Program fieldValues(Object fieldValues) {
    this.fieldValues = fieldValues;
    return this;
  }

   /**
   * Get fieldValues
   * @return fieldValues
  **/
  @ApiModelProperty(value = "")
  public Object getFieldValues() {
    return fieldValues;
  }

  public void setFieldValues(Object fieldValues) {
    this.fieldValues = fieldValues;
  }

  public Program title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "FooBar", required = true, value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Program disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public Program genreId(Long genreId) {
    this.genreId = genreId;
    return this;
  }

   /**
   * Get genreId
   * @return genreId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getGenreId() {
    return genreId;
  }

  public void setGenreId(Long genreId) {
    this.genreId = genreId;
  }

  public Program description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Program shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @ApiModelProperty(example = "Foo", value = "")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public Program mediumName(String mediumName) {
    this.mediumName = mediumName;
    return this;
  }

   /**
   * Get mediumName
   * @return mediumName
  **/
  @ApiModelProperty(example = "FooBar", value = "")
  public String getMediumName() {
    return mediumName;
  }

  public void setMediumName(String mediumName) {
    this.mediumName = mediumName;
  }

  public Program website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @ApiModelProperty(example = "http://example.com/", value = "")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public Program email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "info@example.com", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Program recommended(Boolean recommended) {
    this.recommended = recommended;
    return this;
  }

   /**
   * Get recommended
   * @return recommended
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isRecommended() {
    return recommended;
  }

  public void setRecommended(Boolean recommended) {
    this.recommended = recommended;
  }

  public Program language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(example = "English", value = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Program ptyCodeId(Long ptyCodeId) {
    this.ptyCodeId = ptyCodeId;
    return this;
  }

   /**
   * Get ptyCodeId
   * @return ptyCodeId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getPtyCodeId() {
    return ptyCodeId;
  }

  public void setPtyCodeId(Long ptyCodeId) {
    this.ptyCodeId = ptyCodeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Program program = (Program) o;
    return Objects.equals(this.modelTypeId, program.modelTypeId) &&
        Objects.equals(this.fieldValues, program.fieldValues) &&
        Objects.equals(this.title, program.title) &&
        Objects.equals(this.disabled, program.disabled) &&
        Objects.equals(this.genreId, program.genreId) &&
        Objects.equals(this.description, program.description) &&
        Objects.equals(this.shortName, program.shortName) &&
        Objects.equals(this.mediumName, program.mediumName) &&
        Objects.equals(this.website, program.website) &&
        Objects.equals(this.email, program.email) &&
        Objects.equals(this.recommended, program.recommended) &&
        Objects.equals(this.language, program.language) &&
        Objects.equals(this.ptyCodeId, program.ptyCodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelTypeId, fieldValues, title, disabled, genreId, description, shortName, mediumName, website, email, recommended, language, ptyCodeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Program {\n");
    
    sb.append("    modelTypeId: ").append(toIndentedString(modelTypeId)).append("\n");
    sb.append("    fieldValues: ").append(toIndentedString(fieldValues)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    genreId: ").append(toIndentedString(genreId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    mediumName: ").append(toIndentedString(mediumName)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    recommended: ").append(toIndentedString(recommended)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    ptyCodeId: ").append(toIndentedString(ptyCodeId)).append("\n");
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

