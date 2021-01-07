/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web;

import Core.Paragraph;
import Core.Img;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class WebManager {

    public static void main(String[] args) {
        WebPage WP = new WebPage();
        Scanner scn;
        int choice = 0;
        do {
            System.out.println("1. Insert an img with width and height");
            System.out.println("2. Insert an img with top and left");
            System.out.println("3. Insert paragragh");
            System.out.println("4. Display a webpage");
            System.out.println("5. Delete all tags with name");
            System.out.println("6. Display all paragraghs");
            System.out.println("7. Exit");
            boolean doing = true;
            while (doing) {
                try {
                    scn = new Scanner(System.in);
                    System.out.println("Input choice: ");
                    choice = scn.nextInt();
                    doing = false;
                } catch (InputMismatchException a) {
                    System.out.println("Choice is an integer");
                }
            }
            switch (choice) {
                case 1:

                    String name = "",
                     content = "",
                     scr = "";
                    int width = 0,
                     height = 0;
                    doing = true;
                    while (doing) {
                        try {
                            System.out.println("Input name: ");
                            scn = new Scanner(System.in);
                            name = scn.nextLine();
                            if (name.matches("")) {
                                throw new Exception("Can not empty");
                            }
                            doing = false;
                        } catch (Exception ee) {
                            System.out.println(ee.getMessage());
                        }
                    }
                    doing = true;
                    while (doing) {
                        try {
                            System.out.println("Input content: ");
                            scn = new Scanner(System.in);
                            content = scn.nextLine();
                            if (content.matches("")) {
                                throw new Exception("Can not empty");
                            }
                            doing = false;
                        } catch (Exception ee) {
                            System.out.println(ee.getMessage());
                        }
                    }
                    doing = true;
                    while (doing) {
                        try {
                            System.out.println("Input scr: ");
                            scn = new Scanner(System.in);
                            scr = scn.nextLine();
                            if (scr.matches("")) {
                                throw new Exception("Can not empty");
                            }
                            doing = false;
                        } catch (Exception ee) {
                            System.out.println(ee.getMessage());
                        }
                    }
                    doing = true;
                    while (doing) {
                        try {
                            System.out.println("Input width: ");
                            scn = new Scanner(System.in);
                            width = scn.nextInt();
                            doing = false;
                        } catch (InputMismatchException a) {
                            System.out.println("Input width is integer");
                        }
                    }
                    doing = true;
                    while (doing) {
                        try {
                            System.out.println("Input height: ");
                            scn = new Scanner(System.in);
                            height = scn.nextInt();
                            doing = false;
                        } catch (InputMismatchException a) {
                            System.out.println("Input height is integer");
                        }
                    }
                    Img x = new Img(scr, width, height, name, content);
                    WP.insertTag(x);
                    break;
                case 2:
                    Core.Img y;
                    scr = "";
                    content = "";
                    name = "";
                    int top = 0,
                     left = 0;
                    doing = true;
                    while (doing) {
                        try {
                            System.out.println("Input name: ");
                            scn = new Scanner(System.in);
                            name = scn.nextLine();
                            if (name.matches("")) {
                                throw new Exception("Can not empty");
                            }
                            doing = false;
                        } catch (Exception ee) {
                            System.out.println(ee.getMessage());
                        }
                    }
                    doing = true;
                    while (doing) {
                        try {
                            System.out.println("Input content: ");
                            scn = new Scanner(System.in);
                            content = scn.nextLine();
                            if (content.matches("")) {
                                throw new Exception("Can not empty");
                            }
                            doing = false;
                        } catch (Exception ee) {
                            System.out.println(ee.getMessage());
                        }
                    }
                    doing = true;
                    while (doing) {
                        try {
                            System.out.println("Input scr: ");
                            scn = new Scanner(System.in);
                            scr = scn.nextLine();
                            if (scr.matches("")) {
                                throw new Exception("Can not empty");
                            }
                            doing = false;
                        } catch (Exception ee) {
                            System.out.println(ee.getMessage());
                        }
                    }
                    doing = true;
                    while (doing) {
                        try {
                            scn = new Scanner(System.in);
                            System.out.println("Input top: ");
                            top = scn.nextInt();
                            doing = false;
                        } catch (InputMismatchException a) {
                            System.out.println("top is an integer");
                        }
                    }
                    doing = true;
                    while (doing) {
                        try {
                            scn = new Scanner(System.in);
                            System.out.println("Input left: ");
                            left = scn.nextInt();
                            doing = false;
                        } catch (InputMismatchException a) {
                            System.out.println("left is an integer");
                        }
                    }
                    y = new Core.Img(scr, top, left, name, content);
                    WP.insertTag(y);
                    break;
                case 3:
                    Core.Paragraph z;
                    String color = "";
                    name = "";
                    content = "";
                    doing = true;
                    while (doing) {
                        try {
                            System.out.println("Input name: ");
                            scn = new Scanner(System.in);
                            name = scn.nextLine();
                            if (name.matches("")) {
                                throw new Exception("Can not empty");
                            }
                            doing = false;
                        } catch (Exception ee) {
                            System.out.println(ee.getMessage());
                        }
                    }
                    doing = true;
                    while (doing) {
                        try {
                            System.out.println("Input content: ");
                            scn = new Scanner(System.in);
                            content = scn.nextLine();
                            if (content.matches("")) {
                                throw new Exception("Can not empty");
                            }
                            doing = false;
                        } catch (Exception ee) {
                            System.out.println(ee.getMessage());
                        }
                    }
                    doing = true;
                    while (doing) {
                        try {
                            System.out.println("Input color: ");
                            scn = new Scanner(System.in);
                            color = scn.nextLine();
                            if (color.matches("")) {
                                throw new Exception("Can not empty");
                            }
                            doing = false;
                        } catch (Exception ee) {
                            System.out.println(ee.getMessage());
                        }
                    }
                    z = new Paragraph(color, name, content);
                    WP.insertTag(z);
                    break;
                case 4:
                    WP.displayWebPage();
                    break;
                case 5:
                    doing = true;
                    name = "";
                    while (doing) {
                        try {
                            System.out.println("Input name: ");
                            scn = new Scanner(System.in);
                            name = scn.nextLine();
                            if (name.matches("")) {
                                throw new Exception("Can not empty");
                            }
                            doing = false;
                        } catch (Exception ee) {
                            System.out.println(ee.getMessage());
                        }
                    }
                    WP.deleteTag(name);
                    break;
                case 6:
                    WP.displayParagragh();
                    break;
                case 7:
                    System.out.println("Goodbye");
                    System.exit(0);
                    return;
            }
            if (choice < 1 || choice > 7) {
                System.out.println("Please enter from 1 to 7");
            }
            System.out.println("");
        } while (choice >= 1 || choice <= 7);
    }
}
