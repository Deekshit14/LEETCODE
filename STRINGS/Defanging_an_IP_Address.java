// https://leetcode.com/problems/defanging-an-ip-address/
package STRINGS;
class Defanging_an_IP_Address {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
    public static String defangIPaddr(String address) {
        return address.replaceall(".","[.]");
    }
}