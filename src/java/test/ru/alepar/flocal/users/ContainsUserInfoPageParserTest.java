package ru.alepar.flocal.users;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class ContainsUserInfoPageParserTest {

    @Test
    public void correctlyRecognizesSympathies() throws Exception {
        final User user = new User("", 0);
        assertThat(new ContainsUserInfoPageParser().parse(user, HAS_SYMPATHY).sympathy, equalTo(true));
        assertThat(new ContainsUserInfoPageParser().parse(user, HASNOT_SYMPATHY).sympathy, equalTo(false));
    }

    private static final String HASNOT_SYMPATHY = "\n" +
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
            "<title>Profile for hulio - Public forum of MSU united student networks</title>\n" +
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
            "<a href = \"/logout.php?key=77d26ff4151fe6e2d2e695efc198253a\" target=\"_top\">Logout</a>\n" +
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
            "<tr>\n" +
            "<td class=\"tdheader\">\n" +
            "Profile for hulio\n" +
            "</td>\n" +
            "</tr>\n" +
            "</table>\n" +
            "</td>\n" +
            "</tr>\n" +
            "</table>\n" +
            "\n" +
            "<table width=\"95%\" align=\"center\" cellpadding=\"1\" cellspacing=\"1\" class=\"tablesurround\">\n" +
            "<tr>\n" +
            "<td>\n" +
            "<table cellpadding=\"3\" cellspacing=\"1\" width=\"100%\" class=\"tableborders\">\n" +
            "<tr class=\"lighttable\">\n" +
            "<td>\n" +
            "<table border=\"0\" width=\"100%\" class=\"lighttable\" cellpadding=\"0\">\n" +
            "<tr>\n" +
            "<td width=\"10%\" class=\"darktable\">\n" +
            "Email\n" +
            "</td>\n" +
            "<td width=\"40%\">\n" +
            "<a href=\"mailto:\"></a>\n" +
            "&nbsp;\n" +
            "</td>\n" +
            "<td align=\"right\" valign=\"top\" rowspan=\"11\">\n" +
            "<img src=\"/user/5841.jpg\" alt=\"Picture\" width=\"80\" height=\"64\" />\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td class=\"darktable\">\n" +
            "Name\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td class=\"darktable\">\n" +
            "Title\n" +
            "</td>\n" +
            "<td>\n" +
            "дядя Коля &nbsp;\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td class=\"darktable\">\n" +
            "Total Posts\n" +
            "</td>\n" +
            "<td>\n" +
            "65959 &nbsp;\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td class=\"darktable\">\n" +
            "Rating\n" +
            "</td>\n" +
            "<td>\n" +
            "<a href=\"/ratingdetails.php?username=hulio&amp;showlite=\"><b>15988</b></a> &nbsp;\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td class=\"darktable\">\n" +
            "Homepage\n" +
            "</td>\n" +
            "<td>\n" +
            "\n" +
            "&nbsp;\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td valign=\"top\" class=\"darktable\">\n" +
            "Occupation\n" +
            "</td>\n" +
            "<td>\n" +
            "ВМиК &nbsp;\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td valign=\"top\" class=\"darktable\">\n" +
            "Hobbies\n" +
            "</td>\n" +
            "<td>\n" +
            "программирование, распиздяйство &nbsp;\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td valign=\"top\" class=\"darktable\">\n" +
            "Location\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td valign=\"top\" class=\"darktable\">\n" +
            "Bio\n" +
            "</td>\n" +
            "<td colspan=\"2\">\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td valign=\"top\" class=\"darktable\">\n" +
            "ICQ Number\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp; \n" +
            "\n" +
            "\n" +
            "           </td></tr><tr><td valign=\"top\" class=\"darktable\">\n" +
            "           Пол (gender)\n" +
            "           </td><td>\n" +
            "           &nbsp;\n" +
            "         \n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td valign=\"top\" class=\"darktable\">\n" +
            "Registered on\n" +
            "</td>\n" +
            "<td>\n" +
            "09.10.2004 17:34 &nbsp;\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>                                                          \n" +
            "<td valign=\"top\" class=\"darktable\">                           \n" +
            "Last online                                     \n" +
            "</td>                                                         \n" +
            "<td>                                                          \n" +
            " &nbsp;                                                  \n" +
            "</td>                                                         \n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td valign=\"top\" class=\"darktable\">\n" +
            "Signature\n" +
            "</td>\n" +
            "<td>\n" +
            "помните, что Microsoft компания всегда думает о том, как вас лучше сделать.\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td valign=\"top\" class=\"darktable\">\n" +
            "Sympathies\n" +
            "</td>\n" +
            "<td title=\"Show sympathy for this user\">\n" +
            "<form action=\"/addaddress.php?Cat=&sympathy=1\" method=\"post\"><input type=\"hidden\" name=\"User\" value=\"hulio\"><input type=\"hidden\" name=\"postdata_protection_key\" value=\"916d3891a243c10fede49f9c276f1a20\"/><input type=\"hidden\" name=\"UID\" value=\"5841\"><input type=\"submit\" class=\"buttons\" value=\"&nbsp;\" style=\"width:24px;background-image:url('/images/heart.gif');background-position:center left;background-repeat:no-repeat;\"></form>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td valign=\"top\" class=\"darktable\">\n" +
            "Penalties\n" +
            "</td>\n" +
            "<td colspan=\"2\"><table cellpadding=\"3\" cellspacing=\"1\" width=\"100%\" class=\"tableborders\">\n" +
            "<tr>\n" +
            "<td class=\"darktable\">Board</td>\n" +
            "<td class=\"darktable\">Moderator</td>\n" +
            "<td class=\"darktable\">Penalty</td>\n" +
            "<td class=\"darktable\">Expires</td>\n" +
            "<td class=\"darktable\">Reason</td>\n" +
            "<td class=\"darktable\">Post</td>\n" +
            "<td class=\"darktable\">&nbsp;</td>\n" +
            "\n" +
            "</tr>\n" +
            "<!-- BEGIN CODE LOOP _ DO NOT ALTER COMMENTS --><tr class=\"lighttable\">\n" +
            "<td>Common</td>\n" +
            "<td><a href=\"/showprofile.php?User=FAQ\">FAQ</a></td>\n" +
            "<td align=\"center\">замечание (+)</td>\n" +
            "<td>01.05.2013 23:57</td>\n" +
            "<td>Личные оскорбления. </td>\n" +
            "<td><a href=\"/showthreaded.php?Cat=&Board=Common&Number=11446808\" target=\"_blank\">Re: Электросталь, выброс радиации (13 марта)</a></td>\n" +
            "\n" +
            "</tr><tr class=\"lighttable\">\n" +
            "<td>Common</td>\n" +
            "<td><a href=\"/showprofile.php?User=pingvin\">pingvin</a></td>\n" +
            "<td align=\"center\">замечание (+)</td>\n" +
            "<td>03.05.2013 10:00</td>\n" +
            "<td>Личные оскорбления. </td>\n" +
            "<td><a href=\"/showthreaded.php?Cat=&Board=Common&Number=11448672\" target=\"_blank\">Re: Честь, совесть, достоинство vs естественный отбор</a></td>\n" +
            "\n" +
            "</tr><tr class=\"lighttable\">\n" +
            "<td>Common</td>\n" +
            "<td><a href=\"/showprofile.php?User=pingvin\">pingvin</a></td>\n" +
            "<td align=\"center\">строгое замечание (++)</td>\n" +
            "<td>16.05.2013 18:00</td>\n" +
            "<td>Личные оскорбления. Ненормативная лексика. Игнорирование замечаний модератора. </td>\n" +
            "<td><a href=\"/showthreaded.php?Cat=&Board=garbage&Number=11454382\" target=\"_blank\"> Честь, совесть, достоинство vs естественный отбор</a></td>\n" +
            "\n" +
            "</tr><tr class=\"lighttable\">\n" +
            "<td>Society</td>\n" +
            "<td><a href=\"/showprofile.php?User=Owen\">Owen</a></td>\n" +
            "<td align=\"center\">предупреждение (!)</td>\n" +
            "<td>30.05.2013 14:06</td>\n" +
            "<td>Личные оскорбления. Сокол считает, что правильно писать &quot;дебил&quot;.</td>\n" +
            "<td><a href=\"/showthreaded.php?Cat=&Board=society&Number=11459522\" target=\"_blank\">Re: Первая церковь для атеистов</a></td>\n" +
            "\n" +
            "</tr><!-- END CODE LOOP -->\n" +
            "</table></td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td valign=\"top\" class=\"darktable\">\n" +
            "Comment\n" +
            "</td>\n" +
            "<td>\n" +
            "&nbsp; <form action=\"/addaddress.php?editcomment=1\" method=\"post\"><input type=\"hidden\" name=\"User\" value=\"hulio\"><input type=\"hidden\" name=\"postdata_protection_key\" value=\"916d3891a243c10fede49f9c276f1a20\"/><input type=\"submit\" class=\"buttons\" value=\"   Edit   \"></form>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td valign=\"top\" colspan=\"3\" align=\"center\" >\n" +
            "<!-- HTML for this is defined in showprofile.php since this is -->\n" +
            "<!-- only displayed on certain conditions -->\n" +
            "\n" +
            "<br />\n" +
            "<br />\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td valign=\"top\" colspan=\"3\" align=\"center\" class=\"darktable\">\n" +
            "<img src=\"/images/sendprivate.gif\" alt=\"Send a private message\" border=\"0\" style=\"vertical-align: text-bottom\" />\n" +
            "<a href=\"/sendprivate.php?Cat=&amp;User=hulio&amp;Board=&amp;what=&amp;page=&amp;view=&amp;sb=&amp;o=&amp;fpart=&amp;vc=&amp;showlite=\">\n" +
            "Send a private message</a>\n" +
            "|\n" +
            "<img src=\"/images/sundial.gif\" alt=\"Send a private message\" border=\"0\" style=\"vertical-align: text-bottom\" />\n" +
            "<a href=\"/viewmessages.php?box=sentreceived&amp;Words=&amp;search_username=hulio&amp;Match=Entire+Phrase&amp;buttsubmit=Submit&amp;extended=1&amp;showlite=\">\n" +
            "History</a>\n" +
            "| \n" +
            "\n" +
            "\n" +
            "<img src=\"/images/addtobook.gif\" align=\"top\" alt=\"\" style=\"vertical-align: text-bottom\" />\n" +
            " <a href=\"/addaddress.php?Cat=&amp;User=hulio&amp;Board=&amp;Number=&amp;what=&amp;page=&amp;view=&amp;sb=&amp;o=&amp;friend=1&amp;showlite=\">\n" +
            "Add to address book\n" +
            "</a>\n" +
            " | \n" +
            "<img src=\"/images/viewposts.gif\" align=\"top\" alt=\"\" style=\"vertical-align: text-bottom\" />\n" +
            "<a href=\"/dosearch.php?Cat=&amp;Forum=All_Forums&amp;Words=&amp;Uname=hulio&amp;Searchpage=0&amp;Limit=25&amp;Old=allposts&amp;src=all&amp;showlite=\">Show all user's posts</a>\n" +
            "|\n" +
            "<a href=\"/userstats.php?Username=hulio\">\n" +
            "<img src=\"/images/graph.gif\" align=\"top\" alt=\"\" border=\"0\" style=\"vertical-align: text-bottom\" />\n" +
            "</a>\n" +
            "<!--<img src=\"/images/returntoforum.gif\" alt=\"Return to Forum\" border=\"0\" />\n" +
            "<a href=\"/ubbthreads.php?Cat=&amp;showlite=\">\n" +
            "Return to Forum\n" +
            "</a>-->\n" +
            "\n" +
            "</td>\n" +
            "</tr>\n" +
            "</table>\n" +
            "\n" +
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

    private static final String HAS_SYMPATHY = "\n" +
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
            "<title>Profile for Sweet_Lilu - Public forum of MSU united student networks</title>\n" +
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
            "<a href = \"/logout.php?key=77d26ff4151fe6e2d2e695efc198253a\" target=\"_top\">Logout</a>\n" +
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
            "<tr>\n" +
            "<td class=\"tdheader\">\n" +
            "Profile for Sweet_Lilu\n" +
            "</td>\n" +
            "</tr>\n" +
            "</table>\n" +
            "</td>\n" +
            "</tr>\n" +
            "</table>\n" +
            "\n" +
            "<table width=\"95%\" align=\"center\" cellpadding=\"1\" cellspacing=\"1\" class=\"tablesurround\">\n" +
            "<tr>\n" +
            "<td>\n" +
            "<table cellpadding=\"3\" cellspacing=\"1\" width=\"100%\" class=\"tableborders\">\n" +
            "<tr class=\"lighttable\">\n" +
            "<td>\n" +
            "<table border=\"0\" width=\"100%\" class=\"lighttable\" cellpadding=\"0\">\n" +
            "<tr>\n" +
            "<td width=\"10%\" class=\"darktable\">\n" +
            "Email\n" +
            "</td>\n" +
            "<td width=\"40%\">\n" +
            "<a href=\"mailto:\"></a>\n" +
            "&nbsp;\n" +
            "</td>\n" +
            "<td align=\"right\" valign=\"top\" rowspan=\"11\">\n" +
            "<img src=\"/user/20505.png\" alt=\"Picture\" width=\"80\" height=\"80\" />\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td class=\"darktable\">\n" +
            "Name\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td class=\"darktable\">\n" +
            "Title\n" +
            "</td>\n" +
            "<td>\n" +
            "member &nbsp;\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td class=\"darktable\">\n" +
            "Total Posts\n" +
            "</td>\n" +
            "<td>\n" +
            "125 &nbsp;\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td class=\"darktable\">\n" +
            "Rating\n" +
            "</td>\n" +
            "<td>\n" +
            "<a href=\"/ratingdetails.php?username=Sweet_Lilu&amp;showlite=\"><b>883</b></a> &nbsp;\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td class=\"darktable\">\n" +
            "Homepage\n" +
            "</td>\n" +
            "<td>\n" +
            "\n" +
            "&nbsp;\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td valign=\"top\" class=\"darktable\">\n" +
            "Occupation\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td valign=\"top\" class=\"darktable\">\n" +
            "Hobbies\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td valign=\"top\" class=\"darktable\">\n" +
            "Location\n" +
            "</td>\n" +
            "<td>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td valign=\"top\" class=\"darktable\">\n" +
            "Bio\n" +
            "</td>\n" +
            "<td colspan=\"2\">\n" +
            "<table width=\"\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
            "<tr>\n" +
            "<td  rowspan=\"2\"><img src=\"/user/upload/file398386.jpg\"><!--width=\"384\" height=\"768\"--></td><td ><img src=\"/user/upload/file398420.jpg\"><!--width=\"444\" height=\"384\"--></td><td  rowspan=\"2\"><img src=\"/user/upload/file398414.jpg\"><!--width=\"363\" height=\"768\"--></td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td ><img src=\"/user/upload/file398421.jpg\"><!--width=\"444\" height=\"384\"--></td>\n" +
            "</tr>\n" +
            "\n" +
            "</table>\n" +
            " &nbsp;\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td valign=\"top\" class=\"darktable\">\n" +
            "ICQ Number\n" +
            "</td>\n" +
            "<td>\n" +
            "466447649 &nbsp; \n" +
            "\n" +
            "\n" +
            "           </td></tr><tr><td valign=\"top\" class=\"darktable\">\n" +
            "           Пол (gender)\n" +
            "           </td><td>\n" +
            "           Ж&nbsp;\n" +
            "         \n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td valign=\"top\" class=\"darktable\">\n" +
            "Registered on\n" +
            "</td>\n" +
            "<td>\n" +
            "06.08.2009 21:47 &nbsp;\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>                                                          \n" +
            "<td valign=\"top\" class=\"darktable\">                           \n" +
            "Last online                                     \n" +
            "</td>                                                         \n" +
            "<td>                                                          \n" +
            " &nbsp;                                                  \n" +
            "</td>                                                         \n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td valign=\"top\" class=\"darktable\">\n" +
            "Signature\n" +
            "</td>\n" +
            "<td>\n" +
            "The best day is today. <img src=\"/smiles/cat.gif\">\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td valign=\"top\" class=\"darktable\">\n" +
            "Sympathies\n" +
            "</td>\n" +
            "<td title=\"Dismiss sympathy for this user\">\n" +
            "<form action=\"/addaddress.php?Cat=&sympathy=0\" method=\"post\"><input type=\"hidden\" name=\"User\" value=\"Sweet_Lilu\"><input type=\"hidden\" name=\"postdata_protection_key\" value=\"916d3891a243c10fede49f9c276f1a20\"/><input type=\"hidden\" name=\"UID\" value=\"20505\"><input type=\"submit\" class=\"buttons\" value=\"&nbsp;\" style=\"width:24px;background-image:url('/images/heart2.gif');background-position:center left;background-repeat:no-repeat;\"></form>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td valign=\"top\" class=\"darktable\">\n" +
            "Penalties\n" +
            "</td>\n" +
            "<td colspan=\"2\"></td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td valign=\"top\" class=\"darktable\">\n" +
            "Comment\n" +
            "</td>\n" +
            "<td>\n" +
            "&nbsp; <form action=\"/addaddress.php?editcomment=1\" method=\"post\"><input type=\"hidden\" name=\"User\" value=\"Sweet_Lilu\"><input type=\"hidden\" name=\"postdata_protection_key\" value=\"916d3891a243c10fede49f9c276f1a20\"/><input type=\"submit\" class=\"buttons\" value=\"   Edit   \"></form>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td valign=\"top\" colspan=\"3\" align=\"center\" >\n" +
            "<!-- HTML for this is defined in showprofile.php since this is -->\n" +
            "<!-- only displayed on certain conditions -->\n" +
            "\n" +
            "<br />\n" +
            "<br />\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td valign=\"top\" colspan=\"3\" align=\"center\" class=\"darktable\">\n" +
            "<img src=\"/images/sendprivate.gif\" alt=\"Send a private message\" border=\"0\" style=\"vertical-align: text-bottom\" />\n" +
            "<a href=\"/sendprivate.php?Cat=&amp;User=Sweet_Lilu&amp;Board=&amp;what=&amp;page=&amp;view=&amp;sb=&amp;o=&amp;fpart=&amp;vc=&amp;showlite=\">\n" +
            "Send a private message</a>\n" +
            "|\n" +
            "<img src=\"/images/sundial.gif\" alt=\"Send a private message\" border=\"0\" style=\"vertical-align: text-bottom\" />\n" +
            "<a href=\"/viewmessages.php?box=sentreceived&amp;Words=&amp;search_username=Sweet_Lilu&amp;Match=Entire+Phrase&amp;buttsubmit=Submit&amp;extended=1&amp;showlite=\">\n" +
            "History</a>\n" +
            "| \n" +
            "\n" +
            "\n" +
            "<img src=\"/images/addtobook.gif\" align=\"top\" alt=\"\" style=\"vertical-align: text-bottom\" />\n" +
            " <a href=\"/addaddress.php?Cat=&amp;User=Sweet_Lilu&amp;Board=&amp;Number=&amp;what=&amp;page=&amp;view=&amp;sb=&amp;o=&amp;friend=1&amp;showlite=\">\n" +
            "Add to address book\n" +
            "</a>\n" +
            " | \n" +
            "<img src=\"/images/viewposts.gif\" align=\"top\" alt=\"\" style=\"vertical-align: text-bottom\" />\n" +
            "<a href=\"/dosearch.php?Cat=&amp;Forum=All_Forums&amp;Words=&amp;Uname=Sweet_Lilu&amp;Searchpage=0&amp;Limit=25&amp;Old=allposts&amp;src=all&amp;showlite=\">Show all user's posts</a>\n" +
            "|\n" +
            "<a href=\"/userstats.php?Username=Sweet_Lilu\">\n" +
            "<img src=\"/images/graph.gif\" align=\"top\" alt=\"\" border=\"0\" style=\"vertical-align: text-bottom\" />\n" +
            "</a>\n" +
            "<!--<img src=\"/images/returntoforum.gif\" alt=\"Return to Forum\" border=\"0\" />\n" +
            "<a href=\"/ubbthreads.php?Cat=&amp;showlite=\">\n" +
            "Return to Forum\n" +
            "</a>-->\n" +
            "\n" +
            "</td>\n" +
            "</tr>\n" +
            "</table>\n" +
            "\n" +
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
