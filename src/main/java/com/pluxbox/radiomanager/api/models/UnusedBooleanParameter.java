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

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.pluxbox.radiomanager.api.invoker.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UnusedBooleanParameter extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UnusedBooleanParameter.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UnusedBooleanParameter.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UnusedBooleanParameter' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Boolean> adapterBoolean = gson.getDelegateAdapter(this, TypeToken.get(Boolean.class));
            final TypeAdapter<Integer> adapterInteger = gson.getDelegateAdapter(this, TypeToken.get(Integer.class));

            return (TypeAdapter<T>) new TypeAdapter<UnusedBooleanParameter>() {
                @Override
                public void write(JsonWriter out, UnusedBooleanParameter value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `Boolean`
                    if (value.getActualInstance() instanceof Boolean) {
                        JsonObject obj = adapterBoolean.toJsonTree((Boolean)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `Integer`
                    if (value.getActualInstance() instanceof Integer) {
                        JsonObject obj = adapterInteger.toJsonTree((Integer)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: Boolean, Integer");
                }

                @Override
                public UnusedBooleanParameter read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize Boolean
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Boolean.validateJsonObject(jsonObject);
                        actualAdapter = adapterBoolean;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Boolean'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Boolean failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Boolean'", e);
                    }

                    // deserialize Integer
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Integer.validateJsonObject(jsonObject);
                        actualAdapter = adapterInteger;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Integer'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Integer failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Integer'", e);
                    }

                    if (match == 1) {
                        UnusedBooleanParameter ret = new UnusedBooleanParameter();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for UnusedBooleanParameter: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public UnusedBooleanParameter() {
        super("oneOf", Boolean.FALSE);
    }

    public UnusedBooleanParameter(Boolean o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UnusedBooleanParameter(Integer o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Boolean", new GenericType<Boolean>() {
        });
        schemas.put("Integer", new GenericType<Integer>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return UnusedBooleanParameter.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Boolean, Integer
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Boolean) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Integer) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Boolean, Integer");
    }

    /**
     * Get the actual instance, which can be the following:
     * Boolean, Integer
     *
     * @return The actual instance (Boolean, Integer)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Boolean`. If the actual instance is not `Boolean`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Boolean`
     * @throws ClassCastException if the instance is not `Boolean`
     */
    public Boolean getBoolean() throws ClassCastException {
        return (Boolean)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Integer`. If the actual instance is not `Integer`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Integer`
     * @throws ClassCastException if the instance is not `Integer`
     */
    public Integer getInteger() throws ClassCastException {
        return (Integer)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UnusedBooleanParameter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with Boolean
    try {
      Boolean.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for Boolean failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with Integer
    try {
      Integer.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for Integer failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for UnusedBooleanParameter with oneOf schemas: Boolean, Integer. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of UnusedBooleanParameter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UnusedBooleanParameter
  * @throws IOException if the JSON string is invalid with respect to UnusedBooleanParameter
  */
  public static UnusedBooleanParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UnusedBooleanParameter.class);
  }

 /**
  * Convert an instance of UnusedBooleanParameter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

