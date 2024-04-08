package com.firstrestAPI.demo.modern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CloudVendor {
    private String vendorName;
    private String vendorID;
    private String vendorAddress;
    private String vendorPhoneNumber;
}