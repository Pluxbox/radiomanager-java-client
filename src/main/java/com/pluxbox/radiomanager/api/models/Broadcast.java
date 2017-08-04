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
import com.pluxbox.radiomanager.api.models.BroadcastFieldValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Broadcast
 */

public class Broadcast {
  @SerializedName("program_id")
  private Long programId = null;

  @SerializedName("model_type_id")
  private Long modelTypeId = null;

  @SerializedName("station_id")
  private Long stationId = null;

  @SerializedName("field_values")
  private BroadcastFieldValues fieldValues = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("start")
  private OffsetDateTime start = null;

  @SerializedName("stop")
  private OffsetDateTime stop = null;

  @SerializedName("genre_id")
  private Long genreId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("short_name")
  private String shortName = null;

  @SerializedName("medium_name")
  private String mediumName = null;

  @SerializedName("website")
  private String website = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("recommended")
  private Boolean recommended = null;

  @SerializedName("language")
  private String language = null;

  @SerializedName("published")
  private Boolean published = null;

  @SerializedName("repetition_uid")
  private String repetitionUid = null;

  /**
   * Gets or Sets repetitionType
   */
  @JsonAdapter(RepetitionTypeEnum.Adapter.class)
  public enum RepetitionTypeEnum {
    _1_WEEK("1 week"),
    
    _2_WEEKS("2 weeks"),
    
    _4_WEEKS("4 weeks"),
    
    _1_MONTH("1 month");

    private String value;

    RepetitionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RepetitionTypeEnum fromValue(String text) {
      for (RepetitionTypeEnum b : RepetitionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RepetitionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RepetitionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RepetitionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RepetitionTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("repetition_type")
  private RepetitionTypeEnum repetitionType = null;

  @SerializedName("repetition_end")
  private OffsetDateTime repetitionEnd = null;

  @SerializedName("repetition_start")
  private OffsetDateTime repetitionStart = null;

  @SerializedName("repetition_days")
  private String repetitionDays = null;

  @SerializedName("pty_code_id")
  private Long ptyCodeId = null;

  public Broadcast programId(Long programId) {
    this.programId = programId;
    return this;
  }

   /**
   * Get programId
   * @return programId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getProgramId() {
    return programId;
  }

  public void setProgramId(Long programId) {
    this.programId = programId;
  }

  public Broadcast modelTypeId(Long modelTypeId) {
    this.modelTypeId = modelTypeId;
    return this;
  }

   /**
   * Get modelTypeId
   * @return modelTypeId
  **/
  @ApiModelProperty(example = "2", value = "")
  public Long getModelTypeId() {
    return modelTypeId;
  }

  public void setModelTypeId(Long modelTypeId) {
    this.modelTypeId = modelTypeId;
  }

  public Broadcast stationId(Long stationId) {
    this.stationId = stationId;
    return this;
  }

   /**
   * Get stationId
   * @return stationId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getStationId() {
    return stationId;
  }

  public void setStationId(Long stationId) {
    this.stationId = stationId;
  }

  public Broadcast fieldValues(BroadcastFieldValues fieldValues) {
    this.fieldValues = fieldValues;
    return this;
  }

   /**
   * Get fieldValues
   * @return fieldValues
  **/
  @ApiModelProperty(value = "")
  public BroadcastFieldValues getFieldValues() {
    return fieldValues;
  }

  public void setFieldValues(BroadcastFieldValues fieldValues) {
    this.fieldValues = fieldValues;
  }

  public Broadcast title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "FooBar Show", value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Broadcast start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", value = "")
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public Broadcast stop(OffsetDateTime stop) {
    this.stop = stop;
    return this;
  }

   /**
   * Get stop
   * @return stop
  **/
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", value = "")
  public OffsetDateTime getStop() {
    return stop;
  }

  public void setStop(OffsetDateTime stop) {
    this.stop = stop;
  }

  public Broadcast genreId(Long genreId) {
    this.genreId = genreId;
    return this;
  }

   /**
   * Get genreId
   * @return genreId
  **/
  @ApiModelProperty(example = "2611", value = "")
  public Long getGenreId() {
    return genreId;
  }

  public void setGenreId(Long genreId) {
    this.genreId = genreId;
  }

  public Broadcast description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "FooBar BarFoo", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Broadcast shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @ApiModelProperty(example = "foobar", value = "")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public Broadcast mediumName(String mediumName) {
    this.mediumName = mediumName;
    return this;
  }

   /**
   * Get mediumName
   * @return mediumName
  **/
  @ApiModelProperty(example = "foobarshow", value = "")
  public String getMediumName() {
    return mediumName;
  }

  public void setMediumName(String mediumName) {
    this.mediumName = mediumName;
  }

  public Broadcast website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @ApiModelProperty(example = "http://example.com/", value = "")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public Broadcast email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "info@example.com", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Broadcast recommended(Boolean recommended) {
    this.recommended = recommended;
    return this;
  }

   /**
   * Get recommended
   * @return recommended
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean getRecommended() {
    return recommended;
  }

  public void setRecommended(Boolean recommended) {
    this.recommended = recommended;
  }

  public Broadcast language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(example = "English", value = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Broadcast published(Boolean published) {
    this.published = published;
    return this;
  }

   /**
   * Get published
   * @return published
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean getPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }

  public Broadcast repetitionUid(String repetitionUid) {
    this.repetitionUid = repetitionUid;
    return this;
  }

   /**
   * Get repetitionUid
   * @return repetitionUid
  **/
  @ApiModelProperty(example = "1234abcd", value = "")
  public String getRepetitionUid() {
    return repetitionUid;
  }

  public void setRepetitionUid(String repetitionUid) {
    this.repetitionUid = repetitionUid;
  }

  public Broadcast repetitionType(RepetitionTypeEnum repetitionType) {
    this.repetitionType = repetitionType;
    return this;
  }

   /**
   * Get repetitionType
   * @return repetitionType
  **/
  @ApiModelProperty(example = "1 week", value = "")
  public RepetitionTypeEnum getRepetitionType() {
    return repetitionType;
  }

  public void setRepetitionType(RepetitionTypeEnum repetitionType) {
    this.repetitionType = repetitionType;
  }

  public Broadcast repetitionEnd(OffsetDateTime repetitionEnd) {
    this.repetitionEnd = repetitionEnd;
    return this;
  }

   /**
   * Get repetitionEnd
   * @return repetitionEnd
  **/
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", value = "")
  public OffsetDateTime getRepetitionEnd() {
    return repetitionEnd;
  }

  public void setRepetitionEnd(OffsetDateTime repetitionEnd) {
    this.repetitionEnd = repetitionEnd;
  }

  public Broadcast repetitionStart(OffsetDateTime repetitionStart) {
    this.repetitionStart = repetitionStart;
    return this;
  }

   /**
   * Get repetitionStart
   * @return repetitionStart
  **/
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", value = "")
  public OffsetDateTime getRepetitionStart() {
    return repetitionStart;
  }

  public void setRepetitionStart(OffsetDateTime repetitionStart) {
    this.repetitionStart = repetitionStart;
  }

  public Broadcast repetitionDays(String repetitionDays) {
    this.repetitionDays = repetitionDays;
    return this;
  }

   /**
   * Get repetitionDays
   * @return repetitionDays
  **/
  @ApiModelProperty(value = "")
  public String getRepetitionDays() {
    return repetitionDays;
  }

  public void setRepetitionDays(String repetitionDays) {
    this.repetitionDays = repetitionDays;
  }

  public Broadcast ptyCodeId(Long ptyCodeId) {
    this.ptyCodeId = ptyCodeId;
    return this;
  }

   /**
   * Get ptyCodeId
   * minimum: 1
   * @return ptyCodeId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getPtyCodeId() {
    return ptyCodeId;
  }

  public void setPtyCodeId(Long ptyCodeId) {
    this.ptyCodeId = ptyCodeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Broadcast broadcast = (Broadcast) o;
    return Objects.equals(this.programId, broadcast.programId) &&
        Objects.equals(this.modelTypeId, broadcast.modelTypeId) &&
        Objects.equals(this.stationId, broadcast.stationId) &&
        Objects.equals(this.fieldValues, broadcast.fieldValues) &&
        Objects.equals(this.title, broadcast.title) &&
        Objects.equals(this.start, broadcast.start) &&
        Objects.equals(this.stop, broadcast.stop) &&
        Objects.equals(this.genreId, broadcast.genreId) &&
        Objects.equals(this.description, broadcast.description) &&
        Objects.equals(this.shortName, broadcast.shortName) &&
        Objects.equals(this.mediumName, broadcast.mediumName) &&
        Objects.equals(this.website, broadcast.website) &&
        Objects.equals(this.email, broadcast.email) &&
        Objects.equals(this.recommended, broadcast.recommended) &&
        Objects.equals(this.language, broadcast.language) &&
        Objects.equals(this.published, broadcast.published) &&
        Objects.equals(this.repetitionUid, broadcast.repetitionUid) &&
        Objects.equals(this.repetitionType, broadcast.repetitionType) &&
        Objects.equals(this.repetitionEnd, broadcast.repetitionEnd) &&
        Objects.equals(this.repetitionStart, broadcast.repetitionStart) &&
        Objects.equals(this.repetitionDays, broadcast.repetitionDays) &&
        Objects.equals(this.ptyCodeId, broadcast.ptyCodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(programId, modelTypeId, stationId, fieldValues, title, start, stop, genreId, description, shortName, mediumName, website, email, recommended, language, published, repetitionUid, repetitionType, repetitionEnd, repetitionStart, repetitionDays, ptyCodeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Broadcast {\n");
    
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
    sb.append("    modelTypeId: ").append(toIndentedString(modelTypeId)).append("\n");
    sb.append("    stationId: ").append(toIndentedString(stationId)).append("\n");
    sb.append("    fieldValues: ").append(toIndentedString(fieldValues)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    genreId: ").append(toIndentedString(genreId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    mediumName: ").append(toIndentedString(mediumName)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    recommended: ").append(toIndentedString(recommended)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    repetitionUid: ").append(toIndentedString(repetitionUid)).append("\n");
    sb.append("    repetitionType: ").append(toIndentedString(repetitionType)).append("\n");
    sb.append("    repetitionEnd: ").append(toIndentedString(repetitionEnd)).append("\n");
    sb.append("    repetitionStart: ").append(toIndentedString(repetitionStart)).append("\n");
    sb.append("    repetitionDays: ").append(toIndentedString(repetitionDays)).append("\n");
    sb.append("    ptyCodeId: ").append(toIndentedString(ptyCodeId)).append("\n");
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

