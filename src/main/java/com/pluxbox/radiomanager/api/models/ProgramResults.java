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
import com.pluxbox.radiomanager.api.models.ProgramResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ProgramResults
 */

public class ProgramResults {
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
  private List<ProgramResult> results = null;

  public ProgramResults currentPage(Long currentPage) {
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

  public ProgramResults from(Long from) {
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

  public ProgramResults lastPage(Long lastPage) {
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

  public ProgramResults nextPageUrl(String nextPageUrl) {
    this.nextPageUrl = nextPageUrl;
    return this;
  }

   /**
   * Get nextPageUrl
   * @return nextPageUrl
  **/
  @ApiModelProperty(example = "/programs", value = "")
  public String getNextPageUrl() {
    return nextPageUrl;
  }

  public void setNextPageUrl(String nextPageUrl) {
    this.nextPageUrl = nextPageUrl;
  }

  public ProgramResults path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(example = "/api/v2/programs", value = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ProgramResults perPage(Long perPage) {
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

  public ProgramResults prevPageUrl(String prevPageUrl) {
    this.prevPageUrl = prevPageUrl;
    return this;
  }

   /**
   * Get prevPageUrl
   * @return prevPageUrl
  **/
  @ApiModelProperty(example = "/programs", value = "")
  public String getPrevPageUrl() {
    return prevPageUrl;
  }

  public void setPrevPageUrl(String prevPageUrl) {
    this.prevPageUrl = prevPageUrl;
  }

  public ProgramResults to(Long to) {
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

  public ProgramResults total(Long total) {
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

  public ProgramResults results(List<ProgramResult> results) {
    this.results = results;
    return this;
  }

  public ProgramResults addResultsItem(ProgramResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<ProgramResult>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(value = "")
  public List<ProgramResult> getResults() {
    return results;
  }

  public void setResults(List<ProgramResult> results) {
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
    ProgramResults programResults = (ProgramResults) o;
    return Objects.equals(this.currentPage, programResults.currentPage) &&
        Objects.equals(this.from, programResults.from) &&
        Objects.equals(this.lastPage, programResults.lastPage) &&
        Objects.equals(this.nextPageUrl, programResults.nextPageUrl) &&
        Objects.equals(this.path, programResults.path) &&
        Objects.equals(this.perPage, programResults.perPage) &&
        Objects.equals(this.prevPageUrl, programResults.prevPageUrl) &&
        Objects.equals(this.to, programResults.to) &&
        Objects.equals(this.total, programResults.total) &&
        Objects.equals(this.results, programResults.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, from, lastPage, nextPageUrl, path, perPage, prevPageUrl, to, total, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramResults {\n");
    
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

