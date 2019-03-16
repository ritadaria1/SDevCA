
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

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("My Profile", user)/*2.26*/{_display_(Seq[Any](format.raw/*2.27*/("""
    """),format.raw/*3.5*/("""<div class="row">
        <div class="col-sm-3">
		
        </div>
        <div class="col-sm-9">
            <h3>Name: """),_display_(/*8.24*/user/*8.28*/.getName()),format.raw/*8.38*/("""</h3>
        </div>
    </div>
	<div class="row"> 
		<div class= "col-sm-4">
            <h3>Email: """),_display_(/*13.25*/user/*13.29*/.getEmail()),format.raw/*13.40*/("""</h3>
            
				
		</div>
	</div>
""")))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 16 18:21:35 GMT 2019
                  SOURCE: /home/wdd/BASE_CODE/projectListDone/app/views/profile.scala.html
                  HASH: d8f02416d48b7518f1100d571fb7d04c5d0dceda
                  MATRIX: 961->1|1081->26|1108->28|1140->52|1178->53|1209->58|1356->179|1368->183|1398->193|1527->295|1540->299|1572->310
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|40->8|40->8|40->8|45->13|45->13|45->13
                  -- GENERATED --
              */
          