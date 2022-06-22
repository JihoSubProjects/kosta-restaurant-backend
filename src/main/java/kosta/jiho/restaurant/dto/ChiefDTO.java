package kosta.jiho.restaurant.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ChiefDTO {

    @NotNull
    @NotBlank
    private String name;

    public ChiefDTO() {}

    public ChiefDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
