package br.cin.ufpe.nesc2cpn.nescModule.instructions;

/**
 *
 * @author avld
 */
public class Incremental extends Instruction
{
    private String variableType;
    private String variableName;
    private boolean posfix;

    public Incremental()
    {
        // do nothing
    }

    public boolean isPosfix() {
        return posfix;
    }

    public void setPosfix(boolean posfix) {
        this.posfix = posfix;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public String getVariableType() {
        return variableType;
    }

    public void setVariableType(String variableType) {
        this.variableType = variableType;
    }

    
    @Override
    public String toString()
    {
        String txt = "";

        if( !posfix ) txt += "++";

        txt += getVariableName();
        
        if( posfix ) txt += "++";

        return txt;
    }
}
