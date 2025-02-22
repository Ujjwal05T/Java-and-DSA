import java.util.*;

public class PotionOrbsCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> lines = new ArrayList<>();
        for (int i = 0; i < n + 1 ; i++) {
            lines.add(scanner.nextLine().trim());
        }


        Map<String, List<List<String>>> recipes = parseRecipesAndTarget(n, lines);
        String targetPotion = lines.get(n);

        Map<String, Integer> memo = new HashMap<>();
        int result = minOrbs(targetPotion, recipes, memo);


        System.out.println(result);
    }

    private static Map<String, List<List<String>>> parseRecipesAndTarget(int n, List<String> lines) {
        Map<String, List<List<String>>> recipes = new HashMap<>();
        for (String line : lines.subList(0, n)) {
            String[] parts = line.split("=");
            String potion = parts[0].trim();
            String[] ingredientsList = parts[1].split("\\+");

            List<String> ingredients = new ArrayList<>();
            for (String ingredient : ingredientsList) {
                ingredients.add(ingredient.trim());
            }

            recipes.computeIfAbsent(potion, k -> new ArrayList<>()).add(ingredients);
        }
        return recipes;
    }

    private static int minOrbs(String potion, Map<String, List<List<String>>> recipes, Map<String, Integer> memo) {
        if (!recipes.containsKey(potion)) {
            return 0; // Base case: potion is an item
        }
        if (memo.containsKey(potion)) {
            return memo.get(potion);
        }

        int minOrbsNeeded = Integer.MAX_VALUE;
        for (List<String> recipe : recipes.get(potion)) {
            int orbs = recipe.size() - 1;
            for (String ingredient : recipe) {
                orbs += minOrbs(ingredient, recipes, memo);
            }
            minOrbsNeeded = Math.min(minOrbsNeeded, orbs);
        }

        memo.put(potion, minOrbsNeeded);
        return minOrbsNeeded;
    }
}
