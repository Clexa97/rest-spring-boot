package com.rest.demo.integrationtests.pagedmodels;
import com.rest.demo.integrationtests.BookVO;
import com.rest.demo.integrationtests.PersonVO;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@NoArgsConstructor @Getter @Setter
@XmlRootElement
public class PagedModelBook {
    @XmlElement(name = "content")
    private List<BookVO> content;
}

