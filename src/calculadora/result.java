package calculadora;

import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;
import org.nfunk.jep.JEP;

public class result {
    private String function = "";
    DJep djep;
    Node func;
    JEP jep;
    public  result() {
        
    }
    
    public void setFunction(String function) {
        this.function = function;
    }
    public String getResult() {
        return this.function;
    }            
    public void replaceX(String function, String ing) {
        String value = "(" + ing + ")";
            function = function.replace("x",value);
        
        this.function = function;
    }
        public void finalres() {
        try {

            this.djep = new DJep();
            this.djep.addStandardFunctions();
            this.djep.addStandardConstants();
            this.djep.addComplex();
            this.djep.setAllowUndeclared(true);
            this.djep.setAllowAssignment(true);
            this.djep.setImplicitMul(true);
            this.djep.addStandardDiffRules();
            this.func = this.djep.parse(this.function);
            this.function = this.djep.toString(this.func);

        } catch (ParseException e) {
            this.function = "NaN";
            System.out.println("Error: " + e.getErrorInfo());
        }
        
    }
    /**
     * Realiza las operaciones.
     */
    public void multi(){
        jep = new JEP();
        this.jep.addStandardFunctions();
        this.jep.addStandardConstants();
        this.jep.parseExpression(this.function);
        this.function = String.format("%.2f", this.jep.getValue());
    }
}
