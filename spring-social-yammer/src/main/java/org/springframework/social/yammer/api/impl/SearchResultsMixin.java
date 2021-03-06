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
import org.springframework.social.yammer.api.impl.SearchResults.SearchStats;

/**
 * @author Morten Andersen-Gott
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class SearchResultsMixin {

	@JsonCreator
	public SearchResultsMixin(
		@JsonProperty("messages") MessageInfo messages,
		@JsonProperty("users") List<YammerProfile> users,
		@JsonProperty("groups") List<Group> groups,
		@JsonProperty("count") SearchStats stats,
		@JsonProperty("topics") List<Topic> topics
	) {}
	
	
	static class SearchStatsMixin{
		@JsonCreator
		public SearchStatsMixin(
		  @JsonProperty("groups") int groups,
		  @JsonProperty("messages") int messages,
		  @JsonProperty("topics") int topics,
		  @JsonProperty("users") int users
		) {}
	}
	
}
