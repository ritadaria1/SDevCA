
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

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.users.User,models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userEmail: models.users.User, user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.84*/("""

"""),_display_(/*3.2*/main("My Profile",user)/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

"""),format.raw/*5.1*/("""<p class="lead">"""),_display_(/*5.18*/user/*5.22*/.getName),format.raw/*5.30*/("""</p>

"""),_display_(/*7.2*/if(flash.containsKey("success"))/*7.34*/ {_display_(Seq[Any](format.raw/*7.36*/("""
  """),format.raw/*8.3*/("""<div class="alert alert-success">
    """),_display_(/*9.6*/flash/*9.11*/.get("success")),format.raw/*9.26*/("""
  """),format.raw/*10.3*/("""</div>
""")))}),format.raw/*11.2*/("""

"""),format.raw/*13.1*/("""<table class="table table-bordered table-hover table-condensed">

  <thead>
    <tr>
      <th>Image</th>
      <th>Name</th>
      <th>Email</th>
    
    </tr>
  </thead>

  <tbody>
      <tr>
        """),_display_(/*26.10*/if(env.resource("public/images/employeeImages/" + user.getName + "thumb.jpg").isDefined)/*26.98*/{_display_(Seq[Any](format.raw/*26.99*/("""
          """),format.raw/*27.11*/("""<td><img src="/assets/images/employeeImages/"""),_display_(/*27.56*/(user.getName +"thumb.jpg")),format.raw/*27.83*/(""""/></td>
        """)))}/*28.10*/else/*28.14*/{_display_(Seq[Any](format.raw/*28.15*/("""
          """),format.raw/*29.11*/("""<td><img src="/assets/images/employeeImages/noImage.png"></td>
        """)))}),format.raw/*30.10*/("""
        
        """),format.raw/*32.9*/("""<td>"""),_display_(/*32.14*/user/*32.18*/.getName),format.raw/*32.26*/("""</td>
        <td>"""),_display_(/*33.14*/user/*33.18*/.getEmail),format.raw/*33.27*/("""</td>
        
        
      </tr>
    
  </tbody>

</table>


""")))}),format.raw/*43.2*/("""


"""))
      }
    }
  }

  def render(userEmail:models.users.User,user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(userEmail,user,env)

  def f:((models.users.User,models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (userEmail,user,env) => apply(userEmail,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 17 13:39:45 GMT 2019
                  SOURCE: /home/wdd/BASE_CODE/projectListDone/app/views/profile.scala.html
                  HASH: faab1fdf54940c2a7aa0497dbe0a7d8b0054f29c
                  MATRIX: 1000->1|1177->83|1205->86|1236->109|1275->111|1303->113|1346->130|1358->134|1386->142|1418->149|1458->181|1497->183|1526->186|1590->225|1603->230|1638->245|1668->248|1706->256|1735->258|1966->462|2063->550|2102->551|2141->562|2213->607|2261->634|2298->652|2311->656|2350->657|2389->668|2492->740|2537->758|2569->763|2582->767|2611->775|2657->794|2670->798|2700->807|2795->872
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|37->5|37->5|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|45->13|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|62->30|64->32|64->32|64->32|64->32|65->33|65->33|65->33|75->43
                  -- GENERATED --
              */
          