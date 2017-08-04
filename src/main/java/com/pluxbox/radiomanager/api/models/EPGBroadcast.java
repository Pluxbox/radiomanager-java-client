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
import com.pluxbox.radiomanager.api.models.BroadcastResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EPGBroadcast
 */

public class EPGBroadcast {
  @SerializedName("2016-01-11")
  private List<BroadcastResult> _20160111 = new ArrayList<BroadcastResult>();

  @SerializedName("next_page_url")
  private String nextPageUrl = "https://raidiomanager.pluxbox.com/api/v1/broadcasts/epg/{identifier}/2016-01-12";

  @SerializedName("prev_page_url")
  private String prevPageUrl = "https://raidiomanager.pluxbox.com/pb/api/v1/broadcasts/epg/{identifier}/2016-01-10";

  public EPGBroadcast _20160111(List<BroadcastResult> _20160111) {
    this._20160111 = _20160111;
    return this;
  }

  public EPGBroadcast add20160111Item(BroadcastResult _20160111Item) {
    this._20160111.add(_20160111Item);
    return this;
  }

   /**
   * Get _20160111
   * @return _20160111
  **/
  @ApiModelProperty(required = true, value = "")
  public List<BroadcastResult> get20160111() {
    return _20160111;
  }

  public void set20160111(List<BroadcastResult> _20160111) {
    this._20160111 = _20160111;
  }

  public EPGBroadcast nextPageUrl(String nextPageUrl) {
    this.nextPageUrl = nextPageUrl;
    return this;
  }

   /**
   * Get nextPageUrl
   * @return nextPageUrl
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNextPageUrl() {
    return nextPageUrl;
  }

  public void setNextPageUrl(String nextPageUrl) {
    this.nextPageUrl = nextPageUrl;
  }

  public EPGBroadcast prevPageUrl(String prevPageUrl) {
    this.prevPageUrl = prevPageUrl;
    return this;
  }

   /**
   * Get prevPageUrl
   * @return prevPageUrl
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPrevPageUrl() {
    return prevPageUrl;
  }

  public void setPrevPageUrl(String prevPageUrl) {
    this.prevPageUrl = prevPageUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EPGBroadcast epGBroadcast = (EPGBroadcast) o;
    return Objects.equals(this._20160111, epGBroadcast._20160111) &&
        Objects.equals(this.nextPageUrl, epGBroadcast.nextPageUrl) &&
        Objects.equals(this.prevPageUrl, epGBroadcast.prevPageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_20160111, nextPageUrl, prevPageUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EPGBroadcast {\n");
    
    sb.append("    _20160111: ").append(toIndentedString(_20160111)).append("\n");
    sb.append("    nextPageUrl: ").append(toIndentedString(nextPageUrl)).append("\n");
    sb.append("    prevPageUrl: ").append(toIndentedString(prevPageUrl)).append("\n");
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

