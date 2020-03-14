package com.tradingperformance.tradingperformance.Entities.Transport;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode
public class AccountCredentials implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;
    private String password;

}
