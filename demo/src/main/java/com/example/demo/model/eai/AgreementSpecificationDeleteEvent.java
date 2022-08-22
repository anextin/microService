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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-22T11:43:31.605Z")
public class AgreementSpecificationDeleteEvent {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

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

  @JsonProperty("event")
  private AgreementSpecificationDeleteEventPayload event = null;

  public AgreementSpecificationDeleteEvent id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the resource involved in the event
   * @return id
  **/
  //@ApiModelProperty(value = "Identifier of the resource involved in the event")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AgreementSpecificationDeleteEvent href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Reference of the resource involved in the event
   * @return href
  **/
  //@ApiModelProperty(value = "Reference of the resource involved in the event")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public AgreementSpecificationDeleteEvent eventId(String eventId) {
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

  public AgreementSpecificationDeleteEvent eventTime(String eventTime) {
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

  public AgreementSpecificationDeleteEvent eventType(String eventType) {
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

  public AgreementSpecificationDeleteEvent correlationId(String correlationId) {
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

  public AgreementSpecificationDeleteEvent domain(String domain) {
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

  public AgreementSpecificationDeleteEvent title(String title) {
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

  public AgreementSpecificationDeleteEvent description(String description) {
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

  public AgreementSpecificationDeleteEvent priority(String priority) {
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

  public AgreementSpecificationDeleteEvent timeOcurred(String timeOcurred) {
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

  public AgreementSpecificationDeleteEvent event(AgreementSpecificationDeleteEventPayload event) {
    this.event = event;
    return this;
  }

   /**
   * The event payload linked to the involved resource object
   * @return event
  **/
  //@ApiModelProperty(value = "The event payload linked to the involved resource object")
  public AgreementSpecificationDeleteEventPayload getEvent() {
    return event;
  }

  public void setEvent(AgreementSpecificationDeleteEventPayload event) {
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
    AgreementSpecificationDeleteEvent agreementSpecificationDeleteEvent = (AgreementSpecificationDeleteEvent) o;
    return Objects.equals(this.id, agreementSpecificationDeleteEvent.id) &&
        Objects.equals(this.href, agreementSpecificationDeleteEvent.href) &&
        Objects.equals(this.eventId, agreementSpecificationDeleteEvent.eventId) &&
        Objects.equals(this.eventTime, agreementSpecificationDeleteEvent.eventTime) &&
        Objects.equals(this.eventType, agreementSpecificationDeleteEvent.eventType) &&
        Objects.equals(this.correlationId, agreementSpecificationDeleteEvent.correlationId) &&
        Objects.equals(this.domain, agreementSpecificationDeleteEvent.domain) &&
        Objects.equals(this.title, agreementSpecificationDeleteEvent.title) &&
        Objects.equals(this.description, agreementSpecificationDeleteEvent.description) &&
        Objects.equals(this.priority, agreementSpecificationDeleteEvent.priority) &&
        Objects.equals(this.timeOcurred, agreementSpecificationDeleteEvent.timeOcurred) &&
        Objects.equals(this.event, agreementSpecificationDeleteEvent.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, eventId, eventTime, eventType, correlationId, domain, title, description, priority, timeOcurred, event);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementSpecificationDeleteEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    timeOcurred: ").append(toIndentedString(timeOcurred)).append("\n");
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

