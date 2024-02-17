package com.backoffice.api.util;

import com.backoffice.api.util.page.PageableSevent;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@MappedSuperclass
public class GenericRequest extends Request implements Serializable {

     @Min(0)
     @JsonProperty(access = JsonProperty.Access.READ_ONLY)
     private Integer page;

     @Min(0)
     @Max(PageableSevent.LIMIT_DEFAULT)
     @JsonProperty(access = JsonProperty.Access.READ_ONLY)
     private Integer limit;

     private String[] sort;

}