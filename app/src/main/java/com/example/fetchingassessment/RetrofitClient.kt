package com.example.fetchingassessment

import retrofit2.converter.gson.GsonConverterFactory

object retrofit {

}
public class RetrofitClient {
        private static Retrofit retrofit;
        private static final String BASE_URL = "https://jsonplaceholder.typicode.com/posts ";

        public static Retrofit getClient() {
            if (retrofit == null) {
                val BASE_URL = null
                val new = null
                retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            }
            return retrofit;
        }

    companion object
}
}