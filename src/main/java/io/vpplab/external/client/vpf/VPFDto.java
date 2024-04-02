package io.vpplab.external.client.vpf;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class VPFDto {

    public record InsertLFRequest(
            boolean jejuYn
            , String  scheduleType
            , LocalDateTime transactionAt
            , BigDecimal value
//            , int seqNo
    ){};
}
