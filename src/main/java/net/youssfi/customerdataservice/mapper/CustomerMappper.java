package net.youssfi.customerdataservice.mapper;

import net.youssfi.customerdataservice.dto.CustomerRequest;
import net.youssfi.customerdataservice.entities.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomerMappper {
    private ModelMapper modelMapper = new ModelMapper();
    public Customer from(CustomerRequest customerRequest){
        //Customer customer = new Customer();
        //customer.setName(customerRequest.name());
        //customer.setEmail(customerRequest.email());
        return  modelMapper.map(customerRequest, Customer.class);
        //return customer;

    }
}
