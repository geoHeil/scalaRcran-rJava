package stats

import org.rosuda.JRI.Rengine

object JavaStuff {
  def main(args: Array[String]) = {

    val javaVector: String = "c(1,2,3,4,5)";

    val engine = new Rengine(Array[String] {
      "--no-save"
    }, false, null);

    // The vector that was created in JAVA context is stored in 'rVector' which is a variable in R context.
    engine.eval("rVector=" + javaVector);

    //Calculate MEAN of vector using R syntax.
    engine.eval("meanVal=mean(rVector)");

    //Retrieve MEAN value
    val mean = engine.eval("meanVal").asDouble();

    //Print output values
    System.out.println("Mean of given vector is=" + mean);
  }
}
