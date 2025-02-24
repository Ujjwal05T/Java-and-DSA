package OOPs.principles;
class Upper{
    //nested interface like this can be declared private,protected,public or default
    //but outer interface can only be public or default
    interface B{
        void show();
    }
}
public class NestedInterface implements Upper.B{
    @Override
    public void show() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        NestedInterface obj = new NestedInterface();
        obj.show();
    }
}
