	class FoodFactory {
		public Food getFood(String order) {
        
        if (order.equalsIgnoreCase("CAKE"))
            return new Cake();
        
        if (order.equalsIgnoreCase("PIZZA"))
            return new Pizza();

        return null;
}
