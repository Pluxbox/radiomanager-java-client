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
import com.pluxbox.radiomanager.api.models.BlockRelationsProgram;
import com.pluxbox.radiomanager.api.models.Broadcast;
import com.pluxbox.radiomanager.api.models.BroadcastEPGRelations;
import com.pluxbox.radiomanager.api.models.BroadcastOutputOnly;
import com.pluxbox.radiomanager.api.models.BroadcastRelationsBlocks;
import com.pluxbox.radiomanager.api.models.BroadcastRelationsItems;
import com.pluxbox.radiomanager.api.models.BroadcastRelationsModelType;
import com.pluxbox.radiomanager.api.models.BroadcastRelationsTags;
import com.pluxbox.radiomanager.api.models.PresenterEPGResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * BroadcastEPGResult
 */

public class BroadcastEPGResult {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("deleted_at")
  private OffsetDateTime deletedAt = null;

  @SerializedName("_external_station_id")
  private Long externalStationId = null;

  @SerializedName("program_id")
  private Long programId = null;

  @SerializedName("model_type_id")
  private Long modelTypeId = null;

  @SerializedName("station_id")
  private Long stationId = null;

  @SerializedName("field_values")
  private Object fieldValues = null;

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

  @SerializedName("items")
  private BroadcastRelationsItems items = null;

  @SerializedName("blocks")
  private BroadcastRelationsBlocks blocks = null;

  @SerializedName("program")
  private BlockRelationsProgram program = null;

  @SerializedName("tags")
  private BroadcastRelationsTags tags = null;

  @SerializedName("presenters")
  private List<PresenterEPGResult> presenters = null;

  @SerializedName("model_type")
  private BroadcastRelationsModelType modelType = null;

  public BroadcastEPGResult id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public BroadcastEPGResult updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", required = true, value = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public BroadcastEPGResult createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", required = true, value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public BroadcastEPGResult deletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Get deletedAt
   * @return deletedAt
  **/
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", required = true, value = "")
  public OffsetDateTime getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
  }

  public BroadcastEPGResult externalStationId(Long externalStationId) {
    this.externalStationId = externalStationId;
    return this;
  }

   /**
   * Get externalStationId
   * @return externalStationId
  **/
  @ApiModelProperty(value = "")
  public Long getExternalStationId() {
    return externalStationId;
  }

  public void setExternalStationId(Long externalStationId) {
    this.externalStationId = externalStationId;
  }

  public BroadcastEPGResult programId(Long programId) {
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

  public BroadcastEPGResult modelTypeId(Long modelTypeId) {
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

  public BroadcastEPGResult stationId(Long stationId) {
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

  public BroadcastEPGResult fieldValues(Object fieldValues) {
    this.fieldValues = fieldValues;
    return this;
  }

   /**
   * Get fieldValues
   * @return fieldValues
  **/
  @ApiModelProperty(value = "")
  public Object getFieldValues() {
    return fieldValues;
  }

  public void setFieldValues(Object fieldValues) {
    this.fieldValues = fieldValues;
  }

  public BroadcastEPGResult title(String title) {
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

  public BroadcastEPGResult start(OffsetDateTime start) {
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

  public BroadcastEPGResult stop(OffsetDateTime stop) {
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

  public BroadcastEPGResult genreId(Long genreId) {
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

  public BroadcastEPGResult description(String description) {
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

  public BroadcastEPGResult shortName(String shortName) {
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

  public BroadcastEPGResult mediumName(String mediumName) {
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

  public BroadcastEPGResult website(String website) {
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

  public BroadcastEPGResult email(String email) {
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

  public BroadcastEPGResult recommended(Boolean recommended) {
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

  public BroadcastEPGResult language(String language) {
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

  public BroadcastEPGResult published(Boolean published) {
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

  public BroadcastEPGResult repetitionUid(String repetitionUid) {
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

  public BroadcastEPGResult repetitionType(RepetitionTypeEnum repetitionType) {
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

  public BroadcastEPGResult repetitionEnd(OffsetDateTime repetitionEnd) {
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

  public BroadcastEPGResult repetitionStart(OffsetDateTime repetitionStart) {
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

  public BroadcastEPGResult repetitionDays(String repetitionDays) {
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

  public BroadcastEPGResult ptyCodeId(Long ptyCodeId) {
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

  public BroadcastEPGResult items(BroadcastRelationsItems items) {
    this.items = items;
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public BroadcastRelationsItems getItems() {
    return items;
  }

  public void setItems(BroadcastRelationsItems items) {
    this.items = items;
  }

  public BroadcastEPGResult blocks(BroadcastRelationsBlocks blocks) {
    this.blocks = blocks;
    return this;
  }

   /**
   * Get blocks
   * @return blocks
  **/
  @ApiModelProperty(value = "")
  public BroadcastRelationsBlocks getBlocks() {
    return blocks;
  }

  public void setBlocks(BroadcastRelationsBlocks blocks) {
    this.blocks = blocks;
  }

  public BroadcastEPGResult program(BlockRelationsProgram program) {
    this.program = program;
    return this;
  }

   /**
   * Get program
   * @return program
  **/
  @ApiModelProperty(value = "")
  public BlockRelationsProgram getProgram() {
    return program;
  }

  public void setProgram(BlockRelationsProgram program) {
    this.program = program;
  }

  public BroadcastEPGResult tags(BroadcastRelationsTags tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public BroadcastRelationsTags getTags() {
    return tags;
  }

  public void setTags(BroadcastRelationsTags tags) {
    this.tags = tags;
  }

  public BroadcastEPGResult presenters(List<PresenterEPGResult> presenters) {
    this.presenters = presenters;
    return this;
  }

  public BroadcastEPGResult addPresentersItem(PresenterEPGResult presentersItem) {
    if (this.presenters == null) {
      this.presenters = new ArrayList<PresenterEPGResult>();
    }
    this.presenters.add(presentersItem);
    return this;
  }

   /**
   * Get presenters
   * @return presenters
  **/
  @ApiModelProperty(value = "")
  public List<PresenterEPGResult> getPresenters() {
    return presenters;
  }

  public void setPresenters(List<PresenterEPGResult> presenters) {
    this.presenters = presenters;
  }

  public BroadcastEPGResult modelType(BroadcastRelationsModelType modelType) {
    this.modelType = modelType;
    return this;
  }

   /**
   * Get modelType
   * @return modelType
  **/
  @ApiModelProperty(value = "")
  public BroadcastRelationsModelType getModelType() {
    return modelType;
  }

  public void setModelType(BroadcastRelationsModelType modelType) {
    this.modelType = modelType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BroadcastEPGResult broadcastEPGResult = (BroadcastEPGResult) o;
    return Objects.equals(this.id, broadcastEPGResult.id) &&
        Objects.equals(this.updatedAt, broadcastEPGResult.updatedAt) &&
        Objects.equals(this.createdAt, broadcastEPGResult.createdAt) &&
        Objects.equals(this.deletedAt, broadcastEPGResult.deletedAt) &&
        Objects.equals(this.externalStationId, broadcastEPGResult.externalStationId) &&
        Objects.equals(this.programId, broadcastEPGResult.programId) &&
        Objects.equals(this.modelTypeId, broadcastEPGResult.modelTypeId) &&
        Objects.equals(this.stationId, broadcastEPGResult.stationId) &&
        Objects.equals(this.fieldValues, broadcastEPGResult.fieldValues) &&
        Objects.equals(this.title, broadcastEPGResult.title) &&
        Objects.equals(this.start, broadcastEPGResult.start) &&
        Objects.equals(this.stop, broadcastEPGResult.stop) &&
        Objects.equals(this.genreId, broadcastEPGResult.genreId) &&
        Objects.equals(this.description, broadcastEPGResult.description) &&
        Objects.equals(this.shortName, broadcastEPGResult.shortName) &&
        Objects.equals(this.mediumName, broadcastEPGResult.mediumName) &&
        Objects.equals(this.website, broadcastEPGResult.website) &&
        Objects.equals(this.email, broadcastEPGResult.email) &&
        Objects.equals(this.recommended, broadcastEPGResult.recommended) &&
        Objects.equals(this.language, broadcastEPGResult.language) &&
        Objects.equals(this.published, broadcastEPGResult.published) &&
        Objects.equals(this.repetitionUid, broadcastEPGResult.repetitionUid) &&
        Objects.equals(this.repetitionType, broadcastEPGResult.repetitionType) &&
        Objects.equals(this.repetitionEnd, broadcastEPGResult.repetitionEnd) &&
        Objects.equals(this.repetitionStart, broadcastEPGResult.repetitionStart) &&
        Objects.equals(this.repetitionDays, broadcastEPGResult.repetitionDays) &&
        Objects.equals(this.ptyCodeId, broadcastEPGResult.ptyCodeId) &&
        Objects.equals(this.items, broadcastEPGResult.items) &&
        Objects.equals(this.blocks, broadcastEPGResult.blocks) &&
        Objects.equals(this.program, broadcastEPGResult.program) &&
        Objects.equals(this.tags, broadcastEPGResult.tags) &&
        Objects.equals(this.presenters, broadcastEPGResult.presenters) &&
        Objects.equals(this.modelType, broadcastEPGResult.modelType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, updatedAt, createdAt, deletedAt, externalStationId, programId, modelTypeId, stationId, fieldValues, title, start, stop, genreId, description, shortName, mediumName, website, email, recommended, language, published, repetitionUid, repetitionType, repetitionEnd, repetitionStart, repetitionDays, ptyCodeId, items, blocks, program, tags, presenters, modelType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BroadcastEPGResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    externalStationId: ").append(toIndentedString(externalStationId)).append("\n");
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
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    blocks: ").append(toIndentedString(blocks)).append("\n");
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    presenters: ").append(toIndentedString(presenters)).append("\n");
    sb.append("    modelType: ").append(toIndentedString(modelType)).append("\n");
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

