package com.rest.demo.integrationtests.wrappers;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rest.demo.integrationtests.BookVO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor @Getter @Setter @AllArgsConstructor
public class BookEmbeddedVO implements Serializable{

    @JsonProperty("bookVOList")
    private List<BookVO> books;
}
