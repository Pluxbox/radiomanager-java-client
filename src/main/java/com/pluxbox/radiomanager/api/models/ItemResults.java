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
import com.pluxbox.radiomanager.api.models.ItemResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ItemResults
 */

public class ItemResults {
  @SerializedName("current_page")
  private Long currentPage = null;

  @SerializedName("from")
  private Long from = null;

  @SerializedName("last_page")
  private Long lastPage = null;

  @SerializedName("next_page_url")
  private String nextPageUrl = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("per_page")
  private Long perPage = null;

  @SerializedName("to")
  private Long to = null;

  @SerializedName("total")
  private Long total = null;

  @SerializedName("results")
  private List<ItemResult> results = null;

   /**
   * Get currentPage
   * @return currentPage
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getCurrentPage() {
    return currentPage;
  }

   /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getFrom() {
    return from;
  }

   /**
   * Get lastPage
   * @return lastPage
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getLastPage() {
    return lastPage;
  }

   /**
   * Get nextPageUrl
   * @return nextPageUrl
  **/
  @ApiModelProperty(example = "/items", value = "")
  public String getNextPageUrl() {
    return nextPageUrl;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(example = "/api/v2/items", value = "")
  public String getPath() {
    return path;
  }

   /**
   * Get perPage
   * @return perPage
  **/
  @ApiModelProperty(example = "50", value = "")
  public Long getPerPage() {
    return perPage;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getTo() {
    return to;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getTotal() {
    return total;
  }

  public ItemResults results(List<ItemResult> results) {
    this.results = results;
    return this;
  }

  public ItemResults addResultsItem(ItemResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<ItemResult>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(value = "")
  public List<ItemResult> getResults() {
    return results;
  }

  public void setResults(List<ItemResult> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemResults itemResults = (ItemResults) o;
    return Objects.equals(this.currentPage, itemResults.currentPage) &&
        Objects.equals(this.from, itemResults.from) &&
        Objects.equals(this.lastPage, itemResults.lastPage) &&
        Objects.equals(this.nextPageUrl, itemResults.nextPageUrl) &&
        Objects.equals(this.path, itemResults.path) &&
        Objects.equals(this.perPage, itemResults.perPage) &&
        Objects.equals(this.to, itemResults.to) &&
        Objects.equals(this.total, itemResults.total) &&
        Objects.equals(this.results, itemResults.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, from, lastPage, nextPageUrl, path, perPage, to, total, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemResults {\n");
    
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    lastPage: ").append(toIndentedString(lastPage)).append("\n");
    sb.append("    nextPageUrl: ").append(toIndentedString(nextPageUrl)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

