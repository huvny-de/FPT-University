package MyValidation;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
x * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
/*Đây là lớp dùng để chứa các hàm thư viện tôi hay sử dụng  
==> nên thiết kế các hàm dùng chung này làm hàm static 
 */
public class Validation {

    //ham nay de check 1 so la duong hay am
    //public static boolean isValidId(String s)
    public static boolean isValidNumber(int number) {
        if (number >= 0) {
            return true;
        }
        return false;
    }

    //ham nay de kiem tra 1 chuoi la trong hay ko ?
    public static boolean isValidString(String s) {
        if (!s.isEmpty()) {
            return true;
        }
        return false;
    }

    //ham nay de kiem tra chuỗi nhập có đúng format hay ko?
    //pattern la chuỗi mẫu
    public static boolean isValidString(String s, String pattern) {
        if (s.matches(pattern)) {
            return true;
        }
        return false;
    }

    public static boolean isValidDate(int d, int m, int y) {
        int maxDate = 31;
        if (d < 1 || d > 31 || m < 1 || m > 12 || y < 1950 || y > 2020) {
            return false;
        }
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            maxDate = 30;
        } else if (m == 2) {
            if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
                maxDate = 29;
            } else {
                maxDate = 28;
            }
        }
        return d <= maxDate;
    }

    public static boolean isValidDay(String d, String m, String y) {
        try {
            Calendar c = new Calender();
            Date inputDate = new Date();
            Date today = new Date();
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            String dateString = df.format(today);

            try {
                SimpleDateFormat sdf_ddMMyyyy = new SimpleDateFormat("ddMMyyyy");
                Date date = sdf_ddMMyyyy.parse("dmy");
                System.out.println(date);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            String stringDate = "dd/MM/yyyy";

            Calendar c = Calendar.getInstance();
            Date inputDate = new SimpleDateFormat("dd/MM/yyyy").parse(stringDate);
            if (today.before(inputDate)) {
                return false;
            } else {
                return true;
            }
        } catch (ParseException ex) {
            Logger.getLogger(Validation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean isValidEmail(String s) {
        return s.matches("^[A-Za-z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$");
    }

    public static boolean isValidPhoneNumber(String s) {
        return s.matches("[0-9]{9,12}");
    }

    public static boolean isValidName(String name) {
        return name.matches("^[a-zA-Z])+(\\s[a-zA-Z]+)*$");
    }

    public static boolean isValidPassword(String password) {
        return password.matches("^[\\w.\\W]{8,12}$");
    }
}
