package com.defusername.ecommerce.customer_service.customer;

import lombok.Builder;

@Builder
public record CustomerResponse(String id, String firstName, String lastName, String email, Address address) {

}
