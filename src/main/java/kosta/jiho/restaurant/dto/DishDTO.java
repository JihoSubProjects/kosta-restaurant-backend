package kosta.jiho.restaurant.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class DishDTO {
    @NotNull
    @NotBlank
    private String name;
    @NotNull
    private Integer cookingDuration;
    @NotNull
    private Integer price;

    public DishDTO() {}

    public DishDTO(String name, Integer cookingDuration, Integer price) {
        this.name = name;
        this.cookingDuration = cookingDuration;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCookingDuration() {
        return cookingDuration;
    }

    public void setCookingDuration(Integer cookingDuration) {
        this.cookingDuration = cookingDuration;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
