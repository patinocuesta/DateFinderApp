import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {


    public static void main(String[] args) {


        String text =
                "1\n" +
                        "Chicago Citation Style:\n" +
                        "Footnotes and Bibliography\n" +
                        "Last updated: September 10, 2010\n" +
                        "The Politics Department has adopted the Chicago citation format for footnotes in academic\n" +
                        "papers. The Chicago citation style is the method established by the University of Chicago Press\n" +
                        "for documenting sources used in a research paper and is probably the most commonly used\n" +
                        "footnote format. Below are instructions for using footnotes to cite most of the sources\n" +
                        "encountered in undergraduate research. It is a good idea to read through these instructions before\n" +
                        "beginning to write your paper. Please note that footnotes are so-named because they appear at the\n" +
                        "bottom of the page that contains the text you are annotating. Endnotes follow the same citation\n" +
                        "style, but are listed together at the end of the paper before the bibliography. Only use endnotes at\n" +
                        "the specific request of the instructor; use footnotes otherwise.\n" +
                        "For additional information or for instructions on proper citing of sources not covered below,\n" +
                        "please see one of these books, or a more recent edition:\n" +
                        "University of Chicago Press. The Chicago Manual of Style. 15th ed. Chicago: Univ. of Chicago Press,\n" +
                        "2003.\n" +
                        "Hacker, Diana. A Pocket Style Manual. 5\n" +
                        "th ed. Boston: Bedford/St. Martin’s, 2009.\n" +
                        "Or, for an online version:\n" +
                        "http://www.chicagomanualofstyle.org/tools_citationguide.html\n" +
                        "Or this document on the Ohio State University library website:\n" +
                        "http://library.osu.edu/sites/guides/chicagogd.php\n" +
                        "General Guidelines:\n" +
                        "\uF0B7 Your footnotes should be numbered consecutively throughout the paper. Use your word\n" +
                        "processing program to insert footnotes and it will number them for you automatically.\n" +
                        "\uF0B7 The footnote number should always be inserted after the punctuation.\n" +
                        "1\n" +
                        "\uF0B7 The first time you cite a source, you will include a full citation. For all subsequent\n" +
                        "references to that text, your footnote citation will be in abbreviated form. (More detail\n" +
                        "below.)\n" +
                        "\uF0B7 Cite authors’ names as they appear in the texts. Don’t replace first names with initials\n" +
                        "unless the names appear this way on the title page of the source. If no author is listed,\n" +
                        "organize the entry by the title.\n" +
                        "\n" +
                        "1 Like that.\n" +
                        "2\n" +
                        "Books: Single Author\n" +
                        "Footnote\n" +
                        "Basic format:\n" +
                        "x. Author’s first name Last name, Title in Italics and in Headline Style (City of Publication: Publisher,\n" +
                        "Year), page number if relevant.\n" +
                        "Subsequent references to the same text:\n" +
                        "x. Last name, Title in Shortened Form, page number.\n" +
                        "Note: If your second reference to a text comes immediately after the first, use\n" +
                        "“Ibid.” in place of the author’s name and the book title. Include the page number\n" +
                        "if it is different from that listed in the first reference.\n" +
                        "Examples:\n" +
                        "1. Kent Portney, Taking Sustainable Cities Seriously (Cambridge: MIT Press, 2003).\n" +
                        "2. Ibid., 162.\n" +
                        "3. David Harvey, The Condition of Postmodernity: An Enquiry Into the Origins of Cultural Change (New\n" +
                        "York: Blackwell, 1989), 197.\n" +
                        "4. Robert O. Self, American Babylon: Race and the Struggle for Postwar Oakland (Princeton: Princeton\n" +
                        "Univ. Press, 2003).\n" +
                        "5. Harvey, The Condition of Postmodernity, 86-87.\n" +
                        "Note: The second, third and fifth footnotes above cite direct quotes or material\n" +
                        "found on one or more specific pages, therefore the page numbers of the source are\n" +
                        "included.\n" +
                        "Bibliography\n" +
                        "Basic format:\n" +
                        "Author’s last name, First name. Title. City: Publisher, Year.\n" +
                        "Examples:\n" +
                        "References\n" +
                        "Harvey, David. The Condition of Postmodernity: An Enquiry Into the Origins of Cultural Change. New\n" +
                        "York: Blackwell, 1989.\n" +
                        "Portney, Kent. Taking Sustainable Cities Seriously. Cambridge, MIT Press, 2003.\n" +
                        "Self, Robert O. American Babylon: Race and the Struggle for Postwar Oakland. Princeton: Princeton\n" +
                        "Univ. Press, 2003.\n" +
                        "3\n" +
                        "Books: Multiple Authors\n" +
                        "Footnote\n" +
                        "For two or three authors, list each of the authors in the order presented on the title\n" +
                        "page of the book. For more than three authors, list the first author’s name\n" +
                        "followed by “and others” or “et al.”:\n" +
                        "x. First name Last name and First name Last Name, Title (City: Publisher, Date), page number if\n" +
                        "relevant.\n" +
                        "x. First name Last name et al., Title (City: Publisher, Date), page number if relevant.\n" +
                        "Subsequent references to the same text:\n" +
                        "x. Last name and Last name, Title, page number.\n" +
                        "x. Last name et al., Title, page number.\n" +
                        "Examples:\n" +
                        "1. Harriet Bulkeley and Michele M. Betsill, Cities and Climate Change: Urban Sustainability and Global\n" +
                        "Environmental Governance (London: Routledge, 2003), 25.\n" +
                        "2. Randall Arendt et al., Growing Greener: Putting Conservation into Local Plans and Ordinances\n" +
                        "(Washington, DC: Island Press, 1999).\n" +
                        "3. Bulkeley and Betsill, Cities and Climate Change, 27.\n" +
                        "4. Arendt et al., Growing Greener.\n" +
                        "Bibliography\n" +
                        "Basic format:\n" +
                        "Last name, First name, and First name Last name. Title. City: Publisher, Year.\n" +
                        "Examples:\n" +
                        "References\n" +
                        "Arendt, Randall, Holly Harper, Stephen Kuter, and Diane Rosencrance. Growing Greener: Putting\n" +
                        "Conservation into Local Plans and Ordinances. Washington, DC: Island Press, 1999.\n" +
                        "Bulkeley, Harriet, and Michele M. Betsill. Cities and Climate Change: Urban Sustainability and Global\n" +
                        "Environmental Governance. London: Routledge, 2003.\n" +
                        "Note: In contrast to footnotes, bibliographic citations for works with four or more\n" +
                        "authors should include the names of all authors. See the Arendt entry above.\n" +
                        "Books: Edited Volume or Chapter Within an Edited Volume\n" +
                        "Footnote\n" +
                        "Occasionally you will need to cite an edited book containing chapters by various\n" +
                        "authors. If citing the overarching idea of the entire book, use the editors’ names as\n" +
                        "you would the names of authors, following their names with “ed.” (short for \n" +
                        "4\n" +
                        "editor, not to be mistaken for the abbreviation of “edition”). Works with a\n" +
                        "translator (trans.) or a compiler (comp.) would be treated similarly.\n" +
                        "Basic format:\n" +
                        "x. Editor’s First name Last name, ed., Title (City: Publisher, Year), page number if relevant.\n" +
                        "Example:\n" +
                        "1. Warren Magnusson and Karena Shaw, eds., A Political Space: Reading the Global Through Clayoquot\n" +
                        "Sound (Minneapolis: Univ. of Minnesota Press, 2003).\n" +
                        "Subsequent references to the same text:\n" +
                        "2. Magnusson and Shaw, eds. A Political Space.\n" +
                        "More frequently, you will cite a particular essay or chapter in an edited book. In\n" +
                        "this case your footnote will refer to the specific chapter or essay but will also\n" +
                        "include the title of the book and its editors. The format is as follows:\n" +
                        "x. Author’s First name Last name, “Chapter Title,” in Book Title, ed. Editor’s name (City: Publisher, Year),\n" +
                        "page number if relevant.\n" +
                        "Subsequent references to the same text:\n" +
                        "x. Last name, Chapter Title, page number.\n" +
                        "Examples:\n" +
                        "3. Timothy W. Luke, “On the Political Economy of Clayoquot Sound,” in A Political Space: Reading the\n" +
                        "Global Through Clayoquot Sound, ed. Warren Magnusson and Karena Shaw (Minneapolis: Univ. of\n" +
                        "Minnesota Press, 2003), 99.\n" +
                        "4. Luke, “On the Political Economy of Clayoquot Sound,” 101.\n" +
                        "Bibliography\n" +
                        "Basic format:\n" +
                        "Editor’s Last name, First name, ed. Title. City: Publisher, Year.\n" +
                        "Or:\n" +
                        "Author’s Last name, First name. “Chapter Title.” In Book Title, edited by Editor’s Name, page numbers of\n" +
                        "chapter. City: Publisher, Year.\n" +
                        "Examples:\n" +
                        "5\n" +
                        "References\n" +
                        "Luke, Timothy W. “On the Political Economy of Clayoquot Sound.” In A Political Space: Reading the\n" +
                        "Global Through Clayoquot Sound, edited by Warren Magnusson and Karena Shaw, 91-112.\n" +
                        "Minneapolis: Univ. of Minnesota Press, 2003.\n" +
                        "Magnusson, Warren and Karena Shaw, eds. A Political Space: Reading the Global Through Clayoquot\n" +
                        "Sound. Minneapolis: Univ. of Minnesota Press, 2003.\n" +
                        "Books: Multiple Editions\n" +
                        "Footnote\n" +
                        "Include the edition number after the title, not italicized:\n" +
                        "x. First name Last name, Title, Number ed. (City, Publisher, Year), page number if relevant.\n" +
                        "Subsequent references to the same text:\n" +
                        "x. Last name, Title, page number.\n" +
                        "Examples:\n" +
                        "1. Michael E. Kraft, Environmental Policy and Politics, 4th ed. (New York: Pearson, 2007).\n" +
                        "2. Kraft, Environmental Policy and Politics, 54.\n" +
                        "Bibliography\n" +
                        "Basic format:\n" +
                        "Last name, First name. Title. Number ed. City: Publisher, Year.\n" +
                        "Example:\n" +
                        "References\n" +
                        "Kraft, Michael E. Environmental Policy and Politics. 4th ed. New York: Pearson, 2007.\n" +
                        "Journal Articles\n" +
                        "Footnote\n" +
                        "Basic format:\n" +
                        "x. Author’s First name Last name, “Article Title,” Journal Title Volume, Issue No. (Year): page number.\n" +
                        "Subsequent references to the same text:\n" +
                        "x. Last name, “Article Title,” page number.\n" +
                        "Examples:\n" +
                        "6\n" +
                        "1. Keith Dowding, “Explaining Urban Regimes,” International Journal of Urban and Regional Research\n" +
                        "25, no. 1 (2001): 12.\n" +
                        "2. Marina Alberti, “Measuring Urban Sustainability,” Environmental Impact Assessment Review, 1996,\n" +
                        "no. 16: 390.\n" +
                        "3. Roger Keil, “Globalization Makes States: Perspectives of Local Governance in the Age of the World\n" +
                        "City,” Review of International Political Economy 5, no. 4 (1998): 617.\n" +
                        "4. Alberti, “Measuring Urban Sustainability,” 391.\n" +
                        "Note: As in the Alberti example above, if the year serves as the volume number, it\n" +
                        "should not be in parentheses.\n" +
                        "Bibliography\n" +
                        "Basic format:\n" +
                        "Last name, First name. “Article Title.” Journal Title Volume, Issue no. (Year): page range.\n" +
                        "Examples:\n" +
                        "References\n" +
                        "Alberti, Marina. “Measuring Urban Sustainability.” Environmental Impact Assessment Review, 1996,\n" +
                        "no.16: 381-424.\n" +
                        "Dowding, Keith. “Explaining Urban Regimes.” International Journal of Urban and Regional Research 25,\n" +
                        "no. 1 (2001): 7-19.\n" +
                        "Keil, Roger. “Globalization Makes States: Perspectives of Local Governance in the Age of the World\n" +
                        "City.” Review of International Political Economy 5, no. 4 (1998): 616–646.\n" +
                        "Web Sources\n" +
                        "Note: Not all information available on the internet should be considered a valid\n" +
                        "source for academic research. Use common sense in deciding what internet sites\n" +
                        "to include in your research. For example, wikipedia.org is generally not\n" +
                        "considered an appropriate source of information for an academic paper. If you are\n" +
                        "unsure if a site is appropriate, check with your professor or TA.\n" +
                        "Footnote\n" +
                        "If an online source is also a print source (a journal or newspaper article, etc.) or\n" +
                        "has a clear online publishing date (such as online news sources), footnote it in the\n" +
                        "same way as you would footnote the source if it were in print, adding the URL\n" +
                        "and access date if the information is time sensitive:\n" +
                        "x. Author’s First name Last name, “Article Title,” Web Site Title. Sponsor, Original publication Month Day,\n" +
                        "Year, URL. (accessed Month Day, Year).\n" +
                        "If citing an entire website, include the title of the site, the name of the sponsoring\n" +
                        "organization, the publication date or date of latest update (if available), URL, and\n" +
                        "access date if time sensitive.\n" +
                        "x. Author’s First name Last name, Web Site Title, URL (accessed Month Day, Year).\n" +
                        "7\n" +
                        "Examples:\n" +
                        "1. Keith Schneider, “Salt Lake City is Finding a Payoff in Conservation,” New York Times, November 7,\n" +
                        "2007, http://www.nytimes.com/2007/11/07/business/businessspecial3/07cities.html (accessed November\n" +
                        "14, 2007).\n" +
                        "2. Seattle Chamber of Commerce, Seattle Metronatural, http://www.visitseattle.org/bureau/brand.asp\n" +
                        "(accessed Mar. 16, 2008).\n" +
                        "Bibliography\n" +
                        "Basic Format:\n" +
                        "Last name, First name. “Article Title.” Web Site Title. Sponsor, Original publication Month Day, Year.\n" +
                        "URL. (accessed Month Day, Year).\n" +
                        "Or:\n" +
                        "Last name, First name. Web Site Title. URL. (accessed Month Day, Year).\n" +
                        "Examples:\n" +
                        "References\n" +
                        "Schneider, Keith. “Salt Lake City is Finding a Payoff in Conservation.” New York Times, November 7,\n" +
                        "2007. http://www.nytimes.com/2007/11/07/business/businessspecial3/07cities.html (accessed\n" +
                        "November 14, 2007).\n" +
                        "Seattle Chamber of Commerce. Seattle Metronatural. http://www.visitseattle.org/bureau/brand.asp\n" +
                        "(accessed Mar. 16, 2008).\n" +
                        "Class Lectures\n" +
                        "Footnote\n" +
                        "Class lectures should only be cited in papers written for the course in which that\n" +
                        "lecture was given.\n" +
                        "Example:\n" +
                        "1. Lecture, Sept. 26, 2006.\n" +
                        "Bibliography\n" +
                        "No bibliography entry is needed.\n" +
                        "Course Readers\n" +
                        "Most material in your course readers was originally published as a journal article,\n" +
                        "newspaper article, or book chapter. It should therefore be cited as such.\n" +
                        "8\n" +
                        "Magazine Articles\n" +
                        "Footnote\n" +
                        "Cite as you would a book, with the author’s name (if available) followed by the\n" +
                        "title and date. For weekly or bi-weekly magazines, give the exact date (month\n" +
                        "day, year). For monthly or bi-monthly magazines, just the month(s) is sufficient.\n" +
                        "Include page numbers only if noting a direct quote (as in example 2 below).\n" +
                        "Magazines should be cited by publication date, even if a volume number is\n" +
                        "provided.\n" +
                        "Basic format:\n" +
                        "x. Author’s First name Last name, “Article Title,” Magazine Title, Month Day, Year, page number if\n" +
                        "relevant.\n" +
                        "Subsequent references to the same text:\n" +
                        "x. Last name, “Article Title,” page number if relevant.\n" +
                        "Examples:\n" +
                        "1. “Dubious Venture,” Time, Jan. 3, 1994.\n" +
                        "2. James Fallows, “The Early-Decision Racket,” Atlantic Monthly, Sept. 2001, 37-52.\n" +
                        "Bibliography\n" +
                        "Basic format:\n" +
                        "Last name, First name. “Article Title.” Magazine Title, Month Day, Year, page range.\n" +
                        "Examples:\n" +
                        "References\n" +
                        "“Dubious Venture.” Time, Jan. 3, 1994, 64-65.\n" +
                        "Fallows, James. “The Early-Decision Racket.” Atlantic Monthly, Sept. 2001, 37-52.\n" +
                        "Newspaper Articles\n" +
                        "Footnote\n" +
                        "A footnote for a newspaper article should include: Name of author (if known);\n" +
                        "title of the article, month, day and year of publication; the edition (final, West\n" +
                        "Coast, etc.) if available; the section if in print or the URL if found online. You can\n" +
                        "omit page numbers.\n" +
                        "Basic format:\n" +
                        "x. Last name, First name, “Article Title,” Newspaper Title, Month Day, Year, edition, section.\n" +
                        "9\n" +
                        "Or:\n" +
                        "x. Last name, First name, “Article Title,” Newspaper Title, Original publication Month Day, Year, URL.\n" +
                        "Subsequent references to the same text:\n" +
                        "x. Last name, “Article Title,” Date.\n" +
                        "Examples:\n" +
                        "1. Kevin Sack, “In Partisan Battle, Governors Clash with Attorneys General over Lawsuits,” New York\n" +
                        "Times, Mar. 28, 2010, late edition, sec. A.\n" +
                        "2. Keith Schneider, “Salt Lake City is Finding a Payoff in Conservation,” New York Times, November 7,\n" +
                        "2007, http://www.nytimes.com/2007/11/07/business/businessspecial3/07cities.html (accessed November\n" +
                        "14, 2007).\n" +
                        "Bibliography\n" +
                        "Basic format:\n" +
                        "Last name, First name. “Article Title.” Newspaper Title, Month Day, Year, section.\n" +
                        "If accessed online, replace the section with the URL.\n" +
                        "Examples:\n" +
                        "References\n" +
                        "Sack, Kevin. “In Partisan Battle, Governors Clash with Attorneys General over Lawsuits.” New York\n" +
                        "Times, Mar. 28, 2010, late edition, sec. A.\n" +
                        "Schneider, Keith. “Salt Lake City is Finding a Payoff in Conservation.” New York Times, November 7,\n" +
                        "2007, http://www.nytimes.com/2007/11/07/business/businessspecial3/07cities.html.\n" +
                        "Interviews\n" +
                        "Footnote\n" +
                        "Regardless of the form of the interview, your footnote should begin with the name\n" +
                        "of the person interviewed. Anonymous interviews can be cited as such, with\n" +
                        "general information regarding the interviewee. Published interviews should\n" +
                        "include the full citation of where the interview was found (for instance, in a book\n" +
                        "or on the radio). In examples 2 and 3 below, it is assumed that you (the author)\n" +
                        "conducted the interviews.\n" +
                        "Examples:\n" +
                        "1. Donald E. Felsinger, “Turning Energy Uncertainty into Opportunity,” interview by Clifford Krauss. New\n" +
                        "York Times, May 3, 2008, late edition, sec. C.\n" +
                        "2. George Smith, e-mail message to author, March 17, 2008.\n" +
                        "3. Interview with Congressional aide, February 9, 2008.\n" +
                        "10\n" +
                        "Bibliography\n" +
                        "If you conducted the interview, no bibliography entry is needed. For published or\n" +
                        "broadcast interviews, cite as you would for a book section, newspaper article,\n" +
                        "radio broadcast, etc.\n" +
                        "Examples:\n" +
                        "References\n" +
                        "Fellini, Federico. “The long interview.” Juliet of the Spirits. Edited by Tullio Kezich. Trans. Howard\n" +
                        "Greenfield. New York: Ballantine, 1966. 17-64.\n" +
                        "Felsinger, Donald E. “Turning Energy Uncertainty into Opportunity.” Interview by Clifford Krauss. New\n" +
                        "York Times, May 3, 2008, late edition, sec. C.\n" +
                        "Gordimer, Nadine. Interview. New York Times, Oct. 10, 1991, late edition, sec. C.\n" +
                        "Legal Sources\n" +
                        "Footnote\n" +
                        "Citing constitutions: Cite constitutions by the name, article, section, and\n" +
                        "paragraph (depending on how specific your reference is):\n" +
                        "1. U.S. Constitution, art. 1, sec. 1.\n" +
                        "2. Arizona Constitution, par. 3.\n" +
                        "Citing an act (law): In most cases you can provide all basic information about an\n" +
                        "act (if it is a federal or state law, the title of the act, and the year it was passed) in\n" +
                        "the body of your text and it will therefore not need to be footnoted:\n" +
                        "Congress’s passage of the Aviation and Transportation Security Act of 2001 increased national\n" +
                        "requirements for airport security checks.\n" +
                        "Citing a legal case: As with laws, legal cases should usually be referred to in the\n" +
                        "text of your essay and footnotes are not needed. Names of cases are abbreviated\n" +
                        "by the name of each party involved and should be underlined. The year the case\n" +
                        "was decided is put in parentheses just after the name of the case:\n" +
                        "In Brown v. Board of Education (1954) the Supreme Court rejected the segregation of public schools by\n" +
                        "race.\n" +
                        "Government Publications\n" +
                        "Footnote\n" +
                        "As government documents usually do not have authors, cite them by the name of\n" +
                        "the agency. Otherwise, follow the same rules as for books and journals.\n" +
                        "Provide the following information:\n" +
                        "11\n" +
                        "x. Name of Government, Government Agency, Subsidiary division/regional office/etc., Title of the\n" +
                        "Publication, date, publication number, report number, or Congressional session (if available or relevant),\n" +
                        "Place of Publication: Publisher, Date, page number if relevant.\n" +
                        "Examples:\n" +
                        "1. Department of the Treasury, Internal Revenue Service, 1978 Statistics of Income, Individual Income\n" +
                        "Tax Returns, 1981, Pub. 79 (3-81), Washington, DC: Government Printing Office.\n" +
                        "2. Joint Committee on the Investigation of the Pearl Harbor Attack, Hearings, 1946, 79th Cong., 1st and\n" +
                        "2\n" +
                        "nd sess., Washington, DC: Government Printing Office.\n" +
                        "3. Department of Labor, Bureau of Labor Statistics, A Profile of the Working Poor, 2001, 2003, Report\n" +
                        "968, Washington, DC.\n" +
                        "Note: If the document is printed by the issuing body (as in the Department of\n" +
                        "Labor example above), publisher information is not required.\n" +
                        "Bibliography\n" +
                        "Include all of the information listed above.\n" +
                        "Examples:\n" +
                        "References\n" +
                        "U.S. Congress, Joint Committee on the Investigation of the Pearl Harbor Attack. Hearings. 1946, 79th\n" +
                        "Cong., 1st and 2nd sess., Washington, DC: Government Printing Office.\n" +
                        "U.S. Department of Labor, Bureau of Labor Statistics. A Profile of the Working Poor, 2001. 2003, Report\n" +
                        "968, Washington, DC.\n" +
                        "U.S. Department of the Treasury, Internal Revenue Service. 1978 Statistics of Income, Individual Income\n" +
                        "Tax Returns. 1981, Pub. 79 (3-81), Washington, DC: Government Printing Office.";

        String patternString;
        //Pattern made using https://regexr.com/ as reference
        patternString = "((January|Jan|February|Feb|March|Mar|April|Apr|May|June|Jun|July|Jul|August|Aug|September|Sep|Sept|October|Oct|November|Nov|December|Dec)\\s\\d{1,2}\\W{1,2}\\d{4})" +
                "|(\\d{1,2}\\s(January|Jan|February|Feb|March|Mar|April|Apr|May|June|Jun|July|Jul|August|Aug|September|Sep|Sept|October|Oct|November|Nov|December|Dec)\\s\\d{4})" +
                "|(\\d{1,2}(/|-)\\d{1,2}(/|-)\\d{2,4})" +
                "|(\\d{2,4}(/|-)\\d{1,2}(/|-)\\d{1,2})";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);
        List<String> listStr = new ArrayList();
        while (matcher.find()) {listStr.add(matcher.group());}
        //for (String item :listStr){System.out.println(item);}
        TryParse tryParse = new TryParse();
        List<Date> dates = tryParse.parseListStrToListDate(listStr);
       // for (Date date :dates){System.out.println(date);}
        //Date date = tryParse(matcher.group());
        //System.out.println("found: " + date + " : " + " --> " + matcher.group());
    }

}

