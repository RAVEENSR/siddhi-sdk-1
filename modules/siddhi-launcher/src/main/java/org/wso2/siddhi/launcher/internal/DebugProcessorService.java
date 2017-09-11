/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */


package org.wso2.siddhi.launcher.internal;


import org.wso2.siddhi.launcher.exception.NoSuchSiddhiAppException;

/**
 * Class which manage siddhi apps and their runtime
 */
public class DebugProcessorService {

    public synchronized void debug() {
        if (EditorDataHolder.getDebugRuntime()!=null) {
            DebugRuntime runtimeHolder = EditorDataHolder.getDebugRuntime();
            runtimeHolder.debug();
        } else {
            throw new NoSuchSiddhiAppException(
                    String.format("Siddhi App %s does not exists")
            );
        }
    }

    public synchronized void stop() {
        if (EditorDataHolder.getDebugRuntime()!=null) {
            DebugRuntime runtimeHolder = EditorDataHolder.getDebugRuntime();
            runtimeHolder.stop();
        } else {
            throw new NoSuchSiddhiAppException(
                    String.format("Siddhi App %s does not exists")
            );
        }
    }
}