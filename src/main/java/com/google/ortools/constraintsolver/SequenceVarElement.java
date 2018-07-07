/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class SequenceVarElement extends AssignmentElement {
  private transient long swigCPtr;

  protected SequenceVarElement(long cPtr, boolean cMemoryOwn) {
    super(operations_research_constraint_solverJNI.SequenceVarElement_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SequenceVarElement obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        operations_research_constraint_solverJNI.delete_SequenceVarElement(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SequenceVarElement() {
    this(operations_research_constraint_solverJNI.new_SequenceVarElement__SWIG_0(), true);
  }

  public SequenceVarElement(SequenceVar var) {
    this(operations_research_constraint_solverJNI.new_SequenceVarElement__SWIG_1(SequenceVar.getCPtr(var), var), true);
  }

  public void Reset(SequenceVar var) {
    operations_research_constraint_solverJNI.SequenceVarElement_Reset(swigCPtr, this, SequenceVar.getCPtr(var), var);
  }

  public SequenceVarElement Clone() {
    long cPtr = operations_research_constraint_solverJNI.SequenceVarElement_Clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SequenceVarElement(cPtr, false);
  }

  public void Copy(SequenceVarElement element) {
    operations_research_constraint_solverJNI.SequenceVarElement_Copy(swigCPtr, this, SequenceVarElement.getCPtr(element), element);
  }

  public SequenceVar Var() {
    long cPtr = operations_research_constraint_solverJNI.SequenceVarElement_Var(swigCPtr, this);
    return (cPtr == 0) ? null : new SequenceVar(cPtr, false);
  }

  public void Store() {
    operations_research_constraint_solverJNI.SequenceVarElement_Store(swigCPtr, this);
  }

  public void Restore() {
    operations_research_constraint_solverJNI.SequenceVarElement_Restore(swigCPtr, this);
  }

  public void LoadFromProto(SWIGTYPE_p_operations_research__SequenceVarAssignment sequence_var_assignment_proto) {
    operations_research_constraint_solverJNI.SequenceVarElement_LoadFromProto(swigCPtr, this, SWIGTYPE_p_operations_research__SequenceVarAssignment.getCPtr(sequence_var_assignment_proto));
  }

  public void WriteToProto(SWIGTYPE_p_operations_research__SequenceVarAssignment sequence_var_assignment_proto) {
    operations_research_constraint_solverJNI.SequenceVarElement_WriteToProto(swigCPtr, this, SWIGTYPE_p_operations_research__SequenceVarAssignment.getCPtr(sequence_var_assignment_proto));
  }

  public int[] ForwardSequence() {
  return operations_research_constraint_solverJNI.SequenceVarElement_ForwardSequence(swigCPtr, this);
}

  public int[] BackwardSequence() {
  return operations_research_constraint_solverJNI.SequenceVarElement_BackwardSequence(swigCPtr, this);
}

  public int[] Unperformed() {
  return operations_research_constraint_solverJNI.SequenceVarElement_Unperformed(swigCPtr, this);
}

  public void SetSequence(int[] forward_sequence, int[] backward_sequence, int[] unperformed) {
    operations_research_constraint_solverJNI.SequenceVarElement_SetSequence(swigCPtr, this, forward_sequence, backward_sequence, unperformed);
  }

  public void SetForwardSequence(int[] forward_sequence) {
    operations_research_constraint_solverJNI.SequenceVarElement_SetForwardSequence(swigCPtr, this, forward_sequence);
  }

  public void SetBackwardSequence(int[] backward_sequence) {
    operations_research_constraint_solverJNI.SequenceVarElement_SetBackwardSequence(swigCPtr, this, backward_sequence);
  }

  public void SetUnperformed(int[] unperformed) {
    operations_research_constraint_solverJNI.SequenceVarElement_SetUnperformed(swigCPtr, this, unperformed);
  }

  public String toString() {
    return operations_research_constraint_solverJNI.SequenceVarElement_toString(swigCPtr, this);
  }

}