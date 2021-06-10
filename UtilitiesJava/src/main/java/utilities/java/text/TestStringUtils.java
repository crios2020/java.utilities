package utilities.java.text;

import utilities.java.consola.x.X;

/**
 * Clase para testear la utilidad StringUtils
 * @author carlos
 */
public class TestStringUtils {
    public static void main(String[] args) {
        X.println(StringUtils.upperCaseFirst("HOla a TOdos!"));
        X.println(StringUtils.upperCaseFirst("HOla a TOdos!",true));
        X.println(StringUtils.upperCaseAllFirstLetter("HOla a TOdos!"));
        X.println(StringUtils.upperCaseAllFirstLetter("HOla a TOdos!",true));
        X.println(StringUtils.revert("HOla a TOdos!"));
        X.println(StringUtils.isPalindrome("HOla a TOdos!"));
        X.println(StringUtils.isPalindrome("Neuquen"));
        X.println(StringUtils.isPalindrome("Neuquen".toLowerCase()));
    }
}
