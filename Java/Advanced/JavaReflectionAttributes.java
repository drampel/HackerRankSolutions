package Java.Advanced;

/* For Java 8 and Java 15, add completely all code into code editor
   and into custom input under "Test against custom input" point. */

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/* For Java 7, just add the JavaReflectionAttributes class into code editor
   and into custom input under "Test against custom input" point. */
public class JavaReflectionAttributes {
    public static void main(String[] args) {
        Class<?> student = Student.class;
        Method[] methods = student.getDeclaredMethods();
        ArrayList<String> methodList = new ArrayList<>();
        for (Method method : methods) methodList.add(method.getName());
        Collections.sort(methodList);
        for (String name : methodList) System.out.println(name);
    }
}

class Student {
    private String name;
    private String id;
    private String email;

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void ahqym(){}
    public void amftc(){}
    public void anotherfunction(){}
    public void atcks(){}
    public void bwkbd(){}
    public void cfwyc(){}
    public void cmkxa(){}
    public void dnpym(){}
    public void dnqvo(){}
    public void dvvwq(){}
    public void ehjdm(){}
    public void elyed(){}
    public void fmyce(){}
    public void ghtlj(){}
    public void hluvb(){}
    public void isqdf(){}
    public void iwhtf(){}
    public void jmopy(){}
    public void jnskt(){}
    public void kbjlt(){}
    public void kgwku(){}
    public void khuag(){}
    public void levtp(){}
    public void mcgme(){}
    public void migyc(){}
    public void moebl(){}
    public void nixhb(){}
    public void odyqp(){}
    public void ogvdl(){}
    public void ormim(){}
    public void piwro(){}
    public void plaob(){}
    public void pnruo(){}
    public void pqfct(){}
    public void ptrup(){}
    public void pvgyp(){}
    public void qthde(){}
    public void rmjig(){}
    public void sumvl(){}
    public void tkbpp(){}
    public void tntpj(){}
    public void toxdp(){}
    public void twyfa(){}
    public void uccfq(){}
    public void ujxei(){}
    public void vhxoi(){}
    public void viwuu(){}
    public void viyog(){}
    public void whjtj(){}
    public void ytijy(){}
}