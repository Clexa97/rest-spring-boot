package com.rest.demo.mapper;

import org.apache.catalina.mapper.Mapper;
import org.modelmapper.ModelMapper;

import java.util.List;

public class DozerMapper {

    public static <O, D> D parseObject(O origin, Class<D> destination) {
        return new ModelMapper().map(origin, destination);
    }

    public static <O, D> List<D> parseListObjects(List<O> origin, Class<D> destination) {
        return origin.stream().map(o -> parseObject(o, destination)).toList();
    }
}
