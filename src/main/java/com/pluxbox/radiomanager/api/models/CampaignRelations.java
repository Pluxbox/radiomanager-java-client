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
import com.pluxbox.radiomanager.api.models.BroadcastRelationsModelType;
import com.pluxbox.radiomanager.api.models.CampaignRelationsItems;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * CampaignRelations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignRelations {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private CampaignRelationsItems items;

  public static final String SERIALIZED_NAME_MODEL_TYPE = "model_type";
  @SerializedName(SERIALIZED_NAME_MODEL_TYPE)
  private BroadcastRelationsModelType modelType;

  public CampaignRelations() {
  }

  public CampaignRelations items(CampaignRelationsItems items) {
    
    this.items = items;
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CampaignRelationsItems getItems() {
    return items;
  }


  public void setItems(CampaignRelationsItems items) {
    this.items = items;
  }


  public CampaignRelations modelType(BroadcastRelationsModelType modelType) {
    
    this.modelType = modelType;
    return this;
  }

   /**
   * Get modelType
   * @return modelType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BroadcastRelationsModelType getModelType() {
    return modelType;
  }


  public void setModelType(BroadcastRelationsModelType modelType) {
    this.modelType = modelType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRelations campaignRelations = (CampaignRelations) o;
    return Objects.equals(this.items, campaignRelations.items) &&
        Objects.equals(this.modelType, campaignRelations.modelType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, modelType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRelations {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    modelType: ").append(toIndentedString(modelType)).append("\n");
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
    openapiFields.add("items");
    openapiFields.add("model_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CampaignRelations
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CampaignRelations.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CampaignRelations is not found in the empty JSON string", CampaignRelations.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CampaignRelations.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CampaignRelations` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `items`
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        CampaignRelationsItems.validateJsonObject(jsonObj.getAsJsonObject("items"));
      }
      // validate the optional field `model_type`
      if (jsonObj.get("model_type") != null && !jsonObj.get("model_type").isJsonNull()) {
        BroadcastRelationsModelType.validateJsonObject(jsonObj.getAsJsonObject("model_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CampaignRelations.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignRelations' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignRelations> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignRelations.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignRelations>() {
           @Override
           public void write(JsonWriter out, CampaignRelations value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CampaignRelations read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CampaignRelations given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignRelations
  * @throws IOException if the JSON string is invalid with respect to CampaignRelations
  */
  public static CampaignRelations fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignRelations.class);
  }

 /**
  * Convert an instance of CampaignRelations to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

