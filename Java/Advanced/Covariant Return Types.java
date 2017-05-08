class Flower{
    String whatsYourName() {
        return "I have many names and types.";
    }
}

class Jasmine extends Flower{
    @Override
    String whatsYourName() {
        return "Jasmine";
    }    
}

class Lily extends Flower{
    @Override
    String whatsYourName() {
        return "Lily";
    }    
}

class Lotus extends Flower{
    @Override
    String whatsYourName() {
        return "Lotus";
    }    
}

class State{
    Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends State{
    @Override
    Flower yourNationalFlower() {
        return new Jasmine();
    }
}

class Karnataka extends State{
    @Override
    Flower yourNationalFlower() {
        return new Lotus();
    }
}

class AndhraPradesh extends State{
    @Override
    Flower yourNationalFlower() {
        return new Lily();
    }
}