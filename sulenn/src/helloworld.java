public class helloworld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
//        String str = "[::1]:400";
        String str = "333333333333";
//        String str = "[::1]:400:";
        int index = str.lastIndexOf(':');
        System.out.println(index);
        String ip = str.substring(0,index);
        String port = str.substring(index+1);
        System.out.println(ip);
        System.out.println(port);
    }
}
