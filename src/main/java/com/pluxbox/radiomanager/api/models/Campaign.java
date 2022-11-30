/*
 * RadioManager
 * This OpenAPI 3 Document describes the functionality of the API v2 of RadioManager. Note that no rights can be derived from this Document and the true functionality of the API might differ.
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
import java.time.OffsetDateTime;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.pluxbox.radiomanager.api.invoker.JSON;

/**
 * Campaign
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Campaign {
  public static final String SERIALIZED_NAME_MODEL_TYPE_ID = "model_type_id";
  @SerializedName(SERIALIZED_NAME_MODEL_TYPE_ID)
  private Long modelTypeId;

  public static final String SERIALIZED_NAME_FIELD_VALUES = "field_values";
  @SerializedName(SERIALIZED_NAME_FIELD_VALUES)
  private Object fieldValues;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private OffsetDateTime start;

  public static final String SERIALIZED_NAME_STOP = "stop";
  @SerializedName(SERIALIZED_NAME_STOP)
  private OffsetDateTime stop;

  public static final String SERIALIZED_NAME_RECOMMENDED = "recommended";
  @SerializedName(SERIALIZED_NAME_RECOMMENDED)
  private Boolean recommended;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public Campaign() {
  }

  public Campaign modelTypeId(Long modelTypeId) {
    
    this.modelTypeId = modelTypeId;
    return this;
  }

   /**
   * Get modelTypeId
   * @return modelTypeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "")

  public Long getModelTypeId() {
    return modelTypeId;
  }


  public void setModelTypeId(Long modelTypeId) {
    this.modelTypeId = modelTypeId;
  }


  public Campaign fieldValues(Object fieldValues) {
    
    this.fieldValues = fieldValues;
    return this;
  }

   /**
   * Get fieldValues
   * @return fieldValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getFieldValues() {
    return fieldValues;
  }


  public void setFieldValues(Object fieldValues) {
    this.fieldValues = fieldValues;
  }


  public Campaign title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FooBar", value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Campaign start(OffsetDateTime start) {
    
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", required = true, value = "")

  public OffsetDateTime getStart() {
    return start;
  }


  public void setStart(OffsetDateTime start) {
    this.start = start;
  }


  public Campaign stop(OffsetDateTime stop) {
    
    this.stop = stop;
    return this;
  }

   /**
   * Get stop
   * @return stop
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", required = true, value = "")

  public OffsetDateTime getStop() {
    return stop;
  }


  public void setStop(OffsetDateTime stop) {
    this.stop = stop;
  }


  public Campaign recommended(Boolean recommended) {
    
    this.recommended = recommended;
    return this;
  }

   /**
   * Get recommended
   * @return recommended
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getRecommended() {
    return recommended;
  }


  public void setRecommended(Boolean recommended) {
    this.recommended = recommended;
  }


  public Campaign description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<div class=\\'rm-content\\'></div>\\n", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Campaign campaign = (Campaign) o;
    return Objects.equals(this.modelTypeId, campaign.modelTypeId) &&
        Objects.equals(this.fieldValues, campaign.fieldValues) &&
        Objects.equals(this.title, campaign.title) &&
        Objects.equals(this.start, campaign.start) &&
        Objects.equals(this.stop, campaign.stop) &&
        Objects.equals(this.recommended, campaign.recommended) &&
        Objects.equals(this.description, campaign.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelTypeId, fieldValues, title, start, stop, recommended, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Campaign {\n");
    sb.append("    modelTypeId: ").append(toIndentedString(modelTypeId)).append("\n");
    sb.append("    fieldValues: ").append(toIndentedString(fieldValues)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    recommended: ").append(toIndentedString(recommended)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("model_type_id");
    openapiFields.add("field_values");
    openapiFields.add("title");
    openapiFields.add("start");
    openapiFields.add("stop");
    openapiFields.add("recommended");
    openapiFields.add("description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("model_type_id");
    openapiRequiredFields.add("start");
    openapiRequiredFields.add("stop");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Campaign
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Campaign.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Campaign is not found in the empty JSON string", Campaign.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Campaign.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Campaign` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Campaign.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Campaign.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Campaign' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Campaign> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Campaign.class));

       return (TypeAdapter<T>) new TypeAdapter<Campaign>() {
           @Override
           public void write(JsonWriter out, Campaign value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Campaign read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Campaign given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Campaign
  * @throws IOException if the JSON string is invalid with respect to Campaign
  */
  public static Campaign fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Campaign.class);
  }

 /**
  * Convert an instance of Campaign to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

