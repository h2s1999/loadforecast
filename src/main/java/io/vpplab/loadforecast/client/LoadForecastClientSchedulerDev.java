package io.vpplab.loadforecast.client;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Profile("dev")
@RequiredArgsConstructor
public class LoadForecastClientSchedulerDev {

    // TODO 테스트 엔드포인트를 바라보는 서비스, 6/1 전에 엔드포인트 변동 확인 필요
    @Qualifier(value = "marshalClearingService")
    private final LoadForecastClientServiceDev loadForecastClientServiceDev;

    @Scheduled(cron = "0 */15 * * * ?", zone = "Asia/Seoul")
    public void setRTLoadForecast(){
        loadForecastClientServiceDev.insertRTLoadForecastData(null);
    }

}
