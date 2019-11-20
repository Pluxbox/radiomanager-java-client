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
import com.pluxbox.radiomanager.api.models.ProgramDataInput;
import com.pluxbox.radiomanager.api.models.ProgramResult;
import com.pluxbox.radiomanager.api.models.ProgramResults;
import com.pluxbox.radiomanager.api.models.Success;
import com.pluxbox.radiomanager.api.models.TooManyRequests;
import com.pluxbox.radiomanager.api.models.UnprocessableEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProgramApi
 */
@Ignore
public class ProgramApiTest {

    private final ProgramApi api = new ProgramApi();

    
    /**
     * Create program.
     *
     * Create program.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createProgramTest() throws ApiException {
        ProgramDataInput data = null;
        PostSuccess response = api.createProgram(data);

        // TODO: test validations
    }
    
    /**
     * Delete program by id
     *
     * Delete program by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProgramByIdTest() throws ApiException {
        Long id = null;
        Success response = api.deleteProgramById(id);

        // TODO: test validations
    }
    
    /**
     * Get program by id
     *
     * Get program by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProgramByIdTest() throws ApiException {
        Long id = null;
        Long externalStationId = null;
        ProgramResult response = api.getProgramById(id, externalStationId);

        // TODO: test validations
    }
    
    /**
     * Get all programs.
     *
     * List all programs.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listProgramsTest() throws ApiException {
        Long page = null;
        Long broadcastId = null;
        Long modelTypeId = null;
        Long tagId = null;
        Long presenterId = null;
        Long genreId = null;
        Long blockId = null;
        Long itemId = null;
        Integer disabled = null;
        Long limit = null;
        String orderBy = null;
        String orderDirection = null;
        Long externalStationId = null;
        ProgramResults response = api.listPrograms(page, broadcastId, modelTypeId, tagId, presenterId, genreId, blockId, itemId, disabled, limit, orderBy, orderDirection, externalStationId);

        // TODO: test validations
    }
    
    /**
     * Update program by id
     *
     * Update program by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProgramByIDTest() throws ApiException {
        Long id = null;
        ProgramDataInput data = null;
        Success response = api.updateProgramByID(id, data);

        // TODO: test validations
    }
    
}
