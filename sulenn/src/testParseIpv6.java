import java.net.Inet6Address;
import java.net.UnknownHostException;

public class testParseIpv4 {

    public static void main(String[] args) throws Exception {
        String ipv6_1 = "[2001:db8:0:0:1:0:0:1]";
        String ipv6_2 = "2001:db8::1:0:0:1";
        String ipv6_3 = "2001:db8:0:0:1::1";
        String ipv6_4 = "[::1]";
        String ipv6_5 = "0:0:0:0:0:0:0:1";
        String ipv6_6 = "0::1";
        String ipv6_7 = "0:0:0:0:0:0:13.1.68.3";
        String ipv6_8 = "::13.1.68.3";
        String ipv6_9 = "0:0:0:0:0:FFFF:129.144.52.38";
        String ipv6_10 = "::FFFF:129.144.52.38";
        String ipv6_11 = "127.0.0.1";
        String ipv6_12 = "10.105.107.138";
        String ipv6_13 = "10.105.107.";
        System.out.println(normalize(ipv6_1));
        System.out.println(normalize(ipv6_2));
        System.out.println(normalize(ipv6_3));
        System.out.println(normalize(ipv6_4));
        System.out.println(normalize(ipv6_5));
        System.out.println(normalize(ipv6_6));
        System.out.println(normalize(ipv6_7));
        System.out.println(normalize(ipv6_8));
        System.out.println(normalize(ipv6_9));
        System.out.println(normalize(ipv6_10));
        System.out.println(normalize(ipv6_11));
        System.out.println(normalize(ipv6_12));
        System.out.println(normalize(ipv6_13));
    }
    public static String normalize(String s) throws UnknownHostException {
        return Inet6Address.getByName(s).getHostAddress();
    }

}
