package gregtech.api.capability;

import gregtech.api.recipes.RecipeMap;

public interface IMultipleRecipeMaps {

    /**
     * Used to get all possible RecipeMaps a Multiblock can run
     * @return array of RecipeMaps
     */
    RecipeMap<?>[] getAvailableRecipeMaps();

    /**
     *
     * @return the currently selected RecipeMap
     */
    RecipeMap<?> getCurrentRecipeMap();

    /** @return the index of the currently selected RecipeMap. Used for UI. */
    int getRecipeMapIndex();

    /** Set the current RecipeMap by index. Used for UI. */
    void setRecipeMapIndex(int index);
}
