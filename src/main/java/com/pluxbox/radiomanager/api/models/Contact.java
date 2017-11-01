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
 * Contact
 */
@ApiModel(description = "Contact")

public class Contact {
  @SerializedName("model_type_id")
  private Long modelTypeId = null;

  @SerializedName("field_values")
  private Object fieldValues = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("firstname")
  private String firstname = null;

  @SerializedName("lastname")
  private String lastname = null;

  @SerializedName("phone")
  private String phone = null;

  public Contact modelTypeId(Long modelTypeId) {
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

  public Contact fieldValues(Object fieldValues) {
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

  public Contact email(String email) {
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

  public Contact firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @ApiModelProperty(example = "Foo", required = true, value = "")
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public Contact lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @ApiModelProperty(example = "Bar", required = true, value = "")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public Contact phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(example = "035-12345678910", value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.modelTypeId, contact.modelTypeId) &&
        Objects.equals(this.fieldValues, contact.fieldValues) &&
        Objects.equals(this.email, contact.email) &&
        Objects.equals(this.firstname, contact.firstname) &&
        Objects.equals(this.lastname, contact.lastname) &&
        Objects.equals(this.phone, contact.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelTypeId, fieldValues, email, firstname, lastname, phone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    modelTypeId: ").append(toIndentedString(modelTypeId)).append("\n");
    sb.append("    fieldValues: ").append(toIndentedString(fieldValues)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

