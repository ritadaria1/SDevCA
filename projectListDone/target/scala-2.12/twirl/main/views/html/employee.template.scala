
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

object employee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Employee],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employee: List[models.Employee], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.87*/("""

"""),_display_(/*3.2*/main("Employee",user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

"""),format.raw/*5.1*/("""<p class="lead">Employee List</p>

"""),_display_(/*7.2*/if(flash.containsKey("success"))/*7.34*/ {_display_(Seq[Any](format.raw/*7.36*/("""
  """),format.raw/*8.3*/("""<div class="alert alert-success">
    """),_display_(/*9.6*/flash/*9.11*/.get("success")),format.raw/*9.26*/("""
  """),format.raw/*10.3*/("""</div>
""")))}),format.raw/*11.2*/("""

"""),format.raw/*13.1*/("""<table class="table table-bordered table-hover table-condensed">

  <thead>
    <tr>
      <th>Image</th>
      <th>ID</th>
      <th>Name</th>
      <th>Email</th>
      <th>Update</th>
      <th>Delete</th>     
    </tr>
  </thead>

  <tbody>
    """),_display_(/*27.6*/for(e<-employee) yield /*27.22*/ {_display_(Seq[Any](format.raw/*27.24*/("""
      """),format.raw/*28.7*/("""<tr>
        """),_display_(/*29.10*/if(env.resource("public/images/employeeImages/" + e.getId + "thumb.jpg").isDefined)/*29.93*/{_display_(Seq[Any](format.raw/*29.94*/("""
          """),format.raw/*30.11*/("""<td><img src="/assets/images/employeeImages/"""),_display_(/*30.56*/(e.getId +"thumb.jpg")),format.raw/*30.78*/(""""/></td>
        """)))}/*31.10*/else/*31.14*/{_display_(Seq[Any](format.raw/*31.15*/("""
          """),format.raw/*32.11*/("""<td><img src="/assets/images/employeeImages/noImage.png"></td>
        """)))}),format.raw/*33.10*/("""
        """),format.raw/*34.9*/("""<td class="numeric">"""),_display_(/*34.30*/e/*34.31*/.getId),format.raw/*34.37*/("""</td>
        <td>"""),_display_(/*35.14*/e/*35.15*/.getName),format.raw/*35.23*/("""</td>
        <td>"""),_display_(/*36.14*/e/*36.15*/.getEmail),format.raw/*36.24*/("""</td>
        <td>
          <a href=""""),_display_(/*38.21*/routes/*38.27*/.HomeController.updateEmployee(e.getId)),format.raw/*38.66*/("""" class="button-xs btn-danger">
            <span class="glyphicon glyphicon-pencil"></span>
          </a>
        </td>  
        <td>
          <a href=""""),_display_(/*43.21*/routes/*43.27*/.HomeController.deleteEmployee(e.getId)),format.raw/*43.66*/("""" class="button-xs btn-danger"  onclick="return confirmDel()">
            <span class="glyphicon glyphicon-trash"></span>
          </a>
        </td>
      </tr>
    """)))}),format.raw/*48.6*/("""
  """),format.raw/*49.3*/("""</tbody>

</table>
<p>
  <a href=""""),_display_(/*53.13*/routes/*53.19*/.HomeController.addEmployee()),format.raw/*53.48*/("""">
    <button class="btn btn-primary">Add an Employee</button>
  </a>
</p>

""")))}))
      }
    }
  }

  def render(employee:List[models.Employee],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(employee,user,env)

  def f:((List[models.Employee],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (employee,user,env) => apply(employee,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 16 18:21:35 GMT 2019
                  SOURCE: /home/wdd/BASE_CODE/projectListDone/app/views/employee.scala.html
                  HASH: 011f86d3a0ea3c5148b54b94c8dddaffb17be1a0
                  MATRIX: 1005->1|1185->86|1213->89|1242->110|1281->112|1309->114|1370->150|1410->182|1449->184|1478->187|1542->226|1555->231|1590->246|1620->249|1658->257|1687->259|1964->510|1996->526|2036->528|2070->535|2111->549|2203->632|2242->633|2281->644|2353->689|2396->711|2433->729|2446->733|2485->734|2524->745|2627->817|2663->826|2711->847|2721->848|2748->854|2794->873|2804->874|2833->882|2879->901|2889->902|2919->911|2985->950|3000->956|3060->995|3244->1152|3259->1158|3319->1197|3518->1366|3548->1369|3610->1404|3625->1410|3675->1439
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|45->13|59->27|59->27|59->27|60->28|61->29|61->29|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|65->33|66->34|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|70->38|70->38|70->38|75->43|75->43|75->43|80->48|81->49|85->53|85->53|85->53
                  -- GENERATED --
              */
          