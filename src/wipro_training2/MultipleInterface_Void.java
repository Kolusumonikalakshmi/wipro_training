package wipro_training2;

interface Class_A {
    void show();
}

interface Class_B {
    void show();
}

interface Class_C {
    void show();
}

class Class_Program implements Class_A, Class_B, Class_C {
    @Override
    public void show() {
        System.out.println("This is multiple interface implementation using Class_A, Class_B, and Class_C.");
        
    }
}

public class MultipleInterface_Void {
    public static void main(String[] args) {
        Class_Program c1 = new Class_Program(); 
        c1.show(); 
        
    }
}
