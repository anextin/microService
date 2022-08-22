/*
 * Create Commitment
 * This is Swagger UI environment generated for the TMF Agreement Management specification
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.example.demo.model.eai;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * The event data structure
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-08-22T11:43:31.605Z")
public class AgreementSpecificationStateChangeEventPayload {
  @JsonProperty("agreementSpecification")
  private AgreementSpecification agreementSpecification = null;

  public AgreementSpecificationStateChangeEventPayload agreementSpecification(AgreementSpecification agreementSpecification) {
    this.agreementSpecification = agreementSpecification;
    return this;
  }

   /**
   * The involved resource data for the event
   * @return agreementSpecification
  **/
  @ApiModelProperty(value = "The involved resource data for the event")
  public AgreementSpecification getAgreementSpecification() {
    return agreementSpecification;
  }

  public void setAgreementSpecification(AgreementSpecification agreementSpecification) {
    this.agreementSpecification = agreementSpecification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgreementSpecificationStateChangeEventPayload agreementSpecificationStateChangeEventPayload = (AgreementSpecificationStateChangeEventPayload) o;
    return Objects.equals(this.agreementSpecification, agreementSpecificationStateChangeEventPayload.agreementSpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementSpecification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementSpecificationStateChangeEventPayload {\n");
    
    sb.append("    agreementSpecification: ").append(toIndentedString(agreementSpecification)).append("\n");
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

}

