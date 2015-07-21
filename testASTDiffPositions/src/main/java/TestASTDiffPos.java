import com.github.gumtreediff.actions.ActionGenerator;
import com.github.gumtreediff.actions.model.Action;
import com.github.gumtreediff.gen.jdt.JdtTreeGenerator;
import com.github.gumtreediff.matchers.Matcher;
import com.github.gumtreediff.matchers.Matchers;
import com.github.gumtreediff.tree.ITree;

import java.io.IOException;
import java.util.List;

/**
 * Created by michaelhilton on 7/21/15.
 */
public class TestASTDiffPos {

    public static void main(String[] args) {


        ITree beforeTree = null;
        ITree afterTree = null;

        String beforeFileSrc = "/*\n" +
                " * Copyright (c) 2010-2012 Mark Allen.\n" +
                " *\n" +
                " * Permission is hereby granted, free of charge, to any person obtaining a copy\n" +
                " * of this software and associated documentation files (the \"Software\"), to deal\n" +
                " * in the Software without restriction, including without limitation the rights\n" +
                " * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell\n" +
                " * copies of the Software, and to permit persons to whom the Software is\n" +
                " * furnished to do so, subject to the following conditions:\n" +
                " *\n" +
                " * The above copyright notice and this permission notice shall be included in\n" +
                " * all copies or substantial portions of the Software.\n" +
                " *\n" +
                " * THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n" +
                " * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n" +
                " * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n" +
                " * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n" +
                " * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,\n" +
                " * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN\n" +
                " * THE SOFTWARE.\n" +
                " */\n" +
                "\n" +
                "package com.restfb.types;\n" +
                "\n" +
                "import java.io.Serializable;\n" +
                "\n" +
                "import com.restfb.Facebook;\n" +
                "import com.restfb.util.ReflectionUtils;\n" +
                "\n" +
                "/**\n" +
                " * Represents the <a\n" +
                " * href=\"http://developers.facebook.com/docs/reference/api/\">Venue Graph API\n" +
                " * type</a>.\n" +
                " *\n" +
                " * @author <a href=\"http://restfb.com\">Mark Allen</a>\n" +
                " * @since 1.5\n" +
                " */\n" +
                "public class Venue implements Serializable {\n" +
                "\n" +
                "  @Facebook\n" +
                "  private String id;\n" +
                "\n" +
                "  @Facebook\n" +
                "  private String street;\n" +
                "\n" +
                "  @Facebook\n" +
                "  private String city;\n" +
                "\n" +
                "  @Facebook\n" +
                "  private String state;\n" +
                "\n" +
                "  @Facebook\n" +
                "  private String country;\n" +
                "\n" +
                "  @Facebook\n" +
                "  private String zip;\n" +
                "\n" +
                "  @Facebook\n" +
                "  private Double latitude;\n" +
                "\n" +
                "  @Facebook\n" +
                "  private Double longitude;\n" +
                "\n" +
                "  private static final long serialVersionUID = 1L;\n" +
                "\n" +
                "  /**\n" +
                "   * @see java.lang.Object#hashCode()\n" +
                "   */\n" +
                "  @Override\n" +
                "  public int hashCode() {\n" +
                "    return ReflectionUtils.hashCode(this);\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * @see java.lang.Object#equals(java.lang.Object)\n" +
                "   */\n" +
                "  @Override\n" +
                "  public boolean equals(Object that) {\n" +
                "    return ReflectionUtils.equals(this, that);\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * @see java.lang.Object#toString()\n" +
                "   */\n" +
                "  @Override\n" +
                "  public String toString() {\n" +
                "    return ReflectionUtils.toString(this);\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * Facebook id of the venue.\n" +
                "   *\n" +
                "   * @return Facebook id of the venue.\n" +
                "   */\n" +
                "  public String getId() {\n" +
                "    return id;\n" +
                "  }\n" +
                "  \n" +
                "  public void setId(String val) {\n" +
                "    this.id = val;\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * Street address of the venue.\n" +
                "   *\n" +
                "   * @return Street address of the venue.\n" +
                "   */\n" +
                "  public String getStreet() {\n" +
                "    return street;\n" +
                "  }\n" +
                "\n" +
                "  public void setStreet(String val) {\n" +
                "    this.street = val;\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * The venue's city.\n" +
                "   *\n" +
                "   * @return The venue's city.\n" +
                "   */\n" +
                "  public String getCity() {\n" +
                "    return city;\n" +
                "  }\n" +
                "  \n" +
                "  public void setCity(String val) {\n" +
                "      this.city = val;\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * The venue's state.\n" +
                "   *\n" +
                "   * @return The venue's state.\n" +
                "   */\n" +
                "  public String getState() {\n" +
                "    return state;\n" +
                "  }\n" +
                "  \n" +
                "  public void setState(String val) {\n" +
                "      this.state = val;\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * The venue's zip code.\n" +
                "   * \n" +
                "   * @return The venue's zip code.\n" +
                "   */\n" +
                "  public String getZip() {\n" +
                "    return zip;\n" +
                "  }\n" +
                "\n" +
                "  public void setZip(String val) {\n" +
                "    this.zip = val;\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * The venue's country.\n" +
                "   *\n" +
                "   * @return The venue's country.\n" +
                "   */\n" +
                "  public String getCountry() {\n" +
                "    return country;\n" +
                "  }\n" +
                "  \n" +
                "  public void setCountry(String val) {\n" +
                "      this.country = val;\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * The venue's latitude.\n" +
                "   *\n" +
                "   * @return The venue's latitude.\n" +
                "   */\n" +
                "  public Double getLatitude() {\n" +
                "    return latitude;\n" +
                "  }\n" +
                "  \n" +
                "  public void setLatitude(Double val) {\n" +
                "      this.latitude = val;\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * The venue's longitude.\n" +
                "   *\n" +
                "   * @return The venue's longitude.\n" +
                "   */\n" +
                "  public Double getLongitude() {\n" +
                "    return longitude;\n" +
                "  }\n" +
                "  \n" +
                "  public void setLongitude(Double val) {\n" +
                "      this.longitude = val;\n" +
                "  }\n" +
                "\n" +
                "  public void setFrom(Location location) {\n" +
                "\n" +
                "    if (location == null)\n" +
                "        return;\n" +
                "    \n" +
                "    this.latitude = location.getLatitude();\n" +
                "    this.longitude = location.getLongitude();\n" +
                "    this.street = location.getStreet();\n" +
                "    this.city = location.getCity();\n" +
                "    this.state = location.getState();\n" +
                "    this.zip = location.getZip();\n" +
                "    this.country = location.getCountry();\n" +
                "    \n" +
                "  }\n" +
                "\n" +
                "}\n";
        String afterFileSrc = "/*\n" +
                " * Copyright (c) 2010-2012 Mark Allen.\n" +
                " *\n" +
                " * Permission is hereby granted, free of charge, to any person obtaining a copy\n" +
                " * of this software and associated documentation files (the \"Software\"), to deal\n" +
                " * in the Software without restriction, including without limitation the rights\n" +
                " * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell\n" +
                " * copies of the Software, and to permit persons to whom the Software is\n" +
                " * furnished to do so, subject to the following conditions:\n" +
                " *\n" +
                " * The above copyright notice and this permission notice shall be included in\n" +
                " * all copies or substantial portions of the Software.\n" +
                " *\n" +
                " * THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n" +
                " * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n" +
                " * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n" +
                " * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n" +
                " * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,\n" +
                " * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN\n" +
                " * THE SOFTWARE.\n" +
                " */\n" +
                "\n" +
                "package com.restfb.types;\n" +
                "\n" +
                "import java.io.Serializable;\n" +
                "\n" +
                "import com.restfb.Facebook;\n" +
                "import com.restfb.util.ReflectionUtils;\n" +
                "\n" +
                "/**\n" +
                " * Represents the <a\n" +
                " * href=\"http://developers.facebook.com/docs/reference/api/\">Venue Graph API\n" +
                " * type</a>.\n" +
                " *\n" +
                " * @author <a href=\"http://restfb.com\">Mark Allen</a>\n" +
                " * @since 1.5\n" +
                " */\n" +
                "public class Venue implements Serializable {\n" +
                "\n" +
                "  @Facebook\n" +
                "  private String id;\n" +
                "\n" +
                "  @Facebook\n" +
                "  private String street;\n" +
                "\n" +
                "  @Facebook\n" +
                "  private String city;\n" +
                "\n" +
                "  @Facebook\n" +
                "  private String state;\n" +
                "\n" +
                "  @Facebook\n" +
                "  private String country;\n" +
                "\n" +
                "  @Facebook\n" +
                "  private String zip;\n" +
                "\n" +
                "  @Facebook\n" +
                "  private Double latitude;\n" +
                "\n" +
                "  @Facebook\n" +
                "  private Double longitude;\n" +
                "\n" +
                "  private static final long serialVersionUID = 1L;\n" +
                "\n" +
                "  /**\n" +
                "   * @see java.lang.Object#hashCode()\n" +
                "   */\n" +
                "  @Override\n" +
                "  public int hashCode() {\n" +
                "    return ReflectionUtils.hashCode(this);\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * @see java.lang.Object#equals(java.lang.Object)\n" +
                "   */\n" +
                "  @Override\n" +
                "  public boolean equals(Object that) {\n" +
                "    return ReflectionUtils.equals(this, that);\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * @see java.lang.Object#toString()\n" +
                "   */\n" +
                "  @Override\n" +
                "  public String toString() {\n" +
                "    return ReflectionUtils.toString(this);\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * Facebook id of the venue.\n" +
                "   *\n" +
                "   * @return Facebook id of the venue.\n" +
                "   */\n" +
                "  public String getId() {\n" +
                "    return id;\n" +
                "  }\n" +
                "  \n" +
                "  public void setId(String val) {\n" +
                "    this.id = val;\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * Street address of the venue.\n" +
                "   *\n" +
                "   * @return Street address of the venue.\n" +
                "   */\n" +
                "  public String getStreet() {\n" +
                "    return street;\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * The venue's city.\n" +
                "   *\n" +
                "   * @return The venue's city.\n" +
                "   */\n" +
                "  public String getCity() {\n" +
                "    return city;\n" +
                "  }\n" +
                "  \n" +
                "  public void setCity(String val) {\n" +
                "      this.city = val;\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * The venue's state.\n" +
                "   *\n" +
                "   * @return The venue's state.\n" +
                "   */\n" +
                "  public String getState() {\n" +
                "    return state;\n" +
                "  }\n" +
                "  \n" +
                "  public void setState(String val) {\n" +
                "      this.state = val;\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * The venue's zip code.\n" +
                "   * \n" +
                "   * @return The venue's zip code.\n" +
                "   */\n" +
                "  public String getZip() {\n" +
                "    return zip;\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * The venue's country.\n" +
                "   *\n" +
                "   * @return The venue's country.\n" +
                "   */\n" +
                "  public String getCountry() {\n" +
                "    return country;\n" +
                "  }\n" +
                "  \n" +
                "  public void setCountry(String val) {\n" +
                "      this.country = val;\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * The venue's latitude.\n" +
                "   *\n" +
                "   * @return The venue's latitude.\n" +
                "   */\n" +
                "  public Double getLatitude() {\n" +
                "    return latitude;\n" +
                "  }\n" +
                "  \n" +
                "  public void setLatitude(Double val) {\n" +
                "      this.latitude = val;\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * The venue's longitude.\n" +
                "   *\n" +
                "   * @return The venue's longitude.\n" +
                "   */\n" +
                "  public Double getLongitude() {\n" +
                "    return longitude;\n" +
                "  }\n" +
                "  \n" +
                "  public void setLongitude(Double val) {\n" +
                "      this.longitude = val;\n" +
                "  }\n" +
                "\n" +
                "  public void setFrom(Location location) {\n" +
                "\n" +
                "    if (location == null)\n" +
                "        return;\n" +
                "    \n" +
                "    this.latitude = location.getLatitude();\n" +
                "    this.longitude = location.getLongitude();\n" +
                "    this.street = location.getStreet();\n" +
                "    this.city = location.getCity();\n" +
                "    this.state = location.getState();\n" +
                "    this.zip = location.getZip();\n" +
                "    this.country = location.getCountry();\n" +
                "    \n" +
                "  }\n" +
                "\n" +
                "}\n";

        afterTree = getTreeFromDiff(afterFileSrc);
        beforeTree = getTreeFromDiff(beforeFileSrc);


        //Method that will find AST diffs.  It returns an Array of "Actions" which is a list of element Data objects.
        List<Action> actions = findASTDiffs(beforeTree, afterTree);


    }


    public static ITree getTreeFromDiff(String fileContents) {
        ITree src = null;
        try {
            src = new JdtTreeGenerator().generateFromString(fileContents).getRoot();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return src;
    }

    public static List<Action> findASTDiffs(ITree src, ITree dst) {
        List<Action> actions = null;
        try {
            Matcher m = Matchers.getInstance().getMatcher(src, dst); // retrieve the default matcher
            m.match();
            ActionGenerator g = new ActionGenerator(src, dst, m.getMappings());
            g.generate();
            actions = g.getActions(); // return the actions
        } catch (UnsupportedOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return actions;
    }


}