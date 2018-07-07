// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/constraint_solver/routing_enums.proto

package com.google.ortools.constraintsolver;

/**
 * <pre>
 * First solution strategies, used as starting point of local search.
 * </pre>
 *
 * Protobuf type {@code operations_research.FirstSolutionStrategy}
 */
public  final class FirstSolutionStrategy extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:operations_research.FirstSolutionStrategy)
    FirstSolutionStrategyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FirstSolutionStrategy.newBuilder() to construct.
  private FirstSolutionStrategy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FirstSolutionStrategy() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FirstSolutionStrategy(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ortools.constraintsolver.RoutingEnums.internal_static_operations_research_FirstSolutionStrategy_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ortools.constraintsolver.RoutingEnums.internal_static_operations_research_FirstSolutionStrategy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ortools.constraintsolver.FirstSolutionStrategy.class, com.google.ortools.constraintsolver.FirstSolutionStrategy.Builder.class);
  }

  /**
   * Protobuf enum {@code operations_research.FirstSolutionStrategy.Value}
   */
  public enum Value
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Lets the solver detect which strategy to use according to the model being
     * solved.
     * </pre>
     *
     * <code>AUTOMATIC = 0;</code>
     */
    AUTOMATIC(0),
    /**
     * <pre>
     * --- Path addition heuristics ---
     * Starting from a route "start" node, connect it to the node which produces
     * the cheapest route segment, then extend the route by iterating on the
     * last node added to the route.
     * </pre>
     *
     * <code>PATH_CHEAPEST_ARC = 3;</code>
     */
    PATH_CHEAPEST_ARC(3),
    /**
     * <pre>
     * Same as PATH_CHEAPEST_ARC, but arcs are evaluated with a comparison-based
     * selector which will favor the most constrained arc first. To assign a
     * selector to the routing model, see
     * RoutingModel::ArcIsMoreConstrainedThanArc() in routing.h for details.
     * </pre>
     *
     * <code>PATH_MOST_CONSTRAINED_ARC = 4;</code>
     */
    PATH_MOST_CONSTRAINED_ARC(4),
    /**
     * <pre>
     * Same as PATH_CHEAPEST_ARC, except that arc costs are evaluated using the
     * function passed to RoutingModel::SetFirstSolutionEvaluator()
     * (cf. routing.h).
     * </pre>
     *
     * <code>EVALUATOR_STRATEGY = 5;</code>
     */
    EVALUATOR_STRATEGY(5),
    /**
     * <pre>
     * Savings algorithm (Clarke &amp; Wright).
     * Reference: Clarke, G. &amp; Wright, J.W.:
     * "Scheduling of Vehicles from a Central Depot to a Number of Delivery
     * Points", Operations Research, Vol. 12, 1964, pp. 568-581
     * </pre>
     *
     * <code>SAVINGS = 10;</code>
     */
    SAVINGS(10),
    /**
     * <pre>
     * Sweep algorithm (Wren &amp; Holliday).
     * Reference: Anthony Wren &amp; Alan Holliday: Computer Scheduling of Vehicles
     * from One or More Depots to a Number of Delivery Points Operational
     * Research Quarterly (1970-1977),
     * Vol. 23, No. 3 (Sep., 1972), pp. 333-344
     * </pre>
     *
     * <code>SWEEP = 11;</code>
     */
    SWEEP(11),
    /**
     * <pre>
     * Christofides algorithm (actually a variant of the Christofides algorithm
     * using a maximal matching instead of a maximum matching, which does
     * not guarantee the 3/2 factor of the approximation on a metric travelling
     * salesman). Works on generic vehicle routing models by extending a route
     * until no nodes can be inserted on it.
     * Reference: Nicos Christofides, Worst-case analysis of a new heuristic for
     * the travelling salesman problem, Report 388, Graduate School of
     * Industrial Administration, CMU, 1976.
     * </pre>
     *
     * <code>CHRISTOFIDES = 13;</code>
     */
    CHRISTOFIDES(13),
    /**
     * <pre>
     * --- Path insertion heuristics ---
     * Make all nodes inactive. Only finds a solution if nodes are optional (are
     * element of a disjunction constraint with a finite penalty cost).
     * </pre>
     *
     * <code>ALL_UNPERFORMED = 6;</code>
     */
    ALL_UNPERFORMED(6),
    /**
     * <pre>
     * Iteratively build a solution by inserting the cheapest node at its
     * cheapest position; the cost of insertion is based on the global cost
     * function of the routing model. As of 2/2012, only works on models with
     * optional nodes (with finite penalty costs).
     * </pre>
     *
     * <code>BEST_INSERTION = 7;</code>
     */
    BEST_INSERTION(7),
    /**
     * <pre>
     * Iteratively build a solution by inserting the cheapest node at its
     * cheapest position; the cost of insertion is based on the the arc cost
     * function. Is faster than BEST_INSERTION.
     * </pre>
     *
     * <code>PARALLEL_CHEAPEST_INSERTION = 8;</code>
     */
    PARALLEL_CHEAPEST_INSERTION(8),
    /**
     * <pre>
     * Iteratively build a solution by inserting each node at its cheapest
     * position; the cost of insertion is based on the the arc cost function.
     * Differs from PARALLEL_CHEAPEST_INSERTION by the node selected for
     * insertion; here nodes are considered in their order of creation. Is
     * faster than PARALLEL_CHEAPEST_INSERTION.
     * </pre>
     *
     * <code>LOCAL_CHEAPEST_INSERTION = 9;</code>
     */
    LOCAL_CHEAPEST_INSERTION(9),
    /**
     * <pre>
     * --- Variable-based heuristics ---
     * Iteratively connect two nodes which produce the cheapest route segment.
     * </pre>
     *
     * <code>GLOBAL_CHEAPEST_ARC = 1;</code>
     */
    GLOBAL_CHEAPEST_ARC(1),
    /**
     * <pre>
     * Select the first node with an unbound successor and connect it to the
     * node which produces the cheapest route segment.
     * </pre>
     *
     * <code>LOCAL_CHEAPEST_ARC = 2;</code>
     */
    LOCAL_CHEAPEST_ARC(2),
    /**
     * <pre>
     * Select the first node with an unbound successor and connect it to the
     * first available node.
     * This is equivalent to the CHOOSE_FIRST_UNBOUND strategy combined with
     * ASSIGN_MIN_VALUE (cf. constraint_solver.h).
     * </pre>
     *
     * <code>FIRST_UNBOUND_MIN_VALUE = 12;</code>
     */
    FIRST_UNBOUND_MIN_VALUE(12),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Lets the solver detect which strategy to use according to the model being
     * solved.
     * </pre>
     *
     * <code>AUTOMATIC = 0;</code>
     */
    public static final int AUTOMATIC_VALUE = 0;
    /**
     * <pre>
     * --- Path addition heuristics ---
     * Starting from a route "start" node, connect it to the node which produces
     * the cheapest route segment, then extend the route by iterating on the
     * last node added to the route.
     * </pre>
     *
     * <code>PATH_CHEAPEST_ARC = 3;</code>
     */
    public static final int PATH_CHEAPEST_ARC_VALUE = 3;
    /**
     * <pre>
     * Same as PATH_CHEAPEST_ARC, but arcs are evaluated with a comparison-based
     * selector which will favor the most constrained arc first. To assign a
     * selector to the routing model, see
     * RoutingModel::ArcIsMoreConstrainedThanArc() in routing.h for details.
     * </pre>
     *
     * <code>PATH_MOST_CONSTRAINED_ARC = 4;</code>
     */
    public static final int PATH_MOST_CONSTRAINED_ARC_VALUE = 4;
    /**
     * <pre>
     * Same as PATH_CHEAPEST_ARC, except that arc costs are evaluated using the
     * function passed to RoutingModel::SetFirstSolutionEvaluator()
     * (cf. routing.h).
     * </pre>
     *
     * <code>EVALUATOR_STRATEGY = 5;</code>
     */
    public static final int EVALUATOR_STRATEGY_VALUE = 5;
    /**
     * <pre>
     * Savings algorithm (Clarke &amp; Wright).
     * Reference: Clarke, G. &amp; Wright, J.W.:
     * "Scheduling of Vehicles from a Central Depot to a Number of Delivery
     * Points", Operations Research, Vol. 12, 1964, pp. 568-581
     * </pre>
     *
     * <code>SAVINGS = 10;</code>
     */
    public static final int SAVINGS_VALUE = 10;
    /**
     * <pre>
     * Sweep algorithm (Wren &amp; Holliday).
     * Reference: Anthony Wren &amp; Alan Holliday: Computer Scheduling of Vehicles
     * from One or More Depots to a Number of Delivery Points Operational
     * Research Quarterly (1970-1977),
     * Vol. 23, No. 3 (Sep., 1972), pp. 333-344
     * </pre>
     *
     * <code>SWEEP = 11;</code>
     */
    public static final int SWEEP_VALUE = 11;
    /**
     * <pre>
     * Christofides algorithm (actually a variant of the Christofides algorithm
     * using a maximal matching instead of a maximum matching, which does
     * not guarantee the 3/2 factor of the approximation on a metric travelling
     * salesman). Works on generic vehicle routing models by extending a route
     * until no nodes can be inserted on it.
     * Reference: Nicos Christofides, Worst-case analysis of a new heuristic for
     * the travelling salesman problem, Report 388, Graduate School of
     * Industrial Administration, CMU, 1976.
     * </pre>
     *
     * <code>CHRISTOFIDES = 13;</code>
     */
    public static final int CHRISTOFIDES_VALUE = 13;
    /**
     * <pre>
     * --- Path insertion heuristics ---
     * Make all nodes inactive. Only finds a solution if nodes are optional (are
     * element of a disjunction constraint with a finite penalty cost).
     * </pre>
     *
     * <code>ALL_UNPERFORMED = 6;</code>
     */
    public static final int ALL_UNPERFORMED_VALUE = 6;
    /**
     * <pre>
     * Iteratively build a solution by inserting the cheapest node at its
     * cheapest position; the cost of insertion is based on the global cost
     * function of the routing model. As of 2/2012, only works on models with
     * optional nodes (with finite penalty costs).
     * </pre>
     *
     * <code>BEST_INSERTION = 7;</code>
     */
    public static final int BEST_INSERTION_VALUE = 7;
    /**
     * <pre>
     * Iteratively build a solution by inserting the cheapest node at its
     * cheapest position; the cost of insertion is based on the the arc cost
     * function. Is faster than BEST_INSERTION.
     * </pre>
     *
     * <code>PARALLEL_CHEAPEST_INSERTION = 8;</code>
     */
    public static final int PARALLEL_CHEAPEST_INSERTION_VALUE = 8;
    /**
     * <pre>
     * Iteratively build a solution by inserting each node at its cheapest
     * position; the cost of insertion is based on the the arc cost function.
     * Differs from PARALLEL_CHEAPEST_INSERTION by the node selected for
     * insertion; here nodes are considered in their order of creation. Is
     * faster than PARALLEL_CHEAPEST_INSERTION.
     * </pre>
     *
     * <code>LOCAL_CHEAPEST_INSERTION = 9;</code>
     */
    public static final int LOCAL_CHEAPEST_INSERTION_VALUE = 9;
    /**
     * <pre>
     * --- Variable-based heuristics ---
     * Iteratively connect two nodes which produce the cheapest route segment.
     * </pre>
     *
     * <code>GLOBAL_CHEAPEST_ARC = 1;</code>
     */
    public static final int GLOBAL_CHEAPEST_ARC_VALUE = 1;
    /**
     * <pre>
     * Select the first node with an unbound successor and connect it to the
     * node which produces the cheapest route segment.
     * </pre>
     *
     * <code>LOCAL_CHEAPEST_ARC = 2;</code>
     */
    public static final int LOCAL_CHEAPEST_ARC_VALUE = 2;
    /**
     * <pre>
     * Select the first node with an unbound successor and connect it to the
     * first available node.
     * This is equivalent to the CHOOSE_FIRST_UNBOUND strategy combined with
     * ASSIGN_MIN_VALUE (cf. constraint_solver.h).
     * </pre>
     *
     * <code>FIRST_UNBOUND_MIN_VALUE = 12;</code>
     */
    public static final int FIRST_UNBOUND_MIN_VALUE_VALUE = 12;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Value valueOf(int value) {
      return forNumber(value);
    }

    public static Value forNumber(int value) {
      switch (value) {
        case 0: return AUTOMATIC;
        case 3: return PATH_CHEAPEST_ARC;
        case 4: return PATH_MOST_CONSTRAINED_ARC;
        case 5: return EVALUATOR_STRATEGY;
        case 10: return SAVINGS;
        case 11: return SWEEP;
        case 13: return CHRISTOFIDES;
        case 6: return ALL_UNPERFORMED;
        case 7: return BEST_INSERTION;
        case 8: return PARALLEL_CHEAPEST_INSERTION;
        case 9: return LOCAL_CHEAPEST_INSERTION;
        case 1: return GLOBAL_CHEAPEST_ARC;
        case 2: return LOCAL_CHEAPEST_ARC;
        case 12: return FIRST_UNBOUND_MIN_VALUE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Value>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Value> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Value>() {
            public Value findValueByNumber(int number) {
              return Value.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ortools.constraintsolver.FirstSolutionStrategy.getDescriptor().getEnumTypes().get(0);
    }

    private static final Value[] VALUES = values();

    public static Value valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Value(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:operations_research.FirstSolutionStrategy.Value)
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ortools.constraintsolver.FirstSolutionStrategy)) {
      return super.equals(obj);
    }
    com.google.ortools.constraintsolver.FirstSolutionStrategy other = (com.google.ortools.constraintsolver.FirstSolutionStrategy) obj;

    boolean result = true;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ortools.constraintsolver.FirstSolutionStrategy parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.constraintsolver.FirstSolutionStrategy parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.constraintsolver.FirstSolutionStrategy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.constraintsolver.FirstSolutionStrategy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.constraintsolver.FirstSolutionStrategy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.constraintsolver.FirstSolutionStrategy parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.constraintsolver.FirstSolutionStrategy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ortools.constraintsolver.FirstSolutionStrategy parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ortools.constraintsolver.FirstSolutionStrategy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ortools.constraintsolver.FirstSolutionStrategy parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ortools.constraintsolver.FirstSolutionStrategy parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ortools.constraintsolver.FirstSolutionStrategy parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ortools.constraintsolver.FirstSolutionStrategy prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * First solution strategies, used as starting point of local search.
   * </pre>
   *
   * Protobuf type {@code operations_research.FirstSolutionStrategy}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:operations_research.FirstSolutionStrategy)
      com.google.ortools.constraintsolver.FirstSolutionStrategyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ortools.constraintsolver.RoutingEnums.internal_static_operations_research_FirstSolutionStrategy_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ortools.constraintsolver.RoutingEnums.internal_static_operations_research_FirstSolutionStrategy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ortools.constraintsolver.FirstSolutionStrategy.class, com.google.ortools.constraintsolver.FirstSolutionStrategy.Builder.class);
    }

    // Construct using com.google.ortools.constraintsolver.FirstSolutionStrategy.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ortools.constraintsolver.RoutingEnums.internal_static_operations_research_FirstSolutionStrategy_descriptor;
    }

    public com.google.ortools.constraintsolver.FirstSolutionStrategy getDefaultInstanceForType() {
      return com.google.ortools.constraintsolver.FirstSolutionStrategy.getDefaultInstance();
    }

    public com.google.ortools.constraintsolver.FirstSolutionStrategy build() {
      com.google.ortools.constraintsolver.FirstSolutionStrategy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.ortools.constraintsolver.FirstSolutionStrategy buildPartial() {
      com.google.ortools.constraintsolver.FirstSolutionStrategy result = new com.google.ortools.constraintsolver.FirstSolutionStrategy(this);
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ortools.constraintsolver.FirstSolutionStrategy) {
        return mergeFrom((com.google.ortools.constraintsolver.FirstSolutionStrategy)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ortools.constraintsolver.FirstSolutionStrategy other) {
      if (other == com.google.ortools.constraintsolver.FirstSolutionStrategy.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ortools.constraintsolver.FirstSolutionStrategy parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ortools.constraintsolver.FirstSolutionStrategy) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:operations_research.FirstSolutionStrategy)
  }

  // @@protoc_insertion_point(class_scope:operations_research.FirstSolutionStrategy)
  private static final com.google.ortools.constraintsolver.FirstSolutionStrategy DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ortools.constraintsolver.FirstSolutionStrategy();
  }

  public static com.google.ortools.constraintsolver.FirstSolutionStrategy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FirstSolutionStrategy>
      PARSER = new com.google.protobuf.AbstractParser<FirstSolutionStrategy>() {
    public FirstSolutionStrategy parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FirstSolutionStrategy(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FirstSolutionStrategy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FirstSolutionStrategy> getParserForType() {
    return PARSER;
  }

  public com.google.ortools.constraintsolver.FirstSolutionStrategy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
