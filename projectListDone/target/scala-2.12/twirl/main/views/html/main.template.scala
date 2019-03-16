
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User )(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>
        <link rel="icon" type="image/png" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("images/favicon.png")),format.raw/*8.95*/("""">
    <meta charset="utf-8">
    <title>Fishbone - """),_display_(/*10.24*/title),format.raw/*10.29*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*14.18*/routes/*14.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.65*/("""" rel="stylesheet" />
</head>

<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href=""""),_display_(/*22.48*/routes/*22.54*/.HomeController.index()),format.raw/*22.77*/("""">Fishbone</a>
            </div>

            <ul class="nav navbar-nav">

                <li """),_display_(/*27.22*/if(title=="Projects" )/*27.44*/{_display_(Seq[Any](format.raw/*27.45*/("""class="active"""")))}),format.raw/*27.60*/(""">
                    <a href=""""),_display_(/*28.31*/routes/*28.37*/.HomeController.index()),format.raw/*28.60*/("""">Projects</a>
                </li>

                <li """),_display_(/*31.22*/if(title=="Profile" )/*31.43*/{_display_(Seq[Any](format.raw/*31.44*/("""class="active"""")))}),format.raw/*31.59*/(""">
                    <a href=""""),_display_(/*32.31*/routes/*32.37*/.HomeController.profile()),format.raw/*32.62*/("""">My Profile</a>
                </li>

                """),_display_(/*35.18*/if((user != null) && ("admin".equals(user.getRole())))/*35.72*/{_display_(Seq[Any](format.raw/*35.73*/("""
                    """),format.raw/*36.21*/("""<li """),_display_(/*36.26*/if(title=="Employee" )/*36.48*/{_display_(Seq[Any](format.raw/*36.49*/("""class="active"""")))}),format.raw/*36.64*/(""">
                            <a href=""""),_display_(/*37.39*/routes/*37.45*/.HomeController.employee()),format.raw/*37.71*/("""">Admin</a>
                    </li>
                """)))}),format.raw/*39.18*/("""
                

                """),format.raw/*42.17*/("""<li """),_display_(/*42.22*/if(title=="Login")/*42.40*/{_display_(Seq[Any](format.raw/*42.41*/("""class="active"""")))}),format.raw/*42.56*/(""">
                    """),_display_(/*43.22*/if(user != null)/*43.38*/ {_display_(Seq[Any](format.raw/*43.40*/("""
                        """),format.raw/*44.25*/("""<a href=""""),_display_(/*44.35*/routes/*44.41*/.LoginController.logout()),format.raw/*44.66*/("""">Logout """),_display_(/*44.76*/user/*44.80*/.getName()),format.raw/*44.90*/("""</a>
                    """)))}/*45.23*/else/*45.28*/{_display_(Seq[Any](format.raw/*45.29*/("""
                        """),format.raw/*46.25*/("""<a href=""""),_display_(/*46.35*/routes/*46.41*/.LoginController.login()),format.raw/*46.65*/("""">Login</a>
                    """)))}),format.raw/*47.22*/("""

                """),format.raw/*49.17*/("""</li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*59.18*/content),format.raw/*59.25*/("""
            """),format.raw/*60.13*/("""</div>
        </row>
    </container>
<br>
    <container>
        <footer>
        <row>
            <div class="col-md-12">
                Copyright
                <strong>Fishbone</strong>
            </div>
        </row>
    </footer>
    </container>
    <script src=""""),_display_(/*74.19*/routes/*74.25*/.Assets.versioned("javascripts/main.js")),format.raw/*74.65*/(""""></script>
</body>

</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 16 19:33:38 GMT 2019
                  SOURCE: /home/wdd/BASE_CODE/projectListDone/app/views/main.scala.html
                  HASH: 76f11e8626ef7a7f5442f2635b710bcf3b7894cf
                  MATRIX: 970->1|1121->57|1149->59|1266->150|1280->156|1339->195|1419->248|1445->253|1657->438|1672->444|1734->485|1965->689|1980->695|2024->718|2148->815|2179->837|2218->838|2264->853|2323->885|2338->891|2382->914|2468->973|2498->994|2537->995|2583->1010|2642->1042|2657->1048|2703->1073|2787->1130|2850->1184|2889->1185|2938->1206|2970->1211|3001->1233|3040->1234|3086->1249|3153->1289|3168->1295|3215->1321|3301->1376|3364->1411|3396->1416|3423->1434|3462->1435|3508->1450|3558->1473|3583->1489|3623->1491|3676->1516|3713->1526|3728->1532|3774->1557|3811->1567|3824->1571|3855->1581|3900->1608|3913->1613|3952->1614|4005->1639|4042->1649|4057->1655|4102->1679|4166->1712|4212->1730|4375->1866|4403->1873|4444->1886|4749->2164|4764->2170|4825->2210
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|42->10|42->10|46->14|46->14|46->14|54->22|54->22|54->22|59->27|59->27|59->27|59->27|60->28|60->28|60->28|63->31|63->31|63->31|63->31|64->32|64->32|64->32|67->35|67->35|67->35|68->36|68->36|68->36|68->36|68->36|69->37|69->37|69->37|71->39|74->42|74->42|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|76->44|76->44|76->44|76->44|77->45|77->45|77->45|78->46|78->46|78->46|78->46|79->47|81->49|91->59|91->59|92->60|106->74|106->74|106->74
                  -- GENERATED --
              */
          