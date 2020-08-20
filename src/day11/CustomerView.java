package day11;


/**
 * CustomerView为主模块，负责菜单的显示和处理用户操作
 */

public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    /**
     * 显示《客户信息管理软件》界面方法
     */
    public void enterMainMenu() {

        boolean isFlag = true;
        while (isFlag) {
            System.out.println("-----------------客户信息管理软件-----------------\n");

            System.out.println("1 添 加 客 户");
            System.out.println("2 修 改 客 户");
            System.out.println("3 删 除 客 户");
            System.out.println("4 客 户 列 表");
            System.out.println("5 退     出\n");
            System.out.println("请选择(1-5)：_");

            char menu = CMUtility.readMenuSelection();

            switch (menu){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.println("退出");

            }

//            isFlag = false;

        }

    }

    /**
     * 添加客户的操作
     */
    private void addNewCustomer() {
        System.out.println("添加用户操作");

    }

    /**
     * 修改客户的操作
     */
    private void modifyCustomer() {
        System.out.println("修改用户操作");


    }

    /**
     * 删除客户的操作
     */
    private void deleteCustomer() {
        System.out.println("删除用户操作");


    }

    /**
     * 显示客户列表的操作
     */
    private void listAllCustomers() {
        System.out.println("显示用户操作");


    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();

    }

}
