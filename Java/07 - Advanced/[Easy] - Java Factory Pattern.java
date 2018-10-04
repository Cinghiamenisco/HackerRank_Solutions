// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

class FoodFactory {
		public Food getFood(String order) {
        
        if (order.equalsIgnoreCase("CAKE"))
            return new Cake();
        
        if (order.equalsIgnoreCase("PIZZA"))
            return new Pizza();

        return null;
}
