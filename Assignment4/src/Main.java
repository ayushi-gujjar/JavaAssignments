import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Main {
        Date signUpDate, currentDate;
        String stringStartDate, stringEndDate;
        Date startDate, endDate;
        public void checkKYC(String inputSignUpDate, String inputCurrentDate) {
            try {
                SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
                signUpDate = dateFormatter.parse(inputSignUpDate);
                currentDate= dateFormatter.parse(inputCurrentDate);

                if(signUpDate.after(currentDate)) {
                    System.out.println("No range");
                }
                else {
                    startDate = signUpDate;
                    //setting sign up year to start date


                    Calendar cal = Calendar.getInstance();
                    cal.setTime(startDate);

//                    System.out.println(cal.get(Calendar.YEAR) + " : cal");
                    System.out.println();
//                    System.out.println(startDate + "  : Start date");
                    startDate.setYear(cal.get(Calendar.YEAR));

                    //creating calendar object
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(startDate);
                    calendar.add(Calendar.DATE, -30);
                    startDate=calendar.getTime();
                    calendar.add(Calendar.DATE, 60);
                    endDate=calendar.getTime();
                    if(endDate.after(currentDate)) {
                        endDate=currentDate;
                    }
                }
                stringStartDate=dateFormatter.format(startDate);
                stringEndDate=dateFormatter.format(endDate);
                System.out.print(stringStartDate);
                System.out.print("	");
                System.out.println(stringEndDate);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }

    public static void main(String[] args) {
        Main obj =new Main();
        obj.checkKYC("16-07-1998", "27-06-2017");
        obj.checkKYC("04-02-2016", "04-04-2017");
        obj.checkKYC("04-05-2017", "04-04-2017");
        obj.checkKYC("04-04-2015", "04-04-2016");
        obj.checkKYC("04-04-2015", "15-03-2016");
    }
    };

