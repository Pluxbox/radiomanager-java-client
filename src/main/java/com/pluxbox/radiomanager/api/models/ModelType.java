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
import com.pluxbox.radiomanager.api.models.ModelTypeOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * ModelType
 */

public class ModelType {
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

  public ModelType id(Long id) {
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

  public ModelType name(String name) {
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

  public ModelType model(ModelEnum model) {
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

  public ModelType createdAt(OffsetDateTime createdAt) {
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

  public ModelType updatedAt(OffsetDateTime updatedAt) {
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

  public ModelType options(ModelTypeOptions options) {
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

  public ModelType order(Long order) {
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

  public ModelType deletedAt(OffsetDateTime deletedAt) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelType modelType = (ModelType) o;
    return Objects.equals(this.id, modelType.id) &&
        Objects.equals(this.name, modelType.name) &&
        Objects.equals(this.model, modelType.model) &&
        Objects.equals(this.createdAt, modelType.createdAt) &&
        Objects.equals(this.updatedAt, modelType.updatedAt) &&
        Objects.equals(this.options, modelType.options) &&
        Objects.equals(this.order, modelType.order) &&
        Objects.equals(this.deletedAt, modelType.deletedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, model, createdAt, updatedAt, options, order, deletedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
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

