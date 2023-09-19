public interface Interface2 {
    static void staticMethod(){
        System.out.println("This is static method of interface2");
    }
    default void defaultMethod(){
        System.out.println("This is default method of interface2");
    }
    private void privateMethod(){
        System.out.println("This is private method of interface2");
    }
    void publicAndAbstractMethod();    // by default interface methods are public and abstract and abstract methods does not have body

}