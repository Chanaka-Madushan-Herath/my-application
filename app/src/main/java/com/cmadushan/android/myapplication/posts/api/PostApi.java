package com.cmadushan.android.myapplication.posts.api;


import com.cmadushan.android.myapplication.posts.models.Post;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostApi {
    @GET("/posts/1")
    Call<Post> getPost();

}
