import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] menu = {"cheesecake", "borscht", "dumplings", "burger", "caesar salad", "pasta with seafood", "cheese soup", "sushi"};
        String dish = "";
        boolean isHaveDish = true;

        System.out.println("Today's menu of the day:");
        for (String currentDish : menu) {
            System.out.println(currentDish);
        }
        System.out.println();

        System.out.println("Please enter the name of the dish you want to prepare:");
        dish = scanner.nextLine();

        System.out.println("Here's the recipe" + dish + ":\n");

        switch (dish.toLowerCase()){
            case "cheesecake":
                System.out.println("To make the base, butter and line a 23cm loose-bottomed tin with baking parchment. Put the digestive biscuits in a plastic food bag and crush to crumbs using a rolling pin. Transfer the crumbs to a bowl, then pour over the melted butter. Mix thoroughly until the crumbs are completely coated. Tip them into the prepared tin and press firmly down into the base to create an even layer. Chill in the fridge for 1 hr to set firmly.\n" +
                        "Slice the vanilla pod in half lengthways, leaving the tip intact, so that the two halves are still joined. Holding onto the tip of the pod, scrape out the seeds using the back of a kitchen knife.\n" +
                        "Pour the double cream into a bowl and whisk with an electric mixer until it’s just starting to thicken to soft peaks. Place the soft cheese, icing sugar and the vanilla seeds in a separate bowl, then beat for 2 mins with an electric mixer until smooth and starting to thicken, it will get thin and then start to thicken again. Tip in the double cream and fold it into the soft cheese mix. You’re looking for it to be thickened enough to hold its shape when you tip a spoon of it upside down. If it’s not thick enough, continue to whisk. Spoon onto the biscuit base, starting from the edges and working inwards, making sure that there are no air bubbles. Smooth the top of the cheesecake down with the back of a dessert spoon or spatula. Leave to set in the fridge overnight.\n" +
                        "Bring the cheesecake to room temperature about 30 mins before serving. To remove it from the tin, place the base on top of a can, then gradually pull the sides of the tin down. Slip the cake onto a serving plate, removing the lining paper and base. Purée half the strawberries in a blender or food processor with the icing sugar and 1 tsp water, then sieve. Pile the remaining strawberries onto the cake, and pour the purée over the top.");
                break;
            case "borscht":
                System.out.println("Heat the vegetable oil and butter in a large, heavy-bottomed saucepan. Once melted add the carrot, celery and onion and cook gently for a few minutes. Add the beetroot, potato and garlic. Fry for a couple of minutes, until well coated and combined.\n" +
                        "Add the stock and season with salt and black pepper. Bring to just below the boil and then simmer for 15 minutes.\n" +
                        "Add the cabbage and tomatoes. Cover and leave to simmer for a further 20 minutes.\n" +
                        "Serve the soup with dollops of sour cream and a sprinkling of dill.");
                break;
            case "dumplings":
                System.out.println("Whilst your stew is bubbling, make the dumplings. Weigh the flour into a bowl and add ½ tsp salt. Stir through the suet and parsley, if using. Make a well in the centre and add 3 tbsp cold water, mix to a dough, adding more water until the dough is firm but pliable. Divide into eight equal pieces and roll in a little more flour into balls. Chill until needed.\n" +
                        "When the stew has about 30 mins to go, arrange the dumplings on top and cover with a lid. With the oven at 160C/140C fan/gas 3, cook the stew and dumplings for 20 mins, then remove the lid and cook for another 10 mins until they’re brown and puffed up.");
                break;
            case "burger":
                System.out.println("Tip the beef mince, shallot, horseradish sauce, herbs and garlic into a bowl, and season well with salt and black pepper. Combine everything well using your hands, squeezing the mixture through your fingers repeatedly to help it bind together.\n" +
                        "Divide the mixture into four portions and shape each into a 3cm-thick patty. Press a small 50p-sized piece of blue cheese into the middle of each patty, if using, and pack the meat around it to enclose the cheese – this will melt during cooking.\n" +
                        "Put the burgers on a plate, cover and chill for at least 30 mins or overnight. Light the barbecue and wait for the coals to turn ashen. Or, heat a gas barbecue to medium.\n" +
                        "mins until just starting to char. Carefully flip over and cook for a further 4-5 mins (for medium) or longer if you prefer well done. Remove the burgers to a board and leave to rest for a few minutes before serving. Alternatively, fry the burgers over a medium heat for 4-5 mins on each side until cooked through (a probe thermometer should read 70C).\n" +
                        "Serve the burgers in the buns with lettuce, tomato slices and relish (see recipe, below), or any other accompaniments of your choice.");
                break;
            case "caesar salad":
                System.out.println("Heat oven to 200C/180C fan/gas 6. Spread the bread out on a baking tray and bake for about 12 mins until golden and crisp, then leave to cool.\n" +
                        "Meanwhile, in a food processor, combine the 10 anchovy fillets with the vinegar, mustard and garlic, and purée until smooth. Add the egg and pulse until just incorporated. With the machine on, gradually drizzle in the vegetable oil until it emulsifies to create a creamy dressing. Scrape the dressing into a bowl and stir in the cheese. Season, cover with cling film and put in the fridge until well chilled and thickened, at least 30 mins.\n" +
                        "In a very large bowl, toss the chilled lettuce leaves with half the dressing, gently rubbing the dressing onto the leaves with your hands. (Save the remaining dressing for another salad or to serve with grilled chicken.) Divide the dressed lettuce between chilled bowls and scatter the croutons on top. Garnish with anchovy fillets and serve right away, passing round the extra cheese at the table.");
                break;
            case "pasta with seafood":
                System.out.println("Boil the kettle, put the saffron in a small bowl, pour over 100ml hot water and set aside to steep. Tip the mussels and clams into a large colander and rinse under cold water. Scrub the shells and pull away any stringy beards. Discard any that don’t close when tapped on the side of the sink. Use a small serrated knife to cut down the prawn backs, through the shells, pulling out any black entrails you find.\n" +
                        "Heat the oil in a large casserole dish or deep frying pan. Add the shallots, celery and garlic, and fry over a low heat for a few mins until starting to soften. Add the wine and Pernod, and bring to the boil. Simmer for 1-2 mins, then add the stock, the saffron with its steeping liquid and some seasoning. When bubbling, reduce to a simmer and stir in the orzo. Cover the pan with a lid and cook for 4 mins.\n" +
                        "Add the shellfish, re-cover and cook for 5 mins more until the pasta is cooked, the prawns are pink and the shells are all open (discard any that aren’t). Scatter with parsley and serve in bowls with a drizzle of oil and crusty bread.");
                break;
            case "cheese soup":
                System.out.println("Heat a large saucepan and dry-fry 2 tsp cumin seeds and a pinch of chilli flakes for 1 min, or until they start to jump around the pan and release their aromas.\n" +
                        "Scoop out about half with a spoon and set aside. Add 2 tbsp olive oil, 600g coarsely grated carrots, 140g split red lentils, 1l hot vegetable stock and 125ml milk to the pan and bring to the boil.\n" +
                        "Simmer for 15 mins until the lentils have swollen and softened.\n" +
                        "Whizz the soup with a stick blender or in a food processor until smooth (or leave it chunky if you prefer).\n" +
                        "Season to taste and finish with a dollop of plain yogurt and a sprinkling of the reserved toasted spices. Serve with warmed naan breads.");
                break;
            case "sushi":
                System.out.println("Pat out some rice. Lay a nori sheet on the mat, shiny-side down. Dip your hands in the vinegared water, then pat handfuls of rice on top in a 1cm thick layer, leaving the furthest edge from you clear.\n" +
                        "Spread over some Japanese mayonnaise. Use a spoon to spread out a thin layer of mayonnaise down the middle of the rice.\n" +
                        "Add the filling. Get your child to top the mayonnaise with a line of their favourite fillings – here we’ve used tuna and cucumber.\n" +
                        "Roll it up. Lift the edge of the mat over the rice, applying a little pressure to keep everything in a tight roll.\n" +
                        "Stick down the sides like a stamp. When you get to the edge without any rice, brush with a little water and continue to roll into a tight roll.\n" +
                        "Wrap in cling film. Remove the mat and roll tightly in cling film before a grown-up cuts the sushi into thick slices, then unravel the cling film.\n" +
                        "TO MAKE PRESSED SUSHI: Layer over some smoked salmon. Line a loaf tin with cling film, then place a thin layer of smoked salmon inside on top of the cling film.\n" +
                        "Cover with rice and press down. Press about 3cm of rice over the fish, fold the cling film over and press down as much as you can, using another tin if you have one.\n" +
                        "Tip it out like a sandcastle. Turn block of sushi onto a chopping board. Get a grown-up to cut into fingers, then remove the cling film.\n" +
                        "TO MAKE SUSHI BALLS: Choose your topping. Get a small square of cling film and place a topping, like half a prawn or a small piece of smoked salmon, on it. Use damp hands to roll walnut-sized balls of rice and place on the topping.\n" +
                        "Make into tight balls. Bring the corners of the cling film together and tighten into balls by twisting it up, then unwrap and serve.");
                break;
            default:
                System.out.println("There is no recipe on the menu: " + dish + "-but maybe it will appear tomorrow.");
                isHaveDish = false;
                break;
        }
        if(isHaveDish) {
            System.out.println();
            System.out.println("Enjoy your meal");
        }
    }
}
