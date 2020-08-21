package day11;


/**
 * CustomerView为主模块，负责菜单的显示和处理用户操作
 */

public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    public static void main(String[] args) {

        CustomerView view = new CustomerView();
        view.enterMainMenu();

    }

    public CustomerView() {
        Customer customer = new Customer("王涛", '男', 23, "12345678901", "1589231231@qq.com");
        customerList.addCustomer(customer);

    }


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

            switch (menu) {
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
//                    System.out.println("退出");
                    System.out.println("是否确认退出（Y/N）:");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;

                    }

            }
//            isFlag = false;
        }

    }

    /**
     * 添加客户的操作
     */
    private void addNewCustomer() {
//        System.out.println("添加用户操作");

        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名:");
        String name = CMUtility.readString(10);
        System.out.print("性别:");
        char gender = CMUtility.readChar();
        System.out.print("年龄:");
        int age = CMUtility.readInt();
        System.out.print("电话:");
        String Phone = CMUtility.readString(13);
        System.out.print("邮箱:");
        String emall = CMUtility.readString(30);

        //将上述数据封装到对象中
        Customer customer = new Customer(name, gender, age, Phone, emall);


        boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess) {
            System.out.println("---------------------添加完成---------------------");

        } else {

            System.out.println("---------------客户目录已满，添加失败----------------");

        }


    }

    /**
     * 修改客户的操作
     */
    private void modifyCustomer() {
//        System.out.println("修改用户操作");
        System.out.println("---------------------修改客户---------------------");
        Customer cust;
        int number;
        for (; ; ) {
            System.out.print("请选择待修改客户编号(-1退出):");
            number = CMUtility.readInt();

            if (number == -1) {
                return;
            }
            cust = customerList.getCustomer(number - 1);
            if (cust == null) {
                System.out.print("无法找到指定客户！");

            } else {//找到了相应编号的客户
                break;
            }

        }
        //修改客户信息
        System.out.print("姓名（" + cust.getName() + "):");
        String name = CMUtility.readString(10, cust.getName());
        System.out.print("性别（" + cust.getGender() + "):");
        char gender = CMUtility.readChar(cust.getGender());
        System.out.print("年龄（" + cust.getAge() + "):");
        int age = CMUtility.readInt(cust.getAge());
        System.out.print("电话（" + cust.getPhone() + "):");
        String Phone = CMUtility.readString(13, cust.getPhone());
        System.out.print("邮箱（" + cust.getEmail() + "):");
        String email = CMUtility.readString(30, cust.getEmail());

        Customer newcust = new Customer(name, gender, age, Phone, email);

        boolean isRepalaced = customerList.replaceCustomer(number - 1, newcust);
        if (isRepalaced) {
            System.out.println("---------------------修改完成---------------------");

        } else {
            System.out.println("---------------------修改失败---------------------");

        }


    }

    /**
     * 删除客户的操作
     */
    private void deleteCustomer() {
//        System.out.println("删除用户操作");
        System.out.println("---------------------删除客户---------------------");
        int number;
        for (; ; ) {
            System.out.print("请选择待删除的客户编号（-1退出）：");
            number = CMUtility.readInt();

            if (number == -1) {
                return;
            }

//            Customer customer = customerList.getCustomer(number -1);
            Customer customer = customerList.getCustomer(number - 1);
            if (customer == null) {

                System.out.print("无法找到指定客户！");
            } else {
                break;
            }

        }

        //找到指定用户
        System.out.print("是否确认删除（Y/N）");
        char isDelete = CMUtility.readConfirmSelection();
        if (isDelete == 'Y') {
            boolean deleteSuccess = customerList.deleteCustomer(number -1);
            if (deleteSuccess) {
                System.out.println("---------------------删除成功---------------------");

            } else {
                System.out.println("---------------------删除失败---------------------");

            }
        } else {
            return;
        }


    }

    /**
     * 显示客户列表的操作
     */
    private void listAllCustomers() {
        System.out.println("---------------------------客户列表---------------------------");

        int total = customerList.getTotal();
        if (total == 0) {
            System.out.println("没有客户记录");
        } else {
            System.out.println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t\t邮箱");
            Customer[] custs = customerList.getAllCustomers();
            for (int i = 0; i < custs.length; i++) {
                Customer cust = custs[i];
                System.out.println((i + 1) + "\t\t" + cust.getName() + "\t\t" + cust.getGender() + "\t\t" + cust.getAge() + "\t" + cust.getPhone() + "\t" + cust.getEmail());

            }
        }

        System.out.println("__________________________客户列表结束-------------------------");


    }

}
