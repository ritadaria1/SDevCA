
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

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Employee],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employeeForm: Form[models.Employee],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.63*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Employee",user)/*4.27*/ {_display_(Seq[Any](format.raw/*4.29*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new employee</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addEmployeeSubmit(), 'class-> "form-horizontal",
         'role -> "form", 'method -> "POST", 'enctype -> "multipart/form-data")/*7.80*/ {_display_(Seq[Any](format.raw/*7.82*/("""
        """),_display_(/*8.10*/CSRF/*8.14*/.formField),format.raw/*8.24*/("""

        """),_display_(/*10.10*/inputText(employeeForm("name"), '_label -> "Name", 'class -> "form_control")),format.raw/*10.86*/("""
        """),_display_(/*11.10*/inputText(employeeForm("email"), '_label -> "E-mail", 'class -> "form_control")),format.raw/*11.89*/("""
        """),_display_(/*12.10*/inputText(employeeForm("password"), '_label -> "Password", 'class -> "form_control")),format.raw/*12.94*/("""

        """),format.raw/*14.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">

        """),_display_(/*17.10*/inputText(employeeForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*17.75*/("""

        """),format.raw/*19.9*/("""<div class="actions">
            <input type="submit" value="Add/Update Employee" class="btn btn-primary">
            <a href=""""),_display_(/*21.23*/routes/*21.29*/.HomeController.employee),format.raw/*21.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
        """)))}),format.raw/*25.10*/("""
""")))}))
      }
    }
  }

  def render(employeeForm:Form[models.Employee],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm,user)

  def f:((Form[models.Employee],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm,user) => apply(employeeForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 16 18:21:35 GMT 2019
                  SOURCE: /home/wdd/BASE_CODE/projectListDone/app/views/addEmployee.scala.html
                  HASH: 77442ab3461851f8ebc713d955f9939950e24eef
                  MATRIX: 987->1|1121->64|1166->62|1193->80|1220->82|1253->107|1292->109|1323->114|1392->158|1562->320|1601->322|1637->332|1649->336|1679->346|1717->357|1814->433|1851->443|1951->522|1988->532|2093->616|2130->626|2264->733|2350->798|2387->808|2544->938|2559->944|2604->968|2757->1090
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|39->7|39->7|40->8|40->8|40->8|42->10|42->10|43->11|43->11|44->12|44->12|46->14|49->17|49->17|51->19|53->21|53->21|53->21|57->25
                  -- GENERATED --
              */
          