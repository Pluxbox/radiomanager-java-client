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
import com.pluxbox.radiomanager.api.models.ImportItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

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
 * PlaylistMergeBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlaylistMergeBody {
  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private OffsetDateTime start;

  public static final String SERIALIZED_NAME_ALLOW_PLAYLIST_PAST = "allow_playlist_past";
  @SerializedName(SERIALIZED_NAME_ALLOW_PLAYLIST_PAST)
  private Integer allowPlaylistPast;

  public static final String SERIALIZED_NAME_BROADCAST_ID = "broadcast_id";
  @SerializedName(SERIALIZED_NAME_BROADCAST_ID)
  private Long broadcastId;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<ImportItem> items = null;

  public PlaylistMergeBody() {
  }

  public PlaylistMergeBody start(OffsetDateTime start) {
    
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStart() {
    return start;
  }


  public void setStart(OffsetDateTime start) {
    this.start = start;
  }


  public PlaylistMergeBody allowPlaylistPast(Integer allowPlaylistPast) {
    
    this.allowPlaylistPast = allowPlaylistPast;
    return this;
  }

   /**
   * Get allowPlaylistPast
   * @return allowPlaylistPast
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAllowPlaylistPast() {
    return allowPlaylistPast;
  }


  public void setAllowPlaylistPast(Integer allowPlaylistPast) {
    this.allowPlaylistPast = allowPlaylistPast;
  }


  public PlaylistMergeBody broadcastId(Long broadcastId) {
    
    this.broadcastId = broadcastId;
    return this;
  }

   /**
   * Get broadcastId
   * @return broadcastId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBroadcastId() {
    return broadcastId;
  }


  public void setBroadcastId(Long broadcastId) {
    this.broadcastId = broadcastId;
  }


  public PlaylistMergeBody items(List<ImportItem> items) {
    
    this.items = items;
    return this;
  }

  public PlaylistMergeBody addItemsItem(ImportItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ImportItem> getItems() {
    return items;
  }


  public void setItems(List<ImportItem> items) {
    this.items = items;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaylistMergeBody playlistMergeBody = (PlaylistMergeBody) o;
    return Objects.equals(this.start, playlistMergeBody.start) &&
        Objects.equals(this.allowPlaylistPast, playlistMergeBody.allowPlaylistPast) &&
        Objects.equals(this.broadcastId, playlistMergeBody.broadcastId) &&
        Objects.equals(this.items, playlistMergeBody.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, allowPlaylistPast, broadcastId, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaylistMergeBody {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    allowPlaylistPast: ").append(toIndentedString(allowPlaylistPast)).append("\n");
    sb.append("    broadcastId: ").append(toIndentedString(broadcastId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
    openapiFields.add("start");
    openapiFields.add("allow_playlist_past");
    openapiFields.add("broadcast_id");
    openapiFields.add("items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PlaylistMergeBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PlaylistMergeBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlaylistMergeBody is not found in the empty JSON string", PlaylistMergeBody.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PlaylistMergeBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PlaylistMergeBody` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            ImportItem.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlaylistMergeBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlaylistMergeBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlaylistMergeBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlaylistMergeBody.class));

       return (TypeAdapter<T>) new TypeAdapter<PlaylistMergeBody>() {
           @Override
           public void write(JsonWriter out, PlaylistMergeBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PlaylistMergeBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PlaylistMergeBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlaylistMergeBody
  * @throws IOException if the JSON string is invalid with respect to PlaylistMergeBody
  */
  public static PlaylistMergeBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlaylistMergeBody.class);
  }

 /**
  * Convert an instance of PlaylistMergeBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

