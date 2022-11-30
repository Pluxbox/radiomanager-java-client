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
 * Item
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Item {
  public static final String SERIALIZED_NAME_MODEL_TYPE_ID = "model_type_id";
  @SerializedName(SERIALIZED_NAME_MODEL_TYPE_ID)
  private Long modelTypeId;

  public static final String SERIALIZED_NAME_BLOCK_ID = "block_id";
  @SerializedName(SERIALIZED_NAME_BLOCK_ID)
  private Long blockId;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_FIELD_VALUES = "field_values";
  @SerializedName(SERIALIZED_NAME_FIELD_VALUES)
  private Object fieldValues;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Long duration;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private OffsetDateTime start;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SCHEDULED("scheduled"),
    
    PLAYING("playing"),
    
    PLAYED("played");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_IMPORT = "import";
  @SerializedName(SERIALIZED_NAME_IMPORT)
  private Long _import;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId;

  public static final String SERIALIZED_NAME_RECOMMENDED = "recommended";
  @SerializedName(SERIALIZED_NAME_RECOMMENDED)
  private Boolean recommended;

  public static final String SERIALIZED_NAME_STATION_DRAFT_ID = "station_draft_id";
  @SerializedName(SERIALIZED_NAME_STATION_DRAFT_ID)
  private Long stationDraftId;

  public static final String SERIALIZED_NAME_PROGRAM_DRAFT_ID = "program_draft_id";
  @SerializedName(SERIALIZED_NAME_PROGRAM_DRAFT_ID)
  private Long programDraftId;

  public static final String SERIALIZED_NAME_USER_DRAFT_ID = "user_draft_id";
  @SerializedName(SERIALIZED_NAME_USER_DRAFT_ID)
  private Long userDraftId;

  public static final String SERIALIZED_NAME_STATIC_START = "static_start";
  @SerializedName(SERIALIZED_NAME_STATIC_START)
  private Boolean staticStart;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  public Item() {
  }

  public Item modelTypeId(Long modelTypeId) {
    
    this.modelTypeId = modelTypeId;
    return this;
  }

   /**
   * Get modelTypeId
   * @return modelTypeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "14", required = true, value = "")

  public Long getModelTypeId() {
    return modelTypeId;
  }


  public void setModelTypeId(Long modelTypeId) {
    this.modelTypeId = modelTypeId;
  }


  public Item blockId(Long blockId) {
    
    this.blockId = blockId;
    return this;
  }

   /**
   * Get blockId
   * @return blockId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getBlockId() {
    return blockId;
  }


  public void setBlockId(Long blockId) {
    this.blockId = blockId;
  }


  public Item externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public Item fieldValues(Object fieldValues) {
    
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


  public Item title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FooBar Show", value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Item duration(Long duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "120", value = "")

  public Long getDuration() {
    return duration;
  }


  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public Item start(OffsetDateTime start) {
    
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-06-23T12:00+02:00", value = "")

  public OffsetDateTime getStart() {
    return start;
  }


  public void setStart(OffsetDateTime start) {
    this.start = start;
  }


  public Item status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "scheduled", value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Item _import(Long _import) {
    
    this._import = _import;
    return this;
  }

   /**
   * Get _import
   * @return _import
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Long getImport() {
    return _import;
  }


  public void setImport(Long _import) {
    this._import = _import;
  }


  public Item campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public Item recommended(Boolean recommended) {
    
    this.recommended = recommended;
    return this;
  }

   /**
   * Get recommended
   * @return recommended
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getRecommended() {
    return recommended;
  }


  public void setRecommended(Boolean recommended) {
    this.recommended = recommended;
  }


  public Item stationDraftId(Long stationDraftId) {
    
    this.stationDraftId = stationDraftId;
    return this;
  }

   /**
   * Get stationDraftId
   * @return stationDraftId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Long getStationDraftId() {
    return stationDraftId;
  }


  public void setStationDraftId(Long stationDraftId) {
    this.stationDraftId = stationDraftId;
  }


  public Item programDraftId(Long programDraftId) {
    
    this.programDraftId = programDraftId;
    return this;
  }

   /**
   * Get programDraftId
   * @return programDraftId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Long getProgramDraftId() {
    return programDraftId;
  }


  public void setProgramDraftId(Long programDraftId) {
    this.programDraftId = programDraftId;
  }


  public Item userDraftId(Long userDraftId) {
    
    this.userDraftId = userDraftId;
    return this;
  }

   /**
   * Get userDraftId
   * @return userDraftId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Long getUserDraftId() {
    return userDraftId;
  }


  public void setUserDraftId(Long userDraftId) {
    this.userDraftId = userDraftId;
  }


  public Item staticStart(Boolean staticStart) {
    
    this.staticStart = staticStart;
    return this;
  }

   /**
   * Get staticStart
   * @return staticStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getStaticStart() {
    return staticStart;
  }


  public void setStaticStart(Boolean staticStart) {
    this.staticStart = staticStart;
  }


  public Item details(String details) {
    
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<div class=\"rm-content\">Details of item</div>\\n", value = "")

  public String getDetails() {
    return details;
  }


  public void setDetails(String details) {
    this.details = details;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.modelTypeId, item.modelTypeId) &&
        Objects.equals(this.blockId, item.blockId) &&
        Objects.equals(this.externalId, item.externalId) &&
        Objects.equals(this.fieldValues, item.fieldValues) &&
        Objects.equals(this.title, item.title) &&
        Objects.equals(this.duration, item.duration) &&
        Objects.equals(this.start, item.start) &&
        Objects.equals(this.status, item.status) &&
        Objects.equals(this._import, item._import) &&
        Objects.equals(this.campaignId, item.campaignId) &&
        Objects.equals(this.recommended, item.recommended) &&
        Objects.equals(this.stationDraftId, item.stationDraftId) &&
        Objects.equals(this.programDraftId, item.programDraftId) &&
        Objects.equals(this.userDraftId, item.userDraftId) &&
        Objects.equals(this.staticStart, item.staticStart) &&
        Objects.equals(this.details, item.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelTypeId, blockId, externalId, fieldValues, title, duration, start, status, _import, campaignId, recommended, stationDraftId, programDraftId, userDraftId, staticStart, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    sb.append("    modelTypeId: ").append(toIndentedString(modelTypeId)).append("\n");
    sb.append("    blockId: ").append(toIndentedString(blockId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    fieldValues: ").append(toIndentedString(fieldValues)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    _import: ").append(toIndentedString(_import)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    recommended: ").append(toIndentedString(recommended)).append("\n");
    sb.append("    stationDraftId: ").append(toIndentedString(stationDraftId)).append("\n");
    sb.append("    programDraftId: ").append(toIndentedString(programDraftId)).append("\n");
    sb.append("    userDraftId: ").append(toIndentedString(userDraftId)).append("\n");
    sb.append("    staticStart: ").append(toIndentedString(staticStart)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
    openapiFields.add("block_id");
    openapiFields.add("external_id");
    openapiFields.add("field_values");
    openapiFields.add("title");
    openapiFields.add("duration");
    openapiFields.add("start");
    openapiFields.add("status");
    openapiFields.add("import");
    openapiFields.add("campaign_id");
    openapiFields.add("recommended");
    openapiFields.add("station_draft_id");
    openapiFields.add("program_draft_id");
    openapiFields.add("user_draft_id");
    openapiFields.add("static_start");
    openapiFields.add("details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("model_type_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Item
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Item.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Item is not found in the empty JSON string", Item.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Item.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Item` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Item.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) && !jsonObj.get("details").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `details` to be a primitive type in the JSON string but got `%s`", jsonObj.get("details").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Item.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Item' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Item> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Item.class));

       return (TypeAdapter<T>) new TypeAdapter<Item>() {
           @Override
           public void write(JsonWriter out, Item value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Item read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Item given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Item
  * @throws IOException if the JSON string is invalid with respect to Item
  */
  public static Item fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Item.class);
  }

 /**
  * Convert an instance of Item to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

