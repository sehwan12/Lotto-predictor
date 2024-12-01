package com.lotto_predictor.api;

import com.lotto_predictor.model.LotteryResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
/**
* 주어진 api 엔드포인트를 정의하고, 필요한 쿼리 파라미터를 설정
* */

public interface LotteryApiService {
    @GET("common.do?method=getLottoNumber")
    Call<LotteryResult> getLotteryNumber(@Query("drwNo") int drwNo);
}
