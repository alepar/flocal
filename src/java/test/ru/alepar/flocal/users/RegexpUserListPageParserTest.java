package ru.alepar.flocal.users;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class RegexpUserListPageParserTest {

    private final List<User> users = new RegexpUserListPageParser().parse(PAGE_CONTENT);

    @Test
    public void userCountIsCorrect() throws Exception {
        assertThat(users.size(), equalTo(25));
    }

    @Test
    public void nameOfFirstUserIsCorrect() throws Exception {
        assertThat(users.get(0).name, equalTo("."));
    }

    private static final String PAGE_CONTENT = "\n" +
            "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
            "<html>\n" +
            "<head>\n" +
            "\n" +
            "\n" +
            "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1251\" />\n" +
            "<link rel=\"stylesheet\" href=\"/stylesheets/global.css\" type=\"text/css\" />\n" +
            "<link rel=\"stylesheet\" href=\"/stylesheets/coolblue.css\" type=\"text/css\" />\n" +
            "<link rel=\"stylesheet\" href=\"/stylesheets/decoration.css\" type=\"text/css\" />\n" +
            "<link type=\"text/css\" rel=\"stylesheet\" href=\"SyntaxHighlighter/styles/shCore.css\"/>\n" +
            "<link type=\"text/css\" rel=\"stylesheet\" href=\"SyntaxHighlighter/styles/shThemeDefault.css\"/>\n" +
            "<script src=\"/js/decor.js\" type=\"text/javascript\"></script>\n" +
            "\n" +
            "<link rel=\"shortcut icon\" href=\"/favicons/flok16x16.ico\" type=\"image/x-icon\" />\n" +
            "\n" +
            "\n" +
            "\n" +
            "<title>Viewing the user list - Public forum of MSU united student networks</title>\n" +
            "     \n" +
            "</head>\n" +
            "<body>\n" +
            "<table border=\"0\" cellpadding=\"2\" cellspacing=\"0\" width=\"95%\" class=\"tableborders\" align=\"center\">\n" +
            "  <tr>\n" +
            "    <td align=\"center\">\n" +
            "        <table border=\"0\" cellpadding=\"2\" cellspacing=\"0\" width=\"100%\">\n" +
            "          <tr>\n" +
            "          <td width=\"100%\" class=\"topmenu\" align=\"center\">\n" +
            "\n" +
            "<a href =\"/\" >Root</a>\n" +
            " | <a href =\"http://google.com/\" target=\"_blank\">Google</a>\n" +
            " | <a href =\"http://yandex.ru/\" target=\"_blank\">Yandex</a>\n" +
            " | <a href =\"http://mail.ru\" target=\"_blank\">Mail.ru</a>\n" +
            " | <a href =\"http://www.kommersant.ru/\" target=\"_blank\">Kommersant</a>\n" +
            " | <a href =\"http://www.afisha.ru/\" target=\"_blank\">Afisha</a>\n" +
            " | <a href =\"http://weather.yandex.ru/27612/\" target=\"_blank\">Weather</a>\n" +
            " | <a href =\"/sendmail.php\" target=\"_blank\">LAN Support</a>\n" +
            "   \n" +
            "          </td>\n" +
            "          </tr>\n" +
            "          <tr>\n" +
            "            <td width=\"100%\" colspan=\"3\" height=\"1\" class=\"tableborders\">\n" +
            "            </td>\n" +
            "          </tr>\n" +
            "       </table>\n" +
            "     </td>\n" +
            "   </tr>\n" +
            "</table>\n" +
            "\n" +
            "<table width=\"95%\" align=\"center\" class=\"tablesurround\" cellpadding=\"1\" cellspacing=\"1\">\n" +
            "<tr>\n" +
            "<td>\n" +
            "<table width=\"100%\" class=\"tableborders\" cellpadding=\"3\" cellspacing=\"1\">\n" +
            "<tr>\n" +
            "<td align=\"center\" class=\"menubar\">\n" +
            "\n" +
            "\n" +
            "<a href = \"/ubbthreads.php?Cat=\" target=\"_top\">Main Index</a>\n" +
            " |\n" +
            "<a href = \"/word-search.php\" target=\"_top\">Search</a>\n" +
            " |\n" +
            "<a href = \"/login.php?Cat=\" target=\"_top\">My Home</a>\n" +
            " |\n" +
            "<a href = \"/online.php?Cat=\" target=\"_top\">Who's Online</a>\n" +
            " |\n" +
            "<a href = \"/faq_english.php\" target=\"_top\">FAQ</a>\n" +
            " |\n" +
            "<a href = \"/logout.php?key=169659989fab529a8e290e9a3401add3\" target=\"_top\">Logout</a>\n" +
            " | <a href=\"/showmembers.php?Cat=&amp;page=1\" target=\"_top\">User List</a>\n" +
            "\n" +
            "</td>\n" +
            "</tr>\n" +
            "</table>\n" +
            "</td>\n" +
            "</tr>\n" +
            "</table>\n" +
            "<!-- <br /> -->\n" +
            "<center>&nbsp;&nbsp;</center>\n" +
            "<table width=\"95%\" align=\"center\" cellpadding=\"1\" cellspacing=\"1\" class=\"tablesurround\">\n" +
            "<tr>\n" +
            "<td>\n" +
            "<table cellpadding=\"3\" cellspacing=\"1\" width=\"100%\" class=\"tableborders\">\n" +
            "<tr class=\"tdheader\">\n" +
            "<td align=\"left\" width=\"15%\" nowrap=\"nowrap\">\n" +
            "<a href=\"/showmembers.php?Cat=&amp;sb=2&amp;page=1\">\n" +
            "Username <img src=\"/images/ascend.gif\" border=\"0\" alt=\"\" />\n" +
            "</a>\n" +
            "</td>\n" +
            "<td align=\"left\" width=\"12%\" nowrap=\"nowrap\">\n" +
            "<a href=\"/showmembers.php?Cat=&amp;sb=3&amp;page=1\">\n" +
            "Status \n" +
            "</a>\n" +
            "</td>\n" +
            "<td align=\"left\" width=\"28%\" nowrap=\"nowrap\">\n" +
            "<a href=\"/showmembers.php?Cat=&amp;sb=5&amp;page=1\">\n" +
            "Homepage \n" +
            "</a>\n" +
            "</td>\n" +
            "<td align=\"left\" width=\"5%\" nowrap=\"nowrap\">\n" +
            "<a href=\"/showmembers.php?Cat=&amp;sb=7&amp;page=1\">\n" +
            "Total Posts \n" +
            "</a>\n" +
            "</td>\n" +
            "<td align=\"left\" width=\"12%\" nowrap=\"nowrap\">\n" +
            "<a href=\"/showmembers.php?Cat=&amp;sb=9&amp;page=1\">\n" +
            "ICQ Number \n" +
            "</a>\n" +
            "</td>\n" +
            "<td align=\"left\" width=\"5%\" nowrap=\"nowrap\">\n" +
            "<a href=\"/showmembers.php?Cat=&amp;sb=11&amp;page=1\">\n" +
            "Rating \n" +
            "</a>\n" +
            "</td>\n" +
            "<td align=\"left\" width=\"18%\" nowrap=\"nowrap\">\n" +
            "<a href=\"/showmembers.php?Cat=&amp;sb=13&amp;page=1\">\n" +
            "Registered on \n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "<!-- CODE LOOP _ DO NOT ALTER COMMENTS -->\n" +
            "<tr class=\"lighttable\">\n" +
            "<td>\n" +
            "<a href=\"/showprofile.php?Cat=&amp;User=.&amp;page=1&amp;what=showmembers\">\n" +
            ".\n" +
            "</a>\n" +
            "</td>\n" +
            "<td>\n" +
            "User\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "48\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "24 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "26.05.2010 11:01\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr class=\"darktable\">\n" +
            "<td>\n" +
            "<a href=\"/showprofile.php?Cat=&amp;User=00&amp;page=1&amp;what=showmembers\">\n" +
            "00\n" +
            "</a>\n" +
            "</td>\n" +
            "<td>\n" +
            "User\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "2\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "9 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "24.02.2006 21:05\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr class=\"lighttable\">\n" +
            "<td>\n" +
            "<a href=\"/showprofile.php?Cat=&amp;User=000&amp;page=1&amp;what=showmembers\">\n" +
            "000\n" +
            "</a>\n" +
            "</td>\n" +
            "<td>\n" +
            "User\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "2\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "21.08.2006 17:40\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr class=\"darktable\">\n" +
            "<td>\n" +
            "<a href=\"/showprofile.php?Cat=&amp;User=0000&amp;page=1&amp;what=showmembers\">\n" +
            "0000\n" +
            "</a>\n" +
            "</td>\n" +
            "<td>\n" +
            "User\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "1\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "03.10.2007 13:52\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr class=\"lighttable\">\n" +
            "<td>\n" +
            "<a href=\"/showprofile.php?Cat=&amp;User=0001000&amp;page=1&amp;what=showmembers\">\n" +
            "0001000\n" +
            "</a>\n" +
            "</td>\n" +
            "<td>\n" +
            "User\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "19.07.2012 16:16\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr class=\"darktable\">\n" +
            "<td>\n" +
            "<a href=\"/showprofile.php?Cat=&amp;User=0013&amp;page=1&amp;what=showmembers\">\n" +
            "0013\n" +
            "</a>\n" +
            "</td>\n" +
            "<td>\n" +
            "User\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "1338\n" +
            "</td>\n" +
            "<td>\n" +
            "247119813 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "3650 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "23.10.2006 01:27\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr class=\"lighttable\">\n" +
            "<td>\n" +
            "<a href=\"/showprofile.php?Cat=&amp;User=00147&amp;page=1&amp;what=showmembers\">\n" +
            "00147\n" +
            "</a>\n" +
            "</td>\n" +
            "<td>\n" +
            "User\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "19.07.2012 14:29\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr class=\"darktable\">\n" +
            "<td>\n" +
            "<a href=\"/showprofile.php?Cat=&amp;User=007&amp;page=1&amp;what=showmembers\">\n" +
            "007\n" +
            "</a>\n" +
            "</td>\n" +
            "<td>\n" +
            "User\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "31.03.2004 18:05\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr class=\"lighttable\">\n" +
            "<td>\n" +
            "<a href=\"/showprofile.php?Cat=&amp;User=007lym&amp;page=1&amp;what=showmembers\">\n" +
            "007lym\n" +
            "</a>\n" +
            "</td>\n" +
            "<td>\n" +
            "User\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "01.11.2004 05:27\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr class=\"darktable\">\n" +
            "<td>\n" +
            "<a href=\"/showprofile.php?Cat=&amp;User=01&amp;page=1&amp;what=showmembers\">\n" +
            "01\n" +
            "</a>\n" +
            "</td>\n" +
            "<td>\n" +
            "User\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "45\n" +
            "</td>\n" +
            "<td>\n" +
            "227824589 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "02.02.2006 21:00\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr class=\"lighttable\">\n" +
            "<td>\n" +
            "<a href=\"/showprofile.php?Cat=&amp;User=0110010100010110&amp;page=1&amp;what=showmembers\">\n" +
            "0110010100010110\n" +
            "</a>\n" +
            "</td>\n" +
            "<td>\n" +
            "User\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "16\n" +
            "</td>\n" +
            "<td>\n" +
            "1100111011 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "16.01.2004 14:08\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr class=\"darktable\">\n" +
            "<td>\n" +
            "<a href=\"/showprofile.php?Cat=&amp;User=02&amp;page=1&amp;what=showmembers\">\n" +
            "02\n" +
            "</a>\n" +
            "</td>\n" +
            "<td>\n" +
            "User\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "11\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "03.02.2006 00:55\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr class=\"lighttable\">\n" +
            "<td>\n" +
            "<a href=\"/showprofile.php?Cat=&amp;User=020304&amp;page=1&amp;what=showmembers\">\n" +
            "020304\n" +
            "</a>\n" +
            "</td>\n" +
            "<td>\n" +
            "User\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "19.07.2012 16:17\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr class=\"darktable\">\n" +
            "<td>\n" +
            "<a href=\"/showprofile.php?Cat=&amp;User=021&amp;page=1&amp;what=showmembers\">\n" +
            "021\n" +
            "</a>\n" +
            "</td>\n" +
            "<td>\n" +
            "User\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "01.04.2007 22:33\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr class=\"lighttable\">\n" +
            "<td>\n" +
            "<a href=\"/showprofile.php?Cat=&amp;User=0216&amp;page=1&amp;what=showmembers\">\n" +
            "0216\n" +
            "</a>\n" +
            "</td>\n" +
            "<td>\n" +
            "User\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "1\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "11.06.2006 03:02\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr class=\"darktable\">\n" +
            "<td>\n" +
            "<a href=\"/showprofile.php?Cat=&amp;User=03&amp;page=1&amp;what=showmembers\">\n" +
            "03\n" +
            "</a>\n" +
            "</td>\n" +
            "<td>\n" +
            "User\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "1\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "01.05.2006 18:25\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr class=\"lighttable\">\n" +
            "<td>\n" +
            "<a href=\"/showprofile.php?Cat=&amp;User=030380&amp;page=1&amp;what=showmembers\">\n" +
            "030380\n" +
            "</a>\n" +
            "</td>\n" +
            "<td>\n" +
            "User\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "06.11.2004 00:19\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr class=\"darktable\">\n" +
            "<td>\n" +
            "<a href=\"/showprofile.php?Cat=&amp;User=030884&amp;page=1&amp;what=showmembers\">\n" +
            "030884\n" +
            "</a>\n" +
            "</td>\n" +
            "<td>\n" +
            "User\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "3\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "30.01.2006 21:17\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr class=\"lighttable\">\n" +
            "<td>\n" +
            "<a href=\"/showprofile.php?Cat=&amp;User=0331&amp;page=1&amp;what=showmembers\">\n" +
            "0331\n" +
            "</a>\n" +
            "</td>\n" +
            "<td>\n" +
            "User\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "02.07.2006 00:09\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr class=\"darktable\">\n" +
            "<td>\n" +
            "<a href=\"/showprofile.php?Cat=&amp;User=05&amp;page=1&amp;what=showmembers\">\n" +
            "05\n" +
            "</a>\n" +
            "</td>\n" +
            "<td>\n" +
            "User\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "150\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "35 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "07.05.2006 18:18\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr class=\"lighttable\">\n" +
            "<td>\n" +
            "<a href=\"/showprofile.php?Cat=&amp;User=050703387&amp;page=1&amp;what=showmembers\">\n" +
            "050703387\n" +
            "</a>\n" +
            "</td>\n" +
            "<td>\n" +
            "User\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "6\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "27.09.2012 21:48\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr class=\"darktable\">\n" +
            "<td>\n" +
            "<a href=\"/showprofile.php?Cat=&amp;User=051tt&amp;page=1&amp;what=showmembers\">\n" +
            "051tt\n" +
            "</a>\n" +
            "</td>\n" +
            "<td>\n" +
            "User\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "29.04.2007 00:34\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr class=\"lighttable\">\n" +
            "<td>\n" +
            "<a href=\"/showprofile.php?Cat=&amp;User=05rus&amp;page=1&amp;what=showmembers\">\n" +
            "05rus\n" +
            "</a>\n" +
            "</td>\n" +
            "<td>\n" +
            "User\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "1\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "07.05.2006 22:21\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr class=\"darktable\">\n" +
            "<td>\n" +
            "<a href=\"/showprofile.php?Cat=&amp;User=05_bullet&amp;page=1&amp;what=showmembers\">\n" +
            "05_bullet\n" +
            "</a>\n" +
            "</td>\n" +
            "<td>\n" +
            "User\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "0 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "22.10.2005 03:15\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr class=\"lighttable\">\n" +
            "<td>\n" +
            "<a href=\"/showprofile.php?Cat=&amp;User=06011981&amp;page=1&amp;what=showmembers\">\n" +
            "06011981\n" +
            "</a>\n" +
            "</td>\n" +
            "<td>\n" +
            "User\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "6\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "16 &nbsp;\n" +
            "</td>\n" +
            "<td>\n" +
            "22.04.2011 23:04\n" +
            "</td>\n" +
            "</tr>\n" +
            "<!-- END OF LOOP -->\n" +
            "\n" +
            "<tr class=\"tdheader\">\n" +
            "<td align=\"center\" colspan=\"6\" class=\"tdheader\">\n" +
            "<font class=\"onbody\">\n" +
            "Pages: \n" +
            "1 <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;page=2\">2</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;page=3\">3</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;page=4\">4</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;page=5\">5</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;page=6\">6</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;page=7\">7</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;page=8\">8</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;page=9\">9</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;page=10\">10</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;page=11\">11</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;page=12\">12</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;page=13\">13</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;page=14\">14</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;page=15\">15</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;page=16\">16</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;page=17\">17</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;page=18\">18</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;page=19\">19</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;page=20\">20</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;page=2\">>></a><br><a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=a\">a</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=b\">b</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=c\">c</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=d\">d</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=e\">e</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=f\">f</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=g\">g</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=h\">h</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=i\">i</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=j\">j</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=k\">k</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=l\">l</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=m\">m</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=n\">n</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=o\">o</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=p\">p</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=q\">q</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=r\">r</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=s\">s</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=t\">t</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=u\">u</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=v\">v</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=w\">w</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=x\">x</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=y\">y</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=z\">z</a> <a href=\"/showmembers.php?Cat=&amp;sb=1&amp;b=other\">other</a>\n" +
            "</font>\n" +
            "\n" +
            "</td>\n" +
            "<td align=\"center\" colspan=\"6\" class=\"tdheader\">\n" +
            "<a href=\"/banlist.php\">\n" +
            "Ban list\n" +
            "</a>\n" +
            "<br>\n" +
            "<a href=\"/restrictlist.php\">\n" +
            "Restriction list\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "</table>\n" +
            "</td>\n" +
            "</tr>\n" +
            "</table>\n" +
            "<!-- Yandex.Metrika counter -->\n" +
            "<script type=\"text/javascript\">\n" +
            "(function (d, w, c) {\n" +
            "  (w[c] = w[c] || []).push(function() {\n" +
            "    try {\n" +
            "      w.yaCounter17604517 = new Ya.Metrika({id:17604517, enableAll: true, ut:\"noindex\"});\n" +
            "    } catch(e) { }\n" +
            "  });\n" +
            " \n" +
            "  var n = d.getElementsByTagName(\"script\")[0],\n" +
            "    s = d.createElement(\"script\"),\n" +
            "    f = function () { n.parentNode.insertBefore(s, n); };\n" +
            "  s.type = \"text/javascript\";\n" +
            "  s.async = true;\n" +
            "  s.src = (d.location.protocol == \"https:\" ? \"https:\" : \"http:\") + \"//mc.yandex.ru/metrika/watch.js\";\n" +
            "\n" +
            "  if (w.opera == \"[object Opera]\") {\n" +
            "    d.addEventListener(\"DOMContentLoaded\", f);\n" +
            "  } else { f(); }\n" +
            "})(document, window, \"yandex_metrika_callbacks\");\n" +
            "</script>\n" +
            "<noscript><div><img src=\"//mc.yandex.ru/watch/17604517?ut=noindex\" style=\"position:absolute; left:-9999px;\" alt=\"\" /></div></noscript>\n" +
            "<!-- /Yandex.Metrika counter -->\n" +
            "\n" +
            "</body>\n" +
            "</html>";
}
