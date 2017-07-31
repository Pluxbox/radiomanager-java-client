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
import com.pluxbox.radiomanager.api.models.ModelType;
import com.pluxbox.radiomanager.api.models.ModelTypeOptions;
import com.pluxbox.radiomanager.api.models.ModelTypeOutputOnly;
import com.pluxbox.radiomanager.api.models.ModelTypeRelations;
import com.pluxbox.radiomanager.api.models.ModelTypeRelationsBroadcasts;
import com.pluxbox.radiomanager.api.models.ModelTypeRelationsCampaigns;
import com.pluxbox.radiomanager.api.models.ModelTypeRelationsContacts;
import com.pluxbox.radiomanager.api.models.ModelTypeRelationsItems;
import com.pluxbox.radiomanager.api.models.ModelTypeRelationsPresenters;
import com.pluxbox.radiomanager.api.models.ModelTypeRelationsPrograms;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * ModelTypeResult
 */

public class ModelTypeResult {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Gets or Sets model
   */
  @JsonAdapter(ModelEnum.Adapter.class)
  public enum ModelEnum {
    BROADCAST("broadcast"),
    
    PROGRAM("program"),
    
    ITEM("item"),
    
    CAMPAIGN("campaign"),
    
    PRESENTER("presenter"),
    
    CONTACT("contact"),
    
    EXTERNAL("external");

    private String value;

    ModelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModelEnum fromValue(String text) {
      for (ModelEnum b : ModelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ModelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ModelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("model")
  private ModelEnum model = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("options")
  private ModelTypeOptions options = null;

  @SerializedName("order")
  private Long order = null;

  @SerializedName("deleted_at")
  private OffsetDateTime deletedAt = null;

  @SerializedName("campaigns")
  private ModelTypeRelationsCampaigns campaigns = null;

  @SerializedName("broadcasts")
  private ModelTypeRelationsBroadcasts broadcasts = null;

  @SerializedName("programs")
  private ModelTypeRelationsPrograms programs = null;

  @SerializedName("contacts")
  private ModelTypeRelationsContacts contacts = null;

  @SerializedName("presenters")
  private ModelTypeRelationsPresenters presenters = null;

  @SerializedName("items")
  private ModelTypeRelationsItems items = null;

  @SerializedName("_external_station_id")
  private Long externalStationId = null;

  public ModelTypeResult id(Long id) {
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

  public ModelTypeResult name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "FooBar", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ModelTypeResult model(ModelEnum model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(example = "program", value = "")
  public ModelEnum getModel() {
    return model;
  }

  public void setModel(ModelEnum model) {
    this.model = model;
  }

  public ModelTypeResult createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ModelTypeResult updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", value = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public ModelTypeResult options(ModelTypeOptions options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @ApiModelProperty(value = "")
  public ModelTypeOptions getOptions() {
    return options;
  }

  public void setOptions(ModelTypeOptions options) {
    this.options = options;
  }

  public ModelTypeResult order(Long order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(example = "0", value = "")
  public Long getOrder() {
    return order;
  }

  public void setOrder(Long order) {
    this.order = order;
  }

  public ModelTypeResult deletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Get deletedAt
   * @return deletedAt
  **/
  @ApiModelProperty(example = "2016-01-11T22:01:11+02:00", value = "")
  public OffsetDateTime getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
  }

  public ModelTypeResult campaigns(ModelTypeRelationsCampaigns campaigns) {
    this.campaigns = campaigns;
    return this;
  }

   /**
   * Get campaigns
   * @return campaigns
  **/
  @ApiModelProperty(value = "")
  public ModelTypeRelationsCampaigns getCampaigns() {
    return campaigns;
  }

  public void setCampaigns(ModelTypeRelationsCampaigns campaigns) {
    this.campaigns = campaigns;
  }

  public ModelTypeResult broadcasts(ModelTypeRelationsBroadcasts broadcasts) {
    this.broadcasts = broadcasts;
    return this;
  }

   /**
   * Get broadcasts
   * @return broadcasts
  **/
  @ApiModelProperty(value = "")
  public ModelTypeRelationsBroadcasts getBroadcasts() {
    return broadcasts;
  }

  public void setBroadcasts(ModelTypeRelationsBroadcasts broadcasts) {
    this.broadcasts = broadcasts;
  }

  public ModelTypeResult programs(ModelTypeRelationsPrograms programs) {
    this.programs = programs;
    return this;
  }

   /**
   * Get programs
   * @return programs
  **/
  @ApiModelProperty(value = "")
  public ModelTypeRelationsPrograms getPrograms() {
    return programs;
  }

  public void setPrograms(ModelTypeRelationsPrograms programs) {
    this.programs = programs;
  }

  public ModelTypeResult contacts(ModelTypeRelationsContacts contacts) {
    this.contacts = contacts;
    return this;
  }

   /**
   * Get contacts
   * @return contacts
  **/
  @ApiModelProperty(value = "")
  public ModelTypeRelationsContacts getContacts() {
    return contacts;
  }

  public void setContacts(ModelTypeRelationsContacts contacts) {
    this.contacts = contacts;
  }

  public ModelTypeResult presenters(ModelTypeRelationsPresenters presenters) {
    this.presenters = presenters;
    return this;
  }

   /**
   * Get presenters
   * @return presenters
  **/
  @ApiModelProperty(value = "")
  public ModelTypeRelationsPresenters getPresenters() {
    return presenters;
  }

  public void setPresenters(ModelTypeRelationsPresenters presenters) {
    this.presenters = presenters;
  }

  public ModelTypeResult items(ModelTypeRelationsItems items) {
    this.items = items;
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public ModelTypeRelationsItems getItems() {
    return items;
  }

  public void setItems(ModelTypeRelationsItems items) {
    this.items = items;
  }

  public ModelTypeResult externalStationId(Long externalStationId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelTypeResult modelTypeResult = (ModelTypeResult) o;
    return Objects.equals(this.id, modelTypeResult.id) &&
        Objects.equals(this.name, modelTypeResult.name) &&
        Objects.equals(this.model, modelTypeResult.model) &&
        Objects.equals(this.createdAt, modelTypeResult.createdAt) &&
        Objects.equals(this.updatedAt, modelTypeResult.updatedAt) &&
        Objects.equals(this.options, modelTypeResult.options) &&
        Objects.equals(this.order, modelTypeResult.order) &&
        Objects.equals(this.deletedAt, modelTypeResult.deletedAt) &&
        Objects.equals(this.campaigns, modelTypeResult.campaigns) &&
        Objects.equals(this.broadcasts, modelTypeResult.broadcasts) &&
        Objects.equals(this.programs, modelTypeResult.programs) &&
        Objects.equals(this.contacts, modelTypeResult.contacts) &&
        Objects.equals(this.presenters, modelTypeResult.presenters) &&
        Objects.equals(this.items, modelTypeResult.items) &&
        Objects.equals(this.externalStationId, modelTypeResult.externalStationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, model, createdAt, updatedAt, options, order, deletedAt, campaigns, broadcasts, programs, contacts, presenters, items, externalStationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelTypeResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
    sb.append("    broadcasts: ").append(toIndentedString(broadcasts)).append("\n");
    sb.append("    programs: ").append(toIndentedString(programs)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    presenters: ").append(toIndentedString(presenters)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    externalStationId: ").append(toIndentedString(externalStationId)).append("\n");
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

