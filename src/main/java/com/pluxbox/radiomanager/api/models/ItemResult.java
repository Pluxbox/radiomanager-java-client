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
import com.pluxbox.radiomanager.api.models.BlockRelationsBroadcast;
import com.pluxbox.radiomanager.api.models.BroadcastRelationsModelType;
import com.pluxbox.radiomanager.api.models.ItemRelationsBlock;
import com.pluxbox.radiomanager.api.models.ItemRelationsCampaign;
import com.pluxbox.radiomanager.api.models.ItemRelationsContacts;
import com.pluxbox.radiomanager.api.models.ItemRelationsProgram;
import com.pluxbox.radiomanager.api.models.ItemRelationsTags;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * ItemResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ItemResult {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DELETED_AT = "deleted_at";
  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  private OffsetDateTime deletedAt;

  public static final String SERIALIZED_NAME_DATA_MODIFIED = "data_modified";
  @SerializedName(SERIALIZED_NAME_DATA_MODIFIED)
  private Long dataModified;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Long order;

  public static final String SERIALIZED_NAME_TEMPLATEBLOCK_ID = "templateblock_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATEBLOCK_ID)
  private Long templateblockId;

  public static final String SERIALIZED_NAME_TEMPLATEITEM_ID = "templateitem_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATEITEM_ID)
  private Long templateitemId;

  public static final String SERIALIZED_NAME_EXTERNAL_STATION_ID = "_external_station_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_STATION_ID)
  private Long externalStationId;

  public static final String SERIALIZED_NAME_MODEL_TYPE_ID = "model_type_id";
  @SerializedName(SERIALIZED_NAME_MODEL_TYPE_ID)
  private Long modelTypeId;

  public static final String SERIALIZED_NAME_BLOCK_ID = "block_id";
  @SerializedName(SERIALIZED_NAME_BLOCK_ID)
  private Long blockId;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_FIELD_VALUES = "field_values";
  @SerializedName(SERIALIZED_NAME_FIELD_VALUES)
  private Object fieldValues;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Long duration;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private OffsetDateTime start;

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

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_IMPORT = "import";
  @SerializedName(SERIALIZED_NAME_IMPORT)
  private Long _import;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId;

  public static final String SERIALIZED_NAME_RECOMMENDED = "recommended";
  @SerializedName(SERIALIZED_NAME_RECOMMENDED)
  private Boolean recommended;

  public static final String SERIALIZED_NAME_STATION_DRAFT_ID = "station_draft_id";
  @SerializedName(SERIALIZED_NAME_STATION_DRAFT_ID)
  private Long stationDraftId;

  public static final String SERIALIZED_NAME_PROGRAM_DRAFT_ID = "program_draft_id";
  @SerializedName(SERIALIZED_NAME_PROGRAM_DRAFT_ID)
  private Long programDraftId;

  public static final String SERIALIZED_NAME_USER_DRAFT_ID = "user_draft_id";
  @SerializedName(SERIALIZED_NAME_USER_DRAFT_ID)
  private Long userDraftId;

  public static final String SERIALIZED_NAME_STATIC_START = "static_start";
  @SerializedName(SERIALIZED_NAME_STATIC_START)
  private Boolean staticStart;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  public static final String SERIALIZED_NAME_BLOCK = "block";
  @SerializedName(SERIALIZED_NAME_BLOCK)
  private ItemRelationsBlock block;

  public static final String SERIALIZED_NAME_BROADCAST = "broadcast";
  @SerializedName(SERIALIZED_NAME_BROADCAST)
  private BlockRelationsBroadcast broadcast;

  public static final String SERIALIZED_NAME_PROGRAM = "program";
  @SerializedName(SERIALIZED_NAME_PROGRAM)
  private ItemRelationsProgram program;

  public static final String SERIALIZED_NAME_CONTACTS = "contacts";
  @SerializedName(SERIALIZED_NAME_CONTACTS)
  private ItemRelationsContacts contacts;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private ItemRelationsTags tags;

  public static final String SERIALIZED_NAME_CAMPAIGN = "campaign";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN)
  private ItemRelationsCampaign campaign;

  public static final String SERIALIZED_NAME_MODEL_TYPE = "model_type";
  @SerializedName(SERIALIZED_NAME_MODEL_TYPE)
  private BroadcastRelationsModelType modelType;

  public ItemResult() {
  }

  public ItemResult id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public ItemResult updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-06-23T12:00+02:00", value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ItemResult createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-06-23T12:00+02:00", value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ItemResult deletedAt(OffsetDateTime deletedAt) {
    
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Get deletedAt
   * @return deletedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-06-23T12:00+02:00", value = "")

  public OffsetDateTime getDeletedAt() {
    return deletedAt;
  }


  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
  }


  public ItemResult dataModified(Long dataModified) {
    
    this.dataModified = dataModified;
    return this;
  }

   /**
   * Get dataModified
   * @return dataModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getDataModified() {
    return dataModified;
  }


  public void setDataModified(Long dataModified) {
    this.dataModified = dataModified;
  }


  public ItemResult order(Long order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Long getOrder() {
    return order;
  }


  public void setOrder(Long order) {
    this.order = order;
  }


  public ItemResult templateblockId(Long templateblockId) {
    
    this.templateblockId = templateblockId;
    return this;
  }

   /**
   * Get templateblockId
   * @return templateblockId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getTemplateblockId() {
    return templateblockId;
  }


  public void setTemplateblockId(Long templateblockId) {
    this.templateblockId = templateblockId;
  }


  public ItemResult templateitemId(Long templateitemId) {
    
    this.templateitemId = templateitemId;
    return this;
  }

   /**
   * Get templateitemId
   * @return templateitemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getTemplateitemId() {
    return templateitemId;
  }


  public void setTemplateitemId(Long templateitemId) {
    this.templateitemId = templateitemId;
  }


  public ItemResult externalStationId(Long externalStationId) {
    
    this.externalStationId = externalStationId;
    return this;
  }

   /**
   * Get externalStationId
   * @return externalStationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getExternalStationId() {
    return externalStationId;
  }


  public void setExternalStationId(Long externalStationId) {
    this.externalStationId = externalStationId;
  }


  public ItemResult modelTypeId(Long modelTypeId) {
    
    this.modelTypeId = modelTypeId;
    return this;
  }

   /**
   * Get modelTypeId
   * @return modelTypeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "14", required = true, value = "")

  public Long getModelTypeId() {
    return modelTypeId;
  }


  public void setModelTypeId(Long modelTypeId) {
    this.modelTypeId = modelTypeId;
  }


  public ItemResult blockId(Long blockId) {
    
    this.blockId = blockId;
    return this;
  }

   /**
   * Get blockId
   * @return blockId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getBlockId() {
    return blockId;
  }


  public void setBlockId(Long blockId) {
    this.blockId = blockId;
  }


  public ItemResult externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public ItemResult fieldValues(Object fieldValues) {
    
    this.fieldValues = fieldValues;
    return this;
  }

   /**
   * Get fieldValues
   * @return fieldValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getFieldValues() {
    return fieldValues;
  }


  public void setFieldValues(Object fieldValues) {
    this.fieldValues = fieldValues;
  }


  public ItemResult title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FooBar Show", value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ItemResult duration(Long duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "120", value = "")

  public Long getDuration() {
    return duration;
  }


  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public ItemResult start(OffsetDateTime start) {
    
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-06-23T12:00+02:00", value = "")

  public OffsetDateTime getStart() {
    return start;
  }


  public void setStart(OffsetDateTime start) {
    this.start = start;
  }


  public ItemResult status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "scheduled", value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ItemResult _import(Long _import) {
    
    this._import = _import;
    return this;
  }

   /**
   * Get _import
   * @return _import
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Long getImport() {
    return _import;
  }


  public void setImport(Long _import) {
    this._import = _import;
  }


  public ItemResult campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public ItemResult recommended(Boolean recommended) {
    
    this.recommended = recommended;
    return this;
  }

   /**
   * Get recommended
   * @return recommended
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getRecommended() {
    return recommended;
  }


  public void setRecommended(Boolean recommended) {
    this.recommended = recommended;
  }


  public ItemResult stationDraftId(Long stationDraftId) {
    
    this.stationDraftId = stationDraftId;
    return this;
  }

   /**
   * Get stationDraftId
   * @return stationDraftId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Long getStationDraftId() {
    return stationDraftId;
  }


  public void setStationDraftId(Long stationDraftId) {
    this.stationDraftId = stationDraftId;
  }


  public ItemResult programDraftId(Long programDraftId) {
    
    this.programDraftId = programDraftId;
    return this;
  }

   /**
   * Get programDraftId
   * @return programDraftId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Long getProgramDraftId() {
    return programDraftId;
  }


  public void setProgramDraftId(Long programDraftId) {
    this.programDraftId = programDraftId;
  }


  public ItemResult userDraftId(Long userDraftId) {
    
    this.userDraftId = userDraftId;
    return this;
  }

   /**
   * Get userDraftId
   * @return userDraftId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Long getUserDraftId() {
    return userDraftId;
  }


  public void setUserDraftId(Long userDraftId) {
    this.userDraftId = userDraftId;
  }


  public ItemResult staticStart(Boolean staticStart) {
    
    this.staticStart = staticStart;
    return this;
  }

   /**
   * Get staticStart
   * @return staticStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getStaticStart() {
    return staticStart;
  }


  public void setStaticStart(Boolean staticStart) {
    this.staticStart = staticStart;
  }


  public ItemResult details(String details) {
    
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<div class=\"rm-content\">Details of item</div>\\n", value = "")

  public String getDetails() {
    return details;
  }


  public void setDetails(String details) {
    this.details = details;
  }


  public ItemResult block(ItemRelationsBlock block) {
    
    this.block = block;
    return this;
  }

   /**
   * Get block
   * @return block
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ItemRelationsBlock getBlock() {
    return block;
  }


  public void setBlock(ItemRelationsBlock block) {
    this.block = block;
  }


  public ItemResult broadcast(BlockRelationsBroadcast broadcast) {
    
    this.broadcast = broadcast;
    return this;
  }

   /**
   * Get broadcast
   * @return broadcast
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BlockRelationsBroadcast getBroadcast() {
    return broadcast;
  }


  public void setBroadcast(BlockRelationsBroadcast broadcast) {
    this.broadcast = broadcast;
  }


  public ItemResult program(ItemRelationsProgram program) {
    
    this.program = program;
    return this;
  }

   /**
   * Get program
   * @return program
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ItemRelationsProgram getProgram() {
    return program;
  }


  public void setProgram(ItemRelationsProgram program) {
    this.program = program;
  }


  public ItemResult contacts(ItemRelationsContacts contacts) {
    
    this.contacts = contacts;
    return this;
  }

   /**
   * Get contacts
   * @return contacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ItemRelationsContacts getContacts() {
    return contacts;
  }


  public void setContacts(ItemRelationsContacts contacts) {
    this.contacts = contacts;
  }


  public ItemResult tags(ItemRelationsTags tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ItemRelationsTags getTags() {
    return tags;
  }


  public void setTags(ItemRelationsTags tags) {
    this.tags = tags;
  }


  public ItemResult campaign(ItemRelationsCampaign campaign) {
    
    this.campaign = campaign;
    return this;
  }

   /**
   * Get campaign
   * @return campaign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ItemRelationsCampaign getCampaign() {
    return campaign;
  }


  public void setCampaign(ItemRelationsCampaign campaign) {
    this.campaign = campaign;
  }


  public ItemResult modelType(BroadcastRelationsModelType modelType) {
    
    this.modelType = modelType;
    return this;
  }

   /**
   * Get modelType
   * @return modelType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BroadcastRelationsModelType getModelType() {
    return modelType;
  }


  public void setModelType(BroadcastRelationsModelType modelType) {
    this.modelType = modelType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemResult itemResult = (ItemResult) o;
    return Objects.equals(this.id, itemResult.id) &&
        Objects.equals(this.updatedAt, itemResult.updatedAt) &&
        Objects.equals(this.createdAt, itemResult.createdAt) &&
        Objects.equals(this.deletedAt, itemResult.deletedAt) &&
        Objects.equals(this.dataModified, itemResult.dataModified) &&
        Objects.equals(this.order, itemResult.order) &&
        Objects.equals(this.templateblockId, itemResult.templateblockId) &&
        Objects.equals(this.templateitemId, itemResult.templateitemId) &&
        Objects.equals(this.externalStationId, itemResult.externalStationId) &&
        Objects.equals(this.modelTypeId, itemResult.modelTypeId) &&
        Objects.equals(this.blockId, itemResult.blockId) &&
        Objects.equals(this.externalId, itemResult.externalId) &&
        Objects.equals(this.fieldValues, itemResult.fieldValues) &&
        Objects.equals(this.title, itemResult.title) &&
        Objects.equals(this.duration, itemResult.duration) &&
        Objects.equals(this.start, itemResult.start) &&
        Objects.equals(this.status, itemResult.status) &&
        Objects.equals(this._import, itemResult._import) &&
        Objects.equals(this.campaignId, itemResult.campaignId) &&
        Objects.equals(this.recommended, itemResult.recommended) &&
        Objects.equals(this.stationDraftId, itemResult.stationDraftId) &&
        Objects.equals(this.programDraftId, itemResult.programDraftId) &&
        Objects.equals(this.userDraftId, itemResult.userDraftId) &&
        Objects.equals(this.staticStart, itemResult.staticStart) &&
        Objects.equals(this.details, itemResult.details) &&
        Objects.equals(this.block, itemResult.block) &&
        Objects.equals(this.broadcast, itemResult.broadcast) &&
        Objects.equals(this.program, itemResult.program) &&
        Objects.equals(this.contacts, itemResult.contacts) &&
        Objects.equals(this.tags, itemResult.tags) &&
        Objects.equals(this.campaign, itemResult.campaign) &&
        Objects.equals(this.modelType, itemResult.modelType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, updatedAt, createdAt, deletedAt, dataModified, order, templateblockId, templateitemId, externalStationId, modelTypeId, blockId, externalId, fieldValues, title, duration, start, status, _import, campaignId, recommended, stationDraftId, programDraftId, userDraftId, staticStart, details, block, broadcast, program, contacts, tags, campaign, modelType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemResult {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    dataModified: ").append(toIndentedString(dataModified)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    templateblockId: ").append(toIndentedString(templateblockId)).append("\n");
    sb.append("    templateitemId: ").append(toIndentedString(templateitemId)).append("\n");
    sb.append("    externalStationId: ").append(toIndentedString(externalStationId)).append("\n");
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
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
    sb.append("    broadcast: ").append(toIndentedString(broadcast)).append("\n");
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    modelType: ").append(toIndentedString(modelType)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("updated_at");
    openapiFields.add("created_at");
    openapiFields.add("deleted_at");
    openapiFields.add("data_modified");
    openapiFields.add("order");
    openapiFields.add("templateblock_id");
    openapiFields.add("templateitem_id");
    openapiFields.add("_external_station_id");
    openapiFields.add("model_type_id");
    openapiFields.add("block_id");
    openapiFields.add("external_id");
    openapiFields.add("field_values");
    openapiFields.add("title");
    openapiFields.add("duration");
    openapiFields.add("start");
    openapiFields.add("status");
    openapiFields.add("import");
    openapiFields.add("campaign_id");
    openapiFields.add("recommended");
    openapiFields.add("station_draft_id");
    openapiFields.add("program_draft_id");
    openapiFields.add("user_draft_id");
    openapiFields.add("static_start");
    openapiFields.add("details");
    openapiFields.add("block");
    openapiFields.add("broadcast");
    openapiFields.add("program");
    openapiFields.add("contacts");
    openapiFields.add("tags");
    openapiFields.add("campaign");
    openapiFields.add("model_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("model_type_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ItemResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ItemResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ItemResult is not found in the empty JSON string", ItemResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ItemResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ItemResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ItemResult.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) && !jsonObj.get("details").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `details` to be a primitive type in the JSON string but got `%s`", jsonObj.get("details").toString()));
      }
      // validate the optional field `block`
      if (jsonObj.get("block") != null && !jsonObj.get("block").isJsonNull()) {
        ItemRelationsBlock.validateJsonObject(jsonObj.getAsJsonObject("block"));
      }
      // validate the optional field `broadcast`
      if (jsonObj.get("broadcast") != null && !jsonObj.get("broadcast").isJsonNull()) {
        BlockRelationsBroadcast.validateJsonObject(jsonObj.getAsJsonObject("broadcast"));
      }
      // validate the optional field `program`
      if (jsonObj.get("program") != null && !jsonObj.get("program").isJsonNull()) {
        ItemRelationsProgram.validateJsonObject(jsonObj.getAsJsonObject("program"));
      }
      // validate the optional field `contacts`
      if (jsonObj.get("contacts") != null && !jsonObj.get("contacts").isJsonNull()) {
        ItemRelationsContacts.validateJsonObject(jsonObj.getAsJsonObject("contacts"));
      }
      // validate the optional field `tags`
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        ItemRelationsTags.validateJsonObject(jsonObj.getAsJsonObject("tags"));
      }
      // validate the optional field `campaign`
      if (jsonObj.get("campaign") != null && !jsonObj.get("campaign").isJsonNull()) {
        ItemRelationsCampaign.validateJsonObject(jsonObj.getAsJsonObject("campaign"));
      }
      // validate the optional field `model_type`
      if (jsonObj.get("model_type") != null && !jsonObj.get("model_type").isJsonNull()) {
        BroadcastRelationsModelType.validateJsonObject(jsonObj.getAsJsonObject("model_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ItemResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ItemResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ItemResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ItemResult.class));

       return (TypeAdapter<T>) new TypeAdapter<ItemResult>() {
           @Override
           public void write(JsonWriter out, ItemResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ItemResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ItemResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ItemResult
  * @throws IOException if the JSON string is invalid with respect to ItemResult
  */
  public static ItemResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ItemResult.class);
  }

 /**
  * Convert an instance of ItemResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

