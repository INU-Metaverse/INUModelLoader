package kr.goldenmine.inumodelloader.inumodelloader.server;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitServices {
    public static final StatisticsService STATISTICS_SERVICE = new Retrofit.Builder()
            .baseUrl("http://minecraft.goldenmine.kr:20301/")
            .addConverterFactory(GsonConverterFactory.create())
            .addConverterFactory(ScalarsConverterFactory.create())
            .build()
            .create(StatisticsService.class);
}
