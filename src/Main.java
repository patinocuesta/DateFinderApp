
import java.security.Key;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String text =
                "List of Presidents of the United States 1\n" +
                        "List of Presidents of the United States\n" +
                        "The White House, the president's official residence and center of the administration\n" +
                        "Under the U.S. Constitution, the President\n" +
                        "of the United States is the head of state and\n" +
                        "the head of government of the United States.\n" +
                        "As chief of the executive branch and head of\n" +
                        "the federal government as a whole, the\n" +
                        "presidency is the highest political office in\n" +
                        "the United States by influence and\n" +
                        "recognition. The president is also the\n" +
                        "Commander-in-Chief of the U.S. armed\n" +
                        "forces. The president is indirectly elected to\n" +
                        "a four-year term by an Electoral College (or\n" +
                        "by the House of Representatives should the\n" +
                        "Electoral College fail to award an absolute\n" +
                        "majority of votes to any person). Since the\n" +
                        "ratification of the Twenty-second\n" +
                        "Amendment to the United States\n" +
                        "Constitution in 1951, no person may be elected to the office of the president more than twice or serve more than a\n" +
                        "total of 10 years.[1] Upon death, resignation, or removal from office of an incumbent president, the Vice President\n" +
                        "assumes the office.\n" +
                        "About the list\n" +
                        "This list includes only those persons who were sworn into office as president following the ratification of the United\n" +
                        "States Constitution, which took effect on March 4, 1789. For American leaders before this ratification, see President\n" +
                        "of the Continental Congress. The list does not include any Acting Presidents under the Twenty-fifth Amendment to\n" +
                        "the United States Constitution.\n" +
                        "There have been forty-three people sworn into office, and forty-four presidencies, due to the fact that Grover\n" +
                        "Cleveland served two non-consecutive terms and is counted chronologically as both the twenty-second and the\n" +
                        "twenty-fourth president. Of the individuals elected as president, four died in office of natural causes (William Henry\n" +
                        "Harrison, Zachary Taylor, Warren G. Harding, and Franklin D. Roosevelt), one resigned (Richard Nixon), and four\n" +
                        "were assassinated (Abraham Lincoln, James A. Garfield, William McKinley, and John F. Kennedy). The first\n" +
                        "president was George Washington, who was inaugurated in 1789 after a unanimous Electoral College vote. William\n" +
                        "Henry Harrison spent the shortest time in office at 31 days in 1841. At over twelve years, Franklin D. Roosevelt\n" +
                        "spent the longest time in office, and is the only president to serve more than two terms; he died shortly into his fourth\n" +
                        "term in 1945. The current president is Barack Obama; he assumed the office on January 20, 2009, and is the first\n" +
                        "African American president and the first president born outside the Contiguous United States, being born in Hawaii.\n" +
                        "List of Presidents of the United States 2\n" +
                        "List of Presidents\n" +
                        "Parties\n" +
                        "No party       Federalist       Democratic-Republican       Democratic       Whig       Republican\n" +
                        "Presidency[2] President Took office Left office Party Vice President Term\n" +
                        "1 George\n" +
                        "Washington\n" +
                        "[3] [4] [5] [6]\n" +
                        "April 30,\n" +
                        "1789\n" +
                        "March 4, 1797 no party John Adams 1\n" +
                        "2\n" +
                        "2\n" +
                        "John Adams\n" +
                        "[7] [8] [9] [10]\n" +
                        "March 4,\n" +
                        "1797\n" +
                        "March 4, 1801 Federalist Thomas Jefferson 3\n" +
                        "3\n" +
                        "Thomas\n" +
                        "Jefferson\n" +
                        "[11] [12] [13]\n" +
                        "[14]\n" +
                        "March 4,\n" +
                        "1801\n" +
                        "March 4, 1809 Democratic-Republican Aaron Burr 4\n" +
                        "George Clinton 5\n" +
                        "4\n" +
                        "James Madison\n" +
                        "[15] [16] [17]\n" +
                        "[18]\n" +
                        "March 4,\n" +
                        "1809\n" +
                        "March 4, 1817 Democratic-Republican George Clinton[19]\n" +
                        "March 4, 1809 – April\n" +
                        "20, 1812\n" +
                        "6\n" +
                        "vacant\n" +
                        "[20]\n" +
                        "April 20, 1812 – March\n" +
                        "4, 1813\n" +
                        "Elbridge Gerry[19]\n" +
                        "March 4, 1813 –\n" +
                        "November 23, 1814\n" +
                        "7\n" +
                        "vacant\n" +
                        "[20]\n" +
                        "November 23, 1814 –\n" +
                        "March 4, 1817\n" +
                        "5\n" +
                        "James Monroe\n" +
                        "[21] [22] [23]\n" +
                        "[24]\n" +
                        "March 4,\n" +
                        "1817\n" +
                        "March 4, 1825 Democratic-Republican Daniel D. Tompkins 8\n" +
                        "9\n" +
                        "6\n" +
                        "John Quincy\n" +
                        "Adams\n" +
                        "[25] [26] [27]\n" +
                        "[28]\n" +
                        "March 4,\n" +
                        "1825\n" +
                        "March 4, 1829 Democratic-Republican\n" +
                        "National Republican\n" +
                        "John C. Calhoun 10\n" +
                        "7 Andrew Jackson\n" +
                        "[29] [30] [31]\n" +
                        "[32]\n" +
                        "March 4,\n" +
                        "1829\n" +
                        "March 4, 1837 Democratic John C. Calhoun [33]\n" +
                        "March 4, 1829 –\n" +
                        "December 28, 1832\n" +
                        "11\n" +
                        "vacant\n" +
                        "[20]\n" +
                        "December 28, 1832 –\n" +
                        "March 4, 1833\n" +
                        "Martin Van Buren 12\n" +
                        "8 Martin Van\n" +
                        "Buren\n" +
                        "[34] [35] [36]\n" +
                        "[37]\n" +
                        "March 4,\n" +
                        "1837\n" +
                        "March 4, 1841 Democratic Richard Mentor Johnson 13\n" +
                        "List of Presidents of the United States 3\n" +
                        "9 William Henry\n" +
                        "Harrison\n" +
                        "[38] [39] [40]\n" +
                        "[41]\n" +
                        "March 4,\n" +
                        "1841\n" +
                        "April 4,\n" +
                        "1841[19]\n" +
                        "Whig John Tyler 14\n" +
                        "10[42] John Tyler\n" +
                        "[43] [44] [45]\n" +
                        "[46]\n" +
                        "April 4, 1841 March 4, 1845 Whig\n" +
                        "April 4, 1841 – September\n" +
                        "13, 1841\n" +
                        "vacant\n" +
                        "[20]\n" +
                        "no party\n" +
                        "[47]\n" +
                        "September 13, 1841 – March\n" +
                        "4, 1845\n" +
                        "11 James K. Polk\n" +
                        "[48] [49] [50]\n" +
                        "[51]\n" +
                        "March 4,\n" +
                        "1845\n" +
                        "March 4, 1849 Democratic George M. Dallas 15\n" +
                        "12 Zachary Taylor\n" +
                        "[52] [53] [54]\n" +
                        "[55]\n" +
                        "March 4,\n" +
                        "1849\n" +
                        "July 9,\n" +
                        "1850[19]\n" +
                        "Whig Millard Fillmore 16\n" +
                        "13 Millard Fillmore\n" +
                        "[56] [57] [58]\n" +
                        "[59]\n" +
                        "July 9, 1850 March 4, 1853 Whig vacant\n" +
                        "[20]\n" +
                        "14 Franklin Pierce\n" +
                        "[60] [61] [62]\n" +
                        "[63]\n" +
                        "March 4,\n" +
                        "1853\n" +
                        "March 4, 1857 Democratic William R. King[19]\n" +
                        "March 4, 1853 – April\n" +
                        "18, 1853\n" +
                        "17\n" +
                        "vacant\n" +
                        "[20]\n" +
                        "April 18, 1853 – March\n" +
                        "4, 1857\n" +
                        "15 James Buchanan\n" +
                        "[64] [65] [66]\n" +
                        "[67]\n" +
                        "March 4,\n" +
                        "1857\n" +
                        "March 4, 1861 Democratic John C. Breckinridge 18\n" +
                        "16 Abraham\n" +
                        "Lincoln\n" +
                        "[68] [69] [70]\n" +
                        "[71]\n" +
                        "March 4,\n" +
                        "1861\n" +
                        "April 15,\n" +
                        "1865[72]\n" +
                        "Republican\n" +
                        "National Union[73]\n" +
                        "Hannibal Hamlin 19\n" +
                        "Andrew Johnson 20\n" +
                        "17 Andrew Johnson\n" +
                        "[74] [75] [76]\n" +
                        "[77]\n" +
                        "April 15,\n" +
                        "1865\n" +
                        "March 4, 1869 Democratic\n" +
                        "National Union[73]\n" +
                        "vacant\n" +
                        "[20]\n" +
                        "National Union[73]\n" +
                        "no party\n" +
                        "[78]\n" +
                        "18 Ulysses S. Grant\n" +
                        "[79] [80] [81]\n" +
                        "[82]\n" +
                        "March 4,\n" +
                        "1869\n" +
                        "March 4, 1877 Republican Schuyler Colfax 21\n" +
                        "Henry Wilson[19]\n" +
                        "March 4, 1873 –\n" +
                        "November 22, 1875\n" +
                        "22\n" +
                        "vacant\n" +
                        "[20]\n" +
                        "November 22, 1875 –\n" +
                        "March 4, 1877\n" +
                        "List of Presidents of the United States 4\n" +
                        "19 Rutherford B.\n" +
                        "Hayes\n" +
                        "[83] [84] [85]\n" +
                        "[86]\n" +
                        "March 4,\n" +
                        "1877\n" +
                        "March 4, 1881 Republican William A. Wheeler 23\n" +
                        "20 James A.\n" +
                        "Garfield\n" +
                        "[87] [88] [89]\n" +
                        "[90]\n" +
                        "March 4,\n" +
                        "1881\n" +
                        "September 19,\n" +
                        "1881[72]\n" +
                        "Republican Chester A. Arthur 24\n" +
                        "21 Chester A.\n" +
                        "Arthur\n" +
                        "[91] [92] [93]\n" +
                        "[94]\n" +
                        "September 19,\n" +
                        "1881\n" +
                        "March 4, 1885 Republican vacant\n" +
                        "[20]\n" +
                        "22 Grover\n" +
                        "Cleveland\n" +
                        "[95] [96] [97]\n" +
                        "[98]\n" +
                        "March 4,\n" +
                        "1885\n" +
                        "March 4, 1889 Democratic Thomas A.\n" +
                        "Hendricks[19]\n" +
                        "March 4, 1885 –\n" +
                        "November 25, 1885\n" +
                        "25\n" +
                        "vacant\n" +
                        "[20]\n" +
                        "November 25, 1885 –\n" +
                        "March 4, 1889\n" +
                        "23 Benjamin\n" +
                        "Harrison\n" +
                        "[99] [100] [101]\n" +
                        "[102]\n" +
                        "March 4,\n" +
                        "1889\n" +
                        "March 4, 1893 Republican Levi P. Morton 26\n" +
                        "24 Grover\n" +
                        "Cleveland\n" +
                        "(second term)\n" +
                        "[95] [96] [97]\n" +
                        "[98]\n" +
                        "March 4,\n" +
                        "1893\n" +
                        "March 4, 1897 Democratic Adlai E. Stevenson I 27\n" +
                        "25 William\n" +
                        "McKinley\n" +
                        "[103] [104]\n" +
                        "[105] [106]\n" +
                        "March 4,\n" +
                        "1897\n" +
                        "September 14,\n" +
                        "1901[72]\n" +
                        "Republican Garret Hobart[19]\n" +
                        "March 4, 1897 –\n" +
                        "November 21, 1899\n" +
                        "28\n" +
                        "vacant\n" +
                        "[20]\n" +
                        "November 21, 1899 –\n" +
                        "March 4, 1901\n" +
                        "Theodore Roosevelt 29\n" +
                        "26 Theodore\n" +
                        "Roosevelt\n" +
                        "[107] [108]\n" +
                        "[109] [110]\n" +
                        "September 14,\n" +
                        "1901\n" +
                        "March 4, 1909 Republican vacant\n" +
                        "[20]\n" +
                        "Charles W. Fairbanks 30\n" +
                        "27 William Howard\n" +
                        "Taft\n" +
                        "[111] [112]\n" +
                        "[113] [114]\n" +
                        "March 4,\n" +
                        "1909\n" +
                        "March 4, 1913 Republican James S. Sherman[19]\n" +
                        "March 4, 1909 –\n" +
                        "October 30, 1912\n" +
                        "31\n" +
                        "vacant\n" +
                        "[20]\n" +
                        "October 30, 1912 –\n" +
                        "March 4, 1913\n" +
                        "List of Presidents of the United States 5\n" +
                        "28 Woodrow\n" +
                        "Wilson\n" +
                        "[115] [116]\n" +
                        "[117] [118]\n" +
                        "March 4,\n" +
                        "1913\n" +
                        "March 4, 1921 Democratic Thomas R. Marshall 32\n" +
                        "33\n" +
                        "29 Warren G.\n" +
                        "Harding\n" +
                        "[119] [120]\n" +
                        "[121] [122]\n" +
                        "March 4,\n" +
                        "1921\n" +
                        "August 2,\n" +
                        "1923[19]\n" +
                        "Republican Calvin Coolidge 34\n" +
                        "30 Calvin Coolidge\n" +
                        "[123] [124]\n" +
                        "[125] [126]\n" +
                        "August 2,\n" +
                        "1923\n" +
                        "March 4, 1929 Republican vacant\n" +
                        "[20]\n" +
                        "Charles G. Dawes 35\n" +
                        "31 Herbert Hoover\n" +
                        "[127] [128]\n" +
                        "[129] [130]\n" +
                        "March 4,\n" +
                        "1929\n" +
                        "March 4, 1933 Republican Charles Curtis 36\n" +
                        "32 Franklin D.\n" +
                        "Roosevelt\n" +
                        "[131] [132]\n" +
                        "[133] [134]\n" +
                        "March 4,\n" +
                        "1933\n" +
                        "April 12,\n" +
                        "1945[19]\n" +
                        "Democratic John Nance Garner 37[135]\n" +
                        "38\n" +
                        "Henry A. Wallace 39\n" +
                        "Harry S. Truman 40\n" +
                        "33 Harry S.\n" +
                        "Truman\n" +
                        "[136] [137]\n" +
                        "[138] [139]\n" +
                        "April 12,\n" +
                        "1945\n" +
                        "January 20,\n" +
                        "1953\n" +
                        "Democratic vacant\n" +
                        "[20]\n" +
                        "Alben W. Barkley 41\n" +
                        "34 Dwight D.\n" +
                        "Eisenhower\n" +
                        "[140] [141]\n" +
                        "[142] [143]\n" +
                        "January 20,\n" +
                        "1953\n" +
                        "January 20,\n" +
                        "1961\n" +
                        "Republican Richard Nixon 42\n" +
                        "43\n" +
                        "35 John F.\n" +
                        "Kennedy\n" +
                        "[144] [145]\n" +
                        "[146] [147]\n" +
                        "January 20,\n" +
                        "1961\n" +
                        "November 22,\n" +
                        "1963[72]\n" +
                        "Democratic Lyndon B. Johnson 44\n" +
                        "36 Lyndon B.\n" +
                        "Johnson\n" +
                        "[148] [149]\n" +
                        "[150] [151]\n" +
                        "November 22,\n" +
                        "1963\n" +
                        "January 20,\n" +
                        "1969\n" +
                        "Democratic vacant\n" +
                        "[20]\n" +
                        "Hubert Humphrey 45\n" +
                        "List of Presidents of the United States 6\n" +
                        "37 Richard Nixon\n" +
                        "[152] [153]\n" +
                        "[154] [155]\n" +
                        "January 20,\n" +
                        "1969\n" +
                        "August 9,\n" +
                        "1974[33]\n" +
                        "Republican Spiro Agnew[33]\n" +
                        "January 20, 1969 –\n" +
                        "October 10, 1973\n" +
                        "46\n" +
                        "47\n" +
                        "vacant\n" +
                        "[20]\n" +
                        "October 10, 1973 –\n" +
                        "December 6, 1973\n" +
                        "Gerald Ford\n" +
                        "December 6, 1973 –\n" +
                        "August 9, 1974\n" +
                        "38 Gerald Ford\n" +
                        "[156] [157]\n" +
                        "[158] [159]\n" +
                        "August 9,\n" +
                        "1974\n" +
                        "January 20,\n" +
                        "1977\n" +
                        "Republican vacant\n" +
                        "[20]\n" +
                        "August 9, 1974 –\n" +
                        "December 19, 1974\n" +
                        "Nelson Rockefeller\n" +
                        "December 19, 1974 –\n" +
                        "January 20, 1977\n" +
                        "39 Jimmy Carter\n" +
                        "[160] [161]\n" +
                        "[162] [163]\n" +
                        "January 20,\n" +
                        "1977\n" +
                        "January 20,\n" +
                        "1981\n" +
                        "Democratic Walter Mondale 48\n" +
                        "40 Ronald Reagan\n" +
                        "[164] [165]\n" +
                        "[166] [167]\n" +
                        "January 20,\n" +
                        "1981\n" +
                        "January 20,\n" +
                        "1989\n" +
                        "Republican George H. W. Bush 49\n" +
                        "50\n" +
                        "41 George H. W.\n" +
                        "Bush\n" +
                        "[168] [169]\n" +
                        "[170] [171]\n" +
                        "January 20,\n" +
                        "1989\n" +
                        "January 20,\n" +
                        "1993\n" +
                        "Republican Dan Quayle 51\n" +
                        "42 Bill Clinton\n" +
                        "[172] [173]\n" +
                        "[174] [175]\n" +
                        "January 20,\n" +
                        "1993\n" +
                        "January 20,\n" +
                        "2001\n" +
                        "Democratic Al Gore 52\n" +
                        "53\n" +
                        "43 George W. Bush\n" +
                        "[176] [177]\n" +
                        "[178] [179]\n" +
                        "January 20,\n" +
                        "2001\n" +
                        "January 20,\n" +
                        "2009\n" +
                        "Republican Dick Cheney 54\n" +
                        "55\n" +
                        "44 Barack Obama\n" +
                        "[180] [181]\n" +
                        "[182] [183]\n" +
                        "January 20,\n" +
                        "2009\n" +
                        "Incumbent Democratic Joe Biden 56\n" +
                        "See also\n" +
                        "• Historical rankings of United States Presidents\n" +
                        "• List of educational institutions named after U.S. presidents\n" +
                        "• List of Vice Presidents of the United States\n" +
                        "• Presidential $1 Coin Program\n" +
                        "External links\n" +
                        "• Whitehouse.gov: The Presidents [184]\n" +
                        "• American Heritage People: The Presidents [185]\n" +
                        "• American Presidents – History Channel [186]\n" +
                        "• American Presidents: Life Portraits [187]\n" +
                        "List of Presidents of the United States 7\n" +
                        "• The Hauenstein Center for Presidential Studies [188]\n" +
                        "– Grand Valley State University\n" +
                        "• POTUS: Presidents of the United States [189]\n" +
                        "– Internet Public Library\n" +
                        "References\n" +
                        "[1] \"The Constitution: Amendments 11–27\" (http://www.archives.gov/exhibits/charters/constitution_amendments_11-27.html). U.S.\n" +
                        "National Archives & Records Administration. . Retrieved 2008-10-01.\n" +
                        "[2] A presidency is defined as consecutive time in office served by a single person. For example, George Washington served two consecutive\n" +
                        "terms and is counted as the first president (not the first and second). Gerald Ford assumed the presidency after the resignation of Richard\n" +
                        "Nixon, serving out the remainder of what would have been Nixon's second term. The fact that Ford was not voted into office does not affect\n" +
                        "the numbering, which makes him the 38th president. In addition, under this numbering, Grover Cleveland is counted as having two separate\n" +
                        "presidencies, having served two non-consecutive terms.\n" +
                        "[3] The White House (March 12, 2007). \"Biography of George Washington\" (http://www.whitehouse.gov/about/presidents/\n" +
                        "georgewashington/). Whitehouse.gov. . Retrieved January 12, 2009.\n" +
                        "[4] \"The First President: 1789–1797 George Washington \"Father of his Country\"\" (http://www.americanheritage.com/people/presidents/\n" +
                        "washington_george.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[5] \"George Washington – no Political Party – 1st President – American Presidents\" (http://www.history.com/presidents/washington).\n" +
                        "History. . Retrieved January 12 2009.\n" +
                        "[6] \"George Washington (February 22, 1732 – December 14, 1799)\" (http://americanpresidents.org/presidents/gwashington.asp). American\n" +
                        "Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[7] \"Biography of John Adams\" (http://www.whitehouse.gov/about/presidents/johnadams/). Whitehouse.gov. March 12, 2007. . Retrieved\n" +
                        "January 12, 2009.\n" +
                        "[8] \"The Second President: 1797–1801 John Adams \"Following in the Footsteps\"\" (http://www.americanheritage.com/people/presidents/\n" +
                        "adams_john.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[9] \"John Adams – Federalist Party – 2nd President – American Presidents\" (http://www.history.com/presidents/adams). History. . Retrieved\n" +
                        "January 12 2009.\n" +
                        "[10] \"John Adams (October 30, 1735 – July 4, 1826)\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=2).\n" +
                        "American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[11] \"Biography of Thomas Jefferson\" (http://www.whitehouse.gov/about/presidents/thomasjefferson/). Whitehouse.gov. March 12, 2007. .\n" +
                        "Retrieved January 12, 2009.\n" +
                        "[12] \"The Third President: 1801–1809 Thomas Jefferson \"The Renaissance Leader\"\" (http://www.americanheritage.com/people/presidents/\n" +
                        "jefferson_thomas.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[13] \"Thomas Jefferson – Democratic-Republican Party – 3rd President – American Presidents\" (http://www.history.com/presidents/\n" +
                        "jefferson). History. . Retrieved January 12 2009.\n" +
                        "[14] \"Thomas Jefferson (April 13, 1743 – July 4, 1826)\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=3).\n" +
                        "American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[15] \"Biography of James Madison\" (http://www.whitehouse.gov/about/presidents/jamesmadison/). Whitehouse.gov. March 12, 2007. .\n" +
                        "Retrieved January 12, 2009.\n" +
                        "[16] \"The Fourth President: 1809–1817 James Madison \"The Nation Builder\"\" (http://www.americanheritage.com/people/presidents/\n" +
                        "madison_james.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[17] \"James Madison – Democratic-Republican Party – 4th President – American Presidents\" (http://www.history.com/presidents/madison).\n" +
                        "History. . Retrieved January 12 2009.\n" +
                        "[18] \"James Madison (March 16, 1751 – June 28, 1836)\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=4).\n" +
                        "American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[19] Died in office of natural causes.\n" +
                        "[20] Prior to ratification of the Twenty-fifth Amendment to the United States Constitution in 1967, there was no provision for filling a vacancy in\n" +
                        "the Vice Presidency. Richard Nixon was the first president to fill such a vacancy under the provisions of the Twenty-fifth Amendment when\n" +
                        "he appointed Gerald Ford. Ford later became the second president to fill a vice presidential vacancy when he appointed Nelson Rockefeller to\n" +
                        "succeed him.\n" +
                        "[21] \"Biography of James Madison\" (http://www.whitehouse.gov/about/presidents/jamesmonroe/). Whitehouse.gov. March 12, 2007. .\n" +
                        "Retrieved January 12, 2009.\n" +
                        "[22] \"The Fifth President: 1817–1825 James Monroe \"The Era of Good Feelings\"\" (http://www.americanheritage.com/people/presidents/\n" +
                        "monroe_james.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[23] \"James Monroe – Democratic-Republican Party – 5th President – American Presidents\" (http://www.history.com/presidents/monroe).\n" +
                        "History. . Retrieved January 12 2009.\n" +
                        "[24] \"James Monroe (April 28, 1758 – July 4, 1831)\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=5). American\n" +
                        "Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[25] \"Biography of John Quincy Adams\" (http://www.whitehouse.gov/about/presidents/johnquincyadams/). Whitehouse.gov. March 12,\n" +
                        "2007. . Retrieved January 12, 2009.\n" +
                        "List of Presidents of the United States 8\n" +
                        "[26] \"The Sixth President: 1825–1829 John Quincy Adams \"Born to Lead\"\" (http://www.americanheritage.com/people/presidents/\n" +
                        "adams_johnquincy.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[27] \"John Quincy Adams – Federalist, Democratic-Republican, National Republican, WHIG Party – 6th President – American Presidents\"\n" +
                        "(http://www.history.com/presidents/johnqadams). History. . Retrieved January 12 2009.\n" +
                        "[28] \"John Quincy Adams (July 11, 1767 – February 23, 1848)\" (http://americanpresidents.org/presidents/president.\n" +
                        "asp?PresidentNumber=6). American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[29] \"Biography of Andrew Jackson\" (http://www.whitehouse.gov/about/presidents/andrewjackson/). Whitehouse.gov. March 12, 2007. .\n" +
                        "Retrieved January 12, 2009.\n" +
                        "[30] \"The Seventh President: 1829–1837 Andrew Jackson \"Old Hickory\"\" (http://www.americanheritage.com/people/presidents/\n" +
                        "jackson_andrew.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[31] \"Andrew Jackson – Democratic-Republican Party – 7th President – American Presidents\" (http://www.history.com/presidents/jackson).\n" +
                        "History. . Retrieved January 12 2009.\n" +
                        "[32] \"Andrew Jackson (March 15, 1767 – June 8, 1845)\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=7).\n" +
                        "American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[33] Resigned.\n" +
                        "[34] \"Biography of Martin Van Buren\" (http://www.whitehouse.gov/about/presidents/martinvanburen/). Whitehouse.gov. March 12, 2007. .\n" +
                        "Retrieved January 12, 2009.\n" +
                        "[35] \"The Eighth President: 1837–1841 Martin Van Buren \"The Red Fox\"\" (http://www.americanheritage.com/people/presidents/\n" +
                        "vanburen_martin.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[36] \"Martin Van Buren – Democratic-Republican, Democratic, and Free Soil Party – 8th President – American Presidents\" (http://www.\n" +
                        "history.com/presidents/vanburen). History. . Retrieved January 12 2009.\n" +
                        "[37] \"Martin Van Buren (December 5, 1782 – July 24, 1862)\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=8).\n" +
                        "American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[38] \"Biography of William Henry Harrison\" (http://www.whitehouse.gov/about/presidents/williamhenryharrison/). Whitehouse.gov. March\n" +
                        "12, 2007. . Retrieved January 12, 2009.\n" +
                        "[39] \"The Ninth President: 1841–1841 William Henry Harrison \"Old Tippecanoe\"\" (http://www.americanheritage.com/people/presidents/\n" +
                        "harrison_william.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[40] \"William Henry Harrison – WHIG Party – 9th President – American Presidents\" (http://www.history.com/presidents/\n" +
                        "williamhenryharrison). History. . Retrieved January 12 2009.\n" +
                        "[41] \"William Henry Harrison (February 9, 1773 – April 4, 1841)\" (http://americanpresidents.org/presidents/president.\n" +
                        "asp?PresidentNumber=9). American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[42] Being the first vice president to assume the presidency, Tyler set a precedent that a vice president who assumes the office of president\n" +
                        "becomes a fully functioning president who has his own presidency, as opposed to just a caretaker president. His political opponents attempted\n" +
                        "to refer to him as \"Acting President\", but he refused to allow that. The Twenty-fifth Amendment to the United States Constitution put Tyler's\n" +
                        "precedent into the Constitution.\n" +
                        "[43] \"Biography of John Tyler\" (http://www.whitehouse.gov/about/presidents/johntyler/). Whitehouse.gov. March 12, 2007. . Retrieved\n" +
                        "January 12, 2009.\n" +
                        "[44] \"The Tenth President: 1841–1845 John Tyler \"His Accidency\"\" (http://www.americanheritage.com/people/presidents/tyler_john.\n" +
                        "shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[45] \"John Tyler – No Party – 10th President – American Presidents\" (http://www.history.com/presidents/tyler). History. . Retrieved January\n" +
                        "12 2009.\n" +
                        "[46] \"John Tyler (March 29, 1790 – January 18, 1862)\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=10).\n" +
                        "American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[47] Former Democrat who ran for Vice President on Whig ticket. Clashed with Whig congressional leaders and was expelled from the Whig\n" +
                        "party in 1841.\n" +
                        "[48] \"Biography of James Polk\" (http://www.whitehouse.gov/about/presidents/jamespolk/). Whitehouse.gov. March 12, 2007. . Retrieved\n" +
                        "January 12, 2009.\n" +
                        "[49] \"The Eleventh President: 1845–1849 James Knox Polk \"The Dark Horse\"\" (http://www.americanheritage.com/people/presidents/\n" +
                        "polk_james.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[50] \"James Polk – Democratic Party – 11th President – American Presidents\" (http://www.history.com/presidents/polk). History. . Retrieved\n" +
                        "January 12 2009.\n" +
                        "[51] \"James K. Polk (November 2, 1795 – June 15, 1849)\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=11).\n" +
                        "American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[52] \"Biography of Zachary Tyler\" (http://www.whitehouse.gov/about/presidents/zacharytaylor/). Whitehouse.gov. March 12, 2007. .\n" +
                        "Retrieved January 12, 2009.\n" +
                        "[53] \"The Twelfth President: 1849–1850 Zachary Taylor \"Old Rough-and-Ready\"\" (http://www.americanheritage.com/people/presidents/\n" +
                        "taylor_zachary.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[54] \"Zachary Taylor – WHIG Party – 12th President – American Presidents\" (http://www.history.com/presidents/taylor). History. .\n" +
                        "Retrieved January 12 2009.\n" +
                        "List of Presidents of the United States 9\n" +
                        "[55] \"Zachary Taylor (November 24, 1784 – July 9, 1850)\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=12).\n" +
                        "American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[56] \"Biography of Millard Fillmore\" (http://www.whitehouse.gov/about/presidents/millardfillmore/). Whitehouse.gov. March 12, 2007. .\n" +
                        "Retrieved January 12, 2009.\n" +
                        "[57] \"The Thirteenth President: 1850–1853 Millard Fillmore \"Forgotten Leader\"\" (http://www.americanheritage.com/people/presidents/\n" +
                        "fillmore_millard.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[58] \"Millard Filmore – WHIG Party – 13th President – American Presidents\" (http://www.history.com/presidents/fillmore). History. .\n" +
                        "Retrieved January 12 2009.\n" +
                        "[59] \"Millard Fillmore (January 7, 1800 – March 8, 1874)\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=13).\n" +
                        "American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[60] \"Biography of Franklin Pierce\" (http://www.whitehouse.gov/about/presidents/franklinpierce/). Whitehouse.gov. March 12, 2007. .\n" +
                        "Retrieved January 12, 2009.\n" +
                        "[61] \"The Fourteenth President: 1853–1857 Franklin Pierce \"Overwhelmed by Events\"\" (http://www.americanheritage.com/people/\n" +
                        "presidents/fillmore_millard.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[62] \"Franklin Pierce – Democratic Party – 14th President – American Presidents\" (http://www.history.com/presidents/pierce). History. .\n" +
                        "Retrieved January 12 2009.\n" +
                        "[63] \"Franklin Pierce (November 23, 1804 – October 8, 1869)\" (http://americanpresidents.org/presidents/president.\n" +
                        "asp?PresidentNumber=14). American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[64] \"Biography of James Buchanan\" (http://www.whitehouse.gov/about/presidents/jamesbuchanan/). Whitehouse.gov. March 12, 2007. .\n" +
                        "Retrieved January 12, 2009.\n" +
                        "[65] \"The Fifteenth President: 1857–1861 James Buchanan \"An American Hero\"\" (http://www.americanheritage.com/people/presidents/\n" +
                        "buchanan_james.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[66] \"James Buchanan – Democratic Party – 15th President – American Presidents\" (http://www.history.com/presidents/buchanan). History.\n" +
                        ". Retrieved January 12 2009.\n" +
                        "[67] \"James Buchanan (April 23, 1791 – June 1, 1868)\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=15).\n" +
                        "American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[68] \"Biography of Abraham Lincoln\" (http://www.whitehouse.gov/about/presidents/abrahamlincoln/). Whitehouse.gov. March 12, 2007. .\n" +
                        "Retrieved January 12, 2009.\n" +
                        "[69] \"The Sixteenth President: 1861–1865 Abraham Lincoln \"The Great Emancipator\"\" (http://www.americanheritage.com/people/\n" +
                        "presidents/lincoln_abraham.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[70] \"Abraham Lincoln – Republic, National Union Party – 16th President – American Presidents\" (http://www.history.com/presidents/\n" +
                        "lincoln). History. . Retrieved January 12 2009.\n" +
                        "[71] \"Abraham Lincoln (February 12, 1809 – April 15, 1865)\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=16).\n" +
                        "American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[72] Assassinated.\n" +
                        "[73] Abraham Lincoln and Andrew Johnson were, respectively, a Republican and a Democrat who ran on the National Union ticket in 1864.\n" +
                        "[74] \"Biography of Andrew Johnson\" (http://www.whitehouse.gov/about/presidents/andrewjohnson/). Whitehouse.gov. March 12, 2007. .\n" +
                        "Retrieved January 12, 2009.\n" +
                        "[75] \"The Seventeenth President: 1865–1869 Andrew Johnson \"Between North and South\"\" (http://www.americanheritage.com/people/\n" +
                        "presidents/johnson_andrew.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[76] \"Andrew Johnson – National Union Party – 17th President – American Presidents\" (http://www.history.com/presidents/andrewjohnson).\n" +
                        "History. . Retrieved January 12 2009.\n" +
                        "[77] \"Andrew Johnson (December 29, 1808 – July 31, 1875)\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=17).\n" +
                        "American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[78] Andrew Johnson did not identify with the two main parties while president and tried and failed to build a party of loyalists under the\n" +
                        "National Union label. His failure to build a true National Union Party made Johnson without a party.\n" +
                        "[79] \"Biography of Ulysses S. Grant\" (http://www.whitehouse.gov/about/presidents/ulyssessgrant/). Whitehouse.gov. March 12, 2007. .\n" +
                        "Retrieved January 12, 2009.\n" +
                        "[80] \"The Eighteenth President: 1869–1877 Ulysses Simpson Grant \"The Hero as Politician\"\" (http://www.americanheritage.com/people/\n" +
                        "presidents/grant_ulysses.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[81] \"Ulysses S. Grant – National Union Party – 18th President – American Presidents\" (http://www.history.com/presidents/grant). History. .\n" +
                        "Retrieved January 12 2009.\n" +
                        "[82] \"Ulysses S. Grant (April 27, 1822 – July 23, 1885)\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=18).\n" +
                        "American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[83] \"Biography of Rutherford B. Hayes\" (http://www.whitehouse.gov/about/presidents/rutherfordbhayes/). Whitehouse.gov. March 12,\n" +
                        "2007. . Retrieved January 12, 2009.\n" +
                        "[84] \"The Nineteenth President: 1877–1881 Rutherford Birchard Hayes \"Striving For A Fresh Start\"\" (http://www.americanheritage.com/\n" +
                        "people/presidents/hayes_rutherford.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "List of Presidents of the United States 10\n" +
                        "[85] \"Rutherford B. Hayes – Republican Party – 19th President – American Presidents\" (http://www.history.com/presidents/hayes). History. .\n" +
                        "Retrieved January 12 2009.\n" +
                        "[86] \"Rutherford B. Hayes (October 4, 1822 – January 17, 1893)\" (http://americanpresidents.org/presidents/president.\n" +
                        "asp?PresidentNumber=19). American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[87] \"Biography of James Garfield\" (http://www.whitehouse.gov/about/presidents/jamesgarfield/). Whitehouse.gov. March 12, 2007. .\n" +
                        "Retrieved January 12, 2009.\n" +
                        "[88] \"The Twentieth President: 1881–1881 James Abram Garfield \"The Preacher\"\" (http://www.americanheritage.com/people/presidents/\n" +
                        "garfield_james.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[89] \"James Garfield – Republican Party – 20th President – American Presidents\" (http://www.history.com/presidents/garfield). History. .\n" +
                        "Retrieved January 12 2009.\n" +
                        "[90] \"James A. Garfield (November 19, 1831 – September 19, 1881)\" (http://americanpresidents.org/presidents/president.\n" +
                        "asp?PresidentNumber=20). American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[91] \"Biography of Chester Arthur\" (http://www.whitehouse.gov/about/presidents/chesterarthur/). Whitehouse.gov. March 12, 2007. .\n" +
                        "Retrieved January 12, 2009.\n" +
                        "[92] \"The Twenty-First President: 1881–1885 Chester Alan Arthur \"The Self-Reformer\"\" (http://www.americanheritage.com/people/\n" +
                        "presidents/garfield_james.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[93] \"Chester A. Arthur – Republican Party – 21st President – American Presidents\" (http://www.history.com/presidents/arthur). History. .\n" +
                        "Retrieved January 12 2009.\n" +
                        "[94] \"Chester A. Arthur (October 5, 1829 – November 18, 1886)\" (http://americanpresidents.org/presidents/president.\n" +
                        "asp?PresidentNumber=21). American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[95] \"Biography of Grover Cleveland\" (http://www.whitehouse.gov/about/presidents/grovercleveland/). Whitehouse.gov. March 12, 2007. .\n" +
                        "Retrieved January 12, 2009.\n" +
                        "[96] \"The Twenty-Second President: 1885–1889 The Twenty-Fourth President: 1893–1897 Grover Cleveland \"The Law Man\"\" (http://www.\n" +
                        "americanheritage.com/people/presidents/cleveland_grover.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[97] \"Grover Cleveland – Democratic Party – 22nd and 24th President – American Presidents\" (http://www.history.com/presidents/\n" +
                        "cleveland). History. . Retrieved January 12 2009.\n" +
                        "[98] \"Grover Cleveland (March 18, 1837 – June 24, 1908)\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=22).\n" +
                        "American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[99] \"Biography of Benjamin Harrison\" (http://www.whitehouse.gov/about/presidents/benjaminharrison/). Whitehouse.gov. March 12,\n" +
                        "2007. . Retrieved January 12, 2009.\n" +
                        "[100] \"The Twenty-Third President: 1889–1893 Benjamin Harrison \"Presidential Grandson\"\" (http://www.americanheritage.com/people/\n" +
                        "presidents/cleveland_grover.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[101] \"William Henry Harrison – Whig Party – 23rd President – American Presidents\" (http://www.history.com/presidents/\n" +
                        "benjaminharrison). History. . Retrieved January 12 2009.\n" +
                        "[102] \"Benjamin Harrison (August 20, 1833 – March 13, 1901)\" (http://americanpresidents.org/presidents/president.\n" +
                        "asp?PresidentNumber=23). American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[103] \"Biography of William McKinley\" (http://www.whitehouse.gov/about/presidents/williammckinley/). Whitehouse.gov. March 12,\n" +
                        "2007. . Retrieved January 12, 2009.\n" +
                        "[104] \"The Twenty-Fifth President: 1897–1901 William McKinley \"Bridge to a New Century\"\" (http://www.americanheritage.com/people/\n" +
                        "presidents/mckinley_william.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[105] \"William McKinley – Republican Party – 25th President – American Presidents\" (http://www.history.com/presidents/mckinley).\n" +
                        "History. . Retrieved January 12 2009.\n" +
                        "[106] \"William McKinley (January 29, 1843 – September 14, 1901)\" (http://americanpresidents.org/presidents/president.\n" +
                        "asp?PresidentNumber=24). American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[107] \"Biography of Theodore Roosevelt\" (http://www.whitehouse.gov/about/presidents/theodoreroosevelt/). Whitehouse.gov. March 12,\n" +
                        "2007. . Retrieved January 12, 2009.\n" +
                        "[108] \"The Twenty-Sixth President: 1901–1909 Theodore Roosevelt \"The Giant in the Bully Pulpit\"\" (http://www.americanheritage.com/\n" +
                        "people/presidents/roosevelt_theodore.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[109] \"Theodore Roosevelt – Republican, Bull Moose Party – 26th President – American Presidents\" (http://www.history.com/presidents/\n" +
                        "teddyroosevelt). History. . Retrieved January 12 2009.\n" +
                        "[110] \"Theodore Roosevelt (October 27, 1858 – January 6, 1919)\" (http://americanpresidents.org/presidents/president.\n" +
                        "asp?PresidentNumber=25). American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[111] \"Biography of William Howard Taft\" (http://www.whitehouse.gov/about/presidents/williamhowardtaft/). Whitehouse.gov. March 13,\n" +
                        "2007. . Retrieved January 12, 2009.\n" +
                        "[112] \"The Twenty-Seventh President: 1909–1913 William Howard Taft \"Reluctant Leader\"\" (http://www.americanheritage.com/people/\n" +
                        "presidents/taft_william.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[113] \"William Howard Taft – Republican Party – 27th President – American Presidents\" (http://www.history.com/presidents/taft). History. .\n" +
                        "Retrieved January 12 2009.\n" +
                        "List of Presidents of the United States 11\n" +
                        "[114] \"William Howard Taft (September 15, 1857 – March 8, 1930)\" (http://americanpresidents.org/presidents/president.\n" +
                        "asp?PresidentNumber=26). American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[115] \"Biography of Woodrow Wilson\" (http://www.whitehouse.gov/about/presidents/woodrowwilson/). Whitehouse.gov. March 13, 2007.\n" +
                        ". Retrieved January 12, 2009.\n" +
                        "[116] \"The Twenty-Eighth President: 1913–1921 Woodrow Wilson \"Prophet Without Honor\"\" (http://www.americanheritage.com/people/\n" +
                        "presidents/wilson_woodrow.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[117] \"Woodrow Wilson – Democratic Party – 28th President – American Presidents\" (http://www.history.com/presidents/wilson). History. .\n" +
                        "Retrieved January 12 2009.\n" +
                        "[118] \"Woodrow Wilson (December 28, 1856 – February 3, 1924)\" (http://americanpresidents.org/presidents/president.\n" +
                        "asp?PresidentNumber=27). American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[119] \"Biography of Warren G. Harding\" (http://www.whitehouse.gov/about/presidents/warrenharding/). Whitehouse.gov. March 12, 2007.\n" +
                        ". Retrieved January 12, 2009.\n" +
                        "[120] \"The Twenty-Ninth President: 1921–1923 Warren Gamaliel Harding \"Prophet Without Honor\"\" (http://www.americanheritage.com/\n" +
                        "people/presidents/harding_warren.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[121] \"Warren Harding – Republican Party – 29th President – American Presidents\" (http://www.history.com/presidents/wilson). History. .\n" +
                        "Retrieved January 12 2009.\n" +
                        "[122] \"Warren G. Harding (November 2, 1865 – August 2, 1923)\" (http://americanpresidents.org/presidents/president.\n" +
                        "asp?PresidentNumber=28). American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[123] \"Biography of Calvin Coolidge\" (http://www.whitehouse.gov/about/presidents/calvincoolidge/). Whitehouse.gov. March 13, 2007. .\n" +
                        "Retrieved January 12, 2009.\n" +
                        "[124] \"The Thirtieth President: 1923–1929 Calvin Coolidge \"The New Englander\"\" (http://www.americanheritage.com/people/presidents/\n" +
                        "coolidge_calvin.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[125] \"Calvin Coolidge – Republican Party – 30th President – American Presidents\" (http://www.history.com/presidents/wilson). History. .\n" +
                        "Retrieved January 12 2009.\n" +
                        "[126] \"Calvin Coolidge (July 4, 1872 – January 5, 1933)\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=29).\n" +
                        "American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[127] \"Biography of Herbert Hoover\" (http://www.whitehouse.gov/about/presidents/herberthoover/). Whitehouse.gov. March 13, 2007. .\n" +
                        "Retrieved January 12, 2009.\n" +
                        "[128] \"The Thirty-First President: 1929–1933 Herbert Clark Hoover \"The Great Engineer\"\" (http://www.americanheritage.com/people/\n" +
                        "presidents/hoover_herbert.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[129] \"Herbert Hoover – Republican Party – 31st President – American Presidents\" (http://www.history.com/presidents/wilson). History. .\n" +
                        "Retrieved January 12 2009.\n" +
                        "[130] \"Herbert Hoover (August 10, 1874 – October 20, 1964)\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=30).\n" +
                        "American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[131] \"Biography of Franklin D. Roosevelt\" (http://www.whitehouse.gov/about/presidents/franklindroosevelt/). Whitehouse.gov. March 20,\n" +
                        "2007. . Retrieved January 12, 2009.\n" +
                        "[132] \"The Thirty-Second President: 1933–1945 Franklin Delano Roosevelt \"New Dealer and Global Warrior\"\" (http://www.americanheritage.\n" +
                        "com/people/presidents/roosevelt_franklin.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[133] \"Franklin D. Roosevelt – Democratic Party – 32nd President – American Presidents\" (http://www.history.com/presidents/fdr). History.\n" +
                        ". Retrieved January 12 2009.\n" +
                        "[134] \"Franklin D. Roosevelt (January 30, 1882 – April 12, 1945)\" (http://americanpresidents.org/presidents/president.\n" +
                        "asp?PresidentNumber=31). American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[135] This term was shortened by 43 days due to the Twentieth Amendment to the United States Constitution going into effect, moving\n" +
                        "inauguration day from March 4 to January 20.\n" +
                        "[136] \"Biography of Harry S Truman\" (http://www.whitehouse.gov/about/presidents/harrystruman/). Whitehouse.gov. March 12, 2007. .\n" +
                        "Retrieved January 12, 2009.\n" +
                        "[137] \"The Thirty-Third President: 1945–1953 Harry S. Truman \"The Buck Stopped Here\"\" (http://www.americanheritage.com/people/\n" +
                        "presidents/truman_harry.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[138] \"Harry S. Truman – Democratic Party – 33rd President – American Presidents\" (http://www.history.com/presidents/fdr). History. .\n" +
                        "Retrieved January 12 2009.\n" +
                        "[139] \"Harry S. Truman (May 8, 1884 – December 26, 1972)\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=32).\n" +
                        "American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[140] \"Biography of Dwight D. Eisenhower\" (http://www.whitehouse.gov/about/presidents/dwightdeisenhower/). Whitehouse.gov. March\n" +
                        "12, 2007. . Retrieved January 12, 2009.\n" +
                        "[141] \"The Thirty-Fourth President: 1953–1961 Dwight David Eisenhower \"I Like Ike\"\" (http://www.americanheritage.com/people/\n" +
                        "presidents/eisenhower_dwight.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[142] \"Dwight D. Eisenhower – Democratic Party – 34th President – American Presidents\" (http://www.history.com/presidents/eisenhower).\n" +
                        "History. . Retrieved January 12 2009.\n" +
                        "List of Presidents of the United States 12\n" +
                        "[143] \"Dwight D. Eisenhower (October 14, 1890 – March 28, 1969)\" (http://americanpresidents.org/presidents/president.\n" +
                        "asp?PresidentNumber=33). American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[144] \"Biography of John F. Kennedy\" (http://www.whitehouse.gov/about/presidents/johnfkennedy/). Whitehouse.gov. March 12, 2007. .\n" +
                        "Retrieved January 12, 2009.\n" +
                        "[145] \"The Thirty-Five President: 1961–1963 John Fitzgerald Kennedy \"Inspiring A Generation\"\" (http://www.americanheritage.com/people/\n" +
                        "presidents/kennedy_john.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[146] \"John F. Kennedy – Democratic Party – 35th President – American Presidents\" (http://www.history.com/presidents/kennedy). History.\n" +
                        ". Retrieved January 12 2009.\n" +
                        "[147] \"John F. Kennedy (May 29, 1917 – November 22, 1963)\" (http://americanpresidents.org/presidents/president.\n" +
                        "asp?PresidentNumber=34). American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[148] \"Biography of Lyndon B. Johnson\" (http://www.whitehouse.gov/about/presidents/lyndonjohnson/). Whitehouse.gov. March 12, 2007.\n" +
                        ". Retrieved January 12, 2009.\n" +
                        "[149] \"The Thirty-Sixth President: 1963–1969 Lyndon Baines Johnson \"So Close To Greatness\"\" (http://www.americanheritage.com/people/\n" +
                        "presidents/johnson_lyndon.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[150] \"Lyndon B. Johnson – Democratic Party – 36th President – American Presidents\" (http://www.history.com/presidents/kennedy).\n" +
                        "History. . Retrieved January 12 2009.\n" +
                        "[151] \"Lyndon B. Johnson (August 27, 1908 – January 22, 1973)\" (http://americanpresidents.org/presidents/president.\n" +
                        "asp?PresidentNumber=35). American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[152] \"Richard M. Nixon\" (http://www.whitehouse.gov/about/presidents/richardnixon/). Whitehouse.gov. March 12, 2007. . Retrieved\n" +
                        "January 12, 2009.\n" +
                        "[153] \"The Thirty-Seventh President: 1969–1974 Richard Milhous Nixon \"The Road to Watergate\"\" (http://www.americanheritage.com/\n" +
                        "people/presidents/nixon_richard.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[154] \"Richard Nixon – Republican Party – 37th President – American Presidents\" (http://www.history.com/presidents/nixon). History. .\n" +
                        "Retrieved January 12 2009.\n" +
                        "[155] \"Richard M. Nixon (January 9, 1913 – April 22, 1994)\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=36).\n" +
                        "American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[156] \"Biography of Gerald R. Ford\" (http://www.whitehouse.gov/about/presidents/geraldford/). Whitehouse.gov. March 12, 2007. .\n" +
                        "Retrieved January 12, 2009.\n" +
                        "[157] \"The Thirty-Eighth President: 1974–1977 Gerald Rudolph Ford \"A Time for Healing\"\" (http://www.americanheritage.com/people/\n" +
                        "presidents/ford_gerald.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[158] \"Gerald Ford – Republican Party – 38th President – American Presidents\" (http://www.history.com/presidents/ford). History. .\n" +
                        "Retrieved January 12 2009.\n" +
                        "[159] \"Gerald R. Ford (July 14, 1913 – December 26, 2006)\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=37).\n" +
                        "American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[160] \"Biography of Jimmy Carter\" (http://www.whitehouse.gov/about/presidents/jimmycarter). Whitehouse.gov. March 12, 2007. .\n" +
                        "Retrieved January 12, 2009.\n" +
                        "[161] \"The Thirty-Ninth President: 1977–1981 James Earl Carter \"Not a Politician\"\" (http://www.americanheritage.com/people/presidents/\n" +
                        "carter_jimmy.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[162] \"Jimmy Carter – Democratic Party – 39th President – American Presidents\" (http://www.history.com/presidents/ford). History. .\n" +
                        "Retrieved January 12 2009.\n" +
                        "[163] \"Jimmy Carter (October 1, 1924 – )\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=38). American\n" +
                        "Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[164] \"Biography of Ronald Reagan\" (http://www.whitehouse.gov/about/presidents/ronaldreagan/). Whitehouse.gov. June 25, 2008. .\n" +
                        "Retrieved January 12, 2009.\n" +
                        "[165] \"The Fortieth President: 1981–1989 Ronald Wilson Reagan \"The Great Communicator\"\" (http://www.americanheritage.com/people/\n" +
                        "presidents/reagan_ronald.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[166] \"Ronald Reagan – Republican Party – 40th President – American Presidents\" (http://www.history.com/presidents/ford). History. .\n" +
                        "Retrieved January 12 2009.\n" +
                        "[167] \"Ronald Reagan (February 6, 1911 – June 5, 2004)\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=39).\n" +
                        "American Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[168] \"Biography of George Herbert Walker Bush\" (http://www.whitehouse.gov/about/presidents/georgehwbush/). Whitehouse.gov. March\n" +
                        "12, 2007. . Retrieved January 12, 2009.\n" +
                        "[169] \"The Forty-First President: 1989–1993 George Herbert Walker Bush \"The Last Cold Warrior\"\" (http://www.americanheritage.com/\n" +
                        "people/presidents/bush_george_sr.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[170] \"George H. W. Bush – Republican Party – 41st President – American Presidents\" (http://www.history.com/presidents/georgebush).\n" +
                        "History. . Retrieved January 12 2009.\n" +
                        "[171] \"George Bush (June 12, 1924 – )\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=40). American Presidents:\n" +
                        "Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "List of Presidents of the United States 13\n" +
                        "[172] \"Biography of William J. Clinton\" (http://www.whitehouse.gov/about/presidents/williamjclinton/). Whitehouse.gov. March 12, 2007. .\n" +
                        "Retrieved January 12, 2009.\n" +
                        "[173] \"The Forty-Second President: 1993–2001 William Jefferson Clinton \"Prosperity And Turmoil\"\" (http://www.americanheritage.com/\n" +
                        "people/presidents/clinton_bill.shtml). American Heritage. Forbes. . Retrieved January 12, 2009.\n" +
                        "[174] \"Bill Clinton – Democratic Party – 42nd President – American Presidents\" (http://www.history.com/presidents/billclinton). History. .\n" +
                        "Retrieved January 12 2009.\n" +
                        "[175] \"Bill Clinton (August 19, 1946 – )\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=41). American\n" +
                        "Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[176] \"Biography of President George W. Bush\" (http://www.whitehouse.gov/about/presidents/georgewbush/). Whitehouse.gov. February\n" +
                        "25, 2007. . Retrieved January 12, 2009.\n" +
                        "[177] \"The Forty-Third President: 2001–2009 George Walker Bush\" (http://www.americanheritage.com/people/presidents/bush_george_jr.\n" +
                        "shtml). American Heritage. Forbes. . Retrieved October 2, 2009.\n" +
                        "[178] \"George W. Bush – Republican Party – 43rd President – American Presidents\" (http://www.history.com/presidents/georgewbush).\n" +
                        "History. . Retrieved January 12 2009.\n" +
                        "[179] \"George W. Bush (July 6, 1946 – )\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=42). American\n" +
                        "Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[180] \"President Barack Obama\" (http://www.whitehouse.gov/administration/president_obama/). Whitehouse.gov. January 20, 2009. .\n" +
                        "Retrieved January 20, 2009.\n" +
                        "[181] \"The Forty-Fourth President: 2009–present Barack Hussein Obama II\" (http://www.americanheritage.com/people/presidents/\n" +
                        "obama_barack.shtml). American Heritage. Forbes. . Retrieved October 2, 2009.\n" +
                        "[182] \"Barack Obama – Democratic Party – 44th President – American Presidents\" (http://www.history.com/presidents/obama). History. .\n" +
                        "Retrieved January 12 2009.\n" +
                        "[183] \"Barack Obama (August 4, 1961 – )\" (http://americanpresidents.org/presidents/president.asp?PresidentNumber=43). American\n" +
                        "Presidents: Life Portrait. C-SPAN. . Retrieved January 12, 2009.\n" +
                        "[184] http://www.whitehouse.gov/about/presidents/\n" +
                        "[185] http://www.americanheritage.com/people/presidents/\n" +
                        "[186] http://www.history.com/genericContent.do?id=53504\n" +
                        "[187] http://www.americanpresidents.org/\n" +
                        "[188] http://www.gvsu.edu/hauenstein/\n" +
                        "[189] http://www.ipl.org/div/potus/\n" +
                        "Article Sources and Contributors 14\n" +
                        "Article Sources and Contributors\n" +
                        "List of Presidents of the United States  Source: http://en.wikipedia.org/w/index.php?oldid=365504271  Contributors: 031586, 1.21 jigwatts, 123karamcg, 2008Olympian, 32iomb, 4wajzkd02,\n" +
                        "ASDFGH, Aaron Brenneman, Abomasnow, Academic Challenger, Acalamari, Ace ETP, Acps110, Adashiel, Addaick, AegeeChan, Aerrow2012, Aflaksp, Ahoerstemeier, Ai.kefu, Alansohn,\n" +
                        "Alex Bakharev, AlexStef, AlexandrDmitri, Alexdkawa, Alexf, Algont, AllynJ, Alphachimp, Alsandro, Amalthea, AmateurEditor, Andrewlp1991, Andrewrp, Androu, Andy M. Wang,\n" +
                        "Andy120290, Anetode, Anger22, Angstxxi, Angusmclellan, AnimeNinjaGurl, Anna512, Anoopan, Antandrus, Anti-wijki, Antodav2007, Anythingyouwant, Aqwis, Arakunem, Arctic.gnome,\n" +
                        "Ardric47, ArielGold, Armyrifle9, ArturoWu, Artyom, Ashnard, Asmeurer, Astrofreak92, AuburnPilot, Aude, Avala, Axeman89, Bacons, BaronLarf, Baronnet, Baseball Bugs, Bballshaq32,\n" +
                        "Bearman1, Beckagirl, Beleszólok, Ben76266, Bender235, Betacommand, BilboR10108, Bjarki S, Bjkijkjr83, Bkonrad, Blackdeath610, Blanchardb, Blipadouzi, Blubberboy92, Bob Lored,\n" +
                        "Bob35671485, Bobak, Bobblewik, Bobjane, Bobo192, Bomac, Bongwarrior, Boo1210, Bookworm415, Bradeos Graphon, Brian0918, Bsadowski1, Bssc81, Bulldog24, Bullshark44, Bullytr,\n" +
                        "Burlow, Burnettski92, Butwhatdoiknow, CBDunkerson, CFLeon, CGrapes429, CIreland, CR85747, Caiaffa, Cakedamber, CameronPG, Camw, Can't sleep, clown will eat me, Canderson7,\n" +
                        "CapitalR, Caponer, Captain-tucker, Cartoon Boy, Cartoonbook, Catgut, Cayleigh, Cburnett, Ccady, Cedrus-Libani, Cekli829, Cenarium, Cfsenel, Chiapet22025, Chilo guy, Chochopk,\n" +
                        "Cholmes75, ChrisWerner, ChrisfromHouston, Chrishomingtang, Chzz, Ciphergoth, Circeus, Circumspect, Click23, Coffee and TV, ColinFine, Colonies Chris, Cometstyles, CommonsDelinker,\n" +
                        "Conman33, Connubius, Cooleymd, Coolhandscot, CrazyC83, Crazycomputers, Cridel, Crusoe8181, Cswarren52, Cubs Fan, Cubs0110, Cyberchair, DLJessup, DMacks, Daa89563, Dabomb87,\n" +
                        "Damifb, Daniel Benfield, Daniel Case, Daniel the duck, Danny, Dantadd, Darkvampire900, Darkwind, Dasterdalydoofus, DaveJA, Davewild, Dayewalker, Dbenbenn, Dcsohl, Debresser, Delldot,\n" +
                        "Deluxe489, Dems on the move, DerHexer, Designdroide, DewiMorgan, DickRogersPhd, Diligent Terrier, Dipasqualem, Discospinster, Djacolatse, Djjar, Dknights411, Docherty64, Docu,\n" +
                        "Doledri70, Dominic, Dominus tenebrarum, Donald Duck, Dougofborg, Doulos Christos, Download, Dr.Strawberry, Dr.bEastman, Driger369, Drmccann, Drmies, Drv.fast, Dsmdgold, Dyjodee,\n" +
                        "EWS23, Easter Monkey, Ecuatt, EdJohnston, Edgar181, Edison, Eeekster, Eggsofamerica, Eightball, Eino81, Either way, ElJefe, Eliz81, Ellomate, Elonka, Eluchil404, Entheta, Epbr123, Eric323,\n" +
                        "Erik9, ErnestoDave, Erxnmedia, Etcher, Evangelion9490, Everyking, Evildevil, Exucmember, Fabrictramp, Falcon8765, Fan-1967, Faradayplank, Fconaway, Fenoloftaleina, Fergiferg123,\n" +
                        "FiggyBee, Fillanfloppy, Firehawk4, Flamebird, Flameshockey99, Frazzle, Fred Bradstadt, Freedomlinux, Freemarket, FreplySpang, Frostyservant, Fruehdom, Frutti di Mare, Furado, Fys, GB fan,\n" +
                        "Gadget850, GageSkidmore, Gaianauta, Gail, Gaius Cornelius, Gary King, Ged UK, GeeAlice, Gencraft, GeneRayburn, Geneb1955, GeorgeOne, Geraldk, Gerrish, Gilliam, Gindo, Glen,\n" +
                        "Glenncando, Gobi2, Gogo Dodo, Golbez, Gopherbone, Gorillasapiens, Gower2352, Granpuff, Greswik, Grsz11, Gurch, Gwernol, Gzkn, H2ppyme, Haipa Doragon, Hairy Dude, Hallpriest9,\n" +
                        "Hamilton365, Hank P. Wimbleton, Hapsala, Hazel77, Hda3ku, HereToHelp, Hersfold, Herzliyya, HexaChord, Hmains, Hnsampat, Hraefen, Huadpe, Human4321, Huntthetroll, Iamwisesun,\n" +
                        "Ianmark123, Ibagli, Iced Kola, Idunno271828, Illinois2011, ImperatorExercitus, InSTAALed, IndepAmerican, Infrogmation, Insanity Incarnate, Insomniacpuppy, Iridescent, Irishfighter01, It Is\n" +
                        "Me Here, Itsmacko, Iwiwiwiwiwiw, Ixfd64, IzzyKraus, J.delanoy, JLM, JNW, JRH95, Jaberwockynmt, Jac16888, Jack Cox, Jack324, Jakkyboi, Jaksmata, James Michael 1, Jaobenl, Jaquel4,\n" +
                        "Jason Calzone, Jason Palpatine, JasonCNJ, Jatkins, JayJasper, Jaydec, Jayron32, Jcuz9, Jcware, Jdavidb, Jdubowsky, Jedravent, JeffTL, Jeffq, Jengod, Jerkov, Jerky Chid, Jerzy, Jessec78,\n" +
                        "Jessemv, Jester boy, Jfruh, Jiang, Jimmy Slade, Jj2315, Jnestorius, John Kenney, John Reaves, JohnC, Johnmomplaisir, Jojhutton, Jon Harald Søby, Jordan117, Josemanimala, Joseph Solis in\n" +
                        "Australia, Jossi, Jpal55, Jscrbf1989, Jshrimp3, Jsphkann, Jtkiefer, JuJube, Juliancolton, JulieADriver, KAZAAM, KCToker, Kaaveh Ahangar, Kaleal92, Katalaveno, Kaysov, Kedrowsk,\n" +
                        "Kelapstick, KellyRoche, Kerotan, Kertrats, Kevin B12, KibblesNbigglens, King of Hearts, Kingboyk, Kinneyboy90, Kitia, KnowledgeOfSelf, Knowpedia, Koavf, Kraftlos, KrakatoaKatie,\n" +
                        "Kralizec!, Kribbeh, Kross, Krungadoren, Kubigula, Kumioko, Kungfuadam, Kyle Barbour, KyuuA4, La Pianista, Landon1980, Laurenk, Le Hibou, LedRush, Leifern, Leo144e, Leuko, Levineps,\n" +
                        "Libs23, Lid, LightSpectra, Likestomessthingsup, LilRoddy, Lilkiz95, Lindsayoris15, LinguistAtLarge, Lion King, Litefantastic, LizardJr8, Lord Solar, Lost on belmont, Lowkeynyc, Lucky 6.9,\n" +
                        "Luk, M M, MBK004, MER-C, MVShady, MZMcBride, Mabuhelwa, MacGyverMagic, Machete, Madchester, Magicmage, Magnum Serpentine, Magnus Bakken, Maher27777, Majorly,\n" +
                        "MantisEars, Marc Kupper, Marcusmax, Marek69, MarkSweep, Markles, Martin451, Martinp23, Master Spartan Chief, Mateo SA, Mathismoney332, Matterfoot, Matthewedwards, MattieTK,\n" +
                        "Mattvargo, Maximillion Pegasus, McSly, Mcmillin24, Mcshorty8, MediaMangler, Melsaran, Memmem, MetsRockMySock13, MiG, Micah Fox, Microxkairi, Miguel1626, Mike-Kerkhoven,\n" +
                        "Mikecapson, Mikiemike, Mild Bill Hiccup, Millertime12, Millionsandbillions, Miniwildebeest, Miquonranger03, Miranche, Missbeehaven07, Mitch Ames, Mitrius, Mizing, Mjriley933, Mm40,\n" +
                        "Mnmazur, Modernist, Modocc, Moe Epsilon, Moeszys, Mohamed Osama AlNagdy, Moneyshea, Moondigger, Moriori, Mr. Prez, Mr. Unknown, Mr.Z-man, MrChupon, MrDolomite,\n" +
                        "Mrmaroon25, Mrsiegelman, Mufka, Mythdon, Mário, N5iln, NXTguru, Nagharim, NailPuppy, NapHit, Natl1, NawlinWiki, Neddyseagoon, Neelix, NeoJustin, NerdyScienceDude, Netalarm,\n" +
                        "NewEnglandYankee, Newportm, Newyorkbrad, NicAgent, Niceley, Nickydmag, Nightstallion, Nik42, Nishkid64, NoSeptember, Noclador, Noeticsage, Notchcode, Notclive, Nricardo,\n" +
                        "NuclearWarfare, Nutmeg13, OCNative, OLEF641, ONUnicorn, Obi-WanKenobi-2005, Ohconfucius, Oldboozer, Oliphaunt, Orlady, Oxymoron83, PCHS-NJROTC, PFHLai, Paddu, Paleowiki,\n" +
                        "Parkjunwung, Patfan100, Patrick, Paul August, Pavlo Shevelo, Pdaley90, Perklax, Phaedrus84, Pharos, Pheobs03, PhilaDubliner, Philip Trueman, Piledhigheranddeeper, Pilotguy,\n" +
                        "PimpPartyToday, Pineapplething, Pinkadelica, Pixel23, Plau, Player47e, Plumber, Pmanderson, Poison the Well, Pol098, Polpo, Pootling, Porsche997SBS, Pparazorback, PrinceLionheart,\n" +
                        "Princesslucky105, Prolog, Protege11210, Provine, Punkbassist31, Puppet125, Pyrrhus16, Qc, Quadell, Quebron, QueenofBattle, Qwertysoup, RAKtheUndead, RJASE1, RJaguar3, RPlunk2853,\n" +
                        "Raafael, Rab777hp, Rama's Arrow, Rambo's Revenge, Rami R, RandomCritic, RaseaC, Ravikiran r, Raymondwinn, Red rawker, Redvers, RetiredUser2, RexNL, Reywas92, Rhatsa26X, Riana,\n" +
                        "Riblankman, Rich Farmbrough, Richard75, Richi, Rjaw87, Rjd0060, Rklahn, Rkt2312, Rmcollins, Robert Skyhawk, Roddickfan, Rogsheng, Romeisburning, Ronhjones, Rougher07, Rp4us,\n" +
                        "Rreagan007, Rrius, Ryan12094, S62, SBKT, SGGH, SJSA, SPSSeano, ST47, Saberwolf116, Sam, Samir, Samoro, Sampo Torgo, Sandmanra, Sandstein, Sango123, Saqib, Sardanaphalus,\n" +
                        "Sargcullen1, Saturday, SaveFairy, Scaife, Scapler, Scetoaux, Schaengel89, Schoop, ScottAHudson, Sean.Roach, Search4Lancer, Seatdistrict, Seattle Skier, Sebastian scha., Senator Palpatine,\n" +
                        "Sethisodd, Shadow2700, Shadowjams, Shamshir Shikargar, Shanel, Shaq4evr, Shea DM, Shivam183, Shiwsup, Shotwell, Sikander III, SilverBull, SimpsonDG, Sintonak.X, Sjc07, Skier Dude,\n" +
                        "Skittle, Skyemoor, Slarre, Slayer92, SmokeyBojangles4, Smooth O, SoWhy, Socal gal at heart, Soleado, Sophitus, SparrowsWing, Spiffy sperry, SpuriousQ, SqueakBox, Srushe, Staxringold,\n" +
                        "Steveozone, Str1977, Subdolous, Sujeylee, Supersexyspacemonkey, Supremeknowledge, Svengalistark, Swarm, Synchronism, TFOWR, TJPortico, TUF-KAT, Tad Lincoln, Tangeman22, Tangus\n" +
                        "Magnificus, Tanthalas39, Tanweer Morshed, TarmoK, Tbone2001, Ted87, TedE, Tedder, TenohHaruka, Terence, Teryx, Tgann, Thatguyflint, Thatoneguyuknow, Thbraith, The Cool Kat, The\n" +
                        "Mystery Man, The Obento Musubi, The One Cause, The One Muse, The Real G-Rod, The Sartorialist, The Thing That Should Not Be, The editor1, TheBigDogMan, TheCodeman4, TheGerm,\n" +
                        "TheKMan, TheScurvyEye, Thebeyondsection, Thegoodlocust, Thehelpfulone, Thestorm115, Thingg, Thisisborin9, Thivierr, Thomas81, Thuresson, Thylacinus cynocephalus, Tide rolls,\n" +
                        "Timrollpickering, Tiptoety, Titoxd, Tktktk, Tktru, Tkynerd, Tom, Tomdatom, Tony1, Tony360X, Toohool, Toon05, Tox, Toya, Tpbradbury, Trak360, TreasuryTag, Trusilver, Tslocum, Turteeth,\n" +
                        "Tuspm, Two-face Jackie, Tycho, UBeR, Udonknome, Uga Man, Ulric1313, Unschool, UpstateNYer, Useight, User86654, V Brian Zurita, VanGerhart, Vary, Venomviper, Ventusa, Veracious\n" +
                        "Rey, Verrai, VerruckteDan, Versus22, Victor Victoria, Viridian, Voice of All, WadeSimMiser, Waggers, Wahkeenah, Wangyunfeng, Washedinblack, Websterkntz7, Welsh, Weregerbil,\n" +
                        "Wertuose, Westermarck, What!?Why?Who?, WhizKid462, Whouk, Wiikipedian, WikiKouken, WikiLeon, WikiXan, Wikipedical, WildCowboy, Will Beback, William S. Saturn, William Saturn,\n" +
                        "Willking1979, Willwal, Willylovescars, Wingsandsword, Wknight94, Xanzzibar, Xargque, Xxhopingtearsxx, Xxmarthexx, Yachtsman1, Yamamoto Ichiro, Yamla, Yellowluis, Yest94, Yezn0r,\n" +
                        "Yungmike513, Z1216, Zarel, Zeneky, Zepefixer2, Zereshk, Zone46, Zyid, Zzyzx11, 月のワルツ, 1294 anonymous edits\n" +
                        "Image Sources, Licenses and Contributors\n" +
                        "File:WhiteHouseSouthFacade.JPG  Source: http://en.wikipedia.org/w/index.php?title=File:WhiteHouseSouthFacade.JPG  License: Creative Commons Attribution-Sharealike 3.0  Contributors:\n" +
                        "User:UpstateNYer\n" +
                        "File:Washington (3).jpg  Source: http://en.wikipedia.org/w/index.php?title=File:Washington_(3).jpg  License: unknown  Contributors: BrokenSegue, Docu, Evrik, Frank C. Müller, Hailey C.\n" +
                        "Shannon, LeonWeber, Nonenmac, Scewing, Sparkit, Tom, 3 anonymous edits\n" +
                        "File:Adamstrumbull.jpg  Source: http://en.wikipedia.org/w/index.php?title=File:Adamstrumbull.jpg  License: unknown  Contributors: Infrogmation, Postdlf, Scewing, The Evil Spartan\n" +
                        "File:tj3.gif  Source: http://en.wikipedia.org/w/index.php?title=File:Tj3.gif  License: Public Domain  Contributors: Mike-Kerkhoven, WTCA, William Henry Harrison, 1 anonymous edits\n" +
                        "File:James Madison.jpg  Source: http://en.wikipedia.org/w/index.php?title=File:James_Madison.jpg  License: unknown  Contributors: John Vanderlyn (1775–1852)\n" +
                        "File:jm5.gif  Source: http://en.wikipedia.org/w/index.php?title=File:Jm5.gif  License: unknown  Contributors: Deaconse, Guarniz, Mike-Kerkhoven, Scewing, William Henry Harrison\n" +
                        "File:Ja6.gif  Source: http://en.wikipedia.org/w/index.php?title=File:Ja6.gif  License: Public Domain  Contributors: Herbythyme, Libs23, Mike-Kerkhoven, Scewing, 1 anonymous edits\n" +
                        "File:Andrew jackson head.gif  Source: http://en.wikipedia.org/w/index.php?title=File:Andrew_jackson_head.gif  License: Public Domain  Contributors: ?\n" +
                        "File:mb8.gif  Source: http://en.wikipedia.org/w/index.php?title=File:Mb8.gif  License: Public Domain  Contributors: Mike-Kerkhoven, Scewing, WTCA, William Henry Harrison\n" +
                        "File:wh9.gif  Source: http://en.wikipedia.org/w/index.php?title=File:Wh9.gif  License: Public Domain  Contributors: Unknown\n" +
                        "File:WHOportTyler.jpg  Source: http://en.wikipedia.org/w/index.php?title=File:WHOportTyler.jpg  License: Public Domain  Contributors: AnnaKucsma, Bubamara, Docu, GearedBull,\n" +
                        "Scewing, TCY\n" +
                        "File:Jp11.gif  Source: http://en.wikipedia.org/w/index.php?title=File:Jp11.gif  License: Public Domain  Contributors: Bubamara, Libs23, Mike-Kerkhoven, Scewing\n" +
                        "File:Zachary Taylor 2.jpg  Source: http://en.wikipedia.org/w/index.php?title=File:Zachary_Taylor_2.jpg  License: Creative Commons Attribution 2.0  Contributors: Cliff1066 (fotografía de) Oil\n" +
                        "on Canvas of James Reid Lambdin\n" +
                        "File:Millard Fillmore.gif  Source: http://en.wikipedia.org/w/index.php?title=File:Millard_Fillmore.gif  License: Public Domain  Contributors: Docu, Mike-Kerkhoven, Scewing, Scooter\n" +
                        "File:美国总统皮尔斯.gif  Source: http://en.wikipedia.org/w/index.php?title=File:美国总统皮尔斯.gif  License: GNU Free Documentation License  Contributors: Maksim, Mike-Kerkhoven,\n" +
                        "Scewing, UV\n" +
                        "Image Sources, Licenses and Contributors 15\n" +
                        "File:Jb15.gif  Source: http://en.wikipedia.org/w/index.php?title=File:Jb15.gif  License: Public Domain  Contributors: Libs23, Mike-Kerkhoven\n" +
                        "File:al16.jpg  Source: http://en.wikipedia.org/w/index.php?title=File:Al16.jpg  License: Public Domain  Contributors: Docu, Scewing, William Henry Harrison, 5 anonymous edits\n" +
                        "File:aj17.gif  Source: http://en.wikipedia.org/w/index.php?title=File:Aj17.gif  License: Public Domain  Contributors: Mike-Kerkhoven, WTCA, William Henry Harrison\n" +
                        "File:ug18.gif  Source: http://en.wikipedia.org/w/index.php?title=File:Ug18.gif  License: Public Domain  Contributors: User:Cmguy777\n" +
                        "File:Rhayes.png  Source: http://en.wikipedia.org/w/index.php?title=File:Rhayes.png  License: Public Domain  Contributors: User:Coburnpharr04\n" +
                        "File:James Garfield portrait.jpg  Source: http://en.wikipedia.org/w/index.php?title=File:James_Garfield_portrait.jpg  License: Public Domain  Contributors: US Federal Government\n" +
                        "File:ca21.gif  Source: http://en.wikipedia.org/w/index.php?title=File:Ca21.gif  License: Public Domain  Contributors: Asarlaí, Infrogmation, Kürschner, Mike-Kerkhoven, Väsk, William Henry\n" +
                        "Harrison\n" +
                        "File:Grover Cleveland portrait2.jpg  Source: http://en.wikipedia.org/w/index.php?title=File:Grover_Cleveland_portrait2.jpg  License: Public Domain  Contributors: Jonathan Eastman Johnson\n" +
                        "File:Bharrison.PNG  Source: http://en.wikipedia.org/w/index.php?title=File:Bharrison.PNG  License: Public Domain  Contributors: Eastman Johnson\n" +
                        "File:Grover Cleveland, painting by Anders Zorn.jpg  Source: http://en.wikipedia.org/w/index.php?title=File:Grover_Cleveland,_painting_by_Anders_Zorn.jpg  License: unknown\n" +
                        "Contributors: AndreasPraefcke, Bubamara, Get It, 1 anonymous edits\n" +
                        "File:wm25.gif  Source: http://en.wikipedia.org/w/index.php?title=File:Wm25.gif  License: Public Domain  Contributors: EurekaLott, Mike-Kerkhoven, William Henry Harrison\n" +
                        "File:TRSargent.jpg  Source: http://en.wikipedia.org/w/index.php?title=File:TRSargent.jpg  License: unknown  Contributors: John Singer Sargent\n" +
                        "File:TaftOfficial Portrait.jpg  Source: http://en.wikipedia.org/w/index.php?title=File:TaftOfficial_Portrait.jpg  License: Public Domain  Contributors: Bubamara, GearedBull, Infrogmation,\n" +
                        "J.delanoy, Jappalang, MichaelPhilip, TCY, 1 anonymous edits\n" +
                        "File:ww28.gif  Source: http://en.wikipedia.org/w/index.php?title=File:Ww28.gif  License: Public Domain  Contributors: DanTD, Deadstar, Mike-Kerkhoven, William Henry Harrison\n" +
                        "File:wh29.gif  Source: http://en.wikipedia.org/w/index.php?title=File:Wh29.gif  License: Public Domain  Contributors: Infrogmation, Mike-Kerkhoven, William Henry Harrison\n" +
                        "File:CoolidgeWHPortrait.gif  Source: http://en.wikipedia.org/w/index.php?title=File:CoolidgeWHPortrait.gif  License: Public Domain  Contributors: Coemgenus, Kallerna, Mike-Kerkhoven,\n" +
                        "Tom, 1 anonymous edits\n" +
                        "File:Hhover.gif  Source: http://en.wikipedia.org/w/index.php?title=File:Hhover.gif  License: Public Domain  Contributors: Evrik, Fred J, Jiang, Kalki, Mike-Kerkhoven, Pfctdayelise, Tom, Väsk\n" +
                        "File:Fdrpics.gif  Source: http://en.wikipedia.org/w/index.php?title=File:Fdrpics.gif  License: Public Domain  Contributors: Frank O. Salisbury\n" +
                        "File:HarryTruman.jpg  Source: http://en.wikipedia.org/w/index.php?title=File:HarryTruman.jpg  License: Public Domain  Contributors: Greta Kempton\n" +
                        "File:Dwight D. Eisenhower, official Presidential portrait.jpg  Source: http://en.wikipedia.org/w/index.php?title=File:Dwight_D._Eisenhower,_official_Presidential_portrait.jpg  License:\n" +
                        "Public Domain  Contributors: White House\n" +
                        "File:John F Kennedy Official Portrait.jpg  Source: http://en.wikipedia.org/w/index.php?title=File:John_F_Kennedy_Official_Portrait.jpg  License: Public Domain  Contributors: Gonzo\n" +
                        "fan2007, Infrogmation, Jatkins, Mike-Kerkhoven, Robfergusonjr, TCY, The Wiki Octopus, 8 anonymous edits\n" +
                        "File:Lyndon B. Johnson - portrait.gif  Source: http://en.wikipedia.org/w/index.php?title=File:Lyndon_B._Johnson_-_portrait.gif  License: Public Domain  Contributors: Evrik, Fred J, Helix84,\n" +
                        "Infrogmation, Jiang, Lupo, Mike-Kerkhoven, Pfctdayelise, Slarre, Tom, 1 anonymous edits\n" +
                        "File:rn37.gif  Source: http://en.wikipedia.org/w/index.php?title=File:Rn37.gif  License: Public Domain  Contributors: Mike-Kerkhoven, Nagy, Tom, William Henry Harrison, 5 anonymous edits\n" +
                        "File:Gerald R. Ford - portrait.jpg  Source: http://en.wikipedia.org/w/index.php?title=File:Gerald_R._Ford_-_portrait.jpg  License: Public Domain  Contributors: Everett Raymond Kinstler,\n" +
                        "whitehouse.gov\n" +
                        "File:James E. Carter - portrait.gif  Source: http://en.wikipedia.org/w/index.php?title=File:James_E._Carter_-_portrait.gif  License: Public Domain  Contributors: Common Good, Edward,\n" +
                        "Helix84, Mike-Kerkhoven, Slarre, TCY\n" +
                        "File:REAGANWH.jpg  Source: http://en.wikipedia.org/w/index.php?title=File:REAGANWH.jpg  License: Public Domain  Contributors: User:Cirt\n" +
                        "File:George_H._W._Bush_-_portrait_by_Herbert_Abrams_(1994).jpg  Source:\n" +
                        "http://en.wikipedia.org/w/index.php?title=File:George_H._W._Bush_-_portrait_by_Herbert_Abrams_(1994).jpg  License: Public Domain  Contributors: Billinghurst, BrokenSphere, Docu, Evrik,\n" +
                        "Fred J, Helix84, Ilse@, Jiang, Pfctdayelise, Scewing, Singapore1, Slarre, TCY, Tom, 1 anonymous edits\n" +
                        "File:Clinton.jpg  Source: http://en.wikipedia.org/w/index.php?title=File:Clinton.jpg  License: Public Domain  Contributors: Portrait painted by Simmie Knox\n" +
                        "File:Official painting of George W. Bush.jpg  Source: http://en.wikipedia.org/w/index.php?title=File:Official_painting_of_George_W._Bush.jpg  License: Public Domain  Contributors: Portrait\n" +
                        "painted by Mark Carder\n" +
                        "File:Official portrait of Barack Obama.jpg  Source: http://en.wikipedia.org/w/index.php?title=File:Official_portrait_of_Barack_Obama.jpg  License: Attribution  Contributors: Pete Souza, The\n" +
                        "Obama-Biden Transition Project\n" +
                        "License\n" +
                        "Creative Commons Attribution-Share Alike 3.0 Unported\n" +
                        "http://creativecommons.org/licenses/by-sa/3.0/";

        TextMatcher textMatcher = new TextMatcher();
        text = textMatcher.breakLineDelete(text);
        List<String> matches = textMatcher.matcherListing(text);
        ParserTool parserTool = new ParserTool();
        List<Date> dates = new ArrayList<Date>();
        dates = parserTool.parseListStrToListDate(matches);
        Collections.sort(dates);
        Map<Date, Integer> map = new LinkedHashMap<Date, Integer>();
        for (Date date : dates) {
            map.put(date, Collections.frequency(dates, date));
        }

        List<DateItem> dateItems = new ArrayList<DateItem>();
        Date dateItem;
        for (Map.Entry<Date, Integer> mapentry : map.entrySet()) {
            dateItem = mapentry.getKey();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateItem);
            dateItems.add(new DateItem(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH), mapentry.getValue()));
        }
        for (DateItem item : dateItems) {

            System.out.println(item.getYear() + " " + item.getMonth() + " " + item.getDay() + " " + item.getQty());

        }

    }
}



