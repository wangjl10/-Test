package org.test.base;

public class Test {


    private String abc;


    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }

    public static void main(String[] args) {

        Test test = new Test();
        test.getAbc();
        test.setAbc("111");
        print();
	}


	public void test() {

    }

    public static String print() {
        System.out.println();
        return null;
    }



}
