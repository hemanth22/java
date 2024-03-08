/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.cert.manager.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * Challenge specifies a challenge offered by the ACME server for an Order. An appropriate Challenge resource can be created to perform the ACME challenge process.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:00:20.132973Z[Etc/UTC]")
public class V1OrderStatusAuthorizationsInnerChallengesInner {
  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public V1OrderStatusAuthorizationsInnerChallengesInner() {
  }

  public V1OrderStatusAuthorizationsInnerChallengesInner token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Token is the token that must be presented for this challenge. This is used to compute the &#39;key&#39; that must also be presented.
   * @return token
  **/
  @jakarta.annotation.Nonnull
  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public V1OrderStatusAuthorizationsInnerChallengesInner type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type is the type of challenge being offered, e.g. &#39;http-01&#39;, &#39;dns-01&#39;, &#39;tls-sni-01&#39;, etc. This is the raw value retrieved from the ACME server. Only &#39;http-01&#39; and &#39;dns-01&#39; are supported by cert-manager, other values will be ignored.
   * @return type
  **/
  @jakarta.annotation.Nonnull
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public V1OrderStatusAuthorizationsInnerChallengesInner url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL is the URL of this challenge. It can be used to retrieve additional metadata about the Challenge from the ACME server.
   * @return url
  **/
  @jakarta.annotation.Nonnull
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1OrderStatusAuthorizationsInnerChallengesInner v1OrderStatusAuthorizationsInnerChallengesInner = (V1OrderStatusAuthorizationsInnerChallengesInner) o;
    return Objects.equals(this.token, v1OrderStatusAuthorizationsInnerChallengesInner.token) &&
        Objects.equals(this.type, v1OrderStatusAuthorizationsInnerChallengesInner.type) &&
        Objects.equals(this.url, v1OrderStatusAuthorizationsInnerChallengesInner.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1OrderStatusAuthorizationsInnerChallengesInner {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("token");
    openapiFields.add("type");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("token");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1OrderStatusAuthorizationsInnerChallengesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1OrderStatusAuthorizationsInnerChallengesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1OrderStatusAuthorizationsInnerChallengesInner is not found in the empty JSON string", V1OrderStatusAuthorizationsInnerChallengesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1OrderStatusAuthorizationsInnerChallengesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1OrderStatusAuthorizationsInnerChallengesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1OrderStatusAuthorizationsInnerChallengesInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1OrderStatusAuthorizationsInnerChallengesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1OrderStatusAuthorizationsInnerChallengesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1OrderStatusAuthorizationsInnerChallengesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1OrderStatusAuthorizationsInnerChallengesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1OrderStatusAuthorizationsInnerChallengesInner>() {
           @Override
           public void write(JsonWriter out, V1OrderStatusAuthorizationsInnerChallengesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1OrderStatusAuthorizationsInnerChallengesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1OrderStatusAuthorizationsInnerChallengesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1OrderStatusAuthorizationsInnerChallengesInner
  * @throws IOException if the JSON string is invalid with respect to V1OrderStatusAuthorizationsInnerChallengesInner
  */
  public static V1OrderStatusAuthorizationsInnerChallengesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1OrderStatusAuthorizationsInnerChallengesInner.class);
  }

 /**
  * Convert an instance of V1OrderStatusAuthorizationsInnerChallengesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
