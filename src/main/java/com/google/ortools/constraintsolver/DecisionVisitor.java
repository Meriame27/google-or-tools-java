/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class DecisionVisitor extends BaseObject {
  private transient long swigCPtr;

  protected DecisionVisitor(long cPtr, boolean cMemoryOwn) {
    super(operations_research_constraint_solverJNI.DecisionVisitor_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DecisionVisitor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        operations_research_constraint_solverJNI.delete_DecisionVisitor(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DecisionVisitor() {
    this(operations_research_constraint_solverJNI.new_DecisionVisitor(), true);
  }

  public void VisitSetVariableValue(IntVar var, long value) {
    operations_research_constraint_solverJNI.DecisionVisitor_VisitSetVariableValue(swigCPtr, this, IntVar.getCPtr(var), var, value);
  }

  public void VisitSplitVariableDomain(IntVar var, long value, boolean start_with_lower_half) {
    operations_research_constraint_solverJNI.DecisionVisitor_VisitSplitVariableDomain(swigCPtr, this, IntVar.getCPtr(var), var, value, start_with_lower_half);
  }

  public void VisitScheduleOrPostpone(IntervalVar var, long est) {
    operations_research_constraint_solverJNI.DecisionVisitor_VisitScheduleOrPostpone(swigCPtr, this, IntervalVar.getCPtr(var), var, est);
  }

  public void VisitScheduleOrExpedite(IntervalVar var, long est) {
    operations_research_constraint_solverJNI.DecisionVisitor_VisitScheduleOrExpedite(swigCPtr, this, IntervalVar.getCPtr(var), var, est);
  }

  public void VisitRankFirstInterval(SequenceVar sequence, int index) {
    operations_research_constraint_solverJNI.DecisionVisitor_VisitRankFirstInterval(swigCPtr, this, SequenceVar.getCPtr(sequence), sequence, index);
  }

  public void VisitRankLastInterval(SequenceVar sequence, int index) {
    operations_research_constraint_solverJNI.DecisionVisitor_VisitRankLastInterval(swigCPtr, this, SequenceVar.getCPtr(sequence), sequence, index);
  }

  public void VisitUnknownDecision() {
    operations_research_constraint_solverJNI.DecisionVisitor_VisitUnknownDecision(swigCPtr, this);
  }

}