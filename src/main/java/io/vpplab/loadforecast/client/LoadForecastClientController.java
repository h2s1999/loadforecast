package io.vpplab.loadforecast.client;


import io.vpplab.kpx.loadforecast.prod.GetLoadForecastResponseMessageType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/loadforecast")
@RequiredArgsConstructor
public class LoadForecastClientController {

    @Qualifier(value = "marshalClearingService")
    private final LoadForecastClientServiceDev loadForecastClientServiceDev;


    /**
     * 예측수요(실시간) 조회 후 데이터 등록 (VPF, Datahub)
     * param 값이 null 이면 오늘 날짜, RT(실시간), JEJU
     * {
     *      "requestDate": "2024-03-01"
     *      ,"scheduleType":"RT"
     *      ,"areaCode":"JEJU"
     * }
     * @param param
     * @return
     */
    @PostMapping("/getRTLoadForecast")
    public int insertRTLoadForecastData(@RequestBody Map<String,Object> param){
        return loadForecastClientServiceDev.insertRTLoadForecastData(param);
    }

    /**
     * 예측수요(실시간) 조회
     * @return
     */
    /*@PostMapping("/getRTLoadForecast")
    public GetRTLoadForecastResponseMessageType getRTLoadForecast(@RequestBody Map<String,Object> param){
        return loadForecastClientService.getRTLoadForecastData(param);
    }*/

    /**
     * 예측수요(일반) 조회
     * @return
     */
    @GetMapping("/getLoadForecast")
    public GetLoadForecastResponseMessageType getLoadForecast(){
        return loadForecastClientServiceDev.getLoadForecastData();
    }

}
