/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class DecisionBuilder extends BaseObject {
  private transient long swigCPtr;

  protected DecisionBuilder(long cPtr, boolean cMemoryOwn) {
    super(operations_research_constraint_solverJNI.DecisionBuilder_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DecisionBuilder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        operations_research_constraint_solverJNI.delete_DecisionBuilder(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    operations_research_constraint_solverJNI.DecisionBuilder_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    operations_research_constraint_solverJNI.DecisionBuilder_change_ownership(this, swigCPtr, true);
  }

  public DecisionBuilder() {
    this(operations_research_constraint_solverJNI.new_DecisionBuilder(), true);
    operations_research_constraint_solverJNI.DecisionBuilder_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public Decision nextWrap(Solver s) {
    long cPtr = operations_research_constraint_solverJNI.DecisionBuilder_nextWrap(swigCPtr, this, Solver.getCPtr(s), s);
    return (cPtr == 0) ? null : new Decision(cPtr, false);
  }

  public String toString() {
    return (getClass() == DecisionBuilder.class) ? operations_research_constraint_solverJNI.DecisionBuilder_toString(swigCPtr, this) : operations_research_constraint_solverJNI.DecisionBuilder_toStringSwigExplicitDecisionBuilder(swigCPtr, this);
  }

}