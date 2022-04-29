/*
 * Copyright 2017-2022 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.microstream.rest;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.serde.annotation.Serdeable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * This object represents a root object for the Microstream REST api.
 *
 * @author Tim Yates
 * @since 1.0.0
 */
@Serdeable
public class RootObject {

    /**
     * root name.
     */
    @NonNull
    @NotBlank
    private final String name;

    /**
     * the root object id.
     */
    @NonNull
    @NotNull
    private final Long objectId;

    /**
     * Constructor.
     *
     * @param name     root name
     * @param objectId the root object id
     */
    public RootObject(@NonNull String name, @NonNull Long objectId) {
        this.name = name;
        this.objectId = objectId;
    }

    /**
     * @return the name of the root object
     */
    @NonNull
    public String getName() {
        return name;
    }

    /**
     * @return the id of the root object
     */
    @NonNull
    public Long getObjectId() {
        return objectId;
    }
}