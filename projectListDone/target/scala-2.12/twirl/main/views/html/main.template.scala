
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

                """),_display_(/*31.18*/if(user != null)/*31.34*/{_display_(Seq[Any](format.raw/*31.35*/("""
                """),format.raw/*32.17*/("""<li """),_display_(/*32.22*/if(title=="My Profile" )/*32.46*/{_display_(Seq[Any](format.raw/*32.47*/("""class="active"""")))}),format.raw/*32.62*/(""">
                    <a href=""""),_display_(/*33.31*/routes/*33.37*/.HomeController.profile()),format.raw/*33.62*/("""">My Profile</a>
                </li>
                """)))}),format.raw/*35.18*/("""

                """),_display_(/*37.18*/if((user != null) && ("admin".equals(user.getRole())))/*37.72*/{_display_(Seq[Any](format.raw/*37.73*/("""
                    """),format.raw/*38.21*/("""<li """),_display_(/*38.26*/if(title=="Employee" )/*38.48*/{_display_(Seq[Any](format.raw/*38.49*/("""class="active"""")))}),format.raw/*38.64*/(""">
                            <a href=""""),_display_(/*39.39*/routes/*39.45*/.HomeController.employee()),format.raw/*39.71*/("""">Admin</a>
                    </li>
                """)))}),format.raw/*41.18*/("""
                

                """),format.raw/*44.17*/("""<li """),_display_(/*44.22*/if(title=="Login")/*44.40*/{_display_(Seq[Any](format.raw/*44.41*/("""class="active"""")))}),format.raw/*44.56*/(""">
                    """),_display_(/*45.22*/if(user != null)/*45.38*/ {_display_(Seq[Any](format.raw/*45.40*/("""
                        """),format.raw/*46.25*/("""<a href=""""),_display_(/*46.35*/routes/*46.41*/.LoginController.logout()),format.raw/*46.66*/("""">Logout """),_display_(/*46.76*/user/*46.80*/.getName()),format.raw/*46.90*/("""</a>
                    """)))}/*47.23*/else/*47.28*/{_display_(Seq[Any](format.raw/*47.29*/("""
                        """),format.raw/*48.25*/("""<a href=""""),_display_(/*48.35*/routes/*48.41*/.LoginController.login()),format.raw/*48.65*/("""">Login</a>
                    """)))}),format.raw/*49.22*/("""

                """),format.raw/*51.17*/("""</li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*61.18*/content),format.raw/*61.25*/("""
            """),format.raw/*62.13*/("""</div>
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
    <script src=""""),_display_(/*76.19*/routes/*76.25*/.Assets.versioned("javascripts/main.js")),format.raw/*76.65*/(""""></script>
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
                  DATE: Sun Mar 17 13:39:45 GMT 2019
                  SOURCE: /home/wdd/BASE_CODE/projectListDone/app/views/main.scala.html
                  HASH: 711a51697e9eeae376cc62255e60802e43eb02f0
                  MATRIX: 970->1|1121->57|1149->59|1266->150|1280->156|1339->195|1419->248|1445->253|1657->438|1672->444|1734->485|1965->689|1980->695|2024->718|2148->815|2179->837|2218->838|2264->853|2323->885|2338->891|2382->914|2464->969|2489->985|2528->986|2573->1003|2605->1008|2638->1032|2677->1033|2723->1048|2782->1080|2797->1086|2843->1111|2930->1167|2976->1186|3039->1240|3078->1241|3127->1262|3159->1267|3190->1289|3229->1290|3275->1305|3342->1345|3357->1351|3404->1377|3490->1432|3553->1467|3585->1472|3612->1490|3651->1491|3697->1506|3747->1529|3772->1545|3812->1547|3865->1572|3902->1582|3917->1588|3963->1613|4000->1623|4013->1627|4044->1637|4089->1664|4102->1669|4141->1670|4194->1695|4231->1705|4246->1711|4291->1735|4355->1768|4401->1786|4564->1922|4592->1929|4633->1942|4938->2220|4953->2226|5014->2266
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|42->10|42->10|46->14|46->14|46->14|54->22|54->22|54->22|59->27|59->27|59->27|59->27|60->28|60->28|60->28|63->31|63->31|63->31|64->32|64->32|64->32|64->32|64->32|65->33|65->33|65->33|67->35|69->37|69->37|69->37|70->38|70->38|70->38|70->38|70->38|71->39|71->39|71->39|73->41|76->44|76->44|76->44|76->44|76->44|77->45|77->45|77->45|78->46|78->46|78->46|78->46|78->46|78->46|78->46|79->47|79->47|79->47|80->48|80->48|80->48|80->48|81->49|83->51|93->61|93->61|94->62|108->76|108->76|108->76
                  -- GENERATED --
              */
          