package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentNodeChildProvider_MembersInjector
    implements MembersInjector<EmploymentNodeChildProvider> {
  private final MembersInjector<UnemployedNode> unemployedNodeInjectorMembersInjector;

  private final MembersInjector<RetiredEmploymentNode> retiredEmploymentNodeInjectorMembersInjector;

  private final MembersInjector<PayeEmployedNode> payeEmployedNodeInjectorMembersInjector;

  private final MembersInjector<EmployedNode> employedNodeInjectorMembersInjector;

  private final MembersInjector<SelfEmployedNode> selfEmployedNodeInjectorMembersInjector;

  private final MembersInjector<EmploymentTypeNode> employmentTypeNodeInjectorMembersInjector;

  public EmploymentNodeChildProvider_MembersInjector(
      MembersInjector<UnemployedNode> unemployedNodeInjectorMembersInjector,
      MembersInjector<RetiredEmploymentNode> retiredEmploymentNodeInjectorMembersInjector,
      MembersInjector<PayeEmployedNode> payeEmployedNodeInjectorMembersInjector,
      MembersInjector<EmployedNode> employedNodeInjectorMembersInjector,
      MembersInjector<SelfEmployedNode> selfEmployedNodeInjectorMembersInjector,
      MembersInjector<EmploymentTypeNode> employmentTypeNodeInjectorMembersInjector) {
    assert unemployedNodeInjectorMembersInjector != null;
    this.unemployedNodeInjectorMembersInjector = unemployedNodeInjectorMembersInjector;
    assert retiredEmploymentNodeInjectorMembersInjector != null;
    this.retiredEmploymentNodeInjectorMembersInjector =
        retiredEmploymentNodeInjectorMembersInjector;
    assert payeEmployedNodeInjectorMembersInjector != null;
    this.payeEmployedNodeInjectorMembersInjector = payeEmployedNodeInjectorMembersInjector;
    assert employedNodeInjectorMembersInjector != null;
    this.employedNodeInjectorMembersInjector = employedNodeInjectorMembersInjector;
    assert selfEmployedNodeInjectorMembersInjector != null;
    this.selfEmployedNodeInjectorMembersInjector = selfEmployedNodeInjectorMembersInjector;
    assert employmentTypeNodeInjectorMembersInjector != null;
    this.employmentTypeNodeInjectorMembersInjector = employmentTypeNodeInjectorMembersInjector;
  }

  public static MembersInjector<EmploymentNodeChildProvider> create(
      MembersInjector<UnemployedNode> unemployedNodeInjectorMembersInjector,
      MembersInjector<RetiredEmploymentNode> retiredEmploymentNodeInjectorMembersInjector,
      MembersInjector<PayeEmployedNode> payeEmployedNodeInjectorMembersInjector,
      MembersInjector<EmployedNode> employedNodeInjectorMembersInjector,
      MembersInjector<SelfEmployedNode> selfEmployedNodeInjectorMembersInjector,
      MembersInjector<EmploymentTypeNode> employmentTypeNodeInjectorMembersInjector) {
    return new EmploymentNodeChildProvider_MembersInjector(
        unemployedNodeInjectorMembersInjector,
        retiredEmploymentNodeInjectorMembersInjector,
        payeEmployedNodeInjectorMembersInjector,
        employedNodeInjectorMembersInjector,
        selfEmployedNodeInjectorMembersInjector,
        employmentTypeNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(EmploymentNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.unemployedNodeInjector = unemployedNodeInjectorMembersInjector;
    instance.retiredEmploymentNodeInjector = retiredEmploymentNodeInjectorMembersInjector;
    instance.payeEmployedNodeInjector = payeEmployedNodeInjectorMembersInjector;
    instance.employedNodeInjector = employedNodeInjectorMembersInjector;
    instance.selfEmployedNodeInjector = selfEmployedNodeInjectorMembersInjector;
    instance.employmentTypeNodeInjector = employmentTypeNodeInjectorMembersInjector;
  }

  public static void injectUnemployedNodeInjector(
      EmploymentNodeChildProvider instance,
      MembersInjector<UnemployedNode> unemployedNodeInjector) {
    instance.unemployedNodeInjector = unemployedNodeInjector;
  }

  public static void injectRetiredEmploymentNodeInjector(
      EmploymentNodeChildProvider instance,
      MembersInjector<RetiredEmploymentNode> retiredEmploymentNodeInjector) {
    instance.retiredEmploymentNodeInjector = retiredEmploymentNodeInjector;
  }

  public static void injectPayeEmployedNodeInjector(
      EmploymentNodeChildProvider instance,
      MembersInjector<PayeEmployedNode> payeEmployedNodeInjector) {
    instance.payeEmployedNodeInjector = payeEmployedNodeInjector;
  }

  public static void injectEmployedNodeInjector(
      EmploymentNodeChildProvider instance, MembersInjector<EmployedNode> employedNodeInjector) {
    instance.employedNodeInjector = employedNodeInjector;
  }

  public static void injectSelfEmployedNodeInjector(
      EmploymentNodeChildProvider instance,
      MembersInjector<SelfEmployedNode> selfEmployedNodeInjector) {
    instance.selfEmployedNodeInjector = selfEmployedNodeInjector;
  }

  public static void injectEmploymentTypeNodeInjector(
      EmploymentNodeChildProvider instance,
      MembersInjector<EmploymentTypeNode> employmentTypeNodeInjector) {
    instance.employmentTypeNodeInjector = employmentTypeNodeInjector;
  }
}
