package com.scut.crm.web.vo.save;

import lombok.Data;

@Data
public class ContractSaveRequest {

    private String cont_cust_serialNumber;

    private String cont_name;

    private String cont_type;

    private String cont_state;

    private String cont_money;

}
