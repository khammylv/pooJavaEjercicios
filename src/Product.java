
public class Product {
    int pro_Id;
    String pro_name;
    // Product class constructor

    Product(int pid, String n) {
        pro_Id = pid;
        pro_name = n;
    }

    public void display() {
        System.out.print("Product Id = " + pro_Id + "  " + " Product Name = " + pro_name);
        System.out.println();
    }
}
