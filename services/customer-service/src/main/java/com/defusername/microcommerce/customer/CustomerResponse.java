package com.defusername.microcommerce.customer;

import lombok.Builder;

@Builder
public record CustomerResponse(String id, String firstName, String lastName, String email, Address address) {

}
