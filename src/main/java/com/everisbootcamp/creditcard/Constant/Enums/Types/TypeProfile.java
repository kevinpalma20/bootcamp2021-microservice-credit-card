package com.everisbootcamp.creditcard.Constant.Enums.Types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TypeProfile {
    VIP("VIP"),
    PYME("PYME");

    private String name;
}
