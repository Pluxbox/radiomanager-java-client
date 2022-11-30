/*
 * RadioManager
 * This OpenAPI 3 Document describes the functionality of the API v2 of RadioManager. Note that no rights can be derived from this Document and the true functionality of the API might differ.
 *
 * The version of the OpenAPI document: 2.0
 * Contact: support@pluxbox.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package radiomanager;

import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.models.GenreResult;
import com.pluxbox.radiomanager.api.models.InlineResponse2006;
import com.pluxbox.radiomanager.api.models.InlineResponse400;
import com.pluxbox.radiomanager.api.models.InlineResponse401;
import com.pluxbox.radiomanager.api.models.InlineResponse403;
import com.pluxbox.radiomanager.api.models.InlineResponse404;
import com.pluxbox.radiomanager.api.models.InlineResponse422;
import com.pluxbox.radiomanager.api.models.InlineResponse429;
import com.pluxbox.radiomanager.api.models.InlineResponse500;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GenreApi
 */
@Disabled
public class GenreApiTest {

    private final GenreApi api = new GenreApi();

    /**
     * Get genre by id
     *
     * Get genre by id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGenreByIdTest() throws ApiException {
        Long id = null;
        GenreResult response = api.getGenreById(id);
        // TODO: test validations
    }

    /**
     * List all genres.
     *
     * List all genres.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listGenresTest() throws ApiException {
        Long page = null;
        Long limit = null;
        String orderBy = null;
        String orderDirection = null;
        InlineResponse2006 response = api.listGenres(page, limit, orderBy, orderDirection);
        // TODO: test validations
    }

}
