package com.system.LinkSathi.services.user_management;

import com.system.LinkSathi.dto.CustomerDto;
import com.system.LinkSathi.entity.user_management.Customer;

import java.util.List;

public interface CustomerService {
    String saveData(CustomerDto customerDto);

    List<Customer> getData();
}
