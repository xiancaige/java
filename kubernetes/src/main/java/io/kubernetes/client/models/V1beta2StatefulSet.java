/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.10.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1ObjectMeta;
import io.kubernetes.client.models.V1beta2StatefulSetSpec;
import io.kubernetes.client.models.V1beta2StatefulSetStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DEPRECATED - This group version of StatefulSet is deprecated by apps/v1/StatefulSet. See the release notes for more information. StatefulSet represents a set of pods with consistent identities. Identities are defined as:  - Network: A single stable DNS and hostname.  - Storage: As many VolumeClaims as requested. The StatefulSet guarantees that a given network identity will always map to the same storage identity.
 */
@ApiModel(description = "DEPRECATED - This group version of StatefulSet is deprecated by apps/v1/StatefulSet. See the release notes for more information. StatefulSet represents a set of pods with consistent identities. Identities are defined as:  - Network: A single stable DNS and hostname.  - Storage: As many VolumeClaims as requested. The StatefulSet guarantees that a given network identity will always map to the same storage identity.")

public class V1beta2StatefulSet {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  @SerializedName("spec")
  private V1beta2StatefulSetSpec spec = null;

  @SerializedName("status")
  private V1beta2StatefulSetStatus status = null;

  public V1beta2StatefulSet apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1beta2StatefulSet kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1beta2StatefulSet metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1beta2StatefulSet spec(V1beta2StatefulSetSpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Spec defines the desired identities of pods in this set.
   * @return spec
  **/
  @ApiModelProperty(value = "Spec defines the desired identities of pods in this set.")
  public V1beta2StatefulSetSpec getSpec() {
    return spec;
  }

  public void setSpec(V1beta2StatefulSetSpec spec) {
    this.spec = spec;
  }

  public V1beta2StatefulSet status(V1beta2StatefulSetStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Status is the current status of Pods in this StatefulSet. This data may be out of date by some window of time.
   * @return status
  **/
  @ApiModelProperty(value = "Status is the current status of Pods in this StatefulSet. This data may be out of date by some window of time.")
  public V1beta2StatefulSetStatus getStatus() {
    return status;
  }

  public void setStatus(V1beta2StatefulSetStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2StatefulSet v1beta2StatefulSet = (V1beta2StatefulSet) o;
    return Objects.equals(this.apiVersion, v1beta2StatefulSet.apiVersion) &&
        Objects.equals(this.kind, v1beta2StatefulSet.kind) &&
        Objects.equals(this.metadata, v1beta2StatefulSet.metadata) &&
        Objects.equals(this.spec, v1beta2StatefulSet.spec) &&
        Objects.equals(this.status, v1beta2StatefulSet.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2StatefulSet {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
