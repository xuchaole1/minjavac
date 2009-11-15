package analysis.tac.instructions;

public class Action extends Instruction {
  private Opcode opcode;

  public Action(Opcode op) {
    opcode = op;
  }

  public Opcode getOpcode() {
    return opcode;
  }

  @Override
  public String toString() {
    return opcode.toString();
  }
}