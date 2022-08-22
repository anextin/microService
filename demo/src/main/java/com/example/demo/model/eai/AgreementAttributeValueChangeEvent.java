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
 * The notification data structure
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-08-22T11:43:31.605Z")
public class AgreementAttributeValueChangeEvent {
  @JsonProperty("eventId")
  private String eventId = null;

  @JsonProperty("eventTime")
  private String eventTime = null;

  @JsonProperty("eventType")
  private String eventType = null;

  @JsonProperty("correlationId")
  private String correlationId = null;

  @JsonProperty("domain")
  private String domain = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("priority")
  private String priority = null;

  @JsonProperty("timeOcurred")
  private String timeOcurred = null;

  @JsonProperty("fieldPath")
  private String fieldPath = null;

  @JsonProperty("event")
  private AgreementAttributeValueChangeEventPayload event = null;

  public AgreementAttributeValueChangeEvent eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * The identifier of the notification.
   * @return eventId
  **/
  //@ApiModelProperty(value = "The identifier of the notification.")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public AgreementAttributeValueChangeEvent eventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

   /**
   * Time of the event occurrence.
   * @return eventTime
  **/
  //@ApiModelProperty(value = "Time of the event occurrence.")
  public String getEventTime() {
    return eventTime;
  }

  public void setEventTime(String eventTime) {
    this.eventTime = eventTime;
  }

  public AgreementAttributeValueChangeEvent eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * The type of the notification.
   * @return eventType
  **/
  //@ApiModelProperty(value = "The type of the notification.")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public AgreementAttributeValueChangeEvent correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

   /**
   * The correlation id for this event.
   * @return correlationId
  **/
  //@ApiModelProperty(value = "The correlation id for this event.")
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public AgreementAttributeValueChangeEvent domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * The domain of the event.
   * @return domain
  **/
  //@ApiModelProperty(value = "The domain of the event.")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public AgreementAttributeValueChangeEvent title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the event.
   * @return title
  **/
  //@ApiModelProperty(value = "The title of the event.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AgreementAttributeValueChangeEvent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * An explanatory of the event.
   * @return description
  **/
  //@ApiModelProperty(value = "An explanatory of the event.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AgreementAttributeValueChangeEvent priority(String priority) {
    this.priority = priority;
    return this;
  }

   /**
   * A priority.
   * @return priority
  **/
  //@ApiModelProperty(value = "A priority.")
  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public AgreementAttributeValueChangeEvent timeOcurred(String timeOcurred) {
    this.timeOcurred = timeOcurred;
    return this;
  }

   /**
   * The time the event occured.
   * @return timeOcurred
  **/
  //@ApiModelProperty(value = "The time the event occured.")
  public String getTimeOcurred() {
    return timeOcurred;
  }

  public void setTimeOcurred(String timeOcurred) {
    this.timeOcurred = timeOcurred;
  }

  public AgreementAttributeValueChangeEvent fieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }

   /**
   * The path identifying the object field concerned by this notification.
   * @return fieldPath
  **/
  //@ApiModelProperty(value = "The path identifying the object field concerned by this notification.")
  public String getFieldPath() {
    return fieldPath;
  }

  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }

  public AgreementAttributeValueChangeEvent event(AgreementAttributeValueChangeEventPayload event) {
    this.event = event;
    return this;
  }

   /**
   * The event payload linked to the involved resource object
   * @return event
  **/
  //@ApiModelProperty(value = "The event payload linked to the involved resource object")
  public AgreementAttributeValueChangeEventPayload getEvent() {
    return event;
  }

  public void setEvent(AgreementAttributeValueChangeEventPayload event) {
    this.event = event;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgreementAttributeValueChangeEvent agreementAttributeValueChangeEvent = (AgreementAttributeValueChangeEvent) o;
    return Objects.equals(this.eventId, agreementAttributeValueChangeEvent.eventId) &&
        Objects.equals(this.eventTime, agreementAttributeValueChangeEvent.eventTime) &&
        Objects.equals(this.eventType, agreementAttributeValueChangeEvent.eventType) &&
        Objects.equals(this.correlationId, agreementAttributeValueChangeEvent.correlationId) &&
        Objects.equals(this.domain, agreementAttributeValueChangeEvent.domain) &&
        Objects.equals(this.title, agreementAttributeValueChangeEvent.title) &&
        Objects.equals(this.description, agreementAttributeValueChangeEvent.description) &&
        Objects.equals(this.priority, agreementAttributeValueChangeEvent.priority) &&
        Objects.equals(this.timeOcurred, agreementAttributeValueChangeEvent.timeOcurred) &&
        Objects.equals(this.fieldPath, agreementAttributeValueChangeEvent.fieldPath) &&
        Objects.equals(this.event, agreementAttributeValueChangeEvent.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventTime, eventType, correlationId, domain, title, description, priority, timeOcurred, fieldPath, event);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementAttributeValueChangeEvent {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    timeOcurred: ").append(toIndentedString(timeOcurred)).append("\n");
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

