try {
	ClassLoader classLoader = FoodFactory.class.getClassLoader();
	Class cls = classLoader.loadClass(order.substring(0, 1).toUpperCase() + order.substring(1).toLowerCase());
	return (Food) cls.newInstance();			
} catch (Exception e) {
	return null;
}