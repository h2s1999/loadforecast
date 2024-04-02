package io.vpplab.external.client.datahub;

import io.vpplab.external.client.vpf.VPFDto;

import java.util.List;

public interface DatahubDao {
    int insertLoadForecast(List<VPFDto.InsertLFRequest> insertLFRequests);
}
