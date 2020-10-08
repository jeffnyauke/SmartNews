/*
 * MIT License
 *
 * Copyright (c) 2020 Jeffrey Nyauke
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package io.piestack.smartnews.data.remote.api

import io.piestack.smartnews.data.remote.api.NewsService.Companion.SMART_NEWS_API_URL
import io.piestack.smartnews.model.PostResponse
import retrofit2.Response
import retrofit2.http.GET

/**
 * Service to fetch News posts using dummy end point [SMART_NEWS_API_URL].
 */
interface NewsService {

    @GET("/feed")
    suspend fun getPostResponse(): Response<PostResponse>

    companion object {
        const val SMART_NEWS_API_URL = "https://smartapplications.free.beeceptor.com/"
    }
}
