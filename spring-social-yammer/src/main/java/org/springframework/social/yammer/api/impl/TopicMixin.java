/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.yammer.api.impl;

import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.yammer.api.impl.Topic.TopicExpert;

/**
 * @author Morten Andersen-Gott
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class TopicMixin {

	@JsonCreator
	public TopicMixin(
			@JsonProperty("type") String type,
			@JsonProperty("web_url") String webUrl,
			@JsonProperty("normalized_name") String normalizedName,
			@JsonProperty("experts") List<TopicExpert> experts,
			@JsonProperty("name") String name,
			@JsonProperty("id") long id
	) {}
	
	static class TopicExpertMixin{

		@JsonCreator
		public TopicExpertMixin(
			@JsonProperty("type") String type,
			@JsonProperty("id") long id
		) {}
	}
	
}
