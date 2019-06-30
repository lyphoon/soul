/*
 *   Licensed to the Apache Software Foundation (ASF) under one or more
 *   contributor license agreements.  See the NOTICE file distributed with
 *   this work for additional information regarding copyright ownership.
 *   The ASF licenses this file to You under the Apache License, Version 2.0
 *   (the "License"); you may not use this file except in compliance with
 *   the License.  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package org.dromara.soul.web.cache;

import org.dromara.soul.common.dto.AppAuthData;
import org.dromara.soul.common.dto.PluginData;
import org.dromara.soul.common.dto.RuleData;
import org.dromara.soul.common.dto.SelectorData;

import java.util.List;

/**
 * Abstract cache interface for support http, zookeeper, websocket, and others.
 * @author huangxiaofeng
 * @since 2.0.0
 * @date 2019/6/15 18:06
 */
public interface LookupCacheManager {

    /**
     * find auth data.
     */
    AppAuthData findAuthDataByAppKey(String appKey);

    /**
     * find plugin.
     */
    PluginData findPluginByName(String pluginName);

    /**
     * find selector list.
     */
    List<SelectorData> findSelectorByPluginName(String pluginName);

    /**
     * find rule list.
     */
    List<RuleData> findRuleBySelectorId(String selectorId);

}
