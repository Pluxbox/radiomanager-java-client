/*
 * RadioManager
 * RadioManager
 *
 * OpenAPI spec version: 2.0
 * Contact: support@pluxbox.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.pluxbox.radiomanager.api.v2;

import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.models.Forbidden;
import com.pluxbox.radiomanager.api.models.NotFound;
import com.pluxbox.radiomanager.api.models.PostSuccess;
import com.pluxbox.radiomanager.api.models.Success;
import com.pluxbox.radiomanager.api.models.TagDataInput;
import com.pluxbox.radiomanager.api.models.TagResult;
import com.pluxbox.radiomanager.api.models.TagResults;
import com.pluxbox.radiomanager.api.models.TooManyRequests;
import com.pluxbox.radiomanager.api.models.UnprocessableEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TagApi
 */
@Ignore
public class TagApiTest {

    private final TagApi api = new TagApi();

    
    /**
     * Create tag.
     *
     * Create tag.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTagTest() throws ApiException {
        TagDataInput data = null;
        PostSuccess response = api.createTag(data);

        // TODO: test validations
    }
    
    /**
     * Delete tag by id
     *
     * Delete tag by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTagByIdTest() throws ApiException {
        Long id = null;
        Success response = api.deleteTagById(id);

        // TODO: test validations
    }
    
    /**
     * Get tags by id
     *
     * Get tags by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTagByIdTest() throws ApiException {
        Long id = null;
        Long externalStationId = null;
        TagResult response = api.getTagById(id, externalStationId);

        // TODO: test validations
    }
    
    /**
     * Get a list of all the tags currently in your station.
     *
     * Get a list of all the tags currently in your station. This feature supports pagination and will give a maximum results of 50 tags back.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTagsTest() throws ApiException {
        Long page = null;
        Long programId = null;
        Long itemId = null;
        Long broadcastId = null;
        Long contactId = null;
        Long externalStationId = null;
        TagResults response = api.listTags(page, programId, itemId, broadcastId, contactId, externalStationId);

        // TODO: test validations
    }
    
    /**
     * Update tag by id
     *
     * Update tag by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTagByIDTest() throws ApiException {
        Long id = null;
        TagDataInput data = null;
        Success response = api.updateTagByID(id, data);

        // TODO: test validations
    }
    
}
