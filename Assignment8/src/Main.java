class invalidEmpCode extends Exception{
    public invalidEmpCode(String str){
        super(str);
    }
};

class invalidBirthDate extends Exception{
    public invalidBirthDate(String str){
        super(str);
    }
};

class invalidNumber extends Exception{
    public invalidNumber(String str){
        super(str);
    }
};


class verify extends Exception{

    public void CheckDetails(String empCode,String birthDate,String mobileNum)throws invalidEmpCode,invalidBirthDate,invalidNumber {

        if(empCode.length()!=5){
            throw new invalidEmpCode("Wrong Employee Code");
        }
        if(birthDate.length()!=8)
        {
            throw new invalidBirthDate("Wrong birthDate Inserted");
        }
        if(mobileNum.length()!=10){
            throw new invalidNumber("Wrong Mobile Number Inserted");
        }
    }
};

class Main {

    public static void main(String[] args) {

        try {
            verify obj = new verify();
            obj.CheckDetails("12345","23/09/97","3948539259");
        }
        catch(invalidEmpCode | invalidBirthDate | invalidNumber e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Exception not caught.");
        }

    }

}