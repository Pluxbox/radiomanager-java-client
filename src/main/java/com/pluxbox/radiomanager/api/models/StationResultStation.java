/*
 * RadioManager
 * RadioManager
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
import com.pluxbox.radiomanager.api.models.StationResultStationStartDays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * StationResultStation
 */

public class StationResultStation {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_SYSTEM_NAME = "system_name";
  @SerializedName(SERIALIZED_NAME_SYSTEM_NAME)
  private String systemName;

  public static final String SERIALIZED_NAME_SHORT_NAME = "short_name";
  @SerializedName(SERIALIZED_NAME_SHORT_NAME)
  private String shortName;

  public static final String SERIALIZED_NAME_MEDIUM_NAME = "medium_name";
  @SerializedName(SERIALIZED_NAME_MEDIUM_NAME)
  private String mediumName;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<String> keywords = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SMS = "sms";
  @SerializedName(SERIALIZED_NAME_SMS)
  private String sms;

  public static final String SERIALIZED_NAME_TELEPHONE = "telephone";
  @SerializedName(SERIALIZED_NAME_TELEPHONE)
  private String telephone;

  public static final String SERIALIZED_NAME_GENRE_ID = "genre_id";
  @SerializedName(SERIALIZED_NAME_GENRE_ID)
  private Integer genreId;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_LOGO_RECTANGLE = "logo_rectangle";
  @SerializedName(SERIALIZED_NAME_LOGO_RECTANGLE)
  private String logoRectangle;

  public static final String SERIALIZED_NAME_LOGO128X128 = "logo_128x128";
  @SerializedName(SERIALIZED_NAME_LOGO128X128)
  private String logo128x128;

  public static final String SERIALIZED_NAME_LOGO320X320 = "logo_320x320";
  @SerializedName(SERIALIZED_NAME_LOGO320X320)
  private String logo320x320;

  public static final String SERIALIZED_NAME_LOGO600X600 = "logo_600x600";
  @SerializedName(SERIALIZED_NAME_LOGO600X600)
  private String logo600x600;

  public static final String SERIALIZED_NAME_PAY_OFF = "pay_off";
  @SerializedName(SERIALIZED_NAME_PAY_OFF)
  private String payOff;

  public static final String SERIALIZED_NAME_PTY_CODE = "pty_code";
  @SerializedName(SERIALIZED_NAME_PTY_CODE)
  private Integer ptyCode;

  public static final String SERIALIZED_NAME_PTY_TYPE = "pty_type";
  @SerializedName(SERIALIZED_NAME_PTY_TYPE)
  private String ptyType;

  public static final String SERIALIZED_NAME_STATION_KEY = "station_key";
  @SerializedName(SERIALIZED_NAME_STATION_KEY)
  private String stationKey;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_METADATARADIO_ORGANISATION = "metadataradio_organisation";
  @SerializedName(SERIALIZED_NAME_METADATARADIO_ORGANISATION)
  private String metadataradioOrganisation;

  public static final String SERIALIZED_NAME_METADATARADIO_STATION_ID = "metadataradio_station_id";
  @SerializedName(SERIALIZED_NAME_METADATARADIO_STATION_ID)
  private String metadataradioStationId;

  public static final String SERIALIZED_NAME_START_DAYS = "start_days";
  @SerializedName(SERIALIZED_NAME_START_DAYS)
  private StationResultStationStartDays startDays;


  public StationResultStation id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public StationResultStation name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "stationname", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public StationResultStation createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public StationResultStation updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public StationResultStation systemName(String systemName) {
    
    this.systemName = systemName;
    return this;
  }

   /**
   * Get systemName
   * @return systemName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "stationname", value = "")

  public String getSystemName() {
    return systemName;
  }


  public void setSystemName(String systemName) {
    this.systemName = systemName;
  }


  public StationResultStation shortName(String shortName) {
    
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "stationname", value = "")

  public String getShortName() {
    return shortName;
  }


  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  public StationResultStation mediumName(String mediumName) {
    
    this.mediumName = mediumName;
    return this;
  }

   /**
   * Get mediumName
   * @return mediumName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "stationname", value = "")

  public String getMediumName() {
    return mediumName;
  }


  public void setMediumName(String mediumName) {
    this.mediumName = mediumName;
  }


  public StationResultStation website(String website) {
    
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "none", value = "")

  public String getWebsite() {
    return website;
  }


  public void setWebsite(String website) {
    this.website = website;
  }


  public StationResultStation email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "station@name.com", value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public StationResultStation keywords(List<String> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public StationResultStation addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Get keywords
   * @return keywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getKeywords() {
    return keywords;
  }


  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  public StationResultStation description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "description", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public StationResultStation sms(String sms) {
    
    this.sms = sms;
    return this;
  }

   /**
   * Get sms
   * @return sms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00313552222222", value = "")

  public String getSms() {
    return sms;
  }


  public void setSms(String sms) {
    this.sms = sms;
  }


  public StationResultStation telephone(String telephone) {
    
    this.telephone = telephone;
    return this;
  }

   /**
   * Get telephone
   * @return telephone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00313552222222", value = "")

  public String getTelephone() {
    return telephone;
  }


  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public StationResultStation genreId(Integer genreId) {
    
    this.genreId = genreId;
    return this;
  }

   /**
   * Get genreId
   * @return genreId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3571", value = "")

  public Integer getGenreId() {
    return genreId;
  }


  public void setGenreId(Integer genreId) {
    this.genreId = genreId;
  }


  public StationResultStation language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Dutch", value = "")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public StationResultStation active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public StationResultStation logoRectangle(String logoRectangle) {
    
    this.logoRectangle = logoRectangle;
    return this;
  }

   /**
   * Get logoRectangle
   * @return logoRectangle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "none", value = "")

  public String getLogoRectangle() {
    return logoRectangle;
  }


  public void setLogoRectangle(String logoRectangle) {
    this.logoRectangle = logoRectangle;
  }


  public StationResultStation logo128x128(String logo128x128) {
    
    this.logo128x128 = logo128x128;
    return this;
  }

   /**
   * Get logo128x128
   * @return logo128x128
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "none", value = "")

  public String getLogo128x128() {
    return logo128x128;
  }


  public void setLogo128x128(String logo128x128) {
    this.logo128x128 = logo128x128;
  }


  public StationResultStation logo320x320(String logo320x320) {
    
    this.logo320x320 = logo320x320;
    return this;
  }

   /**
   * Get logo320x320
   * @return logo320x320
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "none", value = "")

  public String getLogo320x320() {
    return logo320x320;
  }


  public void setLogo320x320(String logo320x320) {
    this.logo320x320 = logo320x320;
  }


  public StationResultStation logo600x600(String logo600x600) {
    
    this.logo600x600 = logo600x600;
    return this;
  }

   /**
   * Get logo600x600
   * @return logo600x600
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "none", value = "")

  public String getLogo600x600() {
    return logo600x600;
  }


  public void setLogo600x600(String logo600x600) {
    this.logo600x600 = logo600x600;
  }


  public StationResultStation payOff(String payOff) {
    
    this.payOff = payOff;
    return this;
  }

   /**
   * Get payOff
   * @return payOff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "none", value = "")

  public String getPayOff() {
    return payOff;
  }


  public void setPayOff(String payOff) {
    this.payOff = payOff;
  }


  public StationResultStation ptyCode(Integer ptyCode) {
    
    this.ptyCode = ptyCode;
    return this;
  }

   /**
   * Get ptyCode
   * @return ptyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "")

  public Integer getPtyCode() {
    return ptyCode;
  }


  public void setPtyCode(Integer ptyCode) {
    this.ptyCode = ptyCode;
  }


  public StationResultStation ptyType(String ptyType) {
    
    this.ptyType = ptyType;
    return this;
  }

   /**
   * Get ptyType
   * @return ptyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "rds", value = "")

  public String getPtyType() {
    return ptyType;
  }


  public void setPtyType(String ptyType) {
    this.ptyType = ptyType;
  }


  public StationResultStation stationKey(String stationKey) {
    
    this.stationKey = stationKey;
    return this;
  }

   /**
   * Get stationKey
   * @return stationKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "none", value = "")

  public String getStationKey() {
    return stationKey;
  }


  public void setStationKey(String stationKey) {
    this.stationKey = stationKey;
  }


  public StationResultStation timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Europe/Amsterdam", value = "")

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public StationResultStation metadataradioOrganisation(String metadataradioOrganisation) {
    
    this.metadataradioOrganisation = metadataradioOrganisation;
    return this;
  }

   /**
   * Get metadataradioOrganisation
   * @return metadataradioOrganisation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my organisation", value = "")

  public String getMetadataradioOrganisation() {
    return metadataradioOrganisation;
  }


  public void setMetadataradioOrganisation(String metadataradioOrganisation) {
    this.metadataradioOrganisation = metadataradioOrganisation;
  }


  public StationResultStation metadataradioStationId(String metadataradioStationId) {
    
    this.metadataradioStationId = metadataradioStationId;
    return this;
  }

   /**
   * Get metadataradioStationId
   * @return metadataradioStationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public String getMetadataradioStationId() {
    return metadataradioStationId;
  }


  public void setMetadataradioStationId(String metadataradioStationId) {
    this.metadataradioStationId = metadataradioStationId;
  }


  public StationResultStation startDays(StationResultStationStartDays startDays) {
    
    this.startDays = startDays;
    return this;
  }

   /**
   * Get startDays
   * @return startDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StationResultStationStartDays getStartDays() {
    return startDays;
  }


  public void setStartDays(StationResultStationStartDays startDays) {
    this.startDays = startDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StationResultStation stationResultStation = (StationResultStation) o;
    return Objects.equals(this.id, stationResultStation.id) &&
        Objects.equals(this.name, stationResultStation.name) &&
        Objects.equals(this.createdAt, stationResultStation.createdAt) &&
        Objects.equals(this.updatedAt, stationResultStation.updatedAt) &&
        Objects.equals(this.systemName, stationResultStation.systemName) &&
        Objects.equals(this.shortName, stationResultStation.shortName) &&
        Objects.equals(this.mediumName, stationResultStation.mediumName) &&
        Objects.equals(this.website, stationResultStation.website) &&
        Objects.equals(this.email, stationResultStation.email) &&
        Objects.equals(this.keywords, stationResultStation.keywords) &&
        Objects.equals(this.description, stationResultStation.description) &&
        Objects.equals(this.sms, stationResultStation.sms) &&
        Objects.equals(this.telephone, stationResultStation.telephone) &&
        Objects.equals(this.genreId, stationResultStation.genreId) &&
        Objects.equals(this.language, stationResultStation.language) &&
        Objects.equals(this.active, stationResultStation.active) &&
        Objects.equals(this.logoRectangle, stationResultStation.logoRectangle) &&
        Objects.equals(this.logo128x128, stationResultStation.logo128x128) &&
        Objects.equals(this.logo320x320, stationResultStation.logo320x320) &&
        Objects.equals(this.logo600x600, stationResultStation.logo600x600) &&
        Objects.equals(this.payOff, stationResultStation.payOff) &&
        Objects.equals(this.ptyCode, stationResultStation.ptyCode) &&
        Objects.equals(this.ptyType, stationResultStation.ptyType) &&
        Objects.equals(this.stationKey, stationResultStation.stationKey) &&
        Objects.equals(this.timezone, stationResultStation.timezone) &&
        Objects.equals(this.metadataradioOrganisation, stationResultStation.metadataradioOrganisation) &&
        Objects.equals(this.metadataradioStationId, stationResultStation.metadataradioStationId) &&
        Objects.equals(this.startDays, stationResultStation.startDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, createdAt, updatedAt, systemName, shortName, mediumName, website, email, keywords, description, sms, telephone, genreId, language, active, logoRectangle, logo128x128, logo320x320, logo600x600, payOff, ptyCode, ptyType, stationKey, timezone, metadataradioOrganisation, metadataradioStationId, startDays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StationResultStation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    systemName: ").append(toIndentedString(systemName)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    mediumName: ").append(toIndentedString(mediumName)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    genreId: ").append(toIndentedString(genreId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    logoRectangle: ").append(toIndentedString(logoRectangle)).append("\n");
    sb.append("    logo128x128: ").append(toIndentedString(logo128x128)).append("\n");
    sb.append("    logo320x320: ").append(toIndentedString(logo320x320)).append("\n");
    sb.append("    logo600x600: ").append(toIndentedString(logo600x600)).append("\n");
    sb.append("    payOff: ").append(toIndentedString(payOff)).append("\n");
    sb.append("    ptyCode: ").append(toIndentedString(ptyCode)).append("\n");
    sb.append("    ptyType: ").append(toIndentedString(ptyType)).append("\n");
    sb.append("    stationKey: ").append(toIndentedString(stationKey)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    metadataradioOrganisation: ").append(toIndentedString(metadataradioOrganisation)).append("\n");
    sb.append("    metadataradioStationId: ").append(toIndentedString(metadataradioStationId)).append("\n");
    sb.append("    startDays: ").append(toIndentedString(startDays)).append("\n");
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

