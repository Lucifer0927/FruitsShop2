package bwie.com.fruitsshop.core;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by 葛凯旋 on 2017/8/4.
 */

public class ApiCenertor {

    static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://h5test.newaircloud.com/api/")
            .addConverterFactory(ScalarsConverterFactory.create())
            .build();

    public static ApiService getApiService() {


        ApiService service = retrofit.create(ApiService.class);
        return service;
    }

}
