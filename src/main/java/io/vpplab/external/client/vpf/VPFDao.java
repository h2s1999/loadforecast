package io.vpplab.external.client.vpf;

import java.util.List;

public interface VPFDao {

    int insertLoadForecast(List<VPFDto.InsertLFRequest> insertLFRequests);
}
