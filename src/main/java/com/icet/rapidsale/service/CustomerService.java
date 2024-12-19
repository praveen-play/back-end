package com.icet.rapidsale.service;

import com.icet.rapidsale.dto.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    CustomerDto saveCustomer(CustomerDto dto);

    CustomerDto updateCustomer(CustomerDto dto);

    void deleteCustomer(int id);

    List<CustomerDto> getAllCustomer();
}
