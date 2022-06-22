package kosta.jiho.restaurant.mapper;

import kosta.jiho.restaurant.domain.Dish;
import kosta.jiho.restaurant.dto.DishDTO;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DishMapper {

    DishMapper INSTANCE = Mappers.getMapper(DishMapper.class);

    @Mapping(target = "id", ignore = true)
    @BeanMapping(
            nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
            nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
    )
    Dish updateRequestToDish(DishDTO payload, @MappingTarget Dish dish);

}
