
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Henry
 */
public class KitchenManage {

    Kitchen[] arr;
    int SIZE = 50;
    int n;

    public KitchenManage() {
        this.arr = new Kitchen[SIZE];
        this.n = 0;
    }

    public int add(Kitchen k) {
        if (n == SIZE) {
            return 0;
        }
        arr[n] = k;
        n++;
        return 1;
    }

    public int getPosByCode(String code) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getCode().equals(code)) {
                return i;
            }
        }
        return -1;
    }

    public Kitchen getKitchenByCode(String code) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getCode().equals(code)) {
                return arr[i];
            }
        }
        return null;
    }

    public void getKitchensBySize(int size) {
        int find = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getWidth() * arr[i].getLength() == size) {
                System.out.println(arr[i].toString());
                find++;
            }
        }
        if (find == 0) {
            System.out.println(" Not found !!!");
        }
    }

    public void getKitchensByStyle(String style) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].getStyle().equals(style)) {
                System.out.println(arr[i].toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not found !!!");
        }
    }

    public int getTotalMoney(String style) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].getStyle().compareTo(style) == 0) {
                total = total + arr[i].getPrice();
            }
        }
        return total;
    }

    public void display() {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].toString());
        }
    }

    public static void main(String[] args) {
        KitchenManage obj = new KitchenManage();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add");
            System.out.println("2. Get kitchen's position by code");
            System.out.println("3. Get kitchen information by code");
            System.out.println("4. Get kitchen information by size");
            System.out.println("5. Get kitchen information by style");
            System.out.println("6. Get kitchen total money by style");
            System.out.println("7. Display all");
            System.out.println("8. Exit");
            sc = new Scanner(System.in);
            System.out.println("Input your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    String code = null,
                     style = null,
                     warehouse = null;
                    int width = 0,
                     length = 0,
                     price = 0;
                    boolean doing = true;
                    sc = new Scanner(System.in);
                    System.out.println("Input kitchen's code:");
                    code = sc.nextLine();
                    while (doing) {
                        try {
                            sc = new Scanner(System.in);
                            System.out.println("Input kitchen's style:");
                            style = sc.nextLine();
                            if (!style.equals("classic") & !style.equals("victoria") & !style.equals("chic") & !style.equals("modern")) {
                                throw new Exception("4 styles available : classic, victoria, chic, modern. !!!");
                            }
                            doing = false;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    sc = new Scanner(System.in);
                    System.out.println("Input kitchen's warehouse:");
                    warehouse = sc.nextLine();
                    doing = true;
                    while (doing) {
                        try {
                            sc = new Scanner(System.in);
                            System.out.println("Input kitchen's width:");
                            width = sc.nextInt();
                            doing = false;
                        } catch (InputMismatchException e) {
                            System.out.println("Kitchen's width must be number !!!");
                        }
                    }
                    doing = true;
                    while (doing) {
                        try {
                            sc = new Scanner(System.in);
                            System.out.println("Input kitchen's length:");
                            length = sc.nextInt();
                            doing = false;
                        } catch (InputMismatchException e) {
                            System.out.println("Kitchen's length must be number");
                        }
                    }
                    doing = true;
                    while (doing) {
                        try {
                            sc = new Scanner(System.in);
                            System.out.println("Input kitchen's price:");
                            price = sc.nextInt();
                            doing = false;
                        } catch (InputMismatchException e) {
                            System.out.println("Kitchen's price must be number");
                        }
                    }
                    Kitchen k = new Kitchen(code, style, width, length, warehouse, price);
                    if (obj.add(k) == 1) {
                        System.out.println("Added!");
                    } else {
                        System.out.println("Add fail !!!");
                    }
                    break;
                case 2:
                    String findCode;
                    sc = new Scanner(System.in);
                    System.out.println("Input kitchen's code that you want to find:");
                    findCode = sc.nextLine();
                    int pos = obj.getPosByCode(findCode);
                    if (pos == -1) {
                        System.out.println("Not found !!!");

                    } else {
                        System.out.println("Kitchen's position: " + pos);
                    }
                    break;
                case 3:
                    String findCode2;
                    sc = new Scanner(System.in);
                    System.out.println("Input kitchen's code that you want to find:");
                    findCode2 = sc.nextLine();
                    Kitchen find = obj.getKitchenByCode(findCode2);
                    if (find != null) {
                        System.out.println("Founded!");
                    } else {
                        System.out.println("Not found!");
                    }
                    break;
                case 4:
                    int findSize;
                    System.out.println("Input kitchen's size that you want to find:");
                    findSize = sc.nextInt();
                    obj.getKitchensBySize(findSize);
                    break;
                case 5:
                    String findStyle;
                    sc = new Scanner(System.in);
                    System.out.println("Input kitchen's style that you want to find:");
                    findStyle = sc.nextLine();
                    obj.getKitchensByStyle(findStyle);
                    break;
                case 6:
                    String sumStyle;
                    int pricee = 0;
                    sc = new Scanner(System.in);
                    System.out.println("Input kitchen's style that you want to get total money:");
                    sumStyle = sc.nextLine();
                    pricee = obj.getTotalMoney(sumStyle);
                    System.out.println(pricee);
                    break;
                case 7:
                    obj.display();
                    break;
                case 8:
                    System.exit(0);
            }

        } while (choice >= 1 && choice <= 8);
    }
}
