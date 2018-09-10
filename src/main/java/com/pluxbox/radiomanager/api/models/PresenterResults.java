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
import com.pluxbox.radiomanager.api.models.PresenterResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PresenterResults
 */

public class PresenterResults {
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

  @SerializedName("prev_page_url")
  private String prevPageUrl = null;

  @SerializedName("to")
  private Long to = null;

  @SerializedName("total")
  private Long total = null;

  @SerializedName("results")
  private List<PresenterResult> results = null;

  public PresenterResults currentPage(Long currentPage) {
    this.currentPage = currentPage;
    return this;
  }

   /**
   * Get currentPage
   * @return currentPage
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Long currentPage) {
    this.currentPage = currentPage;
  }

  public PresenterResults from(Long from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getFrom() {
    return from;
  }

  public void setFrom(Long from) {
    this.from = from;
  }

  public PresenterResults lastPage(Long lastPage) {
    this.lastPage = lastPage;
    return this;
  }

   /**
   * Get lastPage
   * @return lastPage
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getLastPage() {
    return lastPage;
  }

  public void setLastPage(Long lastPage) {
    this.lastPage = lastPage;
  }

  public PresenterResults nextPageUrl(String nextPageUrl) {
    this.nextPageUrl = nextPageUrl;
    return this;
  }

   /**
   * Get nextPageUrl
   * @return nextPageUrl
  **/
  @ApiModelProperty(example = "/presenters", value = "")
  public String getNextPageUrl() {
    return nextPageUrl;
  }

  public void setNextPageUrl(String nextPageUrl) {
    this.nextPageUrl = nextPageUrl;
  }

  public PresenterResults path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(example = "/api/v2/presenters", value = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public PresenterResults perPage(Long perPage) {
    this.perPage = perPage;
    return this;
  }

   /**
   * Get perPage
   * @return perPage
  **/
  @ApiModelProperty(example = "50", value = "")
  public Long getPerPage() {
    return perPage;
  }

  public void setPerPage(Long perPage) {
    this.perPage = perPage;
  }

  public PresenterResults prevPageUrl(String prevPageUrl) {
    this.prevPageUrl = prevPageUrl;
    return this;
  }

   /**
   * Get prevPageUrl
   * @return prevPageUrl
  **/
  @ApiModelProperty(example = "/presenters", value = "")
  public String getPrevPageUrl() {
    return prevPageUrl;
  }

  public void setPrevPageUrl(String prevPageUrl) {
    this.prevPageUrl = prevPageUrl;
  }

  public PresenterResults to(Long to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getTo() {
    return to;
  }

  public void setTo(Long to) {
    this.to = to;
  }

  public PresenterResults total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public PresenterResults results(List<PresenterResult> results) {
    this.results = results;
    return this;
  }

  public PresenterResults addResultsItem(PresenterResult resultsItem) {
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
  @ApiModelProperty(value = "")
  public List<PresenterResult> getResults() {
    return results;
  }

  public void setResults(List<PresenterResult> results) {
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
    PresenterResults presenterResults = (PresenterResults) o;
    return Objects.equals(this.currentPage, presenterResults.currentPage) &&
        Objects.equals(this.from, presenterResults.from) &&
        Objects.equals(this.lastPage, presenterResults.lastPage) &&
        Objects.equals(this.nextPageUrl, presenterResults.nextPageUrl) &&
        Objects.equals(this.path, presenterResults.path) &&
        Objects.equals(this.perPage, presenterResults.perPage) &&
        Objects.equals(this.prevPageUrl, presenterResults.prevPageUrl) &&
        Objects.equals(this.to, presenterResults.to) &&
        Objects.equals(this.total, presenterResults.total) &&
        Objects.equals(this.results, presenterResults.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, from, lastPage, nextPageUrl, path, perPage, prevPageUrl, to, total, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresenterResults {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

