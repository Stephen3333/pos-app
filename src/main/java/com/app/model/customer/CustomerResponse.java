package com.app.model.customer;
import com.app.model.customer.Customer;

import io.swagger.annotations.*;
import lombok.*;
import java.util.*;
import com.app.model.response.*;

@Data
@EqualsAndHashCode(callSuper=false)
public class CustomerResponse extends PageResponse {
  @ApiModelProperty(required = true, value = "")
  private List<Customer> items;
}
