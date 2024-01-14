package app.lawnchair.search.data.suggestion

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface StartPageService {
    @GET("suggestions")
    suspend fun getStartPageSuggestions(
        @Query("q") query: String,
    ): Response<ResponseBody>
}
