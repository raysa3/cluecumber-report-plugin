/*
 * Copyright 2018 trivago N.V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.trivago.cluecumber.rendering.pages.pojos.pagecollections;

import com.trivago.cluecumber.constants.PluginSettings;
import com.trivago.cluecumber.json.pojo.Element;

public class ScenarioDetailsPageCollection extends PageCollection {
    private final Element element;

    public ScenarioDetailsPageCollection(final Element element) {
        super(PluginSettings.SCENARIO_DETAIL_PAGE_NAME);
        this.element = element;
    }

    public Element getElement() {
        return element;
    }
}
