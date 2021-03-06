/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.apache.geode.cache.client;

import org.apache.geode.cache.Region;


/**
 * An exception indicating that client subscriptions are not enabled on this client, but the client
 * is trying to perform an operation that requires a client subscription, such as
 * {@link Region#registerInterest(Object)}.
 * 
 * @since GemFire 5.7
 */
public class SubscriptionNotEnabledException extends ServerConnectivityException {
  private static final long serialVersionUID = -8212446737778234890L;

  /**
   * Create a new instance of SubscriptionNotEnabledException without a detail message or cause.
   */
  public SubscriptionNotEnabledException() {}

  /**
   * Create a new instance of SubscriptionNotEnabledException with a detail message
   * 
   * @param message the detail message
   */
  public SubscriptionNotEnabledException(String message) {
    super(message);
  }

  /**
   * Create a new instance of SubscriptionNotEnabledException with a detail message and cause
   * 
   * @param message the detail message
   * @param cause the cause
   */
  public SubscriptionNotEnabledException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * Create a new instance of SubscriptionNotEnabledException with a and cause
   * 
   * @param cause the cause
   */
  public SubscriptionNotEnabledException(Throwable cause) {
    super(cause);
  }

}
