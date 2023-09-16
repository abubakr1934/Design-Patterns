import java.lang.module.ModuleDescriptor;

public class Phone {
    int ram;
    String operating_system;
    int screensize;
    Phone(Builder builder)
    {
        this.ram=builder.ram;
        this.operating_system=builder.operating_system;
        this.screensize=builder.screensize;
    }
    int getScreensize()
    {
        return screensize;
    }
    String getOS(){
        return operating_system;
    }
    int getRam(){
        return ram;
    }
    public static class Builder{
        int ram;
        String operating_system;
        int screensize;

        Builder(){

        }
        Builder setScreensize(int ss)
        {
            this.screensize=ss;
            return this;
        }
        Builder setRam(int ram)
        {
            this.ram=ram;
            return this;
        }
        Builder setOS(String os)
        {
            this.operating_system=os;
            return this;
        }
        public Phone build() {
            return new Phone(this);
        }



    }
}


// class object{
//     int a;
//     //constructor

//     void add(object b)
//     {
//         int c=this.a+b.a;
//         sout(c);
//     }
// }
// class main{
//     psvm{
//         object a =new object(10)
//         object b=new object(15)

//             a.add(b)
            
