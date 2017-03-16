class Calculate{
    Scanner scn = new Scanner(System.in);
    Output output = new Output();
    
    public static Calculate do_calc(){
        return new Calculate();
    }
    
    public int get_int_val() throws IOException, NumberFormatException {
        int x = scn.nextInt();
        if (x <= 0) {
            throw new NumberFormatException("All the values must be positive");
        }
        return x;
    }
    
    public double get_double_val() throws IOException, NumberFormatException  {
        double x = scn.nextDouble();
        if (x <= 0) {
            throw new NumberFormatException("All the values must be positive");
        }
        return x;
    }
    
    //Cube
    public double get_volume(int a) {
        return a * a * a;
    }
    
    //Cuboid
    public double get_volume(int l, int b , int h) {
        return l * b * h;
    }
    
    //Hemisphere
    public double get_volume(double r) {
        return (2 * Math.PI * r * r * r) / 3;
    }
    
    //Cylinder
    public double get_volume(double r, double h) {
        return  Math.PI * (r * r) * h;
    }
    
    void display(double value) {
        System.out.println(value);
    }
}

class Output {
    void display(double value) {
        System.out.format("%.3f%n", value);
    }
}