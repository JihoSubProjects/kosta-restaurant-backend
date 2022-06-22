package kosta.jiho.restaurant.mapper;

import kosta.jiho.restaurant.domain.Chief;
import kosta.jiho.restaurant.dto.ChiefDTO;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ChiefMapper {

    ChiefMapper INSTANCE = Mappers.getMapper(ChiefMapper.class);

    @Mapping(target = "id", ignore = true)
    @BeanMapping(
            nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
            nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
    )
    Chief updateRequestToChief(ChiefDTO payload, @MappingTarget Chief chief);

}
