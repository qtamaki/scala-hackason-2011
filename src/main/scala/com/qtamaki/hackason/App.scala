package com.qtamaki.hackason
import processing.core.PApplet
import javax.swing.JFrame

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Start!!" )
//    val a = new Ro3D() //new RoRect()
//    a.init()
//    val f = new TestFrame(a);
//    f.pack();
//    f.setLocation(100, 100);
//    f.setVisible(true);
    startA(new MyPApplet)
    startA(new RoRect)
    startA(new RandEllipse)
    startA(new Ro3D)
    startA(new Mouse1)
    println( "End" )
  }

  def startA(a: PApplet){
    a.init()
    startF(new TestFrame(a))
    
  }
  
  def startF(f: JFrame){
    f.pack
    f.setLocation(100, 100)
    f.setVisible(true)
  }

}
