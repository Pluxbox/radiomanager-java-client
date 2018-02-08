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
import com.pluxbox.radiomanager.api.models.SearchDataInput;
import com.pluxbox.radiomanager.api.models.TooManyRequests;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchApi
 */
@Ignore
public class SearchApiTest {

    private final SearchApi api = new SearchApi();

    
    /**
     * Search.
     *
     * You know. For search.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSearchTest() throws ApiException {
        SearchDataInput data = null;
        api.getSearch(data);

        // TODO: test validations
    }
    
}
