package calculadora;

import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

public class Derivadas {
    private String funcion = "";
    DJep djep;
    Node nodeFunction;
    Node nodeDerivative;
    public Derivadas() {
        
    }
    public void setFuncionDerivar(String funcion) {
        this.funcion = funcion;
    }

    public String getFuncionDerivar() {
        return this.funcion;
    }

    public void derivar() {
        try {

            this.djep = new DJep();
            // Añade las funciones: cos(x), sin(x).
            this.djep.addStandardFunctions();
            // Añade variables constantes.
            this.djep.addStandardConstants();
            // Añade numeros complejos.
            this.djep.addComplex();
            // Permite variables no declaradas.
            this.djep.setAllowUndeclared(true);
            // Permitir asignaciones.
            this.djep.setAllowAssignment(true);
            // Añade reglas de prioridas.
            this.djep.setImplicitMul(true);
            this.djep.addStandardDiffRules();
            // Pone el node en "nodeFuncion".
            this.nodeFunction = this.djep.parse(this.funcion);
            // Deriva la funcion.
            Node diff = this.djep.differentiate(nodeFunction, "x");
            // Simplifica X.
            this.nodeDerivative = this.djep.simplify(diff);
            // Convierte el double en un String.
            this.funcion = this.djep.toString(this.nodeDerivative);

        } catch (ParseException e) {
            this.funcion = "NaN";
            System.out.println("Error: " + e.getErrorInfo());
        }

    }

}
