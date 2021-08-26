/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.apache.dubbo.sample.basic;

import org.apache.dubbo.common.stream.StreamObserver;

public interface IGreeter2 {
    /**
     * <pre>
     *  Sends a greeting
     * </pre>
     */
    String sayHelloLong(String request);

    String sayHello(String request);

    void sayHelloResponseVoid(String request);

    String sayHelloRequestVoid();

    String sayHelloException(String request);

    String sayHelloWithAttachment(String request);

    StreamObserver<String> sayHelloStream(StreamObserver<String> response);

    void sayHelloServerStream(String request, StreamObserver<String> response);
}
