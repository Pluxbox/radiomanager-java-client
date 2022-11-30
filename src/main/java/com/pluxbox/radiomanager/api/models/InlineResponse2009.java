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
import com.pluxbox.radiomanager.api.models.ModelTypeResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * InlineResponse2009
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2009 {
  public static final String SERIALIZED_NAME_CURRENT_PAGE = "current_page";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE)
  private Long currentPage;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private Long from;

  public static final String SERIALIZED_NAME_LAST_PAGE = "last_page";
  @SerializedName(SERIALIZED_NAME_LAST_PAGE)
  private Long lastPage;

  public static final String SERIALIZED_NAME_NEXT_PAGE_URL = "next_page_url";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_URL)
  private String nextPageUrl;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PER_PAGE = "per_page";
  @SerializedName(SERIALIZED_NAME_PER_PAGE)
  private Long perPage;

  public static final String SERIALIZED_NAME_PREV_PAGE_URL = "prev_page_url";
  @SerializedName(SERIALIZED_NAME_PREV_PAGE_URL)
  private String prevPageUrl;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private Long to;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Long total;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<ModelTypeResult> results = null;

  public InlineResponse2009() {
  }

  public InlineResponse2009 currentPage(Long currentPage) {
    
    this.currentPage = currentPage;
    return this;
  }

   /**
   * Get currentPage
   * @return currentPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getCurrentPage() {
    return currentPage;
  }


  public void setCurrentPage(Long currentPage) {
    this.currentPage = currentPage;
  }


  public InlineResponse2009 from(Long from) {
    
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getFrom() {
    return from;
  }


  public void setFrom(Long from) {
    this.from = from;
  }


  public InlineResponse2009 lastPage(Long lastPage) {
    
    this.lastPage = lastPage;
    return this;
  }

   /**
   * Get lastPage
   * @return lastPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getLastPage() {
    return lastPage;
  }


  public void setLastPage(Long lastPage) {
    this.lastPage = lastPage;
  }


  public InlineResponse2009 nextPageUrl(String nextPageUrl) {
    
    this.nextPageUrl = nextPageUrl;
    return this;
  }

   /**
   * Get nextPageUrl
   * @return nextPageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/model_types", value = "")

  public String getNextPageUrl() {
    return nextPageUrl;
  }


  public void setNextPageUrl(String nextPageUrl) {
    this.nextPageUrl = nextPageUrl;
  }


  public InlineResponse2009 path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/api/v2/model_types", value = "")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public InlineResponse2009 perPage(Long perPage) {
    
    this.perPage = perPage;
    return this;
  }

   /**
   * Get perPage
   * @return perPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50", value = "")

  public Long getPerPage() {
    return perPage;
  }


  public void setPerPage(Long perPage) {
    this.perPage = perPage;
  }


  public InlineResponse2009 prevPageUrl(String prevPageUrl) {
    
    this.prevPageUrl = prevPageUrl;
    return this;
  }

   /**
   * Get prevPageUrl
   * @return prevPageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/model_types", value = "")

  public String getPrevPageUrl() {
    return prevPageUrl;
  }


  public void setPrevPageUrl(String prevPageUrl) {
    this.prevPageUrl = prevPageUrl;
  }


  public InlineResponse2009 to(Long to) {
    
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getTo() {
    return to;
  }


  public void setTo(Long to) {
    this.to = to;
  }


  public InlineResponse2009 total(Long total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getTotal() {
    return total;
  }


  public void setTotal(Long total) {
    this.total = total;
  }


  public InlineResponse2009 results(List<ModelTypeResult> results) {
    
    this.results = results;
    return this;
  }

  public InlineResponse2009 addResultsItem(ModelTypeResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ModelTypeResult> getResults() {
    return results;
  }


  public void setResults(List<ModelTypeResult> results) {
    this.results = results;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2009 inlineResponse2009 = (InlineResponse2009) o;
    return Objects.equals(this.currentPage, inlineResponse2009.currentPage) &&
        Objects.equals(this.from, inlineResponse2009.from) &&
        Objects.equals(this.lastPage, inlineResponse2009.lastPage) &&
        Objects.equals(this.nextPageUrl, inlineResponse2009.nextPageUrl) &&
        Objects.equals(this.path, inlineResponse2009.path) &&
        Objects.equals(this.perPage, inlineResponse2009.perPage) &&
        Objects.equals(this.prevPageUrl, inlineResponse2009.prevPageUrl) &&
        Objects.equals(this.to, inlineResponse2009.to) &&
        Objects.equals(this.total, inlineResponse2009.total) &&
        Objects.equals(this.results, inlineResponse2009.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, from, lastPage, nextPageUrl, path, perPage, prevPageUrl, to, total, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2009 {\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    lastPage: ").append(toIndentedString(lastPage)).append("\n");
    sb.append("    nextPageUrl: ").append(toIndentedString(nextPageUrl)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    prevPageUrl: ").append(toIndentedString(prevPageUrl)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
    openapiFields.add("current_page");
    openapiFields.add("from");
    openapiFields.add("last_page");
    openapiFields.add("next_page_url");
    openapiFields.add("path");
    openapiFields.add("per_page");
    openapiFields.add("prev_page_url");
    openapiFields.add("to");
    openapiFields.add("total");
    openapiFields.add("results");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InlineResponse2009
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InlineResponse2009.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InlineResponse2009 is not found in the empty JSON string", InlineResponse2009.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InlineResponse2009.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InlineResponse2009` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("next_page_url") != null && !jsonObj.get("next_page_url").isJsonNull()) && !jsonObj.get("next_page_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_page_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_page_url").toString()));
      }
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if ((jsonObj.get("prev_page_url") != null && !jsonObj.get("prev_page_url").isJsonNull()) && !jsonObj.get("prev_page_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prev_page_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prev_page_url").toString()));
      }
      if (jsonObj.get("results") != null && !jsonObj.get("results").isJsonNull()) {
        JsonArray jsonArrayresults = jsonObj.getAsJsonArray("results");
        if (jsonArrayresults != null) {
          // ensure the json data is an array
          if (!jsonObj.get("results").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `results` to be an array in the JSON string but got `%s`", jsonObj.get("results").toString()));
          }

          // validate the optional field `results` (array)
          for (int i = 0; i < jsonArrayresults.size(); i++) {
            ModelTypeResult.validateJsonObject(jsonArrayresults.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InlineResponse2009.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InlineResponse2009' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InlineResponse2009> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InlineResponse2009.class));

       return (TypeAdapter<T>) new TypeAdapter<InlineResponse2009>() {
           @Override
           public void write(JsonWriter out, InlineResponse2009 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InlineResponse2009 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InlineResponse2009 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InlineResponse2009
  * @throws IOException if the JSON string is invalid with respect to InlineResponse2009
  */
  public static InlineResponse2009 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InlineResponse2009.class);
  }

 /**
  * Convert an instance of InlineResponse2009 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

