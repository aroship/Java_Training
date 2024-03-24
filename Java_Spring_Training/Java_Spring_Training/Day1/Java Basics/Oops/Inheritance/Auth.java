public class Auth {

    String authName;
    int authAge;

    Auth(String authName, int authAge){
        this.authName=authName;
        this.authAge=authAge;
    }

    public Auth() {

    }

    // Call by reference
    void assignAge(Auth auth){
        this.authAge=20;
    }
    // Call by value
    void assignAge(int authAge){
        this.authAge=20;
    }

    public static void main(String[] args) {
        Auth a = new Auth();
        System.out.println(a.authAge);
        Auth ab = new Auth("Sample",22);
        ab.assignAge(ab);

        System.out.println(a.authAge);
        System.out.println(ab.authAge);

    }
}
