package club.codetips.design.patterns.template.example;

/**
 * @author ravikumar
 * @since 27/11/22
 */
public class Main {
    public static void main(String[] arg){
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        Tea tea = new Tea();
        tea.prepareRecipe();

    }
}
