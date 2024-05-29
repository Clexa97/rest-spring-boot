package com.rest.demo.data.vo.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;

import java.util.Date;
import java.io.Serializable;

@JsonPropertyOrder({"id", "author", "launchDate", "price", "title"})
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @EqualsAndHashCode
public class BookVO extends RepresentationModel<BookVO> implements Serializable {

    @JsonProperty("id")
    private Long key;
    private String author;
    private Date launchDate;
    private Double price;
    private String title;

}
