package day7.isp;

public class AdminController implements ViewProduct, ProductManagement {
    @Override
    public void addProduct() {
        // Admin them san pham
        System.out.println("Admin có thể thêm sản phẩm");
    }

    @Override
    public void viewProduct() {
        System.out.println("Admin có thể xem sản phẩm");
    }

    @Override
    public void editProduct() {
        System.out.println("Admin có thể sửa sản phẩm");
    }

    @Override
    public void deleteProduct() {
        System.out.println("Admin có thể xoá sản phẩm");
    }
}
