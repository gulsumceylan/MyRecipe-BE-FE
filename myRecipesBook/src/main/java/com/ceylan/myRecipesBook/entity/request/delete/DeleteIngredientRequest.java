package com.ceylan.myRecipesBook.entity.request.delete;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeleteIngredientRequest {
    private int ingredientId;
}