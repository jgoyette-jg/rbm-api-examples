/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.rcsbusinessmessaging.v1.model;

/**
 * When tapped, initiates the corresponding native action on the device.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the RCS Business Messaging API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SuggestedAction extends com.google.api.client.json.GenericJson {

  /**
   * Opens the user's default calendar app and starts the new calendar event flow with the agent-
   * specified event data pre-filled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CreateCalendarEventAction createCalendarEventAction;

  /**
   * Opens the user's default dialer app with the agent-specified phone number filled in.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DialAction dialAction;

  /**
   * (Optional) Fallback URL to use if a client doesn't support a suggested action. Fallback URLs
   * open in new browser windows.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fallbackUrl;

  /**
   * Opens the user's default web browser app to the given URL. If the user has an app installed
   * that is registered as the default handler for the URL, then this app will be opened instead,
   * and its icon will be used in the suggested action UI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OpenUrlAction openUrlAction;

  /**
   * Payload (base64 encoded) that will be sent to the agent in the user event that results when the
   * user taps the suggested action
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String postbackData;

  /**
   * Opens the RCS app's location chooser so the user can pick a location to send to the agent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ShareLocationAction shareLocationAction;

  /**
   * Text that is shown in the suggested action. Maximum 25 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * Opens the user's default map app and selects the agent-specified location or searches around
   * the user's location given an agent-specified query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ViewLocationAction viewLocationAction;

  /**
   * Opens the user's default calendar app and starts the new calendar event flow with the agent-
   * specified event data pre-filled.
   * @return value or {@code null} for none
   */
  public CreateCalendarEventAction getCreateCalendarEventAction() {
    return createCalendarEventAction;
  }

  /**
   * Opens the user's default calendar app and starts the new calendar event flow with the agent-
   * specified event data pre-filled.
   * @param createCalendarEventAction createCalendarEventAction or {@code null} for none
   */
  public SuggestedAction setCreateCalendarEventAction(CreateCalendarEventAction createCalendarEventAction) {
    this.createCalendarEventAction = createCalendarEventAction;
    return this;
  }

  /**
   * Opens the user's default dialer app with the agent-specified phone number filled in.
   * @return value or {@code null} for none
   */
  public DialAction getDialAction() {
    return dialAction;
  }

  /**
   * Opens the user's default dialer app with the agent-specified phone number filled in.
   * @param dialAction dialAction or {@code null} for none
   */
  public SuggestedAction setDialAction(DialAction dialAction) {
    this.dialAction = dialAction;
    return this;
  }

  /**
   * (Optional) Fallback URL to use if a client doesn't support a suggested action. Fallback URLs
   * open in new browser windows.
   * @return value or {@code null} for none
   */
  public java.lang.String getFallbackUrl() {
    return fallbackUrl;
  }

  /**
   * (Optional) Fallback URL to use if a client doesn't support a suggested action. Fallback URLs
   * open in new browser windows.
   * @param fallbackUrl fallbackUrl or {@code null} for none
   */
  public SuggestedAction setFallbackUrl(java.lang.String fallbackUrl) {
    this.fallbackUrl = fallbackUrl;
    return this;
  }

  /**
   * Opens the user's default web browser app to the given URL. If the user has an app installed
   * that is registered as the default handler for the URL, then this app will be opened instead,
   * and its icon will be used in the suggested action UI.
   * @return value or {@code null} for none
   */
  public OpenUrlAction getOpenUrlAction() {
    return openUrlAction;
  }

  /**
   * Opens the user's default web browser app to the given URL. If the user has an app installed
   * that is registered as the default handler for the URL, then this app will be opened instead,
   * and its icon will be used in the suggested action UI.
   * @param openUrlAction openUrlAction or {@code null} for none
   */
  public SuggestedAction setOpenUrlAction(OpenUrlAction openUrlAction) {
    this.openUrlAction = openUrlAction;
    return this;
  }

  /**
   * Payload (base64 encoded) that will be sent to the agent in the user event that results when the
   * user taps the suggested action
   * @return value or {@code null} for none
   */
  public java.lang.String getPostbackData() {
    return postbackData;
  }

  /**
   * Payload (base64 encoded) that will be sent to the agent in the user event that results when the
   * user taps the suggested action
   * @param postbackData postbackData or {@code null} for none
   */
  public SuggestedAction setPostbackData(java.lang.String postbackData) {
    this.postbackData = postbackData;
    return this;
  }

  /**
   * Opens the RCS app's location chooser so the user can pick a location to send to the agent.
   * @return value or {@code null} for none
   */
  public ShareLocationAction getShareLocationAction() {
    return shareLocationAction;
  }

  /**
   * Opens the RCS app's location chooser so the user can pick a location to send to the agent.
   * @param shareLocationAction shareLocationAction or {@code null} for none
   */
  public SuggestedAction setShareLocationAction(ShareLocationAction shareLocationAction) {
    this.shareLocationAction = shareLocationAction;
    return this;
  }

  /**
   * Text that is shown in the suggested action. Maximum 25 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * Text that is shown in the suggested action. Maximum 25 characters.
   * @param text text or {@code null} for none
   */
  public SuggestedAction setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  /**
   * Opens the user's default map app and selects the agent-specified location or searches around
   * the user's location given an agent-specified query.
   * @return value or {@code null} for none
   */
  public ViewLocationAction getViewLocationAction() {
    return viewLocationAction;
  }

  /**
   * Opens the user's default map app and selects the agent-specified location or searches around
   * the user's location given an agent-specified query.
   * @param viewLocationAction viewLocationAction or {@code null} for none
   */
  public SuggestedAction setViewLocationAction(ViewLocationAction viewLocationAction) {
    this.viewLocationAction = viewLocationAction;
    return this;
  }

  @Override
  public SuggestedAction set(String fieldName, Object value) {
    return (SuggestedAction) super.set(fieldName, value);
  }

  @Override
  public SuggestedAction clone() {
    return (SuggestedAction) super.clone();
  }

}