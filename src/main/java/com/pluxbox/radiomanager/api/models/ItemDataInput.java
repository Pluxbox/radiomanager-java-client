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
import com.pluxbox.radiomanager.api.models.Item;
import com.pluxbox.radiomanager.api.models.ItemInputOnly;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * ItemDataInput
 */

public class ItemDataInput {
  @SerializedName("model_type_id")
  private Long modelTypeId = null;

  @SerializedName("block_id")
  private Long blockId = null;

  @SerializedName("external_id")
  private String externalId = null;

  @SerializedName("field_values")
  private Object fieldValues = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("duration")
  private Long duration = null;

  @SerializedName("start")
  private OffsetDateTime start = null;

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

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("import")
  private Long _import = null;

  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("recommended")
  private Boolean recommended = null;

  @SerializedName("station_draft_id")
  private Long stationDraftId = null;

  @SerializedName("program_draft_id")
  private Long programDraftId = null;

  @SerializedName("user_draft_id")
  private Long userDraftId = null;

  @SerializedName("static_start")
  private Boolean staticStart = null;

  @SerializedName("details")
  private String details = null;

  @SerializedName("_previous_id")
  private Long previousId = null;

  @SerializedName("_before_id")
  private Long beforeId = null;

  @SerializedName("contacts")
  private List<Integer> contacts = null;

  @SerializedName("tags")
  private List<Integer> tags = null;

  public ItemDataInput modelTypeId(Long modelTypeId) {
    this.modelTypeId = modelTypeId;
    return this;
  }

   /**
   * Get modelTypeId
   * @return modelTypeId
  **/
  @ApiModelProperty(example = "14", required = true, value = "")
  public Long getModelTypeId() {
    return modelTypeId;
  }

  public void setModelTypeId(Long modelTypeId) {
    this.modelTypeId = modelTypeId;
  }

  public ItemDataInput blockId(Long blockId) {
    this.blockId = blockId;
    return this;
  }

   /**
   * Get blockId
   * @return blockId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getBlockId() {
    return blockId;
  }

  public void setBlockId(Long blockId) {
    this.blockId = blockId;
  }

  public ItemDataInput externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @ApiModelProperty(example = "0", value = "")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public ItemDataInput fieldValues(Object fieldValues) {
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

  public ItemDataInput title(String title) {
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

  public ItemDataInput duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(example = "120", value = "")
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public ItemDataInput start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(example = "2017-06-23T12:00:00+02:00", value = "")
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public ItemDataInput status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "scheduled", value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ItemDataInput _import(Long _import) {
    this._import = _import;
    return this;
  }

   /**
   * Get _import
   * @return _import
  **/
  @ApiModelProperty(example = "0", value = "")
  public Long getImport() {
    return _import;
  }

  public void setImport(Long _import) {
    this._import = _import;
  }

  public ItemDataInput campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public ItemDataInput recommended(Boolean recommended) {
    this.recommended = recommended;
    return this;
  }

   /**
   * Get recommended
   * @return recommended
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isRecommended() {
    return recommended;
  }

  public void setRecommended(Boolean recommended) {
    this.recommended = recommended;
  }

  public ItemDataInput stationDraftId(Long stationDraftId) {
    this.stationDraftId = stationDraftId;
    return this;
  }

   /**
   * Get stationDraftId
   * @return stationDraftId
  **/
  @ApiModelProperty(example = "0", value = "")
  public Long getStationDraftId() {
    return stationDraftId;
  }

  public void setStationDraftId(Long stationDraftId) {
    this.stationDraftId = stationDraftId;
  }

  public ItemDataInput programDraftId(Long programDraftId) {
    this.programDraftId = programDraftId;
    return this;
  }

   /**
   * Get programDraftId
   * @return programDraftId
  **/
  @ApiModelProperty(example = "0", value = "")
  public Long getProgramDraftId() {
    return programDraftId;
  }

  public void setProgramDraftId(Long programDraftId) {
    this.programDraftId = programDraftId;
  }

  public ItemDataInput userDraftId(Long userDraftId) {
    this.userDraftId = userDraftId;
    return this;
  }

   /**
   * Get userDraftId
   * @return userDraftId
  **/
  @ApiModelProperty(example = "0", value = "")
  public Long getUserDraftId() {
    return userDraftId;
  }

  public void setUserDraftId(Long userDraftId) {
    this.userDraftId = userDraftId;
  }

  public ItemDataInput staticStart(Boolean staticStart) {
    this.staticStart = staticStart;
    return this;
  }

   /**
   * Get staticStart
   * @return staticStart
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isStaticStart() {
    return staticStart;
  }

  public void setStaticStart(Boolean staticStart) {
    this.staticStart = staticStart;
  }

  public ItemDataInput details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(example = "<div class=\"rm-content\">Details of item</div>\\n", value = "")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public ItemDataInput previousId(Long previousId) {
    this.previousId = previousId;
    return this;
  }

   /**
   * Get previousId
   * @return previousId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getPreviousId() {
    return previousId;
  }

  public void setPreviousId(Long previousId) {
    this.previousId = previousId;
  }

  public ItemDataInput beforeId(Long beforeId) {
    this.beforeId = beforeId;
    return this;
  }

   /**
   * Get beforeId
   * @return beforeId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getBeforeId() {
    return beforeId;
  }

  public void setBeforeId(Long beforeId) {
    this.beforeId = beforeId;
  }

  public ItemDataInput contacts(List<Integer> contacts) {
    this.contacts = contacts;
    return this;
  }

  public ItemDataInput addContactsItem(Integer contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * Get contacts
   * @return contacts
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getContacts() {
    return contacts;
  }

  public void setContacts(List<Integer> contacts) {
    this.contacts = contacts;
  }

  public ItemDataInput tags(List<Integer> tags) {
    this.tags = tags;
    return this;
  }

  public ItemDataInput addTagsItem(Integer tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getTags() {
    return tags;
  }

  public void setTags(List<Integer> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemDataInput itemDataInput = (ItemDataInput) o;
    return Objects.equals(this.modelTypeId, itemDataInput.modelTypeId) &&
        Objects.equals(this.blockId, itemDataInput.blockId) &&
        Objects.equals(this.externalId, itemDataInput.externalId) &&
        Objects.equals(this.fieldValues, itemDataInput.fieldValues) &&
        Objects.equals(this.title, itemDataInput.title) &&
        Objects.equals(this.duration, itemDataInput.duration) &&
        Objects.equals(this.start, itemDataInput.start) &&
        Objects.equals(this.status, itemDataInput.status) &&
        Objects.equals(this._import, itemDataInput._import) &&
        Objects.equals(this.campaignId, itemDataInput.campaignId) &&
        Objects.equals(this.recommended, itemDataInput.recommended) &&
        Objects.equals(this.stationDraftId, itemDataInput.stationDraftId) &&
        Objects.equals(this.programDraftId, itemDataInput.programDraftId) &&
        Objects.equals(this.userDraftId, itemDataInput.userDraftId) &&
        Objects.equals(this.staticStart, itemDataInput.staticStart) &&
        Objects.equals(this.details, itemDataInput.details) &&
        Objects.equals(this.previousId, itemDataInput.previousId) &&
        Objects.equals(this.beforeId, itemDataInput.beforeId) &&
        Objects.equals(this.contacts, itemDataInput.contacts) &&
        Objects.equals(this.tags, itemDataInput.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelTypeId, blockId, externalId, fieldValues, title, duration, start, status, _import, campaignId, recommended, stationDraftId, programDraftId, userDraftId, staticStart, details, previousId, beforeId, contacts, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDataInput {\n");
    
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
    sb.append("    previousId: ").append(toIndentedString(previousId)).append("\n");
    sb.append("    beforeId: ").append(toIndentedString(beforeId)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

