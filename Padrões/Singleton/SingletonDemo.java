public class SingletonDemo {

    public static void main(String[] args){
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        instance2.showMessagem();
        instance.showMessagem();
    }
}