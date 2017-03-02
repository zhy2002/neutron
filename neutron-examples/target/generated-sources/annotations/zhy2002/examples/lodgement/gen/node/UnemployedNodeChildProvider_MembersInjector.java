package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UnemployedNodeChildProvider_MembersInjector
    implements MembersInjector<UnemployedNodeChildProvider> {
  private final MembersInjector<UnemployedOnBenefitFlagNode>
      unemployedOnBenefitFlagNodeInjectorMembersInjector;

  private final MembersInjector<StudentFlagNode> studentFlagNodeInjectorMembersInjector;

  private final MembersInjector<UnemployedSinceNode> unemployedSinceNodeInjectorMembersInjector;

  private final MembersInjector<StudentTypeNode> studentTypeNodeInjectorMembersInjector;

  private final MembersInjector<HouseDutiesFlagNode> houseDutiesFlagNodeInjectorMembersInjector;

  public UnemployedNodeChildProvider_MembersInjector(
      MembersInjector<UnemployedOnBenefitFlagNode>
          unemployedOnBenefitFlagNodeInjectorMembersInjector,
      MembersInjector<StudentFlagNode> studentFlagNodeInjectorMembersInjector,
      MembersInjector<UnemployedSinceNode> unemployedSinceNodeInjectorMembersInjector,
      MembersInjector<StudentTypeNode> studentTypeNodeInjectorMembersInjector,
      MembersInjector<HouseDutiesFlagNode> houseDutiesFlagNodeInjectorMembersInjector) {
    assert unemployedOnBenefitFlagNodeInjectorMembersInjector != null;
    this.unemployedOnBenefitFlagNodeInjectorMembersInjector =
        unemployedOnBenefitFlagNodeInjectorMembersInjector;
    assert studentFlagNodeInjectorMembersInjector != null;
    this.studentFlagNodeInjectorMembersInjector = studentFlagNodeInjectorMembersInjector;
    assert unemployedSinceNodeInjectorMembersInjector != null;
    this.unemployedSinceNodeInjectorMembersInjector = unemployedSinceNodeInjectorMembersInjector;
    assert studentTypeNodeInjectorMembersInjector != null;
    this.studentTypeNodeInjectorMembersInjector = studentTypeNodeInjectorMembersInjector;
    assert houseDutiesFlagNodeInjectorMembersInjector != null;
    this.houseDutiesFlagNodeInjectorMembersInjector = houseDutiesFlagNodeInjectorMembersInjector;
  }

  public static MembersInjector<UnemployedNodeChildProvider> create(
      MembersInjector<UnemployedOnBenefitFlagNode>
          unemployedOnBenefitFlagNodeInjectorMembersInjector,
      MembersInjector<StudentFlagNode> studentFlagNodeInjectorMembersInjector,
      MembersInjector<UnemployedSinceNode> unemployedSinceNodeInjectorMembersInjector,
      MembersInjector<StudentTypeNode> studentTypeNodeInjectorMembersInjector,
      MembersInjector<HouseDutiesFlagNode> houseDutiesFlagNodeInjectorMembersInjector) {
    return new UnemployedNodeChildProvider_MembersInjector(
        unemployedOnBenefitFlagNodeInjectorMembersInjector,
        studentFlagNodeInjectorMembersInjector,
        unemployedSinceNodeInjectorMembersInjector,
        studentTypeNodeInjectorMembersInjector,
        houseDutiesFlagNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(UnemployedNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.unemployedOnBenefitFlagNodeInjector =
        unemployedOnBenefitFlagNodeInjectorMembersInjector;
    instance.studentFlagNodeInjector = studentFlagNodeInjectorMembersInjector;
    instance.unemployedSinceNodeInjector = unemployedSinceNodeInjectorMembersInjector;
    instance.studentTypeNodeInjector = studentTypeNodeInjectorMembersInjector;
    instance.houseDutiesFlagNodeInjector = houseDutiesFlagNodeInjectorMembersInjector;
  }

  public static void injectUnemployedOnBenefitFlagNodeInjector(
      UnemployedNodeChildProvider instance,
      MembersInjector<UnemployedOnBenefitFlagNode> unemployedOnBenefitFlagNodeInjector) {
    instance.unemployedOnBenefitFlagNodeInjector = unemployedOnBenefitFlagNodeInjector;
  }

  public static void injectStudentFlagNodeInjector(
      UnemployedNodeChildProvider instance,
      MembersInjector<StudentFlagNode> studentFlagNodeInjector) {
    instance.studentFlagNodeInjector = studentFlagNodeInjector;
  }

  public static void injectUnemployedSinceNodeInjector(
      UnemployedNodeChildProvider instance,
      MembersInjector<UnemployedSinceNode> unemployedSinceNodeInjector) {
    instance.unemployedSinceNodeInjector = unemployedSinceNodeInjector;
  }

  public static void injectStudentTypeNodeInjector(
      UnemployedNodeChildProvider instance,
      MembersInjector<StudentTypeNode> studentTypeNodeInjector) {
    instance.studentTypeNodeInjector = studentTypeNodeInjector;
  }

  public static void injectHouseDutiesFlagNodeInjector(
      UnemployedNodeChildProvider instance,
      MembersInjector<HouseDutiesFlagNode> houseDutiesFlagNodeInjector) {
    instance.houseDutiesFlagNodeInjector = houseDutiesFlagNodeInjector;
  }
}
